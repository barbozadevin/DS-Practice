class Node {
    public int data;
    public Node left;
    public Node right;
    public Node parent;

    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
        this.parent = null;
    }
}

class BST {
    public Node root;

    public BST(){
        this.root = null;
    }

    public Node minimum(Node x){
        while(x.left != null)
        x = x.left;
        return x;
    }
    public void insert(Node n){
        Node y = null;
        Node temp = this.root;
        while(temp != null){
            y = temp;
            if(n.data < temp.data)
            temp = temp.left;
            else
            temp = temp.right;
        }
        n.parent = y;

        if(y==null){
            this.root = n;
        }
        else if(n.data < y.data){
            y.left = n;
        }
        else
        y.right = n;
    }

    public void transplant(Node u,Node v){
        if(u.parent == null)
        this.root = v;
        else if (u==u.parent.left)
        u.parent.left = v;
        else 
        u.parent.right = v;

        if(v!=null)
        v.parent = u.parent;
    }

    public void delete(Node z){
        if(z.left == null){
            transplant(z, z.right);
        }
        else if(z.right == null){
            transplant(z, z.left);
        }
        else{
            Node y = minimum(z.right);
            if(y.parent !=z){
                transplant(y,y.right);
                y.right = z.right;
                y.right.parent = y;
            }
            transplant(z, y);
            y.left = z.left;
            y.left.parent = y;
        }
    }

    public void inorder(Node n) {
        if(n != null) {
          inorder(n.left);
          System.out.println(n.data);
          inorder(n.right);
        }
      }

      public static void main(String[] args) {
        BST t = new BST();

        Node a, b, c, d, e, f, g, h, i, j, k, l, m;
        a = new Node(10);
        b = new Node(20);
        c = new Node(30);
        d = new Node(100);
        e = new Node(90);
        f = new Node(40);
        g = new Node(50);
        h = new Node(60);
        i = new Node(70);
        j = new Node(80);
        k = new Node(150);
        l = new Node(110);
        m = new Node(120);
    
        t.insert(a);
        t.insert(b);
        t.insert(c);
        t.insert(d);
        t.insert(e);
        t.insert(f);
        t.insert(g);
        t.insert(h);
        t.insert(i);
        t.insert(j);
        t.insert(k);
        t.insert(l);
        t.insert(m);
    
        t.delete(a);
        t.delete(m);
    
        t.inorder(t.root);
      }
    

}
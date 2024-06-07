        package list.operacoesBasicas;

        import java.util.ArrayList;
        import java.util.List;

        public class CarrinhoDeCompras {

            private List<Item> itens;


            public CarrinhoDeCompras() {
                this.itens = new ArrayList<>();
            }

            public void adicionarItem(String nome, double preco, int quantidade){
                itens.add(new Item(nome,preco,quantidade));
            }

            public void removerItem(String nome){

                List<Item> itensToRemove = new ArrayList<>();
                    for(Item i : itens){
                        if (i.getNome().equalsIgnoreCase(nome)){
                            itensToRemove.add(i);
                        }
                }
                    itens.removeAll(itensToRemove);
            }

            public double calcularValorTotal(){
                double total = 0;
                for (Item i : itens) {
                    total+=i.getPreco();
                }
                     return total;
            }

            public void exibirItens(){
                System.out.println(itens);
            }

            public List<Item> getItens() {
                return itens;
            }

            public static void main(String[] args) {
                CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
                carrinhoDeCompras.adicionarItem("Item 1",10.0,1);
                carrinhoDeCompras.adicionarItem("Item 2",10.0,1);
                carrinhoDeCompras.adicionarItem("Item 3",10.0,1);

                System.out.println("o valor e de: "+carrinhoDeCompras.calcularValorTotal());

                carrinhoDeCompras.removerItem("Item 2");

                System.out.println("o valor e de: "+carrinhoDeCompras.calcularValorTotal());

                carrinhoDeCompras.exibirItens();
            }
        }

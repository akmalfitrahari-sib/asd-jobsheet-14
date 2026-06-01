public class BinaryTreeArray03 {
    Mahasiswa03[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray03() {
        this.dataMahasiswa = new Mahasiswa03[10];
    }

    void populateData (Mahasiswa03 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if(idxStart <= idxLast) {
            if(dataMahasiswa[idxStart] != null) {
                traverseInOrder(2*idxStart+1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2*idxStart+2);
            }
            
        }
    }

    void add(Mahasiswa03 data) {
        if (idxLast + 1 >= dataMahasiswa.length) {
                System.out.println("Array penuh");
                return;
            }
            idxLast++;
            dataMahasiswa[idxLast] = data;
        }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {

            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi();
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }
}


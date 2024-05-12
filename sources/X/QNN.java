package X;

/* loaded from: classes12.dex */
public final class QNN implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ java.util.Map LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ OCR LJLJJI;
    public final /* synthetic */ QNO LJLJJL;

    public final void LIZ() {
        String str = new String(OIP.LIZ.LIZ.LJIIZILJ.post(this.LJLIL, this.LJLILLLLZI, this.LJLJI.getBytes()), PVC.LIZ);
        QNO qno = this.LJLJJL;
        OCR ocr = this.LJLJJI;
        qno.getClass();
        QNO.LJ(ocr, str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public QNN(QNO qno, String str, java.util.Map map, String str2, OCR ocr) {
        this.LJLJJL = qno;
        this.LJLIL = str;
        this.LJLILLLLZI = map;
        this.LJLJI = str2;
        this.LJLJJI = ocr;
    }
}

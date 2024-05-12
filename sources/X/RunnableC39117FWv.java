package X;

/* renamed from: X.FWv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC39117FWv implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            InterfaceC39118FWw LJI = QRM.LJI();
            QRC qrc = (QRC) LJI;
            qrc.LJ(this.LJLILLLLZI, this.LJLIL);
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC39117FWv(String str, int i, String str2) {
        this.LJLIL = str;
        this.LJLILLLLZI = i;
    }
}

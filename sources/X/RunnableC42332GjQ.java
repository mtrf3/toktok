package X;

/* renamed from: X.GjQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC42332GjQ implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    public RunnableC42332GjQ(String str, String str2) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            String str = this.LJLIL;
            if (str != null) {
                C42331GjP.LIZ.LIZ(str);
            }
            String str2 = this.LJLILLLLZI;
            if (str2 != null) {
                C42331GjP.LIZ.LIZ(str2);
            }
        } finally {
            if (LIZ) {
            }
        }
    }
}

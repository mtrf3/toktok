package X;

/* renamed from: X.Ed9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class RunnableC36847Ed9 extends AbstractC37055EgV implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            try {
                java.net.URL LIZIZ = AbstractC37055EgV.LIZIZ();
                if (C36849EdB.LIZJ == null) {
                    C36849EdB.LIZJ = new P9P();
                }
                C36849EdB.LIZJ.LIZIZ(LIZIZ.toString(), LIZ(), new C36619EYt(this));
            } catch (Exception e) {
                AbstractC37055EgV.LIZJ(e.getMessage());
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC36847Ed9(C37060Ega c37060Ega) {
        super(c37060Ega);
    }
}

package X;

/* loaded from: classes8.dex */
public final class HHI {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(String str, String str2) {
        try {
            C39579Fg7.LJIL(str);
            C39579Fg7.LJIL(str2);
        } catch (Exception e) {
            StringBuilder LIZLLL = C06540Nm.LIZLLL("Delete BGV failed, videoPath: ", str, " audioPath: ", str2, " error: ");
            LIZLLL.append(e.getMessage());
            C170666ms.LIZIZ(X1D.LIZIZ(LIZLLL));
        }
    }
}

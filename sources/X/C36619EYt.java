package X;

import org.json.JSONException;

/* renamed from: X.EYt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36619EYt implements InterfaceC36617EYr {
    public final /* synthetic */ RunnableC36847Ed9 LIZ;

    public C36619EYt(RunnableC36847Ed9 runnableC36847Ed9) {
        this.LIZ = runnableC36847Ed9;
    }

    public final void LIZ(String str) {
        try {
            this.LIZ.getClass();
            this.LIZ.LJ(AbstractC37055EgV.LIZLLL(str));
        } catch (JSONException e) {
            RunnableC36847Ed9 runnableC36847Ed9 = this.LIZ;
            StringBuilder LIZIZ = C25620zW.LIZIZ("source:  ", str, "  case : ");
            LIZIZ.append(e.getMessage());
            String LIZIZ2 = X1D.LIZIZ(LIZIZ);
            runnableC36847Ed9.getClass();
            AbstractC37055EgV.LIZJ(LIZIZ2);
        }
    }
}

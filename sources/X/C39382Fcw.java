package X;

import Y.ARunnableS25S0200000_6;
import android.content.Context;
import java.util.concurrent.Semaphore;
import org.json.JSONObject;

/* renamed from: X.Fcw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39382Fcw {
    public static final Semaphore LIZ = new Semaphore(1);

    /* JADX WARN: Removed duplicated region for block: B:38:0x0108 A[Catch: Exception -> 0x012a, TryCatch #0 {Exception -> 0x012a, blocks: (B:28:0x00db, B:30:0x00e5, B:32:0x00ec, B:36:0x0100, B:38:0x0108, B:40:0x010d), top: B:27:0x00db }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010d A[Catch: Exception -> 0x012a, TryCatch #0 {Exception -> 0x012a, blocks: (B:28:0x00db, B:30:0x00e5, B:32:0x00ec, B:36:0x0100, B:38:0x0108, B:40:0x010d), top: B:27:0x00db }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C39384Fcy LIZIZ(android.content.Context r8) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39382Fcw.LIZIZ(android.content.Context):X.Fcy");
    }

    public static C39384Fcy LIZ(Context context, JSONObject jSONObject) {
        InterfaceC38761FJd interfaceC38761FJd;
        try {
            C39384Fcy LIZIZ = C39384Fcy.LIZIZ(0, C73340SqO.LJJIJIIJIL(jSONObject, "data", ""));
            if (LIZIZ != null) {
                C39383Fcx.LIZIZ = LIZIZ;
                ARunnableS25S0200000_6 aRunnableS25S0200000_6 = new ARunnableS25S0200000_6(LIZIZ, context, 60);
                C38759FJb c38759FJb = C78609UtB.LJLJI;
                if (c38759FJb != null && (interfaceC38761FJd = c38759FJb.LIZJ) != null) {
                    interfaceC38761FJd.execute(aRunnableS25S0200000_6);
                }
                C38766FJi.LIZ.submit(aRunnableS25S0200000_6);
            }
            return LIZIZ;
        } catch (Exception e) {
            StringBuilder LIZIZ2 = C59895Nf1.LIZIZ(e, "Server:");
            LIZIZ2.append(e.getMessage());
            return C39384Fcy.LIZ(X1D.LIZIZ(LIZIZ2));
        }
    }
}

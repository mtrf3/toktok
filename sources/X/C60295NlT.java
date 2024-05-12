package X;

import android.app.Activity;
import kotlin.jvm.internal.o;

/* renamed from: X.NlT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60295NlT extends C59551NYt {
    public final /* synthetic */ C60292NlQ LJLIL;

    public C60295NlT(C60292NlQ c60292NlQ) {
        this.LJLIL = c60292NlQ;
    }

    @Override // X.C59551NYt, X.InterfaceC60180Njc
    public final boolean LJIIL(Activity activity) {
        o.LJIIJ(activity, "activity");
        try {
            if (o.LJ(this.LJLIL.LJIL().LJJLIIIJILLIZJL.getValue(), Boolean.FALSE)) {
                return true;
            }
        } catch (Exception e) {
            C60292NlQ c60292NlQ = this.LJLIL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(" on uri ");
            LIZ.append(this.LJLIL.LLIIII);
            String extraMsg = X1D.LIZIZ(LIZ);
            c60292NlQ.getClass();
            o.LJIIJ(extraMsg, "extraMsg");
            C39973FmT.LIZJ(c60292NlQ, e, extraMsg);
        }
        C60498Nok LIZ2 = C60297NlV.LIZLLL.LIZ();
        if (LIZ2 != null && !LIZ2.LIZIZ.isEmpty()) {
            LIZ2.LIZIZ(LIZ2.LJ.remove(LIZ2.LIZIZ.pop()));
            return true;
        }
        return false;
    }
}

package X;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.CuD */
/* loaded from: classes6.dex */
public abstract class AbstractC32809CuD {
    public final String LIZ = "GiftSender";
    public UVV LIZIZ;
    public C77311UVv LIZJ;
    public C77291UVb LIZLLL;
    public UVR LJ;
    public UVO LJFF;

    public final void LIZIZ(C32816CuK task) {
        o.LJIIIZ(task, "task");
        String str = this.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sendGift(");
        LIZ.append(task);
        LIZ.append(')');
        C0NB.LJIIIZ(str, X1D.LIZIZ(LIZ));
        UVV uvv = this.LIZIZ;
        if (uvv != null) {
            XKX.LIZLLL(uvv.LIZIZ, null, null, new UVI(uvv, task, null), 3);
        } else {
            o.LJIJI("preSendChecker");
            throw null;
        }
    }

    public static /* synthetic */ XLM LIZJ(UVW uvw, C32804Cu8 c32804Cu8) {
        return uvw.LIZ(c32804Cu8, null, null, null, null, null);
    }

    public final XLM LIZ(C32804Cu8 c32804Cu8, InterfaceC77299UVj interfaceC77299UVj, InterfaceC77301UVl interfaceC77301UVl, InterfaceC77300UVk interfaceC77300UVk, InterfaceC77303UVn interfaceC77303UVn, UVU uvu) {
        boolean z;
        boolean z2;
        boolean z3;
        WeakReference weakReference;
        WeakReference weakReference2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        WeakReference weakReference5;
        String str = this.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sendGift(");
        LIZ.append(c32804Cu8);
        LIZ.append(") customPreSendInterceptor(");
        if (interfaceC77299UVj != null) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        LIZ.append(") customPreRequestInterceptor(");
        if (interfaceC77300UVk != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        LIZ.append(z2);
        LIZ.append(") customResultInterceptor(");
        if (uvu != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        LIZ.append(z3);
        LIZ.append(") ");
        C0NB.LJIIIZ(str, X1D.LIZIZ(LIZ));
        if (interfaceC77299UVj != null) {
            weakReference = new WeakReference(interfaceC77299UVj);
        } else {
            weakReference = null;
        }
        if (interfaceC77301UVl != null) {
            weakReference2 = new WeakReference(interfaceC77301UVl);
        } else {
            weakReference2 = null;
        }
        if (interfaceC77300UVk != null) {
            weakReference3 = new WeakReference(interfaceC77300UVk);
        } else {
            weakReference3 = null;
        }
        if (interfaceC77303UVn != null) {
            weakReference4 = new WeakReference(interfaceC77303UVn);
        } else {
            weakReference4 = null;
        }
        if (uvu != null) {
            weakReference5 = new WeakReference(uvu);
        } else {
            weakReference5 = null;
        }
        UVP uvp = new UVP(c32804Cu8, weakReference, weakReference2, weakReference3, weakReference4, weakReference5);
        UVV uvv = this.LIZIZ;
        if (uvv != null) {
            XKX.LIZLLL(uvv.LIZIZ, null, null, new UVI(uvv, new C32816CuK(uvp), null), 3);
            return uvp.LJII;
        }
        o.LJIJI("preSendChecker");
        throw null;
    }
}

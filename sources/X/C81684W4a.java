package X;

import android.graphics.drawable.Animatable;

/* renamed from: X.W4a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81684W4a implements W4Z<InterfaceC81599W0t> {
    public final /* synthetic */ C81928WDk LIZ;
    public final /* synthetic */ W4Z<InterfaceC81599W0t> LIZIZ;

    @Override // X.W4Z
    public final void LIZJ(String str) {
        this.LIZ.LIZJ(str);
        W4Z<InterfaceC81599W0t> w4z = this.LIZIZ;
        if (w4z != null) {
            w4z.LIZJ(str);
        }
    }

    public C81684W4a(W4Z w4z, C81928WDk c81928WDk) {
        this.LIZ = c81928WDk;
        this.LIZIZ = w4z;
    }

    @Override // X.W4Z
    public final void LIZIZ(String str, Throwable th) {
        this.LIZ.getClass();
        W4Z<InterfaceC81599W0t> w4z = this.LIZIZ;
        if (w4z != null) {
            w4z.LIZIZ(str, th);
        }
    }

    @Override // X.W4Z
    public final void LIZLLL(Object obj, String str) {
        this.LIZ.getClass();
        W4Z<InterfaceC81599W0t> w4z = this.LIZIZ;
        if (w4z != null) {
            w4z.LIZLLL(obj, str);
        }
    }

    @Override // X.W4Z
    public final void LJ(String str, Throwable th) {
        this.LIZ.LJ(str, th);
        W4Z<InterfaceC81599W0t> w4z = this.LIZIZ;
        if (w4z != null) {
            w4z.LJ(str, th);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onFrescoLoadImgFailure, id: ");
        LIZ.append(str);
        LIZ.append(", throwable: ");
        LIZ.append(th);
        C34B.LJI("MessageFrescoHelper", X1D.LIZIZ(LIZ));
    }

    @Override // X.W4Z
    public final void LJI(Object obj, String str) {
        this.LIZ.LJI(obj, str);
        W4Z<InterfaceC81599W0t> w4z = this.LIZIZ;
        if (w4z != null) {
            w4z.LJI(obj, str);
        }
    }

    @Override // X.W4Z
    public final void LJFF(String str, InterfaceC81599W0t interfaceC81599W0t, Animatable animatable) {
        InterfaceC81599W0t interfaceC81599W0t2 = interfaceC81599W0t;
        this.LIZ.LJFF(str, interfaceC81599W0t2, animatable);
        W4Z<InterfaceC81599W0t> w4z = this.LIZIZ;
        if (w4z != null) {
            w4z.LJFF(str, interfaceC81599W0t2, animatable);
        }
    }
}

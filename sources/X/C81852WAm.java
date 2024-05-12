package X;

import android.graphics.drawable.Animatable;

/* renamed from: X.WAm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81852WAm implements InterfaceC81853WAn {
    public final /* synthetic */ InterfaceC81853WAn LIZ;
    public final /* synthetic */ C81928WDk LIZIZ;

    @Override // X.InterfaceC81853WAn
    public final boolean LIZLLL() {
        InterfaceC81853WAn interfaceC81853WAn = this.LIZ;
        if (interfaceC81853WAn != null) {
            return interfaceC81853WAn.LIZLLL();
        }
        return false;
    }

    @Override // X.InterfaceC81853WAn
    public final void LIZJ(String str) {
        InterfaceC81853WAn interfaceC81853WAn = this.LIZ;
        if (interfaceC81853WAn != null) {
            interfaceC81853WAn.LIZJ(str);
        }
        this.LIZIZ.LJI(null, str);
    }

    public C81852WAm(InterfaceC81853WAn interfaceC81853WAn, C81928WDk c81928WDk) {
        this.LIZ = interfaceC81853WAn;
        this.LIZIZ = c81928WDk;
    }

    @Override // X.InterfaceC81853WAn
    public final void LIZIZ(String str, Throwable th) {
        InterfaceC81853WAn interfaceC81853WAn = this.LIZ;
        if (interfaceC81853WAn != null) {
            interfaceC81853WAn.LIZIZ(str, th);
        }
        this.LIZIZ.LJ(str, th);
    }

    @Override // X.InterfaceC81853WAn
    public final void LIZ(String str, InterfaceC81599W0t interfaceC81599W0t, Animatable animatable) {
        InterfaceC81853WAn interfaceC81853WAn = this.LIZ;
        if (interfaceC81853WAn != null) {
            interfaceC81853WAn.LIZ(str, interfaceC81599W0t, animatable);
        }
        this.LIZIZ.LJFF(str, interfaceC81599W0t, animatable);
    }
}

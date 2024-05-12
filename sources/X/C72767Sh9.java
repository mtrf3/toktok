package X;

import android.graphics.drawable.Animatable;

/* renamed from: X.Sh9, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72767Sh9 extends W4V {
    public long LIZIZ = -1;
    public final InterfaceC72768ShA LIZJ;

    public C72767Sh9(C72766Sh8 c72766Sh8) {
        this.LIZJ = c72766Sh8;
    }

    @Override // X.W4V, X.W4Z
    public final void LJI(Object obj, String str) {
        this.LIZIZ = System.currentTimeMillis();
    }

    @Override // X.W4V, X.W4Z
    public final void LJFF(String str, Object obj, Animatable animatable) {
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC72768ShA interfaceC72768ShA = this.LIZJ;
        if (interfaceC72768ShA != null) {
            C72766Sh8 c72766Sh8 = (C72766Sh8) interfaceC72768ShA;
            c72766Sh8.LJZ = currentTimeMillis - this.LIZIZ;
            c72766Sh8.invalidateSelf();
        }
    }
}

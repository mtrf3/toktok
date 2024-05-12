package X;

import kotlin.jvm.internal.o;

/* renamed from: X.IcX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47001IcX implements InterfaceC47408Ij6 {
    public final /* synthetic */ C47002IcY LIZ;

    public C47001IcX(C47002IcY c47002IcY) {
        this.LIZ = c47002IcY;
    }

    @Override // X.InterfaceC47408Ij6
    public final void LIZ(boolean z, boolean z2) {
        IX7 LIZIZ;
        IX7 LIZIZ2;
        float f = -1.0f;
        IX7 ix7 = null;
        if (z) {
            C47002IcY c47002IcY = this.LIZ;
            c47002IcY.LJII = true;
            if (!c47002IcY.LIZLLL || !IXN.LIZJ.getAutoAudioFocus() || c47002IcY.LIZJ || !c47002IcY.LJ || c47002IcY.LIZ <= 0.0f) {
                return;
            }
            IXC ixc = c47002IcY.LJIIJJI;
            if (ixc != null && (LIZIZ2 = ixc.LIZIZ()) != null) {
                float f2 = c47002IcY.LIZ;
                LIZIZ2.LJIIJJI(f2, f2);
            }
            c47002IcY.LIZIZ = -1.0f;
            return;
        }
        C47002IcY c47002IcY2 = this.LIZ;
        c47002IcY2.LJII = false;
        if (!c47002IcY2.LIZLLL || !IXN.LIZJ.getAutoAudioFocus() || c47002IcY2.LIZJ || !c47002IcY2.LJ || c47002IcY2.LIZIZ >= 0.0f) {
            return;
        }
        IXC ixc2 = c47002IcY2.LJIIJJI;
        if (ixc2 != null && (LIZIZ = ixc2.LIZIZ()) != null) {
            IZL izl = LIZIZ.LJFF.LIZIZ;
            if (izl != null) {
                f = izl.LJLZ;
            }
            c47002IcY2.LIZ = f;
        }
        c47002IcY2.LIZ = f;
        if (f <= 0.0f) {
            return;
        }
        if (z2) {
            Object value = IZ8.LJJJ.getValue();
            o.LJIIIIZZ(value, "<get-doNotDownVolumeOnAu…usLossBySelfCompete>(...)");
            if (((Boolean) value).booleanValue()) {
                return;
            }
        }
        IXC ixc3 = c47002IcY2.LJIIJJI;
        if (ixc3 != null) {
            ix7 = ixc3.LIZIZ();
        }
        float f3 = c47002IcY2.LJFF;
        if (f3 < 0.0f || ix7 == null) {
            return;
        }
        float f4 = c47002IcY2.LIZ * f3;
        c47002IcY2.LIZIZ = f4;
        ix7.LJIIJJI(f4, f4);
    }
}

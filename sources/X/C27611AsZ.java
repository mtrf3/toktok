package X;

import Y.ACallableS32S1100000_4;

/* renamed from: X.AsZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27611AsZ implements InterfaceC46826IZi {
    public final /* synthetic */ IQ5 LIZ;

    @Override // X.InterfaceC46826IZi
    public final void LIZ(int i, String str, String str2) {
    }

    @Override // X.InterfaceC46826IZi
    public final void LIZIZ(int i, int i2, String str) {
    }

    @Override // X.InterfaceC46826IZi
    public final void LJ(String str, String str2, Object obj) {
    }

    @Override // X.InterfaceC46826IZi
    public final void LJFF(int i, String str, String str2) {
    }

    public C27611AsZ(IQ5 iq5) {
        this.LIZ = iq5;
    }

    public final int LJI(String str, int i, String str2) {
        String str3;
        if (this.LIZ.LJII && ((str2 == null || str2.length() == 0) && ((str3 = this.LIZ.LJIIIIZZ) == null || str3.length() == 0))) {
            return -3;
        }
        IQ5 iq5 = this.LIZ;
        iq5.LJII = true;
        iq5.LJIIIIZZ = str2;
        C10K.LIZIZ(new ACallableS32S1100000_4(iq5, str2, 2), C10K.LJIIIIZZ, null);
        return 0;
    }

    @Override // X.InterfaceC46826IZi
    public final int LIZJ(String str, int i, int i2, int i3, int i4, String str2, boolean z, boolean z2, long j, long j2, long j3) {
        return LJI(str, i4, str2);
    }

    @Override // X.InterfaceC46826IZi
    public final void LIZLLL(String str, int i, int i2, int i3, int i4, String str2, boolean z, boolean z2, long j, long j2, long j3) {
        LJI(str, i4, str2);
    }
}

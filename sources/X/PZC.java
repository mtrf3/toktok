package X;

import com.bytedance.retrofit2.RequestBuilder;

/* loaded from: classes12.dex */
public final class PZC extends AbstractC64937Pe9<PVP> {
    public final C64606PXe LIZ;

    public PZC(C64606PXe c64606PXe) {
        this.LIZ = c64606PXe;
    }

    @Override // X.AbstractC64937Pe9
    public final void LIZ(RequestBuilder requestBuilder, PVP pvp) {
        PVP pvp2 = pvp;
        if (pvp2 == null) {
            return;
        }
        C64606PXe c64606PXe = this.LIZ;
        C64552PVc c64552PVc = requestBuilder.LJIJI;
        c64552PVc.getClass();
        c64552PVc.LIZ(C64553PVd.LIZ(c64606PXe, pvp2));
        requestBuilder.LJIJJLI = true;
    }
}

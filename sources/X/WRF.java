package X;

import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class WRF implements InterfaceC82284WRc {
    public final WRG LIZ;

    @Override // X.InterfaceC82284WRc
    public boolean LIZ() {
        WRG wrg = this.LIZ;
        if (o.LJ(wrg.LIZ, "ttnowfilter")) {
            return wrg.LIZIZ.getBoolean("disable_filter", false);
        }
        if (wrg.LIZIZ.contains("disable_filter")) {
            return wrg.LIZIZ.getBoolean("disable_filter", false);
        }
        boolean disableFilter = C60903NvH.LJIIJJI().LJJIL().getDisableFilter(false);
        wrg.LIZIZ.storeBoolean("disable_filter", disableFilter);
        return disableFilter;
    }

    public WRF(WRG wrg) {
        this.LIZ = wrg;
    }

    @Override // X.InterfaceC82284WRc
    public final int LIZIZ(int i) {
        throw new IllegalAccessException("Please use getDefaultFilterResId(cameraFacing: Int): String?");
    }

    @Override // X.InterfaceC82284WRc
    public void LIZLLL(boolean z) {
        this.LIZ.LIZIZ.storeBoolean("disable_filter", z);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String LJFF(int r13) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WRF.LJFF(int):java.lang.String");
    }

    @Override // X.InterfaceC82284WRc
    public final void LJ(int i, int i2) {
        throw new IllegalAccessException("Please use saveDefaultFilterResId(cameraFacing: Int, filterId: String)");
    }

    public void LJI(int i, String filterId) {
        String str;
        o.LJIIIZ(filterId, "filterId");
        WRG wrg = this.LIZ;
        wrg.getClass();
        if (i != 0) {
            if (i == 1) {
                str = "CameraFilter_Selected_Front_Filter";
            } else {
                throw new IllegalArgumentException("cameraPosition must be CAMERA_FACING_BACK or CAMERA_FACING_FRONT");
            }
        } else {
            str = "CameraFilter_Selected_Back_Filter";
        }
        wrg.LIZIZ.storeString(str, filterId);
    }
}

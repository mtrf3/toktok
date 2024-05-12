package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WI2 {
    public static final boolean LIZ = C149055t7.LIZ();

    public static final int LIZIZ(int i) {
        return i == 0 ? R.raw.icon_camera_flash_slash_fill : R.raw.icon_camera_flash_fill;
    }

    public static final int LIZ() {
        if (C53233Kur.LIZ()) {
            return R.raw.icon_camera_person_double_star_fill;
        }
        if (LIZ) {
            return R.raw.icon_camera_beauty_fill;
        }
        return R.raw.icon_camera_beauty_magic;
    }

    public static final int LIZJ(EnumC82528WaC speedType) {
        o.LJIIIZ(speedType, "speedType");
        int i = W1N.LIZ[speedType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            if (LIZ) {
                                return R.raw.icon_camera_meter_1_fill;
                            }
                        } else {
                            if (LIZ) {
                                return R.raw.icon_camera_meter_3_fill;
                            }
                            return R.raw.icon_camera_meter_3;
                        }
                    } else {
                        if (LIZ) {
                            return R.raw.icon_camera_meter_2_fill;
                        }
                        return R.raw.icon_camera_meter_2;
                    }
                } else if (LIZ) {
                    return R.raw.icon_camera_meter_1_fill;
                }
                return R.raw.icon_camera_meter_1;
            }
            if (LIZ) {
                return R.raw.icon_camera_meter_0_5_fill;
            }
            return R.raw.icon_camera_meter_0_5;
        }
        if (LIZ) {
            return R.raw.icon_camera_meter_0_3_fill;
        }
        return R.raw.icon_camera_meter_0_3;
    }
}

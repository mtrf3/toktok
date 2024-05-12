package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;

/* renamed from: X.IuZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48119IuZ {
    public C48119IuZ(C64606PXe c64606PXe) {
        if (c64606PXe != null) {
            for (int i = 0; i < c64606PXe.LIZ.length / 2; i++) {
                if ("x-rate-limit-limit".equals(c64606PXe.LJ(i))) {
                    CastIntegerProtector.valueOf(c64606PXe.LJIIJ(i)).intValue();
                } else if ("x-rate-limit-remaining".equals(c64606PXe.LJ(i))) {
                    CastIntegerProtector.valueOf(c64606PXe.LJIIJ(i)).intValue();
                } else if ("x-rate-limit-reset".equals(c64606PXe.LJ(i))) {
                    CastLongProtector.valueOf(c64606PXe.LJIIJ(i)).longValue();
                }
            }
            return;
        }
        throw new IllegalArgumentException("headers must not be null");
    }
}

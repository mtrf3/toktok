package com.ss.android.experiment;

import X.C52255Kf5;
import X.ORZ;
import com.ss.android.ugc.aweme.launcher.service.experiment.IImageHeaderConfig;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes10.dex */
public final class ImageHeaderConfigImpl implements IImageHeaderConfig {
    @Override // com.ss.android.ugc.aweme.launcher.service.experiment.IImageHeaderConfig
    public final Set<String> LJIIIIZZ() {
        List<String> list;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        TTImageHeaderModel LIZ = C52255Kf5.LIZ();
        if (LIZ != null && (list = LIZ.pathList) != null) {
            linkedHashSet.addAll(list);
        }
        return ORZ.LLIZLLLIL(linkedHashSet);
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.experiment.IImageHeaderConfig
    public final String LIZ() {
        TTImageHeaderModel LIZ = C52255Kf5.LIZ();
        if (LIZ != null) {
            return LIZ.native_static_format;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.experiment.IImageHeaderConfig
    public final String LIZIZ() {
        TTImageHeaderModel LIZ = C52255Kf5.LIZ();
        if (LIZ != null) {
            return LIZ.lynx_anim_format;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.experiment.IImageHeaderConfig
    public final String LIZJ() {
        TTImageHeaderModel LIZ = C52255Kf5.LIZ();
        if (LIZ != null) {
            return LIZ.lynx_static_format;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.experiment.IImageHeaderConfig
    public final long LIZLLL() {
        Long l;
        TTImageHeaderModel LIZ = C52255Kf5.LIZ();
        if (LIZ != null && (l = LIZ.batteryCheckTimeGap) != null) {
            return l.longValue();
        }
        return 60000L;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.experiment.IImageHeaderConfig
    public final String LJ() {
        TTImageHeaderModel LIZ = C52255Kf5.LIZ();
        if (LIZ != null) {
            return LIZ.h5_static_format;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.experiment.IImageHeaderConfig
    public final String LJFF() {
        TTImageHeaderModel LIZ = C52255Kf5.LIZ();
        if (LIZ != null) {
            return LIZ.native_anim_format;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.experiment.IImageHeaderConfig
    public final long LJI() {
        Long l;
        TTImageHeaderModel LIZ = C52255Kf5.LIZ();
        if (LIZ != null && (l = LIZ.networkQualityCheckTimeGap) != null) {
            return l.longValue();
        }
        return 30000L;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.experiment.IImageHeaderConfig
    public final String LJII() {
        TTImageHeaderModel LIZ = C52255Kf5.LIZ();
        if (LIZ != null) {
            return LIZ.h5_anim_format;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.experiment.IImageHeaderConfig
    public final long LJIIIZ() {
        Long l;
        TTImageHeaderModel LIZ = C52255Kf5.LIZ();
        if (LIZ != null && (l = LIZ.memoryCheckTimeGap) != null) {
            return l.longValue();
        }
        return 5000L;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.experiment.IImageHeaderConfig
    public final boolean isEnable() {
        Boolean bool;
        TTImageHeaderModel LIZ = C52255Kf5.LIZ();
        if (LIZ != null && (bool = LIZ.enable) != null) {
            return bool.booleanValue();
        }
        return false;
    }
}

package com.bytedance.realx.video;

import X.V0N;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes33.dex */
public enum FilterType {
    Origin(9),
    Bilinear(10),
    Bicubic(11),
    BOX(12);

    public final int value;

    public int toInt() {
        return this.value;
    }

    public static FilterType fromValue(int i) {
        switch (i) {
            case 10:
                return Bilinear;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return Bicubic;
            case 12:
                return BOX;
            default:
                return Origin;
        }
    }

    public static FilterType valueOf(String str) {
        return (FilterType) V0N.LJJJ(FilterType.class, str);
    }

    FilterType(int i) {
        this.value = i;
    }
}

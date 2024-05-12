package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: X.Ivg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48188Ivg implements InterfaceC79472VGy {
    public volatile EnumC48190Ivi LIZ = EnumC48190Ivi.UNKNOWN;

    @Override // X.InterfaceC79472VGy
    public final String key() {
        return "network_type";
    }

    @Override // X.InterfaceC79472VGy
    public final String LIZ(String str) {
        C10K.LIZJ(new Q5C(3, this));
        switch (C48191Ivj.LIZ[this.LIZ.ordinal()]) {
            case 1:
                return LiveGiftNewGifterBadgeSetting.DEFAULT;
            case 2:
            case 3:
                return "2g";
            case 4:
            case 5:
            case 6:
                return "3g";
            case 7:
                return "4g";
            case 8:
                return "5g";
            case 9:
            case 10:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return "wifi";
            default:
                return "unknown";
        }
    }
}

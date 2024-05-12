package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: X.G0f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40817G0f {
    public static G14 LIZ(EnumC40761FzB enumC40761FzB) {
        if (enumC40761FzB != null) {
            switch (C40758Fz8.LIZ[enumC40761FzB.ordinal()]) {
                case 1:
                    return new C40823G0l();
                case 2:
                    return new C40820G0i();
                case 3:
                    return new C40822G0k();
                case 4:
                    return new C40821G0j();
                case 5:
                    return new C40824G0m();
                case 6:
                    return new C40832G0u();
                case 7:
                    return new C40828G0q();
                case 8:
                    return new C40830G0s();
                case 9:
                    return new C40818G0g();
                case 10:
                    return new C40819G0h();
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    return new C40815G0d();
                case 12:
                    return new C40812G0a();
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    return new G0W();
                case 14:
                    return new C40831G0t();
                case 15:
                    return new C40829G0r();
                case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                    return new C40813G0b();
                case 17:
                    return new C40814G0c();
                case 18:
                    return new C40826G0o();
            }
        }
        return null;
    }
}

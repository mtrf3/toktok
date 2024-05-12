package X;

import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import com.ss.android.ugc.aweme.publish.model.UploadVideoConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H75 {
    public final List<String> LIZ = new ArrayList();

    public final String LIZLLL() {
        if (((ArrayList) this.LIZ).isEmpty()) {
            return "";
        }
        Iterator<String> it = this.LIZ.iterator();
        if (it.hasNext()) {
            String next = it.next();
            while (it.hasNext()) {
                next = C00F.LIZIZ(next, '&', it.next());
            }
            String str = next;
            FP1.LJ("UploaderServerParam: ", str);
            return str;
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }

    public H75() {
        String str;
        C60903NvH.LJIIJJI().getApplicationService().getClass();
        LIZIZ("appid", String.valueOf(EF7.LJIIIZ));
        String did = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
        did = (did == null || did.length() == 0) ? CardStruct.IStatusCode.DEFAULT : did;
        o.LJIIIIZZ(did, "did");
        LIZIZ("did", did);
        LIZIZ("uid", C60903NvH.LJIIJJI().getAccountService().getCurrentUserID());
        LIZIZ("version_code", String.valueOf(C60903NvH.LJIIJJI().getVersionCode()));
        LIZIZ("update_version_code", String.valueOf(C60903NvH.LJIIJJI().getUpdateVersionCode()));
        EnumC48190Ivi LLJJI = C16880lQ.LLJJI(C60903NvH.LJ);
        o.LJIIIIZZ(LLJJI, "getNetworkTypeFast(CameraClient.getApplication())");
        switch (C48193Ivl.LIZ[LLJJI.ordinal()]) {
            case 1:
            case 2:
                str = "null";
                break;
            case 3:
                str = "mobile";
                break;
            case 4:
                str = "2G";
                break;
            case 5:
            case 6:
            case 7:
                str = "3G";
                break;
            case 8:
                str = "4G";
                break;
            case 9:
                str = "5G";
                break;
            case 10:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
            case 12:
                str = "wifi";
                break;
            default:
                throw new C162476Zf();
        }
        LIZIZ("net_type", str);
        C60903NvH.LJIIJJI().getRegionService().getClass();
        String LJ = C85990Xow.LJ();
        LIZIZ("carrier_region", LJ == null ? "" : LJ);
    }

    public final void LIZ(UploadVideoConfig uploadVideoConfig) {
        String region = uploadVideoConfig.uploadRegion;
        if (region == null || region.length() == 0) {
            C60903NvH.LJIIJJI().getRegionService();
            region = C44296Ha0.LIZ();
        }
        o.LJIIIIZZ(region, "region");
        LIZIZ("Region", region);
        String str = uploadVideoConfig.userStoreRegion;
        if (str == null || str.length() == 0) {
            return;
        }
        LIZIZ("StoreRegion", str);
    }

    public final void LIZJ(UploadImageConfig config) {
        o.LJIIIZ(config, "config");
        String userStoreRegion = config.userStoreRegion;
        if (userStoreRegion == null || userStoreRegion.length() == 0) {
            return;
        }
        o.LJIIIIZZ(userStoreRegion, "userStoreRegion");
        LIZIZ("store_region", userStoreRegion);
    }

    public final void LIZIZ(String str, String value) {
        o.LJIIIZ(value, "value");
        ((ArrayList) this.LIZ).add(C00F.LIZIZ(str, '=', value));
    }
}

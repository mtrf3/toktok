package X;

import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostServerOptVersionSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.HashMap;

/* renamed from: X.Bip, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29555Bip {
    public static AbstractC73672Svk<C28467BFf<Void>> LIZ(int i, boolean z) {
        String str;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room == null) {
            return null;
        }
        long id = room.getId();
        if (room.getOwner() != null) {
            str = room.getOwner().getSecUid();
        } else {
            str = "";
        }
        HashMap hashMap = new HashMap();
        hashMap.put("cohost-arch-version", String.valueOf(CohostServerOptVersionSetting.INSTANCE.getValue()));
        switch (i) {
            case 5:
                return ((CoHostApi) Q7L.LIZIZ(CoHostApi.class)).updateMultiCoHostLinkSetting(id, str, 5, false, false, z, false, false, false, false, hashMap);
            case 6:
                return ((CoHostApi) Q7L.LIZIZ(CoHostApi.class)).updateMultiCoHostLinkSetting(id, str, 6, false, false, false, z, false, false, false, hashMap);
            case 7:
                return ((CoHostApi) Q7L.LIZIZ(CoHostApi.class)).updateMultiCoHostLinkSetting(id, str, 7, z, false, false, false, false, false, false, hashMap);
            case 8:
                return ((CoHostApi) Q7L.LIZIZ(CoHostApi.class)).updateMultiCoHostLinkSetting(id, str, 8, false, z, false, false, false, false, false, hashMap);
            case 9:
                return ((CoHostApi) Q7L.LIZIZ(CoHostApi.class)).updateMultiCoHostLinkSetting(id, str, 9, false, false, false, false, z, false, false, hashMap);
            case 10:
                return ((CoHostApi) Q7L.LIZIZ(CoHostApi.class)).updateMultiCoHostLinkSetting(id, str, 10, false, false, false, false, false, z, false, hashMap);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return ((CoHostApi) Q7L.LIZIZ(CoHostApi.class)).updateMultiCoHostLinkSetting(id, str, 11, false, false, false, false, false, false, z, hashMap);
            default:
                return null;
        }
    }
}

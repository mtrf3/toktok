package X;

import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.common.data.OecInitData;
import com.ss.android.ugc.aweme.ecommercelive.common.data.PopProductResp;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* renamed from: X.RwE, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71154RwE {
    public static final HashMap<Long, OecInitData> LIZ = new HashMap<>();
    public static final java.util.Map<Long, InterfaceC68342mE<BaseResponse<PopProductResp>>> LIZIZ = new LinkedHashMap();

    public static OecInitData LIZ(Room room) {
        String str;
        OecInitData oecInitData = null;
        if (room == null) {
            return null;
        }
        OecInitData oecInitData2 = LIZ.get(Long.valueOf(room.getId()));
        if (oecInitData2 != null) {
            return oecInitData2;
        }
        CommerceStruct commerceStruct = room.getCommerceStruct();
        if (commerceStruct != null) {
            str = commerceStruct.oecInitDataString;
        } else {
            str = null;
        }
        try {
            Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str, C65330PkU.LIZJ(C65352Pkq.LJI(OecInitData.class)));
            if (!(fromJson instanceof OecInitData)) {
                fromJson = null;
            }
            oecInitData = (OecInitData) fromJson;
        } catch (s unused) {
        }
        if (oecInitData != null) {
            LIZ.put(Long.valueOf(room.getId()), oecInitData);
        }
        return oecInitData;
    }
}

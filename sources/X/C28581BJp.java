package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.model.UserAttrResponse;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* renamed from: X.BJp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28581BJp<T> implements InterfaceC64592gB {
    public static final C28581BJp<T> LJLIL = new C28581BJp<>();

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Long, O] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Long, O] */
    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        long value;
        long value2;
        java.util.Map<Long, Long> map;
        Long l;
        java.util.Map<Long, Long> map2;
        Long l2;
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse.statusCode == 0) {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            UserAttrResponse userAttrResponse = (UserAttrResponse) baseResponse.data;
            if (userAttrResponse != null && (map2 = userAttrResponse.values) != null && (l2 = map2.get(6L)) != null) {
                value = l2.longValue();
            } else {
                value = BJW.RANK_SWITCH_STATUS_ON.getValue();
            }
            ((C32537Cpp) dataChannelGlobal.gv0(C29025BaH.class)).LIZ = Long.valueOf(value);
            UserAttrResponse userAttrResponse2 = (UserAttrResponse) baseResponse.data;
            if (userAttrResponse2 != null && (map = userAttrResponse2.values) != null && (l = map.get(12L)) != null) {
                value2 = l.longValue();
            } else {
                value2 = EnumC28583BJr.USER_LEVEL_SWITCH_STATUS_ON.getValue();
            }
            ((C32537Cpp) dataChannelGlobal.gv0(C29028BaK.class)).LIZ = Long.valueOf(value2);
        }
    }
}

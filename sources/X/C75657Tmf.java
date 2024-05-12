package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.TopicPairResponse;

/* renamed from: X.Tmf, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75657Tmf<T> implements InterfaceC64592gB {
    public static final C75657Tmf<T> LJLIL = new C75657Tmf<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        Long l;
        TopicPairResponse.ResponseData responseData;
        BaseResponse baseResponse = (BaseResponse) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("keep pair alive, reponse: ");
        if (baseResponse != null && (responseData = (TopicPairResponse.ResponseData) baseResponse.data) != null) {
            l = Long.valueOf(responseData.pairId);
        } else {
            l = null;
        }
        C07670Rv.LJ(LIZ, l, LIZ, "TopicPairManager");
    }
}

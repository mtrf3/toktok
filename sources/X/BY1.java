package X;

import com.bytedance.android.livesdk.chatroom.api.DecorationApi;
import com.bytedance.android.livesdk.chatroom.api.SessionCreationReq;
import com.bytedance.android.livesdk.chatroom.model.RoomDonationInfo;
import com.bytedance.android.livesdk.model.StickerCheckResponse;
import com.bytedance.android.livesdk.model.StickersSetResponse;
import com.bytedance.android.livesdkapi.depend.model.live.DonationTokenModel;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BY1 implements DecorationApi {
    @Override // com.bytedance.android.livesdk.chatroom.api.DecorationApi
    public final AbstractC73672Svk<C28467BFf<StickerCheckResponse>> checkEditable(String str) {
        AbstractC73672Svk<C28467BFf<StickerCheckResponse>> checkEditable = ((DecorationApi) Q7L.LIZIZ(DecorationApi.class)).checkEditable(str);
        o.LJIIIIZZ(checkEditable, "get().getService(Decorat…checkEditable(stickerIds)");
        return checkEditable;
    }

    @Override // com.bytedance.android.livesdk.chatroom.api.DecorationApi
    public final AbstractC73672Svk<C28467BFf<DonationTokenModel>> createDonateToken(java.util.Map<String, Object> map) {
        return AbstractC73672Svk.LJJI(new BFM());
    }

    @Override // com.bytedance.android.livesdk.chatroom.api.DecorationApi
    public final AbstractC73672Svk<C28467BFf<RoomDonationInfo>> getRoomDonationInfo(java.util.Map<String, Object> map) {
        return AbstractC73672Svk.LJJI(new BFM());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.bytedance.android.livesdk.model.StickersSetResponse, T] */
    @Override // com.bytedance.android.livesdk.chatroom.api.DecorationApi
    public final AbstractC73672Svk<C28467BFf<StickersSetResponse>> setRoomStickers(java.util.Map<String, Object> map) {
        C28467BFf c28467BFf = new C28467BFf();
        ?? stickersSetResponse = new StickersSetResponse();
        stickersSetResponse.status = 2;
        c28467BFf.data = stickersSetResponse;
        return AbstractC73672Svk.LJJIJIL(c28467BFf);
    }

    @Override // com.bytedance.android.livesdk.chatroom.api.DecorationApi
    public final AbstractC73672Svk<DonationTokenModel> createDonateSession(String str, SessionCreationReq sessionCreationReq) {
        return AbstractC73672Svk.LJJI(new BFM());
    }

    @Override // com.bytedance.android.livesdk.chatroom.api.DecorationApi
    public final AbstractC73672Svk<C28467BFf<Object>> deleteRoomStickers(long j, long j2) {
        return AbstractC73672Svk.LJJIJIL(new C28467BFf());
    }

    @Override // com.bytedance.android.livesdk.chatroom.api.DecorationApi
    public final AbstractC73672Svk<C28467BFf<Object>> setDecoration(long j, int i, java.util.Map<String, String> map) {
        return AbstractC73672Svk.LJJI(new BFM());
    }
}

package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.SubscribeBadge;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.room.SubscribeSuccessEvent;
import com.bytedance.android.livesdk.api.revenue.subscription.api.SubscribeUserInfoResponse;
import com.bytedance.android.livesdk.api.revenue.subscription.api.Subscribing;
import com.bytedance.android.livesdk.chatroom.api.LevelBadge;
import com.bytedance.android.livesdk.chatroom.api.SubInfo;
import com.bytedance.android.livesdk.chatroom.api.SubLevel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* loaded from: classes6.dex */
public final class CBJ<T> implements InterfaceC64592gB {
    public static final CBJ<T> LJLIL = new CBJ<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        LevelBadge levelBadge;
        ImageModel imageModel;
        Subscribing subscribing;
        SubInfo subInfo;
        SubLevel subLevel;
        BaseResponse baseResponse = (BaseResponse) obj;
        ImageModel imageModel2 = null;
        if (baseResponse != null && baseResponse.data != null) {
            SubscribeUserInfoResponse subscribeUserInfoResponse = (SubscribeUserInfoResponse) baseResponse.data;
            if (subscribeUserInfoResponse != null && (subscribing = subscribeUserInfoResponse.subscribing) != null && (subInfo = subscribing.subInfo) != null && (subLevel = subInfo.subLevel) != null) {
                levelBadge = subLevel.badge;
            } else {
                levelBadge = null;
            }
            SubscribeBadge subscribeBadge = new SubscribeBadge();
            if (levelBadge != null) {
                imageModel = levelBadge.originImg;
            } else {
                imageModel = null;
            }
            subscribeBadge.setOriginImage(imageModel);
            if (levelBadge != null) {
                imageModel2 = levelBadge.previewImg;
            }
            subscribeBadge.setPreviewImage(imageModel2);
            DataChannelGlobal.LJLJJI.tv0(SubscribeSuccessEvent.class, new C29742Blq(subscribeBadge, false, true, 8));
        }
    }
}

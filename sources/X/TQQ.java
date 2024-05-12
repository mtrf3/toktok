package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestPresenter;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class TQQ<T1, T2> implements InterfaceC73459SsJ {
    public final /* synthetic */ MultiGuestV3GuestPresenter LJLIL;

    public TQQ(MultiGuestV3GuestPresenter multiGuestV3GuestPresenter) {
        this.LJLIL = multiGuestV3GuestPresenter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC73459SsJ
    public final void accept(Object obj, Object obj2) {
        MultiLiveGuestInfoList multiLiveGuestInfoList;
        ArrayList<LinkPlayerInfo> arrayList;
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && (multiLiveGuestInfoList = (MultiLiveGuestInfoList) baseResponse.data) != null && (arrayList = multiLiveGuestInfoList.onLineUsers) != null) {
            this.LJLIL.getMultiGuestDataHolder().LJJIFFI = arrayList;
        }
    }
}

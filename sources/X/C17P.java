package X;

import Y.AObserverS65S0200000_1;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.api.LiveSubOnlyConfig;
import com.bytedance.android.livesdk.chatroom.api.TimerDetail;
import com.bytedance.android.livesdk.subscribe.model.SubLiveBanner;
import com.bytedance.android.livesdk.subscribe.model.gift.SubGifInfo;
import java.util.List;
import kotlin.jvm.internal.o;
import webcast.api.sub.GetAnchorSubscriptionResponse;
import webcast.api.sub.PerksPinPanel;
import webcast.api.sub.SubGoal;
import webcast.api.sub.SubManagementResponse;
import webcast.api.sub.SubscriberCountInfo;

/* renamed from: X.17P, reason: invalid class name */
/* loaded from: classes.dex */
public final class C17P implements RTU, J1T {
    public static final C17P LJLIL = new C17P();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.RTU
    public Object apply(Object obj, Object obj2) {
        PerksPinPanel perksPinPanel;
        webcast.api.sub.Tip tip;
        List<SubscriberCountInfo> list;
        SubGoal subGoal;
        LiveSubOnlyConfig liveSubOnlyConfig;
        boolean z;
        SubGifInfo subGifInfo;
        SubLiveBanner subLiveBanner;
        BaseResponse infoResponse = (BaseResponse) obj;
        BaseResponse managementResponse = (BaseResponse) obj2;
        o.LJIIIZ(infoResponse, "infoResponse");
        o.LJIIIZ(managementResponse, "managementResponse");
        GetAnchorSubscriptionResponse.Data data = (GetAnchorSubscriptionResponse.Data) infoResponse.data;
        TimerDetail timerDetail = null;
        if (data != null) {
            perksPinPanel = data.perksPinPanel;
            tip = data.tip;
            list = data.countInfo;
            subGoal = data.subGoal;
        } else {
            perksPinPanel = null;
            tip = null;
            list = null;
            subGoal = null;
        }
        SubManagementResponse.Data data2 = (SubManagementResponse.Data) managementResponse.data;
        if (data2 != null) {
            liveSubOnlyConfig = data2.liveSubOnlyConfig;
        } else {
            liveSubOnlyConfig = null;
        }
        if (data != null) {
            timerDetail = data.timerDetail;
            z = data.enableWaveStatus;
            subGifInfo = data.giftSub;
            subLiveBanner = data.banner;
        } else {
            z = false;
            subGifInfo = null;
            subLiveBanner = null;
        }
        return new C30954CCw(perksPinPanel, tip, list, subGoal, liveSubOnlyConfig, timerDetail, z, subGifInfo, subLiveBanner);
    }

    public static final void LIZIZ(MutableLiveData mutableLiveData, LifecycleOwner lifecycleOwner, Observer observer) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        mutableLiveData.observe(lifecycleOwner, new AObserverS65S0200000_1(observer, mutableLiveData, 13));
    }

    @Override // X.J1T
    public boolean LIZ(InterfaceC66286Pzu store, String storeKey, int i, String str, String str2, String str3, C65300Pk0 c65300Pk0) {
        o.LJIIIZ(store, "store");
        o.LJIIIZ(storeKey, "storeKey");
        if (!store.LIZ(storeKey)) {
            return true;
        }
        return false;
    }
}

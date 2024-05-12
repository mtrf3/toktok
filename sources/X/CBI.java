package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.api.revenue.subscription.api.SubscribeUserInfoResponse;
import com.bytedance.android.livesdk.chatroom.api.SubInfo;
import com.bytedance.android.livesdk.impl.revenue.subscription.SubscribeService;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscriptionExpireRemindHourSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CBI<T> implements InterfaceC64592gB {
    public final /* synthetic */ C34K LJLIL;
    public final /* synthetic */ C72242sW LJLILLLLZI;
    public final /* synthetic */ C34K LJLJI;
    public final /* synthetic */ SubscribeService LJLJJI;
    public final /* synthetic */ DataChannel LJLJJL;
    public final /* synthetic */ Room LJLJJLL;
    public final /* synthetic */ String LJLJL;

    public CBI(C34K c34k, C72242sW c72242sW, C34K c34k2, SubscribeService subscribeService, DataChannel dataChannel, Room room, String str) {
        this.LJLIL = c34k;
        this.LJLILLLLZI = c72242sW;
        this.LJLJI = c34k2;
        this.LJLJJI = subscribeService;
        this.LJLJJL = dataChannel;
        this.LJLJJLL = room;
        this.LJLJL = str;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        double d;
        SubInfo subInfo = ((SubscribeUserInfoResponse) ((BaseResponse) obj).data).subscribing.subInfo;
        if (subInfo.status == 1) {
            this.LJLIL.element = true;
        }
        C72242sW c72242sW = this.LJLILLLLZI;
        Long l = subInfo.subEndTime;
        o.LJIIIIZZ(l, "it.data.subscribing.subInfo.subEndTime");
        c72242sW.element = l.longValue();
        double currentTimeMillis = this.LJLILLLLZI.element - System.currentTimeMillis();
        if (currentTimeMillis >= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            double d2 = 60;
            d = ((currentTimeMillis / 1000) / d2) / d2;
        } else {
            d = -1.0d;
        }
        int value = SubscriptionExpireRemindHourSetting.INSTANCE.getValue();
        if (d > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && d < value) {
            this.LJLJI.element = true;
        }
        if (this.LJLIL.element && this.LJLJI.element) {
            this.LJLJJI.LJ(this.LJLJJL, this.LJLJJLL, CBE.EXTEND, null, true);
            java.util.Map<String, Boolean> LIZJ = InterfaceC30442Bx8.l.LIZJ();
            o.LJIIIIZZ(LIZJ, "LAST_SHOW_SUBSCRIPTION_GUIDE.value");
            LIZJ.put(this.LJLJL, Boolean.TRUE);
        }
        this.LJLJJI.LJLJI = false;
    }
}

package X;

import android.content.Context;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubCreateToolsEntranceNewSetting;
import com.bytedance.android.livesdk.subscribe.model.GetSubInfoResponse;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class C70 implements InterfaceC30844C8q {
    public final /* synthetic */ C30799C6x LIZ;

    @Override // X.InterfaceC30844C8q
    public final void LIZ(Throwable e) {
        o.LJIIIZ(e, "e");
    }

    public C70(C30799C6x c30799C6x) {
        this.LIZ = c30799C6x;
    }

    @Override // X.InterfaceC30844C8q
    public final void LIZIZ(GetSubInfoResponse getSubInfoResponse) {
        C75 c75;
        DialogC31813Ce9 dialogC31813Ce9 = this.LIZ.LJ;
        if (dialogC31813Ce9 != null) {
            C29306Beo.LJJJJ(dialogC31813Ce9);
        }
        C30799C6x c30799C6x = this.LIZ;
        Context context = c30799C6x.LIZ;
        if (context == null || (c75 = c30799C6x.LIZJ) == null) {
            return;
        }
        c75.LIZLLL(context, c30799C6x.LJI, "live_take_page", LiveSubCreateToolsEntranceNewSetting.INSTANCE.getEnable(), "", new AqS155S0100000_5(c30799C6x, 282));
    }
}

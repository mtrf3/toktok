package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubCreateToolsEntranceNewSetting;
import com.bytedance.android.livesdk.subscribe.model.GetSubInfoResponse;
import kotlin.jvm.internal.AqS94S0300000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.C6z, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30801C6z implements InterfaceC30844C8q {
    public final /* synthetic */ C30799C6x LIZ;
    public final /* synthetic */ Bundle LIZIZ;

    @Override // X.InterfaceC30844C8q
    public final void LIZ(Throwable e) {
        o.LJIIIZ(e, "e");
    }

    @Override // X.InterfaceC30844C8q
    public final void LIZIZ(GetSubInfoResponse getSubInfoResponse) {
        C75 c75;
        C30799C6x c30799C6x = this.LIZ;
        Bundle bundle = this.LIZIZ;
        DialogC31813Ce9 dialogC31813Ce9 = c30799C6x.LJ;
        if (dialogC31813Ce9 != null) {
            C29306Beo.LJJJJ(dialogC31813Ce9);
        }
        Context context = c30799C6x.LIZ;
        if (context == null || (c75 = c30799C6x.LIZJ) == null) {
            return;
        }
        c75.LIZLLL(context, c30799C6x.LJI, "live_take_page", LiveSubCreateToolsEntranceNewSetting.INSTANCE.getEnable(), "", new AqS94S0300000_5(bundle, c30799C6x, context, 8));
    }

    public C30801C6z(C30799C6x c30799C6x, Bundle bundle) {
        this.LIZ = c30799C6x;
        this.LIZIZ = bundle;
    }
}

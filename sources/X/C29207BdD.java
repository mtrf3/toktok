package X;

import android.content.Context;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastAgeThresholdSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostAndCoHostAddAgeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveLowAgeCountrySetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.UserWithAgeSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.BdD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29207BdD implements InterfaceC28918BWo {
    public final User LIZ;

    @Override // X.InterfaceC28918BWo
    public final boolean LIZ() {
        return true;
    }

    @Override // X.InterfaceC28918BWo
    public final int getErrorCode() {
        return 110;
    }

    public C29207BdD() {
        InterfaceC05190Ih interfaceC05190Ih = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ;
        o.LJII(interfaceC05190Ih, "null cannot be cast to non-null type com.bytedance.android.live.base.model.user.User");
        this.LIZ = (User) interfaceC05190Ih;
    }

    public static void LIZJ(DataChannel dataChannel, String str) {
        BZI LIZ = C28787BRn.LIZ("livesdk_live_age_popup_click");
        LIZ.LJIILLIIL(dataChannel);
        LIZ.LJIIIZ("live");
        LIZ.LJIIJJI("start_broadcast");
        LIZ.LJIIL("click");
        LIZ.LJIJJ(str, "click_icon");
        LIZ.LJJIIJZLJL();
    }

    @Override // X.InterfaceC28918BWo
    public final Object LIZIZ(BIK bik, AbstractC65782Prm abstractC65782Prm) {
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(abstractC65782Prm));
        Context context = bik.LIZ;
        C29216BdM c29216BdM = new C29216BdM();
        boolean LIZ = C29216BdM.LIZ(context, this.LIZ.getId(), "saved_uid_start");
        if (LiveLowAgeCountrySetting.INSTANCE.getValue() && !UserWithAgeSetting.INSTANCE.getValue() && !LIZ && LiveHostAndCoHostAddAgeSetting.INSTANCE.getValue() == 0) {
            C77437UaH c77437UaH = new C77437UaH(context);
            c77437UaH.LIZJ = C15380j0.LJIILL(R.string.me_, new Integer(LiveBroadcastAgeThresholdSetting.INSTANCE.getValue()));
            c77437UaH.LJI = C15380j0.LJIILJJIL(R.string.me8);
            c77437UaH.LJFF(new DialogInterfaceOnClickListenerC29208BdE(this, bik, c29216BdM, context, c84654XKg), C15380j0.LJIILJJIL(R.string.me9), false);
            c77437UaH.LIZLLL(new DialogInterfaceOnClickListenerC29181Bcn(this, bik, c84654XKg), C15380j0.LJIILJJIL(R.string.me7), false);
            c77437UaH.LJJII = false;
            DialogC77438UaI LIZ2 = c77437UaH.LIZ();
            if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/dialog/LiveModalDialog", "show", LIZ2, new Object[0], "void", new C65300Pk0(false, "()V", "-8549913571122931345")).LIZ) {
                LIZ2.show();
            }
            DataChannel dataChannel = bik.LIZIZ;
            BZI LIZ3 = C28787BRn.LIZ("livesdk_live_age_popup_show");
            LIZ3.LJIILLIIL(dataChannel);
            LIZ3.LJIIIZ("live");
            LIZ3.LJIIJJI("start_broadcast");
            LIZ3.LJIIL("show");
            LIZ3.LJJIIJZLJL();
        } else {
            Boolean bool = Boolean.FALSE;
            C3C5.m7constructorimpl(bool);
            c84654XKg.resumeWith(bool);
        }
        return c84654XKg.LIZ();
    }
}

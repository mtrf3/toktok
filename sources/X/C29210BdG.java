package X;

import Y.IDCListenerS49S0200000_5;
import android.content.Context;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastAgeThresholdSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveLowAgeCountrySetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.UserWithAgeSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.BdG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29210BdG implements InterfaceC74833TYn {
    @Override // X.InterfaceC74833TYn
    public final boolean LIZ(C29212BdI checkParam) {
        o.LJIIIZ(checkParam, "checkParam");
        Context context = checkParam.LIZ;
        long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        C29216BdM c29216BdM = new C29216BdM();
        boolean LIZ = C29216BdM.LIZ(context, currentUserId, "saved_uid_start");
        if (!LiveLowAgeCountrySetting.INSTANCE.getValue() || UserWithAgeSetting.INSTANCE.getValue() || LIZ || C78963Uyt.LJLILLLLZI) {
            return false;
        }
        C77437UaH c77437UaH = new C77437UaH(context);
        c77437UaH.LIZJ = C15380j0.LJIILL(R.string.me_, Integer.valueOf(LiveBroadcastAgeThresholdSetting.INSTANCE.getValue()));
        c77437UaH.LJI = C15380j0.LJIILJJIL(R.string.me8);
        c77437UaH.LJFF(new DialogInterfaceOnClickListenerC29211BdH(c29216BdM, context, currentUserId, checkParam, this), C15380j0.LJIILJJIL(R.string.me9), false);
        c77437UaH.LIZLLL(new IDCListenerS49S0200000_5(checkParam, this, 16), C15380j0.LJIILJJIL(R.string.me7), false);
        c77437UaH.LJJII = false;
        DialogC77438UaI LIZ2 = c77437UaH.LIZ();
        if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/dialog/LiveModalDialog", "show", LIZ2, new Object[0], "void", new C65300Pk0(false, "()V", "8572708374258913127")).LIZ) {
            LIZ2.show();
        }
        DataChannel dataChannel = checkParam.LIZIZ;
        BZI LIZ3 = C28787BRn.LIZ("livesdk_live_age_popup_show");
        LIZ3.LJIILLIIL(dataChannel);
        LIZ3.LJIIIZ("live_interact");
        LIZ3.LJIIJJI("guest_connect");
        LIZ3.LJIIL("show");
        LIZ3.LJJIIJZLJL();
        return true;
    }

    public static void LIZIZ(DataChannel dataChannel, String str) {
        BZI LIZ = C28787BRn.LIZ("livesdk_live_age_popup_click");
        LIZ.LJIILLIIL(dataChannel);
        LIZ.LJIIIZ("live_interact");
        LIZ.LJIIJJI("guest_connect");
        LIZ.LJIIL("click");
        LIZ.LJIJJ(str, "click_icon");
        LIZ.LJJIIJZLJL();
    }
}

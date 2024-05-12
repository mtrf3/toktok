package X;

import Y.IDCListenerS159S0100000_5;
import Y.IDCListenerS49S0200000_5;
import Y.IDcS170S0100000_5;
import android.content.Context;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.broadcast.PreviewTitleChannel;
import com.bytedance.android.livesdkapi.host.IHostConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* renamed from: X.BcO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29156BcO {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(DataChannel dataChannel, String str) {
        String str2;
        BZI LIZ2 = C28787BRn.LIZ("livesdk_live_phone_verify_exit");
        LIZ2.LJIILLIIL(dataChannel);
        if (dataChannel == null || (str2 = (String) dataChannel.kv0(PreviewTitleChannel.class)) == null) {
            str2 = "";
        }
        C06490Nh.LIZLLL(LIZ2, str2, "room_title", str, "exit_type");
    }

    public static void LIZIZ(DataChannel dataChannel, String str) {
        String str2;
        BZI LIZ2 = C28787BRn.LIZ("livesdk_live_phone_verify_success");
        LIZ2.LJIILLIIL(dataChannel);
        if (dataChannel == null || (str2 = (String) dataChannel.kv0(PreviewTitleChannel.class)) == null) {
            str2 = "";
        }
        C06490Nh.LIZLLL(LIZ2, str2, "room_title", str, "verify_type");
    }

    public static void LIZJ(Context context, DataChannel dataChannel) {
        if (context == null) {
            return;
        }
        C0N7.LJIJJ(dataChannel, "show");
        C0N7.LJIJI(dataChannel, "show");
        ((IHostConfig) CN1.LIZ(IHostConfig.class)).qS().getClass();
        C77437UaH c77437UaH = new C77437UaH(context);
        c77437UaH.LJI(R.string.nzd);
        c77437UaH.LIZIZ(R.string.nzc);
        c77437UaH.LJ(R.string.nza, new IDCListenerS159S0100000_5(dataChannel, 32), false);
        c77437UaH.LIZJ(R.string.nzb, new IDCListenerS49S0200000_5(context, dataChannel, 17), false);
        c77437UaH.LJJII = false;
        C29182Bco.LIZ().LIZ(c77437UaH.LIZ(), EnumC30559Bz1.MIDDLE, new C29157BcP(dataChannel), dataChannel, null);
    }

    public static void LIZLLL(int i, Context context, DataChannel dataChannel, String str) {
        BZI LIZ2 = C28787BRn.LIZ("livesdk_live_phone_verify_show");
        LIZ2.LJIILLIIL(dataChannel);
        Object kv0 = dataChannel.kv0(PreviewTitleChannel.class);
        if (kv0 == null) {
            kv0 = "";
        }
        LIZ2.LJIJJ(kv0, "room_title");
        LIZ2.LJJIIJZLJL();
        ((IHostConfig) CN1.LIZ(IHostConfig.class)).qS().getClass();
        C47071t1 c47071t1 = new C47071t1(context);
        c47071t1.LJIILLIIL(R.string.ova);
        c47071t1.LJFF(R.string.ov_);
        c47071t1.LJIIL(R.string.ov8, new C29178Bck(i, context, dataChannel, str));
        c47071t1.LJIIIZ(R.string.ov9, new IDcS170S0100000_5(dataChannel, 44));
        c47071t1.LJIILJJIL = false;
        LiveDialog LIZ3 = c47071t1.LIZ();
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ3, new Object[0], "void", new C65300Pk0(false, "()V", "-8544146860056119436")).LIZ) {
            return;
        }
        LIZ3.show();
    }
}

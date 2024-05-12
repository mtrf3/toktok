package X;

import Y.IDCListenerS49S0200000_5;
import android.app.Activity;
import android.content.Context;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastAgeThresholdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import java.util.Arrays;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BYM {
    public static final void LIZ(InterfaceC31336CRo interfaceC31336CRo, DataChannel dataChannel) {
        InterfaceC74834TYo interfaceC74834TYo;
        if (interfaceC31336CRo != null) {
            Context context = interfaceC31336CRo.getContext();
            if (dataChannel != null) {
                interfaceC74834TYo = (InterfaceC74834TYo) dataChannel.kv0(C74969TbZ.class);
            } else {
                interfaceC74834TYo = null;
            }
            C0NQ.LIZ(context, interfaceC31336CRo, 13, interfaceC74834TYo, new AqS171S0100000_5(interfaceC31336CRo, 784));
        }
    }

    public static final void LIZLLL(Context context, DataChannel dataChannel) {
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.mjh);
        o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_live_multiguestwarn)");
        String LIZIZ = Q8U.LIZIZ(new Object[]{String.valueOf(LiveAudienceLinkmicLowestAgeSetting.INSTANCE.getValue())}, 1, LJIILJJIL, "format(format, *args)");
        C77437UaH c77437UaH = new C77437UaH(context);
        c77437UaH.LJJII = true;
        c77437UaH.LJI = LIZIZ;
        c77437UaH.LJ(R.string.spm, new IDCListenerS49S0200000_5(context, dataChannel, 15), false);
        c77437UaH.LIZJ(R.string.spn, DialogInterfaceOnClickListenerC28551BIl.LJLIL, false);
        DialogC77438UaI LIZ = c77437UaH.LIZ();
        if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/dialog/LiveModalDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "-674595576800320475")).LIZ) {
            LIZ.show();
        }
        C75017TcL.LJJI("guest_connection_underage_popup", "show", null);
    }

    public static final void LIZIZ(Context context, DataChannel dataChannel, int i) {
        Room room;
        User user = null;
        if (dataChannel != null) {
            room = (Room) dataChannel.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        C47071t1 c47071t1 = new C47071t1(context);
        c47071t1.LJIILL = false;
        c47071t1.LJIILJJIL = false;
        c47071t1.LIZJ = C15380j0.LJIILL(R.string.k98, String.valueOf(LiveBroadcastAgeThresholdSetting.INSTANCE.getValue()));
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.k97);
        o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_agegate_popup16_desc)");
        String LJJJJZ = ujb.o.LJJJJZ(LJIILJJIL, "{username}", "%s", false);
        Object[] objArr = new Object[1];
        if (room != null) {
            user = room.getOwner();
        }
        objArr[0] = C05170If.LIZ(user);
        String LLLZ = C16880lQ.LLLZ(LJJJJZ, Arrays.copyOf(objArr, 1));
        o.LJIIIIZZ(LLLZ, "format(format, *args)");
        c47071t1.LJII(LLLZ);
        c47071t1.LJIIIZ(R.string.nol, new C1ST(i));
        c47071t1.LJIIL(R.string.spm, new C1SX(i));
        LiveDialog LIZ = c47071t1.LIZ();
        if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "-674595576800320475")).LIZ) {
            LIZ.show();
        }
        C75017TcL.LJIJI(i);
    }

    public static final void LIZJ(Context context, DataChannel dataChannel, int i) {
        Activity LJIILJJIL = g0.LJIILJJIL(context);
        if (LJIILJJIL == null) {
            return;
        }
        ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).showGuideBirthdayEditDialog(LJIILJJIL, "live_co_host", C75017TcL.LIZJ(i), new C29217BdN(i, dataChannel));
        C75017TcL.LJJ(i);
    }
}

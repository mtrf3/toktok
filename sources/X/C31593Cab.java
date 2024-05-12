package X;

import android.app.Activity;
import android.view.View;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdkapi.depend.model.live.GiftSuspension;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Cab, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31593Cab {
    public static CountDownTimerC31584CaS LIZ;
    public static Boolean LIZIZ;

    public static void LIZJ() {
        CountDownTimerC31584CaS countDownTimerC31584CaS = LIZ;
        if (countDownTimerC31584CaS != null) {
            countDownTimerC31584CaS.cancel();
        }
        LIZ = null;
    }

    public static String LIZ(DataChannel dataChannel) {
        GiftSuspension giftSuspension;
        boolean z;
        boolean z2;
        if (dataChannel != null && (giftSuspension = (GiftSuspension) dataChannel.kv0(C31586CaU.class)) != null) {
            if (giftSuspension.status == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int LIZIZ2 = ((int) ((giftSuspension.endTime - (C30725C4b.LIZIZ() / 1000)) / 60)) + 1;
                String LJIIIIZZ = C15380j0.LJIIIIZZ(R.plurals.li, LIZIZ2, Integer.valueOf(LIZIZ2));
                o.LJIIIIZZ(LJIIIIZZ, "getQuantityString(\n     …oast, duration, duration)");
                return LJIIIIZZ;
            }
            if (giftSuspension != null) {
                if (giftSuspension.status == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    String LJIILJJIL = C15380j0.LJIILJJIL(R.string.lk7);
                    o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_giftAccess_suspend_toast)");
                    return LJIILJJIL;
                }
                if (giftSuspension != null && giftSuspension.status == 3) {
                    if (o.LJ(LIZIZ, Boolean.TRUE)) {
                        int LIZIZ3 = ((int) ((giftSuspension.endTime - (C30725C4b.LIZIZ() / 1000)) / 86400)) + 1;
                        String LJIIIIZZ2 = C15380j0.LJIIIIZZ(R.plurals.lk, LIZIZ3, Integer.valueOf(LIZIZ3));
                        o.LJIIIIZZ(LJIIIIZZ2, "{\n                val du…, duration)\n            }");
                        return LJIIIIZZ2;
                    }
                    String LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.lk7);
                    o.LJIIIIZZ(LJIILJJIL2, "{\n                ResUti…pend_toast)\n            }");
                    return LJIILJJIL2;
                }
                return "";
            }
            return "";
        }
        return "";
    }

    public static boolean LIZIZ(DataChannel dataChannel) {
        GiftSuspension giftSuspension;
        int i;
        if (dataChannel != null && (giftSuspension = (GiftSuspension) dataChannel.kv0(C31586CaU.class)) != null) {
            if ((giftSuspension.status == 1 && giftSuspension.endTime > C30725C4b.LIZIZ() / 1000) || (i = giftSuspension.status) == 2) {
                return true;
            }
            if (i == 3 && giftSuspension.endTime > C30725C4b.LIZIZ() / 1000) {
                return true;
            }
        }
        return false;
    }

    public static void LIZLLL(Activity activity, DataChannel dataChannel) {
        boolean z;
        if (dataChannel == null) {
            return;
        }
        String LIZ2 = LIZ(dataChannel);
        if (activity == null) {
            C30868C9o.LJI(LIZ2);
        } else {
            C30868C9o.LJIIIZ(R.drawable.czc, activity, LIZ2);
        }
        Room room = (Room) dataChannel.kv0(RoomChannel.class);
        GiftSuspension giftSuspension = (GiftSuspension) dataChannel.kv0(C31586CaU.class);
        if (giftSuspension != null && room != null) {
            Boolean bool = (Boolean) dataChannel.kv0(UserIsAnchorChannel.class);
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            C32785Ctp.LJIILIIL.getClass();
            C32785Ctp.LJIL(z, room, giftSuspension);
        }
    }

    public static void LJ(View view, DataChannel dataChannel) {
        Room room;
        boolean z;
        if (dataChannel == null) {
            return;
        }
        String LIZ2 = LIZ(dataChannel);
        if (view == null) {
            C30868C9o.LJI(LIZ2);
        } else {
            C30868C9o.LJIIJ(R.drawable.czc, view, LIZ2);
        }
        GiftSuspension giftSuspension = (GiftSuspension) dataChannel.kv0(C31586CaU.class);
        if (giftSuspension != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            Boolean bool = (Boolean) dataChannel.kv0(UserIsAnchorChannel.class);
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            C32785Ctp.LJIILIIL.getClass();
            C32785Ctp.LJIL(z, room, giftSuspension);
        }
    }
}

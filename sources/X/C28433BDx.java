package X;

import Y.ACListenerS14S1300000_5;
import Y.IDTListenerS115S0100000_5;
import android.os.SystemClock;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubOnlyChatConfig;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.jvm.internal.AqS152S0200000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.BDx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28433BDx {
    public static long LIZJ;
    public static final /* synthetic */ int LIZLLL = 0;
    public int LIZ;
    public InterfaceC65784Pro<C76800UCe> LIZIZ;

    public static void LIZJ(Room room) {
        Long l;
        BZI LIZ = C28787BRn.LIZ("livesdk_subscription_sub_only_set_toast");
        if (room != null) {
            l = Long.valueOf(room.getId());
        } else {
            l = null;
        }
        LIZ.LJIJJ(l, "room_id");
        LIZ.LJJIIJZLJL();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(android.view.ViewGroup r2, X.C47121t6 r3, com.bytedance.ies.sdk.datachannel.DataChannel r4, com.bytedance.android.livesdkapi.depend.model.live.Room r5) {
        /*
            com.bytedance.android.livesdk.livesetting.subscription.EnableSubOnlyLiveSetting r0 = com.bytedance.android.livesdk.livesetting.subscription.EnableSubOnlyLiveSetting.INSTANCE
            boolean r0 = r0.isEnable()
            if (r0 == 0) goto L35
            if (r4 == 0) goto L33
            java.lang.Class<X.BCX> r0 = X.BCX.class
            java.lang.Object r1 = r4.kv0(r0)
        L10:
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.THIRD_PARTY
            if (r1 == r0) goto L35
            X.C29306Beo.LJJLJLI(r2)
        L17:
            if (r3 != 0) goto L1a
        L19:
            return
        L1a:
            boolean r0 = X.C29232Bdc.LJIILIIL(r5)
            if (r0 == 0) goto L2b
            r0 = 2131841224(0x7f1150c8, float:1.931575E38)
            java.lang.String r0 = X.C15380j0.LJIILJJIL(r0)
        L27:
            r3.setText(r0)
            goto L19
        L2b:
            r0 = 2131841223(0x7f1150c7, float:1.9315748E38)
            java.lang.String r0 = X.C15380j0.LJIILJJIL(r0)
            goto L27
        L33:
            r1 = 0
            goto L10
        L35:
            X.C29306Beo.LJI(r2)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28433BDx.LIZIZ(android.view.ViewGroup, X.1t6, com.bytedance.ies.sdk.datachannel.DataChannel, com.bytedance.android.livesdkapi.depend.model.live.Room):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void LIZ(ViewGroup viewGroup, C41071jL c41071jL, Room room, String enterFrom) {
        boolean z;
        boolean z2;
        RoomAuthStatus roomAuthStatus;
        ?? r6;
        Long l;
        Long l2;
        User owner;
        RoomAuthStatus roomAuthStatus2;
        o.LJIIIZ(enterFrom, "enterFrom");
        if (room != null && (roomAuthStatus2 = room.getRoomAuthStatus()) != null && !roomAuthStatus2.enableChat) {
            z = true;
        } else {
            z = false;
        }
        if (!z && LiveSubOnlyChatConfig.INSTANCE.onLiveSwitchEnable()) {
            C29306Beo.LJJLJLI(viewGroup);
            if (c41071jL == null) {
                r6 = 0;
            } else {
                if (room != null && (roomAuthStatus = room.getRoomAuthStatus()) != null && roomAuthStatus.chatSubOnly) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c41071jL.setChecked(z2);
                r6 = c41071jL.isChecked();
            }
            BZI LIZ = C28787BRn.LIZ("livesdk_subscription_sub_only_set_show");
            if (room != null) {
                l = Long.valueOf(room.getId());
            } else {
                l = null;
            }
            LIZ.LJIJJ(l, "room_id");
            if (room != null && (owner = room.getOwner()) != null) {
                l2 = Long.valueOf(owner.getId());
            } else {
                l2 = null;
            }
            LIZ.LJIJJ(l2, "anchor_id");
            LIZ.LJIJJ(Integer.valueOf((int) r6), "status");
            LIZ.LJJIIJZLJL();
        } else {
            C29306Beo.LJI(viewGroup);
        }
        long elapsedRealtime = LIZJ - SystemClock.elapsedRealtime();
        if (C29232Bdc.LJIILIIL(room)) {
            LIZLLL(c41071jL, false, 1, BB2.LJLIL);
        } else {
            if (elapsedRealtime > 0) {
                LIZLLL(c41071jL, false, 2, new AqS152S0200000_5(this, room, 38));
                if (c41071jL == null) {
                    return;
                }
                c41071jL.postDelayed(new RunnableC28434BDy(this, c41071jL, null), elapsedRealtime);
                c41071jL.setOnTouchListener(new IDTListenerS115S0100000_5(this, 24));
                C16880lQ.LJJIIJZLJL(c41071jL, new ACListenerS14S1300000_5(this, c41071jL, room, enterFrom, 1));
            }
            LIZLLL(c41071jL, true, 0, null);
        }
        if (c41071jL == null) {
            return;
        }
        c41071jL.setOnTouchListener(new IDTListenerS115S0100000_5(this, 24));
        C16880lQ.LJJIIJZLJL(c41071jL, new ACListenerS14S1300000_5(this, c41071jL, room, enterFrom, 1));
    }

    public final void LIZLLL(C41071jL c41071jL, boolean z, int i, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        int i2;
        float f;
        if (z) {
            i2 = this.LIZ & (~i);
        } else {
            i2 = this.LIZ | i;
        }
        this.LIZ = i2;
        if (interfaceC65784Pro != null) {
            this.LIZIZ = interfaceC65784Pro;
        }
        if (c41071jL == null) {
            return;
        }
        if (i2 == 0) {
            f = 1.0f;
        } else {
            f = 0.6f;
        }
        c41071jL.setAlpha(f);
    }
}

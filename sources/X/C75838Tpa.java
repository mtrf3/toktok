package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.liveinteract.api.event.BattleVictoryLapActivityEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.model.message.battle.BattleResult;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.Tpa, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75838Tpa {
    public final DataChannel LIZ;
    public final Context LIZIZ;
    public final View LIZJ;
    public final boolean LIZLLL;

    public final void LIZ(String str) {
        boolean z;
        String str2;
        if (o.LJ(str, "suggestion")) {
            C75458TjS.LIZIZ("livesdk_pk_punish_activity_suggestion_show", C75458TjS.LIZ(this.LIZLLL));
            return;
        }
        if (o.LJ(str, "suggestion_refresh")) {
            boolean z2 = this.LIZLLL;
            BattleResult battleResult = C76265TwT.LIZ.LJIJI;
            if (battleResult != null && battleResult.result == 0) {
                z = true;
            } else {
                z = false;
            }
            java.util.Map LIZ = C75458TjS.LIZ(z2);
            if (z) {
                str2 = "winner";
            } else {
                str2 = "loser";
            }
            LIZ.put("pk_result", str2);
            C75458TjS.LIZIZ("livesdk_pk_punish_activity_suggestion_change_show", LIZ);
            return;
        }
        java.util.Map LIZ2 = C75458TjS.LIZ(this.LIZLLL);
        LIZ2.put("show_reason", str);
        C75458TjS.LIZIZ("livesdk_pk_punish_activity_show", LIZ2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e4, code lost:
    
        if (X.C75618Tm2.LIZ[com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.RandomLinkMicManager.LL.ordinal()] == 1) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75838Tpa.LIZIZ(java.lang.String):void");
    }

    public final void LIZJ(int i, boolean z) {
        if (z) {
            View view = this.LIZJ;
            if (view != null) {
                view.setTranslationY(-i);
            }
        } else {
            View view2 = this.LIZJ;
            if (view2 != null) {
                view2.setTranslationY(0.0f);
            }
        }
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            dataChannel.rv0(BattleVictoryLapActivityEvent.class, new C29915Bod(i / 2));
        }
    }

    public C75838Tpa(DataChannel dataChannel, Context context, View view) {
        boolean z;
        this.LIZ = dataChannel;
        this.LIZIZ = context;
        this.LIZJ = view;
        if (dataChannel != null) {
            dataChannel.kv0(RoomChannel.class);
            z = o.LJ(dataChannel.kv0(UserIsAnchorChannel.class), Boolean.TRUE);
        } else {
            z = false;
        }
        this.LIZLLL = z;
    }
}

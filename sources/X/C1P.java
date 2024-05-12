package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.broadcast.PerceptionDialogDismissedChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UpdatePerceptionMessageChannel;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedList;
import java.util.Queue;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class C1P implements InterfaceC72822Si2 {
    public static final /* synthetic */ int LJLLI = 0;
    public final Context LJLIL;
    public final DataChannel LJLILLLLZI;
    public final LifecycleOwner LJLJI;
    public final Queue<PerceptionMessage> LJLJJI;
    public LiveDialog LJLJJL;
    public boolean LJLJJLL;
    public C277116x LJLJL;
    public InterfaceC12650eb LJLJLJ;
    public C78555UsJ LJLJLLL;
    public boolean LJLL;

    public final void LIZ() {
        if (this.LJLJJI.isEmpty() || this.LJLL) {
            return;
        }
        LJI((PerceptionMessage) ((LinkedList) this.LJLJJI).poll());
        if (!this.LJLJJLL) {
            return;
        }
        C72818Shy.LIZ(new C76052yf(System.currentTimeMillis(), null, "violation_record_change"));
    }

    public final void LJFF() {
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel != null) {
            C30649C1d c30649C1d = new C30649C1d(0);
            c30649C1d.LIZ = Boolean.FALSE;
            PunishEventInfo punishEventInfo = new PunishEventInfo();
            punishEventInfo.punishId = CardStruct.IStatusCode.DEFAULT;
            c30649C1d.LIZJ = punishEventInfo;
            dataChannel.rv0(UpdatePerceptionMessageChannel.class, c30649C1d);
        }
    }

    public C1P(Context context) {
        this.LJLJJI = new LinkedList();
        this.LJLIL = context;
        this.LJLILLLLZI = null;
        this.LJLJI = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0105, code lost:
    
        if (r5 != null) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.bytedance.android.livesdk.model.message.PerceptionMessage r7) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1P.LIZIZ(com.bytedance.android.livesdk.model.message.PerceptionMessage):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:208:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0208  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(com.bytedance.android.livesdk.model.message.PerceptionMessage r28) {
        /*
            Method dump skipped, instructions count: 1095
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1P.LJI(com.bytedance.android.livesdk.model.message.PerceptionMessage):void");
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        if (o.LJ(c199097rd.LJLIL, "live_anchor_center_mask_will_appear")) {
            this.LJLJJLL = true;
        } else {
            if (!o.LJ(c199097rd.LJLIL, "live_anchor_center_mask_will_disappear")) {
                return;
            }
            this.LJLJJLL = false;
        }
    }

    public final void LIZLLL(String str, PunishEventInfo punishEventInfo) {
        if (this.LJLILLLLZI == null || punishEventInfo == null) {
            return;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_violation_popup_feedback");
        LIZ.LJIIZILJ();
        LIZ.LIZJ(str);
        LIZ.LJIJJ(punishEventInfo.punishType, "violation_type");
        LIZ.LJIJJ(punishEventInfo.punishId, "record_id");
        LIZ.LJJIIJZLJL();
    }

    public C1P(Context context, LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        this.LJLJJI = new LinkedList();
        this.LJLIL = context;
        this.LJLILLLLZI = dataChannel;
        this.LJLJI = lifecycleOwner;
        C72818Shy.LIZLLL("live_anchor_center_mask_will_appear", this);
        C72818Shy.LIZLLL("live_anchor_center_mask_will_disappear", this);
        if (dataChannel != null) {
            dataChannel.lv0(lifecycleOwner, PerceptionDialogDismissedChannel.class, new AqS171S0100000_5(this, 604));
        }
    }

    public final void LIZJ(PerceptionMessage perceptionMessage, String str, String str2) {
        PunishEventInfo punishEventInfo;
        Room room;
        String str3;
        String str4;
        Long l;
        String str5;
        PerceptionDialogInfo perceptionDialogInfo;
        User owner;
        Long l2 = null;
        if (perceptionMessage != null) {
            punishEventInfo = perceptionMessage.publicEventInfo;
        } else {
            punishEventInfo = null;
        }
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel != null) {
            room = (Room) dataChannel.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_appeal_popup");
        if (punishEventInfo != null) {
            str3 = punishEventInfo.punishType;
        } else {
            str3 = null;
        }
        LIZ.LJIJJ(str3, "violation_type");
        if (punishEventInfo != null) {
            str4 = punishEventInfo.punishId;
        } else {
            str4 = null;
        }
        LIZ.LJIJJ(str4, "record_id");
        if (room != null) {
            l = Long.valueOf(room.getId());
        } else {
            l = null;
        }
        LIZ.LJIJJ(l, "room_id");
        if (room != null && (owner = room.getOwner()) != null) {
            l2 = Long.valueOf(owner.getId());
        }
        LIZ.LJIJJ(l2, "anchor_id");
        LIZ.LJIJJ(str, "action_type");
        LIZ.LJIJJ(str2, "click_tab");
        if (perceptionMessage != null && (perceptionDialogInfo = perceptionMessage.dialog) != null && perceptionDialogInfo.scene == 12) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJIJJ(str5, "appeal_result");
        LIZ.LJJIIJZLJL();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        if (r1.longValue() > 0) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(java.lang.String r10, java.lang.String r11, com.bytedance.android.livesdk.model.message.PunishEventInfo r12, com.bytedance.android.livesdk.model.message.PerceptionDialogInfo r13) {
        /*
            r9 = this;
            X.0eb r0 = r9.LJLJLJ
            if (r0 == 0) goto L8
            r0.LIZ(r10)
            return
        L8:
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r9.LJLILLLLZI
            if (r1 != 0) goto Ld
            return
        Ld:
            java.lang.Class<X.BCX> r0 = X.BCX.class
            java.lang.Object r3 = r1.kv0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r3 = (com.bytedance.android.livesdkapi.depend.model.live.LiveMode) r3
            java.lang.String r0 = "livesdk_violation_popup"
            X.BZI r2 = X.C28787BRn.LIZ(r0)
            r2.LJIIZILJ()
            java.lang.String r0 = "action_type"
            r2.LJIJJ(r10, r0)
            java.lang.String r1 = "user_type"
            java.lang.String r0 = "anchor"
            r2.LJIJJ(r0, r1)
            java.lang.String r1 = "scene_type"
            java.lang.String r0 = "live"
            r2.LJIJJ(r0, r1)
            r6 = 0
            if (r12 == 0) goto Lc0
            java.lang.String r1 = r12.punishId
        L36:
            java.lang.String r0 = "record_id"
            r2.LJIJJ(r1, r0)
            if (r12 == 0) goto Lbe
            java.lang.String r1 = r12.punishType
        L3f:
            java.lang.String r0 = "violation_type"
            r2.LJIJJ(r1, r0)
            if (r12 == 0) goto Lbc
            java.lang.String r1 = r12.punishReason
        L48:
            java.lang.String r0 = "violation_reason"
            r2.LJIJJ(r1, r0)
            if (r12 == 0) goto Lba
            long r0 = r12.violationUid
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L55:
            java.lang.String r0 = "violation_anchor_id"
            r2.LJIJJ(r1, r0)
            if (r13 == 0) goto Lb8
            long r0 = r13.policyTip
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            long r7 = r1.longValue()
            r4 = 0
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 <= 0) goto Lb8
        L6c:
            java.lang.String r0 = "policy_tip"
            r2.LJIJJ(r1, r0)
            if (r13 == 0) goto Lb6
            java.lang.String r0 = r13.violationDetailUrl
        L75:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r5 = "1"
            java.lang.String r4 = "0"
            if (r0 != 0) goto Lb4
            r1 = r5
        L80:
            java.lang.String r0 = "is_detail_button"
            r2.LJIJJ(r1, r0)
            if (r12 == 0) goto L89
            java.lang.Long r6 = r12.duration
        L89:
            java.lang.String r0 = "period"
            r2.LJIJJ(r6, r0)
            java.lang.String r0 = "click_tab"
            r2.LJIJJ(r11, r0)
            if (r13 == 0) goto Lb2
            int r1 = r13.scene
            r0 = 11
            if (r1 != r0) goto Lb2
        L9b:
            java.lang.String r0 = "is_appeal_button"
            r2.LJIJJ(r5, r0)
            if (r3 == 0) goto Laf
            java.lang.String r1 = X.C28509BGv.LIZ(r3)
        La6:
            java.lang.String r0 = "live_type"
            r2.LJIJJ(r1, r0)
            r2.LJJIIJZLJL()
            return
        Laf:
            java.lang.String r1 = ""
            goto La6
        Lb2:
            r5 = r4
            goto L9b
        Lb4:
            r1 = r4
            goto L80
        Lb6:
            r0 = r6
            goto L75
        Lb8:
            r1 = r6
            goto L6c
        Lba:
            r1 = r6
            goto L55
        Lbc:
            r1 = r6
            goto L48
        Lbe:
            r1 = r6
            goto L3f
        Lc0:
            r1 = r6
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1P.LJ(java.lang.String, java.lang.String, com.bytedance.android.livesdk.model.message.PunishEventInfo, com.bytedance.android.livesdk.model.message.PerceptionDialogInfo):void");
    }
}

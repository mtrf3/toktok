package Y;

import X.AbstractC73672Svk;
import X.C05260Io;
import X.C12510eN;
import X.C188727au;
import X.C1EW;
import X.C29306Beo;
import X.C2S9;
import X.C73969T1h;
import X.C78977Uz7;
import X.C78980UzA;
import X.FMX;
import X.InterfaceC78981UzB;
import X.T16;
import X.UEQ;
import X.UER;
import android.view.View;
import com.bytedance.android.live.broadcast.api.PerceptionAppealApi;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.notice.api.bean.LinkBusinessExtra;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.api.MusNotificationApiManager;
import com.ss.android.ugc.aweme.profile.model.User;
import webcast.data.AppealInfo;
import webcast.data.RealtimeViolationRecord;

/* loaded from: classes14.dex */
public class ACListenerS34S0400000_13 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS34S0400000_13 aCListenerS34S0400000_13, View view) {
        String str;
        User LJJJJ = C78977Uz7.LJJJJ((MusNotice) aCListenerS34S0400000_13.l0);
        if (LJJJJ != null) {
            str = LJJJJ.getUid();
        } else {
            str = null;
        }
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String accountType = ((MusNotice) aCListenerS34S0400000_13.l0).getAccountType();
        if (accountType != null) {
            str2 = accountType;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "message");
        c188727au.LJIIIZ("account_type", str2);
        c188727au.LJIIIZ("to_user_id", str);
        FMX.LJIIL("click_ignore", c188727au.LIZ);
        LinkBusinessExtra linkBusinessExtra = (LinkBusinessExtra) aCListenerS34S0400000_13.l1;
        if (linkBusinessExtra != null) {
            C2S9 c2s9 = (C2S9) aCListenerS34S0400000_13.l3;
            MusNotificationApiManager.LJI(linkBusinessExtra.linkId).LJIILIIL(T16.LIZ()).LJII(C73969T1h.LIZIZ()).LJIIJ(C78980UzA.LJLIL, new IDaS222S0100000_13(c2s9, 17));
        }
        ((InterfaceC78981UzB) aCListenerS34S0400000_13.l2).LIZJ();
    }

    public static final void onClick$1(ACListenerS34S0400000_13 aCListenerS34S0400000_13, View view) {
        String str;
        String str2;
        PunishEventInfo punishEventInfo = ((RealtimeViolationRecord) aCListenerS34S0400000_13.l0).punishInfo;
        if (punishEventInfo != null && (str = punishEventInfo.punishId) != null) {
            long parseLong = CastLongProtector.parseLong(str);
            RealtimeViolationRecord realtimeViolationRecord = (RealtimeViolationRecord) aCListenerS34S0400000_13.l0;
            PunishEventInfo punishEventInfo2 = realtimeViolationRecord.punishInfo;
            if (punishEventInfo2 == null || (str2 = punishEventInfo2.punishType) == null) {
                return;
            }
            UEQ ueq = (UEQ) aCListenerS34S0400000_13.l1;
            if (ueq.LJLJJLL || ((AppealInfo) aCListenerS34S0400000_13.l2).appealStatus != 0) {
                return;
            }
            ueq.LJLLLLLL(realtimeViolationRecord);
            UEQ ueq2 = (UEQ) aCListenerS34S0400000_13.l1;
            ueq2.LJLJJLL = true;
            C05260Io c05260Io = PerceptionAppealApi.LIZ;
            C12510eN c12510eN = new C12510eN(2, C29306Beo.LJJIZ(ueq2.LJLILLLLZI), parseLong, str2);
            c05260Io.getClass();
            AbstractC73672Svk LIZ = C1EW.LIZ(C05260Io.LIZ(c12510eN));
            UEQ ueq3 = (UEQ) aCListenerS34S0400000_13.l1;
            LIZ.LJJJLIIL(new AfS24S0400000_13(ueq3, (AppealInfo) aCListenerS34S0400000_13.l2, (UER) aCListenerS34S0400000_13.l3, (RealtimeViolationRecord) aCListenerS34S0400000_13.l0, 8), new AfS65S0100000_13(ueq3, 175));
        }
    }

    public ACListenerS34S0400000_13(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}

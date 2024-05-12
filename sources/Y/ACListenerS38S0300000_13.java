package Y;

import X.AnonymousClass172;
import X.B83;
import X.BZI;
import X.C162476Zf;
import X.C19980qQ;
import X.C28787BRn;
import X.C29044Baa;
import X.C29374Bfu;
import X.C2A7;
import X.C31413CUn;
import X.C32004ChE;
import X.C73098SmU;
import X.C74824TYe;
import X.C75432Tj2;
import X.C75433Tj3;
import X.C75434Tj4;
import X.C75525TkX;
import X.C75648TmW;
import X.C75984Trw;
import X.C76032Tsi;
import X.C76040Tsq;
import X.C76044Tsu;
import X.C76045Tsv;
import X.C76046Tsw;
import X.C76051Tt1;
import X.C76052Tt2;
import X.C76053Tt3;
import X.C76060TtA;
import X.C76062TtC;
import X.C76065TtF;
import X.C76199TvP;
import X.C76202TvS;
import X.EnumC76210Tva;
import X.InterfaceC30442Bx8;
import X.InterfaceC76066TtG;
import X.InterfaceC88471Ynr;
import X.UFE;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.SendGiftEvent;
import com.bytedance.android.live.liveinteract.linkroom.widget.LinkControlWidget;
import com.bytedance.android.livesdk.model.message.LinkMicAnchorGuideMessage;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdk.sheet.TextIconItem;
import com.bytedance.android.livesdk.survey.model.SurveyOption;
import com.bytedance.android.livesdk.survey.model.SurveyQuestion;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class ACListenerS38S0300000_13 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            case 4:
                onClick$4(this, view);
                return;
            case 5:
                onClick$5(this, view);
                return;
            case 6:
                onClick$6(this, view);
                return;
            case 7:
                onClick$7(this, view);
                return;
            case 8:
                onClick$8(this, view);
                return;
            case 9:
                onClick$9(this, view);
                return;
            case 10:
                onClick$10(this, view);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onClick$11(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS38S0300000_13 aCListenerS38S0300000_13, View view) {
        int i;
        InterfaceC30442Bx8.LLILII.LIZJ(Double.valueOf(5.0d));
        C76062TtC c76062TtC = (C76062TtC) aCListenerS38S0300000_13.l0;
        C76060TtA c76060TtA = (C76060TtA) aCListenerS38S0300000_13.l1;
        c76062TtC.getClass();
        BZI LIZ = C28787BRn.LIZ("livesdk_cohost_guide_close");
        if (!c76060TtA.LJLILLLLZI) {
            i = 1;
        } else {
            i = 2;
        }
        UFE.LIZIZ(i, LIZ, "cohost_guide_type");
        C76062TtC c76062TtC2 = (C76062TtC) aCListenerS38S0300000_13.l0;
        InterfaceC76066TtG interfaceC76066TtG = c76062TtC2.LIZLLL;
        if (interfaceC76066TtG != null) {
            RecyclerView recyclerView = c76062TtC2.LIZJ;
            View view2 = ((C76065TtF) aCListenerS38S0300000_13.l2).itemView;
            recyclerView.getClass();
            interfaceC76066TtG.pd(RecyclerView.LJJJJIZL(view2));
        }
    }

    public static final void onClick$1(ACListenerS38S0300000_13 aCListenerS38S0300000_13, View view) {
        C75433Tj3 c75433Tj3;
        view.setSelected(true);
        C31413CUn c31413CUn = ((C75432Tj2) aCListenerS38S0300000_13.l0).LIZ;
        Long l = null;
        if ((c31413CUn instanceof C75433Tj3) && (c75433Tj3 = (C75433Tj3) c31413CUn) != null) {
            int layoutPosition = ((C75434Tj4) aCListenerS38S0300000_13.l1).getLayoutPosition();
            LinkListUser linkListUser = (LinkListUser) aCListenerS38S0300000_13.l2;
            o.LJIIIZ(linkListUser, "linkListUser");
            c75433Tj3.notifyItemChanged(c75433Tj3.LJLJLLL, 0);
            Object obj = ListProtector.get(c75433Tj3.LJLIL, layoutPosition);
            o.LJII(obj, "null cannot be cast to non-null type com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser");
            c75433Tj3.LJZI((LinkListUser) obj);
            c75433Tj3.LJLJLLL = layoutPosition;
            if (c75433Tj3.LJLJI.isShowing()) {
                c75433Tj3.LJLJI.dismiss();
            }
            User user = linkListUser.user;
            if (user != null) {
                C32004ChE c32004ChE = new C32004ChE(user);
                c32004ChE.LIZIZ = c75433Tj3.LJLJLJ;
                c32004ChE.LJI = true;
                DataChannel dataChannel = c75433Tj3.LJLJJLL;
                if (dataChannel != null) {
                    dataChannel.qv0(SendGiftEvent.class, c32004ChE);
                }
            }
            c75433Tj3.LJZI(linkListUser);
            User user2 = linkListUser.user;
            String str = c75433Tj3.LJLJLJ;
            long j = linkListUser.fanTicket;
            HashMap LIZLLL = C73098SmU.LIZLLL();
            if (str != null) {
                LIZLLL.put("gift_enter_from", str);
            }
            User LJ = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
            o.LJIIIIZZ(LJ, "getInstance().user().currentUserOpt");
            LIZLLL.put("user_type", C74824TYe.LJIILL(LJ));
            if (user2 != null) {
                LIZLLL.put("to_user_type", C74824TYe.LJIILL(user2));
                l = Long.valueOf(user2.getId());
            }
            LIZLLL.put("to_user_id", String.valueOf(l));
            LIZLLL.put("charm_values", String.valueOf(j));
            C74824TYe.LJLL("livesdk_gift_recipient_click", LIZLLL);
        }
    }

    public static final void onClick$10(ACListenerS38S0300000_13 aCListenerS38S0300000_13, View view) {
        ((C76044Tsu) aCListenerS38S0300000_13.l0).LIZIZ.T7(((C76046Tsw) aCListenerS38S0300000_13.l1).LJLJI);
        ((C76044Tsu) aCListenerS38S0300000_13.l0).LJI((C76045Tsv) aCListenerS38S0300000_13.l2, (C76046Tsw) aCListenerS38S0300000_13.l1);
    }

    public static final void onClick$11(ACListenerS38S0300000_13 aCListenerS38S0300000_13, View view) {
        ((C76044Tsu) aCListenerS38S0300000_13.l0).LIZIZ.T7(((C76046Tsw) aCListenerS38S0300000_13.l1).LJLJI);
        ((C76044Tsu) aCListenerS38S0300000_13.l0).LJI((C76045Tsv) aCListenerS38S0300000_13.l2, (C76046Tsw) aCListenerS38S0300000_13.l1);
    }

    public static final void onClick$2(ACListenerS38S0300000_13 aCListenerS38S0300000_13, View view) {
        ((InterfaceC88471Ynr) aCListenerS38S0300000_13.l0).invoke((TextIconItem) aCListenerS38S0300000_13.l1, (View) aCListenerS38S0300000_13.l2);
    }

    public static final void onClick$3(ACListenerS38S0300000_13 aCListenerS38S0300000_13, View view) {
        InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) aCListenerS38S0300000_13.l0;
        String str = ((SurveyQuestion) aCListenerS38S0300000_13.l1).questionId;
        o.LJIIIIZZ(str, "question.questionId");
        interfaceC88471Ynr.invoke(str, Long.valueOf(((SurveyOption) aCListenerS38S0300000_13.l2).optionId));
    }

    public static final void onClick$4(ACListenerS38S0300000_13 aCListenerS38S0300000_13, View view) {
        ((LinkControlWidget) ((C75525TkX) aCListenerS38S0300000_13.l0).LJLIL).LLIIII((C75648TmW) aCListenerS38S0300000_13.l1, ((LinkMicAnchorGuideMessage) aCListenerS38S0300000_13.l2).reserveInfo);
        C19980qQ.LIZ(((C75525TkX) aCListenerS38S0300000_13.l0).LJFF());
    }

    public static final void onClick$5(ACListenerS38S0300000_13 aCListenerS38S0300000_13, View view) {
        ((LinkControlWidget) ((C75525TkX) aCListenerS38S0300000_13.l0).LJLIL).LLIIII((C75648TmW) aCListenerS38S0300000_13.l1, ((LinkMicAnchorGuideMessage) aCListenerS38S0300000_13.l2).reserveInfo);
        C19980qQ.LIZ(((C75525TkX) aCListenerS38S0300000_13.l0).LJFF());
    }

    public static final void onClick$6(ACListenerS38S0300000_13 aCListenerS38S0300000_13, View view) {
        ((C76052Tt2) aCListenerS38S0300000_13.l0).LIZIZ.Z6(((C76051Tt1) aCListenerS38S0300000_13.l1).LJLIL);
        ((C76052Tt2) aCListenerS38S0300000_13.l0).LJI((C76053Tt3) aCListenerS38S0300000_13.l2, (C76051Tt1) aCListenerS38S0300000_13.l1);
    }

    public static final void onClick$7(ACListenerS38S0300000_13 aCListenerS38S0300000_13, View view) {
        String str;
        Long l;
        C76052Tt2 c76052Tt2 = (C76052Tt2) aCListenerS38S0300000_13.l0;
        C76051Tt1 c76051Tt1 = (C76051Tt1) aCListenerS38S0300000_13.l1;
        c76052Tt2.getClass();
        int i = C76040Tsq.LIZIZ[c76051Tt1.LJLIL.ordinal()];
        if (i != 1) {
            if (i == 2) {
                str = "recommend";
            } else {
                throw new C162476Zf();
            }
        } else {
            str = "mutual_follow";
        }
        HashMap hashMap = new HashMap();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        Long l2 = null;
        if (room != null) {
            l = Long.valueOf(room.getOwnerUserId());
        } else {
            l = null;
        }
        hashMap.put("anchor_id", String.valueOf(l));
        if (room != null) {
            l2 = Long.valueOf(room.getId());
        }
        hashMap.put("room_id", String.valueOf(l2));
        hashMap.put("invitee_list", str);
        AnonymousClass172.LIZ("livesdk_connection_mutual_see_more", hashMap);
        ((C76052Tt2) aCListenerS38S0300000_13.l0).LIZIZ.Z6(((C76051Tt1) aCListenerS38S0300000_13.l1).LJLIL);
        ((C76052Tt2) aCListenerS38S0300000_13.l0).LJI((C76053Tt3) aCListenerS38S0300000_13.l2, (C76051Tt1) aCListenerS38S0300000_13.l1);
    }

    public static final void onClick$8(ACListenerS38S0300000_13 aCListenerS38S0300000_13, View view) {
        C76202TvS c76202TvS = (C76202TvS) aCListenerS38S0300000_13.l0;
        C76202TvS c76202TvS2 = (C76202TvS) aCListenerS38S0300000_13.l1;
        C76032Tsi c76032Tsi = (C76032Tsi) aCListenerS38S0300000_13.l2;
        c76202TvS.getClass();
        if (c76202TvS2.LJLLL == EnumC76210Tva.WAIT_FOR_ME) {
            return;
        }
        c76202TvS2.Q().setEnabled(false);
        c76202TvS.LJLLLLLL.LJ.LLLIILIL(c76032Tsi);
    }

    public static final void onClick$9(ACListenerS38S0300000_13 aCListenerS38S0300000_13, View view) {
        C76199TvP c76199TvP = (C76199TvP) aCListenerS38S0300000_13.l0;
        C76199TvP c76199TvP2 = (C76199TvP) aCListenerS38S0300000_13.l1;
        C75984Trw c75984Trw = (C75984Trw) aCListenerS38S0300000_13.l2;
        c76199TvP.getClass();
        if (c76199TvP2.LJZ == EnumC76210Tva.WAIT_FOR_ME) {
            return;
        }
        C2A7 Q = c76199TvP2.Q();
        if (Q != null) {
            Q.setEnabled(false);
        }
        c76199TvP.LJZL.LJ.LLLLLLLLLL(c75984Trw);
    }

    public ACListenerS38S0300000_13(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}

package Y;

import X.C1039946h;
import X.C105254Bd;
import X.C105264Be;
import X.C105274Bf;
import X.C105284Bg;
import X.C105294Bh;
import X.C105304Bi;
import X.C106104Ek;
import X.C106674Gp;
import X.C109544Rq;
import X.C113554cx;
import X.C113794dL;
import X.C113804dM;
import X.C113844dQ;
import X.C113854dR;
import X.C113864dS;
import X.C113914dX;
import X.C116754i7;
import X.C1HQ;
import X.C251669uE;
import X.C2U8;
import X.C3H6;
import X.C3Q9;
import X.C3XA;
import X.C46U;
import X.C46W;
import X.C4FU;
import X.C4FX;
import X.C4FZ;
import X.C4GZ;
import X.C4WC;
import X.C62387Oe7;
import X.C62468OfQ;
import X.C62846OlW;
import X.C63120Opw;
import X.C63219OrX;
import X.C6ZT;
import X.C73969T1h;
import X.C75782yE;
import X.C76800UCe;
import X.C772831o;
import X.C80353Dj;
import X.C85323Wm;
import X.C85453Wz;
import X.C85513Xf;
import X.C89913fv;
import X.C98583tu;
import X.EnumC106114El;
import X.EnumC106134En;
import X.EnumC106174Er;
import X.InterfaceC113814dN;
import X.InterfaceC116774i9;
import X.InterfaceC62225ObV;
import X.InterfaceC64592gB;
import X.InterfaceC86963bA;
import X.InterfaceC88471Ynr;
import X.ORZ;
import X.OSZ;
import X.T16;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcMixBitrateSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.feed.prompt.data.PromptStruct;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.model.ActionBarButtonConf;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reaction.reactionlist.IMReactionListSheetViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.suggestedreply.SuggestedReplyViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.suggestedreply.data.SuggestedReply;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.userservice.UserService;
import com.ss.android.ugc.aweme.userservice.api.IUserService;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class ACListenerS19S0201000_1 implements View.OnClickListener {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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

    public static final void onClick$0(ACListenerS19S0201000_1 aCListenerS19S0201000_1, View view) {
        boolean LIZ;
        BaseSharePackage baseSharePackage;
        LIZ = C251669uE.LIZ(view, LinkMicRtcMixBitrateSetting.DEFAULT);
        if (LIZ) {
            return;
        }
        C62387Oe7 c62387Oe7 = ((C113914dX) aCListenerS19S0201000_1.l1).LJLJL;
        if (c62387Oe7 != null) {
            baseSharePackage = c62387Oe7.LJIIJ;
        } else {
            baseSharePackage = null;
        }
        C62468OfQ.LJFF(baseSharePackage, (InterfaceC62225ObV) ListProtector.get((List) aCListenerS19S0201000_1.l0, aCListenerS19S0201000_1.i2), C62468OfQ.LJIJ);
        InterfaceC113814dN interfaceC113814dN = ((C113914dX) aCListenerS19S0201000_1.l1).LJLJJL;
        if (interfaceC113814dN != null) {
            interfaceC113814dN.LJIIIZ((InterfaceC62225ObV) ListProtector.get((List) aCListenerS19S0201000_1.l0, aCListenerS19S0201000_1.i2), view);
        }
    }

    public static final void onClick$1(ACListenerS19S0201000_1 aCListenerS19S0201000_1, View it) {
        boolean LIZ;
        LIZ = C251669uE.LIZ(it, LinkMicRtcMixBitrateSetting.DEFAULT);
        if (LIZ) {
            return;
        }
        C62468OfQ.LJFF(((C113854dR) aCListenerS19S0201000_1.l0).LJLLI, ((C113864dS) aCListenerS19S0201000_1.l1).LJLJI, C62468OfQ.LJIJ);
        C113854dR c113854dR = (C113854dR) aCListenerS19S0201000_1.l0;
        c113854dR.LJLJJLL.LJIIIZ((InterfaceC62225ObV) ListProtector.get(c113854dR.LJLIL, aCListenerS19S0201000_1.i2), it);
        o.LJIIIIZZ(it, "it");
        Context context = it.getContext();
        o.LJIIIIZZ(context, "it.context");
        C2U8.LIZ(new C113844dQ(context, (InterfaceC62225ObV) ListProtector.get(((C113854dR) aCListenerS19S0201000_1.l0).LJLIL, aCListenerS19S0201000_1.i2)));
    }

    public static final void onClick$10(ACListenerS19S0201000_1 aCListenerS19S0201000_1, View view) {
        InterfaceC116774i9 interfaceC116774i9 = ((C116754i7) aCListenerS19S0201000_1.l0).LJLILLLLZI;
        if (interfaceC116774i9 != null) {
            interfaceC116774i9.LIZ((PromptStruct) aCListenerS19S0201000_1.l1, aCListenerS19S0201000_1.i2);
        }
    }

    public static final void onClick$11(ACListenerS19S0201000_1 aCListenerS19S0201000_1, View view) {
        InterfaceC88471Ynr<IMUser, Integer, C76800UCe> interfaceC88471Ynr = ((C3XA) aCListenerS19S0201000_1.l0).LJLJI;
        if (interfaceC88471Ynr != null) {
            interfaceC88471Ynr.invoke(((C3H6) aCListenerS19S0201000_1.l1).LJLIL, Integer.valueOf(aCListenerS19S0201000_1.i2));
        }
    }

    public static final void onClick$2(ACListenerS19S0201000_1 aCListenerS19S0201000_1, View it) {
        boolean LIZ;
        LIZ = C251669uE.LIZ(it, LinkMicRtcMixBitrateSetting.DEFAULT);
        if (LIZ) {
            return;
        }
        C62468OfQ.LJFF(((C113794dL) aCListenerS19S0201000_1.l0).LJLJL, ((C113804dM) aCListenerS19S0201000_1.l1).LJLJI, C62468OfQ.LJIJ);
        C113794dL c113794dL = (C113794dL) aCListenerS19S0201000_1.l0;
        c113794dL.LJLJI.LJIIIZ((InterfaceC62225ObV) ListProtector.get(c113794dL.LJLIL, aCListenerS19S0201000_1.i2), it);
        o.LJIIIIZZ(it, "it");
        Context context = it.getContext();
        o.LJIIIIZZ(context, "it.context");
        C2U8.LIZ(new C113844dQ(context, (InterfaceC62225ObV) ListProtector.get(((C113794dL) aCListenerS19S0201000_1.l0).LJLIL, aCListenerS19S0201000_1.i2)));
    }

    public static final void onClick$3(ACListenerS19S0201000_1 aCListenerS19S0201000_1, View view) {
        C62846OlW c62846OlW = ((C105284Bg) aCListenerS19S0201000_1.l0).LJLIL;
        if (c62846OlW != null) {
            if (c62846OlW.isSelected()) {
                return;
            }
            ((C105274Bf) aCListenerS19S0201000_1.l1).LJLIL.LIZLLL(aCListenerS19S0201000_1.i2);
            return;
        }
        o.LJIJI("tabIv");
        throw null;
    }

    public static final void onClick$4(ACListenerS19S0201000_1 aCListenerS19S0201000_1, View view) {
        TextView textView = ((C105294Bh) aCListenerS19S0201000_1.l0).LJLIL;
        if (textView != null) {
            if (textView.isSelected()) {
                return;
            }
            ((C105274Bf) aCListenerS19S0201000_1.l1).LJLIL.LIZLLL(aCListenerS19S0201000_1.i2);
            return;
        }
        o.LJIJI("tabIv");
        throw null;
    }

    public static final void onClick$5(ACListenerS19S0201000_1 aCListenerS19S0201000_1, View view) {
        if (((C105264Be) aCListenerS19S0201000_1.l0).itemView.isSelected()) {
            return;
        }
        ((C105254Bd) aCListenerS19S0201000_1.l1).LJLIL.LIZLLL(aCListenerS19S0201000_1.i2);
    }

    public static final void onClick$6(ACListenerS19S0201000_1 aCListenerS19S0201000_1, View view) {
        TextView textView = ((C105304Bi) aCListenerS19S0201000_1.l0).LJLIL;
        if (textView != null) {
            if (textView.isSelected()) {
                return;
            }
            ((C105254Bd) aCListenerS19S0201000_1.l1).LJLIL.LIZLLL(aCListenerS19S0201000_1.i2);
            return;
        }
        o.LJIJI("tabIv");
        throw null;
    }

    public static final void onClick$7(ACListenerS19S0201000_1 aCListenerS19S0201000_1, View view) {
        int i;
        final C89913fv c89913fv = (C89913fv) aCListenerS19S0201000_1.l0;
        final IMUser user = (IMUser) aCListenerS19S0201000_1.l1;
        final int i2 = aCListenerS19S0201000_1.i2;
        final List<IMUser> userList = c89913fv.LJLJI;
        final C85513Xf adapter = c89913fv.LJLILLLLZI;
        o.LJIIIZ(user, "user");
        o.LJIIIZ(userList, "userList");
        o.LJIIIZ(adapter, "adapter");
        if (user.getFollowStatus() == 0) {
            i = 1;
        } else {
            i = 0;
        }
        IUserService LIZ = UserService.LIZ();
        o.LJIIIIZZ(LIZ, "get()\n                .g…IUserService::class.java)");
        String uid = user.getUid();
        o.LJIIIIZZ(uid, "user.uid");
        String secUid = user.getSecUid();
        o.LJIIIIZZ(secUid, "user.secUid");
        adapter.LJLILLLLZI.LIZ(LIZ.LJI(i, -1, 0, -1, uid, secUid, "", null).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJJII(new InterfaceC64592gB() { // from class: X.3Dn
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                String str;
                FollowStatus followStatus = (FollowStatus) obj;
                if (followStatus != null) {
                    IMUser.this.setFollowStatus(followStatus.followStatus);
                    List<? extends IMUser> LLJILJILJ = ORZ.LLJILJILJ(userList);
                    ListProtector.set(LLJILJILJ, i2, IMUser.this);
                    C85513Xf c85513Xf = adapter;
                    c85513Xf.getClass();
                    c85513Xf.LJLIL = LLJILJILJ;
                    adapter.notifyDataSetChanged();
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("enter_from", "qa_personal_profile");
                    if (IMUser.this.getFollowStatus() == 0) {
                        str = "follow";
                    } else {
                        str = "unfollow";
                    }
                    FMX.LJIIL(str, c188727au.LIZ);
                    return;
                }
                C89913fv c89913fv2 = c89913fv;
                c89913fv2.getClass();
                C26045AKb c26045AKb = new C26045AKb(c89913fv2.LJLIL);
                c26045AKb.LJIIIIZZ(R.string.rf3);
                c26045AKb.LIZLLL(3000L);
                c26045AKb.LJIIJ();
            }
        }, new AfS53S0100000_1(c89913fv, 75)));
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [X.3Dk] */
    public static final void onClick$8(ACListenerS19S0201000_1 aCListenerS19S0201000_1, View view) {
        String str;
        if (C6ZT.LIZ(view)) {
            return;
        }
        Object tag = view.getTag();
        if (o.LJ(tag, 0)) {
            ((C85453Wz) aCListenerS19S0201000_1.l0).LJLIL.gv0(((C80353Dj) aCListenerS19S0201000_1.l1).LJLILLLLZI);
            return;
        }
        if (!o.LJ(tag, 1)) {
            return;
        }
        C85453Wz c85453Wz = (C85453Wz) aCListenerS19S0201000_1.l0;
        int i = aCListenerS19S0201000_1.i2;
        if (ORZ.LJLLLLLL(i, c85453Wz.LJLILLLLZI) == null) {
            return;
        }
        IMReactionListSheetViewModel iMReactionListSheetViewModel = c85453Wz.LJLIL;
        iMReactionListSheetViewModel.getClass();
        C3Q9.LIZ.getClass();
        C75782yE.LIZ();
        C4WC c4wc = C4WC.LIZIZ;
        C109544Rq c109544Rq = iMReactionListSheetViewModel.LJLIL;
        if (c109544Rq != null) {
            C63120Opw LIZ = c4wc.LIZ(c109544Rq.getConversationId());
            if (LIZ != null && (str = iMReactionListSheetViewModel.LJLILLLLZI) != null) {
                C109544Rq c109544Rq2 = iMReactionListSheetViewModel.LJLIL;
                if (c109544Rq2 != null) {
                    C106674Gp.LIZ(c109544Rq2, iMReactionListSheetViewModel.LJLJI, LIZ, str, new InterfaceC86963bA<C63219OrX>() { // from class: X.3Dk
                        @Override // X.InterfaceC86963bA
                        public final void LIZIZ(C63623Oy3 error) {
                            o.LJIIIZ(error, "error");
                            C34B.LJI("MessageReactionListSheetViewModel", "remove reaction onFailure");
                        }

                        @Override // X.InterfaceC86963bA
                        public final void onSuccess(C63219OrX c63219OrX) {
                            C34B.LJI("MessageReactionListSheetViewModel", "remove reaction onSuccess");
                        }
                    });
                } else {
                    o.LJIJI("message");
                    throw null;
                }
            }
            iMReactionListSheetViewModel.LJLJJL.postValue(Boolean.TRUE);
            ListProtector.remove(c85453Wz.LJLILLLLZI, i);
            c85453Wz.notifyItemRemoved(i);
            return;
        }
        o.LJIJI("message");
        throw null;
    }

    public static final void onClick$9(ACListenerS19S0201000_1 aCListenerS19S0201000_1, View view) {
        Map map;
        HashMap hashMap;
        C109544Rq c109544Rq;
        List<SuggestedReply> list;
        C109544Rq c109544Rq2;
        Context context = ((C106104Ek) aCListenerS19S0201000_1.l0).LJLILLLLZI.getContext();
        if (context == null) {
            return;
        }
        if (aCListenerS19S0201000_1.i2 == EnumC106114El.VIDEO_SHARE.getValue() && C6ZT.LIZ(((C106104Ek) aCListenerS19S0201000_1.l0).LJLJI)) {
            return;
        }
        Integer type = ((ActionBarButtonConf) aCListenerS19S0201000_1.l1).getType();
        int value = EnumC106114El.NUDGE.getValue();
        if (type == null || type.intValue() != value) {
            int value2 = EnumC106114El.NUDGE_BACK.getValue();
            if (type == null || type.intValue() != value2) {
                SmartRoute buildRoute = SmartRouter.buildRoute(context, ((ActionBarButtonConf) aCListenerS19S0201000_1.l1).getActionSchema());
                buildRoute.withParam("enter_from", ((C106104Ek) aCListenerS19S0201000_1.l0).LJLJJI.getEnterFromForMob());
                buildRoute.withParam("enter_method", ((C106104Ek) aCListenerS19S0201000_1.l0).LJLJJI.getEnterMethod());
                buildRoute.withParam("search_id", ((C106104Ek) aCListenerS19S0201000_1.l0).LJLJJI.getSearchId());
                Map<String, String> botSendParams = ((C106104Ek) aCListenerS19S0201000_1.l0).LJLJJI.getBotSendParams();
                if (botSendParams != null) {
                    map = C113554cx.LJJLIL(botSendParams);
                } else {
                    map = null;
                }
                if (map instanceof HashMap) {
                    hashMap = (HashMap) map;
                } else {
                    hashMap = null;
                }
                if (hashMap != null) {
                    buildRoute.withParam("send_params", hashMap);
                }
                Integer type2 = ((ActionBarButtonConf) aCListenerS19S0201000_1.l1).getType();
                int value3 = EnumC106114El.SUGGESTED_REPLY.getValue();
                if (type2 != null && type2.intValue() == value3) {
                    buildRoute.withParam("send_params", C113554cx.LJJJLZIJ(new OSZ("a:src", "action_bar:suggested_reply")));
                    SuggestedReplyViewModel suggestedReplyViewModel = (SuggestedReplyViewModel) ((C106104Ek) aCListenerS19S0201000_1.l0).LJLL.getValue();
                    if (suggestedReplyViewModel == null || (c109544Rq = suggestedReplyViewModel.LJLJJL) == null) {
                        return;
                    }
                    String LIZJ = C98583tu.LIZJ(((C106104Ek) aCListenerS19S0201000_1.l0).LJLJJI);
                    C46W c46w = C46W.LIZ;
                    C106104Ek c106104Ek = (C106104Ek) aCListenerS19S0201000_1.l0;
                    Integer valueOf = Integer.valueOf(aCListenerS19S0201000_1.i2);
                    String title = ((ActionBarButtonConf) aCListenerS19S0201000_1.l1).getTitle();
                    c106104Ek.getClass();
                    String M = C106104Ek.M(valueOf, title);
                    SuggestedReplyViewModel suggestedReplyViewModel2 = (SuggestedReplyViewModel) ((C106104Ek) aCListenerS19S0201000_1.l0).LJLL.getValue();
                    if (suggestedReplyViewModel2 != null) {
                        list = suggestedReplyViewModel2.jv0(c109544Rq);
                    } else {
                        list = null;
                    }
                    c46w.LIZ(LIZJ, c109544Rq, "action_bar", M, C46U.LJIIJJI(list), null);
                    SuggestedReplyViewModel suggestedReplyViewModel3 = (SuggestedReplyViewModel) ((C106104Ek) aCListenerS19S0201000_1.l0).LJLL.getValue();
                    if (suggestedReplyViewModel3 != null && (c109544Rq2 = suggestedReplyViewModel3.LJLJJL) != null) {
                        suggestedReplyViewModel3.LJLJLJ.remove(Long.valueOf(c109544Rq2.getMsgId()));
                        suggestedReplyViewModel3.LJLIL.LIZ(c109544Rq2);
                        suggestedReplyViewModel3.LJLILLLLZI.setValue(C1039946h.LIZ);
                        suggestedReplyViewModel3.LJLJJL = null;
                    }
                }
                buildRoute.open();
            } else {
                String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(((ActionBarButtonConf) aCListenerS19S0201000_1.l1).getActionSchema()), "conversation_id");
                if (queryParameter == null) {
                    return;
                } else {
                    C4FU.LJIIIIZZ(C4GZ.CHAT, true, queryParameter, new C4FX(null, null, new C4FZ(EnumC106174Er.QUICK_REACTION.getValue(), EnumC106134En.NUDGE_BACK.getValue()), null, 11));
                }
            }
        } else {
            String queryParameter2 = UriProtector.getQueryParameter(UriProtector.parse(((ActionBarButtonConf) aCListenerS19S0201000_1.l1).getActionSchema()), "conversation_id");
            if (queryParameter2 == null) {
                return;
            } else {
                C4FU.LJIIIIZZ(C4GZ.CHAT, false, queryParameter2, new C4FX(null, null, new C4FZ(EnumC106174Er.QUICK_REACTION.getValue(), EnumC106134En.NUDGE.getValue()), null, 11));
            }
        }
        C106104Ek c106104Ek2 = (C106104Ek) aCListenerS19S0201000_1.l0;
        Integer valueOf2 = Integer.valueOf(aCListenerS19S0201000_1.i2);
        String title2 = ((ActionBarButtonConf) aCListenerS19S0201000_1.l1).getTitle();
        c106104Ek2.getClass();
        String M2 = C106104Ek.M(valueOf2, title2);
        if (M2 == null) {
            M2 = "";
        }
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ c1hq = new C1HQ();
        c1hq.put("enter_from", "chat");
        c1hq.put("interaction_name", M2);
        onEventV3.LIZIZ("quick_interaction_click", c1hq);
    }

    public ACListenerS19S0201000_1(Object obj, Object obj2, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.i2 = i;
    }
}

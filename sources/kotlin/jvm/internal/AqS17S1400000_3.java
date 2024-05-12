package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.AnonymousClass780;
import X.C183027Gg;
import X.C184077Kh;
import X.C1EU;
import X.C1FP;
import X.C214378bB;
import X.C214528bQ;
import X.C40328FsC;
import X.C48203Ivv;
import X.C55096Ljo;
import X.C65352Pkq;
import X.C73969T1h;
import X.C76800UCe;
import X.C78926UyI;
import X.C7H1;
import X.C7H2;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.T16;
import Y.AfS15S1200000_3;
import Y.AfS55S0100000_3;
import android.content.Context;
import android.net.Uri;
import com.bytedance.provider.impl.GScope;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.compliance.api.model.PolicyBodyLinkList;
import com.ss.android.ugc.aweme.compliance.api.model.PolicyNoticeAction;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteCacheState;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.upvote.IRepostListAbility;
import com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam;
import com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM;
import com.zhiliaoapp.musically.R;
import java.util.Map;

/* loaded from: classes4.dex */
public class AqS17S1400000_3 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS17S1400000_3 aqS17S1400000_3) {
        String str;
        Uri.Builder LIZIZ = C1EU.LIZIZ(aqS17S1400000_3.s0, "use_spark", "1");
        PolicyBodyLinkList policyBodyLinkList = (PolicyBodyLinkList) aqS17S1400000_3.l1;
        if (policyBodyLinkList == null || (str = policyBodyLinkList.getName()) == null) {
            str = "";
        }
        String uri = LIZIZ.appendQueryParameter("title", str).build().toString();
        o.LJIIIIZZ(uri, "parse(policyLink).buildU…      .build().toString()");
        SmartRouter.buildRoute((Context) aqS17S1400000_3.l2, uri).open();
        PolicyBodyLinkList policyBodyLinkList2 = (PolicyBodyLinkList) aqS17S1400000_3.l1;
        if (policyBodyLinkList2 != null && o.LJ(policyBodyLinkList2.getApprove(), Boolean.TRUE)) {
            ((InterfaceC88472Yns) aqS17S1400000_3.l3).invoke(new PolicyNoticeAction(null, false, null, null, ((PolicyBodyLinkList) aqS17S1400000_3.l1).getExtra(), false, ((PolicyBodyLinkList) aqS17S1400000_3.l1).getOperation(), null, null, null, null, 1967, null));
        }
        PolicyBodyLinkList policyBodyLinkList3 = (PolicyBodyLinkList) aqS17S1400000_3.l1;
        if (policyBodyLinkList3 != null && o.LJ(policyBodyLinkList3.getDismiss(), Boolean.TRUE)) {
            ((InterfaceC65784Pro) aqS17S1400000_3.l4).invoke();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS17S1400000_3 aqS17S1400000_3) {
        UpvoteStruct LJIIIIZZ;
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) aqS17S1400000_3.l1;
        String itemId = aqS17S1400000_3.s0;
        UpvotePublishMobParam upvotePublishMobParam = (UpvotePublishMobParam) aqS17S1400000_3.l3;
        Map map = (Map) aqS17S1400000_3.l4;
        if (!C48203Ivv.LJ(activityC45651qj)) {
            C40328FsC.LIZLLL(activityC45651qj, R.string.cph);
        } else {
            UpvotePublishVM upvotePublishVM = (UpvotePublishVM) new C214378bB(C65352Pkq.LIZ(UpvotePublishVM.class), null, C214528bQ.LJLIL, C78926UyI.LJJII(activityC45651qj, false), C184077Kh.LJLIL, C183027Gg.INSTANCE, C78926UyI.LJIIJJI(activityC45651qj), C78926UyI.LJIILL(activityC45651qj)).getValue();
            AqS134S0200000_3 aqS134S0200000_3 = new AqS134S0200000_3(activityC45651qj, map, 296);
            AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(activityC45651qj, 1742);
            o.LJIIIZ(itemId, "itemId");
            UpvoteList LIZ = C7H2.LIZ(itemId);
            if (LIZ != null && (LJIIIIZZ = C1FP.LJIIIIZZ(LIZ)) != null) {
                AqS17S1400000_3 aqS17S1400000_32 = new AqS17S1400000_3(aqS134S0200000_3, LJIIIIZZ, itemId, upvotePublishVM, upvotePublishMobParam, 2);
                if (LJIIIIZZ.getCacheState() == UpvoteCacheState.PUBLISH_FAILED) {
                    aqS17S1400000_32.invoke();
                } else {
                    C7H1.LJIILJJIL(itemId, UpvoteCacheState.PRE_REMOVE);
                    upvotePublishVM.disposeOnClear(upvotePublishVM.iv0().getOperator().deleteUpvote(itemId).LJIL(1L).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS55S0100000_3(aqS17S1400000_32, 79), new AfS15S1200000_3(aqS153S0100000_3, upvotePublishVM, itemId, 3)));
                }
            }
        }
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aqS17S1400000_3.l2;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
            return C76800UCe.LIZ;
        }
        return null;
    }

    public static final Object invoke$2(AqS17S1400000_3 aqS17S1400000_3) {
        String str;
        ((InterfaceC88472Yns) aqS17S1400000_3.l1).invoke((UpvoteStruct) aqS17S1400000_3.l2);
        C7H1.LJFF(aqS17S1400000_3.s0);
        ((UpvotePublishVM) aqS17S1400000_3.l3).setState(new AqS57S1100000_3(aqS17S1400000_3.s0, (UpvoteStruct) aqS17S1400000_3.l2, 47));
        UpvotePublishVM upvotePublishVM = (UpvotePublishVM) aqS17S1400000_3.l3;
        UpvotePublishMobParam upvotePublishMobParam = (UpvotePublishMobParam) aqS17S1400000_3.l4;
        if (upvotePublishMobParam != null) {
            str = upvotePublishMobParam.enterFrom;
        } else {
            str = null;
        }
        String str2 = aqS17S1400000_3.s0;
        upvotePublishVM.getClass();
        IRepostListAbility iRepostListAbility = (IRepostListAbility) C55096Ljo.LIZ(GScope.LJLIL, IRepostListAbility.class, AnonymousClass780.LIZ(str));
        if (iRepostListAbility != null) {
            iRepostListAbility.Oa0(str2);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS17S1400000_3(ActivityC45651qj activityC45651qj, ActivityC45651qj activityC45651qj2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, String str, UpvotePublishMobParam upvotePublishMobParam, Map<String, String> map) {
        super(0);
        this.$t = map;
        this.l1 = activityC45651qj;
        this.l2 = activityC45651qj2;
        this.s0 = interfaceC65784Pro;
        this.l3 = str;
        this.l4 = upvotePublishMobParam;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS17S1400000_3(String str, String str2, PolicyBodyLinkList policyBodyLinkList, Context context, InterfaceC88472Yns<? super PolicyNoticeAction, C76800UCe> interfaceC88472Yns, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(0);
        this.$t = interfaceC65784Pro;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = policyBodyLinkList;
        this.l3 = context;
        this.l4 = interfaceC88472Yns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS17S1400000_3(AqS134S0200000_3 aqS134S0200000_3, UpvoteStruct upvoteStruct, String str, UpvotePublishVM upvotePublishVM, UpvotePublishMobParam upvotePublishMobParam, int i) {
        super(0);
        this.$t = i;
        this.l1 = aqS134S0200000_3;
        this.l2 = upvoteStruct;
        this.s0 = str;
        this.l3 = upvotePublishVM;
        this.l4 = upvotePublishMobParam;
    }
}

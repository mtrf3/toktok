package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.AbstractC73672Svk;
import X.C163596bT;
import X.C34K;
import X.C70796RqS;
import X.C70917RsP;
import X.C73361Sqj;
import X.C74110T6s;
import X.C76800UCe;
import X.C78946Uyc;
import X.C7F9;
import X.InterfaceC73150SnK;
import X.InterfaceC73226SoY;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC98243tM;
import X.MKQ;
import X.S1B;
import X.S1C;
import X.S1F;
import com.bytedance.ies.xelement.audiott.bean.XAudioSrc;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpBodyWidget;
import com.ss.android.ugc.aweme.ecommerce.base.review.Option;
import com.ss.android.ugc.aweme.ecommerce.base.review.ProductReviewViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.review.ReviewFragment;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import com.ss.android.ugc.aweme.qna.assem.QnaTabsContainerAssem;
import com.ss.android.ugc.aweme.qna.fragment.BaseQnaTabFragment;
import com.ss.android.ugc.aweme.qna.fragment.QnaAnswersTabFragment;
import com.ss.android.ugc.aweme.qna.fragment.QnaQuestionsTabFragment;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes13.dex */
public class AqS128S0300000_12 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case 9:
                return invoke$9(this, obj, obj2);
            case 10:
                return invoke$10(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS128S0300000_12 aqS128S0300000_12, Object obj, Object obj2) {
        AqS159S0200000_12 aqS159S0200000_12;
        InterfaceC98243tM receiver = (InterfaceC98243tM) obj;
        List it = (List) obj2;
        o.LJIIJ(receiver, "$receiver");
        o.LJIIJ(it, "it");
        InterfaceC73226SoY interfaceC73226SoY = (InterfaceC73226SoY) aqS128S0300000_12.l0;
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aqS128S0300000_12.l2;
        if (interfaceC88472Yns != null) {
            aqS159S0200000_12 = new AqS159S0200000_12(interfaceC88472Yns, receiver, 46);
        } else {
            aqS159S0200000_12 = null;
        }
        interfaceC73226SoY.LJJIIJ(it, aqS159S0200000_12);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00af, code lost:
    
        if (r1 != r0.intValue()) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AqS128S0300000_12 r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            r7 = r12
            java.util.List r7 = (java.util.List) r7
            java.lang.String r0 = "$this$selectSubscribe"
            kotlin.jvm.internal.o.LJIIIZ(r11, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L16
        L13:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L16:
            com.ss.android.ugc.aweme.ecommercebase.ab.EcomPerfMonitorSwitchConfig r0 = X.C70655RoB.LIZ()
            boolean r0 = r0.drawListener
            if (r0 != 0) goto L25
            java.lang.Object r0 = r10.l0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpBodyWidget r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpBodyWidget) r0
            r0.trackPdpPageDataMounted(r7)
        L25:
            X.RbH r0 = X.C69855RbH.LIZ
            r0.getClass()
            boolean r0 = X.C69855RbH.LIZ()
            r2 = 0
            if (r0 == 0) goto L88
            java.lang.Object r0 = r10.l0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpBodyWidget r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpBodyWidget) r0
            X.Af8 r3 = r0.adapter
            r6 = 2
            java.lang.String r5 = "ttf"
            if (r3 == 0) goto L4f
            com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel r0 = r0.getViewModel()
            X.AbX r0 = r0.LLILIL
            java.lang.String r0 = r0.LIZ
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r5)
            if (r0 == 0) goto Lb2
            r1 = 2
        L4b:
            java.lang.Integer r0 = r3.LJLJL
            if (r0 != 0) goto Lab
        L4f:
            java.lang.Object r4 = r10.l0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpBodyWidget r4 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpBodyWidget) r4
            X.Af8 r3 = new X.Af8
            java.lang.Object r0 = r10.l0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpBodyWidget r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpBodyWidget) r0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.ui.PdpFragment r1 = r0.getFragment()
            java.lang.Object r0 = r10.l0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpBodyWidget r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpBodyWidget) r0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel r0 = r0.getViewModel()
            X.AbX r0 = r0.LLILIL
            java.lang.String r0 = r0.LIZ
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r5)
            if (r0 == 0) goto La9
        L6f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r3.<init>(r1, r0)
            r3.setShowFooter(r2)
            r4.adapter = r3
            java.lang.Object r1 = r10.l1
            X.MKQ r1 = (X.MKQ) r1
            java.lang.Object r0 = r10.l0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpBodyWidget r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpBodyWidget) r0
            X.Af8 r0 = r0.adapter
            r1.setAdapter(r0)
        L88:
            java.lang.Object r6 = r10.l0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpBodyWidget r6 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpBodyWidget) r6
            X.Af8 r0 = r6.adapter
            if (r0 == 0) goto La1
            kotlin.jvm.internal.AqS72S0400000_12 r4 = new kotlin.jvm.internal.AqS72S0400000_12
            java.lang.Object r5 = r10.l2
            X.34K r5 = (X.C34K) r5
            java.lang.Object r8 = r10.l1
            X.MKQ r8 = (X.MKQ) r8
            r9 = 6
            r4.<init>(r5, r6, r7, r8, r9)
            X.C73227SoZ.LIZIZ(r0, r7, r4)
        La1:
            java.lang.Object r0 = r10.l2
            X.34K r0 = (X.C34K) r0
            r0.element = r2
            goto L13
        La9:
            r6 = 0
            goto L6f
        Lab:
            int r0 = r0.intValue()
            if (r1 != r0) goto L4f
            goto L88
        Lb2:
            r1 = 0
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS128S0300000_12.invoke$1(kotlin.jvm.internal.AqS128S0300000_12, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$10(AqS128S0300000_12 aqS128S0300000_12, Object obj, Object obj2) {
        String str;
        Object obj3;
        Option option = (Option) obj2;
        o.LJIIIZ(obj, "<anonymous parameter 0>");
        o.LJIIIZ(option, "option");
        Iterator it = ((List) aqS128S0300000_12.l0).iterator();
        while (true) {
            str = null;
            if (it.hasNext()) {
                obj3 = it.next();
                if (o.LJ(((ReviewFilterStruct) obj3).filterId, option.key)) {
                    break;
                }
            } else {
                obj3 = null;
                break;
            }
        }
        C70796RqS review_filter_view = (C70796RqS) ((ReviewFragment) aqS128S0300000_12.l1)._$_findCachedViewById(R.id.j0q);
        o.LJIIIIZZ(review_filter_view, "review_filter_view");
        C70796RqS.LIZ(review_filter_view);
        ProductReviewViewModel xl = ((ReviewFragment) aqS128S0300000_12.l1).xl();
        xl.getClass();
        xl.setState(new AqS178S0100000_12((ReviewFilterStruct) obj3, 613));
        if (((ReviewFragment) aqS128S0300000_12.l1).xl().LJLLILLLL != null) {
            ReviewFragment node = (ReviewFragment) aqS128S0300000_12.l1;
            Option option2 = (Option) aqS128S0300000_12.l2;
            if (option2 != null) {
                str = option2.valueForEvent;
            }
            String str2 = option.valueForEvent;
            o.LJIIIZ(node, "node");
            C78946Uyc.LJJII(node, new C70917RsP(), new AqS2S3000000_12("select_star", str, str2, 2));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS128S0300000_12 aqS128S0300000_12, Object selectSubscribe, Object obj) {
        Long l = (Long) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (l != null) {
            ((QnaTabsContainerAssem) aqS128S0300000_12.l0).A3((BaseQnaTabFragment) aqS128S0300000_12.l1, l.longValue(), (C74110T6s) aqS128S0300000_12.l2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS128S0300000_12 aqS128S0300000_12, Object selectSubscribe, Object obj) {
        Long l = (Long) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (l != null) {
            ((QnaTabsContainerAssem) aqS128S0300000_12.l0).A3((BaseQnaTabFragment) aqS128S0300000_12.l1, l.longValue(), (C74110T6s) aqS128S0300000_12.l2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS128S0300000_12 aqS128S0300000_12, Object throwable, Object obj) {
        ((Boolean) obj).booleanValue();
        o.LJIIJ(throwable, "throwable");
        C73361Sqj.LJJIL((C73361Sqj) aqS128S0300000_12.l0, (XAudioSrc) aqS128S0300000_12.l1, (InterfaceC88472Yns) aqS128S0300000_12.l2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS128S0300000_12 aqS128S0300000_12, Object state, Object obj) {
        ListState substate = (ListState) obj;
        o.LJIIJ(state, "state");
        o.LJIIJ(substate, "substate");
        if (substate.getHasMore().LIZ && !(substate.getLoadMore() instanceof C163596bT)) {
            ((ListMiddleware) aqS128S0300000_12.l0).LIZIZ((AbstractC73672Svk) ((InterfaceC88472Yns) aqS128S0300000_12.l1).invoke(state), new AqS194S0100000_12(aqS128S0300000_12, 179));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS128S0300000_12 aqS128S0300000_12, Object state, Object obj) {
        ListState substate = (ListState) obj;
        o.LJIIJ(state, "state");
        o.LJIIJ(substate, "substate");
        if (!(substate.getRefresh() instanceof C163596bT)) {
            ((ListMiddleware) aqS128S0300000_12.l0).LIZIZ((AbstractC73672Svk) ((InterfaceC88472Yns) aqS128S0300000_12.l1).invoke(state), new AqS194S0100000_12(aqS128S0300000_12, 181));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS128S0300000_12 aqS128S0300000_12, Object obj, Object obj2) {
        AqS159S0200000_12 aqS159S0200000_12;
        InterfaceC98243tM receiver = (InterfaceC98243tM) obj;
        List it = (List) obj2;
        o.LJIIJ(receiver, "$receiver");
        o.LJIIJ(it, "it");
        InterfaceC73226SoY interfaceC73226SoY = (InterfaceC73226SoY) aqS128S0300000_12.l0;
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aqS128S0300000_12.l2;
        if (interfaceC88472Yns != null) {
            aqS159S0200000_12 = new AqS159S0200000_12(interfaceC88472Yns, receiver, 47);
        } else {
            aqS159S0200000_12 = null;
        }
        interfaceC73226SoY.LJJIIJ(it, aqS159S0200000_12);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x01fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$8(kotlin.jvm.internal.AqS128S0300000_12 r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS128S0300000_12.invoke$8(kotlin.jvm.internal.AqS128S0300000_12, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$9(kotlin.jvm.internal.AqS128S0300000_12 r12, java.lang.Object r13, java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS128S0300000_12.invoke$9(kotlin.jvm.internal.AqS128S0300000_12, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS128S0300000_12(S1B s1b, C7F9 c7f9, S1F s1f, int i) {
        super(2);
        this.$t = i;
        this.l0 = s1b;
        this.l1 = c7f9;
        this.l2 = s1f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS128S0300000_12(S1C s1c, C7F9 c7f9, S1F s1f, int i) {
        super(2);
        this.$t = i;
        this.l0 = s1c;
        this.l1 = c7f9;
        this.l2 = s1f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS128S0300000_12(InterfaceC73226SoY interfaceC73226SoY, InterfaceC73150SnK interfaceC73150SnK, InterfaceC88472Yns interfaceC88472Yns, int i) {
        super(2);
        this.$t = i;
        this.l0 = interfaceC73226SoY;
        this.l1 = interfaceC73150SnK;
        this.l2 = interfaceC88472Yns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS128S0300000_12(C73361Sqj c73361Sqj, XAudioSrc xAudioSrc, AqS180S0100000_14 aqS180S0100000_14, int i) {
        super(2);
        this.$t = i;
        this.l0 = c73361Sqj;
        this.l1 = xAudioSrc;
        this.l2 = aqS180S0100000_14;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS128S0300000_12(ListMiddleware listMiddleware, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88471Ynr interfaceC88471Ynr, int i) {
        super(2);
        this.$t = i;
        this.l0 = listMiddleware;
        this.l1 = interfaceC88472Yns;
        this.l2 = interfaceC88471Ynr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS128S0300000_12(PdpBodyWidget pdpBodyWidget, MKQ mkq, C34K c34k, int i) {
        super(2);
        this.$t = i;
        this.l0 = pdpBodyWidget;
        this.l1 = mkq;
        this.l2 = c34k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS128S0300000_12(QnaTabsContainerAssem qnaTabsContainerAssem, QnaAnswersTabFragment qnaAnswersTabFragment, C74110T6s c74110T6s, int i) {
        super(2);
        this.$t = i;
        this.l0 = qnaTabsContainerAssem;
        this.l1 = qnaAnswersTabFragment;
        this.l2 = c74110T6s;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS128S0300000_12(QnaTabsContainerAssem qnaTabsContainerAssem, QnaQuestionsTabFragment qnaQuestionsTabFragment, C74110T6s c74110T6s, int i) {
        super(2);
        this.$t = i;
        this.l0 = qnaTabsContainerAssem;
        this.l1 = qnaQuestionsTabFragment;
        this.l2 = c74110T6s;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS128S0300000_12(List list, List<ReviewFilterStruct> list2, ReviewFragment reviewFragment, Option option) {
        super(2);
        this.$t = option;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = reviewFragment;
    }
}

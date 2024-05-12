package com.ss.android.ugc.aweme.question;

import X.AMD;
import X.AML;
import X.AbstractC26082ALm;
import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C04330Ez;
import X.C107794Kx;
import X.C117404jA;
import X.C157166Eu;
import X.C16880lQ;
import X.C188727au;
import X.C1BC;
import X.C252569vg;
import X.C25903AEp;
import X.C44384HbQ;
import X.C56492MFc;
import X.C5H3;
import X.C61878OQg;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C65782i6;
import X.C73140SnA;
import X.C73156SnQ;
import X.C73157SnR;
import X.C73165SnZ;
import X.C73305Spp;
import X.C76800UCe;
import X.C78685UuP;
import X.C7W1;
import X.C80647Vkx;
import X.C80675VlP;
import X.C80896Voy;
import X.C8BJ;
import X.C8GE;
import X.FMX;
import X.GHJ;
import X.HG3;
import X.InterfaceC109344Qw;
import X.InterfaceC117414jB;
import X.InterfaceC151715xP;
import X.InterfaceC61312at;
import X.InterfaceC73141SnB;
import X.InterfaceC73149SnJ;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC92693kP;
import X.KL2;
import X.MIM;
import X.QD3;
import X.QX2;
import X.RBX;
import X.T6F;
import X.T6H;
import X.T6S;
import X.T6V;
import X.T6X;
import X.T9K;
import X.TBT;
import X.TBW;
import X.TMG;
import X.W1T;
import X.X1D;
import Y.ACListenerS21S0100000_1;
import Y.ACListenerS29S0100000_9;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.arg.RouteArgExtension;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.challenge.ui.BaseDetailFragment;
import com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qainvitation.service.IQAInvitationService;
import com.ss.android.ugc.aweme.qainvitation.service.QAInvitationService;
import com.ss.android.ugc.aweme.qna.model.Qna;
import com.ss.android.ugc.aweme.qna.services.QnaService;
import com.ss.android.ugc.aweme.question.model.QuestionDetailParam;
import com.ss.android.ugc.aweme.question.model.QuestionDetailResponse;
import com.ss.android.ugc.aweme.question.viewmodel.QuestionDetailJediViewModel;
import com.ss.android.ugc.aweme.question.viewmodel.QuestionDetailState;
import com.ss.android.ugc.aweme.services.IQnaService;
import com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS170S0200000_7;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.AqS67S0110000_12;
import kotlin.jvm.internal.AqS72S0400000_12;
import kotlin.jvm.internal.IDqS454S0100000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import ujb.s;

/* loaded from: classes13.dex */
public class QuestionDetailFragment extends BaseDetailFragment implements InterfaceC151715xP, AMD<C25903AEp>, InterfaceC117414jB {
    public static final /* synthetic */ int LLIIJI = 0;
    public T9K LJLJI;
    public C8GE LJLLILLLL;
    public QuestionDetailAwemeListFragment LJLLJ;
    public String LJLLL;
    public QuestionDetailResponse LJLLLL;
    public ForumStruct LJLLLLLL;
    public String LJLZ;
    public String LJZI;
    public boolean LL;
    public boolean LLD;
    public String LLF;
    public final lifecycleAwareLazy LLFFF;
    public final C5H3 LLFII;
    public final C5H3 LLFZ;
    public C117404jA LLI;
    public C7W1 LLIFFJFJJ;
    public final IQAInvitationService LLII;
    public boolean LLIIII;
    public final MIM LLIIIILZ;
    public T6H LLIIIJ;
    public int LLIIIL;
    public final Map<Integer, View> LLIIIZ = new LinkedHashMap();
    public final C5H3 LJLIL = RouteArgExtension.INSTANCE.navArg(this);
    public final C5H3 LJLILLLLZI = C44384HbQ.LLFFF(new AqS157S0100000_7(this, 158));
    public final C5H3 LJLJJI = C44384HbQ.LLFFF(new AqS162S0100000_12(this, 868));
    public final C5H3 LJLJJL = C44384HbQ.LLFFF(new AqS162S0100000_12(this, 870));
    public final C5H3 LJLJJLL = C44384HbQ.LLFFF(new AqS162S0100000_12(this, 864));
    public final C5H3 LJLJL = C44384HbQ.LLFFF(new AqS162S0100000_12(this, 865));
    public final C5H3 LJLJLJ = C44384HbQ.LLFFF(new AqS162S0100000_12(this, 866));
    public final C5H3 LJLJLLL = C44384HbQ.LLFFF(new AqS162S0100000_12(this, 869));
    public final C5H3 LJLL = C44384HbQ.LLFFF(new AqS162S0100000_12(this, 867));
    public final C5H3 LJLLI = C44384HbQ.LLFFF(new AqS162S0100000_12(this, 863));
    public boolean LJZ = true;
    public String LJZL = "";
    public final C25903AEp LLFF = new C25903AEp();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLIIIZ;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.BaseDetailFragment
    public final String getLabel() {
        return "qa_detail";
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final String getLabelName(int i) {
        return i == 0 ? "qa_detail" : "";
    }

    @Override // X.InterfaceC73141SnB
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73141SnB getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC73149SnJ
    public final AML getReceiver() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73149SnJ<AML> getReceiverHolder() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final int getResId() {
        return R.layout.c_e;
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final String getShootWayLabel() {
        return "click_question_shoot";
    }

    @Override // X.InterfaceC73150SnK
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    public QuestionDetailFragment() {
        C65776Prg LIZ = C65352Pkq.LIZ(QuestionDetailJediViewModel.class);
        AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(LIZ, 874);
        this.LLFFF = new lifecycleAwareLazy(this, aqS162S0100000_12, new AqS72S0400000_12(this, aqS162S0100000_12, LIZ, T6S.INSTANCE, 20));
        this.LLFII = C44384HbQ.LLFFF(new AqS157S0100000_7(this, 159));
        this.LLFZ = C44384HbQ.LLFFF(GHJ.LJLIL);
        IQAInvitationService LJI = QAInvitationService.LJI();
        o.LJIIIIZZ(LJI, "get().getService(IQAInvitationService::class.java)");
        this.LLII = LJI;
        this.LLIIIILZ = new MIM(0);
        this.LLIIIL = -1;
    }

    public final QuestionDetailParam Al() {
        return (QuestionDetailParam) this.LJLILLLLZI.getValue();
    }

    public final C65782i6 Dl() {
        Object value = this.LJLLI.getValue();
        o.LJIIIIZZ(value, "<get-mHeaderContainer>(...)");
        return (C65782i6) value;
    }

    public final RelativeLayout Gl() {
        Object value = this.LJLJJLL.getValue();
        o.LJIIIIZZ(value, "<get-mRecordContainer>(...)");
        return (RelativeLayout) value;
    }

    public final C80896Voy Hl() {
        Object value = this.LJLJLJ.getValue();
        o.LJIIIIZZ(value, "<get-mRefreshLayout>(...)");
        return (C80896Voy) value;
    }

    public final View Il() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-mStatusBar>(...)");
        return (View) value;
    }

    public final C73305Spp Jl() {
        Object value = this.LJLJLLL.getValue();
        o.LJIIIIZZ(value, "<get-mStatusView>(...)");
        return (C73305Spp) value;
    }

    public final View Kl() {
        Object value = this.LJLJJL.getValue();
        o.LJIIIIZZ(value, "<get-mTitleBar>(...)");
        return (View) value;
    }

    public final Qna Ml() {
        String str;
        long j;
        int i;
        ShareInfo shareInfo;
        List list;
        DetailAwemeListFragment detailAwemeListFragment;
        C56492MFc c56492MFc;
        Integer videosCount;
        String content;
        Long id;
        User creator;
        ForumStruct forumStruct = this.LJLLLLLL;
        ShareInfo shareInfo2 = null;
        if (forumStruct != null && (creator = forumStruct.getCreator()) != null) {
            str = creator.getUid();
        } else {
            str = null;
        }
        String str2 = "";
        if (str == null) {
            str = "";
        }
        ForumStruct forumStruct2 = this.LJLLLLLL;
        if (forumStruct2 != null && (id = forumStruct2.getId()) != null) {
            j = id.longValue();
        } else {
            j = 0;
        }
        ForumStruct forumStruct3 = this.LJLLLLLL;
        if (forumStruct3 != null && (content = forumStruct3.getContent()) != null) {
            str2 = content;
        }
        ForumStruct forumStruct4 = this.LJLLLLLL;
        if (forumStruct4 != null && (videosCount = forumStruct4.getVideosCount()) != null) {
            i = videosCount.intValue();
        } else {
            i = 0;
        }
        ForumStruct forumStruct5 = this.LJLLLLLL;
        if (forumStruct5 != null) {
            shareInfo = forumStruct5.getShareInfo();
        } else {
            shareInfo = null;
        }
        ForumStruct forumStruct6 = this.LJLLLLLL;
        if (forumStruct6 != null) {
            shareInfo2 = forumStruct6.getInviteShareInfo();
        }
        List<T6F> list2 = this.mFragments;
        if (list2 != null && (ListProtector.get(list2, this.mCurPos) instanceof DetailAwemeListFragment)) {
            Object obj = ListProtector.get(this.mFragments, this.mCurPos);
            if (!(obj instanceof DetailAwemeListFragment) || (detailAwemeListFragment = (DetailAwemeListFragment) obj) == null || (c56492MFc = detailAwemeListFragment.LLD) == null || (list = c56492MFc.mmItems) == null) {
                list = C61878OQg.INSTANCE;
            }
        } else {
            list = C61878OQg.INSTANCE;
        }
        return new Qna(str, j, str2, i, shareInfo, shareInfo2, list);
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final String getCurId() {
        String str = this.LJLLL;
        if (str != null) {
            return str;
        }
        o.LJIJI("mQuestionId");
        throw null;
    }

    public final String Ll() {
        if (o.LJ(Al().getEnterMethod(), "click_sug_question")) {
            return "qa_personal_profile_search";
        }
        if (o.LJ(Al().getEnterFrom(), "qa_trending_page")) {
            return "qa_trending_page";
        }
        String qaOrigin = Al().getQaOrigin();
        if (qaOrigin == null || qaOrigin.length() == 0) {
            return Al().getEnterFrom();
        }
        return Al().getQaOrigin();
    }

    @Override // X.InterfaceC117414jB
    public final void ie() {
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        o.LJIIIIZZ(curUser, "userService().curUser");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "qa_detail");
        c188727au.LJIIIZ("enter_method", "click_toast");
        FMX.LJIIL("enter_qa_personal_profile", c188727au.LIZ);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("aweme://user/qna/profile/");
        LIZ.append(curUser.getUid());
        SmartRoute buildRoute = SmartRouter.buildRoute(this, X1D.LIZIZ(LIZ));
        buildRoute.withParam("enter_from", "qa_detail");
        buildRoute.withParam("enter_method", "click_toast");
        buildRoute.open();
        C117404jA c117404jA = this.LLI;
        o.LJI(c117404jA);
        if (c117404jA.isShowing()) {
            C117404jA c117404jA2 = this.LLI;
            o.LJI(c117404jA2);
            c117404jA2.dismiss();
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final void initData() {
        super.initData();
        C80675VlP c80675VlP = this.mTabLayout;
        if (c80675VlP != null) {
            c80675VlP.setBackgroundResource(R.color.ar);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LLIIIZ).clear();
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        MIM mim = this.LLIIIILZ;
        mim.getClass();
        mim.LJFF = Long.valueOf(System.currentTimeMillis());
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        MIM mim = this.LLIIIILZ;
        if (mim.LIZLLL) {
            mim.LIZ = Long.valueOf(System.currentTimeMillis());
            mim.LIZJ = 0L;
            mim.LIZLLL = false;
            mim.LJ = 0L;
            mim.LJFF = null;
        }
        MIM mim2 = this.LLIIIILZ;
        if (mim2.LJI) {
            mim2.LJFF = null;
        } else {
            Long l = mim2.LJFF;
            if (l != null) {
                long longValue = l.longValue();
                mim2.LJ = (System.currentTimeMillis() - longValue) + mim2.LJ;
            }
        }
        mim2.LJFF = null;
        mim2.LJI = false;
        MIM mim3 = this.LLIIIILZ;
        String awemeId = Al().getAwemeId();
        if (C78685UuP.LJJJZ(awemeId)) {
            mim3.LIZIZ = awemeId;
        } else {
            mim3.getClass();
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final C1BC getFragmentPagerAdapter() {
        return this.LLIIIJ;
    }

    @Override // X.AMD
    public final /* bridge */ /* synthetic */ C25903AEp getViewModelFactory() {
        return this.LLFF;
    }

    /* JADX WARN: Code restructure failed: missing block: B:216:0x04e5, code lost:
    
        if (ujb.o.LJJJLIIL(r5, r8, false) == true) goto L182;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Nl(com.ss.android.ugc.aweme.question.model.QuestionDetailResponse r26) {
        /*
            Method dump skipped, instructions count: 2221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.question.QuestionDetailFragment.Nl(com.ss.android.ugc.aweme.question.model.QuestionDetailResponse):void");
    }

    public final void Ol(Throwable th) {
        C252569vg.LIZ(Jl(), "QuestionDetail", th, new AqS162S0100000_12(this, 873));
        Jl().setVisibility(0);
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final void initArguments(Bundle bundle) {
        String id = Al().getId();
        String str = "";
        if (id == null) {
            id = "";
        }
        this.LJLLL = id;
        String processId = Al().getProcessId();
        if (processId != null) {
            str = processId;
        }
        this.LJZL = str;
        this.LLF = Al().getQuestionCategory();
    }

    @QD3
    public final void onAntiCrawlerEvent(QX2 event) {
        o.LJIIIZ(event, "event");
        String str = event.LJLIL;
        if (str != null && s.LJJJLZIJ(str, "/tiktok/v1/forum/question/detail/?", false)) {
            EventBus.LIZJ().LIZIZ(event);
            J4(true, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @QD3
    public final void onEvent(C107794Kx event) {
        o.LJIIIZ(event, "event");
        if (TextUtils.equals("qna", event.LJLJJI)) {
            InterfaceC109344Qw shareService = IMService.createIIMServicebyMonsterPlugin(false).getShareService();
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                shareService.LJIIL(mo49getActivity, Gl(), event);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.BaseDetailFragment
    public final void onPreVideoRecord(Intent intent) {
        o.LJIIIZ(intent, "intent");
        if (TextUtils.isEmpty(this.LJZI)) {
            this.LJZI = UUID.randomUUID().toString();
        }
        intent.putExtra("creation_id", this.LJZI);
    }

    public final void J4(boolean z, boolean z2) {
        if (NetworkStandardUIServiceImpl.createINetworkStandardUIServicebyMonsterPlugin(false).isStandardUIEnable()) {
            if (Hl().getVisibility() == 8) {
                Ol(null);
            }
            Jl().LJFF();
            Jl().setVisibility(0);
            if (this.LJLJI == null) {
                AqS67S0110000_12 aqS67S0110000_12 = new AqS67S0110000_12(this, z2, 4);
                AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(this, 871);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                C80896Voy Hl = Hl();
                WeakHandler mWeakHandler = this.mWeakHandler;
                o.LJIIIIZZ(mWeakHandler, "mWeakHandler");
                this.LJLJI = new T9K(aqS67S0110000_12, aqS162S0100000_12, mo49getActivity, Hl, mWeakHandler, "QuestionDetail");
            }
            T9K t9k = this.LJLJI;
            if (t9k != null) {
                t9k.LIZIZ = new AqS162S0100000_12(this, 872);
            }
            T9K t9k2 = this.LJLJI;
            if (t9k2 != null) {
                t9k2.LJIIIZ = System.currentTimeMillis();
            }
            String id = Al().getId();
            if (id != null) {
                ((QuestionDetailJediViewModel) this.LLFFF.getValue()).Hv0(CastLongProtector.parseLong(id), z2);
            }
            List<T6F> list = this.mFragments;
            if (z && list != null) {
                Iterator<T6F> it = list.iterator();
                while (it.hasNext()) {
                    it.next().J4(false, true);
                }
            }
        } else {
            Jl().LJFF();
            Jl().setVisibility(0);
            String id2 = Al().getId();
            if (id2 != null) {
                ((QuestionDetailJediViewModel) this.LLFFF.getValue()).Hv0(CastLongProtector.parseLong(id2), z2);
            }
            List<T6F> list2 = this.mFragments;
            if (z && list2 != null) {
                Iterator<T6F> it2 = list2.iterator();
                while (it2.hasNext()) {
                    it2.next().J4(false, true);
                }
            }
        }
        if (z2) {
            Jl().setVisibility(8);
            onScrolled(0.0f, -60.0f);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final void onPageChange(int i, int i2) {
        boolean z;
        super.onPageChange(i, i2);
        Set<Map.Entry> entrySet = ((HashMap) this.LLFZ.getValue()).entrySet();
        if (entrySet != null) {
            for (Map.Entry entry : entrySet) {
                View view = (View) entry.getValue();
                Integer num = (Integer) entry.getKey();
                if (num == null || num.intValue() != i) {
                    z = false;
                } else {
                    z = true;
                }
                view.setSelected(z);
            }
        }
        List<T6F> list = this.mFragments;
        if (list == null) {
            return;
        }
        Object obj = ListProtector.get(list, i);
        if (!((T6F) obj).lh()) {
            obj = null;
        }
        T6F t6f = (T6F) obj;
        if (t6f != null) {
            t6f.refresh();
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, X.InterfaceC80650Vl0
    public final void onScroll(int i, int i2) {
        int i3;
        super.onScroll(i, i2);
        if (this.LLIIIL != Dl().getBottom()) {
            Dl().getBottom();
            this.mTitleColorCtrl.getBottom();
            Il().getHeight();
            KL2.LIZJ(getContext(), 20.0f);
            this.LLIIIL = Dl().getBottom();
        }
        if (i == 0) {
            Kl().setBackground(new ColorDrawable(C04330Ez.LIZIZ(Kl().getContext(), R.color.cz)));
        } else {
            View Kl = Kl();
            Context context = Kl().getContext();
            o.LJIIIIZZ(context, "mTitleBar.context");
            Kl.setBackground(new ColorDrawable(AnonymousClass636.LJIIIIZZ(R.attr.cl, context)));
        }
        C8GE c8ge = this.LJLLILLLL;
        if (c8ge != null) {
            i3 = c8ge.getAvatarContainerHeight();
        } else {
            i3 = 1;
        }
        float f = i / i3;
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        this.mTitle.setAlpha(f);
        this.LL = T6X.LIZ(f, this.LL, this);
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, X.InterfaceC80650Vl0
    public final void onScrolled(float f, float f2) {
        this.LL = T6X.LIZIZ(f, f2, this.LL, this);
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.BaseDetailFragment, com.ss.android.ugc.aweme.detail.AbstractDetailFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (TextUtils.isEmpty(Al().getId())) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                mo49getActivity.finish();
                return;
            }
            return;
        }
        C80675VlP c80675VlP = this.mTabLayout;
        if (c80675VlP != null) {
            c80675VlP.setVisibility(8);
        }
        TextView textView = this.mTitle;
        if (textView != null) {
            textView.setVisibility(0);
        }
        if (MSAdaptionService.LJIIL().LIZIZ(getContext())) {
            ((ImageView) _$_findCachedViewById(R.id.aej)).setVisibility(8);
        }
        View back_btn = _$_findCachedViewById(R.id.aej);
        o.LJIIIIZZ(back_btn, "back_btn");
        C16880lQ.LJIIJ(new ACListenerS21S0100000_1(new AqS175S0100000_9(this, 236), (InterfaceC88472Yns<? super View, C76800UCe>) 134), back_btn);
        Context context = getContext();
        if (context != null) {
            i = C63081OpJ.LJJJJLI(context);
        } else {
            i = 0;
        }
        float dimension = getResources().getDimension(R.dimen.aje);
        Il().getLayoutParams().height = i;
        Il().setAlpha(1.0f);
        ViewGroup.LayoutParams layoutParams = Jl().getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) (i + dimension);
        if (!NetworkStandardUIServiceImpl.createINetworkStandardUIServicebyMonsterPlugin(false).isStandardUIEnable()) {
            Jl().setOnTouchListener(T6V.LJLIL);
        }
        Object value = this.LJLL.getValue();
        o.LJIIIIZZ(value, "<get-mShareButton>(...)");
        C16880lQ.LJIIJ(new ACListenerS21S0100000_1(new AqS178S0100000_12(this, 374), (InterfaceC88472Yns<? super View, C76800UCe>) 134), (View) value);
        Hl().setScrollMode(C8BJ.NONE);
        Hl().setOnRefreshListener(new AqS162S0100000_12(this, 1017));
        Dl().setOnSizeChangedListener(new IDqS454S0100000_9(this, 0));
        C73156SnQ.LIZIZ(this, (JediViewModel) this.LLFFF.getValue(), new TBT() { // from class: X.T6T
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((QuestionDetailState) obj).getQuestionDetail();
            }
        }, new AqS194S0100000_12(this, 141), null, new AqS170S0200000_7(this, view, 1), 10);
        if (NetworkStandardUIServiceImpl.createINetworkStandardUIServicebyMonsterPlugin(false).isStandardUIEnable()) {
            Hl().setVisibility(8);
        }
        J4(false, false);
        IQnaService LIZ = QnaService.LIZ();
        if (!LIZ.isQnaAugmentationQuestionDetailBannerEnabled() || o.LJ(Al().getEnterFrom(), LIZ.getQaPersonalProfileEventName()) || o.LJ(Al().getEnterFrom(), LIZ.getQaPersonalProfileSearchEventName())) {
            return;
        }
        C80647Vkx c80647Vkx = this.mScrollableLayout;
        if (!(c80647Vkx instanceof ViewGroup) || c80647Vkx == null) {
            return;
        }
        LIZ.setupQnaBanner(c80647Vkx, this, "qa_detail", new ACListenerS29S0100000_9(this, 88));
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "qa_detail");
        c188727au.LJIIIZ("question_id", Al().getQuestionId());
        FMX.LJIIL("qa_profile_banner_show", c188727au.LIZ);
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73157SnR.LJIIJJI(vm1, interfaceC88472Yns);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LJI(this, jediViewModel, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LIZIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C73165SnZ<TMG> c73165SnZ, InterfaceC88473Ynt<? super AML, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C73157SnR.LIZJ(this, jediViewModel, tbw, tbw2, c73165SnZ, interfaceC88473Ynt);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends AbstractC26082ALm<? extends T>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super AML, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C73157SnR.LIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C73165SnZ<C157166Eu> c73165SnZ, InterfaceC88474Ynu<? super AML, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C73157SnR.LIZLLL(this, jediViewModel, tbw, tbw2, tbw3, c73165SnZ, interfaceC88474Ynu);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C73165SnZ<W1T> c73165SnZ, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C73157SnR.LJ(this, jediViewModel, tbw, tbw2, tbw3, tbw4, c73165SnZ, interfaceC88475Ynv);
    }
}

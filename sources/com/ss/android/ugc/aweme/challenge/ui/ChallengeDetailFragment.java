package com.ss.android.ugc.aweme.challenge.ui;

import X.AMD;
import X.AML;
import X.AbstractC26082ALm;
import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C04330Ez;
import X.C157166Eu;
import X.C16880lQ;
import X.C16970lZ;
import X.C1BC;
import X.C252569vg;
import X.C25903AEp;
import X.C32151Nz;
import X.C35872E6a;
import X.C38354F3m;
import X.C41271GHr;
import X.C50420Jqa;
import X.C56492MFc;
import X.C56518MGc;
import X.C56530MGo;
import X.C5H3;
import X.C61878OQg;
import X.C62382cc;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C65762i4;
import X.C65776Prg;
import X.C72197SVd;
import X.C73140SnA;
import X.C73156SnQ;
import X.C73157SnR;
import X.C73165SnZ;
import X.C73305Spp;
import X.C76800UCe;
import X.C7W1;
import X.C80675VlP;
import X.C80896Voy;
import X.C86850Y6s;
import X.C8BJ;
import X.E8I;
import X.FRW;
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
import X.O6R;
import X.QD3;
import X.QX2;
import X.T5F;
import X.T63;
import X.T64;
import X.T65;
import X.T66;
import X.T67;
import X.T6B;
import X.T6F;
import X.T6H;
import X.T6X;
import X.T9K;
import X.TBT;
import X.TBW;
import X.TMG;
import X.V16;
import X.W1T;
import X.X1D;
import Y.ACListenerS46S0200000_12;
import Y.AObserverS75S0100000_7;
import Y.AObserverS80S0100000_12;
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
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.arg.RouteArgExtension;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IChallengeDetailLegacyService;
import com.ss.android.ugc.aweme.audiomode.vopclone.experiment.VopSignUpConfig;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.challenge.ChallengeDetailLegacyServiceImpl;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam;
import com.ss.android.ugc.aweme.challenge.service.ChallengeDetailProvider;
import com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailJediViewModel;
import com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailState;
import com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailViewModel;
import com.ss.android.ugc.aweme.commercialize.preview.service.AdsPreviewServiceImpl;
import com.ss.android.ugc.aweme.commercialize.preview.service.IAdsPreviewService;
import com.ss.android.ugc.aweme.detail.AbstractDetailFragment;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.AqS67S0110000_12;
import kotlin.jvm.internal.AqS72S0400000_12;
import kotlin.jvm.internal.IDqS455S0100000_12;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import q03.IDaS489S0100000_12;
import ujb.s;

/* loaded from: classes13.dex */
public class ChallengeDetailFragment extends BaseDetailFragment implements InterfaceC151715xP, AMD<C25903AEp> {
    public static final /* synthetic */ int LLIL = 0;
    public T5F LJLLJ;
    public C62382cc LJLLL;
    public T67 LJLLLL;
    public DetailAwemeListFragment LJLLLLLL;
    public String LJLZ;
    public ChallengeDetail LJZ;
    public Challenge LJZI;
    public boolean LJZL;
    public boolean LLF;
    public int LLFF;
    public boolean LLFFF;
    public String LLFII;
    public boolean LLIFFJFJJ;
    public boolean LLII;
    public AqS157S0100000_7 LLIIII;
    public final lifecycleAwareLazy LLIIIJ;
    public final C5H3 LLIIIL;
    public final C5H3 LLIIIZ;
    public C7W1 LLIIJI;
    public boolean LLIIJLIL;
    public T9K LLIIL;
    public boolean LLIILII;
    public int LLIILZL;
    public final Map<Integer, View> LLIIZ = new LinkedHashMap();
    public final C5H3 LJLIL = RouteArgExtension.INSTANCE.navArg(this);
    public final C5H3 LJLILLLLZI = V16.LJJJJ(new AqS157S0100000_7(this, 66));
    public final C5H3 LJLJI = V16.LJJJJ(new AqS162S0100000_12(this, 144));
    public final C5H3 LJLJJI = V16.LJJJJ(new AqS162S0100000_12(this, 146));
    public final C5H3 LJLJJL = V16.LJJJJ(new AqS162S0100000_12(this, 138));
    public final C5H3 LJLJJLL = V16.LJJJJ(new AqS162S0100000_12(this, 137));
    public final C5H3 LJLJL = V16.LJJJJ(new AqS162S0100000_12(this, UserLevelGeckoUpdateSetting.DEFAULT));
    public final C5H3 LJLJLJ = V16.LJJJJ(new AqS162S0100000_12(this, 141));
    public final C5H3 LJLJLLL = V16.LJJJJ(new AqS162S0100000_12(this, 142));
    public final C5H3 LJLL = V16.LJJJJ(new AqS162S0100000_12(this, 145));
    public final C5H3 LJLLI = V16.LJJJJ(new AqS162S0100000_12(this, 143));
    public final C5H3 LJLLILLLL = V16.LJJJJ(new AqS162S0100000_12(this, 139));
    public int LL = -1;
    public boolean LLD = true;
    public String LLFZ = "";
    public String LLI = "";
    public final C25903AEp LLIIIILZ = new C25903AEp();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLIIZ;
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
        return "challenge";
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final String getLabelName(int i) {
        return i != 0 ? i != 1 ? "" : "challenge_fresh" : "challenge";
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
        return R.layout.vo;
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final String getShootWayLabel() {
        return "click_challenge_shoot";
    }

    @Override // X.InterfaceC73150SnK
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    public ChallengeDetailFragment() {
        C65776Prg LIZ = C65352Pkq.LIZ(ChallengeDetailJediViewModel.class);
        AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(LIZ, 150);
        this.LLIIIJ = new lifecycleAwareLazy(this, aqS162S0100000_12, new AqS72S0400000_12(this, aqS162S0100000_12, LIZ, T65.INSTANCE, 2));
        this.LLIIIL = V16.LJJJJ(new AqS159S0100000_9(this, 78));
        this.LLIIIZ = V16.LJJJJ(C41271GHr.LJLIL);
        this.LLIILZL = -1;
    }

    public final List<Aweme> Al() {
        DetailAwemeListFragment detailAwemeListFragment;
        C56492MFc c56492MFc;
        List list;
        List<T6F> list2 = this.mFragments;
        if (list2 != null && (ListProtector.get(list2, this.mCurPos) instanceof DetailAwemeListFragment)) {
            Object obj = ListProtector.get(this.mFragments, this.mCurPos);
            if (!(obj instanceof DetailAwemeListFragment) || (detailAwemeListFragment = (DetailAwemeListFragment) obj) == null || (c56492MFc = detailAwemeListFragment.LLD) == null || (list = c56492MFc.mmItems) == null) {
                return C61878OQg.INSTANCE;
            }
            return list;
        }
        return C61878OQg.INSTANCE;
    }

    public final List<T6F> Gl() {
        List<T6F> mFragments = this.mFragments;
        o.LJIIIIZZ(mFragments, "mFragments");
        return mFragments;
    }

    public final ChallengeDetailParam Hl() {
        return (ChallengeDetailParam) this.LJLILLLLZI.getValue();
    }

    public final C65762i4 Il() {
        Object value = this.LJLLILLLL.getValue();
        o.LJIIIIZZ(value, "<get-mHeaderContainer>(...)");
        return (C65762i4) value;
    }

    public final RelativeLayout Jl() {
        Object value = this.LJLJL.getValue();
        o.LJIIIIZZ(value, "<get-mRecordContainer>(...)");
        return (RelativeLayout) value;
    }

    public final View Kl() {
        Object value = this.LJLJLJ.getValue();
        o.LJIIIIZZ(value, "<get-mRecordContainerLegacy>(...)");
        return (View) value;
    }

    public final C80896Voy Ll() {
        Object value = this.LJLJLLL.getValue();
        o.LJIIIIZZ(value, "<get-mRefreshLayout>(...)");
        return (C80896Voy) value;
    }

    public final View Ml() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-mStatusBar>(...)");
        return (View) value;
    }

    public final C73305Spp Nl() {
        Object value = this.LJLL.getValue();
        o.LJIIIIZZ(value, "<get-mStatusView>(...)");
        return (C73305Spp) value;
    }

    public final View Ol() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-mTitleBar>(...)");
        return (View) value;
    }

    public final View Pl() {
        Object value = this.LJLJJLL.getValue();
        o.LJIIIIZZ(value, "<get-vopIconEntrance>(...)");
        return (View) value;
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final String getCurId() {
        String str = this.LJLZ;
        if (str != null) {
            return str;
        }
        o.LJIJI("mChallengeId");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final C1BC getFragmentPagerAdapter() {
        String str;
        this.mFragments = new ArrayList();
        this.mFragmentList = new ArrayList();
        this.mFragmentTypes = new ArrayList();
        FragmentManager childFragmentManager = getChildFragmentManager();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(AbstractDetailFragment.FRAGMENT_TAG);
        LIZ.append('0');
        Fragment LJJJIL = childFragmentManager.LJJJIL(X1D.LIZIZ(LIZ));
        boolean z = LJJJIL instanceof DetailAwemeListFragment;
        String str2 = null;
        Fragment fragment = LJJJIL;
        if (!z) {
            C56518MGc c56518MGc = new C56518MGc(Hl().getParentTagId());
            String str3 = this.LJLZ;
            if (str3 != null) {
                boolean isHashTag = Hl().isHashTag();
                if (Hl().isHashTag()) {
                    str = this.LJLZ;
                    if (str == null) {
                        o.LJIJI("mChallengeId");
                        throw null;
                    }
                } else {
                    str = "";
                }
                String enterFrom = Hl().getEnterFrom();
                String str4 = this.LLFZ;
                String awemeId = Hl().getAwemeId();
                C56530MGo c56530MGo = new C56530MGo(str2, 1, false ? 1 : 0);
                c56530MGo.setPreloadInfoInvoke(this.LLIIII);
                DetailAwemeListFragment detailAwemeListFragment = new DetailAwemeListFragment();
                Bundle bundle = new Bundle();
                bundle.putSerializable("detail_config", c56518MGc);
                bundle.putInt("detail_aweme_list_type", 2);
                bundle.putString("event_label", "challenge");
                bundle.putString("detail_id", str3);
                bundle.putBoolean("extra_challenge_is_hashtag", isHashTag);
                bundle.putString("extra_challenge_hashtag_name", str);
                bundle.putString("detail_aweme_from", enterFrom);
                bundle.putString("detail_aweme_from_aid", awemeId);
                bundle.putString("process_id", str4);
                bundle.putString("group_id", awemeId);
                boolean z2 = false;
                bundle.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 0);
                detailAwemeListFragment.setArguments(bundle);
                detailAwemeListFragment.LLILLIZIL = c56530MGo;
                detailAwemeListFragment.LLFII = new T63(this);
                if (this.mCurPos == 0) {
                    z2 = true;
                }
                detailAwemeListFragment.LLIIJI = z2;
                detailAwemeListFragment.LL = Nl();
                detailAwemeListFragment.LLIIJLIL = true;
                fragment = detailAwemeListFragment;
            } else {
                o.LJIJI("mChallengeId");
                throw null;
            }
        }
        o.LJII(fragment, "null cannot be cast to non-null type com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment");
        DetailAwemeListFragment detailAwemeListFragment2 = (DetailAwemeListFragment) fragment;
        this.LJLLLLLL = detailAwemeListFragment2;
        detailAwemeListFragment2.LL = Nl();
        List<T6F> list = this.mFragments;
        DetailAwemeListFragment detailAwemeListFragment3 = this.LJLLLLLL;
        if (detailAwemeListFragment3 != null) {
            list.add(detailAwemeListFragment3);
            List<AmeBaseFragment> list2 = this.mFragmentList;
            DetailAwemeListFragment detailAwemeListFragment4 = this.LJLLLLLL;
            if (detailAwemeListFragment4 != null) {
                list2.add(detailAwemeListFragment4);
                this.mFragmentTypes.add(2);
                if (isHaveLatestTab()) {
                    ((ChallengeDetailViewModel) this.LLIIIL.getValue()).LJLIL.observe(this, new AObserverS80S0100000_12(this, 15));
                }
                ((ChallengeDetailViewModel) this.LLIIIL.getValue()).LJLJI.observe(this, new AObserverS75S0100000_7(this, 5));
                return new T6H(getChildFragmentManager(), this.mFragmentList, this.mFragmentTypes);
            }
            o.LJIJI("mHotFragment");
            throw null;
        }
        o.LJIJI("mHotFragment");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ChallengeDetail challengeDetail = this.LJZ;
        if (challengeDetail != null && challengeDetail.previewStatus == 1) {
            IAdsPreviewService LJI = AdsPreviewServiceImpl.LJI();
            ViewGroup rl_challenge_container = (ViewGroup) _$_findCachedViewById(R.id.j48);
            o.LJIIIIZZ(rl_challenge_container, "rl_challenge_container");
            LJI.LIZLLL(rl_challenge_container);
        }
        super.onDestroyView();
        ((LinkedHashMap) this.LLIIZ).clear();
    }

    public final void Sl() {
        View _$_findCachedViewById = _$_findCachedViewById(R.id.aj7);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.setBackgroundResource(R.drawable.a_2);
        }
        this.LLF = true;
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final void initData() {
        super.initData();
        C80675VlP c80675VlP = this.mTabLayout;
        if (c80675VlP != null) {
            c80675VlP.setBackgroundResource(R.color.ar);
        }
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.BaseDetailFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C16970lZ.LJII(R.layout.ako);
    }

    @Override // X.AMD
    public final /* bridge */ /* synthetic */ C25903AEp getViewModelFactory() {
        return this.LLIIIILZ;
    }

    public final void Dl(Context context) {
        String str = this.LJLZ;
        if (str != null) {
            if (E8I.LIZJ(str)) {
                C86850Y6s.LIZIZ.LIZ.LIZJ(context, "feed_banner");
                return;
            }
            String str2 = this.LJLZ;
            if (str2 != null) {
                if (!C35872E6a.LIZIZ(str2)) {
                    return;
                }
                String curUserId = AccountService.LJIJ().LJFF().getCurUserId();
                C62822Ol8 c62822Ol8 = T64.LIZ;
                if (((Keva) c62822Ol8.getValue()).getInt("is_first_enter", 1) == 1) {
                    T64.LIZ(1, "feed_banner", curUserId);
                    ((Keva) c62822Ol8.getValue()).storeInt("is_first_enter", 0);
                } else {
                    T64.LIZ(0, "feed_banner", curUserId);
                }
                String str3 = ((VopSignUpConfig) C35872E6a.LIZIZ.getValue()).webUrl;
                if (str3 == null) {
                    str3 = "";
                }
                SmartRouter.buildRoute(context, str3).open(0, new T66(curUserId));
                return;
            }
            o.LJIJI("mChallengeId");
            throw null;
        }
        o.LJIJI("mChallengeId");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:189:0x02ab, code lost:
    
        if (r1 == com.zhiliaoapp.musically.R.id.bn6) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x03cd, code lost:
    
        if (r9.intValue() != 0) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ql(com.ss.android.ugc.aweme.challenge.model.ChallengeDetail r25) {
        /*
            Method dump skipped, instructions count: 1247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment.Ql(com.ss.android.ugc.aweme.challenge.model.ChallengeDetail):void");
    }

    public final void Rl(Throwable th) {
        C252569vg.LIZ(Nl(), "ChallengeDetail", th, new AqS162S0100000_12(this, 149));
        Nl().setVisibility(0);
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final void initArguments(Bundle bundle) {
        String cid = Hl().getCid();
        String str = "";
        if (cid == null) {
            cid = "";
        }
        this.LJLZ = cid;
        this.LL = Hl().getShowTabIndex();
        String processId = Hl().getProcessId();
        if (processId != null) {
            str = processId;
        }
        this.LLFZ = str;
    }

    @QD3
    public final void onAntiCrawlerEvent(QX2 event) {
        o.LJIIIZ(event, "event");
        String str = event.LJLIL;
        if (str != null && s.LJJJLZIJ(str, "/aweme/v1/challenge/detail/?", false)) {
            EventBus.LIZJ().LIZIZ(event);
            J4(true, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @QD3
    public final void onMusicCollectEvent(C72197SVd event) {
        MusicModel musicModel;
        Music music;
        Music music2;
        o.LJIIIZ(event, "event");
        if (!isViewValid() || (musicModel = event.LJLILLLLZI) == null || (music = musicModel.getMusic()) == null) {
            return;
        }
        int i = event.LJLIL;
        music.setCollectStatus(i);
        Challenge challenge = this.LJZI;
        if (challenge == null || challenge.getConnectMusics() == null) {
            return;
        }
        Challenge challenge2 = this.LJZI;
        o.LJI(challenge2);
        List<Music> connectMusics = challenge2.getConnectMusics();
        o.LJIIIIZZ(connectMusics, "mChallenge!!.connectMusics");
        Iterator<Music> it = connectMusics.iterator();
        while (true) {
            if (it.hasNext()) {
                music2 = it.next();
                if (o.LJ(music2.getMid(), music.getMid())) {
                    break;
                }
            } else {
                music2 = null;
                break;
            }
        }
        Music music3 = music2;
        if (music3 == null) {
            return;
        }
        music3.setCollectStatus(i);
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.BaseDetailFragment
    public final void onPreVideoRecord(Intent intent) {
        o.LJIIIZ(intent, "intent");
        if (TextUtils.isEmpty(this.LLFII)) {
            this.LLFII = UUID.randomUUID().toString();
        }
        intent.putExtra("creation_id", this.LLFII);
    }

    @QD3
    public final void onVideoEvent(C50420Jqa event) {
        String str;
        Aweme i6;
        List<Challenge> challengeList;
        o.LJIIIZ(event, "event");
        if (event.LJLIL == 2 && isViewValid() && this.LJZI != null) {
            Object obj = event.LJLILLLLZI;
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str) || (i6 = AwemeService.LIZ().i6(str)) == null || (challengeList = i6.getChallengeList()) == null) {
                return;
            }
            Iterator<Challenge> it = challengeList.iterator();
            while (it.hasNext()) {
                String cid = it.next().getCid();
                Challenge challenge = this.LJZI;
                o.LJI(challenge);
                if (C38354F3m.LIZJ(cid, challenge.getCid())) {
                    Challenge challenge2 = this.LJZI;
                    o.LJI(challenge2);
                    if (challenge2.getUserCount() > 0) {
                        Challenge challenge3 = this.LJZI;
                        o.LJI(challenge3);
                        o.LJI(this.LJZI);
                        challenge3.setUserCount(r0.getUserCount() - 1);
                        Ql(this.LJZ);
                    }
                }
            }
        }
    }

    public final void J4(boolean z, boolean z2) {
        if (NetworkStandardUIServiceImpl.createINetworkStandardUIServicebyMonsterPlugin(false).isStandardUIEnable()) {
            if (Ll().getVisibility() != 0) {
                Rl(null);
            }
            if (this.LLIIL == null) {
                AqS67S0110000_12 aqS67S0110000_12 = new AqS67S0110000_12(this, z2, 0);
                AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(this, 147);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                C80896Voy Ll = Ll();
                WeakHandler mWeakHandler = this.mWeakHandler;
                o.LJIIIIZZ(mWeakHandler, "mWeakHandler");
                this.LLIIL = new T9K(aqS67S0110000_12, aqS162S0100000_12, mo49getActivity, Ll, mWeakHandler, "ChallengeDetail");
            }
            T9K t9k = this.LLIIL;
            if (t9k != null) {
                t9k.LIZIZ = new AqS162S0100000_12(this, 148);
            }
            T9K t9k2 = this.LLIIL;
            if (t9k2 != null) {
                t9k2.LJIIIZ = System.currentTimeMillis();
            }
            Nl().LJFF();
            ((ChallengeDetailJediViewModel) this.LLIIIJ.getValue()).Hv0(Hl().getCid(), Hl().getClickReason(), Hl().getPreviewToken(), Hl().isHashTag(), z2);
            FRW.LIZ("cd_start_activity_to_request_net_duration");
            List<T6F> list = this.mFragments;
            if (z && list != null) {
                Iterator<T6F> it = list.iterator();
                while (it.hasNext()) {
                    it.next().J4(false, true);
                }
            }
        } else {
            Nl().LJFF();
            Nl().setVisibility(0);
            FRW.LIZ("cd_start_activity_to_request_net_duration");
            ((ChallengeDetailJediViewModel) this.LLIIIJ.getValue()).Hv0(Hl().getCid(), Hl().getClickReason(), Hl().getPreviewToken(), Hl().isHashTag(), z2);
            List<T6F> list2 = this.mFragments;
            if (z && list2 != null) {
                Iterator<T6F> it2 = list2.iterator();
                while (it2.hasNext()) {
                    it2.next().J4(false, true);
                }
            }
        }
        if (z2) {
            Nl().setVisibility(8);
            onScrolled(0.0f, -60.0f);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final void onPageChange(int i, int i2) {
        boolean z;
        super.onPageChange(i, i2);
        Set<Map.Entry> entrySet = ((HashMap) this.LLIIIZ.getValue()).entrySet();
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
        T67 t67 = this.LJLLLL;
        if (t67 != null) {
            t67.LIZ(i);
            if (this.LJLLJ == null) {
                return;
            }
            if (this.LLIILZL != Il().getBottom()) {
                Il().getBottom();
                this.mTitleColorCtrl.getBottom();
                Ml().getHeight();
                KL2.LIZJ(getContext(), 20.0f);
                this.LLIILZL = Il().getBottom();
            }
            if (i == 0) {
                Ol().setBackground(new ColorDrawable(C04330Ez.LIZIZ(Ol().getContext(), R.color.cz)));
            } else {
                View Ol = Ol();
                Context context = Ol().getContext();
                o.LJIIIIZZ(context, "mTitleBar.context");
                Ol.setBackground(new ColorDrawable(AnonymousClass636.LJIIIIZZ(R.attr.cl, context)));
            }
            T5F t5f = this.LJLLJ;
            if (t5f != null) {
                i3 = t5f.getAvatarContainerHight();
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
            if (this.LLIILII) {
                Object value = this.LJLJJL.getValue();
                o.LJIIIIZZ(value, "<get-vopTitleEntrance>(...)");
                ((View) value).setAlpha(1 - f);
                Pl();
                if (f == 1.0f) {
                    Pl().setVisibility(0);
                } else {
                    Pl().setVisibility(8);
                }
            }
            if (!this.LJZL) {
                this.LLIFFJFJJ = T6X.LIZ(f, this.LLIFFJFJJ, this);
                return;
            }
            return;
        }
        o.LJIJI("mCommerceDelegate");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, X.InterfaceC80650Vl0
    public final void onScrolled(float f, float f2) {
        if (this.LJZL) {
            super.onScrolled(f, f2);
        } else {
            this.LLIFFJFJJ = T6X.LIZIZ(f, f2, this.LLIFFJFJJ, this);
        }
        T67 t67 = this.LJLLLL;
        if (t67 != null) {
            t67.LIZIZ(f2);
        } else {
            o.LJIJI("mCommerceDelegate");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.BaseDetailFragment, com.ss.android.ugc.aweme.detail.AbstractDetailFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        boolean z;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (TextUtils.isEmpty(Hl().getCid())) {
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
        if (NetworkStandardUIServiceImpl.createINetworkStandardUIServicebyMonsterPlugin(false).isStandardUIEnable()) {
            Kl().setVisibility(8);
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
        C16880lQ.LJIIJ(new ACListenerS46S0200000_12(this, new AqS170S0100000_4(this, 151), 9), back_btn);
        Context context = getContext();
        if (context != null) {
            i = C63081OpJ.LJJJJLI(context);
        } else {
            i = 0;
        }
        float dimension = getResources().getDimension(R.dimen.aje);
        Ml().getLayoutParams().height = i;
        Ml().setAlpha(1.0f);
        ViewGroup.LayoutParams layoutParams = Nl().getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) (i + dimension);
        if (!NetworkStandardUIServiceImpl.createINetworkStandardUIServicebyMonsterPlugin(false).isStandardUIEnable()) {
            Nl().setOnTouchListener(T6B.LJLIL);
        }
        Object value = this.LJLLI.getValue();
        o.LJIIIIZZ(value, "<get-mShareButton>(...)");
        C16880lQ.LJIIJ(new ACListenerS46S0200000_12(this, new AqS176S0100000_10(this, 27), 9), (View) value);
        IChallengeDetailLegacyService LIZ = ChallengeDetailLegacyServiceImpl.LIZ();
        Object value2 = this.LJLLI.getValue();
        o.LJIIIIZZ(value2, "<get-mShareButton>(...)");
        LIZ.LJI((ImageView) value2, O6R.LJJIIZ(C32151Nz.LJIIZILJ(24)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(24)));
        getResources().getDimensionPixelSize(R.dimen.ij);
        Ll().setScrollMode(C8BJ.NONE);
        Ll().setOnRefreshListener(new AqS162S0100000_12(this, 151));
        if (NetworkStandardUIServiceImpl.createINetworkStandardUIServicebyMonsterPlugin(false).isStandardUIEnable()) {
            Ll().setVisibility(8);
        }
        Il().setOnSizeChangedListener(new IDqS455S0100000_12(this, 0));
        Context context2 = getContext();
        o.LJI(context2);
        this.LJLLL = new C62382cc(context2);
        T67 LIZIZ = ChallengeDetailProvider.LJ().LIZIZ(view, this);
        o.LJIIIIZZ(LIZIZ, "get().getService(IChalle…merceDelegate(view, this)");
        this.LJLLLL = LIZIZ;
        C73156SnQ.LIZIZ(this, (JediViewModel) this.LLIIIJ.getValue(), new TBT() { // from class: X.T68
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((ChallengeDetailState) obj).getChallengeDetail();
            }
        }, new AqS194S0100000_12(this, 35), null, new AqS194S0100000_12(this, 36), 10);
        String str = this.LJLZ;
        if (str != null) {
            if (E8I.LIZJ(str) || C35872E6a.LIZIZ(str)) {
                z = true;
            } else {
                z = false;
            }
            this.LLIILII = z;
            if (z) {
                Object value3 = this.LJLJJL.getValue();
                o.LJIIIIZZ(value3, "<get-vopTitleEntrance>(...)");
                ((View) value3).setVisibility(0);
                Object value4 = this.LJLJJL.getValue();
                o.LJIIIIZZ(value4, "<get-vopTitleEntrance>(...)");
                C16880lQ.LJIIJ(new IDaS489S0100000_12(this, 1), (View) value4);
                C16880lQ.LJIIJ(new IDaS489S0100000_12(this, 2), Pl());
            }
            J4(false, false);
            return;
        }
        o.LJIJI("mChallengeId");
        throw null;
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

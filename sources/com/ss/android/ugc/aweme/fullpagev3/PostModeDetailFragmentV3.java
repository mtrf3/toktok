package com.ss.android.ugc.aweme.fullpagev3;

import X.ActivityC45651qj;
import X.AnonymousClass922;
import X.C03880Dg;
import X.C107794Kx;
import X.C108814Ov;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C174046sK;
import X.C1807677o;
import X.C184077Kh;
import X.C187227Wk;
import X.C192517h1;
import X.C198297qL;
import X.C200797uN;
import X.C200807uO;
import X.C200817uP;
import X.C200827uQ;
import X.C200877uV;
import X.C200887uW;
import X.C200987ug;
import X.C201467vS;
import X.C201587ve;
import X.C201607vg;
import X.C2043680i;
import X.C212418Vh;
import X.C214298b3;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C221108m2;
import X.C29S;
import X.C2KI;
import X.C2U8;
import X.C30539Byh;
import X.C31081Jw;
import X.C36922EeM;
import X.C38619FDr;
import X.C3C5;
import X.C45804HyK;
import X.C50420Jqa;
import X.C52535Kjb;
import X.C55045Liz;
import X.C55096Ljo;
import X.C55230Lly;
import X.C56102Ic;
import X.C56132If;
import X.C56642Ke;
import X.C57092Lx;
import X.C58522Rk;
import X.C61447O9r;
import X.C62822Ol8;
import X.C65300Pk0;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C77123UOp;
import X.C78926UyI;
import X.C8VV;
import X.C90903hW;
import X.C9BD;
import X.C9BE;
import X.DV4;
import X.EnumC201127uu;
import X.EnumC2063587z;
import X.IWF;
import X.InterfaceC174106sQ;
import X.InterfaceC192527h2;
import X.InterfaceC46330IGg;
import X.InterfaceC65784Pro;
import X.InterfaceC87433YTd;
import X.JHI;
import X.OSZ;
import X.QD3;
import Y.AObserverS71S0100000_3;
import Y.IDCListenerS253S0100000_3;
import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.favorites.business.aweme.AwemeCollectionAgent;
import com.ss.android.ugc.aweme.favorites.service.FavoriteServiceImpl;
import com.ss.android.ugc.aweme.favorites.service.IFavoriteService;
import com.ss.android.ugc.aweme.feed.bottom.BottomToastVM;
import com.ss.android.ugc.aweme.feed.earphone.IEarphonePlayerControlService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import com.ss.android.ugc.aweme.fullpagev3.PostModeDetailFragmentV3;
import com.ss.android.ugc.aweme.fullpagev3.assem.FullPageBottomActionBarAssem;
import com.ss.android.ugc.aweme.fullpagev3.assem.FullPageParam;
import com.ss.android.ugc.aweme.fullpagev3.scope.FullPageBottomActionBarAbility;
import com.ss.android.ugc.aweme.fullpagev3.scope.PostModeDetailFragmentScope;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.model.PostModeEntranceMechanism;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.profile.model.CollectAwemeEvent;
import com.ss.android.ugc.aweme.ui.common.PhotoSharedViewModel;
import com.ss.android.ugc.aweme.ui.feed.photos.PostModeFullPageViewModel;
import com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragment;
import com.ss.android.ugc.aweme.ui.util.PostModeOnUIPlayListener;
import com.ss.android.ugc.aweme.ui.util.StayTimeFragmentComponent;
import com.ss.android.ugc.aweme.viewmodel.PostDiggViewModel;
import com.ss.android.ugc.aweme.viewmodel.PostModeCommentViewModel;
import com.ss.android.ugc.aweme.viewmodel.PostModeContainerViewModel;
import com.ss.android.ugc.aweme.viewmodel.PostModeFavoriteViewModel;
import com.ss.android.ugc.aweme.viewmodel.PostModeTimeLoggerViewModel;
import com.ss.android.ugc.feed.platform.panel.earphone.EarphonePlayerControl;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS60S0110000_3;
import kotlin.jvm.internal.AqS61S0110000_4;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class PostModeDetailFragmentV3 extends PostModeCommentListFragment implements InterfaceC192527h2 {
    public static final /* synthetic */ int b = 0;
    public FullPageParam LLZ;
    public C200987ug LLZIL;
    public long LLZILL;
    public StayTimeFragmentComponent LLZL;
    public final C214298b3 LLZLLIL;
    public final C214378bB LLZLLLL;
    public final C214378bB LLZZ;
    public final C214298b3 LLZZJLIL;
    public final C214298b3 LLZZLLIL;
    public final C200827uQ LLZZZIL;
    public final C30539Byh LLZZZZ;
    public final Map<Integer, View> a = new LinkedHashMap();
    public final C62822Ol8 LLZLI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 408));
    public final C62822Ol8 LLZLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 411));

    @Override // com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.a).clear();
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.a;
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

    @Override // com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment, X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        ArrayList arrayList = new ArrayList(super.getScopeDefine());
        arrayList.add(PostModeDetailFragmentScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragment, com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment
    public final void vo(boolean z) {
    }

    public PostModeDetailFragmentV3() {
        C214298b3 c214298b3;
        AqS60S0110000_3 LJJ;
        AqS60S0110000_3 LJJ2;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(PostModeFullPageViewModel.class);
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(LIZ, 412);
        C200877uV c200877uV = C200877uV.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c200877uV, LIZ);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c200877uV, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LLZLLIL = c214298b3;
        C65776Prg LIZ2 = C65352Pkq.LIZ(PhotoSharedViewModel.class);
        AqS153S0100000_3 aqS153S0100000_32 = new AqS153S0100000_3((Fragment) this, 1671);
        C1807677o c1807677o = C1807677o.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJJ = C78926UyI.LJJ(this, false);
        } else {
            LJJ = C78926UyI.LJJ(this, true);
        }
        AqS60S0110000_3 LJIILLIIL = C78926UyI.LJIILLIIL(this, true);
        C214528bQ c214528bQ = C214528bQ.LJLIL;
        AqS61S0110000_4 LJJII = C78926UyI.LJJII(this, false);
        C184077Kh c184077Kh = C184077Kh.LJLIL;
        this.LLZLLLL = new C214378bB(LIZ2, aqS153S0100000_32, c214528bQ, LJJII, c184077Kh, c1807677o, LJJ, LJIILLIIL);
        C65776Prg LIZ3 = C65352Pkq.LIZ(PostDiggViewModel.class);
        C200817uP c200817uP = C200817uP.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJJ2 = C78926UyI.LJJ(this, false);
        } else {
            LJJ2 = C78926UyI.LJJ(this, true);
        }
        this.LLZZ = new C214378bB(LIZ3, null, c214528bQ, C78926UyI.LJJII(this, false), c184077Kh, c200817uP, LJJ2, C78926UyI.LJIILLIIL(this, true));
        C65776Prg LIZ4 = C65352Pkq.LIZ(PostModeCommentViewModel.class);
        this.LLZZJLIL = new C214298b3(LIZ4, new AqS153S0100000_3(LIZ4, 413), c214528bQ, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), c184077Kh, C200807uO.INSTANCE, (InterfaceC65784Pro) null, 384);
        C65776Prg LIZ5 = C65352Pkq.LIZ(PostModeFavoriteViewModel.class);
        this.LLZZLLIL = new C214298b3(LIZ5, new AqS153S0100000_3(LIZ5, 414), c214528bQ, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), c184077Kh, C200887uW.INSTANCE, (InterfaceC65784Pro) null, 384);
        this.LLZZZIL = new C200827uQ(this);
        this.LLZZZZ = new C30539Byh(new AqS153S0100000_3(this, 409));
    }

    public final PostModeTimeLoggerViewModel Bp() {
        return (PostModeTimeLoggerViewModel) this.LLZLL.getValue();
    }

    public final PostModeContainerViewModel yp() {
        return (PostModeContainerViewModel) this.LLZLI.getValue();
    }

    public final PostModeFullPageViewModel zp() {
        return (PostModeFullPageViewModel) this.LLZLLIL.getValue();
    }

    public final void Dp() {
        Aweme aweme;
        Aweme aweme2;
        PostModeDetailParams postModeDetailParams;
        int i = yp().LLILLJJLI;
        int i2 = yp().LLILLL;
        if (i > 0) {
            double d = i2 / i;
            PostModeDetailParams postModeDetailParams2 = null;
            if (i > 0) {
                FullPageParam fullPageParam = this.LLZ;
                if (fullPageParam != null) {
                    aweme2 = fullPageParam.getAweme();
                } else {
                    aweme2 = null;
                }
                FullPageParam fullPageParam2 = this.LLZ;
                if (fullPageParam2 != null) {
                    postModeDetailParams = fullPageParam2.getPostModeDetailParams();
                } else {
                    postModeDetailParams = null;
                }
                C201467vS.LJIIIZ("graphic_detail_finish_rate", aweme2, postModeDetailParams, Integer.valueOf(zp().LJLLILLLL), Double.valueOf(d), null, 1736);
            }
            if (d >= 1.0d) {
                FullPageParam fullPageParam3 = this.LLZ;
                if (fullPageParam3 != null) {
                    aweme = fullPageParam3.getAweme();
                } else {
                    aweme = null;
                }
                FullPageParam fullPageParam4 = this.LLZ;
                if (fullPageParam4 != null) {
                    postModeDetailParams2 = fullPageParam4.getPostModeDetailParams();
                }
                C201467vS.LJIILJJIL(aweme, postModeDetailParams2, Integer.valueOf(zp().LJLLILLLL));
            }
        }
    }

    public final InterfaceC46330IGg getPlayerManager() {
        InterfaceC46330IGg interfaceC46330IGg = yp().LLILII;
        if (interfaceC46330IGg == null) {
            InterfaceC46330IGg LJJLIIIIJ = IWF.LJJLIIIIJ();
            o.LJIIIIZZ(LJJLIIIIJ, "inst()");
            return LJJLIIIIJ;
        }
        return interfaceC46330IGg;
    }

    @Override // com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragment
    public final void np() {
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        this.LLLZIIL = C38619FDr.LIZJ(requireContext, R.layout.c23, null);
        FullPageParam fullPageParam = this.LLZ;
        if (fullPageParam != null) {
            C8VV.LIZ(this, false, new AqS134S0200000_3(this, fullPageParam, 91));
            C8VV.LIZ(this, false, new AqS134S0200000_3(this, fullPageParam, 92));
            C8VV.LIZ(this, false, new AqS134S0200000_3(this, fullPageParam, 93));
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        C36922EeM.LIZLLL(4, "PostModeCrash", "postmodemodel  is null");
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        yp().LLILII = null;
        if (C52535Kjb.LIZ()) {
            if (C52535Kjb.LIZIZ()) {
                AwemeCollectionAgent.LJIILLIIL().LIZJ(this.LLZZZIL);
            } else {
                AwemeCollectionAgent.LJIILLIIL().LJIIIIZZ(this);
            }
        }
        this.LLZIL = null;
    }

    @Override // com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        Aweme aweme;
        PostModeDetailParams postModeDetailParams;
        super.onPause();
        T value = yp().LJLILLLLZI.getValue();
        FullPageParam fullPageParam = this.LLZ;
        if (((fullPageParam != null && (postModeDetailParams = fullPageParam.getPostModeDetailParams()) != null && !postModeDetailParams.enableGestureExit) || (value != EnumC201127uu.SLIDE_RIGHT && value != EnumC201127uu.PULL_DOWN)) && value != EnumC201127uu.BACK) {
            if (value == EnumC201127uu.PULL_UP) {
                getPlayerManager().LLLLLL();
            } else {
                C212418Vh.LJIIL(zp(), new AqS169S0100000_3(this, 771));
            }
        }
        Dp();
        long currentTimeMillis = System.currentTimeMillis() - this.LLZILL;
        FullPageParam fullPageParam2 = this.LLZ;
        PostModeDetailParams postModeDetailParams2 = null;
        if (fullPageParam2 != null) {
            aweme = fullPageParam2.getAweme();
        } else {
            aweme = null;
        }
        FullPageParam fullPageParam3 = this.LLZ;
        if (fullPageParam3 != null) {
            postModeDetailParams2 = fullPageParam3.getPostModeDetailParams();
        }
        C201467vS.LJIILL(aweme, postModeDetailParams2, currentTimeMillis);
        C16880lQ.LJJLIIIJL(requireContext(), this.LLZZZZ);
    }

    @Override // com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C212418Vh.LJIIL(zp(), new AqS169S0100000_3(this, 772));
        this.LLZILL = System.currentTimeMillis();
        IntentFilter intentFilter = new IntentFilter("android.media.AUDIO_BECOMING_NOISY");
        C16880lQ.LJJLIIIJILLIZJL(this.LLZZZZ, requireContext(), intentFilter);
        IEarphonePlayerControlService LJII = EarphonePlayerControl.LJII();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        o.LJIIIIZZ(viewLifecycleOwner, "viewLifecycleOwner");
        LJII.LJI(viewLifecycleOwner, new InterfaceC87433YTd() { // from class: X.7qM
            @Override // X.InterfaceC87433YTd
            public final String LIZIZ() {
                return "post_mode_detail";
            }

            @Override // X.InterfaceC87433YTd
            public final void LIZ() {
                PostModeFullPageViewModel zp = PostModeDetailFragmentV3.this.zp();
                zp.getClass();
                zp.withState(new AqS169S0100000_3(zp, 1005));
            }
        });
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (!EventBus.LIZJ().LJI(this)) {
            EventBus.LIZJ().LJIILJJIL(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (EventBus.LIZJ().LJI(this)) {
            EventBus.LIZJ().LJIJ(this);
        }
    }

    public static final void performPause(PostModeDetailFragmentV3 postModeDetailFragmentV3) {
        PostModeDetailParams postModeDetailParams;
        ActivityC45651qj mo49getActivity;
        FullPageParam fullPageParam = postModeDetailFragmentV3.LLZ;
        if (fullPageParam != null && (postModeDetailParams = fullPageParam.getPostModeDetailParams()) != null && postModeDetailParams.needMobVideoPlay && (mo49getActivity = postModeDetailFragmentV3.mo49getActivity()) != null && mo49getActivity.isFinishing()) {
            postModeDetailFragmentV3.getPlayerManager().LLLLLL();
        } else {
            postModeDetailFragmentV3.getPlayerManager().LJIILJJIL();
        }
    }

    public static final /* synthetic */ void up(PostModeDetailFragmentV3 postModeDetailFragmentV3) {
        super.vo(true);
    }

    @QD3
    public final void globalSetMuteIconState(C198297qL event) {
        View view;
        View findViewById;
        o.LJIIIZ(event, "event");
        if (yp().LLIZ && (view = this.LLLZIIL) != null && (findViewById = view.findViewById(R.id.hzr)) != null) {
            findViewById.performClick();
        }
    }

    @QD3(priority = 1)
    public final void onAddVideoToMixEvent(C56132If event) {
        Activity LJIJJ;
        o.LJIIIZ(event, "event");
        if (event.LJLIL == null || requireActivity().isFinishing() || requireActivity().isDestroyed() || !isVisible()) {
            return;
        }
        EventBus.LIZJ().LIZIZ(event);
        C200987ug c200987ug = this.LLZIL;
        if (c200987ug == null || (LJIJJ = C45804HyK.LJIJJ(c200987ug.LIZJ)) == null) {
            return;
        }
        MixFeedService.LJJIJIIJIL().LJIIIIZZ(new C58522Rk(c200987ug, LJIJJ));
    }

    @QD3
    public final void onAwemeDeleteEvent(C55045Liz event) {
        o.LJIIIZ(event, "event");
        if (requireActivity().isFinishing() || requireActivity().isDestroyed() || !isVisible()) {
            return;
        }
        yp().gv0(EnumC201127uu.PULL_UP);
    }

    @QD3
    public final void onCollectAwemeEvent(CollectAwemeEvent collectAwemeEvent) {
        if (collectAwemeEvent == null) {
            return;
        }
        boolean z = true;
        if (collectAwemeEvent.action != 1) {
            z = false;
        }
        xp(z);
    }

    @Override // com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragment, com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment
    @QD3
    public void onCommentEvent(C174046sK event) {
        Long l;
        AwemeStatistics statistics;
        o.LJIIIZ(event, "event");
        if (requireActivity().isFinishing() || requireActivity().isDestroyed() || !isVisible()) {
            return;
        }
        super.onCommentEvent(event);
        int i = event.LJLIL;
        if (i != 3 && i != 4) {
            return;
        }
        PostModeCommentViewModel postModeCommentViewModel = (PostModeCommentViewModel) this.LLZZJLIL.getValue();
        Aweme aweme = event.LJLJI;
        if (aweme != null && (statistics = aweme.getStatistics()) != null) {
            l = Long.valueOf(statistics.getCommentCount());
        } else {
            l = null;
        }
        postModeCommentViewModel.gv0(l);
    }

    @Override // com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        HashMap<String, String> hashMap;
        PostModeDetailParams postModeDetailParams;
        super.onCreate(bundle);
        zp().LJLLL = new AqS153S0100000_3(this, 410);
        VideoItemParams videoItemParams = ((PhotoSharedViewModel) this.LLZLLLL.getValue()).LJLIL;
        if (videoItemParams != null) {
            PostModeFullPageViewModel zp = zp();
            FullPageParam fullPageParam = this.LLZ;
            if (fullPageParam != null && (postModeDetailParams = fullPageParam.getPostModeDetailParams()) != null) {
                hashMap = postModeDetailParams.displayTitleParams;
            } else {
                hashMap = null;
            }
            zp.ov0(videoItemParams);
            zp.LJLJLLL.LJII = hashMap;
            zp.LLD = true;
            ((PhotoSharedViewModel) this.LLZLLLL.getValue()).LJLIL = null;
        }
    }

    @QD3
    public final void onEvent(C187227Wk event) {
        Aweme aweme;
        AwemeStatus status;
        Aweme aweme2;
        AwemeStatus status2;
        o.LJIIIZ(event, "event");
        if (requireActivity().isFinishing() || requireActivity().isDestroyed() || !isVisible() || event.LJLILLLLZI == null) {
            return;
        }
        FullPageParam fullPageParam = this.LLZ;
        Integer num = null;
        if (fullPageParam != null && (aweme2 = fullPageParam.getAweme()) != null && (status2 = aweme2.getStatus()) != null) {
            status2.setPrivateStatus(event.LJLILLLLZI.getStatus().getPrivateStatus());
        }
        PostModeContainerViewModel yp = yp();
        FullPageParam fullPageParam2 = this.LLZ;
        if (fullPageParam2 != null && (aweme = fullPageParam2.getAweme()) != null && (status = aweme.getStatus()) != null) {
            num = Integer.valueOf(status.getPrivateStatus());
        }
        yp.LLIIIILZ.setValue(num);
    }

    @QD3
    public final void onFeedDislikeEventEvent(C2KI c2ki) {
        if (requireActivity().isFinishing() || requireActivity().isDestroyed() || !isVisible() || DV4.LIZ() == 1 || DV4.LIZ() == 3) {
            return;
        }
        yp().gv0(EnumC201127uu.PULL_UP);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(C56642Ke event) {
        Aweme aweme;
        ActivityC45651qj mo49getActivity;
        String str;
        String str2;
        String str3;
        o.LJIIIZ(event, "event");
        try {
            if (TextUtils.equals("videoReportSuccess", JSONObjectProtectorUtils.getString(event.LJLIL, "eventName"))) {
                String string = JSONObjectProtectorUtils.getString(JSONObjectProtectorUtils.getJSONObject(event.LJLIL, "data"), "object_id");
                FullPageParam fullPageParam = this.LLZ;
                String str4 = null;
                if (fullPageParam != null) {
                    aweme = fullPageParam.getAweme();
                    if (aweme != null) {
                        str4 = aweme.getAid();
                    }
                } else {
                    aweme = null;
                }
                if (TextUtils.equals(str4, string)) {
                    if (aweme != null) {
                        Boolean bool = Boolean.TRUE;
                        Context context = getContext();
                        if (context == null || (str = context.getString(R.string.q2i)) == null) {
                            str = "";
                        }
                        Context context2 = getContext();
                        if (context2 == null || (str2 = context2.getString(R.string.q2g)) == null) {
                            str2 = "";
                        }
                        Context context3 = getContext();
                        if (context3 == null || (str3 = context3.getString(R.string.q2h)) == null) {
                            str3 = "";
                        }
                        aweme.setReportMaskInfo(new VideoMaskInfo(bool, 1, 1, null, null, str, str2, str3, null));
                    }
                    AwemeService.LIZ().R1(aweme);
                }
                ActivityC45651qj mo49getActivity2 = mo49getActivity();
                if (mo49getActivity2 != null && !mo49getActivity2.isFinishing() && (mo49getActivity = mo49getActivity()) != null) {
                    mo49getActivity.finish();
                }
            }
        } catch (JSONException unused) {
        }
    }

    @QD3(priority = 1)
    public final void onRemoveVideoToMixEvent(C56102Ic event) {
        o.LJIIIZ(event, "event");
        if (event.LJLIL == null || requireActivity().isFinishing() || requireActivity().isDestroyed() || !isVisible() || this.LLZ == null) {
            return;
        }
        EventBus.LIZJ().LIZIZ(event);
        C200987ug c200987ug = this.LLZIL;
        if (c200987ug == null) {
            return;
        }
        c200987ug.LIZIZ();
    }

    @QD3
    public final void onVideoDiggUpdate(C50420Jqa c50420Jqa) {
        String str;
        FullPageParam fullPageParam;
        Aweme aweme;
        PostModeDetailParams postModeDetailParams;
        FullPageParam fullPageParam2 = this.LLZ;
        if (fullPageParam2 != null && (postModeDetailParams = fullPageParam2.getPostModeDetailParams()) != null) {
            str = postModeDetailParams.enterMethod;
        } else {
            str = null;
        }
        if (!o.LJ(str, "homepage_explore") || c50420Jqa == null || (fullPageParam = this.LLZ) == null || (aweme = fullPageParam.getAweme()) == null || c50420Jqa.LJLIL != 13 || !o.LJ(c50420Jqa.LJLILLLLZI, aweme.getAid())) {
            return;
        }
        PostDiggViewModel postDiggViewModel = (PostDiggViewModel) this.LLZZ.getValue();
        postDiggViewModel.LJLJLJ = aweme;
        postDiggViewModel.setState(new AqS134S0200000_3(postDiggViewModel, aweme, 203));
    }

    @Override // com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "-1827926634661695314");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/fullpagev3/PostModeDetailFragmentV3", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/fullpagev3/PostModeDetailFragmentV3", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.setUserVisibleHint(z);
        StayTimeFragmentComponent stayTimeFragmentComponent = this.LLZL;
        if (stayTimeFragmentComponent != null) {
            stayTimeFragmentComponent.LJLJI = z;
            if (z) {
                stayTimeFragmentComponent.LJLILLLLZI = System.currentTimeMillis();
            } else {
                stayTimeFragmentComponent.LIZ();
            }
        }
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/fullpagev3/PostModeDetailFragmentV3", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    @QD3
    public final void shareCompleteEvent(C107794Kx event) {
        Aweme aweme;
        o.LJIIIZ(event, "event");
        if (requireActivity().isFinishing() || requireActivity().isDestroyed() || !isVisible() || !TextUtils.equals("aweme_photo", event.LJLJJI)) {
            return;
        }
        C31081Jw c31081Jw = new C31081Jw((BottomToastVM) ViewModelProviders.of(this).get(BottomToastVM.class));
        FullPageParam fullPageParam = this.LLZ;
        if (fullPageParam != null) {
            aweme = fullPageParam.getAweme();
        } else {
            aweme = null;
        }
        AnonymousClass922.LIZLLL(event, c31081Jw, 0L, aweme);
        C2U8.LIZ(new C108814Ov(0L));
    }

    @QD3
    public final void videoEvent(C50420Jqa c50420Jqa) {
        Aweme aweme;
        if (c50420Jqa == null || c50420Jqa.LJLIL != 54) {
            return;
        }
        Object obj = c50420Jqa.LJLILLLLZI;
        if (!(obj instanceof Aweme) || (aweme = (Aweme) obj) == null) {
            return;
        }
        xp(aweme.isCollected());
    }

    public final void xp(boolean z) {
        String str;
        Aweme aweme;
        if (requireActivity().isFinishing() || requireActivity().isDestroyed() || !isVisible()) {
            return;
        }
        Aweme aweme2 = null;
        if (!C52535Kjb.LIZ()) {
            PostModeFavoriteViewModel postModeFavoriteViewModel = (PostModeFavoriteViewModel) this.LLZZLLIL.getValue();
            FullPageParam fullPageParam = this.LLZ;
            if (fullPageParam != null) {
                aweme2 = fullPageParam.getAweme();
            }
            postModeFavoriteViewModel.gv0(aweme2);
        }
        yp().LJZL.setValue(Boolean.valueOf(z));
        if (!z) {
            return;
        }
        IFavoriteService LJIJJLI = FavoriteServiceImpl.LJIJJLI();
        o.LJIIIIZZ(LJIJJLI, "get().getService(\n      …ce::class.java,\n        )");
        if (C52535Kjb.LIZ()) {
            return;
        }
        ActivityC45651qj requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        FullPageParam fullPageParam2 = this.LLZ;
        if (fullPageParam2 == null || (aweme = fullPageParam2.getAweme()) == null || (str = aweme.getAid()) == null) {
            str = "";
        }
        View bottom_container = _$_findCachedViewById(R.id.ap_);
        o.LJIIIIZZ(bottom_container, "bottom_container");
        LJIJJLI.LJIILLIIL(requireActivity, str, "graphic_detail", bottom_container);
    }

    @Override // com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragment, com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment
    public final void fp(CharSequence charSequence, long j) {
        String str;
        PostModeContainerViewModel yp = yp();
        String valueOf = String.valueOf(charSequence);
        MutableLiveData<OSZ<String, String>> mutableLiveData = yp.LJZ;
        try {
            str = C77123UOp.LJJIIJ(j);
            o.LJIIIIZZ(str, "{\n            I18nUiKit.…t(commentCount)\n        }");
        } catch (Exception unused) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        mutableLiveData.setValue(new OSZ<>(valueOf, str));
    }

    @Override // com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragment, com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        PostModeDetailParams postModeDetailParams;
        long j;
        boolean z;
        PostModeDetailParams postModeDetailParams2;
        Aweme aweme;
        PostModeDetailParams postModeDetailParams3;
        Aweme aweme2;
        PostModeDetailParams postModeDetailParams4;
        PostModeDetailParams postModeDetailParams5;
        String str;
        FullPageBottomActionBarAssem pQ;
        int max;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View _$_findCachedViewById = _$_findCachedViewById(R.id.j7a);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.setVisibility(8);
        }
        Bundle arguments = getArguments();
        PostModeDetailParams postModeDetailParams6 = null;
        if (arguments != null) {
            postModeDetailParams = (PostModeDetailParams) arguments.getParcelable("POST_DETAIL_PARAMS");
        } else {
            postModeDetailParams = null;
        }
        int i = 0;
        if (postModeDetailParams == null) {
            postModeDetailParams = new PostModeDetailParams(0);
        }
        Aweme aweme3 = ((PhotoSharedViewModel) this.LLZLLLL.getValue()).LJLILLLLZI;
        if (aweme3 != null) {
            Context requireContext = requireContext();
            o.LJIIIIZZ(requireContext, "requireContext()");
            this.LLZIL = new C200987ug(aweme3, postModeDetailParams, requireContext);
            this.LLZ = new FullPageParam(aweme3, postModeDetailParams, getArguments(), this.LLZIL);
        }
        yp().LLILII = JHI.LIZ().LIZ;
        JHI.LIZ().LIZ = null;
        PostModeFullPageViewModel zp = zp();
        zp.LJLLILLLL = postModeDetailParams.position;
        zp.uv0(postModeDetailParams.postModeEntranceMechanism, postModeDetailParams.isEnableAutoSlidePhoto);
        if (postModeDetailParams.isPlayerPaused) {
            zp.setState(C200797uN.LJLIL);
        }
        Long l = postModeDetailParams.pauseTime;
        if (l != null) {
            j = l.longValue();
        } else {
            j = -1;
        }
        zp.LJLLJ = j;
        C201607vg c201607vg = (C201607vg) _$_findCachedViewById(R.id.c1q);
        if (c201607vg != null) {
            c201607vg.setLeftCallback(new AqS153S0100000_3(this, 1539));
        }
        BottomToastVM bottomToastVM = (BottomToastVM) ViewModelProviders.of(this).get(BottomToastVM.class);
        bottomToastVM.gv0(this);
        bottomToastVM.iv0(this);
        PostModeContainerViewModel yp = yp();
        Boolean bool = postModeDetailParams.isMuted;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        yp.iv0(z);
        String str2 = "";
        if (postModeDetailParams.needMobVideoPlay) {
            Analysis analysis = new Analysis();
            String str3 = postModeDetailParams.eventType;
            if (str3 == null) {
                str3 = "";
            }
            analysis.setLabelName(str3);
            this.LLZL = new StayTimeFragmentComponent(this, analysis);
        }
        if (!postModeDetailParams.isPlayerPaused) {
            Bp().kv0();
        }
        if (postModeDetailParams.postModeEntranceMechanism == PostModeEntranceMechanism.TAP_PHOTO && C201587ve.LIZ()) {
            zp().LJLLJ = TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
            getPlayerManager().LJIILJJIL();
        }
        yp().LLIIJI.observe(getViewLifecycleOwner(), new AObserverS71S0100000_3(this, 50));
        yp().LLIL.observe(getViewLifecycleOwner(), new AObserverS71S0100000_3(this, 51));
        yp().LJLLL.observe(getViewLifecycleOwner(), new AObserverS71S0100000_3(this, 52));
        C57092Lx.LIZ.getClass();
        int LIZ = C61447O9r.LIZ();
        int i2 = C61447O9r.LJIILJJIL;
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.ap_);
        if (_$_findCachedViewById2 != null && (max = Math.max(LIZ, i2)) > 0) {
            _$_findCachedViewById2.setMinimumHeight(max);
        }
        int i3 = C61447O9r.LJIILIIL;
        View _$_findCachedViewById3 = _$_findCachedViewById(R.id.lgd);
        if (_$_findCachedViewById3 != null && i3 > 0) {
            ViewGroup.LayoutParams layoutParams = _$_findCachedViewById3.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = i3;
            }
            _$_findCachedViewById3.setLayoutParams(layoutParams);
            _$_findCachedViewById3.setVisibility(0);
        }
        FullPageParam fullPageParam = this.LLZ;
        if (fullPageParam != null) {
            C8VV.LIZ(this, false, new AqS134S0200000_3(this, fullPageParam, 221));
            FullPageBottomActionBarAbility fullPageBottomActionBarAbility = (FullPageBottomActionBarAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(this, null), FullPageBottomActionBarAbility.class, null);
            if (fullPageBottomActionBarAbility != null && (pQ = fullPageBottomActionBarAbility.pQ()) != null) {
                Ml(new InterfaceC174106sQ(pQ) { // from class: X.77u
                    public final InterfaceC174146sU LIZ;

                    @Override // X.InterfaceC174106sQ
                    public final void LIZIZ(C175216uD c175216uD) {
                    }

                    @Override // X.InterfaceC174106sQ
                    public final InterfaceC174146sU LIZ() {
                        return this.LIZ;
                    }

                    {
                        this.LIZ = pQ;
                    }
                });
            }
        }
        FullPageParam fullPageParam2 = this.LLZ;
        if (fullPageParam2 != null) {
            C8VV.LIZ(this, false, new AqS134S0200000_3(this, fullPageParam2, 223));
        }
        View _$_findCachedViewById4 = _$_findCachedViewById(R.id.e4d);
        if (_$_findCachedViewById4 != null) {
            _$_findCachedViewById4.addOnLayoutChangeListener(new IDCListenerS253S0100000_3(new AqS169S0100000_3(this, 767), 7));
        }
        FullPageParam fullPageParam3 = this.LLZ;
        if (fullPageParam3 != null) {
            C8VV.LIZ(this, false, new AqS134S0200000_3(this, fullPageParam3, 222));
        }
        FullPageParam fullPageParam4 = this.LLZ;
        if (fullPageParam4 != null) {
            C8VV.LIZ(this, false, new AqS134S0200000_3(this, fullPageParam4, 224));
        }
        FullPageParam fullPageParam5 = this.LLZ;
        if (fullPageParam5 != null && (postModeDetailParams2 = fullPageParam5.getPostModeDetailParams()) != null && postModeDetailParams2.needMobVideoPlay) {
            getPlayerManager().LJJIIZ();
            FullPageParam fullPageParam6 = this.LLZ;
            if (fullPageParam6 != null) {
                aweme = fullPageParam6.getAweme();
            } else {
                aweme = null;
            }
            FullPageParam fullPageParam7 = this.LLZ;
            if (fullPageParam7 != null) {
                postModeDetailParams3 = fullPageParam7.getPostModeDetailParams();
            } else {
                postModeDetailParams3 = null;
            }
            C2043680i c2043680i = new C2043680i(aweme, postModeDetailParams3, getContext(), this);
            InterfaceC46330IGg playerManager = c2043680i.getPlayerManager();
            FullPageParam fullPageParam8 = this.LLZ;
            if (fullPageParam8 != null) {
                aweme2 = fullPageParam8.getAweme();
            } else {
                aweme2 = null;
            }
            FullPageParam fullPageParam9 = this.LLZ;
            if (fullPageParam9 != null) {
                postModeDetailParams6 = fullPageParam9.getPostModeDetailParams();
            }
            PostModeTimeLoggerViewModel Bp = Bp();
            FullPageParam fullPageParam10 = this.LLZ;
            if (fullPageParam10 != null && (postModeDetailParams5 = fullPageParam10.getPostModeDetailParams()) != null && (str = postModeDetailParams5.eventType) != null) {
                str2 = str;
            }
            FullPageParam fullPageParam11 = this.LLZ;
            if (fullPageParam11 != null && (postModeDetailParams4 = fullPageParam11.getPostModeDetailParams()) != null) {
                i = postModeDetailParams4.pageType;
            }
            PostModeOnUIPlayListener postModeOnUIPlayListener = new PostModeOnUIPlayListener(aweme2, postModeDetailParams6, Bp, str2, i, c2043680i);
            postModeOnUIPlayListener.LJIIIIZZ(postModeOnUIPlayListener.LJLIL, this);
            playerManager.LJJJLL(postModeOnUIPlayListener);
        } else {
            getPlayerManager().LJJJLL(new OnUIPlayListener() { // from class: X.8oV
                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ OnUIPlayListener getWrapperedListener() {
                    return C222688oa.LIZ(this);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onBufferedPercent(String str4, long j2, int i4) {
                    C222688oa.LIZIZ(this, str4, j2, i4);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onBufferedTimeMs(String str4, long j2) {
                    C222688oa.LIZJ(this, str4, j2);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onBuffering(String str4, boolean z2) {
                    C222688oa.LIZLLL(this, str4, z2);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onBuffering(String str4, boolean z2, IPH iph) {
                    C222688oa.LJ(this, str4, z2, iph);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onBuffering(boolean z2) {
                    C222688oa.LJFF(this, z2);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onCompleteLoaded(String str4, boolean z2) {
                    C222688oa.LJI(this, str4, z2);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onDecoderBuffering(String str4, boolean z2) {
                    C222688oa.LJII(this, str4, z2);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onDecoderBuffering(String str4, boolean z2, IPH iph) {
                    C222688oa.LJIIIIZZ(this, str4, z2, iph);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onDecoderBuffering(boolean z2) {
                    C222688oa.LJIIIZ(this, z2);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onFrameAboutToBeRendered(int i4, long j2, long j3, java.util.Map map) {
                    C222688oa.LJIIJ(this, i4, j2, j3, map);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onMaskInfoCallback(String str4, ITW itw) {
                    C222688oa.LJIIJJI(this, str4, itw);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPausePlay(String str4) {
                    C222688oa.LJIIL(this, str4);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPausePlay(String str4, IPH iph) {
                    C222688oa.LJIILIIL(this, str4, iph);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayCompleted(String str4) {
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPlayCompleted(String str4, int i4) {
                    C222688oa.LJIILL(this, str4, i4);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPlayCompletedFirstTime(String str4) {
                    C222688oa.LJIILLIIL(this, str4);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPlayCompletedFirstTime(String str4, IPH iph) {
                    C222688oa.LJIIZILJ(this, str4, iph);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPlayFailed(IPG ipg) {
                    C222688oa.LJIJJ(this, ipg);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPlayFailed(String str4, IPG ipg) {
                    C222688oa.LJIJ(this, str4, ipg);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPlayFailed(String str4, IPG ipg, IPH iph) {
                    C222688oa.LJIJI(this, str4, ipg, iph);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPlayPrepare(String str4) {
                    C222688oa.LJIL(this, str4);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPlayPrepared(String str4) {
                    C222688oa.LJJ(this, str4);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPlayProgressChange(float f) {
                    C222688oa.LJJI(this, f);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPlayProgressChange(String str4, long j2, long j3) {
                    C222688oa.LJJIFFI(this, str4, j2, j3);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPlayRelease(String str4) {
                    C222688oa.LJJII(this, str4);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPlayStop(String str4) {
                    C222688oa.LJJIII(this, str4);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPlayStop(String str4, JSONObject jSONObject) {
                    C222688oa.LJJIIJ(this, str4, jSONObject);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPlayStop(String str4, JSONObject jSONObject, IPH iph) {
                    C222688oa.LJJIIJZLJL(this, str4, jSONObject, iph);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPlayStop(String str4, boolean z2) {
                    C222688oa.LJJIIZ(this, str4, z2);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPlayerInternalEvent(String str4, int i4, JSONObject jSONObject) {
                    C222688oa.LJJIIZI(this, str4, i4, jSONObject);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPlaying(String str4) {
                    C222688oa.LJJIJ(this, str4);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPlaying(String str4, IPH iph) {
                    C222688oa.LJJIJIIJI(this, str4, iph);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPreRenderSessionMissed(String str4) {
                    C222688oa.LJJIJIIJIL(this, str4);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPreparePlay(String str4) {
                    C222688oa.LJJIJIL(this, str4);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPreparePlay(String str4, IPH iph) {
                    C222688oa.LJJIJL(this, str4, iph);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onRenderFirstFrame(IT4 it4) {
                    C222688oa.LJJIL(this, it4);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onRenderFirstFrame(String str4, IT4 it4) {
                    C222688oa.LJJIJLIJ(this, str4, it4);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onRenderFirstFrameFromResume(String str4) {
                    C222688oa.LJJIZ(this, str4);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onRenderReady(IPH iph) {
                    C222688oa.LJJJ(this, iph);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onResumePlay(String str4) {
                    C222688oa.LJJJI(this, str4);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onRetryOnError(IPG ipg) {
                    C222688oa.LJJJJI(this, ipg);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onRetryOnError(String str4, IPG ipg) {
                    C222688oa.LJJJJ(this, str4, ipg);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onSeekEnd(String str4, boolean z2) {
                    C222688oa.LJJJJIZL(this, str4, z2);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onSeekStart(String str4, int i4, float f) {
                    C222688oa.LJJJJJ(this, str4, i4, f);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onSpeedChanged(String str4, float f) {
                    C222688oa.LJJJJJL(this, str4, f);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onVideoBitrateChanged(String str4, EnumC47177IfN enumC47177IfN, int i4) {
                    C222688oa.LJJJJL(this, str4, enumC47177IfN, i4);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onVideoSizeChanged(String str4, int i4, int i5) {
                    C222688oa.LJJJJLI(this, str4, i4, i5);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayPause(String str4) {
                    Aweme aweme4;
                    C222688oa.LJIJJLI(this, str4);
                    PostModeTimeLoggerViewModel Bp2 = PostModeDetailFragmentV3.this.Bp();
                    FullPageParam fullPageParam12 = PostModeDetailFragmentV3.this.LLZ;
                    PostModeDetailParams postModeDetailParams7 = null;
                    if (fullPageParam12 != null) {
                        aweme4 = fullPageParam12.getAweme();
                    } else {
                        aweme4 = null;
                    }
                    FullPageParam fullPageParam13 = PostModeDetailFragmentV3.this.LLZ;
                    if (fullPageParam13 != null) {
                        postModeDetailParams7 = fullPageParam13.getPostModeDetailParams();
                    }
                    Bp2.jv0(aweme4, postModeDetailParams7);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onResumePlay(String str4, IPH iph) {
                    C222688oa.LJJJIL(this, str4, iph);
                    PostModeDetailFragmentV3.this.Bp().kv0();
                    C212418Vh.LJIIL(PostModeDetailFragmentV3.this.zp(), new AqS169S0100000_3(PostModeDetailFragmentV3.this, 768));
                }
            });
        }
        if (C52535Kjb.LIZ()) {
            if (C52535Kjb.LIZIZ()) {
                AwemeCollectionAgent.LJIILLIIL().LJFF(this.LLZZZIL);
            } else {
                AwemeCollectionAgent.LJIILLIIL().LJI(this);
            }
        }
    }

    @Override // X.AnonymousClass885
    public final void id(String str, Boolean bool, EnumC2063587z enumC2063587z) {
        C192517h1.LIZ(this, str, bool.booleanValue(), enumC2063587z);
    }

    @Override // com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragment, com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        View LIZIZ = C38619FDr.LIZIZ(R.layout.c1m, requireContext, viewGroup, false);
        try {
            ViewTreeLifecycleOwner.set(LIZIZ, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LIZIZ, this);
            C10A.LIZIZ(LIZIZ, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LIZIZ;
    }

    @Override // X.InterfaceC192527h2
    public final void u8(String id, boolean z, EnumC2063587z source) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(source, "source");
        if (z && source == EnumC2063587z.MUTATION) {
            xp(z);
        }
    }
}

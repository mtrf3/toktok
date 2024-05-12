package com.ss.android.ugc.aweme.ui.fragment;

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
import X.C187167We;
import X.C187227Wk;
import X.C192517h1;
import X.C198247qG;
import X.C200207tQ;
import X.C200217tR;
import X.C200837uR;
import X.C200847uS;
import X.C200897uX;
import X.C200907uY;
import X.C200917uZ;
import X.C200927ua;
import X.C200937ub;
import X.C201467vS;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C221108m2;
import X.C29S;
import X.C2KI;
import X.C2U8;
import X.C31081Jw;
import X.C33Q;
import X.C3C5;
import X.C3C8;
import X.C50420Jqa;
import X.C52535Kjb;
import X.C55045Liz;
import X.C56102Ic;
import X.C56132If;
import X.C56412MCa;
import X.C56642Ke;
import X.C56832Kx;
import X.C62822Ol8;
import X.C65300Pk0;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78926UyI;
import X.C86641XzR;
import X.C8YZ;
import X.C90903hW;
import X.DV4;
import X.EnumC201127uu;
import X.EnumC2063587z;
import X.IWF;
import X.InterfaceC192527h2;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC46330IGg;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KPL;
import X.OSK;
import X.OSL;
import X.OSM;
import X.QD3;
import X.TBW;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.favorites.business.aweme.AwemeCollectionAgent;
import com.ss.android.ugc.aweme.favorites.service.FavoriteServiceImpl;
import com.ss.android.ugc.aweme.favorites.service.IFavoriteService;
import com.ss.android.ugc.aweme.feed.bottom.BottomToastVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.profile.model.CollectAwemeEvent;
import com.ss.android.ugc.aweme.screenshot.IScreenshotService;
import com.ss.android.ugc.aweme.screenshot.ScreenShotService;
import com.ss.android.ugc.aweme.ui.common.PhotoSharedViewModel;
import com.ss.android.ugc.aweme.ui.feed.photos.PostModeFullPageViewModel;
import com.ss.android.ugc.aweme.ui.util.StayTimeFragmentComponent;
import com.ss.android.ugc.aweme.viewmodel.PostDiggViewModel;
import com.ss.android.ugc.aweme.viewmodel.PostModeCommentViewModel;
import com.ss.android.ugc.aweme.viewmodel.PostModeContainerViewModel;
import com.ss.android.ugc.aweme.viewmodel.PostModeFavoriteViewModel;
import com.ss.android.ugc.aweme.viewmodel.PostModeShareViewModel;
import com.ss.android.ugc.aweme.viewmodel.PostModeTimeLoggerViewModel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS60S0110000_3;
import kotlin.jvm.internal.AqS61S0110000_4;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;

/* loaded from: classes4.dex */
public final class PostModeDetailFragment extends CommonPageFragment implements KPL, InterfaceC192527h2 {
    public long LJLILLLLZI;
    public int LJLJI;
    public StayTimeFragmentComponent LJLJJI;
    public C200847uS LJLJL;
    public final C214298b3 LJLJLJ;
    public final C214378bB LJLJLLL;
    public final C214378bB LJLL;
    public final C214298b3 LJLLI;
    public final C214298b3 LJLLILLLL;
    public final C214298b3 LJLLJ;
    public C200207tQ LJLLL;
    public C198247qG LJLLLL;
    public InterfaceC46330IGg LJLLLLLL;
    public final C200837uR LJLZ;
    public boolean LJZ;
    public final Map<Integer, View> LJZI = new LinkedHashMap();
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1143));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1144));

    @Override // com.ss.android.ugc.aweme.base.ui.CommonPageFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJZI).clear();
    }

    @Override // com.ss.android.ugc.aweme.base.ui.CommonPageFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJZI;
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

    @Override // X.KPL, X.C8YZ
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public final C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.CommonPageFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public PostModeDetailFragment() {
        AqS60S0110000_3 LJJ;
        AqS60S0110000_3 LJJ2;
        C65776Prg LIZ = C65352Pkq.LIZ(PostModeFullPageViewModel.class);
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(LIZ, 1145);
        C200897uX c200897uX = C200897uX.INSTANCE;
        C214528bQ c214528bQ = C214528bQ.LJLIL;
        AqS61S0110000_4 LJJII = C78926UyI.LJJII(this, false);
        AqS60S0110000_3 LJJIIJZLJL = C78926UyI.LJJIIJZLJL(this, false);
        C184077Kh c184077Kh = C184077Kh.LJLIL;
        this.LJLJLJ = new C214298b3(LIZ, aqS153S0100000_3, c214528bQ, LJJII, LJJIIJZLJL, c184077Kh, c200897uX, (InterfaceC65784Pro) null, 384);
        C65776Prg LIZ2 = C65352Pkq.LIZ(PhotoSharedViewModel.class);
        AqS153S0100000_3 aqS153S0100000_32 = new AqS153S0100000_3((Fragment) this, 1671);
        C1807677o c1807677o = C1807677o.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJJ = C78926UyI.LJJ(this, false);
        } else {
            LJJ = C78926UyI.LJJ(this, true);
        }
        this.LJLJLLL = new C214378bB(LIZ2, aqS153S0100000_32, c214528bQ, C78926UyI.LJJII(this, false), c184077Kh, c1807677o, LJJ, C78926UyI.LJIILLIIL(this, true));
        C65776Prg LIZ3 = C65352Pkq.LIZ(PostDiggViewModel.class);
        C200937ub c200937ub = C200937ub.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJJ2 = C78926UyI.LJJ(this, false);
        } else {
            LJJ2 = C78926UyI.LJJ(this, true);
        }
        this.LJLL = new C214378bB(LIZ3, null, c214528bQ, C78926UyI.LJJII(this, false), c184077Kh, c200937ub, LJJ2, C78926UyI.LJIILLIIL(this, true));
        C65776Prg LIZ4 = C65352Pkq.LIZ(PostModeCommentViewModel.class);
        InterfaceC65784Pro interfaceC65784Pro = null;
        int i = 384;
        this.LJLLI = new C214298b3(LIZ4, new AqS153S0100000_3(LIZ4, 1146), c214528bQ, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), c184077Kh, C200907uY.INSTANCE, interfaceC65784Pro, i);
        C65776Prg LIZ5 = C65352Pkq.LIZ(PostModeFavoriteViewModel.class);
        this.LJLLILLLL = new C214298b3(LIZ5, new AqS153S0100000_3(LIZ5, 1147), c214528bQ, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), c184077Kh, C200917uZ.INSTANCE, interfaceC65784Pro, i);
        C65776Prg LIZ6 = C65352Pkq.LIZ(PostModeShareViewModel.class);
        this.LJLLJ = new C214298b3(LIZ6, new AqS153S0100000_3(LIZ6, 1148), c214528bQ, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), c184077Kh, C200927ua.INSTANCE, interfaceC65784Pro, i);
        this.LJLZ = new C200837uR(this);
    }

    public final PhotoSharedViewModel Al() {
        return (PhotoSharedViewModel) this.LJLJLLL.getValue();
    }

    public final PostModeFullPageViewModel Dl() {
        return (PostModeFullPageViewModel) this.LJLJLJ.getValue();
    }

    public final PostModeContainerViewModel Gl() {
        return (PostModeContainerViewModel) this.LJLJJL.getValue();
    }

    public final PostModeTimeLoggerViewModel Hl() {
        return (PostModeTimeLoggerViewModel) this.LJLJJLL.getValue();
    }

    public final void Il() {
        Aweme aweme;
        Aweme aweme2;
        PostModeDetailParams postModeDetailParams;
        if (this.LJZ) {
            return;
        }
        this.LJZ = true;
        int i = Gl().LLILLJJLI;
        int i2 = Gl().LLILLL;
        if (i > 0) {
            double d = i2 / i;
            PostModeDetailParams postModeDetailParams2 = null;
            if (i > 0) {
                C200847uS c200847uS = this.LJLJL;
                if (c200847uS != null) {
                    aweme2 = c200847uS.LIZJ;
                    postModeDetailParams = c200847uS.LJI;
                } else {
                    aweme2 = null;
                    postModeDetailParams = null;
                }
                C201467vS.LJIIIZ("graphic_detail_finish_rate", aweme2, postModeDetailParams, Integer.valueOf(Dl().LJLLILLLL), Double.valueOf(d), null, 1736);
            }
            if (d >= 1.0d) {
                C200847uS c200847uS2 = this.LJLJL;
                if (c200847uS2 != null) {
                    aweme = c200847uS2.LIZJ;
                    postModeDetailParams2 = c200847uS2.LJI;
                } else {
                    aweme = null;
                }
                C201467vS.LJIILJJIL(aweme, postModeDetailParams2, Integer.valueOf(Dl().LJLLILLLL));
            }
        }
    }

    public final InterfaceC46330IGg getPlayerManager() {
        InterfaceC46330IGg interfaceC46330IGg = this.LJLLLLLL;
        if (interfaceC46330IGg == null) {
            InterfaceC46330IGg LJJLIIIIJ = IWF.LJJLIIIIJ();
            o.LJIIIIZZ(LJJLIIIIJ, "inst()");
            return LJJLIIIIJ;
        }
        return interfaceC46330IGg;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LJLLLL = null;
        this.LJLLL = null;
        C198247qG c198247qG = this.LJLLLL;
        if (c198247qG != null) {
            c198247qG.setTitleComponent(null);
        }
        C198247qG c198247qG2 = this.LJLLLL;
        if (c198247qG2 != null) {
            c198247qG2.setDescriptionComponent(null);
        }
        C198247qG c198247qG3 = this.LJLLLL;
        if (c198247qG3 != null) {
            c198247qG3.setFollowComponent(null);
        }
        C198247qG c198247qG4 = this.LJLLLL;
        if (c198247qG4 != null) {
            c198247qG4.setAnimationComponent(null);
        }
        C198247qG c198247qG5 = this.LJLLLL;
        if (c198247qG5 != null) {
            c198247qG5.setPhotosIndicatorComponent(null);
        }
        C198247qG c198247qG6 = this.LJLLLL;
        if (c198247qG6 != null) {
            c198247qG6.setDiggComponent(null);
        }
        C198247qG c198247qG7 = this.LJLLLL;
        if (c198247qG7 != null) {
            c198247qG7.setPostModeCommentStatusComponent(null);
        }
        C198247qG c198247qG8 = this.LJLLLL;
        if (c198247qG8 != null) {
            c198247qG8.setStickerComponent(null);
        }
        this.LJLJL = null;
        this.LJLLLLLL = null;
        if (C52535Kjb.LIZ()) {
            if (C52535Kjb.LIZIZ()) {
                AwemeCollectionAgent.LJIILLIIL().LIZJ(this.LJLZ);
            } else {
                AwemeCollectionAgent.LJIILLIIL().LJIIIIZZ(this);
            }
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        Aweme aweme;
        String str;
        PostModeDetailParams postModeDetailParams;
        super.onPause();
        pausePlayer();
        Il();
        long currentTimeMillis = System.currentTimeMillis() - this.LJLILLLLZI;
        C200847uS c200847uS = this.LJLJL;
        PostModeDetailParams postModeDetailParams2 = null;
        if (c200847uS != null) {
            aweme = c200847uS.LIZJ;
            postModeDetailParams2 = c200847uS.LJI;
        } else {
            aweme = null;
        }
        C201467vS.LJIILL(aweme, postModeDetailParams2, currentTimeMillis);
        IScreenshotService LJIIIZ = ScreenShotService.LJIIIZ();
        C200847uS c200847uS2 = this.LJLJL;
        if (c200847uS2 == null || (postModeDetailParams = c200847uS2.LJI) == null || (str = postModeDetailParams.previousPage) == null) {
            str = "";
        }
        LJIIIZ.LJI(str);
        this.LJZ = false;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        String str;
        PostModeDetailParams postModeDetailParams;
        super.onResume();
        C212418Vh.LJIIL(Dl(), new AqS169S0100000_3(this, 1016));
        this.LJLILLLLZI = System.currentTimeMillis();
        IScreenshotService LJIIIZ = ScreenShotService.LJIIIZ();
        C200847uS c200847uS = this.LJLJL;
        if (c200847uS == null || (postModeDetailParams = c200847uS.LJI) == null || (str = postModeDetailParams.previousPage) == null) {
            str = "";
        }
        LJIIIZ.LIZ(str, new C187167We(this));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (!EventBus.LIZJ().LJI(this)) {
            EventBus.LIZJ().LJIILJJIL(this);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (EventBus.LIZJ().LJI(this)) {
            EventBus.LIZJ().LJIJ(this);
        }
    }

    public final void pausePlayer() {
        PostModeDetailParams postModeDetailParams;
        T value = Gl().LJLILLLLZI.getValue();
        C200847uS c200847uS = this.LJLJL;
        if (((c200847uS == null || (postModeDetailParams = c200847uS.LJI) == null || postModeDetailParams.enableGestureExit) && (value == EnumC201127uu.SLIDE_RIGHT || value == EnumC201127uu.PULL_DOWN)) || value == EnumC201127uu.BACK) {
            return;
        }
        if (value == EnumC201127uu.PULL_UP) {
            getPlayerManager().LLLLLL();
        } else {
            C212418Vh.LJIIL(Dl(), new AqS169S0100000_3(this, 517));
        }
    }

    public static final void performPause(PostModeDetailFragment postModeDetailFragment) {
        PostModeDetailParams postModeDetailParams;
        ActivityC45651qj mo49getActivity;
        C200847uS c200847uS = postModeDetailFragment.LJLJL;
        if (c200847uS != null && (postModeDetailParams = c200847uS.LJI) != null && postModeDetailParams.needMobVideoPlay && (mo49getActivity = postModeDetailFragment.mo49getActivity()) != null && mo49getActivity.isFinishing()) {
            postModeDetailFragment.getPlayerManager().LLLLLL();
        } else {
            postModeDetailFragment.getPlayerManager().LJIILJJIL();
        }
    }

    @QD3(priority = 1)
    public final void onAddVideoToMixEvent(C56132If event) {
        o.LJIIIZ(event, "event");
        if (event.LJLIL == null || requireActivity().isFinishing() || requireActivity().isDestroyed() || !isVisible()) {
            return;
        }
        EventBus.LIZJ().LIZIZ(event);
        Aweme aweme = event.LJLIL;
        if (aweme != null) {
            ActivityC45651qj requireActivity = requireActivity();
            o.LJIIIIZZ(requireActivity, "requireActivity()");
            MixFeedService.LJJIJIIJIL().LJIIIIZZ(new C56832Kx(aweme, requireActivity, requireActivity));
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @QD3
    public final void onAwemeDeleteEvent(C55045Liz event) {
        o.LJIIIZ(event, "event");
        if (requireActivity().isFinishing() || requireActivity().isDestroyed() || !isVisible()) {
            return;
        }
        Gl().gv0(EnumC201127uu.PULL_UP);
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
        xl(z);
    }

    @QD3
    public final void onCommentEvent(C174046sK c174046sK) {
        Long l;
        AwemeStatistics statistics;
        if (requireActivity().isFinishing() || requireActivity().isDestroyed() || !isVisible() || c174046sK == null) {
            return;
        }
        int i = c174046sK.LJLIL;
        if (i != 3 && i != 4) {
            return;
        }
        PostModeCommentViewModel postModeCommentViewModel = (PostModeCommentViewModel) this.LJLLI.getValue();
        Aweme aweme = c174046sK.LJLJI;
        if (aweme != null && (statistics = aweme.getStatistics()) != null) {
            l = Long.valueOf(statistics.getCommentCount());
        } else {
            l = null;
        }
        postModeCommentViewModel.gv0(l);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        HashMap<String, String> hashMap;
        PostModeDetailParams postModeDetailParams;
        super.onCreate(bundle);
        Dl().LJLLL = new AqS153S0100000_3(this, 1142);
        VideoItemParams videoItemParams = Al().LJLIL;
        if (videoItemParams != null) {
            PostModeFullPageViewModel Dl = Dl();
            C200847uS c200847uS = this.LJLJL;
            if (c200847uS != null && (postModeDetailParams = c200847uS.LJI) != null) {
                hashMap = postModeDetailParams.displayTitleParams;
            } else {
                hashMap = null;
            }
            Dl.ov0(videoItemParams);
            Dl.LJLJLLL.LJII = hashMap;
            Dl.LLD = true;
        }
        Al().LJLIL = null;
    }

    @QD3
    public final void onEvent(C187227Wk event) {
        Integer num;
        View view;
        Aweme aweme;
        AwemeStatus status;
        Aweme aweme2;
        AwemeStatus status2;
        o.LJIIIZ(event, "event");
        if (requireActivity().isFinishing() || requireActivity().isDestroyed() || !isVisible() || event.LJLILLLLZI == null) {
            return;
        }
        C200847uS c200847uS = this.LJLJL;
        if (c200847uS != null && (aweme2 = c200847uS.LIZJ) != null && (status2 = aweme2.getStatus()) != null) {
            status2.setPrivateStatus(event.LJLILLLLZI.getStatus().getPrivateStatus());
        }
        C200207tQ c200207tQ = this.LJLLL;
        if (c200207tQ == null) {
            return;
        }
        C200847uS c200847uS2 = this.LJLJL;
        if (c200847uS2 != null && (aweme = c200847uS2.LIZJ) != null && (status = aweme.getStatus()) != null) {
            num = Integer.valueOf(status.getPrivateStatus());
        } else {
            num = null;
        }
        C86641XzR c86641XzR = c200207tQ.LJLJLJ;
        if (c86641XzR != null) {
            view = c86641XzR.findViewById(R.id.hyw);
        } else {
            view = null;
        }
        if (num == null || num.intValue() != 1) {
            if (view == null) {
                return;
            }
            C16880lQ.LJIIJ(null, view);
            return;
        }
        c200207tQ.LIZIZ(new AqS153S0100000_3(c200207tQ, 1465), false);
    }

    @QD3
    public final void onFeedDislikeEventEvent(C2KI c2ki) {
        if (requireActivity().isFinishing() || requireActivity().isDestroyed() || !isVisible() || DV4.LIZ() == 1 || DV4.LIZ() == 3) {
            return;
        }
        Gl().gv0(EnumC201127uu.PULL_UP);
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
                C200847uS c200847uS = this.LJLJL;
                String str4 = null;
                if (c200847uS != null) {
                    aweme = c200847uS.LIZJ;
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
        if (event.LJLIL == null || requireActivity().isFinishing() || requireActivity().isDestroyed() || !isVisible() || this.LJLJL == null) {
            return;
        }
        EventBus.LIZJ().LIZIZ(event);
        Aweme aweme = event.LJLIL;
        if (aweme != null) {
            ActivityC45651qj requireActivity = requireActivity();
            o.LJIIIIZZ(requireActivity, "requireActivity()");
            C200847uS c200847uS = this.LJLJL;
            if (c200847uS != null) {
                C200217tR.LIZ(aweme, requireActivity, c200847uS);
                return;
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @QD3
    public final void onVideoDiggUpdate(C50420Jqa c50420Jqa) {
        String str;
        C200847uS c200847uS;
        Aweme aweme;
        PostModeDetailParams postModeDetailParams;
        C200847uS c200847uS2 = this.LJLJL;
        if (c200847uS2 != null && (postModeDetailParams = c200847uS2.LJI) != null) {
            str = postModeDetailParams.enterMethod;
        } else {
            str = null;
        }
        if (!o.LJ(str, "homepage_explore") || c50420Jqa == null || (c200847uS = this.LJLJL) == null || (aweme = c200847uS.LIZJ) == null || c50420Jqa.LJLIL != 13 || !o.LJ(c50420Jqa.LJLILLLLZI, aweme.getAid())) {
            return;
        }
        PostDiggViewModel postDiggViewModel = (PostDiggViewModel) this.LJLL.getValue();
        postDiggViewModel.LJLJLJ = aweme;
        postDiggViewModel.setState(new AqS134S0200000_3(postDiggViewModel, aweme, 203));
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "7924549655251711535");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/ui/fragment/PostModeDetailFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/ui/fragment/PostModeDetailFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.setUserVisibleHint(z);
        StayTimeFragmentComponent stayTimeFragmentComponent = this.LJLJJI;
        if (stayTimeFragmentComponent != null) {
            stayTimeFragmentComponent.LJLJI = z;
            if (z) {
                stayTimeFragmentComponent.LJLILLLLZI = System.currentTimeMillis();
            } else {
                stayTimeFragmentComponent.LIZ();
            }
        }
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/ui/fragment/PostModeDetailFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
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
        xl(aweme.isCollected());
    }

    public final void xl(boolean z) {
        String str;
        Aweme aweme;
        C86641XzR c86641XzR;
        if (requireActivity().isFinishing() || requireActivity().isDestroyed() || !isVisible()) {
            return;
        }
        Aweme aweme2 = null;
        if (!C52535Kjb.LIZ()) {
            PostModeFavoriteViewModel postModeFavoriteViewModel = (PostModeFavoriteViewModel) this.LJLLILLLL.getValue();
            C200847uS c200847uS = this.LJLJL;
            if (c200847uS != null) {
                aweme2 = c200847uS.LIZJ;
            }
            postModeFavoriteViewModel.gv0(aweme2);
        }
        C200207tQ c200207tQ = this.LJLLL;
        if (c200207tQ != null && (c86641XzR = c200207tQ.LJLJLJ) != null) {
            c86641XzR.LJJZZI(z);
        }
        if (!z || this.LJLJL == null) {
            return;
        }
        IFavoriteService LJIJJLI = FavoriteServiceImpl.LJIJJLI();
        o.LJIIIIZZ(LJIJJLI, "get().getService(\n      …ce::class.java,\n        )");
        if (C52535Kjb.LIZ()) {
            return;
        }
        ActivityC45651qj requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        C200847uS c200847uS2 = this.LJLJL;
        if (c200847uS2 == null || (aweme = c200847uS2.LIZJ) == null || (str = aweme.getAid()) == null) {
            str = "";
        }
        View bottom_container = _$_findCachedViewById(R.id.ap_);
        o.LJIIIIZZ(bottom_container, "bottom_container");
        LJIJJLI.LJIILLIIL(requireActivity, str, "graphic_detail", bottom_container);
    }

    @QD3
    public final void onEvent(C107794Kx event) {
        Aweme aweme;
        o.LJIIIZ(event, "event");
        if (requireActivity().isFinishing() || requireActivity().isDestroyed() || !isVisible() || !TextUtils.equals("aweme_photo", event.LJLJJI)) {
            return;
        }
        C31081Jw c31081Jw = new C31081Jw((BottomToastVM) ViewModelProviders.of(this).get(BottomToastVM.class));
        C200847uS c200847uS = this.LJLJL;
        if (c200847uS != null) {
            aweme = c200847uS.LIZJ;
        } else {
            aweme = null;
        }
        AnonymousClass922.LIZLLL(event, c31081Jw, 0L, aweme);
        C2U8.LIZ(new C108814Ov(0L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x032a, code lost:
    
        if (r2 != null) goto L135;
     */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r20, android.os.Bundle r21) {
        /*
            Method dump skipped, instructions count: 982
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.fragment.PostModeDetailFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.AnonymousClass885
    public final void id(String str, Boolean bool, EnumC2063587z enumC2063587z) {
        C192517h1.LIZ(this, str, bool.booleanValue(), enumC2063587z);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.c1l, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }

    @Override // X.InterfaceC192527h2
    public final void u8(String id, boolean z, EnumC2063587z source) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(source, "source");
        if (z && source == EnumC2063587z.MUTATION) {
            xl(z);
        }
    }

    @Override // X.C8YM
    public final <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJIIIIZZ(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LIZJ(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJII(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LIZIZ(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C56412MCa<OSK<A, B, C>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super C3C8, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C212418Vh.LIZLLL(this, assemViewModel, tbw, tbw2, tbw3, c56412MCa, interfaceC88472Yns, interfaceC88474Ynu);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C56412MCa<OSL<A, B, C, D>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super C3C8, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C212418Vh.LJ(this, assemViewModel, tbw, tbw2, tbw3, tbw4, c56412MCa, interfaceC88472Yns, interfaceC88475Ynv);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C56412MCa<OSM<A, B, C, D, E>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C212418Vh.LJFF(this, assemViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c56412MCa, interfaceC88472Yns, interfaceC88476Ynw);
    }
}

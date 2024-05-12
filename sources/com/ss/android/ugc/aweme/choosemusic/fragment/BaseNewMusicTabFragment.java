package com.ss.android.ugc.aweme.choosemusic.fragment;

import X.AbstractC029409q;
import X.ActivityC45651qj;
import X.C04330Ez;
import X.C0NY;
import X.C10A;
import X.C141335gf;
import X.C141415gn;
import X.C165706es;
import X.C16880lQ;
import X.C17N;
import X.C188727au;
import X.C2068389v;
import X.C207668Da;
import X.C29S;
import X.C3C5;
import X.C43985HOb;
import X.C46126I8k;
import X.C52908Kpc;
import X.C56464MEa;
import X.C59859NeR;
import X.C5IO;
import X.C60996Nwm;
import X.C61630OGs;
import X.C61632OGu;
import X.C63057Oov;
import X.C72197SVd;
import X.C72H;
import X.C73305Spp;
import X.C73306Spq;
import X.C73312Spw;
import X.C74053T4n;
import X.C74216TAu;
import X.C76800UCe;
import X.C78596Usy;
import X.C78598Ut0;
import X.C79409VEn;
import X.C80588Vk0;
import X.C80647Vkx;
import X.C84868XSm;
import X.C84917XUj;
import X.C84962XWc;
import X.C84982XWw;
import X.C84985XWz;
import X.C90903hW;
import X.C9NH;
import X.EnumC61629OGr;
import X.FKM;
import X.FMX;
import X.HWO;
import X.InterfaceC80650Vl0;
import X.InterfaceC84984XWy;
import X.K2Z;
import X.KO4;
import X.KUN;
import X.N3A;
import X.OGG;
import X.OSZ;
import X.QD3;
import X.SS4;
import X.TK6;
import X.V0Q;
import X.X1D;
import X.XUC;
import X.XUP;
import X.XVF;
import X.XVG;
import X.XVW;
import X.XWG;
import X.XWH;
import X.XWW;
import X.XX6;
import X.XX7;
import X.XY4;
import X.XY7;
import X.XYC;
import X.XYM;
import X.XZ0;
import Y.ACListenerS21S0101000_2;
import Y.AObjectS56S0101000_13;
import Y.AObserverS64S0101000_14;
import Y.ARunnableS21S0110000_15;
import Y.ARunnableS51S0100000_15;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.ss.android.ugc.aweme.adaptation.saa.SAAService;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.challenge.service.ChallengeServiceImpl;
import com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity;
import com.ss.android.ugc.aweme.choosemusic.model.ChooseMusicWithSceneViewModel;
import com.ss.android.ugc.aweme.choosemusic.utils.ChooseMusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.choosemusic.view.ChooseMusicSelectView;
import com.ss.android.ugc.aweme.choosemusic.viewmodel.SelectedMusicViewModel;
import com.ss.android.ugc.aweme.choosemusic.widgets.MusicBannerWidget;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.commercialize.mission.CommerceMissionServiceImpl;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.performance.OpenMusicPanelPerformanceMonitor;
import com.ss.android.ugc.aweme.performance.PerformanceMonitor;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.services.IDLCallbackS0S0300000_7;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.performance.IAVPerformance;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import defpackage.b1;
import java.util.Objects;
import java.util.UUID;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public abstract class BaseNewMusicTabFragment extends AmeBaseFragment implements Observer<C207668Da>, OGG, XY4, XZ0, XUC, InterfaceC80650Vl0, C72H<XYM> {
    public static final String LLILL = C0NY.LIZIZ("android:switcher:", R.id.de6, ":");
    public SS4 LJLIL;
    public C73305Spp LJLILLLLZI;
    public C74053T4n LJLJI;
    public ViewPager LJLJJI;
    public C80647Vkx LJLJJL;
    public View LJLJJLL;
    public DataCenter LJLJL;
    public WidgetManager LJLJLJ;
    public SelectedMusicViewModel LJLJLLL;
    public ChooseMusicWithSceneViewModel LJLL;
    public MusicBannerWidget LJLLILLLL;
    public String LJLLJ;
    public String LJLLL;
    public String LJLLLL;
    public boolean LJLLLLLL;
    public UrlModel LJLZ;
    public String LJZ;
    public int LJZI;
    public int LJZL;
    public MusicModel LL;
    public DiscoverMusicFragment LLFF;
    public CollectMusicFragment LLFFF;
    public ForYouMusicFragment LLFII;
    public LocalMusicTabFragment LLFZ;
    public ChooseMusicDownloadPlayHelper LLI;
    public XVW LLIFFJFJJ;
    public Music LLII;
    public boolean LLIIII;
    public boolean LLIIIILZ;
    public boolean LLIIIJ;
    public boolean LLIIIL;
    public int LLIIIZ;
    public long LLIIJI;
    public long LLIIJLIL;
    public boolean LLIIL;
    public UrlModel LLIILII;
    public int LLIILZL;
    public String LLIIZ;
    public boolean LLIL;
    public TK6 LLILII;
    public EnumC61629OGr LJLLI = EnumC61629OGr.TAB_TYPE_DISCOVER;
    public final boolean LLD = true;
    public final String LLF = "popular_song";
    public final KUN LLILIL = C9NH.LIZ(FKM.LIZ(), "add_fav");

    public abstract void Gl(Intent intent, MusicModel musicModel);

    public abstract void Il();

    @Override // X.XUC
    public final /* synthetic */ void LJJJJIZL(MusicModel musicModel, Exception exc) {
    }

    @Override // X.XUC
    public final /* synthetic */ void LLIZLLLIL() {
    }

    @Override // X.XUC
    public final /* synthetic */ void LLLL(MusicModel musicModel, long j) {
    }

    public abstract void Ll(C207668Da c207668Da);

    public abstract void Pl(LinearLayout linearLayout);

    public abstract void Ql();

    @Override // X.XUC
    public final /* synthetic */ void T3(MusicModel musicModel) {
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    public final void wl() {
        String str;
        this.LLIL = false;
        C73305Spp c73305Spp = this.LJLILLLLZI;
        if (c73305Spp != null) {
            c73305Spp.LJFF();
            this.LJLILLLLZI.setVisibility(0);
        }
        AVExternalServiceImpl.LIZ().provideAVPerformance().step(OpenMusicPanelPerformanceMonitor.INSTANCE, "fetch_music_data");
        String str2 = this.LJLLJ;
        if (str2 != null) {
            XVW xvw = this.LLIFFJFJJ;
            String str3 = this.LJLLL;
            Music music = this.LLII;
            int i = this.LLIIIZ;
            xvw.getClass();
            if (C59859NeR.LIZ()) {
                str = "for_you_tab_challenge_data";
            } else {
                str = "data_challenge";
            }
            ChallengeServiceImpl.LJFF().LIZLLL(str, str2, str3, music, new HWO(xvw, i));
            return;
        }
        this.LLIFFJFJJ.LIZJ(false, this.LJLLL, this.LLII, false, this.LLIIIZ);
    }

    public final SS4 Al() {
        if (this.LJLIL == null) {
            this.LJLIL = new SS4(getContext());
        }
        return this.LJLIL;
    }

    public final AbstractC029409q Dl() {
        int i = C61632OGu.LIZ[this.LJLLI.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i == 5) {
                        return this.LLFZ.xl();
                    }
                    throw new IllegalStateException("Just has three types of View.");
                }
                InterfaceC84984XWy<T> interfaceC84984XWy = this.LLFFF.LJLJLJ;
                if (interfaceC84984XWy == 0) {
                    return null;
                }
                return interfaceC84984XWy.LJJLIIIJJIZ();
            }
            return this.LLFII.xl();
        }
        DiscoverMusicFragment discoverMusicFragment = this.LLFF;
        if (discoverMusicFragment == null) {
            return null;
        }
        return discoverMusicFragment.LJLJJL;
    }

    public final void Hl() {
        XWH xwh;
        C74216TAu c74216TAu = C74216TAu.LIZIZ;
        if (!c74216TAu.LIZIZ() || c74216TAu.LJIIIZ()) {
            return;
        }
        Fragment parentFragment = getParentFragment();
        if (!(parentFragment instanceof BaseChooseMusicFragment) || (xwh = ((BaseChooseMusicFragment) parentFragment).LJLJLLL) == null) {
            return;
        }
        xwh.LIZ(false);
    }

    @Override // X.OGG
    public final View LJIJJ() {
        int i = C61632OGu.LIZ[this.LJLLI.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i == 5) {
                        return this.LLFZ.LJIJJ();
                    }
                    throw new IllegalStateException("Just has three types of View.");
                }
                return this.LLFFF.LJIJJ();
            }
            return this.LLFII.LJIJJ();
        }
        return this.LLFF.LJLIL;
    }

    public final void Ol() {
        C80647Vkx c80647Vkx = this.LJLJJL;
        if (c80647Vkx == null || c80647Vkx.getParent() == null) {
            return;
        }
        int measuredHeight = ((View) this.LJLJJL.getParent()).getMeasuredHeight();
        int curScrollY = (this.LJLJJL.getCurScrollY() + measuredHeight) - this.LJLJJL.getChildAt(0).getMeasuredHeight();
        XX6 xx6 = this.LLFF.LJLJJL;
        if (xx6 == null || xx6.LJLL == curScrollY) {
            return;
        }
        xx6.LJLL = curScrollY;
        xx6.LJLZ(false);
    }

    public final boolean Jl() {
        if (mo49getActivity() == null || mo49getActivity().getIntent() == null) {
            return false;
        }
        return mo49getActivity().getIntent().getBooleanExtra("extra_beat_music_sticker", false);
    }

    @Override // X.XUC
    public final boolean LJJIIZI() {
        return isViewValid();
    }

    @Override // X.XUC
    public final Activity LJJIZ() {
        return mo49getActivity();
    }

    public final C76800UCe Ml() {
        C73305Spp c73305Spp;
        if (C52908Kpc.LIZ() && (c73305Spp = this.LJLILLLLZI) != null) {
            c73305Spp.setClickable(false);
            C16880lQ.LJIIJJI(null, this.LJLILLLLZI);
        }
        wl();
        return C76800UCe.LIZ;
    }

    public final void Nl() {
        AbstractC029409q Dl = Dl();
        if (Dl == null) {
            return;
        }
        if (Dl instanceof XX7) {
            ((XX7) Dl).LJZ();
            return;
        }
        if (!(Dl instanceof XX6)) {
            return;
        }
        XX6 xx6 = (XX6) Dl;
        if (((Integer) xx6.LJLILLLLZI.get("music_position", -1)).intValue() == -1) {
            return;
        }
        XY4 xy4 = xx6.LJLJJI;
        if (xy4 != null) {
            xy4.k2(null);
        }
        xx6.LJLILLLLZI.jv0(-1, "music_position");
        xx6.LJLILLLLZI.jv0(-1, "music_index");
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C84917XUj c84917XUj;
        super.onDestroyView();
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.LLI;
        if (chooseMusicDownloadPlayHelper != null) {
            chooseMusicDownloadPlayHelper.pause();
            this.LLI.onDestroy();
        }
        if (Al() != null) {
            Al().dismiss();
        }
        TK6 tk6 = this.LLILII;
        if (tk6 != null) {
            tk6.LIZJ();
        }
        XVW xvw = this.LLIFFJFJJ;
        if (xvw == null || (c84917XUj = xvw.LJ) == null) {
            return;
        }
        ((C84868XSm) c84917XUj.LJ.getValue()).release();
        xvw.LJ = null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.LLI;
        if (chooseMusicDownloadPlayHelper != null) {
            chooseMusicDownloadPlayHelper.pause();
            this.LLI.LJLLLL = true;
        }
        this.LJLJL.jv0(-1, "music_position");
        this.LJLJL.jv0(-1, "music_index");
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.LLI;
        if (chooseMusicDownloadPlayHelper != null) {
            chooseMusicDownloadPlayHelper.LJLLLL = false;
        }
    }

    @Override // X.InterfaceC80650Vl0
    public final boolean onScrollEnd() {
        AVExternalServiceImpl.LIZ().provideAVPerformance().stopPerformanceMonitor("tool_music_scroll");
        return false;
    }

    @Override // X.XUC
    public final MusicModel LIZLLL() {
        return this.LL;
    }

    @Override // X.C72H
    /* renamed from: Kl, reason: merged with bridge method [inline-methods] */
    public final void onInternalEvent(XYM xym) {
        String str = xym.LIZIZ;
        MusicModel musicModel = xym.LIZ;
        if ("follow_type".equals(str)) {
            this.LLIFFJFJJ.LIZ(musicModel, musicModel.getMusicId(), 1, xym.LIZJ, xym.LIZLLL);
        } else {
            if (!"unfollow_type".equals(str)) {
                return;
            }
            this.LLIFFJFJJ.LIZ(musicModel, musicModel.getMusicId(), 0, xym.LIZJ, xym.LIZLLL);
        }
    }

    public final void Rl(EnumC61629OGr enumC61629OGr) {
        boolean z;
        int i;
        int[] iArr = C61632OGu.LIZ;
        int i2 = iArr[enumC61629OGr.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            this.LLIFFJFJJ.LJIILJJIL();
                            this.LJLJJI.setCurrentItem(C61630OGs.LIZ(enumC61629OGr, false), false);
                            C80647Vkx c80647Vkx = this.LJLJJL;
                            if (c80647Vkx != null) {
                                c80647Vkx.getHelper().LIZIZ = this.LLFZ;
                            }
                            CommerceMediaServiceImpl.LIZJ().LJI(this).kd0(N3A.LOCAL_TAB);
                            LocalMusicTabFragment localMusicTabFragment = this.LLFZ;
                            if (!localMusicTabFragment.LJLLL) {
                                localMusicTabFragment.Nl(localMusicTabFragment.getContext(), new C84985XWz(localMusicTabFragment));
                            }
                        }
                    } else {
                        if (C56464MEa.LIZ()) {
                            i = 50;
                        } else {
                            i = 20;
                        }
                        this.LLIFFJFJJ.LJIILIIL(i, this.LLIIIZ, true);
                        this.LJLJJI.setCurrentItem(C61630OGs.LIZ(enumC61629OGr, false), false);
                        C80647Vkx c80647Vkx2 = this.LJLJJL;
                        if (c80647Vkx2 != null) {
                            c80647Vkx2.getHelper().LIZIZ = this.LLFFF;
                        }
                        CommerceMediaServiceImpl.LIZJ().LJI(this).kd0(N3A.FAVORITES);
                    }
                } else {
                    this.LLIFFJFJJ.LJIILJJIL();
                    this.LJLJJI.setCurrentItem(C61630OGs.LIZ(enumC61629OGr, false), false);
                    C80647Vkx c80647Vkx3 = this.LJLJJL;
                    if (c80647Vkx3 != null) {
                        c80647Vkx3.getHelper().LIZIZ = this.LLFII;
                    }
                    CommerceMediaServiceImpl.LIZJ().LJI(this).kd0(N3A.FOR_YOU);
                }
            } else {
                this.LLIFFJFJJ.LJIILJJIL();
                this.LLIFFJFJJ.LJIIJJI(this.LLIIIZ);
                ViewPager viewPager = this.LJLJJI;
                if (this.LLIIIL && KO4.LIZ()) {
                    z = true;
                } else {
                    z = false;
                }
                viewPager.setCurrentItem(C61630OGs.LIZ(enumC61629OGr, z), false);
                C80647Vkx c80647Vkx4 = this.LJLJJL;
                if (c80647Vkx4 != null) {
                    c80647Vkx4.getHelper().LIZIZ = this.LLFF;
                }
                CommerceMediaServiceImpl.LIZJ().LJI(this).kd0(N3A.MORE);
            }
        } else {
            this.LLIFFJFJJ.LJIILJJIL();
            this.LJLJJI.setCurrentItem(C61630OGs.LIZ(enumC61629OGr, false), false);
            C80647Vkx c80647Vkx5 = this.LJLJJL;
            if (c80647Vkx5 != null) {
                c80647Vkx5.getHelper().LIZIZ = this.LLFF;
            }
            CommerceMediaServiceImpl.LIZJ().LJI(this).kd0(N3A.DISCOVER);
        }
        this.LJLLI = enumC61629OGr;
        int i3 = iArr[enumC61629OGr.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            return;
                        }
                        this.LJZL = 6;
                        return;
                    }
                    this.LJZL = 1;
                    return;
                }
                this.LJZL = 14;
                return;
            }
            this.LJZL = 15;
            return;
        }
        this.LJZL = 0;
    }

    @Override // X.XY4
    public final void k2(MusicModel musicModel) {
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.LLI;
        if (chooseMusicDownloadPlayHelper != null) {
            chooseMusicDownloadPlayHelper.pause();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.LJLJLLL = (SelectedMusicViewModel) C165706es.LJ(this).get(SelectedMusicViewModel.class);
        this.LJLL = (ChooseMusicWithSceneViewModel) C165706es.LJ(this).get(ChooseMusicWithSceneViewModel.class);
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C207668Da c207668Da) {
        C80647Vkx c80647Vkx;
        boolean z;
        MusicModel musicModel;
        int i;
        XWH xwh;
        boolean z2;
        ViewModelStoreOwner mo49getActivity;
        C73306Spq c73306Spq;
        C207668Da c207668Da2 = c207668Da;
        if (c207668Da2 == null) {
            return;
        }
        String str = c207668Da2.LIZ;
        str.getClass();
        str.hashCode();
        boolean z3 = true;
        switch (str.hashCode()) {
            case -2080369200:
                if (!str.equals("pick_status")) {
                    return;
                }
                Object obj = c207668Da2.LIZIZ;
                if (obj == null) {
                    obj = null;
                }
                if (((Integer) obj).intValue() == 1) {
                    if (this.LJLILLLLZI == null) {
                        return;
                    }
                    this.LLIL = true;
                    if (C52908Kpc.LIZ()) {
                        OSZ LJJI = C78596Usy.LJJI(this.LJLILLLLZI.getContext());
                        C2068389v c2068389v = new C2068389v();
                        c2068389v.LIZ = R.raw.icon_large_refresh;
                        c2068389v.LJ = Integer.valueOf(R.attr.go);
                        c73306Spq = new C73306Spq();
                        c73306Spq.LIZJ = 0;
                        c73306Spq.LIZIZ = c2068389v;
                        int LJIILL = C17N.LJIILL(72.0d);
                        int LJIILL2 = C17N.LJIILL(72.0d);
                        c73306Spq.LIZLLL = LJIILL;
                        c73306Spq.LJ = LJIILL2;
                        c73306Spq.LIZJ((String) LJJI.getFirst());
                        c73306Spq.LIZIZ((CharSequence) LJJI.getSecond());
                        C16880lQ.LJIIJJI(new ACListenerS21S0101000_2(1, this, 2), this.LJLILLLLZI);
                        if (this.LLILII == null) {
                            this.LLILII = new TK6(new AObjectS56S0101000_13(2, this, 1), new AObjectS56S0101000_13(0, this, 4));
                        }
                        this.LLILII.LIZ();
                        Hl();
                    } else {
                        c73306Spq = new C73306Spq();
                        C73312Spw.LJI(c73306Spq, new AObjectS56S0101000_13(2, this, 3));
                    }
                    this.LJLILLLLZI.setStatus(c73306Spq);
                    this.LJLILLLLZI.setVisibility(0);
                    return;
                }
                C73305Spp c73305Spp = this.LJLILLLLZI;
                if (c73305Spp != null) {
                    c73305Spp.setVisibility(8);
                }
                if (getArguments() == null || getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1) != 2) {
                    z = false;
                } else {
                    z = true;
                }
                if (!this.LLIIIJ || !z) {
                    Fragment parentFragment = getParentFragment();
                    if (parentFragment instanceof ChooseMusicFragment) {
                        BaseChooseMusicFragment baseChooseMusicFragment = (BaseChooseMusicFragment) parentFragment;
                        if (baseChooseMusicFragment.isViewValid() && baseChooseMusicFragment.mo49getActivity() != null && (musicModel = baseChooseMusicFragment.LJLLLLLL) != null) {
                            baseChooseMusicFragment.Al();
                            if (C46126I8k.LIZ() == 4) {
                                StringBuilder LIZJ = b1.LIZJ("change_music_page", "_");
                                LIZJ.append(XVF.LIZ.split("_")[1]);
                                String LIZIZ = X1D.LIZIZ(LIZJ);
                                C188727au c188727au = new C188727au();
                                c188727au.LJIIIZ("creation_id", baseChooseMusicFragment.LLF);
                                c188727au.LJIIIZ("enter_from", LIZIZ);
                                c188727au.LJIIIZ("music_id", musicModel.getMusicId());
                                c188727au.LJIIIZ("music_selected_from", baseChooseMusicFragment.LJLZ);
                                if (XVF.LIZLLL().booleanValue()) {
                                    c188727au.LIZLLL(1, "is_editor_pro");
                                } else {
                                    c188727au.LIZLLL(0, "is_editor_pro");
                                }
                                FMX.LJIIL("music_bar_show", c188727au.LIZ);
                            }
                            ChooseMusicSelectView chooseMusicSelectView = baseChooseMusicFragment.LLILIL;
                            if (chooseMusicSelectView != null) {
                                boolean z4 = baseChooseMusicFragment.LL;
                                boolean z5 = baseChooseMusicFragment.LJZL;
                                chooseMusicSelectView.LJZL = musicModel;
                                if (musicModel.isLocalMusic()) {
                                    i = 2;
                                } else if (musicModel.getCollectionType() == MusicModel.CollectionType.COLLECTED) {
                                    i = 0;
                                } else {
                                    i = 1;
                                }
                                SelectedMusicViewModel selectedMusicViewModel = chooseMusicSelectView.LJLLLL;
                                if (selectedMusicViewModel != null) {
                                    selectedMusicViewModel.hv0().postValue(musicModel);
                                    ((LiveData) selectedMusicViewModel.LJLJJI.getValue()).postValue(Boolean.valueOf(z4));
                                    ((LiveData) selectedMusicViewModel.LJLJJL.getValue()).postValue(Boolean.valueOf(z5));
                                    selectedMusicViewModel.gv0().postValue(Integer.valueOf(i));
                                    SelectedMusicViewModel selectedMusicViewModel2 = chooseMusicSelectView.LJLLLL;
                                    if (selectedMusicViewModel2 != null) {
                                        selectedMusicViewModel2.jv0().postValue(Boolean.TRUE);
                                    } else {
                                        o.LJIJI("mSelectedMusicViewModel");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("mSelectedMusicViewModel");
                                    throw null;
                                }
                            }
                        }
                    }
                }
                if (C74216TAu.LIZIZ.LIZIZ()) {
                    Fragment parentFragment2 = getParentFragment();
                    if ((parentFragment2 instanceof BaseChooseMusicFragment) && (xwh = ((BaseChooseMusicFragment) parentFragment2).LJLJLLL) != null) {
                        if (this.LJZI == 2) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (SearchServiceImpl.LLLZI().LJLIL().disableMusicSearch || (K2Z.LIZ() == 3 && !z2)) {
                            z3 = false;
                        }
                        xwh.LIZ(z3);
                    }
                }
                C80647Vkx c80647Vkx2 = this.LJLJJL;
                if (c80647Vkx2 != null) {
                    c80647Vkx2.setVisibility(0);
                }
                if (C78598Ut0.LJI(getView()) != null) {
                    mo49getActivity = C165706es.LIZ(requireActivity(), getView());
                } else {
                    mo49getActivity = mo49getActivity();
                }
                MutableLiveData<MusicModel> hv0 = this.LJLJLLL.hv0();
                XWG LJFF = CommerceMissionServiceImpl.LJIIIIZZ().LJFF(mo49getActivity);
                Objects.requireNonNull(LJFF);
                hv0.observe(this, new AObserverS64S0101000_14(0, LJFF, 8));
                return;
            case -1833731743:
                if (!str.equals("data_banner") || (c80647Vkx = this.LJLJJL) == null) {
                    return;
                }
                c80647Vkx.postDelayed(new ARunnableS51S0100000_15(this, 104), 100L);
                return;
            case -1635157503:
                if (!str.equals("music_collect_status")) {
                    return;
                }
                Ll(c207668Da2);
                return;
            case -1322093457:
                if (!str.equals("play_compeleted") || !(Dl() instanceof XX7)) {
                    return;
                }
                ((XX7) Dl()).LJZ();
                return;
            case 199458657:
                if (!str.equals("music_reset_play_start") || Dl() == null || !(Dl() instanceof XX7)) {
                    return;
                }
                ((XX7) Dl()).LJZL((Pair) this.LJLJL.get("music_reset_play_start"));
                return;
            case 502104354:
                if (!str.equals("music_loading") || Dl() == null || !(Dl() instanceof XX7)) {
                    return;
                }
                XX7 xx7 = (XX7) Dl();
                boolean booleanValue = ((Boolean) this.LJLJL.get("music_loading")).booleanValue();
                if (xx7.LJLJJLL < 0) {
                    return;
                }
                xx7.LJLJJL.post(new ARunnableS21S0110000_15(xx7, booleanValue, 1));
                return;
            default:
                return;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (getArguments() != null && arguments.containsKey("challenge")) {
            this.LJLLJ = arguments.getString("challenge");
        }
        this.LJLLL = arguments.getString("first_sticker_music_ids", null);
        this.LJLLLLLL = arguments.getBoolean("is_busi_sticker", false);
        this.LJLZ = (UrlModel) arguments.getSerializable("effect_icon_url");
        this.LJLLLL = arguments.getString("first_sticker_id", null);
        this.LJZI = arguments.getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE");
        this.LLII = (Music) arguments.getSerializable("sticker_music");
        if (getArguments() != null && arguments.containsKey("shoot_way")) {
            this.LJZ = arguments.getString("shoot_way");
        }
        if (getArguments() != null && arguments.containsKey("sound_page_scene")) {
            this.LLIIIZ = arguments.getInt("sound_page_scene");
        }
        this.LLIIIJ = arguments.getBoolean("hide_cancel_music_ui");
        this.LLIIIL = arguments.getBoolean("should_show_local_music", false);
        if (getArguments() == null) {
            this.LLIIJI = 0L;
            this.LLIIJLIL = 0L;
        } else {
            this.LLIIJI = getArguments().getLong("max_video_duration", 0L);
            this.LLIIJLIL = getArguments().getLong("shoot_video_length", 0L);
        }
        this.LLIIZ = arguments.getString("reuse_original_sound_id");
        this.LLIILZL = arguments.getInt("reuse_original_sound_length");
        this.LLIILII = (UrlModel) arguments.getSerializable("reuse_original_sound_url");
        if (!TextUtils.isEmpty(this.LLIIZ) && this.LLIILII != null) {
            this.LLIIL = true;
        }
    }

    @QD3(sticky = true)
    public void onMusicCollectEvent(C72197SVd c72197SVd) {
        if (this.LJLJL != null && c72197SVd != null && "music_detail".equals(c72197SVd.LJLJI)) {
            this.LJLJL.jv0(new XYC(0, c72197SVd.LJLIL, -1, -1, c72197SVd.LJLILLLLZI), "music_collect_status");
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        boolean z;
        super.onSaveInstanceState(bundle);
        EnumC61629OGr enumC61629OGr = this.LJLLI;
        if (this.LLIIIL && KO4.LIZ()) {
            z = true;
        } else {
            z = false;
        }
        bundle.putInt("KEY_CURRENT_TAB", C61630OGs.LIZ(enumC61629OGr, z));
    }

    public final void vl(MusicModel musicModel) {
        if (this.LLIIL && TextUtils.equals(musicModel.getMusicId(), this.LLIIZ)) {
            musicModel.setMusicType(MusicModel.MusicType.REUSE_AUDIO);
            musicModel.setReuseAudioPlayUrl(this.LLIILII);
            musicModel.setDuration(this.LLIILZL);
            musicModel.setShootDuration(Integer.valueOf(this.LLIILZL));
        }
    }

    public final CharSequence xl(EnumC61629OGr enumC61629OGr) {
        int i = C61632OGu.LIZ[enumC61629OGr.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return "";
                        }
                        return getResources().getString(R.string.bnh);
                    }
                    return getResources().getString(R.string.iiz);
                }
                return getResources().getString(R.string.rg8);
            }
            return getResources().getString(R.string.rg9);
        }
        return getResources().getString(R.string.eju);
    }

    @Override // X.XY4
    public final void y8(MusicModel musicModel) {
        this.LLI.LJLLILLLL = this.LLF;
        int i = this.LJZL;
        if (musicModel.getMusicItemType() == MusicModel.MusicItemType.RECOMMENDED_FAV_MUSIC) {
            i = 12;
        }
        if (!TextUtils.isEmpty(musicModel.getSearchId())) {
            i = 2;
        }
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.LLI;
        vl(musicModel);
        chooseMusicDownloadPlayHelper.LIZIZ(i, musicModel, true, Jl());
    }

    @Override // X.XY4
    public final void za0(XUP xup) {
        this.LLI.LJLJJLL = xup;
    }

    @Override // X.XY4
    public final void oj0(MusicModel musicModel, XVG xvg) {
        vl(musicModel);
        this.LL = musicModel;
        this.LJLJL.jv0(Boolean.TRUE, "music_loading");
        int i = this.LJZL;
        if (musicModel.getMusicItemType() == MusicModel.MusicItemType.RECOMMENDED_FAV_MUSIC) {
            i = 12;
        }
        if (this.LLD) {
            this.LLI.LLFFF = xvg;
            if (xvg != null && xvg.LJII) {
                this.LJLJL.jv0(musicModel.getMusicId(), "last_play_music_id");
            }
            ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.LLI;
            vl(musicModel);
            chooseMusicDownloadPlayHelper.LJIIJ(musicModel, false, i);
            return;
        }
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper2 = this.LLI;
        vl(musicModel);
        chooseMusicDownloadPlayHelper2.LIZIZ(i, musicModel, true, Jl());
    }

    @Override // X.InterfaceC80650Vl0
    public final void onScroll(int i, int i2) {
        Ol();
    }

    @Override // X.InterfaceC80650Vl0
    public final void onScrolled(float f, float f2) {
        RecyclerView recyclerView;
        if (V0Q.Default.nextFloat() < 0.1d) {
            AVExternalServiceImpl.LIZ().provideAVPerformance().startPerformanceMonitor("tool_music_scroll", LiveMaxRetainAlogMessageSizeSetting.DEFAULT, -1L);
        }
        if (!isViewValid()) {
            return;
        }
        int i = C61632OGu.LIZ[this.LJLLI.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return;
                        } else {
                            recyclerView = (RecyclerView) this.LLFZ.LJIJJ();
                        }
                    } else {
                        recyclerView = (RecyclerView) this.LLFFF.LJIJJ();
                    }
                } else {
                    recyclerView = (RecyclerView) this.LLFII.LJIJJ();
                }
            } else {
                recyclerView = this.LLFF.LJLIL;
            }
        } else {
            recyclerView = this.LLFF.LJLIL;
        }
        if (recyclerView == null || this.LJLJJL == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        if (childCount == 0) {
            C80647Vkx c80647Vkx = this.LJLJJL;
            if (c80647Vkx.LLFII != 0) {
                c80647Vkx.scrollTo(0, 0);
            }
            this.LJLJJL.setMaxScrollHeight(0);
            return;
        }
        View LJJJ = recyclerView.getLayoutManager().LJJJ(childCount - 1);
        int childCount2 = this.LJLJJL.getChildCount();
        if (childCount2 < 2 || LJJJ == null) {
            return;
        }
        this.LJLJJL.setMaxScrollHeight((this.LJLJJL.getChildAt(childCount2 - 1).getTop() + (LJJJ.getBottom() + recyclerView.getTop())) - ((View) this.LJLJJL.getParent()).getMeasuredHeight());
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        EnumC61629OGr LIZIZ;
        boolean z2;
        boolean z3;
        ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior;
        String str;
        boolean z4;
        boolean z5;
        super.onViewCreated(view, bundle);
        C80647Vkx c80647Vkx = this.LJLJJL;
        if (c80647Vkx != null) {
            c80647Vkx.setVisibility(4);
            this.LJLJJL.setOnScrollListener(this);
        }
        if (this.LLIIIL && KO4.LIZ()) {
            z = true;
        } else {
            z = false;
        }
        if (bundle == null) {
            LIZIZ = C61630OGs.LIZIZ(0, z);
        } else {
            LIZIZ = C61630OGs.LIZIZ(bundle.getInt("KEY_CURRENT_TAB", 0), z);
        }
        this.LJLLI = LIZIZ;
        DataCenter gv0 = DataCenter.gv0(ViewModelProviders.of(this), this);
        this.LJLJL = gv0;
        gv0.iv0("pick_status", this, false);
        gv0.iv0("data_banner", this, false);
        gv0.iv0("play_compeleted", this, false);
        gv0.iv0("music_collect_status", this, false);
        gv0.iv0("music_reset_play_start", this, false);
        this.LJLJL.iv0("music_loading", this, false);
        this.LJLJL.jv0(Integer.valueOf(this.LJZI), "key_choose_music_type");
        this.LJLJL.jv0(this.LJLLLL, "sticker_id");
        this.LJLJL.jv0(this.LJLLJ, "challenge_id");
        this.LJLJL.jv0(Boolean.valueOf(this.LLIIII), "mvtheme_music_type");
        this.LJLJL.jv0(Boolean.valueOf(this.LLIIIILZ), "is_photo_mv_type");
        this.LJLJL.jv0(Boolean.valueOf(this.LJLLLLLL), "is_busi_sticker");
        this.LJLJL.jv0(this.LJLZ, "effect_icon_url");
        this.LJLJL.jv0(this.LJZ, "shoot_way");
        SAAService.LIZ().invokeMethodsSafely(requireActivity(), new XY7(this, view));
        this.LJLJLJ.Hl(this.LJLJL);
        this.LJLLILLLL = new MusicBannerWidget(this.LLIIIZ, this.LLIIJI, this.LLIIJLIL);
        this.LLIFFJFJJ = new XVW(getContext(), this.LJLJL);
        this.LJLJLJ.vl(R.id.agi, this.LJLLILLLL);
        int LIZ = C61630OGs.LIZ(EnumC61629OGr.TAB_TYPE_DISCOVER, false);
        if (C59859NeR.LIZ()) {
            EnumC61629OGr enumC61629OGr = EnumC61629OGr.TAB_TYPE_MORE;
            if (this.LLIIIL && KO4.LIZ()) {
                z5 = true;
            } else {
                z5 = false;
            }
            LIZ = C61630OGs.LIZ(enumC61629OGr, z5);
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        StringBuilder LIZ2 = X1D.LIZ();
        String str2 = LLILL;
        LIZ2.append(str2);
        LIZ2.append(LIZ);
        Fragment LJJJIL = childFragmentManager.LJJJIL(X1D.LIZIZ(LIZ2));
        if (LJJJIL instanceof DiscoverMusicFragment) {
            this.LLFF = (DiscoverMusicFragment) LJJJIL;
        }
        if (this.LLFF == null) {
            int i = this.LJZI;
            String str3 = this.LJLLJ;
            int i2 = this.LLIIIZ;
            long j = this.LLIIJI;
            long j2 = this.LLIIJLIL;
            Bundle LIZ3 = C141415gn.LIZ("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i);
            if (!TextUtils.isEmpty(str3)) {
                LIZ3.putString("challenge", str3);
            }
            LIZ3.putInt("sound_page_scene", i2);
            LIZ3.putLong("max_video_duration", j);
            LIZ3.putLong("shoot_video_length", j2);
            DiscoverMusicFragment discoverMusicFragment = new DiscoverMusicFragment();
            discoverMusicFragment.setArguments(LIZ3);
            this.LLFF = discoverMusicFragment;
        }
        DiscoverMusicFragment discoverMusicFragment2 = this.LLFF;
        discoverMusicFragment2.LJLJI = this.LJLJL;
        discoverMusicFragment2.LJLJJI = this.LJLJLJ;
        discoverMusicFragment2.LJLLI = this.LLIFFJFJJ;
        discoverMusicFragment2.LJLJL = this;
        XX6 xx6 = discoverMusicFragment2.LJLJJL;
        if (xx6 != null) {
            xx6.LJLJJI = this;
        }
        discoverMusicFragment2.LJLJLJ = this;
        if (xx6 != null) {
            xx6.LJLJJLL = this;
        }
        discoverMusicFragment2.LJLJLLL = this;
        if (xx6 != null) {
            xx6.LJZ = this;
        }
        int LIZ4 = C61630OGs.LIZ(EnumC61629OGr.TAB_TYPE_COLLECT, false);
        FragmentManager childFragmentManager2 = getChildFragmentManager();
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append(str2);
        LIZ5.append(LIZ4);
        Fragment LJJJIL2 = childFragmentManager2.LJJJIL(X1D.LIZIZ(LIZ5));
        if (LJJJIL2 instanceof CollectMusicFragment) {
            this.LLFFF = (CollectMusicFragment) LJJJIL2;
        }
        if (this.LLFFF == null) {
            int i3 = this.LJZI;
            String str4 = this.LJLLJ;
            int i4 = this.LLIIIZ;
            long j3 = this.LLIIJI;
            long j4 = this.LLIIJLIL;
            Bundle LIZ6 = C141415gn.LIZ("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i3);
            if (!TextUtils.isEmpty(str4)) {
                LIZ6.putString("challenge", str4);
            }
            LIZ6.putInt("sound_page_scene", i4);
            LIZ6.putLong("max_video_duration", j3);
            LIZ6.putLong("shoot_video_length", j4);
            CollectMusicFragment collectMusicFragment = new CollectMusicFragment();
            collectMusicFragment.setArguments(LIZ6);
            this.LLFFF = collectMusicFragment;
        }
        CollectMusicFragment collectMusicFragment2 = this.LLFFF;
        collectMusicFragment2.LJLJJLL = this.LJLJL;
        collectMusicFragment2.LJLLLL = this;
        if (this.LLIIIL && KO4.LIZ()) {
            int LIZ7 = C61630OGs.LIZ(EnumC61629OGr.TAB_TYPE_LOCAL, true);
            FragmentManager childFragmentManager3 = getChildFragmentManager();
            StringBuilder LIZ8 = X1D.LIZ();
            LIZ8.append(str2);
            LIZ8.append(LIZ7);
            Fragment LJJJIL3 = childFragmentManager3.LJJJIL(X1D.LIZIZ(LIZ8));
            if (LJJJIL3 instanceof LocalMusicTabFragment) {
                this.LLFZ = (LocalMusicTabFragment) LJJJIL3;
            }
            if (this.LLFZ == null) {
                int i5 = this.LJZI;
                long j5 = this.LLIIJI;
                long j6 = this.LLIIJLIL;
                LocalMusicTabFragment localMusicTabFragment = new LocalMusicTabFragment();
                Bundle bundle2 = new Bundle();
                bundle2.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i5);
                bundle2.putLong("max_video_duration", j5);
                bundle2.putLong("shoot_video_length", j6);
                localMusicTabFragment.setArguments(bundle2);
                this.LLFZ = localMusicTabFragment;
            }
            LocalMusicTabFragment localMusicTabFragment2 = this.LLFZ;
            localMusicTabFragment2.getClass();
            localMusicTabFragment2.LJLLLLLL = this;
            LocalMusicTabFragment localMusicTabFragment3 = this.LLFZ;
            DataCenter dataCenter = this.LJLJL;
            localMusicTabFragment3.getClass();
            o.LJIIIZ(dataCenter, "dataCenter");
            localMusicTabFragment3.LJLJJLL = dataCenter;
        }
        if (C59859NeR.LIZ()) {
            int LIZ9 = C61630OGs.LIZ(EnumC61629OGr.TAB_TYPE_FOR_YOU, false);
            FragmentManager childFragmentManager4 = getChildFragmentManager();
            StringBuilder LIZ10 = X1D.LIZ();
            LIZ10.append(str2);
            LIZ10.append(LIZ9);
            Fragment LJJJIL4 = childFragmentManager4.LJJJIL(X1D.LIZIZ(LIZ10));
            if (LJJJIL4 instanceof ForYouMusicFragment) {
                this.LLFII = (ForYouMusicFragment) LJJJIL4;
            }
            if (this.LLFII == null) {
                int i6 = this.LJZI;
                String str5 = this.LJLLJ;
                int i7 = this.LLIIIZ;
                long j7 = this.LLIIJI;
                long j8 = this.LLIIJLIL;
                Bundle LIZ11 = C141415gn.LIZ("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i6);
                if (!TextUtils.isEmpty(str5)) {
                    LIZ11.putString("challenge", str5);
                }
                LIZ11.putInt("sound_page_scene", i7);
                LIZ11.putLong("max_video_duration", j7);
                LIZ11.putLong("shoot_video_length", j8);
                ForYouMusicFragment forYouMusicFragment = new ForYouMusicFragment();
                forYouMusicFragment.setArguments(LIZ11);
                this.LLFII = forYouMusicFragment;
            }
            ForYouMusicFragment forYouMusicFragment2 = this.LLFII;
            DataCenter dataCenter2 = this.LJLJL;
            forYouMusicFragment2.getClass();
            o.LJIIIZ(dataCenter2, "dataCenter");
            forYouMusicFragment2.LJLJJLL = dataCenter2;
            ForYouMusicFragment forYouMusicFragment3 = this.LLFII;
            forYouMusicFragment3.getClass();
            forYouMusicFragment3.LJLLL = this;
        }
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = new ChooseMusicDownloadPlayHelper((XUC) this, new C84982XWw(this));
        this.LLI = chooseMusicDownloadPlayHelper;
        chooseMusicDownloadPlayHelper.LJ();
        this.LLI.LJLILLLLZI = this.LJZI;
        if (!C43985HOb.LIZ()) {
            Al();
        }
        if (C59859NeR.LIZ()) {
            this.LJLJJI.setOffscreenPageLimit(3);
        } else {
            this.LJLJJI.setOffscreenPageLimit(2);
        }
        this.LJLJJI.setAdapter(new C84962XWc(this, getChildFragmentManager()));
        C74053T4n c74053T4n = this.LJLJI;
        if (c74053T4n != null) {
            c74053T4n.setupWithViewPager(this.LJLJJI);
            Pl((LinearLayout) this.LJLJI.getChildAt(0));
            this.LJLJI.LIZ(new XWW(this));
            C74053T4n c74053T4n2 = this.LJLJI;
            EnumC61629OGr enumC61629OGr2 = this.LJLLI;
            if (this.LLIIIL && KO4.LIZ()) {
                z2 = true;
            } else {
                z2 = false;
            }
            c74053T4n2.LJI(C61630OGs.LIZ(enumC61629OGr2, z2)).LIZ();
        }
        if (this.LJLJI != null) {
            C60996Nwm.LJIIIIZZ(getContext());
            C17N.LJIILL(128.0d);
            this.LJLJI.findViewById(android.R.id.text1);
            int tabCount = this.LJLJI.getTabCount();
            StringBuilder sb = new StringBuilder();
            for (int i8 = 0; i8 < tabCount; i8++) {
                if (this.LLIIIL && KO4.LIZ()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                sb.append(xl(C61630OGs.LIZIZ(i8, z3)));
            }
        }
        Il();
        Rl(this.LJLLI);
        EnumC61629OGr enumC61629OGr3 = this.LJLLI;
        if (enumC61629OGr3 == EnumC61629OGr.TAB_TYPE_LOCAL) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (Build.VERSION.SDK_INT >= 33) {
                str = "android.permission.READ_MEDIA_AUDIO";
            } else {
                str = "android.permission.WRITE_EXTERNAL_STORAGE";
            }
            if (C04330Ez.LIZ(mo49getActivity, str) == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            XVF.LJIILJJIL(enumC61629OGr3, z4);
        } else {
            XVF.LJIILJJIL(enumC61629OGr3, false);
        }
        Hl();
        wl();
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        if (mo49getActivity2 instanceof ChooseMusicActivity) {
            ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior2 = ((ChooseMusicActivity) mo49getActivity2).LJLJL;
            if (viewPagerBottomSheetBehavior2 != null) {
                ViewPager viewPager = this.LJLJJI;
                viewPager.addOnPageChangeListener(new C80588Vk0(viewPager, viewPagerBottomSheetBehavior2));
                return;
            }
            return;
        }
        if (!(mo49getActivity2 instanceof ActivityC45651qj) || (viewPagerBottomSheetBehavior = ((ChooseMusicWithSceneViewModel) C165706es.LJ(this).get(ChooseMusicWithSceneViewModel.class)).LJLJI) == null) {
            return;
        }
        ViewPager viewPager2 = this.LJLJJI;
        viewPager2.addOnPageChangeListener(new C80588Vk0(viewPager2, viewPagerBottomSheetBehavior));
    }

    @Override // X.XUC
    public final void LJJII(MusicModel musicModel, String str, String str2) {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        int i = this.LJZI;
        if (i == 0 || i == 2) {
            Intent intent = new Intent();
            intent.putExtra("path", str);
            intent.putExtra("music_model", musicModel);
            intent.putExtra("music_origin", str2);
            Gl(intent, musicModel);
            if (mo49getActivity != null) {
                mo49getActivity.setResult(-1, intent);
            }
            if (C5IO.LIZIZ(musicModel.getMusicId()) != null) {
                IAVPerformance provideAVPerformance = AVExternalServiceImpl.LIZ().provideAVPerformance();
                PerformanceMonitor LIZIZ = C5IO.LIZIZ(musicModel.getMusicId());
                Objects.requireNonNull(LIZIZ);
                provideAVPerformance.step(LIZIZ, "music tab fragment finish activity");
            }
            if (mo49getActivity() != null) {
                ChooseMusicWithSceneViewModel chooseMusicWithSceneViewModel = this.LJLL;
                if (chooseMusicWithSceneViewModel.LJLIL) {
                    chooseMusicWithSceneViewModel.gv0().setValue(new C79409VEn(-1, intent));
                    return;
                }
            }
            mo49getActivity.finish();
            return;
        }
        String string = getArguments().getString("shoot_way");
        RecordConfig.Builder builder = new RecordConfig.Builder();
        builder.shootWay(string);
        builder.creationId(UUID.randomUUID().toString());
        builder.musicOrigin(str2);
        builder.musicPath(str);
        builder.musicModel(musicModel);
        AVExternalServiceImpl.LIZ().asyncService("NewMusicTab", new IDLCallbackS0S0300000_7(mo49getActivity, builder, musicModel, 10));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 101) {
            this.LLFZ.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        if (C63057Oov.LIZ()) {
            inflater = inflater.cloneInContext(new ContextThemeWrapper(requireActivity(), R.style.uw));
        }
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.awy, viewGroup, false);
        this.LJLILLLLZI = (C73305Spp) LLLLIILL.findViewById(R.id.kf_);
        this.LJLJI = (C74053T4n) LLLLIILL.findViewById(R.id.kyt);
        this.LJLJJI = (ViewPager) LLLLIILL.findViewById(R.id.de6);
        this.LJLJJL = (C80647Vkx) LLLLIILL.findViewById(R.id.jcm);
        this.LJLJJLL = LLLLIILL.findViewById(R.id.cd4);
        try {
            ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
            C10A.LIZIZ(LLLLIILL, this);
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
        return LLLLIILL;
    }
}

package com.ss.android.ugc.aweme.kids.choosemusic.fragment;

import X.AbstractC029409q;
import X.ActivityC45651qj;
import X.C0NY;
import X.C10A;
import X.C141335gf;
import X.C141415gn;
import X.C16880lQ;
import X.C207668Da;
import X.C29S;
import X.C3C5;
import X.C73305Spp;
import X.C73306Spq;
import X.C73312Spw;
import X.C76800UCe;
import X.C80588Vk0;
import X.C80647Vkx;
import X.C80675VlP;
import X.C84880XSy;
import X.C84939XVf;
import X.C84968XWi;
import X.C84977XWr;
import X.C84978XWs;
import X.C84979XWt;
import X.C90903hW;
import X.InterfaceC80650Vl0;
import X.InterfaceC82683Wch;
import X.InterfaceC84871XSp;
import X.InterfaceC84984XWy;
import X.InterfaceC85019XYh;
import X.OGG;
import X.QD3;
import X.SS0;
import X.TAY;
import X.X1D;
import X.XT7;
import X.XTE;
import X.XX9;
import X.XXC;
import X.XY6;
import X.XYA;
import X.XYD;
import X.XYN;
import X.XZ1;
import Y.ARunnableS51S0100000_15;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.kids.choosemusic.activity.ChooseMusicActivity;
import com.ss.android.ugc.aweme.kids.choosemusic.fragment.BaseNewMusicTabFragment;
import com.ss.android.ugc.aweme.kids.choosemusic.widgets.MusicBannerWidget;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IDLCallbackS0S0300000_7;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.UUID;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public abstract class BaseNewMusicTabFragment extends AmeBaseFragment implements Observer<C207668Da>, OGG, XY6, XZ1, InterfaceC84871XSp, InterfaceC80650Vl0, InterfaceC85019XYh<XYN> {
    public static final String LLFZ = C0NY.LIZIZ("android:switcher:", R.id.de6, ":");
    public InterfaceC82683Wch LJLIL;
    public C73305Spp LJLILLLLZI;
    public C80675VlP LJLJI;
    public ViewPager LJLJJI;
    public C80647Vkx LJLJJL;
    public View LJLJJLL;
    public DataCenter LJLJL;
    public WidgetManager LJLJLJ;
    public int LJLJLLL;
    public MusicBannerWidget LJLL;
    public String LJLLI;
    public String LJLLILLLL;
    public String LJLLJ;
    public boolean LJLLL;
    public String LJLLLL;
    public int LJLLLLLL;
    public int LJLZ;
    public MusicModel LJZ;
    public final boolean LJZI = true;
    public DiscoverMusicFragment LJZL;
    public CollectMusicFragment LL;
    public C84880XSy LLD;
    public C84939XVf LLF;
    public Music LLFF;
    public boolean LLFFF;
    public boolean LLFII;

    public abstract void Dl();

    public abstract void Gl(LinearLayout linearLayout);

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    @Override // X.InterfaceC80650Vl0
    public final boolean onScrollEnd() {
        return false;
    }

    public abstract void wl();

    public abstract void xl(C207668Da c207668Da);

    public final void Al() {
        C80647Vkx c80647Vkx = this.LJLJJL;
        if (c80647Vkx == null || c80647Vkx.getParent() == null) {
            return;
        }
        int measuredHeight = ((View) this.LJLJJL.getParent()).getMeasuredHeight();
        int curScrollY = (this.LJLJJL.getCurScrollY() + measuredHeight) - this.LJLJJL.getChildAt(0).getMeasuredHeight();
        XXC xxc = this.LJZL.LJLJJI;
        if (xxc == null || xxc.LJLJLLL == curScrollY) {
            return;
        }
        xxc.LJLJLLL = curScrollY;
        xxc.LJLZ(false);
    }

    @Override // X.OGG
    public final View LJIJJ() {
        int i = this.LJLJLLL;
        if (i == 0) {
            return this.LJZL.LJLIL;
        }
        if (i == 1) {
            return this.LL.LJIJJ();
        }
        throw new IllegalStateException("Just has three types of View.");
    }

    public final AbstractC029409q vl() {
        int i = this.LJLJLLL;
        if (i == 0) {
            return this.LJZL.LJLJJI;
        }
        if (i == 1) {
            InterfaceC84984XWy<T> interfaceC84984XWy = this.LL.LJLJL;
            if (interfaceC84984XWy != 0) {
                return interfaceC84984XWy.LJJLIIIJJIZ();
            }
            return null;
        }
        throw new IllegalStateException("Just has three types of View.");
    }

    @Override // X.InterfaceC84871XSp
    public final boolean LJJIIZI() {
        return isViewValid();
    }

    @Override // X.InterfaceC84871XSp
    public final Activity LJJIZ() {
        return mo49getActivity();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C84880XSy c84880XSy = this.LLD;
        if (c84880XSy != null) {
            c84880XSy.LJII();
            this.LLD.LJI();
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C84880XSy c84880XSy = this.LLD;
        if (c84880XSy != null) {
            c84880XSy.LJII();
            this.LLD.LJI = true;
        }
        this.LJLJL.jv0(-1, "music_position");
        this.LJLJL.jv0(-1, "music_index");
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C84880XSy c84880XSy = this.LLD;
        if (c84880XSy != null) {
            c84880XSy.LJI = false;
        }
    }

    @Override // X.InterfaceC84871XSp
    public final MusicModel LIZLLL() {
        return this.LJZ;
    }

    @Override // X.XY6
    public final void C7(XT7 xt7) {
        this.LLD.LJFF = xt7;
    }

    public final void Hl(int i) {
        if (i == 1) {
            this.LLF.LIZJ();
            this.LJLJJI.setCurrentItem(1);
            this.LJLJJL.getHelper().LIZIZ = this.LL;
        } else if (i == 0) {
            this.LJLJJI.setCurrentItem(0);
            this.LJLJJL.getHelper().LIZIZ = this.LJZL;
        }
        this.LJLJLLL = i;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                this.LJLZ = 6;
                return;
            }
            this.LJLZ = 1;
            return;
        }
        this.LJLZ = 0;
    }

    @Override // X.XY6
    public final void k2(MusicModel musicModel) {
        C84880XSy c84880XSy = this.LLD;
        if (c84880XSy != null) {
            c84880XSy.LJII();
        }
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C207668Da c207668Da) {
        C207668Da c207668Da2 = c207668Da;
        String str = c207668Da2.LIZ;
        str.getClass();
        int i = 1;
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
                    C73306Spq c73306Spq = new C73306Spq();
                    C73312Spw.LJI(c73306Spq, new C84979XWt(i, this));
                    this.LJLILLLLZI.setStatus(c73306Spq);
                    this.LJLILLLLZI.setVisibility(0);
                    return;
                }
                C73305Spp c73305Spp = this.LJLILLLLZI;
                if (c73305Spp != null) {
                    c73305Spp.setVisibility(8);
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof ChooseMusicFragment) {
                    BaseChooseMusicFragment baseChooseMusicFragment = (BaseChooseMusicFragment) parentFragment;
                    if (baseChooseMusicFragment.isViewValid()) {
                        baseChooseMusicFragment.showCancelChooseMusicBar();
                    }
                }
                this.LJLJJL.setVisibility(0);
                return;
            case -1833731743:
                if (!str.equals("data_banner")) {
                    return;
                }
                this.LJLJJL.postDelayed(new ARunnableS51S0100000_15(this, 32), 100L);
                return;
            case -1635157503:
                if (!str.equals("music_collect_status")) {
                    return;
                }
                xl(c207668Da2);
                return;
            case -1322093457:
                if (!str.equals("play_compeleted") || !(vl() instanceof XX9)) {
                    return;
                }
                ((XX9) vl()).LJLLLLLL();
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
            this.LJLLI = arguments.getString("challenge");
        }
        this.LJLLILLLL = arguments.getString("first_sticker_music_ids", null);
        this.LJLLL = arguments.getBoolean("is_busi_sticker", false);
        this.LJLLJ = arguments.getString("first_sticker_id", null);
        this.LJLLLLLL = arguments.getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE");
        this.LLFF = (Music) arguments.getSerializable("sticker_music");
        if (getArguments() != null && arguments.containsKey("shoot_way")) {
            this.LJLLLL = arguments.getString("shoot_way");
        }
    }

    @Override // X.InterfaceC85019XYh
    public final void onInternalEvent(XYN xyn) {
        XYN xyn2 = xyn;
        String str = xyn2.LIZIZ;
        MusicModel musicModel = xyn2.LIZ;
        if ("follow_type".equals(str)) {
            this.LLF.LIZ(musicModel, musicModel.getMusicId(), 1, xyn2.LIZJ, xyn2.LIZLLL);
        } else {
            if (!"unfollow_type".equals(str)) {
                return;
            }
            this.LLF.LIZ(musicModel, musicModel.getMusicId(), 0, xyn2.LIZJ, xyn2.LIZLLL);
        }
    }

    @QD3(sticky = true)
    public void onMusicCollectEvent(XYA xya) {
        if (this.LJLJL != null && xya != null && "music_detail".equals(null)) {
            this.LJLJL.jv0(new XYD(0, xya.LJLIL, -1, -1, xya.LJLILLLLZI), "music_collect_status");
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("KEY_CURRENT_TAB", this.LJLJLLL);
    }

    @Override // X.XY6
    public final void y8(MusicModel musicModel) {
        this.LLD.getClass();
        C84880XSy c84880XSy = this.LLD;
        int i = this.LJLZ;
        boolean z = false;
        if (mo49getActivity().getIntent() != null) {
            z = mo49getActivity().getIntent().getBooleanExtra("extra_beat_music_sticker", false);
        }
        c84880XSy.LIZ(i, musicModel, z);
    }

    @Override // X.InterfaceC80650Vl0
    public final void onScroll(int i, int i2) {
        Al();
    }

    @Override // X.InterfaceC80650Vl0
    public final void onScrolled(float f, float f2) {
        RecyclerView recyclerView;
        if (!isViewValid()) {
            return;
        }
        int i = this.LJLJLLL;
        if (i == 0) {
            recyclerView = this.LJZL.LJLIL;
        } else if (i != 1) {
            return;
        } else {
            recyclerView = (RecyclerView) this.LL.LJIJJ();
        }
        if (recyclerView == null) {
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

    @Override // X.XY6
    public final void t2(XTE xte, MusicModel musicModel) {
        this.LJZ = musicModel;
        if (this.LJZI) {
            this.LLD.LJIIL = xte;
            if (xte != null && xte.LJFF) {
                this.LJLJL.jv0(musicModel.getMusicId(), "last_play_music_id");
            }
            this.LLD.LJIIIIZZ(musicModel, this.LJLZ);
            return;
        }
        C84880XSy c84880XSy = this.LLD;
        int i = this.LJLZ;
        boolean z = false;
        if (mo49getActivity().getIntent() != null) {
            z = mo49getActivity().getIntent().getBooleanExtra("extra_beat_music_sticker", false);
        }
        c84880XSy.LIZ(i, musicModel, z);
    }

    @Override // X.InterfaceC84871XSp
    public final void LJJII(MusicModel musicModel, String str, String str2) {
        SS0.LIZ(musicModel);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        int i = this.LJLLLLLL;
        if (i == 0 || i == 2) {
            Intent intent = new Intent();
            intent.putExtra("path", str);
            intent.putExtra("music_model", musicModel);
            intent.putExtra("music_origin", str2);
            mo49getActivity.setResult(-1, intent);
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
        AVExternalServiceImpl.LIZ().asyncService("NewMusicTab", new IDLCallbackS0S0300000_7(mo49getActivity, builder, musicModel, 2));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior;
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.bg5, viewGroup, false);
        this.LJLILLLLZI = (C73305Spp) LLLLIILL.findViewById(R.id.kf_);
        this.LJLJI = (C80675VlP) LLLLIILL.findViewById(R.id.kyt);
        this.LJLJJI = (ViewPager) LLLLIILL.findViewById(R.id.de6);
        this.LJLJJL = (C80647Vkx) LLLLIILL.findViewById(R.id.jcm);
        this.LJLJJLL = LLLLIILL.findViewById(R.id.cd4);
        this.LJLJJL.setVisibility(4);
        this.LJLJJL.setOnScrollListener(this);
        if (bundle == null) {
            i = 0;
        } else {
            i = bundle.getInt("KEY_CURRENT_TAB", 0);
        }
        this.LJLJLLL = i;
        DataCenter gv0 = DataCenter.gv0(ViewModelProviders.of(this), this);
        this.LJLJL = gv0;
        gv0.iv0("pick_status", this, false);
        gv0.iv0("data_banner", this, false);
        gv0.iv0("play_compeleted", this, false);
        gv0.iv0("music_collect_status", this, false);
        this.LJLJL.jv0(Integer.valueOf(this.LJLLLLLL), "key_choose_music_type");
        this.LJLJL.jv0(this.LJLLJ, "sticker_id");
        this.LJLJL.jv0(this.LJLLI, "challenge_id");
        this.LJLJL.jv0(Boolean.valueOf(this.LLFFF), "mvtheme_music_type");
        this.LJLJL.jv0(Boolean.valueOf(this.LLFII), "is_photo_mv_type");
        this.LJLJL.jv0(Boolean.valueOf(this.LJLLL), "is_busi_sticker");
        this.LJLJL.jv0(this.LJLLLL, "shoot_way");
        C29S c29s = null;
        WidgetManager xl = WidgetManager.xl(null, this, LLLLIILL, getContext());
        this.LJLJLJ = xl;
        xl.Hl(this.LJLJL);
        this.LJLL = new MusicBannerWidget();
        this.LLF = new C84939XVf(getContext(), this.LJLJL);
        this.LJLJLJ.vl(R.id.g2t, this.LJLL);
        FragmentManager childFragmentManager = getChildFragmentManager();
        StringBuilder LIZ = X1D.LIZ();
        String str = LLFZ;
        LIZ.append(str);
        LIZ.append(0);
        DiscoverMusicFragment discoverMusicFragment = (DiscoverMusicFragment) childFragmentManager.LJJJIL(X1D.LIZIZ(LIZ));
        this.LJZL = discoverMusicFragment;
        if (discoverMusicFragment == null) {
            int i2 = this.LJLLLLLL;
            String str2 = this.LJLLI;
            Bundle LIZ2 = C141415gn.LIZ("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i2);
            if (!TextUtils.isEmpty(str2)) {
                LIZ2.putString("challenge", str2);
            }
            DiscoverMusicFragment discoverMusicFragment2 = new DiscoverMusicFragment();
            discoverMusicFragment2.setArguments(LIZ2);
            this.LJZL = discoverMusicFragment2;
        }
        DiscoverMusicFragment discoverMusicFragment3 = this.LJZL;
        discoverMusicFragment3.LJLILLLLZI = this.LJLJL;
        discoverMusicFragment3.LJLJI = this.LJLJLJ;
        discoverMusicFragment3.LJLL = this.LLF;
        discoverMusicFragment3.LJLJJLL = this;
        XXC xxc = discoverMusicFragment3.LJLJJI;
        if (xxc != null) {
            xxc.LJLJJI = this;
        }
        discoverMusicFragment3.LJLJL = this;
        if (xxc != null) {
            xxc.LJLJJL = this;
        }
        discoverMusicFragment3.LJLJLJ = this;
        if (xxc != null) {
            xxc.LJLLJ = this;
        }
        FragmentManager childFragmentManager2 = getChildFragmentManager();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(str);
        LIZ3.append(1);
        CollectMusicFragment collectMusicFragment = (CollectMusicFragment) childFragmentManager2.LJJJIL(X1D.LIZIZ(LIZ3));
        this.LL = collectMusicFragment;
        if (collectMusicFragment == null) {
            int i3 = this.LJLLLLLL;
            String str3 = this.LJLLI;
            Bundle LIZ4 = C141415gn.LIZ("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i3);
            if (!TextUtils.isEmpty(str3)) {
                LIZ4.putString("challenge", str3);
            }
            CollectMusicFragment collectMusicFragment2 = new CollectMusicFragment();
            collectMusicFragment2.setArguments(LIZ4);
            this.LL = collectMusicFragment2;
        }
        CollectMusicFragment collectMusicFragment3 = this.LL;
        collectMusicFragment3.LJLJJL = this.LJLJL;
        collectMusicFragment3.LJLLI = this;
        C84880XSy c84880XSy = new C84880XSy(this, new C84978XWs(this));
        this.LLD = c84880XSy;
        c84880XSy.LJFF();
        this.LLD.LIZIZ = this.LJLLLLLL;
        this.LJLJJI.setOffscreenPageLimit(2);
        this.LJLJJI.setAdapter(new C84977XWr(this, getChildFragmentManager()));
        C80675VlP c80675VlP = this.LJLJI;
        if (c80675VlP != null) {
            c80675VlP.setCustomTabViewResId(R.layout.bg_);
            this.LJLJI.setTabMode(0);
            this.LJLJI.setAutoFillWhenScrollable(true);
            this.LJLJI.setupWithViewPager(this.LJLJJI);
            Gl((LinearLayout) this.LJLJI.getChildAt(0));
            this.LJLJI.setOnTabClickListener(new TAY() { // from class: X.Vq6
                @Override // X.TAY
                public final void LIZIZ(C80674VlO c80674VlO) {
                    BaseNewMusicTabFragment baseNewMusicTabFragment = BaseNewMusicTabFragment.this;
                    baseNewMusicTabFragment.getClass();
                    if (c80674VlO.LJ == 1) {
                        baseNewMusicTabFragment.getString(R.string.gaf);
                    }
                    c80674VlO.LIZ();
                }
            });
            Dl();
            this.LJLJI.LIZIZ(new C84968XWi(this));
            this.LJLJI.LJIIJ(this.LJLJLLL).LIZ();
        }
        wl();
        Hl(this.LJLJLLL);
        C73305Spp c73305Spp = this.LJLILLLLZI;
        if (c73305Spp != null) {
            c73305Spp.LJFF();
            this.LJLILLLLZI.setVisibility(0);
        }
        this.LLF.LIZIZ(false, this.LJLLILLLL, this.LLFF);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if ((mo49getActivity instanceof ChooseMusicActivity) && (viewPagerBottomSheetBehavior = ((ChooseMusicActivity) mo49getActivity).LJLJI) != null) {
            ViewPager viewPager = this.LJLJJI;
            viewPager.addOnPageChangeListener(new C80588Vk0(viewPager, viewPagerBottomSheetBehavior));
        }
        try {
            ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
            C10A.LIZIZ(LLLLIILL, this);
            ActivityC45651qj mo49getActivity2 = mo49getActivity();
            if (mo49getActivity2 instanceof C29S) {
                c29s = (C29S) mo49getActivity2;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LLLLIILL;
    }
}

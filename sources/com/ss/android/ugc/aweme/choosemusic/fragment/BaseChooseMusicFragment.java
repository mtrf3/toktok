package com.ss.android.ugc.aweme.choosemusic.fragment;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C141415gn;
import X.C165706es;
import X.C16880lQ;
import X.C1B3;
import X.C27740Aue;
import X.C29S;
import X.C3C5;
import X.C43985HOb;
import X.C46126I8k;
import X.C50891JyB;
import X.C59859NeR;
import X.C5HC;
import X.C5S1;
import X.C63057Oov;
import X.C6D8;
import X.C76800UCe;
import X.C78598Ut0;
import X.C90903hW;
import X.HJZ;
import X.InterfaceC025208a;
import X.InterfaceC212198Ul;
import X.InterfaceC51059K2d;
import X.InterfaceC51567KLr;
import X.K2Z;
import X.KIH;
import X.L1D;
import X.QD3;
import X.XV5;
import X.XVF;
import X.XVG;
import X.XVH;
import X.XWG;
import X.XWH;
import X.XWI;
import Y.AObserverS75S0100000_7;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity;
import com.ss.android.ugc.aweme.choosemusic.activity.MusicBottomSheetBehavior;
import com.ss.android.ugc.aweme.choosemusic.cutmusic.ChooseMusicCutViewModel;
import com.ss.android.ugc.aweme.choosemusic.model.ChooseMusicWithSceneViewModel;
import com.ss.android.ugc.aweme.choosemusic.view.ChooseMusicSelectView;
import com.ss.android.ugc.aweme.choosemusic.viewmodel.SelectedMusicViewModel;
import com.ss.android.ugc.aweme.commerce.tools.common.CommerceToolsService;
import com.ss.android.ugc.aweme.commerce.tools.mission.Mission;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.commercialize.mission.CommerceMissionServiceImpl;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes16.dex */
public abstract class BaseChooseMusicFragment extends AmeBaseFragment implements View.OnClickListener, C5HC, InterfaceC025208a {
    public InterfaceC212198Ul LJLIL;
    public InterfaceC51059K2d LJLILLLLZI;
    public int LJLJI;
    public String LJLJJI;
    public NewMusicTabFragment LJLJJL;
    public boolean LJLJJLL;
    public String LJLJL;
    public Boolean LJLJLJ;
    public XWH LJLJLLL;
    public XV5 LJLL;
    public Music LJLLI;
    public String LJLLILLLL;
    public UrlModel LJLLJ;
    public String LJLLL;
    public boolean LJLLLL;
    public MusicModel LJLLLLLL;
    public String LJLZ;
    public String LJZ;
    public boolean LJZI;
    public boolean LJZL;
    public boolean LL;
    public boolean LLD;
    public String LLF;
    public String LLFF;
    public long LLFFF;
    public long LLFII;
    public boolean LLFZ;
    public boolean LLI;
    public UrlModel LLIFFJFJJ;
    public int LLII;
    public String LLIIII;
    public ChooseMusicWithSceneViewModel LLIIIILZ;
    public int LLIIIJ;
    public View LLIIIL;
    public View LLIIIZ;
    public View LLIIJI;
    public View LLIIJLIL;
    public View LLIIL;
    public View LLIILII;
    public FrameLayout LLIILZL;
    public View LLIIZ;
    public ViewStub LLIL;
    public View LLILII;
    public ChooseMusicSelectView LLILIL;
    public Mission LLILL;
    public final XWI LLILLIZIL = new XWI();

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    @Override // X.InterfaceC025208a
    public final void onBackStackChanged() {
    }

    public void vl(int i) {
    }

    public final void Al() {
        String str;
        if (this.LLIIZ != null && mo49getActivity() != null && this.LLIL.getParent() != null) {
            if (C46126I8k.LIZ() == 4) {
                if (((Number) L1D.LIZ.getValue()).intValue() == 3 || L1D.LIZ()) {
                    this.LLIL.setLayoutResource(R.layout.be5);
                } else {
                    this.LLIL.setLayoutResource(R.layout.be4);
                }
            }
            this.LLILIL = new ChooseMusicSelectView(this.LLIL.inflate(), mo49getActivity(), this, C165706es.LJ(this));
            if (C46126I8k.LIZ() != 4) {
                this.LLILIL.LJLLL = this.LLILII;
            }
            ChooseMusicSelectView chooseMusicSelectView = this.LLILIL;
            String str2 = XVF.LIZ;
            XVG xvg = new XVG(str2, null, null, str2);
            chooseMusicSelectView.getClass();
            XVG clone = xvg.clone();
            chooseMusicSelectView.LL = clone;
            String str3 = xvg.LIZ;
            if (str3 != null && s.LJJJLZIJ(str3, "shoot", false)) {
                str = "shoot_selected_music";
            } else {
                str = "edit_selected_music";
            }
            clone.LJIIJ = str;
            ChooseMusicSelectView chooseMusicSelectView2 = this.LLILIL;
            int i = (int) this.LLFII;
            int i2 = (int) this.LLFFF;
            chooseMusicSelectView2.LJZ = i;
            chooseMusicSelectView2.LJZI = i2;
            NewMusicTabFragment listener = this.LJLJJL;
            o.LJIIIZ(listener, "listener");
            this.LLILIL.LJLLJ = new XVH(this);
        }
    }

    public final void wl() {
        this.LJLILLLLZI.setLastSearchSoundPage(HJZ.DISCOVER_PAGE);
        SearchServiceImpl.LLLZI().LLILZ().LIZ(getFragmentManager());
        FragmentManager childFragmentManager = getChildFragmentManager();
        Fragment LJJJI = childFragmentManager.LJJJI(R.id.dm9);
        if (LJJJI != null && LJJJI.isAdded()) {
            C1B3 c1b3 = new C1B3(childFragmentManager);
            if (C63057Oov.LIZ()) {
                c1b3.LJIIJJI(R.anim.az, R.anim.b0, R.anim.az, R.anim.b0);
            }
            c1b3.LJJI(LJJJI);
            c1b3.LJI();
        }
        if (!C63057Oov.LIZ()) {
            C27740Aue.LJIIIZ(8, this.LLIIL);
            C27740Aue.LJIIIZ(0, this.LLIILII);
            vl(0);
            this.LJLJJLL = false;
        }
    }

    public final boolean Dl() {
        if (K2Z.LIZ() != 0 && this.LJLJI != 2) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        getChildFragmentManager().LJJLL(this);
        XV5 xv5 = this.LJLL;
        if (xv5 != null) {
            xv5.LJ();
        }
        ChooseMusicSelectView chooseMusicSelectView = this.LLILIL;
        if (chooseMusicSelectView != null) {
            chooseMusicSelectView.LIZ();
        }
        super.onDestroyView();
    }

    public final MusicBottomSheetBehavior xl() {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity instanceof ChooseMusicActivity) {
            ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = ((ChooseMusicActivity) mo49getActivity).LJLJL;
            if (viewPagerBottomSheetBehavior != null && (viewPagerBottomSheetBehavior instanceof MusicBottomSheetBehavior)) {
                return (MusicBottomSheetBehavior) viewPagerBottomSheetBehavior;
            }
            return null;
        }
        if (mo49getActivity != null) {
            ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior2 = this.LLIIIILZ.LJLJI;
            if (viewPagerBottomSheetBehavior2 instanceof MusicBottomSheetBehavior) {
                return (MusicBottomSheetBehavior) viewPagerBottomSheetBehavior2;
            }
            return null;
        }
        return null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
    
        if (r3 != null) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Gl(X.C50674Jug r8) {
        /*
            r7 = this;
            boolean r0 = X.C6D8.LIZLLL()
            if (r0 == 0) goto L19
            X.5S1 r1 = new X.5S1
            android.content.Context r0 = r7.getContext()
            r1.<init>(r0)
            r0 = 2131825270(0x7f111276, float:1.9283391E38)
            r1.LIZJ(r0)
            r1.LJ()
            return
        L19:
            r5 = 1
            r7.LJLJJLL = r5
            android.view.View r1 = r7.LLIIL
            r0 = 0
            X.C27740Aue.LJIIIZ(r0, r1)
            android.view.View r1 = r7.LLIILII
            r0 = 4
            X.C27740Aue.LJIIIZ(r0, r1)
            r7.vl(r0)
            androidx.fragment.app.FragmentManager r6 = r7.getChildFragmentManager()
            r4 = 2131367373(0x7f0a15cd, float:1.8354666E38)
            androidx.fragment.app.Fragment r3 = r6.LJJJI(r4)
            if (r3 != 0) goto L60
            android.os.Bundle r2 = r7.getArguments()
            if (r2 == 0) goto L45
            java.lang.String r1 = "music_default_query"
            java.lang.String r0 = r7.LJLJL
            r2.putString(r1, r0)
        L45:
            com.ss.android.ugc.aweme.search.ISearchService r0 = com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl.LLLZI()
            X.KLr r3 = r0.LLLILZ(r2)
            X.KIK r0 = new X.KIK
            r0.<init>(r7)
            r3.md(r0)
            r3.B5(r8)
            boolean r0 = r3 instanceof androidx.fragment.app.Fragment
            if (r0 == 0) goto L82
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            if (r3 == 0) goto L82
        L60:
            boolean r0 = r3.isAdded()
            if (r0 != 0) goto L82
            X.1B3 r2 = new X.1B3
            r2.<init>(r6)
            boolean r0 = X.C63057Oov.LIZ()
            if (r0 == 0) goto L7a
            r1 = 2130772030(0x7f01003e, float:1.7147167E38)
            r0 = 2130772031(0x7f01003f, float:1.7147169E38)
            r2.LJIIJJI(r1, r0, r1, r0)
        L7a:
            java.lang.String r0 = "ChooseSearchMusicFragment"
            r2.LJIIIIZZ(r4, r5, r3, r0)
            r2.LJI()
        L82:
            com.ss.android.ugc.aweme.choosemusic.view.ChooseMusicSelectView r0 = r7.LLILIL
            if (r0 == 0) goto L89
            r0.LIZIZ()
        L89:
            com.ss.android.ugc.aweme.choosemusic.fragment.NewMusicTabFragment r0 = r7.LJLJJL
            com.ss.android.ugc.aweme.choosemusic.utils.ChooseMusicDownloadPlayHelper r0 = r0.LLI
            if (r0 == 0) goto L92
            r0.pause()
        L92:
            com.ss.android.ugc.aweme.choosemusic.fragment.NewMusicTabFragment r0 = r7.LJLJJL
            r0.Nl()
            X.7au r2 = new X.7au
            r2.<init>()
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = "change_music_page"
            r2.LJIIIZ(r1, r0)
            java.lang.String r1 = X.XVF.LJ
            java.lang.String r0 = "creation_id"
            r2.LJIIIZ(r0, r1)
            X.H96 r1 = new X.H96
            r1.<init>()
            java.lang.String r0 = "is_commercial"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.Map r0 = r1.LJFF(r0)
            r2.LJIIIIZZ(r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "enter_search"
            X.FMX.LJIIL(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.choosemusic.fragment.BaseChooseMusicFragment.Gl(X.Jug):void");
    }

    public final void Hl(Boolean bool) {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null) {
            return;
        }
        if (mo49getActivity instanceof ChooseMusicActivity) {
            ((ChooseMusicActivity) mo49getActivity).LLII(bool.booleanValue());
            return;
        }
        ((LiveData) this.LLIIIILZ.LJLJLLL.getValue()).setValue(Boolean.valueOf(bool.booleanValue()));
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C165706es.LJ(this).get(ChooseMusicCutViewModel.class);
        C165706es.LJ(this).get(SelectedMusicViewModel.class);
        this.LLIIIILZ = (ChooseMusicWithSceneViewModel) C165706es.LJ(this).get(ChooseMusicWithSceneViewModel.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ActivityC45651qj mo49getActivity;
        if (view.getId() == R.id.j5p) {
            this.LJLILLLLZI.setLastSearchSoundPage(HJZ.SEARCH_SUG_PAGE);
            Gl(null);
            return;
        }
        if (view.getId() == R.id.jgq || view.getId() == R.id.brs) {
            if (Dl()) {
                if (C6D8.LIZLLL()) {
                    C5S1 c5s1 = new C5S1(getContext());
                    c5s1.LIZJ(R.string.cq5);
                    c5s1.LJ();
                    return;
                }
                Gl(null);
                Fragment LJJJI = getChildFragmentManager().LJJJI(R.id.dm9);
                if (LJJJI == 0 || !LJJJI.isAdded() || !(LJJJI instanceof InterfaceC51567KLr)) {
                    return;
                }
                ((InterfaceC51567KLr) LJJJI).Nb();
                return;
            }
            wl();
            return;
        }
        if (view.getId() != R.id.aej || (mo49getActivity = mo49getActivity()) == null) {
            return;
        }
        mo49getActivity.onBackPressed();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.LJLJI = getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
            this.LLIIIJ = getArguments().getInt("sound_page_scene", 0);
            this.LJLJJI = getArguments().getString("challenge");
            this.LLF = getArguments().getString("creation_id");
            this.LLFF = getArguments().getString("shoot_way");
            getArguments().getSerializable("music_style");
            this.LJLLI = (Music) getArguments().getSerializable("sticker_music");
            this.LJLLILLLL = getArguments().getString("first_sticker_music_ids", null);
            this.LJLLJ = (UrlModel) getArguments().getSerializable("effect_icon_url");
            this.LJLLLL = getArguments().getBoolean("is_busi_sticker", false);
            this.LJLLL = getArguments().getString("first_sticker_id", null);
            this.LJLLLLLL = (MusicModel) getArguments().getSerializable("music_model");
            this.LJLZ = getArguments().getString("music_selected_from");
            this.LJZ = getArguments().getString("music_selected_method");
            this.LJZI = getArguments().getBoolean("is_mv_theme_music");
            this.LJZL = getArguments().getBoolean("music_allow_clear", false);
            this.LL = getArguments().getBoolean("music_allow_cut", false);
            this.LLD = getArguments().getBoolean("music_is_photomv", false);
            getArguments().getBoolean("extra_beat_music_sticker", false);
            this.LLFZ = getArguments().getBoolean("hide_cancel_music_ui", false);
            this.LLI = getArguments().getBoolean("should_show_local_music", false);
            this.LJLJL = getArguments().getString("music_default_query", "");
            this.LJLJLJ = Boolean.valueOf(getArguments().getBoolean("music_initial_load", false));
            this.LLIIII = getArguments().getString("reuse_original_sound_id");
            this.LLIFFJFJJ = (UrlModel) getArguments().getSerializable("reuse_original_sound_url");
            this.LLII = getArguments().getInt("reuse_original_sound_length");
            if (this.LL) {
                this.LLFFF = getArguments().getLong("max_video_duration", 0L);
                this.LLFII = getArguments().getLong("shoot_video_length", 0L);
            } else {
                this.LLFFF = 0L;
                this.LLFII = 0L;
            }
            long j = this.LLFII;
            if (j == 0) {
                j = this.LLFFF;
            }
            XVF.LJI = (int) j;
            this.LLILL = Mission.newInstanceForMusic(getArguments().getString("mission_id"), getArguments().getString("mission_music_id"), null);
        }
        this.LJLIL = SearchServiceImpl.LLLZI().LLILZ();
        this.LJLILLLLZI = CommerceToolsService.LIZ().getMusicContext();
        CommerceMediaServiceImpl.LIZJ().LJIIL(this).Om0();
    }

    @QD3
    public void onSearchMusicPageStateEvent(KIH kih) {
        if (kih == null) {
            return;
        }
        if (kih.LJLIL != 0 && (!Dl() || kih.LJLIL != -1)) {
            C27740Aue.LJIIIZ(8, this.LLIIJI);
            C27740Aue.LJIIIZ(8, this.LLIIJLIL);
            C27740Aue.LJIIIZ(0, this.LLIIIL);
            C27740Aue.LJIIIZ(0, this.LLIIIZ);
        } else {
            C27740Aue.LJIIIZ(0, this.LLIIJI);
            C27740Aue.LJIIIZ(0, this.LLIIJLIL);
            C27740Aue.LJIIIZ(8, this.LLIIIL);
            C27740Aue.LJIIIZ(8, this.LLIIIZ);
        }
        if (kih.LJLIL == -1) {
            C27740Aue.LJIIIZ(0, this.LLIILII);
            vl(0);
            C27740Aue.LJIIIZ(8, this.LLIIL);
        }
    }

    @Override // X.C5HC
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        View view;
        if (i == 4 && (view = this.LLIIJI) != null && view.getVisibility() == 0) {
            this.LLIIJI.performClick();
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        XV5 xv5 = this.LJLL;
        int i = (int) this.LLFII;
        int i2 = (int) this.LLFFF;
        xv5.LJIIIIZZ = i;
        xv5.LJIIIZ = i2;
        xv5.LIZIZ();
        FragmentManager childFragmentManager = getChildFragmentManager();
        Fragment LJJJI = childFragmentManager.LJJJI(R.id.btu);
        if (LJJJI != null) {
            this.LJLJJL = (NewMusicTabFragment) LJJJI;
        } else {
            int i3 = this.LJLJI;
            String str = this.LJLJJI;
            Music music = this.LJLLI;
            String str2 = this.LJLLILLLL;
            String str3 = this.LJLLL;
            boolean z = this.LJLLLL;
            String str4 = this.LLFF;
            int i4 = this.LLIIIJ;
            boolean z2 = this.LLFZ;
            long j = this.LLFFF;
            long j2 = this.LLFII;
            UrlModel urlModel = this.LLIFFJFJJ;
            int i5 = this.LLII;
            String str5 = this.LLIIII;
            boolean z3 = this.LLI;
            UrlModel urlModel2 = this.LJLLJ;
            Bundle LIZ = C141415gn.LIZ("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i3);
            if (!TextUtils.isEmpty(str)) {
                LIZ.putString("challenge", str);
            }
            if (music != null) {
                LIZ.putSerializable("sticker_music", music);
            }
            if (str2 != null) {
                LIZ.putString("first_sticker_music_ids", str2);
            }
            if (urlModel2 != null) {
                LIZ.putSerializable("effect_icon_url", urlModel2);
            }
            if (str3 != null) {
                LIZ.putString("first_sticker_id", str3);
            }
            LIZ.putBoolean("is_busi_sticker", z);
            NewMusicTabFragment newMusicTabFragment = new NewMusicTabFragment();
            if (!TextUtils.isEmpty(str4)) {
                LIZ.putString("shoot_way", str4);
            }
            LIZ.putInt("sound_page_scene", i4);
            LIZ.putBoolean("hide_cancel_music_ui", z2);
            LIZ.putLong("max_video_duration", j);
            LIZ.putLong("shoot_video_length", j2);
            LIZ.putSerializable("reuse_original_sound_url", urlModel);
            LIZ.putInt("reuse_original_sound_length", i5);
            LIZ.putString("reuse_original_sound_id", str5);
            LIZ.putBoolean("should_show_local_music", z3);
            newMusicTabFragment.setArguments(LIZ);
            this.LJLJJL = newMusicTabFragment;
            if (C59859NeR.LIZ()) {
                this.LJLJJL.LJZL = 14;
            } else {
                this.LJLJJL.LJZL = 0;
            }
            if (this.LJZI) {
                this.LJLJJL.LLIIII = true;
            }
            this.LJLJJL.LLIIIILZ = this.LLD;
            C1B3 c1b3 = new C1B3(childFragmentManager);
            c1b3.LIZIZ(R.id.btu, this.LJLJJL);
            c1b3.LJI();
        }
        XV5 xv52 = this.LJLL;
        if (xv52 != null) {
            NewMusicTabFragment iSelectMusic = this.LJLJJL;
            o.LJIIIZ(iSelectMusic, "iSelectMusic");
            xv52.LIZJ = iSelectMusic;
        }
        if (this.LJZL && !C43985HOb.LIZ()) {
            Al();
        }
        getChildFragmentManager().LJ(this);
        XWH xwh = this.LJLJLLL;
        C16880lQ.LJIL(xwh.LIZIZ, xwh.LIZ);
        if ((CommerceMediaServiceImpl.LIZJ().LIZ() || CommerceMediaServiceImpl.LIZJ().LJIIIZ()) && C50891JyB.LIZ(Boolean.TRUE, "show_commerce_tips")) {
            xwh.LIZLLL.setVisibility(0);
        } else {
            xwh.LIZLLL.setVisibility(8);
        }
        xwh.LIZLLL.setUnderView(xwh.LJ);
        if (C50891JyB.LIZ(Boolean.TRUE, "show_tcm_info") && CommerceMediaServiceImpl.LIZJ().LJIILIIL() && !CommerceMediaServiceImpl.LIZJ().LIZ() && !CommerceMediaServiceImpl.LIZJ().LJIIIZ()) {
            xwh.LIZJ.setVisibility(0);
        } else {
            xwh.LIZJ.setVisibility(8);
        }
        xwh.LIZJ.setUnderView(xwh.LJ);
        if (SearchServiceImpl.LLLZI().LJLIL().disableMusicSearch) {
            this.LJLJLLL.LIZ(false);
        }
        if (Dl()) {
            if (K2Z.LIZ() == 3) {
                this.LJLJLLL.LIZ(false);
            }
            HJZ lastSearchSoundPage = this.LJLILLLLZI.getLastSearchSoundPage();
            HJZ hjz = HJZ.DISCOVER_PAGE;
            if (lastSearchSoundPage != hjz || this.LJLJLJ.booleanValue()) {
                Gl(null);
            } else {
                this.LJLILLLLZI.setLastSearchSoundPage(hjz);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator<Fragment> it = getChildFragmentManager().LJJJJLI().iterator();
        while (it.hasNext()) {
            it.next().onActivityResult(i, i2, intent);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        ViewModelStoreOwner mo49getActivity;
        View decorView;
        o.LJIIIZ(inflater, "inflater");
        if (C78598Ut0.LJI(viewGroup) != null) {
            mo49getActivity = C165706es.LIZ(requireActivity(), viewGroup);
        } else {
            mo49getActivity = mo49getActivity();
        }
        XWG LJFF = CommerceMissionServiceImpl.LJIIIIZZ().LJFF(mo49getActivity);
        Mission mission = this.LLILL;
        if (mission != null) {
            LJFF.HX(mission);
        }
        LifecycleOwner LJI = C78598Ut0.LJI(viewGroup);
        if (LJI == null) {
            LJI = requireActivity();
        }
        LJFF.getEvent().observe(LJI, new AObserverS75S0100000_7(this, 97));
        if (C63057Oov.LIZ()) {
            this.LLIIZ = C16880lQ.LLLLIILL(inflater.cloneInContext(new ContextThemeWrapper(mo49getActivity(), R.style.uw)), R.layout.ax1, viewGroup, false);
        } else {
            this.LLIIZ = C16880lQ.LLLLIILL(inflater, R.layout.ax1, viewGroup, false);
        }
        XVF.LJFF = this.LLFF;
        XVF.LJ = this.LLF;
        this.LJLJLLL = new XWH(this.LLIIZ, this, this.LJLJI, this.LLILLIZIL);
        this.LLILII = this.LLIIZ.findViewById(R.id.bb8);
        this.LLIL = (ViewStub) this.LLIIZ.findViewById(R.id.bb7);
        Window window = mo49getActivity().getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            this.LLIIIL = decorView.findViewById(R.id.lcd);
            this.LLIIIZ = decorView.findViewById(R.id.brv);
            this.LLIIJI = decorView.findViewById(R.id.jgq);
            this.LLIIJLIL = decorView.findViewById(R.id.brs);
            C16880lQ.LJIIJ(this, this.LLIIJI);
            C16880lQ.LJIIJ(this, this.LLIIJLIL);
            if (Dl()) {
                C27740Aue.LJIIIZ(0, this.LLIIJI);
                C27740Aue.LJIIIZ(0, this.LLIIJLIL);
                C27740Aue.LJIIIZ(8, this.LLIIIL);
                C27740Aue.LJIIIZ(8, this.LLIIIZ);
            } else {
                C27740Aue.LJIIIZ(8, this.LLIIJI);
                C27740Aue.LJIIIZ(8, this.LLIIJLIL);
                C27740Aue.LJIIIZ(0, this.LLIIIL);
                C27740Aue.LJIIIZ(0, this.LLIIIZ);
            }
        }
        this.LLIIL = this.LLIIZ.findViewById(R.id.dm9);
        this.LLIILII = this.LLIIZ.findViewById(R.id.g3m);
        this.LLIILZL = (FrameLayout) this.LLIIZ.findViewById(R.id.gqm);
        mo49getActivity();
        this.LJLL = new XV5(this, inflater, viewGroup);
        CommerceMissionServiceImpl.LJIIIIZZ().LJFF(mo49getActivity).Y10(this.LLIILZL, inflater);
        View view = this.LLIIZ;
        C29S c29s = null;
        if (!(view instanceof View)) {
            view = null;
        }
        if (view != null) {
            try {
                ViewTreeLifecycleOwner.set(view, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(view, this);
                C10A.LIZIZ(view, this);
                ActivityC45651qj mo49getActivity2 = mo49getActivity();
                if (mo49getActivity2 instanceof C29S) {
                    c29s = (C29S) mo49getActivity2;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return view;
    }
}

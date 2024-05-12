package X;

import Y.ACListenerS35S0100000_15;
import Y.AObserverS83S0100000_15;
import Y.IDDListenerS396S0100000_15;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.adaptation.saa.SAAService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.choosemusic.fragment.BaseChooseMusicFragment;
import com.ss.android.ugc.aweme.choosemusic.fragment.BaseNewMusicTabFragment;
import com.ss.android.ugc.aweme.choosemusic.fragment.ChooseMusicFragment;
import com.ss.android.ugc.aweme.choosemusic.fragment.NewMusicTabFragment;
import com.ss.android.ugc.aweme.choosemusic.model.ChooseMusicWithSceneViewModel;
import com.ss.android.ugc.aweme.choosemusic.model.MusicConsumptionInfo;
import com.ss.android.ugc.aweme.commerce.tools.mission.Mission;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.performance.OpenMusicPanelPerformanceMonitor;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.ss.android.ugc.aweme.services.performance.IAVPerformance;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS0S4541000_15;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XW8 extends WMH implements InterfaceC144185lG, C5HC {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C84894XTm.LJLIL);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 741));
    public boolean LJLJI;
    public int LJLJJI;
    public boolean LJLJJL;
    public RelativeLayout LJLJJLL;
    public RelativeLayout LJLJL;
    public TuxTextView LJLJLJ;
    public TuxTextView LJLJLLL;
    public TCT LJLL;
    public ViewPagerBottomSheetBehavior<View> LJLLI;

    public final IAVPerformance LLJJ() {
        return (IAVPerformance) this.LJLIL.getValue();
    }

    public final ChooseMusicWithSceneViewModel LLJJI() {
        return (ChooseMusicWithSceneViewModel) this.LJLILLLLZI.getValue();
    }

    public final void LLJILJIL() {
        if (!LLJJI().LJLILLLLZI) {
            return;
        }
        ChooseMusicWithSceneViewModel LLJJI = LLJJI();
        Intent intent = new Intent();
        AVExternalServiceImpl.LIZ().publishService().setCurMusic(null, 0);
        intent.putExtra("is_cancel_current_choose_music", true);
        LLJJI.gv0().setValue(new C79409VEn(-1, intent));
    }

    public final void LLJILJILJ() {
        NavigationScene LJIIJJI;
        if (!o.LJ(LLJJI().hv0().getValue(), XWE.LIZ)) {
            return;
        }
        ChooseMusicWithSceneViewModel LLJJI = LLJJI();
        XWB state = XWB.LIZ;
        LLJJI.getClass();
        o.LJIIIZ(state, "state");
        LLJJI.hv0().setValue(state);
        TuxTextView tuxTextView = this.LJLJLLL;
        if (tuxTextView != null && tuxTextView.getVisibility() == 0) {
            KeyboardUtils.LIZIZ(this.LJLJLLL);
        } else {
            TuxTextView tuxTextView2 = this.LJLJLJ;
            if (tuxTextView2 != null) {
                KeyboardUtils.LIZIZ(tuxTextView2);
            } else {
                o.LJIJI("tvTitle");
                throw null;
            }
        }
        View view = this.mView;
        if (view != null) {
            view.setEnabled(false);
        }
        if (o.LJ(LLJJI().hv0().getValue(), state) && (LJIIJJI = C78923UyF.LJIIJJI(this)) != null) {
            LJIIJJI.remove(this);
        }
    }

    public final void LLJJIII() {
        View requireViewById = requireViewById(R.id.mi_);
        o.LJIIIIZZ(requireViewById, "requireViewById<TextView>(R.id.tv_right_title)");
        TextView textView = (TextView) requireViewById;
        View requireViewById2 = requireViewById(R.id.brw);
        o.LJIIIIZZ(requireViewById2, "requireViewById<TextView….id.const_tv_right_title)");
        TextView textView2 = (TextView) requireViewById2;
        if (LLJJIJI() && !KO4.LIZ()) {
            try {
                Boolean enableLocalMusicEntrance = C2YJ.LIZIZ.LIZ.getEnableLocalMusicEntrance();
                o.LJIIIIZZ(enableLocalMusicEntrance, "get().getEnableLocalMusicEntrance()");
                if (enableLocalMusicEntrance.booleanValue()) {
                    textView.setVisibility(0);
                    textView2.setVisibility(0);
                    C16880lQ.LJIJI(textView, new ViewOnClickListenerC85609Xin(new ACListenerS35S0100000_15(this, 161), true));
                    C16880lQ.LJIJI(textView2, new ViewOnClickListenerC85609Xin(new ACListenerS35S0100000_15(this, 162), true));
                    return;
                }
            } catch (C158056If e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        textView.setVisibility(8);
        textView2.setVisibility(8);
    }

    public final boolean LLJJIJI() {
        if (C6D8.LIZLLL() || this.LJLJI) {
            return false;
        }
        TCT tct = this.LJLL;
        if (tct != null) {
            if (tct.LJIIJ.getVisibility() != 8 || tct.LJIIJJI.getVisibility() != 8) {
                return false;
            }
            return true;
        }
        o.LJIJI("commerceChooseMusicHelper");
        throw null;
    }

    @Override // X.WM7
    public final void onDestroy() {
        super.onDestroy();
        InterfaceC45540Hu4 LIZIZ = C163756bj.LIZIZ(this);
        if (LIZIZ != null) {
            LIZIZ.unRegisterActivityResultListener(this);
            LIZIZ.unRegisterActivityOnKeyDownListener(this);
        }
        IAVPerformance LLJJ = LLJJ();
        Activity requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        LLJJ.leave(requireActivity, "music_select");
    }

    @Override // X.WM7
    public final void onDestroyView() {
        String str;
        MusicModel musicModel;
        Long l;
        BaseChooseMusicFragment baseChooseMusicFragment;
        BaseChooseMusicFragment baseChooseMusicFragment2;
        super.onDestroyView();
        Activity requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(requireActivity);
        o.LJI(LJJIFFI);
        FragmentManager supportFragmentManager = LJJIFFI.getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "requireActivity().fragme…!).supportFragmentManager");
        Fragment LJJJI = supportFragmentManager.LJJJI(R.id.dm8);
        if ((LJJJI instanceof ChooseMusicFragment) && (baseChooseMusicFragment2 = (BaseChooseMusicFragment) LJJJI) != null) {
            NewMusicTabFragment newMusicTabFragment = baseChooseMusicFragment2.LJLJJL;
            FragmentManager childFragmentManager = newMusicTabFragment.getChildFragmentManager();
            C1B3 LIZ = C1B6.LIZ(childFragmentManager, childFragmentManager);
            StringBuilder LIZ2 = X1D.LIZ();
            String str2 = BaseNewMusicTabFragment.LLILL;
            LIZ2.append(str2);
            LIZ2.append('0');
            Fragment LJJJIL = childFragmentManager.LJJJIL(X1D.LIZIZ(LIZ2));
            if (LJJJIL != null) {
                LIZ.LJJI(LJJJIL);
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(str2);
            LIZ3.append('1');
            Fragment LJJJIL2 = childFragmentManager.LJJJIL(X1D.LIZIZ(LIZ3));
            if (LJJJIL2 != null) {
                LIZ.LJJI(LJJJIL2);
            }
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(str2);
            LIZ4.append('2');
            Fragment LJJJIL3 = childFragmentManager.LJJJIL(X1D.LIZIZ(LIZ4));
            if (LJJJIL3 != null) {
                LIZ.LJJI(LJJJIL3);
            }
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append(str2);
            LIZ5.append('3');
            Fragment LJJJIL4 = childFragmentManager.LJJJIL(X1D.LIZIZ(LIZ5));
            if (LJJJIL4 != null) {
                LIZ.LJJI(LJJJIL4);
            }
            LIZ.LJI();
            FragmentManager childFragmentManager2 = baseChooseMusicFragment2.getChildFragmentManager();
            childFragmentManager2.getClass();
            C1B3 c1b3 = new C1B3(childFragmentManager2);
            c1b3.LJJI(newMusicTabFragment);
            c1b3.LJI();
            C1B3 c1b32 = new C1B3(supportFragmentManager);
            c1b32.LJJI(baseChooseMusicFragment2);
            c1b32.LJI();
            Fragment LJJJIL5 = supportFragmentManager.LJJJIL("voice_search_contaienr");
            if (LJJJIL5 != null) {
                C1B3 c1b33 = new C1B3(supportFragmentManager);
                c1b33.LJJI(LJJJIL5);
                c1b33.LJI();
            }
        }
        Mission mission = LLJJI().LJLJJI;
        if (mission != null) {
            str = mission.getMusicId();
        } else {
            str = null;
        }
        Activity requireActivity2 = requireActivity();
        o.LJIIIIZZ(requireActivity2, "requireActivity()");
        ActivityC45651qj LJJIFFI2 = C45804HyK.LJJIFFI(requireActivity2);
        o.LJI(LJJIFFI2);
        FragmentManager supportFragmentManager2 = LJJIFFI2.getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager2, "requireActivity().fragme…!).supportFragmentManager");
        Fragment LJJJI2 = supportFragmentManager2.LJJJI(R.id.dm8);
        if ((LJJJI2 instanceof ChooseMusicFragment) && (baseChooseMusicFragment = (BaseChooseMusicFragment) LJJJI2) != null) {
            musicModel = baseChooseMusicFragment.LJLLLLLL;
        } else {
            musicModel = null;
        }
        if (!TextUtils.isEmpty(str)) {
            if (musicModel != null) {
                l = Long.valueOf(musicModel.getId());
            } else {
                l = null;
            }
            if (!TextUtils.equals(String.valueOf(l), str)) {
                new H9C().LJIIJJI(LLJJI().LJLJJI, 1);
                LLJJI().LJLJJI = null;
            }
        }
        ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior = this.LJLLI;
        if (viewPagerBottomSheetBehavior != null) {
            viewPagerBottomSheetBehavior.LJIILLIIL = null;
            if (C84887XTf.LIZ()) {
                Type type = new C72836SiG().getType();
                o.LJIIIIZZ(type, "type");
                Object arrayList = new ArrayList();
                String value = "";
                String string = C72834SiE.LIZ().getString("music_pick_discover", "");
                o.LJIIIIZZ(string, "keva.getString(key, default)");
                if (!o.LJ(string, "")) {
                    try {
                        arrayList = GsonHolder.LIZLLL().LIZ().LJII(string, type);
                    } catch (Exception unused) {
                        C72834SiE.LIZ().erase("music_pick_discover");
                    }
                }
                ArrayList arrayList2 = (ArrayList) arrayList;
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                Iterator<MusicConsumptionInfo> it = C72834SiE.LIZ.iterator();
                while (it.hasNext()) {
                    MusicConsumptionInfo next = it.next();
                    Iterator it2 = arrayList2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            MusicConsumptionInfo musicConsumptionInfo = (MusicConsumptionInfo) it2.next();
                            if (musicConsumptionInfo.musicId == next.musicId) {
                                musicConsumptionInfo.consumptionTime = next.consumptionTime;
                                break;
                            }
                        } else {
                            arrayList2.add(next);
                            break;
                        }
                    }
                }
                C72834SiE.LIZ.clear();
                try {
                    value = GsonHolder.LIZLLL().LIZ().LJIILL(arrayList2);
                } catch (Throwable unused2) {
                }
                o.LJIIIIZZ(value, "value");
                C72834SiE.LIZ().storeString("music_pick_discover", value);
                return;
            }
            return;
        }
        o.LJIJI("mBehavior");
        throw null;
    }

    @Override // X.WM7
    public final void onPause() {
        String str;
        super.onPause();
        IAVPerformance LLJJ = LLJJ();
        Activity requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        Bundle bundle = this.mArguments;
        String str2 = null;
        if (bundle != null) {
            str = bundle.getString("creation_id");
        } else {
            str = null;
        }
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            str2 = bundle2.getString("shoot_way");
        }
        LLJJ.pause(requireActivity, "music_select", str, str2);
    }

    @Override // X.WM7
    public final void onResume() {
        super.onResume();
        if (this.LJLJJI == 2) {
            XVF.LJIILLIIL("video_shoot_page");
        } else {
            XVF.LJIILLIIL("video_edit_page");
        }
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        Bundle bundle2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        boolean z;
        boolean z2;
        ViewTreeObserver viewTreeObserver;
        Bundle bundle3;
        super.onActivityCreated(bundle);
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            bundle2 = bundle4.getBundle("arguments");
        } else {
            bundle2 = null;
        }
        LLJJ().step(OpenMusicPanelPerformanceMonitor.INSTANCE, "choose_music_created");
        IAVPerformance LLJJ = LLJJ();
        Activity requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        LLJJ.enter(requireActivity, "music_select");
        View requireViewById = requireViewById(R.id.mo6);
        o.LJIIIIZZ(requireViewById, "requireViewById<TuxTextView>(R.id.tv_title)");
        TuxTextView tuxTextView = (TuxTextView) requireViewById;
        Bundle bundle5 = this.mArguments;
        if (bundle5 != null) {
            str = bundle5.getString("title");
        } else {
            str = null;
        }
        tuxTextView.setText(str);
        tuxTextView.setTuxFont(33);
        this.LJLJLJ = tuxTextView;
        TuxTextView tuxTextView2 = (TuxTextView) requireViewById(R.id.brx);
        Bundle bundle6 = this.mArguments;
        if (bundle6 != null) {
            str2 = bundle6.getString("title");
        } else {
            str2 = null;
        }
        tuxTextView2.setText(str2);
        tuxTextView2.setTuxFont(33);
        this.LJLJLLL = tuxTextView2;
        this.LJLJJLL = (RelativeLayout) requireViewById(R.id.l_5);
        this.LJLJL = (RelativeLayout) requireViewById(R.id.bru);
        if (AVExternalServiceImpl.LIZ().anchorService().newRoundCornerUXOptimization()) {
            RelativeLayout relativeLayout = this.LJLJJLL;
            if (relativeLayout != null) {
                relativeLayout.setBackgroundResource(R.drawable.a_l);
            }
            RelativeLayout relativeLayout2 = this.LJLJL;
            if (relativeLayout2 != null) {
                relativeLayout2.setBackgroundResource(R.drawable.a_l);
            }
        }
        if (C63057Oov.LIZ()) {
            RelativeLayout relativeLayout3 = this.LJLJL;
            if (relativeLayout3 != null) {
                relativeLayout3.setVisibility(0);
            }
            RelativeLayout relativeLayout4 = this.LJLJJLL;
            if (relativeLayout4 != null) {
                relativeLayout4.setVisibility(8);
            }
        } else {
            RelativeLayout relativeLayout5 = this.LJLJL;
            if (relativeLayout5 != null) {
                relativeLayout5.setVisibility(8);
            }
            RelativeLayout relativeLayout6 = this.LJLJJLL;
            if (relativeLayout6 != null) {
                relativeLayout6.setVisibility(0);
            }
        }
        ChooseMusicWithSceneViewModel LLJJI = LLJJI();
        C163466bG c163466bG = Mission.Companion;
        if (bundle2 != null) {
            str3 = bundle2.getString("mission_music_id");
            str4 = bundle2.getString("enter_from");
            str5 = bundle2.getString("mission_id");
        } else {
            str3 = null;
            str4 = null;
            str5 = null;
        }
        c163466bG.getClass();
        LLJJI.LJLJJI = new Mission(str3, null, false, str4, false, null, false, null, false, str5, null, false, false, 7670, null);
        Activity requireActivity2 = requireActivity();
        o.LJIIIIZZ(requireActivity2, "requireActivity()");
        View view = this.mView;
        o.LJIIIIZZ(view, "view");
        this.LJLL = new TCT(requireActivity2, view);
        Bundle bundle7 = this.mArguments;
        if (bundle7 != null && bundle7.getBoolean("hide_local_music", false)) {
            z = true;
        } else {
            z = false;
        }
        this.LJLJI = z;
        Bundle bundle8 = this.mArguments;
        if (bundle8 != null && bundle8.getBoolean("long_video", false)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJLJJL = z2;
        LLJJIII();
        C16880lQ.LJIIJ(new ACListenerS35S0100000_15(this, 163), requireViewById(R.id.lcd));
        C16880lQ.LJIIJ(new ACListenerS35S0100000_15(this, 164), requireViewById(R.id.brv));
        View requireViewById2 = requireViewById(R.id.k83);
        Context context = requireViewById2.getContext();
        o.LJIIIIZZ(context, "context");
        requireViewById2.setMinimumHeight(C63081OpJ.LJJJJLI(context));
        ViewPagerBottomSheetBehavior<View> LIZ = ViewPagerBottomSheetBehavior.LIZ(requireViewById(R.id.c8m));
        LIZ.LJIILLIIL = new XW9(this);
        LIZ.LJI = true;
        LIZ.setPeekHeight(C60996Nwm.LIZLLL(requireActivity()) + C60996Nwm.LJ(requireActivity()));
        this.LJLLI = LIZ;
        ChooseMusicWithSceneViewModel LLJJI2 = LLJJI();
        ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior = this.LJLLI;
        if (viewPagerBottomSheetBehavior != null) {
            LLJJI2.getClass();
            LLJJI2.LJLJI = viewPagerBottomSheetBehavior;
            Activity requireActivity3 = requireActivity();
            o.LJIIIIZZ(requireActivity3, "requireActivity()");
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(requireActivity3);
            o.LJI(LJJIFFI);
            FragmentManager supportFragmentManager = LJJIFFI.getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "requireActivity().fragme…!).supportFragmentManager");
            if (supportFragmentManager.LJJJI(R.id.dm8) == null && (bundle3 = this.mArguments) != null) {
                int i = bundle3.getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
                this.LJLJJI = i;
                if (i == 2) {
                    XVF.LJIILLIIL("video_shoot_page");
                } else {
                    XVF.LJIILLIIL("video_edit_page");
                }
                XVF.LIZIZ = bundle3.getString("shoot_tab_name");
                XVF.LJIIIZ = bundle3.getBoolean("is_carousel");
                AVExternalServiceImpl.LIZ().publishService().setMusicChooseType(this.LJLJJI);
                String string = bundle3.getString("challenge");
                String string2 = bundle3.getString("creation_id");
                String string3 = bundle3.getString("shoot_way");
                MusicModel musicModel = (MusicModel) bundle3.getSerializable("music_model");
                boolean z3 = bundle3.getBoolean("music_allow_clear", false);
                boolean z4 = bundle3.getBoolean("music_allow_cut", false);
                boolean z5 = bundle3.getBoolean("music_is_photomv", false);
                String string4 = bundle3.getString("reuse_original_sound_id");
                UrlModel urlModel = (UrlModel) bundle3.getSerializable("reuse_original_sound_url");
                int i2 = bundle3.getInt("reuse_original_sound_length");
                boolean z6 = bundle3.getBoolean("is_mv_theme_music");
                ICreativeSAAService LIZ2 = SAAService.LIZ();
                if (LIZ2 != null) {
                    Activity requireActivity4 = requireActivity();
                    o.LJIIIIZZ(requireActivity4, "requireActivity()");
                    LIZ2.invokeMethodsSafely(requireActivity4, new AqS0S4541000_15(i2, bundle2, supportFragmentManager, urlModel, this, musicModel, string, string3, string2, string4, z3, z5, z4, z6, 0));
                    TCT tct = this.LJLL;
                    if (tct != null) {
                        tct.LJIILJJIL = new AqS0S4541000_15(i2, bundle2, supportFragmentManager, urlModel, this, musicModel, string, string3, string2, string4, z3, z5, z4, z6, 1);
                    } else {
                        o.LJIJI("commerceChooseMusicHelper");
                        throw null;
                    }
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            LLJJI().LJLIL = true;
            LLJJI().gv0().observe(this, new AObserverS83S0100000_15(this, 77));
            LLJJI().iv0().observe(this, new AObserverS83S0100000_15(this, 78));
            ((LiveData) LLJJI().LJLJLLL.getValue()).observe(this, new AObserverS83S0100000_15(this, 76));
            IDDListenerS396S0100000_15 iDDListenerS396S0100000_15 = new IDDListenerS396S0100000_15(this, 1);
            View view2 = this.mView;
            if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null) {
                viewTreeObserver.addOnPreDrawListener(iDDListenerS396S0100000_15);
                return;
            }
            return;
        }
        o.LJIJI("mBehavior");
        throw null;
    }

    @Override // X.C5HC
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ActivityC45651qj LJJIFFI;
        FragmentManager supportFragmentManager;
        List<Fragment> LJJJJLI;
        Activity activity = this.mActivity;
        if (activity != null && (LJJIFFI = C45804HyK.LJJIFFI(activity)) != null && (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) != null && (LJJJJLI = supportFragmentManager.LJJJJLI()) != null) {
            for (InterfaceC36571c5 interfaceC36571c5 : LJJJJLI) {
                if ((interfaceC36571c5 instanceof C5HC) && ((C5HC) interfaceC36571c5).onKeyDown(i, keyEvent)) {
                    return true;
                }
            }
        }
        if (i == 4) {
            LLJILJIL();
            if (o.LJ(LLJJI().hv0().getValue(), XWE.LIZ)) {
                LLJILJILJ();
            }
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC144185lG
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        FragmentManager supportFragmentManager;
        Fragment LJJJI;
        if (i2 != -1) {
            if (i2 == 101) {
                Activity requireActivity = requireActivity();
                o.LJIIIIZZ(requireActivity, "requireActivity()");
                ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(requireActivity);
                if (LJJIFFI != null && (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) != null && (LJJJI = supportFragmentManager.LJJJI(R.id.dm8)) != null) {
                    LJJJI.onActivityResult(i, i2, intent);
                }
            }
        } else {
            View view = this.mView;
            if (view != null) {
                view.setVisibility(8);
            }
            C84893XTl c84893XTl = (C84893XTl) ((LiveData) LLJJI().LJLJJL.getValue()).getValue();
            if (c84893XTl != null) {
                NavigationScene LJIIJJI = C78923UyF.LJIIJJI(this);
                if (LJIIJJI != null) {
                    new C42653Gob();
                    LJIIJJI.LLJJJ(new C42654Goc(new C82161WMj()));
                }
                c84893XTl.LJLILLLLZI.invoke(new C79409VEn(i2, intent));
                c84893XTl.LJLIL.invoke();
            }
        }
        return true;
    }

    @Override // X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        InterfaceC45540Hu4 LIZIZ = C163756bj.LIZIZ(this);
        if (LIZIZ != null) {
            LIZIZ.registerActivityResultListener(this);
            LIZIZ.registerActivityOnKeyDownListener(this);
        }
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.cbm, container, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) LLLLIILL;
    }

    @Override // X.WMH, X.WM7
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }

    public static final ChooseMusicFragment LLJJIJIIJIL(XW8 xw8, String str, MusicModel musicModel, boolean z, boolean z2, Bundle bundle, String str2, String str3, boolean z3, String str4, UrlModel urlModel, int i, boolean z4) {
        boolean z5;
        int i2 = xw8.LJLJJI;
        EnumC122984sA enumC122984sA = EnumC122984sA.BtnConfirm;
        boolean z6 = xw8.LJLJJL;
        if (!xw8.LLJJIJI() || !KO4.LIZ()) {
            z5 = false;
        } else {
            z5 = true;
        }
        return C84910XUc.LIZ(i2, str, musicModel, enumC122984sA, z, z2, bundle, str2, str3, z6 ? 1 : 0, z3, str4, urlModel, i, z4, z5, "", true);
    }
}

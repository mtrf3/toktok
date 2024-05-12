package com.ss.android.ugc.aweme.dsp.playpage.base;

import X.ASL;
import X.ActivityC45651qj;
import X.C03880Dg;
import X.C16880lQ;
import X.C2068389v;
import X.C214368bA;
import X.C221108m2;
import X.C2JO;
import X.C2L4;
import X.C2U8;
import X.C40443Fu3;
import X.C42625Go9;
import X.C57092Lx;
import X.C57434MgQ;
import X.C61447O9r;
import X.C62822Ol8;
import X.C65300Pk0;
import X.C68322mC;
import X.C73305Spp;
import X.C73306Spq;
import X.C76800UCe;
import X.C91071Zoh;
import X.C91154Zq2;
import X.C91155Zq3;
import X.C91199Zql;
import X.C91200Zqm;
import X.C91210Zqw;
import X.C91211Zqx;
import X.C91215Zr1;
import X.C91218Zr4;
import X.C91219Zr5;
import X.C91220Zr6;
import X.C91246ZrW;
import X.C91249ZrZ;
import X.C91250Zra;
import X.C91252Zrc;
import X.C91279Zs3;
import X.C91284Zs8;
import X.C91299ZsN;
import X.C91309ZsX;
import X.C91362ZtO;
import X.C91369ZtV;
import X.C91407Zu7;
import X.C91409Zu9;
import X.C91450Zuo;
import X.C91451Zup;
import X.C91452Zuq;
import X.C91453Zur;
import X.C91473ZvB;
import X.C91498Zva;
import X.C91506Zvi;
import X.EnumC91213Zqz;
import X.EnumC91307ZsV;
import X.EnumC91322Zsk;
import X.InterfaceC91281Zs5;
import X.InterfaceC91286ZsA;
import X.InterfaceC91296ZsK;
import X.InterfaceC91459Zux;
import X.KL2;
import X.KUR;
import X.L41;
import X.OSZ;
import X.QD3;
import X.SY4;
import X.TBU;
import X.X1D;
import X.YBK;
import X.YBM;
import X.YXW;
import Y.IDCListenerS137S0100000_29;
import Y.IDCListenerS84S0200000_29;
import Y.IDObserverS226S0100000_29;
import Y.IDRunnableS32S0200000_29;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.provider.preload.PreLoader;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.dsp.arch.FragmentScope;
import com.ss.android.ugc.aweme.dsp.common.arch.BaseMusicDspFragment;
import com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpiredPlayableManager;
import com.ss.android.ugc.aweme.dsp.playpage.favpage.FavPlayerFragment;
import com.ss.android.ugc.aweme.dsp.playpage.mainpage.MainPlayerFragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.IXTabPanelAbility;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.IDqS177S0200000_29;
import kotlin.jvm.internal.IDqS421S0100000_29;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes22.dex */
public abstract class BasePlayerFragment extends BaseMusicDspFragment implements InterfaceC91281Zs5, InterfaceC91286ZsA, C2L4 {
    public static final int LLFF;
    public final C91473ZvB LJLJI;
    public C91362ZtO LJLJJL;
    public C91071Zoh LJLJJLL;
    public C91506Zvi LJLJL;
    public final C91210Zqw LJLJLJ;
    public C91284Zs8 LJLJLLL;
    public C73305Spp LJLL;
    public final Handler LJLLI;
    public String LJLLILLLL;
    public boolean LJLLJ;
    public C91369ZtV LJLLL;
    public C91407Zu7 LJLLLL;
    public String LJLLLLLL;
    public final boolean LJLZ;
    public boolean LJZ;
    public boolean LJZI;
    public final C62822Ol8 LJZL;
    public boolean LL;
    public boolean LLD;
    public final Map<Integer, View> LLF = new LinkedHashMap();
    public final BitSet LJLJJI = new BitSet();

    static {
        C57092Lx.LIZ.getClass();
        LLFF = C61447O9r.LIZ();
    }

    public boolean Al() {
        return true;
    }

    @Override // X.InterfaceC91281Zs5
    public final boolean D9() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.dsp.common.arch.BaseMusicDspFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLF).clear();
    }

    @Override // com.ss.android.ugc.aweme.dsp.common.arch.BaseMusicDspFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLF;
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

    @Override // X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(FragmentScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.dsp.common.arch.BaseMusicDspFragment
    public final int layoutId() {
        return R.layout.bvg;
    }

    @Override // X.InterfaceC91281Zs5
    public boolean w7() {
        return this instanceof FavPlayerFragment;
    }

    public final boolean Dl() {
        C91506Zvi c91506Zvi = this.LJLJL;
        if (c91506Zvi != null) {
            return c91506Zvi.LJJIII().LIZ();
        }
        return false;
    }

    public final void Jl() {
        if (this.LLD && this.LL) {
            YBM.LIZ.getClass();
            if (!YBM.LIZJ()) {
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("updateFragmentVisible ");
            LIZ.append(this);
            X1D.LIZIZ(LIZ);
            InterfaceC91296ZsK LIZ2 = getPlayerController().LIZ();
            if (LIZ2 == null) {
                return;
            }
            ExpiredPlayableManager expiredPlayableManager = ExpiredPlayableManager.INSTANCE;
            if (expiredPlayableManager.isLandingPageShow() && !o.LJ(LIZ2, expiredPlayableManager.getPreviewClipSongUpsellPlayable())) {
                expiredPlayableManager.clearPlayRecordViaUpsellChanged();
                C2U8.LIZ(new C91450Zuo());
            } else {
                if (!expiredPlayableManager.getPreviewClipSongUpsellUnshowSet().contains(LIZ2)) {
                    return;
                }
                InterfaceC91296ZsK previewClipSongUpsellPlayable = expiredPlayableManager.getPreviewClipSongUpsellPlayable();
                expiredPlayableManager.setPreviewClipSongUpsellPlayable(LIZ2);
                if (o.LJ(previewClipSongUpsellPlayable, LIZ2)) {
                    return;
                }
                C2U8.LIZ(new C91450Zuo());
            }
        }
    }

    @Override // X.InterfaceC91281Zs5
    public final boolean a7() {
        L41.LIZ.getClass();
        if (!L41.LIZJ() || Gl(mo49getActivity()) || !o.LJ(this.LJLJI.LJLIL, "dsp_player") || C91211Zqx.LIZ() != 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.dsp.common.arch.BaseMusicDspFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.LJLLI.removeCallbacksAndMessages(null);
        C91200Zqm.LIZ.remove(this);
        C91219Zr5.LIZ = null;
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.InterfaceC91281Zs5
    public final IXTabPanelAbility th() {
        return (IXTabPanelAbility) this.LJZL.getValue();
    }

    @Override // X.InterfaceC91281Zs5
    public final int v4() {
        float LIZJ;
        View findViewById;
        View findViewById2;
        L41.LIZ.getClass();
        if (L41.LIZLLL() && Gl(mo49getActivity())) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null && (findViewById2 = mo49getActivity.findViewById(R.id.j5x)) != null) {
                return findViewById2.getHeight();
            }
            LIZJ = KL2.LIZJ(getContext(), 44.0f);
        } else {
            ActivityC45651qj mo49getActivity2 = mo49getActivity();
            if (mo49getActivity2 != null && (findViewById = mo49getActivity2.findViewById(R.id.df5)) != null) {
                return findViewById.getHeight();
            }
            LIZJ = KL2.LIZJ(getContext(), 44.0f);
        }
        return (int) LIZJ;
    }

    public final BasePlayerViewModel xl() {
        ViewModel viewModel = this.LJLIL;
        if (viewModel instanceof BasePlayerViewModel) {
            return (BasePlayerViewModel) viewModel;
        }
        return null;
    }

    public final void Hl() {
        String str;
        if (!a7()) {
            this.LJZI = false;
            BasePlayerViewModel xl = xl();
            if (xl != null) {
                Bundle arguments = getArguments();
                if (arguments == null || (str = arguments.getString("full_clip_id")) == null) {
                    str = "";
                }
                Bundle arguments2 = getArguments();
                long j = 0;
                if (arguments2 != null) {
                    j = arguments2.getLong("music_id", 0L);
                }
                xl.LJLJI.setValue(Boolean.TRUE);
                xl.LJLL = new OSZ<>(str, Long.valueOf(j));
                xl.hv0(j, str);
                return;
            }
            return;
        }
        this.LJZI = true;
    }

    public final void Kl() {
        String str;
        KUR kur;
        C91071Zoh c91071Zoh;
        InterfaceC91296ZsK LIZ = getPlayerController().LIZ();
        if (LIZ != null) {
            str = LIZ.getId();
        } else {
            str = null;
        }
        if (ExpiredPlayableManager.INSTANCE.isTodayPlayableLimited() && !C91218Zr4.LIZJ(str, getPlayerController().LJLILLLLZI)) {
            C91071Zoh c91071Zoh2 = this.LJLJJLL;
            if (c91071Zoh2 != null) {
                c91071Zoh2.LIZJ();
            }
            C91071Zoh c91071Zoh3 = this.LJLJJLL;
            if (c91071Zoh3 != null) {
                c91071Zoh3.setCanLoadMore(false);
                return;
            }
            return;
        }
        C91071Zoh c91071Zoh4 = this.LJLJJLL;
        if (c91071Zoh4 != null) {
            c91071Zoh4.setCanLoadMore(!getPlayerController().LJFF());
        }
        C91071Zoh c91071Zoh5 = this.LJLJJLL;
        if (c91071Zoh5 == null || (kur = c91071Zoh5.LJLILLLLZI) == null || kur.getVisibility() != 0 || (c91071Zoh = this.LJLJJLL) == null) {
            return;
        }
        c91071Zoh.LIZJ();
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [T, X.ZrW] */
    @Override // X.InterfaceC91281Zs5
    public final void Ok() {
        C91154Zq2 c91154Zq2;
        C91154Zq2 c91154Zq22;
        Boolean bool;
        C91154Zq2 c91154Zq23;
        String str;
        String LLLZ;
        C91154Zq2 c91154Zq24;
        C91407Zu7 c91407Zu7;
        String id;
        View view;
        String str2;
        String str3;
        C91154Zq2 c91154Zq25;
        C91154Zq2 c91154Zq26;
        String id2;
        boolean enableShowNewUserGuide = YBK.LIZ().enableMusicDspOPT.getEnableShowNewUserGuide();
        String str4 = "";
        String str5 = CardStruct.IStatusCode.DEFAULT;
        Boolean bool2 = null;
        if (enableShowNewUserGuide) {
            Fragment parentFragment = getParentFragment();
            if (parentFragment == null || (c91154Zq2 = C91155Zq3.LIZ.get(parentFragment)) == null || c91154Zq2.LIZ == null) {
                Fragment parentFragment2 = getParentFragment();
                Keva repo = Keva.getRepo("music_dsp_guide_repo");
                String com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
                if (com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId == null || com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId.length() == 0) {
                    com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = CardStruct.IStatusCode.DEFAULT;
                }
                L41.LIZ.getClass();
                if (L41.LIZ()) {
                    LLLZ = C16880lQ.LLLZ("can_play_background_guide_%s", Arrays.copyOf(new Object[]{com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId}, 1));
                    o.LJIIIIZZ(LLLZ, "format(format, *args)");
                } else {
                    LLLZ = C16880lQ.LLLZ("cannot_play_background_guide_%s", Arrays.copyOf(new Object[]{com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId}, 1));
                    o.LJIIIIZZ(LLLZ, "format(format, *args)");
                }
                boolean z = repo.getBoolean(LLLZ, false);
                if (parentFragment2 != null && (c91154Zq24 = C91155Zq3.LIZ.get(parentFragment2)) != null) {
                    c91154Zq24.LIZ = Boolean.valueOf(z);
                }
            }
            Fragment parentFragment3 = getParentFragment();
            if (parentFragment3 == null || (c91154Zq22 = C91155Zq3.LIZ.get(parentFragment3)) == null) {
                bool = null;
            } else {
                bool = c91154Zq22.LIZ;
            }
            if (o.LJ(bool, Boolean.FALSE)) {
                C68322mC c68322mC = new C68322mC();
                View LLLZIIL = C16880lQ.LLLZIIL(R.layout.b0, C16880lQ.LLZIL(getContext()), null);
                L41.LIZ.getClass();
                if (L41.LIZ()) {
                    ((AppCompatImageView) LLLZIIL.findViewById(R.id.f12)).setImageResource(R.drawable.l2);
                    ((TextView) LLLZIIL.findViewById(R.id.m5c)).setText(R.string.ih4);
                    ((TextView) LLLZIIL.findViewById(R.id.jl)).setText(R.string.ih3);
                    if (this instanceof MainPlayerFragment) {
                        str = "track_reco";
                    } else if (!(this instanceof FavPlayerFragment)) {
                        str = "";
                    } else {
                        str = "my_playlist";
                    }
                    c68322mC.element = new C91246ZrW(str, getEnterMethod());
                } else {
                    ((AppCompatImageView) LLLZIIL.findViewById(R.id.f12)).setImageResource(R.drawable.kv);
                    ((TextView) LLLZIIL.findViewById(R.id.m5c)).setText(R.string.ih5);
                    ((TextView) LLLZIIL.findViewById(R.id.jl)).setText(R.string.ih2);
                }
                C16880lQ.LJJIZ((SY4) LLLZIIL.findViewById(R.id.jl), new IDCListenerS84S0200000_29(c68322mC, LLLZIIL, 6));
                C16880lQ.LJIILJJIL((FrameLayout) LLLZIIL.findViewById(R.id.iw), new IDCListenerS137S0100000_29(LLLZIIL, 12));
                ASL asl = new ASL();
                asl.LIZ.LJLLI = LLLZIIL;
                FragmentManager fragmentManager = getFragmentManager();
                if (fragmentManager != null) {
                    C91215Zr1.LIZLLL(new C91409Zu9(asl, fragmentManager, "MusicDspGuideSheet", EnumC91213Zqz.GUIDE_ACTION.ordinal(), this, new IDqS177S0200000_29(this, (BasePlayerFragment) c68322mC, (C68322mC<C91246ZrW>) 5), new IDqS421S0100000_29(c68322mC, (C68322mC<C91246ZrW>) 80)));
                    Fragment parentFragment4 = getParentFragment();
                    if (parentFragment4 != null && (c91154Zq23 = C91155Zq3.LIZ.get(parentFragment4)) != null) {
                        c91154Zq23.LIZ = Boolean.TRUE;
                    }
                }
            }
        }
        C91369ZtV c91369ZtV = this.LJLLL;
        if (c91369ZtV == null) {
            return;
        }
        if (this.LJZ && !Dl() && getPlayerController().LJFF() && Al() && this.LJLZ && ((view = c91369ZtV.LIZLLL) == null || view.getVisibility() != 0)) {
            InterfaceC91296ZsK LIZ = getPlayerController().LIZ();
            if (LIZ != null) {
                str2 = LIZ.getId();
            } else {
                str2 = null;
            }
            Bundle arguments = getArguments();
            if (arguments != null) {
                str3 = arguments.getString("full_clip_id");
            } else {
                str3 = null;
            }
            if (!o.LJ(str2, str3)) {
                Fragment parentFragment5 = getParentFragment();
                if (parentFragment5 != null && (c91154Zq25 = C91155Zq3.LIZ.get(parentFragment5)) != null) {
                    bool2 = Boolean.valueOf(c91154Zq25.LIZIZ);
                }
                if (o.LJ(bool2, Boolean.TRUE)) {
                    return;
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("updateSwipeUpGuideVisibility first if in ready to show swipeUpGuideMusicDspDialog is ");
                LIZ2.append(this.LJLLLL);
                X1D.LIZIZ(LIZ2);
                InterfaceC91296ZsK LIZ3 = getPlayerController().LIZ();
                if (LIZ3 != null && (id2 = LIZ3.getId()) != null) {
                    str4 = id2;
                }
                this.LJLLLLLL = str4;
                C91407Zu7 c91407Zu72 = this.LJLLLL;
                if (c91407Zu72 == null) {
                    return;
                }
                C91215Zr1.LIZLLL(c91407Zu72);
                Fragment parentFragment6 = getParentFragment();
                if (parentFragment6 == null || (c91154Zq26 = C91155Zq3.LIZ.get(parentFragment6)) == null) {
                    return;
                }
                c91154Zq26.LIZIZ = true;
                return;
            }
        }
        View view2 = c91369ZtV.LIZLLL;
        if (view2 != null && view2.getVisibility() == 0) {
            String str6 = this.LJLLLLLL;
            InterfaceC91296ZsK LIZ4 = getPlayerController().LIZ();
            if (LIZ4 != null && (id = LIZ4.getId()) != null) {
                str4 = id;
            }
            if (!o.LJ(str6, str4) || !this.LJLZ) {
                C91407Zu7 c91407Zu73 = this.LJLLLL;
                if (c91407Zu73 != null) {
                    C91215Zr1.LIZIZ(c91407Zu73);
                }
                this.LJLLL = null;
                this.LJLLJ = true;
                Keva repo2 = Keva.getRepo("music_dsp_guide_repo");
                String com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId2 = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
                if (com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId2 != null && com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId2.length() != 0) {
                    str5 = com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId2;
                }
                String LLLZ2 = C16880lQ.LLLZ("swipe_up_guide_%s", Arrays.copyOf(new Object[]{str5}, 1));
                o.LJIIIIZZ(LLLZ2, "format(format, *args)");
                repo2.storeBoolean(LLLZ2, true);
                return;
            }
        }
        if ((Al() && !Dl() && getPlayerController().LJFF() && this.LJZ) || (c91407Zu7 = this.LJLLLL) == null) {
            return;
        }
        C91215Zr1.LIZIZ(c91407Zu7);
    }

    @Override // X.InterfaceC91281Zs5
    public final MutableLiveData<InterfaceC91296ZsK> Q() {
        BasePlayerViewModel xl = xl();
        if (xl != null) {
            return xl.LJLLJ;
        }
        return null;
    }

    public final int ZK() {
        if ((Gl(mo49getActivity()) && C61447O9r.LJIILJJIL == 0) || !Gl(mo49getActivity())) {
            return 0;
        }
        return LLFF;
    }

    @Override // X.InterfaceC91281Zs5
    public final String getEnterMethod() {
        String string;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("enter_method")) == null) {
            return "homepage_music_tab";
        }
        return string;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        InterfaceC91459Zux interfaceC91459Zux = getPlayerController().LJLILLLLZI.LJLJJI.LJLILLLLZI.get(C91498Zva.class);
        if (!(interfaceC91459Zux instanceof C91498Zva)) {
            interfaceC91459Zux = null;
        }
        C91498Zva c91498Zva = (C91498Zva) interfaceC91459Zux;
        if (c91498Zva != null) {
            c91498Zva.LJLIL.LIZ.remove(this);
        }
        C42625Go9.LIZJ(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.LLD = false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (C91249ZrZ.LIZIZ > 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("duration = ");
            LIZ.append(SystemClock.elapsedRealtime() - C91249ZrZ.LIZIZ);
            X1D.LIZIZ(LIZ);
        }
        this.LLD = true;
        Jl();
    }

    @Override // com.ss.android.ugc.aweme.dsp.common.arch.BaseMusicDspFragment
    public void wl() {
        MutableLiveData<InterfaceC91296ZsK> mutableLiveData;
        MutableLiveData<C76800UCe> mutableLiveData2;
        MutableLiveData<C76800UCe> mutableLiveData3;
        MutableLiveData<Boolean> mutableLiveData4;
        MutableLiveData<Boolean> mutableLiveData5;
        MutableLiveData<C76800UCe> mutableLiveData6;
        MutableLiveData<C91453Zur> mutableLiveData7;
        BasePlayerViewModel xl = xl();
        if (xl != null && (mutableLiveData7 = xl.LJLJJL) != null) {
            mutableLiveData7.observe(this, new IDObserverS226S0100000_29(this, 1));
        }
        BasePlayerViewModel xl2 = xl();
        if (xl2 != null && (mutableLiveData6 = xl2.LJLJJLL) != null) {
            mutableLiveData6.observe(this, new IDObserverS226S0100000_29(this, 2));
        }
        BasePlayerViewModel xl3 = xl();
        if (xl3 != null && (mutableLiveData5 = xl3.LJLJI) != null) {
            mutableLiveData5.observe(this, new IDObserverS226S0100000_29(this, 3));
        }
        BasePlayerViewModel xl4 = xl();
        if (xl4 != null && (mutableLiveData4 = xl4.LJLJJI) != null) {
            mutableLiveData4.observe(this, new IDObserverS226S0100000_29(this, 4));
        }
        BasePlayerViewModel xl5 = xl();
        if (xl5 != null && (mutableLiveData3 = xl5.LJLJL) != null) {
            mutableLiveData3.observe(this, new IDObserverS226S0100000_29(this, 5));
        }
        BasePlayerViewModel xl6 = xl();
        if (xl6 != null && (mutableLiveData2 = xl6.LJLJLJ) != null) {
            mutableLiveData2.observe(this, new IDObserverS226S0100000_29(this, 6));
        }
        BasePlayerViewModel xl7 = xl();
        if (xl7 != null && (mutableLiveData = xl7.LJLLJ) != null) {
            mutableLiveData.observe(this, new IDObserverS226S0100000_29(this, 7));
        }
        Hl();
    }

    @Override // X.InterfaceC91281Zs5
    public final int z9() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("isMainPage ");
        LIZ.append(Gl(mo49getActivity()));
        LIZ.append(", getDesiredBottomSpaceHeight ");
        LIZ.append(C61447O9r.LJIILJJIL);
        X1D.LIZIZ(LIZ);
        if (Gl(mo49getActivity()) && C61447O9r.LJIILJJIL == 0) {
            return LLFF;
        }
        return 0;
    }

    @Override // X.InterfaceC91281Zs5
    public final C91309ZsX bf() {
        return C91309ZsX.LIZJ;
    }

    @Override // X.InterfaceC91281Zs5
    public final C91473ZvB x5() {
        return this.LJLJI;
    }

    public BasePlayerFragment(String str) {
        C91210Zqw c91210Zqw;
        this.LJLJI = new C91473ZvB(str);
        if (this instanceof MainPlayerFragment) {
            c91210Zqw = new C91210Zqw(EnumC91322Zsk.RESSO_YDM);
        } else {
            c91210Zqw = new C91210Zqw(EnumC91322Zsk.RESSO_FAVORITES);
        }
        this.LJLJLJ = c91210Zqw;
        this.LJLLI = new Handler(C16880lQ.LLJJJJ());
        this.LJLLILLLL = "Daily Mix V2";
        Keva repo = Keva.getRepo("music_dsp_guide_repo");
        String com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
        String LLLZ = C16880lQ.LLLZ("swipe_up_guide_%s", Arrays.copyOf(new Object[]{(com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId == null || com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId.length() == 0) ? CardStruct.IStatusCode.DEFAULT : com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId}, 1));
        o.LJIIIIZZ(LLLZ, "format(format, *args)");
        this.LJLLJ = repo.getBoolean(LLLZ, false);
        this.LJLLLLLL = "";
        this.LJLZ = true;
        this.LJZ = true;
        this.LJZL = C221108m2.LIZIZ(new IDqS421S0100000_29(this, 14));
    }

    public final boolean Gl(ActivityC45651qj activityC45651qj) {
        return MainServiceImpl.createIMainServicebyMonsterPlugin(false).isMainPage(activityC45651qj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0161, code lost:
    
        if (Gl(mo49getActivity()) == false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Il(X.C91453Zur r9) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dsp.playpage.base.BasePlayerFragment.Il(X.Zur):void");
    }

    @Override // X.InterfaceC91281Zs5
    public final void h3(int i) {
        C73305Spp c73305Spp;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("hideStatusView flag is ");
        LIZ.append(i);
        X1D.LIZIZ(LIZ);
        if (i == 2) {
            C73305Spp c73305Spp2 = this.LJLL;
            if (c73305Spp2 == null) {
                return;
            }
            c73305Spp2.setVisibility(8);
            return;
        }
        this.LJLJJI.set(i);
        if (this.LJLJJI.cardinality() != 2 || (c73305Spp = this.LJLL) == null) {
            return;
        }
        c73305Spp.setVisibility(8);
    }

    @Override // com.ss.android.ugc.aweme.dsp.common.arch.BaseMusicDspFragment
    public final void initView(View view) {
        IXTabPanelAbility iXTabPanelAbility;
        View view2;
        int i;
        FrameLayout.LayoutParams layoutParams;
        C91362ZtO c91362ZtO;
        ViewGroup viewGroup;
        ViewStub viewStub;
        ViewGroup viewGroup2;
        Context context;
        LifecycleOwner LIZIZ;
        ViewGroup.LayoutParams layoutParams2;
        FrameLayout.LayoutParams layoutParams3;
        o.LJIIIZ(view, "view");
        C91362ZtO c91362ZtO2 = (C91362ZtO) view.findViewById(R.id.gsw);
        this.LJLJJL = c91362ZtO2;
        if (c91362ZtO2 != null) {
            this.LJLJLLL = new C91284Zs8(c91362ZtO2, new IDqS421S0100000_29(this, 79));
        }
        String type = this.LJLJI.LJLIL;
        C91362ZtO c91362ZtO3 = this.LJLJJL;
        o.LJIIIZ(type, "type");
        if (C91279Zs3.LIZ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("dsp_");
            LIZ.append(type);
            C40443Fu3.LIZ(X1D.LIZIZ(LIZ)).LIZLLL(c91362ZtO3);
        }
        C91506Zvi c91506Zvi = this.LJLJL;
        if (c91506Zvi != null) {
            C214368bA.LIZ().execute(new IDRunnableS32S0200000_29(c91506Zvi, this, 2));
        }
        C91362ZtO c91362ZtO4 = this.LJLJJL;
        View view3 = null;
        if (c91362ZtO4 != null) {
            C91071Zoh c91071Zoh = (C91071Zoh) view.findViewById(R.id.gsx);
            this.LJLJJLL = c91071Zoh;
            if (c91071Zoh != null) {
                layoutParams2 = c91071Zoh.getLayoutParams();
            } else {
                layoutParams2 = null;
            }
            if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams3 = (FrameLayout.LayoutParams) layoutParams2) != null) {
                layoutParams3.bottomMargin = ZK();
            }
            C61447O9r.LJIILLIIL.observe(this, new IDObserverS226S0100000_29(this, 24));
            C91071Zoh c91071Zoh2 = this.LJLJJLL;
            if (c91071Zoh2 != null) {
                c91071Zoh2.LJLJI = c91362ZtO4;
                c91071Zoh2.setLoadMoreListener(new C91451Zup(this));
            }
        }
        if (this.LJLL == null) {
            C73305Spp c73305Spp = (C73305Spp) view.findViewById(R.id.gsy);
            this.LJLL = c73305Spp;
            if (c73305Spp != null && !Gl(mo49getActivity())) {
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity != null) {
                    view2 = mo49getActivity.findViewById(R.id.df5);
                } else {
                    view2 = null;
                }
                int[] iArr = new int[2];
                if (view2 != null) {
                    view2.getLocationInWindow(iArr);
                }
                int i2 = iArr[1];
                if (i2 != 0) {
                    if (view2 != null) {
                        if (view2.getHeight() != 0) {
                            i = view2.getHeight();
                        }
                    } else {
                        i = 0;
                    }
                    int i3 = i + i2;
                    ViewGroup.LayoutParams layoutParams4 = c73305Spp.getLayoutParams();
                    if ((layoutParams4 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams4) != null) {
                        layoutParams.topMargin = i3;
                        layoutParams.gravity = 48;
                        c73305Spp.setLayoutParams(layoutParams);
                    }
                }
            }
            if (a7()) {
                C73305Spp c73305Spp2 = this.LJLL;
                if (c73305Spp2 != null) {
                    C73306Spq c73306Spq = new C73306Spq();
                    String string = view.getContext().getString(R.string.igz);
                    o.LJIIIIZZ(string, "view.context.getString(R…vorite_video_empty_title)");
                    c73306Spq.LJFF = string;
                    String string2 = view.getContext().getString(R.string.igy);
                    o.LJIIIIZZ(string2, "view.context.getString(R…avorite_video_empty_desc)");
                    c73306Spq.LJI = string2;
                    C2068389v c2068389v = new C2068389v();
                    c2068389v.LIZ = R.raw.icon_large_bookmark;
                    c2068389v.LJ = Integer.valueOf(R.attr.gp);
                    c73306Spq.LIZJ = 0;
                    c73306Spq.LIZIZ = c2068389v;
                    c73305Spp2.setStatus(c73306Spq);
                }
                C73305Spp c73305Spp3 = this.LJLL;
                if (c73305Spp3 != null) {
                    c73305Spp3.setVisibility(0);
                }
            }
            C73305Spp c73305Spp4 = this.LJLL;
            if (c73305Spp4 != null && (iXTabPanelAbility = (IXTabPanelAbility) this.LJZL.getValue()) != null) {
                C91200Zqm.LIZ(this, c73305Spp4, Float.valueOf(iXTabPanelAbility.F7()), new IDqS421S0100000_29(iXTabPanelAbility, 68));
            }
        }
        view.findViewById(R.id.gsv).getLayoutParams().height = ZK();
        if (Gl(mo49getActivity()) && (context = getContext()) != null && (LIZIZ = C57434MgQ.LIZIZ(context)) != null) {
            C61447O9r.LJIILLIIL.observe(LIZIZ, new C91452Zuq(view, this));
        }
        if (!YBK.LIZ().enableMusicDspOPT.getEnableShowSwipeUpGuide() || this.LJLLJ || (c91362ZtO = this.LJLJJL) == null) {
            return;
        }
        if (Gl(mo49getActivity())) {
            ActivityC45651qj mo49getActivity2 = mo49getActivity();
            if (mo49getActivity2 == null || (viewGroup = (ViewGroup) mo49getActivity2.findViewById(R.id.gci)) == null) {
                return;
            }
        } else {
            ActivityC45651qj mo49getActivity3 = mo49getActivity();
            if (mo49getActivity3 == null || (viewGroup2 = (ViewGroup) mo49getActivity3.findViewById(R.id.jb)) == null) {
                ActivityC45651qj mo49getActivity4 = mo49getActivity();
                if (mo49getActivity4 != null && (viewStub = (ViewStub) mo49getActivity4.findViewById(R.id.jc)) != null) {
                    view3 = viewStub.inflate();
                }
                if (!(view3 instanceof ViewGroup) || (viewGroup = (ViewGroup) view3) == null) {
                    return;
                }
            } else {
                viewGroup = viewGroup2;
            }
        }
        C91369ZtV c91369ZtV = new C91369ZtV(viewGroup, c91362ZtO);
        this.LJLLL = c91369ZtV;
        this.LJLLLL = new C91407Zu7(c91369ZtV, this);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        o.LJIIIZ(context, "context");
        super.onAttach(context);
        final C91250Zra c91250Zra = C91252Zrc.LIZ;
        C91252Zrc.LIZJ(new TBU(c91250Zra) { // from class: X.Zy4
            @Override // X.TBU, X.AbstractC74223TBb, X.InterfaceC74226TBe
            public final Object get() {
                return Long.valueOf(((C91250Zra) this.receiver).LJ);
            }

            @Override // X.TBU, X.AbstractC74223TBb, X.InterfaceC74227TBf
            public final void set(Object obj) {
                ((C91250Zra) this.receiver).LJ = ((Number) obj).longValue();
            }
        });
        InterfaceC91459Zux interfaceC91459Zux = getPlayerController().LJLILLLLZI.LJLJJI.LJLILLLLZI.get(C91498Zva.class);
        if (!(interfaceC91459Zux instanceof C91498Zva)) {
            interfaceC91459Zux = null;
        }
        C91498Zva c91498Zva = (C91498Zva) interfaceC91459Zux;
        if (c91498Zva != null) {
            c91498Zva.LJLIL.LIZ(this);
        }
        C42625Go9.LIZIZ(this);
        YXW.LIZ.getClass();
        if (YXW.LJII) {
            PreLoader.LIZIZ(this, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.common.arch.BaseMusicDspFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BasePlayerViewModel xl = xl();
        if (xl != null) {
            xl.LJLJLLL = getEnterMethod();
            xl.LJLLI = this;
            xl.gv0().LJLILLLLZI.LJLJI.LJLIL.LJII(xl);
            xl.gv0().Mu(xl);
            C42625Go9.LIZIZ(xl);
            xl.gv0().LJIIJ(EnumC91307ZsV.SEQUENCE);
        }
    }

    @QD3(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onMusicDspTabChangeEvent$music_dsp_release(C2JO event) {
        String str;
        o.LJIIIZ(event, "event");
        if (!o.LJ(event.LJLILLLLZI, C91220Zr6.LIZIZ(getEnterMethod()).LIZ)) {
            return;
        }
        String str2 = event.LJLIL;
        if (str2 == null) {
            str = "";
        } else {
            str = str2;
        }
        this.LJLLILLLL = str;
        if (o.LJ(str2, "LIBRARY V2") && this.LJZI) {
            Hl();
        }
    }

    @QD3
    public final void onUpsellRefreshEvent$music_dsp_release(C91450Zuo event) {
        o.LJIIIZ(event, "event");
        Il(new C91453Zur(false, null, 3));
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "8716203423049905161");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/dsp/playpage/base/BasePlayerFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/dsp/playpage/base/BasePlayerFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.setUserVisibleHint(z);
        toString();
        this.LL = z;
        Jl();
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/dsp/playpage/base/BasePlayerFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    @Override // X.InterfaceC91286ZsA
    public final void B8(C91299ZsN c91299ZsN, boolean z) {
        this.LJZ = z;
    }

    @Override // com.ss.android.ugc.aweme.dsp.common.arch.BaseMusicDspFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        C91200Zqm.LIZ.put(this, new C91199Zql());
        final C91250Zra c91250Zra = C91252Zrc.LIZ;
        C91252Zrc.LIZJ(new TBU(c91250Zra) { // from class: X.Zxq
            @Override // X.TBU, X.AbstractC74223TBb, X.InterfaceC74226TBe
            public final Object get() {
                return Long.valueOf(((C91250Zra) this.receiver).LJI);
            }

            @Override // X.TBU, X.AbstractC74223TBb, X.InterfaceC74227TBf
            public final void set(Object obj) {
                ((C91250Zra) this.receiver).LJI = ((Number) obj).longValue();
            }
        });
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        this.LJLJL = new C91506Zvi(requireContext);
        final C91250Zra c91250Zra2 = C91252Zrc.LIZ;
        C91252Zrc.LIZJ(new TBU(c91250Zra2) { // from class: X.Zxp
            @Override // X.TBU, X.AbstractC74223TBb, X.InterfaceC74226TBe
            public final Object get() {
                return Long.valueOf(((C91250Zra) this.receiver).LJII);
            }

            @Override // X.TBU, X.AbstractC74223TBb, X.InterfaceC74227TBf
            public final void set(Object obj) {
                ((C91250Zra) this.receiver).LJII = ((Number) obj).longValue();
            }
        });
        super.onViewCreated(view, bundle);
        L41.LIZ.getClass();
        if (!L41.LIZ()) {
            view.setKeepScreenOn(true);
        }
        final C91250Zra c91250Zra3 = C91252Zrc.LIZ;
        C91252Zrc.LIZJ(new TBU(c91250Zra3) { // from class: X.Zy5
            @Override // X.TBU, X.AbstractC74223TBb, X.InterfaceC74226TBe
            public final Object get() {
                return Long.valueOf(((C91250Zra) this.receiver).LJFF);
            }

            @Override // X.TBU, X.AbstractC74223TBb, X.InterfaceC74227TBf
            public final void set(Object obj) {
                ((C91250Zra) this.receiver).LJFF = ((Number) obj).longValue();
            }
        });
        C91219Zr5.LIZ = new IDqS421S0100000_29(this, 13);
    }
}

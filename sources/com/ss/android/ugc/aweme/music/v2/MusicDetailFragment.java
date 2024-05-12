package com.ss.android.ugc.aweme.music.v2;

import X.ActivityC45651qj;
import X.C00F;
import X.C10A;
import X.C141335gf;
import X.C184077Kh;
import X.C187387Xa;
import X.C188727au;
import X.C214298b3;
import X.C214528bQ;
import X.C26045AKb;
import X.C29S;
import X.C2K0;
import X.C3C5;
import X.C52828KoK;
import X.C55096Ljo;
import X.C55230Lly;
import X.C56642Ke;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78926UyI;
import X.C78939UyV;
import X.C7SW;
import X.C7XT;
import X.C7XV;
import X.C7XW;
import X.C7XY;
import X.C7XZ;
import X.C8VV;
import X.C90903hW;
import X.C9BD;
import X.C9BE;
import X.EV9;
import X.FFL;
import X.FMX;
import X.GGW;
import X.IWF;
import X.InterfaceC55235Lm3;
import X.InterfaceC56521MGf;
import X.QD3;
import X.QX2;
import X.SWI;
import X.TBT;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.detail.base.DetailBaseFragment;
import com.ss.android.ugc.aweme.detail.prefab.ability.DetailPageNameAbility;
import com.ss.android.ugc.aweme.music.ab.MusicDetailRedesignV2Experiment;
import com.ss.android.ugc.aweme.music.model.MatchedPGCSoundInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import com.ss.android.ugc.aweme.music.model.ReuseMusicStruct;
import com.ss.android.ugc.aweme.music.v2.assem.MusicPgcMetaInfoAssem;
import com.ss.android.ugc.aweme.music.v2.assem.MusicPgcMetaInfoWithArtistAssem;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicCollectViewModel;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicPlayViewModel;
import com.ss.android.ugc.aweme.music.v2.viewmodel.SharedMusicDetailViewModel;
import com.ss.android.ugc.aweme.prefab.ability.FavoriteAbility;
import com.ss.android.ugc.aweme.prefab.ability.RefreshAbility;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes4.dex */
public final class MusicDetailFragment extends DetailBaseFragment implements RefreshAbility, InterfaceC56521MGf {
    public static final /* synthetic */ int LJLJLLL = 0;
    public final C214298b3 LJLILLLLZI;
    public final C214298b3 LJLJI;
    public final C214298b3 LJLJJI;
    public final C214298b3 LJLJJL;
    public boolean LJLJJLL;
    public long LJLJL;
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();

    @Override // X.InterfaceC56521MGf
    public final void LJ() {
    }

    @Override // com.ss.android.ugc.aweme.detail.base.DetailBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLJ).clear();
    }

    @Override // com.ss.android.ugc.aweme.detail.base.DetailBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLJ;
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

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.DetailPageNameAbility
    public final String lr() {
        return "single_song";
    }

    @Override // com.ss.android.ugc.aweme.detail.base.DetailBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public MusicDetailFragment() {
        C214298b3 c214298b3;
        C214298b3 c214298b32;
        C214298b3 c214298b33;
        C214298b3 c214298b34;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(MusicDetailViewModel.class);
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(LIZ, 537);
        C7XV c7xv = C7XV.INSTANCE;
        C9BD c9bd = C9BD.LIZ;
        if (o.LJ(c9be, c9bd)) {
            c214298b3 = new C214298b3(aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c7xv, LIZ);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c7xv, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLILLLLZI = c214298b3;
        C65776Prg LIZ2 = C65352Pkq.LIZ(MusicCollectViewModel.class);
        AqS153S0100000_3 aqS153S0100000_32 = new AqS153S0100000_3(LIZ2, 538);
        C7XY c7xy = C7XY.INSTANCE;
        if (o.LJ(c9be, c9bd)) {
            c214298b32 = new C214298b3(aqS153S0100000_32, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c7xy, LIZ2);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b32 = new C214298b3(aqS153S0100000_32, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c7xy, LIZ2);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLJI = c214298b32;
        C65776Prg LIZ3 = C65352Pkq.LIZ(MusicPlayViewModel.class);
        AqS153S0100000_3 aqS153S0100000_33 = new AqS153S0100000_3(LIZ3, 539);
        C7XZ c7xz = C7XZ.INSTANCE;
        if (o.LJ(c9be, c9bd)) {
            c214298b33 = new C214298b3(aqS153S0100000_33, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c7xz, LIZ3);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b33 = new C214298b3(aqS153S0100000_33, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c7xz, LIZ3);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLJJI = c214298b33;
        C65776Prg LIZ4 = C65352Pkq.LIZ(SharedMusicDetailViewModel.class);
        AqS153S0100000_3 aqS153S0100000_34 = new AqS153S0100000_3(LIZ4, 540);
        C7XW c7xw = C7XW.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b34 = new C214298b3(aqS153S0100000_34, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c7xw, LIZ4);
        } else if (c9bd == null || o.LJ(c9bd, c9be)) {
            c214298b34 = new C214298b3(aqS153S0100000_34, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c7xw, LIZ4);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLJJL = c214298b34;
    }

    @Override // X.InterfaceC56521MGf
    public final void I8() {
        String str;
        String str2;
        if (!this.LJLJJLL) {
            this.LJLJJLL = true;
            Bundle arguments = getArguments();
            String str3 = null;
            if (arguments != null) {
                str = arguments.getString("id");
            } else {
                str = null;
            }
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                str2 = arguments2.getString("process_id");
            } else {
                str2 = null;
            }
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                str3 = arguments3.getString("aweme_id");
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.LJLJL;
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "single_song");
            c188727au.LJIIIZ("music_id", str);
            c188727au.LJIIIZ("process_id", str2);
            c188727au.LJIIIZ("group_id", str3);
            c188727au.LJ(elapsedRealtime, "ttl_duration");
            c188727au.LJ(0L, "more_sounds_duration");
            FMX.LJIIL("music_detail_load_time", c188727au.LIZ);
        }
        C7SW.LIZ("detail_content_visible", "single_song");
        C7SW.LIZ("detail_content_render", "single_song");
    }

    @Override // com.ss.android.ugc.aweme.prefab.ability.RefreshAbility
    public final void refresh() {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "single_song");
        FMX.LJIIL("refresh_page", c188727au.LIZ);
        xl().gv0(true);
    }

    public final MusicDetailViewModel xl() {
        return (MusicDetailViewModel) this.LJLILLLLZI.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
    }

    public static C65776Prg Al(MusicDetail musicDetail) {
        List list;
        Class cls;
        MatchedPGCSoundInfo matchedPGCSoundInfo;
        List<MusicOwnerInfo> musicOwnerInfos;
        Music music = musicDetail.music;
        if (music != null && (matchedPGCSoundInfo = music.getMatchedPGCSoundInfo()) != null && (musicOwnerInfos = matchedPGCSoundInfo.getMusicOwnerInfos()) != null) {
            list = C78939UyV.LJIIIZ(musicOwnerInfos);
        } else {
            list = null;
        }
        if ((C00F.LIZ(31744, 0, "show_pgc_artist_info", true) != 1 && C00F.LIZ(31744, 0, "show_pgc_artist_info", true) != 2) || list == null || list.isEmpty()) {
            cls = MusicPgcMetaInfoAssem.class;
        } else {
            cls = MusicPgcMetaInfoWithArtistAssem.class;
        }
        return C65352Pkq.LIZ(cls);
    }

    @QD3
    public final void onAntiCrawlerEvent(QX2 event) {
        o.LJIIIZ(event, "event");
        String str = event.LJLIL;
        if (str != null && s.LJJJLZIJ(str, "/aweme/v1/music/detail/?", false)) {
            EventBus.LIZJ().LIZIZ(event);
            refresh();
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.base.DetailBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        this.LJLJL = SystemClock.elapsedRealtime();
        C7SW.LIZIZ("single_song");
        super.onCreate(bundle);
        EventBus.LIZJ().LJIILJJIL(this);
        MusicDetailRedesignV2Experiment.LIZ.getClass();
        FFL LJIIIZ = FFL.LJIIIZ();
        MusicDetailRedesignV2Experiment.RedesignFeature redesignFeature = MusicDetailRedesignV2Experiment.LIZIZ;
        LJIIIZ.getClass();
        MusicDetailRedesignV2Experiment.RedesignFeature redesignFeature2 = (MusicDetailRedesignV2Experiment.RedesignFeature) FFL.LJIJ(true, "music_detail_redesign_v2", 31744, MusicDetailRedesignV2Experiment.RedesignFeature.class, redesignFeature);
        if (redesignFeature2 != null && redesignFeature2.gradientColorsBackground) {
            fragmentConfiguration(GGW.LJLIL);
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(C56642Ke jsBroadCastEvent) {
        ActivityC45651qj mo49getActivity;
        o.LJIIIZ(jsBroadCastEvent, "jsBroadCastEvent");
        JSONObject jSONObject = jsBroadCastEvent.LJLIL;
        if (jSONObject != null && o.LJ("remove_original_sound_success", jSONObject.optString("eventName")) && mo49getActivity() != null && (mo49getActivity = mo49getActivity()) != null) {
            mo49getActivity.finish();
        }
    }

    @QD3
    public final void onMusicFeedBackEvent(C187387Xa c187387Xa) {
        C26045AKb c26045AKb = new C26045AKb(this);
        c26045AKb.LJIIIIZZ(R.string.rgg);
        c26045AKb.LJIIJ();
    }

    @QD3
    public final void onThirdMusicEvent(C7XT event) {
        o.LJIIIZ(event, "event");
        if (event.LJLIL == 1) {
            ((MusicPlayViewModel) this.LJLJJI.getValue()).LLLLLL();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        Serializable serializable;
        String str;
        Integer num;
        String str2;
        String str3;
        Serializable serializable2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ReuseMusicStruct reuseMusicStruct = null;
        InterfaceC55235Lm3 LIZJ = C55230Lly.LIZJ(this, null);
        MusicCollectViewModel musicCollectViewModel = (MusicCollectViewModel) this.LJLJI.getValue();
        C2K0 LIZ = C55096Ljo.LIZ(LIZJ, FavoriteAbility.class, null);
        if (LIZ == null) {
            C55096Ljo.LJIIJJI(LIZJ, musicCollectViewModel, FavoriteAbility.class, null);
        } else {
            try {
                InvocationHandler invocationHandler = Proxy.getInvocationHandler(LIZ);
                if (invocationHandler instanceof EV9) {
                    ((EV9) invocationHandler).LIZ.add(musicCollectViewModel);
                } else {
                    throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                }
            } catch (IllegalArgumentException unused) {
                EV9 ev9 = new EV9();
                ev9.LIZ.add(musicCollectViewModel);
                ev9.LIZ.add(LIZ);
                Object newProxyInstance = Proxy.newProxyInstance(FavoriteAbility.class.getClassLoader(), new Class[]{FavoriteAbility.class}, ev9);
                if (newProxyInstance != null) {
                    C55096Ljo.LJIIJJI(LIZJ, (C2K0) newProxyInstance, FavoriteAbility.class, null);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.prefab.ability.FavoriteAbility");
                }
            }
        }
        InterfaceC55235Lm3 LIZJ2 = C55230Lly.LIZJ(this, null);
        C2K0 LIZ2 = C55096Ljo.LIZ(LIZJ2, DetailPageNameAbility.class, null);
        if (LIZ2 == null) {
            C55096Ljo.LJIIJJI(LIZJ2, this, DetailPageNameAbility.class, null);
        } else {
            try {
                InvocationHandler invocationHandler2 = Proxy.getInvocationHandler(LIZ2);
                if (invocationHandler2 instanceof EV9) {
                    ((EV9) invocationHandler2).LIZ.add(this);
                } else {
                    throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                }
            } catch (IllegalArgumentException unused2) {
                EV9 ev92 = new EV9();
                ev92.LIZ.add(this);
                ev92.LIZ.add(LIZ2);
                Object newProxyInstance2 = Proxy.newProxyInstance(DetailPageNameAbility.class.getClassLoader(), new Class[]{DetailPageNameAbility.class}, ev92);
                if (newProxyInstance2 != null) {
                    C55096Ljo.LJIIJJI(LIZJ2, (C2K0) newProxyInstance2, DetailPageNameAbility.class, null);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.detail.prefab.ability.DetailPageNameAbility");
                }
            }
        }
        InterfaceC55235Lm3 LIZJ3 = C55230Lly.LIZJ(this, null);
        C2K0 LIZ3 = C55096Ljo.LIZ(LIZJ3, RefreshAbility.class, null);
        if (LIZ3 == null) {
            C55096Ljo.LJIIJJI(LIZJ3, this, RefreshAbility.class, null);
        } else {
            try {
                InvocationHandler invocationHandler3 = Proxy.getInvocationHandler(LIZ3);
                if (invocationHandler3 instanceof EV9) {
                    ((EV9) invocationHandler3).LIZ.add(this);
                } else {
                    throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                }
            } catch (IllegalArgumentException unused3) {
                EV9 ev93 = new EV9();
                ev93.LIZ.add(this);
                ev93.LIZ.add(LIZ3);
                Object newProxyInstance3 = Proxy.newProxyInstance(RefreshAbility.class.getClassLoader(), new Class[]{RefreshAbility.class}, ev93);
                if (newProxyInstance3 != null) {
                    C55096Ljo.LJIIJJI(LIZJ3, (C2K0) newProxyInstance3, RefreshAbility.class, null);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.prefab.ability.RefreshAbility");
                }
            }
        }
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("id")) == null) {
            return;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            serializable = arguments2.getSerializable("enter_music_from_pre_page");
        } else {
            serializable = null;
        }
        xl().LJLILLLLZI = string;
        xl().LJLJLJ = this.LJLJL;
        xl().LJLIL = (Music) serializable;
        MusicDetailViewModel xl = xl();
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            str = arguments3.getString("aweme_id");
        } else {
            str = null;
        }
        xl.LJLJI = str;
        MusicDetailViewModel xl2 = xl();
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            num = Integer.valueOf(arguments4.getInt("extra_enter_from", 0));
        } else {
            num = null;
        }
        xl2.LJLJJLL = num;
        MusicDetailViewModel xl3 = xl();
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            str2 = arguments5.getString("from_group_id");
        } else {
            str2 = null;
        }
        xl3.LJLJJI = str2;
        MusicDetailViewModel xl4 = xl();
        Bundle arguments6 = getArguments();
        if (arguments6 != null) {
            str3 = arguments6.getString("video_id");
        } else {
            str3 = null;
        }
        xl4.LJLJJL = str3;
        MusicDetailViewModel xl5 = xl();
        Bundle arguments7 = getArguments();
        if (arguments7 != null) {
            serializable2 = arguments7.getSerializable("reuse_sound_from");
        } else {
            serializable2 = null;
        }
        if (serializable2 instanceof ReuseMusicStruct) {
            reuseMusicStruct = (ReuseMusicStruct) serializable2;
        }
        xl5.LJLJL = reuseMusicStruct;
        ((MusicCollectViewModel) this.LJLJI.getValue()).LJLIL = string;
        ((MusicPlayViewModel) this.LJLJJI.getValue()).LJLILLLLZI = mo49getActivity();
        ((MusicPlayViewModel) this.LJLJJI.getValue()).LJLIL = getArguments();
        if (xl().LJLIL == null || !e1.LIZ(31744, "creative_tools_music_detail_header_start", true, false)) {
            C8VV.LIZ(this, false, new AqS169S0100000_3(this, 881));
        }
        AssemViewModel.asyncSubscribe$default(xl(), new TBT() { // from class: X.7To
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C187447Xg) obj).LJLIL;
            }
        }, null, new AqS169S0100000_3(this, 271), new AqS153S0100000_3(this, 536), new AqS169S0100000_3(this, 272), 2, null);
        xl().gv0(false);
        SharedMusicDetailViewModel sharedMusicDetailViewModel = (SharedMusicDetailViewModel) this.LJLJJL.getValue();
        MusicDetailViewModel musicDetailViewModel = xl();
        o.LJIIIZ(musicDetailViewModel, "musicDetailViewModel");
        AssemViewModel.asyncSubscribe$default(musicDetailViewModel, new TBT() { // from class: X.7XX
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C187447Xg) obj).LJLIL;
            }
        }, null, null, null, new AqS169S0100000_3(sharedMusicDetailViewModel, 923), 14, null);
        if (!((Boolean) C52828KoK.LIZ.getValue()).booleanValue()) {
            return;
        }
        IWF.LJJLIIIIJ().release();
    }

    @Override // com.ss.android.ugc.aweme.detail.base.DetailBaseFragment, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        switch (i) {
            case 3456:
                SWI.LIZIZ.LJ(3456, i2, intent, mo49getActivity(), this, null);
                return;
            case 3457:
                SWI.LIZIZ.LJIIIIZZ(intent, mo49getActivity(), this, null);
                return;
            case 3458:
                SWI.LIZIZ.LJIILLIIL(i2, intent, mo49getActivity(), this, null);
                return;
            default:
                super.onActivityResult(i, i2, intent);
                return;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        FrameLayout frameLayout = new FrameLayout(requireContext());
        frameLayout.setFitsSystemWindows(false);
        FrameLayout frameLayout2 = new FrameLayout(requireContext());
        frameLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        frameLayout2.setId(R.id.btt);
        frameLayout.addView(frameLayout2);
        LinearLayout linearLayout = new LinearLayout(requireContext());
        linearLayout.setOrientation(1);
        Space space = new Space(requireContext());
        space.setId(R.id.kej);
        linearLayout.addView(space);
        FrameLayout frameLayout3 = new FrameLayout(requireContext());
        frameLayout3.setFitsSystemWindows(true);
        frameLayout3.setId(R.id.bul);
        linearLayout.addView(frameLayout3);
        frameLayout.addView(linearLayout);
        try {
            ViewTreeLifecycleOwner.set(frameLayout, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(frameLayout, this);
            C10A.LIZIZ(frameLayout, this);
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
        return frameLayout;
    }
}

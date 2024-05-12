package com.ss.android.ugc.aweme.favorites.business.music;

import X.ActivityC45651qj;
import X.AnonymousClass629;
import X.C03880Dg;
import X.C186627Uc;
import X.C188727au;
import X.C213358Yx;
import X.C47261Igj;
import X.C4LE;
import X.C61878OQg;
import X.C65300Pk0;
import X.C72197SVd;
import X.C8Z6;
import X.C8Z9;
import X.C8ZK;
import X.FMX;
import X.FRW;
import X.HT5;
import X.InterfaceC57784Mm4;
import X.InterfaceC60761Nsz;
import X.OGG;
import X.QD3;
import X.QX2;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.XUC;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.compliance.privacy.impl.PrivacyServiceImpl;
import com.ss.android.ugc.aweme.favorites.business.powerviewpager.MusicCollectionFragmentData;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IDLCallbackS0S0300000_7;
import com.ss.android.ugc.aweme.services.IDLCallbackS1S0300000_10;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordPresetResource;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import ujb.s;

/* loaded from: classes11.dex */
public final class MusicCollectionFragment extends AmeBaseFragment implements XUC, C8Z9, OGG, C8ZK {
    public MusicDownloadPlayHelper LJLIL;
    public MusicModel LJLILLLLZI;
    public long LJLJI;
    public boolean LJLJJI;
    public String LJLJJL;
    public boolean LJLJJLL;
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLJL;
    public View LJLJLJ;
    public boolean LJLJLLL;

    @Override // X.XUC
    public final /* synthetic */ void LJJJJIZL(MusicModel musicModel, Exception exc) {
    }

    @Override // X.XUC
    public final /* synthetic */ void LLIZLLLIL() {
    }

    @Override // X.XUC
    public final /* synthetic */ void LLLL(MusicModel musicModel, long j) {
    }

    @Override // X.C8ZK
    public final void Od() {
        setUserVisibleHint(false);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.LJLJLJ = null;
        this.LJLJLLL = false;
        super.onDestroyView();
        vl();
        MusicDownloadPlayHelper musicDownloadPlayHelper = this.LJLIL;
        if (musicDownloadPlayHelper != null) {
            musicDownloadPlayHelper.onDestroy();
        } else {
            o.LJIJI("musicDownloadPlayHelper");
            throw null;
        }
    }

    public MusicCollectionFragment() {
        new LinkedHashMap();
        this.LJLJJI = true;
        this.LJLJJLL = true;
    }

    @Override // X.OGG
    public final View LJIJJ() {
        View view = this.LJLJLJ;
        if (view != null && this.LJLJLLL) {
            return view;
        }
        RecyclerView LIZ = C8Z6.LIZ(this.LJLJL);
        if (LIZ != null) {
            this.LJLJLJ = LIZ;
            this.LJLJLLL = true;
            return LIZ;
        }
        ScrollView scrollView = new ScrollView(getContext());
        this.LJLJLJ = scrollView;
        return scrollView;
    }

    @Override // X.C8Z9
    public final void LJJIJL() {
        InterfaceC60761Nsz kitView;
        if (this.LJLJJI) {
            FRW.LIZLLL("discovery_favorite_sounds_lynx_first_list_screen");
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null) {
                kitView.LJIIJ("onTabSelected", C61878OQg.INSTANCE);
            }
        }
    }

    public final void vl() {
        InterfaceC60761Nsz kitView;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null) {
            kitView.LJIIJ("onPageJumped", C61878OQg.INSTANCE);
        }
    }

    @Override // X.XUC
    public final boolean LJJIIZI() {
        return isViewValid();
    }

    @Override // X.XUC
    public final Activity LJJIZ() {
        return mo49getActivity();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        vl();
    }

    @Override // X.XUC
    public final MusicModel LIZLLL() {
        return this.LJLILLLLZI;
    }

    @Override // X.XUC
    public final void T3(MusicModel musicModel) {
        String str;
        o.LJIIIZ(musicModel, "musicModel");
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null || mo49getActivity.isFinishing()) {
            return;
        }
        String LIZ = AnonymousClass629.LIZ("randomUUID().toString()");
        RecordConfig.Builder builder = new RecordConfig.Builder();
        builder.creationId(LIZ);
        builder.shootWay("collection_music");
        builder.recordPresetResource(new RecordPresetResource(null, null, musicModel.getMusicId(), musicModel));
        AVExternalServiceImpl.LIZ().asyncService("MusicCollect", new IDLCallbackS1S0300000_10(mo49getActivity, builder.build(), musicModel, 0));
        vl();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("creation_id", LIZ);
        if (this.LJLJJLL) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("content_source", "shoot");
        c188727au.LJIIIZ("shoot_way", "collection_music");
        c188727au.LJIIIZ("music_id", musicModel.getMusicId());
        FMX.LJIIL("shoot", c188727au.LIZ);
    }

    @QD3
    public final void onAntiCrawlerEvent(QX2 event) {
        InterfaceC60761Nsz kitView;
        o.LJIIIZ(event, "event");
        String str = event.LJLIL;
        if (str != null && s.LJJJLZIJ(str, "/aweme/v1/user/music/collect/?", false)) {
            EventBus.LIZJ().LIZIZ(event);
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null) {
                kitView.LJIIJ("onMusicCollectEvent", C61878OQg.INSTANCE);
            }
        }
    }

    @QD3(threadMode = ThreadMode.BACKGROUND)
    public final void onCollectMusicEvent(C213358Yx event) {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        InterfaceC60761Nsz kitView;
        InterfaceC60761Nsz kitView2;
        o.LJIIIZ(event, "event");
        if (!isViewValid() || !this.LJLJJLL) {
            return;
        }
        int i = event.LJLILLLLZI;
        if (i == 0) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = this.LJLJL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 == null || (kitView2 = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2.getKitView()) == null) {
                return;
            }
            kitView2.LJIIJ("onMusicCollectEvent", C47261Igj.LJJIJIIJI(0, event.LJLIL));
            return;
        }
        if (i != 1 || (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJL) == null || (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) == null) {
            return;
        }
        kitView.LJIIJ("onMusicCollectEvent", C47261Igj.LJJIJIIJI(1, event.LJLIL));
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        MusicCollectionFragmentData musicCollectionFragmentData;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (musicCollectionFragmentData = (MusicCollectionFragmentData) arguments.getParcelable("power_viewpager_default_key")) != null) {
            this.LJLJJI = musicCollectionFragmentData.lazyLoad;
        }
    }

    @QD3
    public final void onMusicCollectEvent(C72197SVd event) {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        InterfaceC60761Nsz kitView;
        InterfaceC60761Nsz kitView2;
        o.LJIIIZ(event, "event");
        if (!isViewValid() || !this.LJLJJLL) {
            return;
        }
        Music music = event.LJLILLLLZI.getMusic();
        if (music.getCollectStatus() == 0) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = this.LJLJL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 == null || (kitView2 = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2.getKitView()) == null) {
                return;
            }
            kitView2.LJIIJ("onMusicCollectEvent", C47261Igj.LJJIJIIJI(0, music.getMid()));
            return;
        }
        if (music.getCollectStatus() != 1 || (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJL) == null || (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) == null) {
            return;
        }
        kitView.LJIIJ("onMusicCollectEvent", C47261Igj.LJJIJIIJI(1, music.getMid()));
    }

    @Override // X.C8ZK
    public final void onPageSelected(int i) {
        LJJIJL();
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "5629128203165540441");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/favorites/business/music/MusicCollectionFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/favorites/business/music/MusicCollectionFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.setUserVisibleHint(z);
        if (!z && !isDetached() && isViewValid()) {
            vl();
        }
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/favorites/business/music/MusicCollectionFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        Integer M;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (this.LJLJJLL && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJL) != null) {
            C4LE c4le = new C4LE();
            Lifecycle lifecycle = getLifecycle();
            o.LJIIIIZZ(lifecycle, "this.lifecycle");
            c4le.LIZ = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
            EventBus.LIZJ().LJIILJJIL(c4le);
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.favorites.business.music.MusicCollectionPublicBanner$startUp$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                    o.LJIIIZ(source, "source");
                    o.LJIIIZ(event, "event");
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        EventBus.LIZJ().LJIJ(this);
                    }
                }
            });
            PrivacyUserSettingsV2 privacyUserSettings = PrivacyServiceImpl.LJIIIIZZ().getPrivacyUserSettings();
            if (privacyUserSettings == null || (M = privacyUserSettings.M("favorite_music")) == null || M.intValue() != 1) {
                c4le.LIZIZ();
            } else {
                c4le.LIZ();
            }
        }
    }

    @Override // X.XUC
    public final void LJJII(MusicModel musicModel, String musicPath, String musicOrigin) {
        String str;
        o.LJIIIZ(musicPath, "musicPath");
        o.LJIIIZ(musicModel, "musicModel");
        o.LJIIIZ(musicOrigin, "musicOrigin");
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null || mo49getActivity.isFinishing()) {
            return;
        }
        String LIZ = AnonymousClass629.LIZ("randomUUID().toString()");
        RecordConfig.Builder builder = new RecordConfig.Builder();
        builder.creationId(LIZ);
        builder.shootWay("collection_music");
        builder.musicPath(musicPath);
        builder.musicOrigin(musicOrigin);
        AVExternalServiceImpl.LIZ().asyncService("MusicCollect", new IDLCallbackS0S0300000_7(mo49getActivity, builder.build(), musicModel, 11));
        vl();
        HT5.LIZ = true;
        HT5.LIZJ(true);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("creation_id", LIZ);
        if (this.LJLJJLL) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("content_source", "shoot");
        c188727au.LJIIIZ("shoot_way", "collection_music");
        c188727au.LJIIIZ("music_id", musicModel.getMusicId());
        c188727au.LIZLLL(HT5.LIZ(), "favorite_scene");
        FMX.LJIIL("shoot", c188727au.LIZ);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(35:1|(1:3)(1:70)|4|(4:6|(1:8)(1:68)|9|(27:11|12|(1:67)(1:16)|17|(1:19)|20|(1:66)(1:24)|(1:26)|27|(1:65)(1:31)|(1:64)(1:35)|(1:37)|38|(1:40)(1:63)|41|(1:43)|44|(1:46)|47|(1:62)|(1:50)|51|52|53|(1:55)|56|57))|69|12|(1:14)|67|17|(0)|20|(1:22)|66|(0)|27|(1:29)|65|(1:33)|64|(0)|38|(0)(0)|41|(0)|44|(0)|47|(0)|(0)|51|52|53|(0)|56|57) */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x017c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x017d, code lost:
    
        X.C3C5.m7constructorimpl(X.C141335gf.LIZ(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0170 A[Catch: all -> 0x017c, TryCatch #0 {all -> 0x017c, blocks: (B:53:0x015b, B:55:0x0170, B:56:0x0173), top: B:52:0x015b }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0142  */
    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r8, android.view.ViewGroup r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.favorites.business.music.MusicCollectionFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // X.C8ZK
    public final void u7(InterfaceC57784Mm4 interfaceC57784Mm4, Lifecycle.State state, List<? extends Object> list) {
        C186627Uc.LIZ(interfaceC57784Mm4, state, list);
    }
}

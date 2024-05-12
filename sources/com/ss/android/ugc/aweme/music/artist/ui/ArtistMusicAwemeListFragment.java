package com.ss.android.ugc.aweme.music.artist.ui;

import X.ActivityC45651qj;
import X.AnonymousClass629;
import X.C03880Dg;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C188727au;
import X.C1DD;
import X.C243169gW;
import X.C243179gX;
import X.C243189gY;
import X.C245319jz;
import X.C252669vq;
import X.C29S;
import X.C3C5;
import X.C42408Gke;
import X.C48203Ivv;
import X.C5S1;
import X.C65300Pk0;
import X.C76800UCe;
import X.C78450Uqc;
import X.C78451Uqd;
import X.C78939UyV;
import X.C8VV;
import X.C90903hW;
import X.C9BK;
import X.DialogC25756A8y;
import X.EF7;
import X.FMX;
import X.HG3;
import X.InterfaceC198557ql;
import X.InterfaceC61213O0r;
import X.InterfaceC65895Ptb;
import X.RBX;
import X.X1D;
import Y.ACListenerS24S0100000_4;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.service.IMusicDetailService;
import com.ss.android.ugc.aweme.music.service.MusicDetailService;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes5.dex */
public final class ArtistMusicAwemeListFragment extends BaseFragment implements C9BK {
    public static final C243179gX LJLJLLL = new Object() { // from class: X.9gX
    };
    public Music LJLIL;
    public boolean LJLJJL;
    public DialogC25756A8y LJLJL;
    public Map<Integer, View> LJLJLJ = new LinkedHashMap();
    public String LJLILLLLZI = "";
    public String LJLJI = "";
    public String LJLJJI = "";
    public String LJLJJLL = "single_song";

    private final int Dl() {
        return R.layout.buo;
    }

    public static void wl(DialogC25756A8y dialogC25756A8y) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/tux/status/loading/TuxLoadingDialogHUD", "show", dialogC25756A8y, new Object[0], "void", new C65300Pk0(false, "()V", "-7482270112066501317")).LIZ) {
            return;
        }
        dialogC25756A8y.show();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public void _$_clearFindViewByIdCache() {
        this.LJLJLJ.clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLJLJ;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return xl(this, layoutInflater, viewGroup, bundle);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.C9BK, X.C8VB, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    private final void Gl() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        DialogC25756A8y dialogC25756A8y = new DialogC25756A8y(context);
        dialogC25756A8y.LIZIZ(R.string.hvo);
        dialogC25756A8y.LIZ(false);
        dialogC25756A8y.hide();
        this.LJLJL = dialogC25756A8y;
        dialogC25756A8y.hide();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.9gY] */
    @Override // X.C8VB
    /* renamed from: Al, reason: merged with bridge method [inline-methods] */
    public C243189gY defaultObservableData() {
        return new InterfaceC198557ql() { // from class: X.9gY
        };
    }

    @Override // X.C9BK
    public void Gi() {
        DialogC25756A8y dialogC25756A8y = this.LJLJL;
        if (dialogC25756A8y != null) {
            dialogC25756A8y.hide();
        }
    }

    @Override // X.C9BK
    public void LJJI() {
        DialogC25756A8y dialogC25756A8y = this.LJLJL;
        if (dialogC25756A8y != null) {
            wl(dialogC25756A8y);
        }
    }

    @Override // X.C9BK
    public void P8() {
        MusicModel convertToMusicModel;
        if (this.LJLJJL) {
            Music music = this.LJLIL;
            if (music != null && music.getMusicStatus() == 0) {
                String offlineDesc = music.getOfflineDesc();
                o.LJIIIIZZ(offlineDesc, "curMusic.offlineDesc");
                if (TextUtils.isEmpty(offlineDesc)) {
                    offlineDesc = C1DD.LIZLLL(R.string.iia, "AppContextManager.getApp…string.music_issue_toast)");
                }
                C5S1 c5s1 = new C5S1(EF7.LIZIZ());
                c5s1.LIZLLL(offlineDesc);
                c5s1.LJ();
                return;
            }
            Music music2 = this.LJLIL;
            if (music2 == null || (convertToMusicModel = music2.convertToMusicModel()) == null) {
                return;
            }
            String LIZ = AnonymousClass629.LIZ("randomUUID().toString()");
            if (!MusicService.LJJLIIIJJI().LJJIL(convertToMusicModel, ActivityStack.getTopActivity(), true)) {
                return;
            }
            Context LIZIZ = EF7.LIZIZ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("aweme://music/detail/");
            LIZ2.append(convertToMusicModel.getMusicId());
            SmartRoute buildRoute = SmartRouter.buildRoute(LIZIZ, X1D.LIZIZ(LIZ2));
            buildRoute.withParam("process_id", LIZ);
            buildRoute.withParam("save_featured_video_success", true);
            buildRoute.open();
        }
    }

    private final void init() {
        Serializable serializable;
        Music music;
        String str;
        String str2;
        String LLJJIJIIJIL;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null) {
            return;
        }
        Intent intent = mo49getActivity.getIntent();
        String str3 = null;
        if (intent != null) {
            serializable = intent.getSerializableExtra("artist_music_data");
        } else {
            serializable = null;
        }
        if (serializable instanceof Music) {
            music = (Music) serializable;
        } else {
            music = null;
        }
        this.LJLIL = music;
        Intent intent2 = mo49getActivity.getIntent();
        if (intent2 != null) {
            str3 = C16880lQ.LLJJIJIIJIL(intent2, "artist_music_id");
        }
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        this.LJLILLLLZI = str3;
        Intent intent3 = mo49getActivity.getIntent();
        if (intent3 == null || (str = C16880lQ.LLJJIJIIJIL(intent3, "artist_music_name")) == null) {
            str = "";
        }
        this.LJLJI = str;
        Intent intent4 = mo49getActivity.getIntent();
        if (intent4 != null && (LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent4, "artist_music_featured_aweme_id")) != null) {
            str4 = LLJJIJIIJIL;
        }
        this.LJLJJI = str4;
        Intent intent5 = mo49getActivity.getIntent();
        boolean z = false;
        if (intent5 != null) {
            z = intent5.getBooleanExtra("artist_music_from_profile", false);
        }
        this.LJLJJL = z;
        Intent intent6 = mo49getActivity.getIntent();
        if (intent6 == null || (str2 = C16880lQ.LLJJIJIIJIL(intent6, "enter_method")) == null) {
            str2 = "single_song";
        }
        this.LJLJJLL = str2;
    }

    public final void Hl(boolean z) {
        MusicModel convertToMusicModel;
        ActivityC45651qj mo49getActivity;
        Music music = this.LJLIL;
        if (music == null || (convertToMusicModel = music.convertToMusicModel()) == null || (mo49getActivity = mo49getActivity()) == null) {
            return;
        }
        if (MSAdaptionService.LJIIL().LJI(mo49getActivity)) {
            C16880lQ.LLZILL(Toast.makeText(mo49getActivity, mo49getActivity.getString(R.string.f1i), 0));
            return;
        }
        Context context = getContext();
        if (context == null) {
            return;
        }
        if (!C48203Ivv.LJ(context)) {
            RecordConfig.Builder builder = new RecordConfig.Builder();
            builder.unavailableNetworkMusic(true);
            builder.shootWay("single_song");
            AVExternalServiceImpl.LIZ().asyncService("network unavailable", new C42408Gke(z, mo49getActivity, builder, convertToMusicModel, context));
        }
        if (!((RBX) HG3.LJIILL()).isLogin() && AVExternalServiceImpl.LIZ().configService().avsettingsConfig().needLoginBeforeRecord()) {
            InterfaceC65895Ptb LJIIIIZZ = HG3.LJIIIIZZ();
            C78450Uqc c78450Uqc = new C78450Uqc();
            c78450Uqc.LIZ = mo49getActivity;
            LJIIIIZZ.showLoginAndRegisterView(new C78451Uqd(c78450Uqc));
            MobClick obtain = MobClick.obtain();
            obtain.setEventName("login_notify");
            obtain.setLabelName("click_music_shoot");
            FMX.onEvent(obtain);
            return;
        }
        String LIZ = AnonymousClass629.LIZ("randomUUID().toString()");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("creation_id", LIZ);
        c188727au.LJIIIZ("shoot_way", "single_song");
        c188727au.LJIIIZ("shoot_from", "feature_video_page");
        c188727au.LJIIIZ("music_id", this.LJLILLLLZI);
        c188727au.LJIIIZ("enter_method", this.LJLJJLL);
        if (z) {
            FMX.LJIIL("click_upload_entrance", c188727au.LIZ);
        } else {
            FMX.LJIIL("shoot", c188727au.LIZ);
        }
        convertToMusicModel.setFromSection(MusicModel.FromSection.OTHER);
        C78939UyV.LJLJI = this.LJLJJLL;
        if (!AVExternalServiceImpl.LIZ().infoService().isTrimmedEnable(convertToMusicModel)) {
            convertToMusicModel.setMusicBeginTime(0);
            convertToMusicModel.setMusicEndTime(0);
        }
        if (z) {
            IMusicDetailService LJIJJ = MusicDetailService.LJIJJ();
            ActivityC45651qj mo49getActivity2 = mo49getActivity();
            if (mo49getActivity2 != null) {
                LJIJJ.LJIILIIL(this, mo49getActivity2, convertToMusicModel, LIZ, this.LJLJJLL);
                return;
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        IMusicDetailService LJIJJ2 = MusicDetailService.LJIJJ();
        ActivityC45651qj mo49getActivity3 = mo49getActivity();
        if (mo49getActivity3 != null) {
            LJIJJ2.LJFF(this, mo49getActivity3, convertToMusicModel, "", "", 0, false, LIZ, "feature_video_page", false, this.LJLJJLL, "feature_video_page");
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Override // X.C9BK
    public void d6(boolean z) {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null) {
            return;
        }
        C245319jz c245319jz = new C245319jz();
        C252669vq c252669vq = new C252669vq();
        String string = getString(R.string.gck);
        o.LJIIIIZZ(string, "getString(R.string.featu…ddVideo_actionSheet_cta1)");
        c252669vq.LIZ = string;
        c252669vq.LJ = new ACListenerS24S0100000_4(this, 69);
        C252669vq c252669vq2 = new C252669vq();
        String string2 = getString(R.string.gcl);
        o.LJIIIIZZ(string2, "getString(R.string.featu…ddVideo_actionSheet_cta2)");
        c252669vq2.LIZ = string2;
        c252669vq2.LJ = new ACListenerS24S0100000_4(this, 70);
        c245319jz.LIZIZ(c252669vq, c252669vq2);
        if (z) {
            String string3 = getString(R.string.gcm);
            o.LJIIIIZZ(string3, "getString(R.string.featu…_actionSheet_description)");
            c245319jz.LJII(string3);
        }
        TuxActionSheet LIZJ = c245319jz.LIZJ();
        FragmentManager supportFragmentManager = mo49getActivity.getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "act.supportFragmentManager");
        LIZJ.show(supportFragmentManager, "artist_record_video_sheet");
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        init();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        fragmentConfiguration(C243169gW.LJLIL);
        C8VV.LIZ(this, false, new AqS170S0100000_4(this, 408));
        Gl();
    }

    public View vl(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        return C16880lQ.LLLLIILL(inflater, Dl(), viewGroup, false);
    }

    public static View xl(ArtistMusicAwemeListFragment artistMusicAwemeListFragment, LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View vl = artistMusicAwemeListFragment.vl(inflater, viewGroup, bundle);
        C29S c29s = null;
        if (!(vl instanceof View)) {
            vl = null;
        }
        if (vl != null) {
            try {
                ViewTreeLifecycleOwner.set(vl, artistMusicAwemeListFragment.getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(vl, artistMusicAwemeListFragment);
                C10A.LIZIZ(vl, artistMusicAwemeListFragment);
                ActivityC45651qj mo49getActivity = artistMusicAwemeListFragment.mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return vl;
    }
}

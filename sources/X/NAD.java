package X;

import Y.ARunnableS21S0300000_10;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.commercialize.media.impl.handler.detail.substitutemusic.v1.CommerceMusicSubstituteMusicVideoFragment;
import com.ss.android.ugc.aweme.commercialize.media.impl.handler.detail.substitutemusic.v2.CommerceMusicSubstituteMusicListFragment;
import com.ss.android.ugc.aweme.commercialize.media.impl.logging.CommerceMusicLogger;
import com.ss.android.ugc.aweme.commercialize.media.impl.utils.ScopedMusicPlayer;
import com.ss.android.ugc.aweme.commercialize.media.impl.viewmodel.RecommendMusicV2ViewModel;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS173S0200000_10;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NAD extends NAK implements OGV {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJIILL;
    public final NAN LJ = new NAN(this.LIZ, Activity.class);
    public final NAN LJFF = new NAN(this.LIZ, N4R.class);
    public final NAM LJI = new NAM(this.LIZ);
    public final NAP LJII;
    public final NAP LJIIIIZZ;
    public final NAP LJIIIZ;
    public final NAP LJIIJ;
    public final NAR LJIIJJI;
    public NAE LJIIL;
    public Long LJIILIIL;
    public final CommerceMusicLogger LJIILJJIL;

    static {
        TBT tbt = new TBT(NAD.class, "activity", "getActivity()Landroid/app/Activity;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJIILL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(NAD.class, "callback", "getCallback()Lcom/ss/android/ugc/aweme/commercialize/media/api/handler/detail/ICommerceMusicDetailCallback;", 0, c65351Pkp), C61845OOz.LIZJ(NAD.class, "banUseMusicToastView", "getBanUseMusicToastView()Landroid/view/View;", 0, c65351Pkp), C61845OOz.LIZJ(NAD.class, "musicDetail", "getMusicDetail()Lcom/ss/android/ugc/aweme/music/model/MusicDetail;", 0, c65351Pkp), C61845OOz.LIZJ(NAD.class, "fromBannerId", "getFromBannerId()Ljava/lang/String;", 0, c65351Pkp), C61845OOz.LIZJ(NAD.class, "musicFrom", "getMusicFrom()Ljava/lang/String;", 0, c65351Pkp), C61845OOz.LIZJ(NAD.class, "awemeId", "getAwemeId()Ljava/lang/String;", 0, c65351Pkp), C61845OOz.LIZJ(NAD.class, "recommendMusicViewStub", "getRecommendMusicViewStub()Landroid/view/View;", 0, c65351Pkp), C61845OOz.LIZJ(NAD.class, "recommendViewModelV2", "getRecommendViewModelV2()Lcom/ss/android/ugc/aweme/commercialize/media/impl/viewmodel/RecommendMusicV2ViewModel;", 0, c65351Pkp)};
    }

    @Override // X.OGV
    public final void LIZ() {
        NAE nae = this.LJIIL;
        if (nae != null) {
            nae.LIZ();
        }
    }

    @Override // X.OGV
    public final void LJ() {
        InterfaceC44417Hbx LIZ;
        String str = (String) this.LJIIIZ.LIZ(LJIILL[6]);
        if (str != null && (LIZ = NH7.LIZ()) != null) {
            LIZ.LIZIZ(str);
        }
        CommerceMusicLogger commerceMusicLogger = this.LJIILJJIL;
        N4C.LIZ.getClass();
        commerceMusicLogger.LJIILJJIL(N4C.LJFF, new AqS176S0100000_10(this, 158));
    }

    @Override // X.NAK
    public final void LJII() {
        new AqS176S0100000_10(this, 159).invoke(LIZIZ());
        H92.LJLIL.getClass();
        List<H97> list = H92.LJLLILLLL;
        NAP nap = this.LJII;
        InterfaceC74236TBo<Object>[] interfaceC74236TBoArr = LJIILL;
        ((ArrayList) list).add(new H98((String) nap.LIZ(interfaceC74236TBoArr[4])));
        RecommendMusicV2ViewModel LJIIJJI = LJIIJJI();
        Context activity = (Context) this.LJ.LIZ(interfaceC74236TBoArr[0]);
        LifecycleOwner lifecycleOwner = this.LIZIZ;
        if (lifecycleOwner != null) {
            N4R callback = LJIIJ();
            LJIIJJI.getClass();
            o.LJIIIZ(activity, "activity");
            o.LJIIIZ(callback, "callback");
            LJIIJJI.LJLJI.setValue(new ScopedMusicPlayer(activity, lifecycleOwner));
            LJIIJJI.LJLIL = callback;
            return;
        }
        o.LJIJI("_lifecycleOwner");
        throw null;
    }

    @Override // X.NAK
    public final void LJIIIIZZ() {
        H92.LJLIL.getClass();
        ORS.LJJZ(H92.LJLLILLLL);
        H92.LJII(null);
        H92.LJI(null);
    }

    @Override // X.NAK
    public final void LJIIIZ() {
        NAE nae = this.LJIIL;
        if (nae != null) {
            nae.LIZ();
        }
    }

    public final N4R LJIIJ() {
        return (N4R) this.LJFF.LIZ(LJIILL[1]);
    }

    public final RecommendMusicV2ViewModel LJIIJJI() {
        NAR nar = this.LJIIJJI;
        InterfaceC74236TBo<Object> property = LJIILL[8];
        nar.getClass();
        o.LJIIIZ(property, "property");
        return (RecommendMusicV2ViewModel) new ViewModelProvider(nar.LIZIZ.invoke()).get(nar.LIZ);
    }

    public NAD() {
        new NAO(this.LIZ, MusicDetail.class);
        this.LJII = C78857UxB.LJJIL(this, "from_banner_id");
        this.LJIIIIZZ = C78857UxB.LJJIL(this, "music_from");
        this.LJIIIZ = C78857UxB.LJJIL(this, "aweme_id");
        this.LJIIJ = C78857UxB.LJJIL(this, "commercial_music_section_view_stub");
        this.LJIIJJI = new NAR(RecommendMusicV2ViewModel.class, new AqS160S0100000_10((NAK) this, 459));
        this.LJIILJJIL = new CommerceMusicLogger();
    }

    @Override // X.OGV
    public final void LIZLLL() {
        this.LJIILIIL = Long.valueOf(SystemClock.elapsedRealtime());
    }

    @Override // X.OGV
    public final java.util.Map<String, Object> LJFF(MusicModel selectedMusic) {
        o.LJIIIZ(selectedMusic, "selectedMusic");
        if (!C44416Hbw.LIZLLL()) {
            return C113554cx.LJJJLIIL();
        }
        CommerceMusicLogger commerceMusicLogger = this.LJIILJJIL;
        N4C.LIZ.getClass();
        return commerceMusicLogger.LJIIIIZZ(N4C.LJIILIIL.LIZIZ, new AqS176S0100000_10(selectedMusic, 157));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v81, types: [V, java.lang.Object] */
    @Override // X.OGV
    public final void onLoadMusicDetailSuccess(MusicDetail musicDetail) {
        List<Music> list;
        long j;
        int i;
        o.LJIIIZ(musicDetail, "musicDetail");
        if (musicDetail.isFromCache) {
            return;
        }
        NAF LJIJ = C77412UZs.LJIJ(musicDetail);
        this.LJIILJJIL.LJIIJ(musicDetail);
        CommerceMusicLogger commerceMusicLogger = this.LJIILJJIL;
        N4D.LIZ.getClass();
        commerceMusicLogger.LJII(N4D.LJIIJJI, LJIJ.getVersion());
        if (C44416Hbw.LIZLLL()) {
            CommerceMusicLogger commerceMusicLogger2 = this.LJIILJJIL;
            N4C.LIZ.getClass();
            commerceMusicLogger2.LIZIZ(N4C.LIZIZ);
        }
        if (NAG.LIZ[LJIJ.ordinal()] == 2) {
            H92.LJII(String.valueOf(musicDetail.suggestionId));
            H96 h96 = new H96();
            Long l = this.LJIILIIL;
            List<Music> list2 = musicDetail.recommendMusicList;
            if (list2 != null && !list2.isEmpty()) {
                OSZ<String, ? extends Object>[] oszArr = new OSZ[1];
                if (l != null) {
                    j = SystemClock.elapsedRealtime() - l.longValue();
                } else {
                    j = -1;
                }
                oszArr[0] = new OSZ<>("ttelite_BA_music_rec_module_load_time", Long.valueOf(j));
                h96.LJI("ttelite_BA_music_rec_module_load_time", oszArr);
            }
            Long l2 = null;
            this.LJIILIIL = null;
            RecommendMusicV2ViewModel LJIIJJI = LJIIJJI();
            LJIIJJI.getClass();
            LJIIJJI.LJLILLLLZI = musicDetail;
            if (!musicDetail.showRecommendMusic || (list = musicDetail.recommendMusicList) == null || !(!list.isEmpty()) || 1 == 0) {
                LJIIJJI.LJLJJL.setValue(new N4T("", C61878OQg.INSTANCE, false));
            } else {
                XKX.LIZLLL(ViewModelKt.getViewModelScope(LJIIJJI), null, null, new NE3(LJIIJJI, musicDetail, null), 3);
            }
            NAE nae = new NAE(this.LIZ);
            NAP nap = this.LJIIJ;
            InterfaceC74236TBo<Object>[] interfaceC74236TBoArr = LJIILL;
            View stub = (View) nap.LIZ(interfaceC74236TBoArr[7]);
            RecommendMusicV2ViewModel viewModel = LJIIJJI();
            o.LJIIIZ(stub, "stub");
            o.LJIIIZ(viewModel, "viewModel");
            if (stub instanceof ViewStub) {
                ViewStub viewStub = (ViewStub) stub;
                if (viewStub.getParent() != null) {
                    viewStub.setInflatedId(R.id.bo1);
                    NAO nao = nae.LIZJ;
                    InterfaceC74236TBo<Object>[] interfaceC74236TBoArr2 = NAE.LJI;
                    if (nao.LIZ(interfaceC74236TBoArr2[1]) != null) {
                        viewStub.setLayoutResource(R.layout.a69);
                        View inflate = viewStub.inflate();
                        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.iqj);
                        recyclerView.setAdapter(new N91(viewModel, (LifecycleOwner) nae.LIZLLL.LIZ(interfaceC74236TBoArr2[2])));
                        viewStub.getContext();
                        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
                        Context LLLLJ = C16880lQ.LLLLJ((Activity) nae.LIZIZ.LIZ(interfaceC74236TBoArr2[0]));
                        o.LJIIIIZZ(LLLLJ, "activity.applicationContext");
                        C44416Hbw.LJ(recyclerView, new C4K2(10.0f, LLLLJ));
                        recyclerView.setVisibility(0);
                        C0A2 layoutManager = recyclerView.getLayoutManager();
                        o.LJII(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                        AqS173S0200000_10 aqS173S0200000_10 = new AqS173S0200000_10(nae, recyclerView, 7);
                        ArrayList arrayList = new ArrayList();
                        new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS21S0300000_10(linearLayoutManager, arrayList, aqS173S0200000_10, 25));
                        recyclerView.LJIIJJI(new N5I(linearLayoutManager, arrayList, aqS173S0200000_10));
                        new C40141hq().LIZIZ(recyclerView);
                        l2 = null;
                        LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) nae.LIZLLL.LIZ(interfaceC74236TBoArr2[2])).launchWhenStarted(new C59011NDz(viewModel, (TextView) inflate.findViewById(R.id.iqy), viewStub, null));
                    }
                    viewStub.setVisibility(0);
                }
            }
            this.LJIIL = nae;
            H96 h962 = new H96();
            Object LIZ = this.LJIIIIZZ.LIZ(interfaceC74236TBoArr[5]);
            h962.LJIIIIZZ(musicDetail);
            OSZ<String, ? extends Object>[] oszArr2 = new OSZ[3];
            Music music = musicDetail.music;
            if (music != null) {
                l2 = Long.valueOf(music.getId());
            }
            oszArr2[0] = new OSZ<>("meta_song_id", l2);
            oszArr2[1] = new OSZ<>("rec_candidate_clip_id", H9A.LIZ);
            oszArr2[2] = new OSZ<>("enter_from", LIZ);
            h962.LJI("ttelite_BA_music_rec_show", oszArr2);
        }
        if (!LJIJ.getEnableNormalUiElements()) {
            LJIIJ().LLFII();
        }
        NAM nam = this.LJI;
        InterfaceC74236TBo<Object> property = LJIILL[2];
        nam.getClass();
        o.LJIIIZ(property, "property");
        if (!nam.LIZLLL.getAndSet(true)) {
            InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) ((LinkedHashMap) nam.LIZ.LIZIZ).get(nam.LIZIZ);
            if (interfaceC65784Pro != null) {
                nam.LIZJ = interfaceC65784Pro.invoke();
            } else {
                throw new NAQ(nam.LIZIZ, property.getName());
            }
        }
        View view = (View) nam.LIZJ;
        if (view == null) {
            return;
        }
        if (LJIJ == NAF.ONLY_COMMERCIAL_MUSIC_TEXT_VIEW) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    @Override // X.OGV
    public final boolean LIZJ(MusicDetail musicDetail, FragmentManager fragmentManager) {
        int i = NAG.LIZIZ[C77412UZs.LJIJ(musicDetail).getShootAction().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return true;
            }
            if (i != 3) {
                if (i == 4) {
                    N5H n5h = CommerceMusicSubstituteMusicListFragment.LJLJJLL;
                    N5D n5d = new N5D(musicDetail, this.LJIILJJIL, new NAI(LJIIJ()));
                    n5h.getClass();
                    ASL asl = new ASL();
                    CommerceMusicSubstituteMusicListFragment commerceMusicSubstituteMusicListFragment = new CommerceMusicSubstituteMusicListFragment();
                    commerceMusicSubstituteMusicListFragment.LJLIL = n5d;
                    TuxSheet tuxSheet = asl.LIZ;
                    tuxSheet.LJLLILLLL = commerceMusicSubstituteMusicListFragment;
                    tuxSheet.LJZI = false;
                    tuxSheet.show(fragmentManager, "substitute_music_list_sheet");
                    return true;
                }
                throw new C162476Zf();
            }
            N5G n5g = CommerceMusicSubstituteMusicVideoFragment.LJLJJLL;
            N5D n5d2 = new N5D(musicDetail, this.LJIILJJIL, new NAH(LJIIJ()));
            n5g.getClass();
            CommerceMusicSubstituteMusicVideoFragment commerceMusicSubstituteMusicVideoFragment = new CommerceMusicSubstituteMusicVideoFragment();
            commerceMusicSubstituteMusicVideoFragment.LJLIL = n5d2;
            ASL asl2 = new ASL();
            asl2.LIZ.LJLLILLLL = commerceMusicSubstituteMusicVideoFragment;
            C235119Kp c235119Kp = new C235119Kp();
            C234529Ii LIZJ = s1.LIZJ();
            LIZJ.LIZJ = R.raw.icon_x_mark_small;
            LIZJ.LIZIZ(new AqS160S0100000_10(commerceMusicSubstituteMusicVideoFragment, 89));
            c235119Kp.LIZIZ(LIZJ);
            TuxSheet tuxSheet2 = asl2.LIZ;
            tuxSheet2.LJLLL = c235119Kp;
            tuxSheet2.show(fragmentManager, "substitute_music_video_sheet");
            return true;
        }
        return false;
    }
}

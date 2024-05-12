package X;

import Y.AObjectS84S0100000_2;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.commerce.tools.mission.service.CommerceToolsMissionService;
import com.ss.android.ugc.aweme.commerce.tools.mission.service.ICommerceToolsMissionService;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.performance.OpenEditMusicPanelPerformanceMonitor;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5qg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147545qg extends WJB {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLLL;
    public final LifecycleOwner LJLJI;
    public final C82622Wbi LJLJJI;
    public final C148195rj LJLJJL;
    public final C82632Wbs LJLJJLL;
    public final C82632Wbs LJLJL;
    public final C82631Wbr LJLJLJ;
    public final C5H3 LJLJLLL;
    public final C82631Wbr LJLL;
    public final C82632Wbs LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C148165rg LJLLL;

    static {
        TBT tbt = new TBT(C147545qg.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLLLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C147545qg.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0, c65351Pkp), C61845OOz.LIZJ(C147545qg.class, "editMusicApi", "getEditMusicApi()Lcom/ss/android/ugc/gamora/editor/music/EditMusicApi;", 0, c65351Pkp), C61845OOz.LIZJ(C147545qg.class, "editAudioCopyrightDetectApi", "getEditAudioCopyrightDetectApi()Lcom/ss/android/ugc/gamora/editor/audio/copyrightdetect/EditAudioCopyrightDetectApi;", 0, c65351Pkp), C61845OOz.LIZJ(C147545qg.class, "activity", "getActivity()Landroid/app/Activity;", 0, c65351Pkp)};
    }

    @Override // X.WJB
    public final void LJFF() {
        LJIIJ(true);
    }

    @Override // X.WJB
    public final void LIZLLL() {
        LiveEvent<AVMusic> Am;
        InterfaceC145325n6 interfaceC145325n6 = (InterfaceC145325n6) this.LJLJLJ.LIZ(this, LJLLLL[2]);
        if (interfaceC145325n6 != null && (Am = interfaceC145325n6.Am()) != null) {
            Am.LIZLLL(this.LJLJI, new AObjectS84S0100000_2(this, 269));
        }
    }

    public final VideoPublishEditModel LJIIIZ() {
        return (VideoPublishEditModel) this.LJLJJLL.LIZ(this, LJLLLL[0]);
    }

    @Override // X.WJB
    public final boolean LJIIIIZZ() {
        return C44384HbQ.LLJILLL(LJIIIZ());
    }

    @Override // X.WJB
    public final WI1 LIZJ() {
        return this.LJLLL;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJJI;
    }

    public final void LJIIJ(boolean z) {
        InterfaceC143385jy interfaceC143385jy;
        boolean z2;
        G8G.LIZ.start(OpenEditMusicPanelPerformanceMonitor.INSTANCE, "start_choose_music");
        ICommerceToolsMissionService LJIIJ = CommerceToolsMissionService.LJIIJ();
        C82632Wbs c82632Wbs = this.LJLLI;
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LJLLLL;
        LJIIJ.LJIIIZ((Activity) c82632Wbs.LIZ(this, interfaceC74236TBoArr[4]), LJIIIZ());
        boolean z3 = true;
        if (C149275tT.LIZ() == 1 || !z || (interfaceC143385jy = (InterfaceC143385jy) this.LJLL.LIZ(this, interfaceC74236TBoArr[3])) == null || !C143475k7.LIZ(interfaceC143385jy, "click_add_sound", false, new AqS152S0100000_2(this, 694), 12)) {
            if (C44384HbQ.LJJIFFI()) {
                H8F.LJJIII(2, LJIIIZ(), "ai_panel");
                if (LJIIIZ().isStickPointMode) {
                    if (!LJIIIZ().mIsFromDraft) {
                        C5S1 c5s1 = new C5S1((Context) this.LJLLI.LIZ(this, interfaceC74236TBoArr[4]));
                        c5s1.LIZJ(R.string.rp2);
                        c5s1.LJ();
                        return;
                    }
                    return;
                }
                ((InterfaceC153275zv) this.LJLJLLL.getValue()).p9(1, false);
                C78934UyQ.LJLIL.getMusicService().LJIIZILJ();
                InterfaceC145325n6 interfaceC145325n6 = (InterfaceC145325n6) this.LJLJLJ.LIZ(this, interfaceC74236TBoArr[2]);
                if (interfaceC145325n6 != null) {
                    interfaceC145325n6.show(true);
                }
                ((InterfaceC143655kP) this.LJLJL.LIZ(this, interfaceC74236TBoArr[1])).U2(false, false, false);
                AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(LJIIIZ().creativeModel.musicBuzModel);
                if (extractAVMusic != null) {
                    z2 = extractAVMusic.isMvThemeMusic();
                } else {
                    z2 = false;
                }
                InterfaceC145495nN interfaceC145495nN = (InterfaceC145495nN) this.LJLLILLLL.getValue();
                if (!C44384HbQ.LJJIIZ(LJIIIZ()) || z2) {
                    z3 = false;
                }
                interfaceC145495nN.B8(z3);
                return;
            }
            H8F.LJJIII(6, LJIIIZ(), null);
            if (LJIIIZ().isStickPointMode) {
                if (LJIIIZ().mIsFromDraft) {
                    return;
                }
                C5S1 c5s12 = new C5S1((Context) this.LJLLI.LIZ(this, interfaceC74236TBoArr[4]));
                c5s12.LIZJ(R.string.rp2);
                c5s12.LJ();
                return;
            }
            ((InterfaceC150315v9) this.LJLLJ.getValue()).LJLJJL();
            ((InterfaceC153275zv) this.LJLJLLL.getValue()).r3();
            ((InterfaceC143655kP) this.LJLJL.LIZ(this, interfaceC74236TBoArr[1])).DM().setValue(C5MM.LIZJ());
            ((InterfaceC145495nN) this.LJLLILLLL.getValue()).r3();
            H8F.LJIL(LJIIIZ());
        }
    }

    public C147545qg(LifecycleOwner lifecycleOwner, C82622Wbi diContainer, C148195rj config) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(config, "config");
        this.LJLJI = lifecycleOwner;
        this.LJLJJI = diContainer;
        this.LJLJJL = config;
        this.LJLJJLL = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        this.LJLJL = UCI.LJI(diContainer, InterfaceC143655kP.class, null);
        this.LJLJLJ = UCI.LJII(diContainer, InterfaceC145325n6.class, null);
        this.LJLJLLL = C221108m2.LIZ(EnumC221088m0.NONE, new AqS152S0100000_2((InterfaceC135635Tz) this, 695));
        this.LJLL = UCI.LJII(diContainer, InterfaceC143385jy.class, null);
        this.LJLLI = UCI.LJI(diContainer, Activity.class, null);
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 693));
        this.LJLLJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 696));
        C148165rg c148165rg = new C148165rg();
        c148165rg.LJFF = C78866UxK.LJJJLZIJ(LJIIIZ());
        this.LJLLL = c148165rg;
    }
}

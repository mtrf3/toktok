package X;

import Y.AfS17S1200000_7;
import Y.AfS56S0200000_7;
import Y.AfS59S0100000_7;
import android.content.Context;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.services.NetworkStateServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import defpackage.e1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS62S1200000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.GuX, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43021GuX {
    public C43016GuS LIZ;
    public final AbstractC41925Gcr LIZIZ;
    public List<? extends MusicModel> LIZLLL;
    public final C73318Sq2 LJI;
    public C73411SrX LJII;
    public C73849Syb<C43023GuZ> LJIIIIZZ;
    public final C73849Syb<Boolean> LJIIIZ;
    public final List<InterfaceC43019GuV> LJIIJ;
    public volatile boolean LJIIJJI;
    public volatile boolean LJIIL;
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(C43017GuT.LJLIL);
    public final C73849Syb<C43023GuZ> LJ = new C73849Syb<>();
    public final long LJFF = System.currentTimeMillis();

    public final void LIZ(InterfaceC43019GuV listener) {
        o.LJIIIZ(listener, "listener");
        if (!this.LJIIJ.contains(listener)) {
            this.LJIIJ.add(listener);
        }
    }

    public C43021GuX(C43016GuS c43016GuS, AbstractC41925Gcr abstractC41925Gcr) {
        RBY LJFF;
        String curUserId;
        this.LIZ = c43016GuS;
        this.LIZIZ = abstractC41925Gcr;
        C73318Sq2 c73318Sq2 = new C73318Sq2();
        this.LJI = c73318Sq2;
        this.LJIIIIZZ = new C73849Syb<>();
        this.LJIIIZ = new C73849Syb<>();
        this.LJIIJ = new ArrayList();
        IAccountService LJIJ = AccountService.LJIJ();
        C43025Gub.LIZ = (LJIJ == null || (LJFF = LJIJ.LJFF()) == null || (curUserId = LJFF.getCurUserId()) == null) ? "" : curUserId;
        if (abstractC41925Gcr != null) {
            C73849Syb<String> c73849Syb = abstractC41925Gcr.LJI;
            c73318Sq2.LIZ(C42193GhB.LIZJ(c73849Syb, c73849Syb).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS59S0100000_7(this, 5), C73674Svm.LIZLLL));
        }
    }

    public static void LIZJ(C43021GuX c43021GuX, long j, boolean z) {
        int i;
        InterfaceC92693kP interfaceC92693kP;
        c43021GuX.getClass();
        AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getABService().getClass();
        if (e1.LIZ(31744, "show_similar_tag_on_change_sound_page", true, false) && !z) {
            i = 1;
        } else {
            i = 0;
        }
        AbstractC41925Gcr abstractC41925Gcr = c43021GuX.LIZIZ;
        if (abstractC41925Gcr != null && c43021GuX.LIZ.LJFF && abstractC41925Gcr.LJI.LJJZZIII() == null) {
            C73411SrX c73411SrX = c43021GuX.LJII;
            if (c73411SrX != null) {
                c73411SrX.dispose();
            }
            AbstractC41925Gcr abstractC41925Gcr2 = c43021GuX.LIZIZ;
            if (abstractC41925Gcr2 != null) {
                C73849Syb<String> c73849Syb = abstractC41925Gcr2.LJI;
                interfaceC92693kP = C42193GhB.LIZJ(c73849Syb, c73849Syb).LJJJLIIL(new C43018GuU(c43021GuX, j, null, i), C73674Svm.LIZLLL);
            } else {
                interfaceC92693kP = null;
            }
            c43021GuX.LJII = (C73411SrX) interfaceC92693kP;
            return;
        }
        c43021GuX.LIZLLL(0, j, null, 10, 20, -1, c43021GuX.LIZ.LJI, i, 0, false);
    }

    public static void LIZIZ(C43021GuX c43021GuX, List list, String str, boolean z, int i) {
        boolean z2;
        Integer num;
        String str2 = str;
        if ((i & 1) != 0) {
            list = null;
        }
        if ((i & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        c43021GuX.getClass();
        C43023GuZ c43023GuZ = new C43023GuZ(false, 1, 0, null, System.currentTimeMillis() - c43021GuX.LJFF, null, z, 56);
        if (z2) {
            if (list != null) {
                num = Integer.valueOf(list.size());
            } else {
                num = null;
            }
            C6BK c6bk = new C6BK();
            if (num != null) {
                num.intValue();
                c6bk.LIZIZ(num, "photo_to_video_assets_count");
            }
            if (str2 != null) {
                c6bk.LIZLLL("error_info", str2);
            }
            C43882HKc.LIZLLL(2, "ies_ai_recommend_request_monitor", c6bk.LJ(), true);
        }
        c43021GuX.LJIIIIZZ.onNext(c43023GuZ);
        c43021GuX.LJIIIZ.onNext(Boolean.TRUE);
    }

    public final void LIZLLL(int i, long j, List<String> list, int i2, int i3, int i4, String str, int i5, int i6, boolean z) {
        boolean z2;
        String str2;
        boolean z3;
        int i7;
        String LJFF;
        String LJFF2;
        XKQ xkq;
        this.LJIIJJI = true;
        Context LIZ = C5L7.LIZ();
        if (C00F.LIZ(31744, 0, "creative_tools_ai_music_disk_cache_optimize", true) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (!C48203Ivv.LJ(LIZ)) {
                C43045Guv.LIZIZ(new AqS62S1200000_7(this, "network not available, no cache", list, 0));
                return;
            }
        } else if (C43026Guc.LIZ()) {
            if (!C48203Ivv.LJ(LIZ)) {
                C43045Guv.LIZIZ(new AqS62S1200000_7(this, "network not available, no cache", list, 0));
                return;
            } else if (NetworkStateServiceImpl.createINetworkStateServicebyMonsterPlugin(false).isWeakNetwork()) {
                C43045Guv.LIZIZ(new AqS62S1200000_7(this, "network not available, no cache", list, 0));
            }
        }
        C73411SrX c73411SrX = this.LJII;
        String str3 = null;
        if (c73411SrX != null) {
            c73411SrX.dispose();
            this.LJII = null;
        }
        AbstractC41925Gcr abstractC41925Gcr = this.LIZIZ;
        if (abstractC41925Gcr != null) {
            str3 = abstractC41925Gcr.LJI.LJJZZIII();
        }
        AbstractC41925Gcr abstractC41925Gcr2 = this.LIZIZ;
        if (abstractC41925Gcr2 != null && (xkq = abstractC41925Gcr2.LJ) != null) {
            if (xkq.isActive()) {
                str2 = "not_finish";
            } else if (xkq.isCancelled()) {
                str2 = "canceled";
            } else {
                str2 = "complete";
            }
        } else {
            str2 = "unknown";
        }
        if ((str3 == null || str3.length() == 0) && z && !this.LJIIL) {
            C43016GuS c43016GuS = this.LIZ;
            c43016GuS.LIZIZ = j;
            c43016GuS.LJ = true;
            return;
        }
        this.LIZ.LJ = false;
        if (str3 == null || str3.length() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        String str4 = LiveGiftNewGifterBadgeSetting.DEFAULT;
        if (((z3 && C00F.LIZ(31744, 0, "enable_ai_music_without_frame", true) == 0) || C60903NvH.LJIIJJI().LJIILLIIL().LIZ()) && !CommerceMediaServiceImpl.LIZJ().LJ()) {
            H7B.LIZIZ("AI_MUSIC_OPTIMIZE", "requestMusicReal called: hot music");
            this.LJI.LIZ(AbstractC73672Svk.LJIIJ(new C42634GoI(j, 0, i2, i)).LJJJLIIL(new AfS59S0100000_7(this, 6), new AfS56S0200000_7(this, list, 0)));
            boolean LIZ2 = C60903NvH.LJIIJJI().LJIILLIIL().LIZ();
            AbstractC41925Gcr abstractC41925Gcr3 = this.LIZIZ;
            if (abstractC41925Gcr3 != null && (LJFF2 = abstractC41925Gcr3.LJFF()) != null) {
                str4 = LJFF2;
            }
            C43044Guu.LIZ(0, i4, LIZ2, str4, System.currentTimeMillis() - this.LJFF, str2);
            return;
        }
        H7B.LIZIZ("AI_MUSIC_OPTIMIZE", "requestMusicReal called: ai recommend");
        C73318Sq2 c73318Sq2 = this.LJI;
        C42640GoO c42640GoO = C42640GoO.LIZ;
        C43016GuS c43016GuS2 = this.LIZ;
        c73318Sq2.LIZ(c42640GoO.LIZ(str3, c43016GuS2.LIZJ, j, i3, 0, i5, i6, c43016GuS2.LIZLLL, str).LJJJLIIL(new AfS17S1200000_7(this, str3, list, 0), new AfS56S0200000_7(this, list, 1)));
        if (str3 == null || str3.length() == 0) {
            i7 = 2;
        } else {
            i7 = 1;
        }
        AbstractC41925Gcr abstractC41925Gcr4 = this.LIZIZ;
        if (abstractC41925Gcr4 != null && (LJFF = abstractC41925Gcr4.LJFF()) != null) {
            str4 = LJFF;
        }
        C43044Guu.LIZ(i7, i4, false, str4, System.currentTimeMillis() - this.LJFF, str2);
    }
}

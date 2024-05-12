package X;

import Y.ARunnableS12S0300000_1;
import Y.ARunnableS1S1300000_1;
import com.google.gson.m;
import com.ss.android.ugc.aweme.comment.service.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Preload;
import com.ss.android.ugc.aweme.ml.ab.SmartPreloadCommentV2Experiment$PreloadCommentMLModel;
import com.ss.android.ugc.aweme.ml.ab.SmartPreloadProfileV2Experiment$PreloadProfileMLModel;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.33h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C777333h {
    public static final C5H3<C777333h> LJIIJ = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C777533j.LJLIL);
    public volatile boolean LIZ;
    public final java.util.Map<String, C60692Zt> LIZIZ = new ConcurrentHashMap();
    public final java.util.Map<String, Boolean> LIZJ = new ConcurrentHashMap();
    public volatile Aweme LIZLLL;
    public volatile IDP LJ;
    public volatile boolean LJFF;
    public volatile boolean LJI;
    public boolean LJII;
    public volatile boolean LJIIIIZZ;
    public long LJIIIZ;

    public final void LIZIZ() {
        String aid;
        String aid2;
        Aweme aweme = this.LIZLLL;
        if (aweme != null && (aid2 = aweme.getAid()) != null) {
            CommentService.LIZ.getClass();
            CommentServiceImpl.LJJL().LJIILIIL(aid2);
        }
        Aweme aweme2 = this.LIZLLL;
        if (aweme2 != null) {
            Z8A.LIZIZ.removeCacheByUser(aweme2.getSecAuthorUid(), aweme2.getAuthorUid());
        }
        this.LIZ = false;
        this.LJFF = false;
        ((ConcurrentHashMap) this.LIZIZ).clear();
        ((ConcurrentHashMap) this.LIZJ).clear();
        Aweme aweme3 = this.LIZLLL;
        if (aweme3 != null && (aid = aweme3.getAid()) != null) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C777433i.LIZ;
            C73318Sq2 c73318Sq2 = (C73318Sq2) concurrentHashMap.get(aid);
            if (c73318Sq2 != null) {
                c73318Sq2.LIZLLL();
                concurrentHashMap.remove(aid);
            }
        }
        this.LIZLLL = null;
        if (AnonymousClass340.LIZ()) {
            this.LJ = null;
        }
        C2MM.LIZ().LIZIZ = false;
        C2MM.LIZ().LIZJ = false;
    }

    public final void LJ() {
        if (true != this.LIZ && (!((ConcurrentHashMap) this.LIZIZ).isEmpty())) {
            for (Map.Entry entry : ((ConcurrentHashMap) this.LIZIZ).entrySet()) {
                LJI(((C60692Zt) entry.getValue()).LIZIZ, (String) entry.getKey(), true);
            }
            ((ConcurrentHashMap) this.LIZIZ).clear();
        }
        this.LIZ = true;
    }

    public static void LIZ() {
        if ((C79012Uzg.LIZJ() != null && C79012Uzg.LIZJ().groupId > 0) || (C79004UzY.LJIJI() != null && C79004UzY.LJIJI().groupId > 0)) {
            CommentService.LIZ.getClass();
            CommentServiceImpl.LJJL().removeAllCache();
            Z8A.LIZIZ.removeAllCache();
        }
    }

    public final void LIZJ(C60692Zt c60692Zt) {
        if (Math.abs(System.currentTimeMillis() - this.LJIIIZ) > 5000) {
            this.LJIIIZ = System.currentTimeMillis();
            this.LJIIIIZZ = C48203Ivv.LJFF(EF7.LIZIZ());
        }
        if (!this.LJIIIIZZ) {
            return;
        }
        String str = c60692Zt.LIZ;
        if (o.LJ(str, "comment_preload_task")) {
            CommentService.LIZ.getClass();
            CommentServiceImpl.LJJL().LJJIJ(this.LIZLLL, 300000, c60692Zt.LIZIZ);
        } else {
            if (!o.LJ(str, "profile_preload_task")) {
                return;
            }
            Z8A.LIZIZ.preloadProfileInfoAndAwemePost(this.LIZLLL, 300000, c60692Zt.LIZIZ, "homepage_hot");
        }
    }

    public final void LJFF(int i) {
        if (this.LIZLLL == null) {
            return;
        }
        if (C40010Fn4.LIZJ().LIZLLL() && C00F.LIZ(31744, 0, "power_mode_preload_comment_opt_type", true) == 1) {
            return;
        }
        switch (i) {
            case 1:
                LJI(i, "comment_preload_task", false);
                LJI(i, "profile_preload_task", false);
                return;
            case 2:
                LJI(i, "comment_preload_task", false);
                LJI(i, "profile_preload_task", false);
                return;
            case 3:
                LJI(i, "comment_preload_task", false);
                LJI(i, "profile_preload_task", false);
                return;
            case 4:
                LJI(i, "profile_preload_task", false);
                return;
            case 5:
                LJI(i, "comment_preload_task", false);
                LJI(i, "profile_preload_task", false);
                return;
            case 6:
                LJI(i, "comment_preload_task", false);
                return;
            case 7:
                LJI(i, "profile_preload_task", false);
                return;
            case 8:
                LJI(i, "comment_preload_task", false);
                LJI(i, "profile_preload_task", false);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [T, X.2Zt] */
    /* JADX WARN: Type inference failed for: r0v19, types: [T, X.2Zt] */
    public final void LJI(int i, String str, boolean z) {
        SmartPreloadProfileV2Experiment$PreloadProfileMLModel LJIJI;
        Integer valueOf;
        Preload preload;
        String str2;
        SmartPreloadProfileV2Experiment$PreloadProfileMLModel LJIJI2;
        SmartPreloadCommentV2Experiment$PreloadCommentMLModel LIZJ;
        boolean z2;
        String aid;
        try {
            boolean z3 = true;
            if ((!((ConcurrentHashMap) this.LIZJ).isEmpty()) && ((ConcurrentHashMap) this.LIZJ).containsKey(str)) {
                return;
            }
            if (!o.LJ("comment_preload_task", str) || !C2MM.LIZ().LIZIZ) {
                if (!o.LJ("profile_preload_task", str) || !C2MM.LIZ().LIZJ) {
                    if (o.LJ("comment_preload_task", str)) {
                        SmartPreloadCommentV2Experiment$PreloadCommentMLModel LIZJ2 = C79012Uzg.LIZJ();
                        if (LIZJ2 != null) {
                            valueOf = Integer.valueOf(LIZJ2.groupId);
                        } else {
                            return;
                        }
                    } else if (o.LJ("profile_preload_task", str) && (LJIJI = C79004UzY.LJIJI()) != null) {
                        valueOf = Integer.valueOf(LJIJI.groupId);
                    } else {
                        return;
                    }
                    if (valueOf != null && valueOf.intValue() >= 1 && valueOf.intValue() <= 6) {
                        if (i == 1 && valueOf.intValue() != 1 && valueOf.intValue() != 4) {
                            return;
                        }
                        C68322mC c68322mC = new C68322mC();
                        C56182Ik c56182Ik = new C56182Ik();
                        c56182Ik.LIZ = str;
                        c56182Ik.LIZIZ = i;
                        c56182Ik.LIZJ = 5;
                        c56182Ik.LIZLLL = System.currentTimeMillis();
                        c68322mC.element = new C60692Zt(c56182Ik);
                        if (!this.LIZ && !z) {
                            if (!((ConcurrentHashMap) this.LIZIZ).containsKey(str)) {
                                ((ConcurrentHashMap) this.LIZIZ).put(str, c68322mC.element);
                                return;
                            }
                            return;
                        }
                        C34K c34k = new C34K();
                        switch (valueOf.intValue()) {
                            case 1:
                                if (i == 1) {
                                    c34k.element = true;
                                }
                                z3 = false;
                                break;
                            case 2:
                                if (i == 2 || (i >= 4 && i <= 7)) {
                                    c34k.element = true;
                                }
                                z3 = false;
                                break;
                            case 3:
                                if (i >= 3 && i <= 7) {
                                    c34k.element = true;
                                }
                                z3 = false;
                                break;
                            case 4:
                                if (i == 1) {
                                    C56182Ik c56182Ik2 = new C56182Ik();
                                    c56182Ik2.LIZ = str;
                                    c56182Ik2.LIZIZ = 8;
                                    c56182Ik2.LIZJ = 5;
                                    c56182Ik2.LIZLLL = System.currentTimeMillis();
                                    c68322mC.element = new C60692Zt(c56182Ik2);
                                    Aweme aweme = this.LIZLLL;
                                    if (aweme != null && (preload = aweme.getPreload()) != null && (str2 = preload.predictConfig) != null) {
                                        new com.google.gson.o();
                                        m LJIIZILJ = com.google.gson.o.LIZ(str2).LJIIZILJ();
                                        if (o.LJ("comment_preload_task", ((C60692Zt) c68322mC.element).LIZ) && (LIZJ = C79012Uzg.LIZJ()) != null) {
                                            if (LJIIZILJ.LJJIJ("click_comment").LJIIIZ() >= LIZJ.recommendThreshold) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            c34k.element = z2;
                                        }
                                        if (o.LJ("profile_preload_task", ((C60692Zt) c68322mC.element).LIZ) && (LJIJI2 = C79004UzY.LJIJI()) != null) {
                                            if (LJIIZILJ.LJJIJ("head").LJIIIZ() < LJIJI2.recommendThreshold) {
                                                z3 = false;
                                            }
                                            c34k.element = z3;
                                        }
                                    }
                                }
                                z3 = false;
                                break;
                            case 5:
                            case 6:
                                if (i != 1 && i != 3) {
                                    break;
                                }
                                z3 = false;
                                break;
                            default:
                                z3 = false;
                                break;
                        }
                        Aweme aweme2 = this.LIZLLL;
                        if (aweme2 != null && (aid = aweme2.getAid()) != null) {
                            if (z3) {
                                C777633k.LIZJ(aid, (C60692Zt) c68322mC.element, new ARunnableS12S0300000_1(c68322mC, this, c34k, 17), new ARunnableS1S1300000_1(c34k, this, str, c68322mC, aid, 0));
                            } else if (c34k.element) {
                                ((ConcurrentHashMap) this.LIZJ).put(str, Boolean.TRUE);
                                LIZJ((C60692Zt) c68322mC.element);
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }
}

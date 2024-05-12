package X;

import Y.ARunnableS17S0400000_14;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS118S0300000_14;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WIq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82064WIq {
    public static final /* synthetic */ int LJIILIIL = 0;
    public InterfaceC82086WJm LIZIZ;
    public I3X LIZJ;
    public HYQ LIZLLL;
    public ShortVideoContext LJ;
    public ActivityC45651qj LJFF;
    public boolean LJI;
    public boolean LJII;
    public SafeHandler LJIIIIZZ;
    public List<? extends CharSequence> LJIIJJI;
    public String LJIIL;
    public final C82068WIu LIZ = new C82068WIu();
    public final C62822Ol8 LJIIIZ = C221108m2.LIZIZ(new AqS164S0100000_14(this, 445));
    public final boolean LJIIJ = true;

    public final void LJ() {
        if (!((Boolean) this.LJIIIZ.getValue()).booleanValue()) {
            return;
        }
        C82068WIu c82068WIu = this.LIZ;
        c82068WIu.LIZ = false;
        c82068WIu.LJ = false;
        c82068WIu.LIZJ = false;
        c82068WIu.LIZLLL = false;
        c82068WIu.LJIIIIZZ = false;
        c82068WIu.LJII = false;
        c82068WIu.LJFF = false;
        c82068WIu.LJI = false;
        c82068WIu.getClass();
    }

    public final boolean LJFF(boolean z) {
        ShortVideoContext shortVideoContext = this.LJ;
        if (shortVideoContext != null) {
            if (!o.LJ(shortVideoContext.enterFrom, "effect_qr_scan")) {
                InterfaceC82086WJm interfaceC82086WJm = this.LIZIZ;
                if (interfaceC82086WJm != null) {
                    InterfaceC82128WLc H1 = interfaceC82086WJm.H1();
                    InterfaceC82086WJm interfaceC82086WJm2 = this.LIZIZ;
                    if (interfaceC82086WJm2 != null) {
                        if (H1.LIZIZ(interfaceC82086WJm2.rX().getCameraController(), z)) {
                            return true;
                        }
                    } else {
                        o.LJIJI("cameraApiComponent");
                        throw null;
                    }
                } else {
                    o.LJIJI("cameraApiComponent");
                    throw null;
                }
            }
            return false;
        }
        o.LJIJI("shortVideoContext");
        throw null;
    }

    public static void LJII(C82622Wbi c82622Wbi, C81975WFf c81975WFf) {
        if (L2L.LIZ(c82622Wbi)) {
            ((C1EP) c82622Wbi.LJ(C1EP.class, null)).m3(InterfaceC82062WIo.class, new AqS180S0100000_14(c81975WFf, 357));
            return;
        }
        C0I6 c0i6 = (C0I6) c82622Wbi.LJIIIIZZ(null, InterfaceC82062WIo.class);
        if (c0i6 == null) {
            return;
        }
        ((InterfaceC82062WIo) c0i6).LL(c81975WFf);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIIIZZ(C82622Wbi c82622Wbi, WID wid) {
        int i;
        boolean z = this.LJI;
        ActivityC45651qj activityC45651qj = this.LJFF;
        if (activityC45651qj != null) {
            if (z == V1B.LJZL(activityC45651qj)) {
                return;
            }
            ActivityC45651qj activityC45651qj2 = this.LJFF;
            if (activityC45651qj2 != null) {
                this.LJI = V1B.LJZL(activityC45651qj2);
                for (C81975WFf c81975WFf : C47261Igj.LJJIJIIJI(wid.LJIIJJI(), wid.LJIILJJIL(), wid.LJ.getValue(), wid.LJFF.getValue(), wid.LJIIJ(), wid.LJII.getValue(), wid.LIZLLL(), wid.LJIIIIZZ(), wid.LJIJ(), wid.LJ(), wid.LJIIL.getValue(), wid.LJIILLIIL(), wid.LJII(), wid.LJIIL(), wid.LJFF(), wid.LJI(), wid.LJIILL(), wid.LJIJJLI.getValue())) {
                    boolean z2 = this.LJI;
                    c81975WFf.LJZI = z2;
                    if (z2) {
                        i = c81975WFf.LJZL;
                    } else {
                        i = -1;
                    }
                    c81975WFf.LJLLLLLL = i;
                    LJII(c82622Wbi, c81975WFf);
                }
                return;
            }
            o.LJIJI("activity");
            throw null;
        }
        o.LJIJI("activity");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x039d, code lost:
    
        if (r5 != null) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x03c5, code lost:
    
        if (r3 != 2) goto L206;
     */
    /* JADX WARN: Removed duplicated region for block: B:211:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x022c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C82099WJz LIZ(X.WMH r30, X.C82622Wbi r31, X.InterfaceC82069WIv r32) {
        /*
            Method dump skipped, instructions count: 1183
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82064WIq.LIZ(X.WMH, X.Wbi, X.WIv):X.WJz");
    }

    public final void LIZIZ(C82622Wbi c82622Wbi, List<? extends C81975WFf> list, List<? extends C81975WFf> list2) {
        if (L2L.LIZ(c82622Wbi)) {
            ((C1EP) c82622Wbi.LJ(C1EP.class, null)).m3(InterfaceC82062WIo.class, new AqS118S0300000_14(list, list2, this, 8));
            return;
        }
        C0I6 c0i6 = (C0I6) c82622Wbi.LJIIIIZZ(null, InterfaceC82062WIo.class);
        if (c0i6 == null) {
            return;
        }
        InterfaceC82062WIo interfaceC82062WIo = (InterfaceC82062WIo) c0i6;
        if (list != null) {
            interfaceC82062WIo.a8(list);
        }
        if (list2 != null) {
            interfaceC82062WIo.t1(list2);
        }
        ActivityC45651qj activityC45651qj = this.LJFF;
        if (activityC45651qj != null) {
            ShortVideoContext shortVideoContext = this.LJ;
            if (shortVideoContext != null) {
                C82068WIu c82068WIu = this.LIZ;
                interfaceC82062WIo.uK();
                interfaceC82062WIo.LJLLLL(WJZ.LIZLLL(activityC45651qj, shortVideoContext, c82068WIu, interfaceC82062WIo.getItemCount()));
                return;
            }
            o.LJIJI("shortVideoContext");
            throw null;
        }
        o.LJIJI("activity");
        throw null;
    }

    public final void LIZJ(C82622Wbi c82622Wbi, WID wid, boolean z) {
        this.LIZ.LJ = true;
        ArrayList arrayList = new ArrayList();
        ShortVideoContext shortVideoContext = this.LJ;
        if (shortVideoContext != null) {
            if (!shortVideoContext.LJJIJIIJI()) {
                MusicService.LJJLIIIJJI().LJIJJ();
            }
            LIZIZ(c82622Wbi, arrayList, null);
            return;
        }
        o.LJIJI("shortVideoContext");
        throw null;
    }

    public final void LJI(C82622Wbi c82622Wbi, WID wid, boolean z) {
        int i;
        if (C1E5.LJII(this.LIZ)) {
            C81975WFf LJII = wid.LJII();
            if (z) {
                i = R.raw.icon_camera_flash_fill;
            } else {
                i = R.raw.icon_camera_flash_slash_fill;
            }
            LJII.LJLJI = i;
            LJII(c82622Wbi, LJII);
        }
    }

    public static final void LIZLLL(C82064WIq c82064WIq, C82622Wbi c82622Wbi, WID wid, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, long j) {
        if (C53557L0f.LIZ()) {
            SafeHandler safeHandler = c82064WIq.LJIIIIZZ;
            if (safeHandler != null) {
                safeHandler.postDelayed(new ARunnableS17S0400000_14(wid, interfaceC65784Pro, c82622Wbi, c82064WIq, 3), j);
                return;
            } else {
                o.LJIJI("safeHandler");
                throw null;
            }
        }
        interfaceC65784Pro.invoke();
        C81975WFf LJIILJJIL = wid.LJIILJJIL();
        c82064WIq.getClass();
        LJII(c82622Wbi, LJIILJJIL);
    }
}

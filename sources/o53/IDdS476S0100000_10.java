package o53;

import X.AbstractC62156OaO;
import X.C36922EeM;
import X.C58655N0h;
import X.C58704N2e;
import X.C61397O7t;
import X.C62180Oam;
import X.C62186Oas;
import X.C62189Oav;
import X.C62198Ob4;
import X.C78983UzD;
import X.InterfaceC81599W0t;
import X.InterfaceC81841WAb;
import X.O89;
import X.OA5;
import X.OA8;
import X.OPX;
import X.T55;
import X.W4V;
import X.X1D;
import android.graphics.drawable.Animatable;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.music.ui.widget.ThirdMusicViewHolder;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class IDdS476S0100000_10 extends W4V {
    public final int $t;
    public Object l0;

    public static final void LIZIZ$0(IDdS476S0100000_10 iDdS476S0100000_10, String str, Throwable th) {
    }

    public static final void LIZJ$0(IDdS476S0100000_10 iDdS476S0100000_10, String str) {
    }

    public static final void LJ$1(IDdS476S0100000_10 iDdS476S0100000_10, String str, Throwable th) {
    }

    public static final void LJ$2(IDdS476S0100000_10 iDdS476S0100000_10, String str, Throwable th) {
    }

    @Override // X.W4V, X.W4Z
    public final void LIZIZ(String str, Throwable th) {
        switch (this.$t) {
            case 7:
                LIZIZ$0(this, str, th);
                return;
            default:
                super.LIZIZ(str, th);
                return;
        }
    }

    @Override // X.W4V, X.W4Z
    public final void LIZJ(String str) {
        switch (this.$t) {
            case 5:
                LIZJ$0(this, str);
                return;
            default:
                super.LIZJ(str);
                return;
        }
    }

    @Override // X.W4V, X.W4Z
    public final void LIZLLL(Object obj, String str) {
        switch (this.$t) {
            case 2:
                LIZLLL$0(this, obj, str);
                return;
            case 3:
            case 6:
            case 8:
            default:
                super.LIZLLL(obj, str);
                return;
            case 4:
                LIZLLL$1(this, obj, str);
                return;
            case 5:
                LIZLLL$2(this, obj, str);
                return;
            case 7:
                LIZLLL$3(this, obj, str);
                return;
            case 9:
                LIZLLL$4(this, obj, str);
                return;
        }
    }

    @Override // X.W4V, X.W4Z
    public final void LJ(String str, Throwable th) {
        switch (this.$t) {
            case 1:
                LJ$0(this, str, th);
                return;
            case 5:
                LJ$1(this, str, th);
                return;
            case 7:
                LJ$2(this, str, th);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                LJ$3(this, str, th);
                return;
            default:
                super.LJ(str, th);
                return;
        }
    }

    @Override // X.W4V, X.W4Z
    public final void LJFF(String str, Object obj, Animatable animatable) {
        switch (this.$t) {
            case 0:
                LJFF$0(this, str, obj, animatable);
                return;
            case 1:
                LJFF$1(this, str, obj, animatable);
                return;
            case 2:
                LJFF$2(this, str, obj, animatable);
                return;
            case 3:
                LJFF$3(this, str, obj, animatable);
                return;
            case 4:
                LJFF$4(this, str, obj, animatable);
                return;
            case 5:
                LJFF$5(this, str, obj, animatable);
                return;
            case 6:
                LJFF$6(this, str, obj, animatable);
                return;
            case 7:
                LJFF$7(this, str, obj, animatable);
                return;
            case 8:
                LJFF$8(this, str, obj, animatable);
                return;
            case 9:
                LJFF$9(this, str, obj, animatable);
                return;
            case 10:
                LJFF$10(this, str, obj, animatable);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                LJFF$11(this, str, obj, animatable);
                return;
            default:
                super.LJFF(str, obj, animatable);
                return;
        }
    }

    public IDdS476S0100000_10(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZLLL$0(IDdS476S0100000_10 iDdS476S0100000_10, Object obj, String id) {
        InterfaceC81599W0t interfaceC81599W0t = (InterfaceC81599W0t) obj;
        o.LJIIIZ(id, "id");
        C62186Oas c62186Oas = (C62186Oas) iDdS476S0100000_10.l0;
        c62186Oas.getClass();
        if (interfaceC81599W0t != null) {
            c62186Oas.setAspectRatio(interfaceC81599W0t.getWidth() / interfaceC81599W0t.getHeight());
            c62186Oas.invalidateOutline();
        }
    }

    public static final void LIZLLL$1(IDdS476S0100000_10 iDdS476S0100000_10, Object obj, String id) {
        o.LJIIIZ(id, "id");
        ((C62189Oav) iDdS476S0100000_10.l0).LIZIZ((InterfaceC81599W0t) obj);
    }

    public static final void LIZLLL$3(IDdS476S0100000_10 iDdS476S0100000_10, Object obj, String str) {
        InterfaceC81599W0t interfaceC81599W0t = (InterfaceC81599W0t) obj;
        C62186Oas c62186Oas = ((T55) iDdS476S0100000_10.l0).LJI;
        if (c62186Oas != null && interfaceC81599W0t != null) {
            c62186Oas.setAspectRatio(interfaceC81599W0t.getWidth() / interfaceC81599W0t.getHeight());
            c62186Oas.invalidateOutline();
        }
    }

    public static final void LIZLLL$4(IDdS476S0100000_10 iDdS476S0100000_10, Object obj, String id) {
        InterfaceC81599W0t interfaceC81599W0t = (InterfaceC81599W0t) obj;
        o.LJIIIZ(id, "id");
        C62189Oav c62189Oav = ((ThirdMusicViewHolder) iDdS476S0100000_10.l0).LJLIL;
        if (c62189Oav != null) {
            c62189Oav.LIZIZ(interfaceC81599W0t);
            ((ThirdMusicViewHolder) iDdS476S0100000_10.l0).L();
        } else {
            o.LJIJI("cover");
            throw null;
        }
    }

    public static final void LJ$0(IDdS476S0100000_10 iDdS476S0100000_10, String str, Throwable th) {
        String str2;
        OA5 oa5 = (OA5) iDdS476S0100000_10.l0;
        if (th != null) {
            str2 = th.getMessage();
        } else {
            str2 = null;
        }
        oa5.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("guide view show fail: ");
        if (str2 == null) {
            str2 = "";
        }
        LIZ.append(str2);
        X1D.LIZIZ(LIZ);
    }

    public static final void LJ$3(IDdS476S0100000_10 iDdS476S0100000_10, String str, Throwable th) {
        ((InterfaceC81841WAb) iDdS476S0100000_10.l0).LIZJ(null);
    }

    public static final /* bridge */ /* synthetic */ void LIZLLL$2(IDdS476S0100000_10 iDdS476S0100000_10, Object obj, String str) {
    }

    public static final void LJFF$0(IDdS476S0100000_10 iDdS476S0100000_10, String str, Object obj, Animatable animatable) {
        if (animatable != null) {
            try {
                AnimatedDrawable2 animatedDrawable2 = (AnimatedDrawable2) animatable;
                animatedDrawable2.LJFF(new OA8(animatedDrawable2.LJLJI));
                animatedDrawable2.LJI(new O89(iDdS476S0100000_10));
                animatable.start();
            } catch (Throwable th) {
                C78983UzD.LJIIZILJ(th);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("frescoOpenGifSplashError: e = ");
                LIZ.append(th.toString());
                C36922EeM.LJ(X1D.LIZIZ(LIZ));
                C36922EeM.LJFF(th);
            }
        }
    }

    public static final void LJFF$1(IDdS476S0100000_10 iDdS476S0100000_10, String str, Object obj, Animatable animatable) {
        AwemeRawAd awemeRawAd;
        try {
            OA5 oa5 = (OA5) iDdS476S0100000_10.l0;
            if (oa5.LJLL) {
                if (animatable != null && (animatable instanceof AnimatedDrawable2)) {
                    oa5.LJLLI = true;
                    Aweme aweme = oa5.LJLJJI;
                    if (aweme != null) {
                        awemeRawAd = aweme.getAwemeRawAd();
                    } else {
                        awemeRawAd = null;
                    }
                    C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "othershow", awemeRawAd);
                    LIZLLL.LIZJ("interactive_gesture", "refer");
                    LIZLLL.LJI();
                    OA5 oa52 = (OA5) iDdS476S0100000_10.l0;
                    oa52.LJLJL = (AnimatedDrawable2) animatable;
                    oa52.LJIIJ((AnimatedDrawable2) animatable);
                    return;
                }
                oa5.LJII();
            }
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            C36922EeM.LJFF(th);
            OA5 oa53 = (OA5) iDdS476S0100000_10.l0;
            String message = th.getMessage();
            oa53.getClass();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("guide view show fail: ");
            if (message == null) {
                message = "";
            }
            LIZ.append(message);
            X1D.LIZIZ(LIZ);
        }
    }

    public static final void LJFF$10(IDdS476S0100000_10 iDdS476S0100000_10, String str, Object obj, Animatable animatable) {
        if (animatable != null) {
            try {
                AnimatedDrawable2 animatedDrawable2 = (AnimatedDrawable2) animatable;
                animatedDrawable2.LJFF(new OA8(animatedDrawable2.LJLJI));
                animatedDrawable2.LJI(new C61397O7t(iDdS476S0100000_10));
                animatable.start();
            } catch (Throwable th) {
                C78983UzD.LJIIZILJ(th);
            }
        }
    }

    public static final void LJFF$11(IDdS476S0100000_10 iDdS476S0100000_10, String str, Object obj, Animatable animatable) {
        if (animatable instanceof AnimatedDrawable2) {
            AnimatedDrawable2 animatedDrawable2 = (AnimatedDrawable2) animatable;
            animatedDrawable2.LJI((InterfaceC81841WAb) iDdS476S0100000_10.l0);
            animatedDrawable2.start();
        }
    }

    public static final void LJFF$2(IDdS476S0100000_10 iDdS476S0100000_10, String id, Object obj, Animatable animatable) {
        InterfaceC81599W0t interfaceC81599W0t = (InterfaceC81599W0t) obj;
        o.LJIIIZ(id, "id");
        C62186Oas c62186Oas = (C62186Oas) iDdS476S0100000_10.l0;
        c62186Oas.getClass();
        if (interfaceC81599W0t != null) {
            c62186Oas.setAspectRatio(interfaceC81599W0t.getWidth() / interfaceC81599W0t.getHeight());
            c62186Oas.invalidateOutline();
        }
    }

    public static final void LJFF$3(IDdS476S0100000_10 iDdS476S0100000_10, String str, Object obj, Animatable animatable) {
        ((C62180Oam) iDdS476S0100000_10.l0).LJLILLLLZI = true;
    }

    public static final void LJFF$4(IDdS476S0100000_10 iDdS476S0100000_10, String id, Object obj, Animatable animatable) {
        o.LJIIIZ(id, "id");
        ((C62189Oav) iDdS476S0100000_10.l0).LIZIZ((InterfaceC81599W0t) obj);
    }

    public static final void LJFF$5(IDdS476S0100000_10 iDdS476S0100000_10, String str, Object obj, Animatable animatable) {
        ((OPX) iDdS476S0100000_10.l0).getClass();
    }

    public static final void LJFF$6(IDdS476S0100000_10 iDdS476S0100000_10, String str, Object obj, Animatable animatable) {
        ((AbstractC62156OaO) iDdS476S0100000_10.l0).LJLJJL = true;
    }

    public static final void LJFF$7(IDdS476S0100000_10 iDdS476S0100000_10, String str, Object obj, Animatable animatable) {
        InterfaceC81599W0t interfaceC81599W0t = (InterfaceC81599W0t) obj;
        C62186Oas c62186Oas = ((T55) iDdS476S0100000_10.l0).LJI;
        if (c62186Oas != null && interfaceC81599W0t != null) {
            c62186Oas.setAspectRatio(interfaceC81599W0t.getWidth() / interfaceC81599W0t.getHeight());
            c62186Oas.invalidateOutline();
        }
    }

    public static final void LJFF$8(IDdS476S0100000_10 iDdS476S0100000_10, String str, Object obj, Animatable animatable) {
        ((C62198Ob4) iDdS476S0100000_10.l0).LJLILLLLZI = true;
    }

    public static final void LJFF$9(IDdS476S0100000_10 iDdS476S0100000_10, String id, Object obj, Animatable animatable) {
        InterfaceC81599W0t interfaceC81599W0t = (InterfaceC81599W0t) obj;
        o.LJIIIZ(id, "id");
        C62189Oav c62189Oav = ((ThirdMusicViewHolder) iDdS476S0100000_10.l0).LJLIL;
        if (c62189Oav != null) {
            c62189Oav.LIZIZ(interfaceC81599W0t);
            ((ThirdMusicViewHolder) iDdS476S0100000_10.l0).L();
        } else {
            o.LJIJI("cover");
            throw null;
        }
    }
}

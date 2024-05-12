package Y;

import X.C16330kX;
import X.C6QQ;
import X.C80077Vbl;
import X.C81658W3a;
import X.C82000WGe;
import X.C82011WGp;
import X.C82313WSf;
import X.C82946Wgw;
import X.C82948Wgy;
import X.C82949Wgz;
import X.C83050Wic;
import X.C83093WjJ;
import X.C83101WjR;
import X.C83209WlB;
import X.EnumC82314WSg;
import X.InterfaceC65784Pro;
import X.InterfaceC81662W3e;
import X.InterfaceC82311WSd;
import X.InterfaceC82947Wgx;
import X.OSZ;
import X.TKH;
import X.WNI;
import X.WNT;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class ALAdapterS11S0200000_14 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 8:
                onAnimationCancel$0(this, animator);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                return;
            case 1:
                onAnimationEnd$1(this, animator);
                return;
            case 2:
                onAnimationEnd$2(this, animator);
                return;
            case 3:
                onAnimationEnd$3(this, animator);
                return;
            case 4:
                onAnimationEnd$4(this, animator);
                return;
            case 5:
                onAnimationEnd$5(this, animator);
                return;
            case 6:
                onAnimationEnd$6(this, animator);
                return;
            case 7:
                onAnimationEnd$7(this, animator);
                return;
            case 8:
                onAnimationEnd$8(this, animator);
                return;
            case 9:
                onAnimationEnd$9(this, animator);
                return;
            case 10:
                onAnimationEnd$10(this, animator);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onAnimationEnd$11(this, animator);
                return;
            case 12:
                onAnimationEnd$12(this, animator);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onAnimationEnd$13(this, animator);
                return;
            case 14:
                onAnimationEnd$14(this, animator);
                return;
            case 15:
                onAnimationEnd$15(this, animator);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                return;
            case 1:
            default:
                super.onAnimationStart(animator);
                return;
            case 2:
                onAnimationStart$1(this, animator);
                return;
        }
    }

    public static final void onAnimationCancel$0(ALAdapterS11S0200000_14 aLAdapterS11S0200000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationCancel(animation);
        ((View) aLAdapterS11S0200000_14.l0).dispatchTouchEvent(C80077Vbl.LIZIZ(((Number) ((OSZ) aLAdapterS11S0200000_14.l1).getFirst()).floatValue(), ((Number) ((OSZ) aLAdapterS11S0200000_14.l1).getSecond()).floatValue(), 3));
    }

    public static final void onAnimationEnd$0(ALAdapterS11S0200000_14 aLAdapterS11S0200000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        InterfaceC82311WSd interfaceC82311WSd = ((C82313WSf) aLAdapterS11S0200000_14.l0).LIZIZ;
        if (interfaceC82311WSd != null) {
            interfaceC82311WSd.LIZIZ((EnumC82314WSg) aLAdapterS11S0200000_14.l1);
        }
        ((C82313WSf) aLAdapterS11S0200000_14.l0).LIZJ = false;
    }

    public static final void onAnimationEnd$1(ALAdapterS11S0200000_14 aLAdapterS11S0200000_14, Animator animator) {
        ((C82946Wgw) aLAdapterS11S0200000_14.l1).LJLIL.LJII();
        ((C82946Wgw) aLAdapterS11S0200000_14.l1).LJII();
        ((InterfaceC82947Wgx) aLAdapterS11S0200000_14.l0).LJII();
    }

    public static final void onAnimationEnd$10(ALAdapterS11S0200000_14 aLAdapterS11S0200000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((C82011WGp) aLAdapterS11S0200000_14.l0).LLD = null;
        ((InterfaceC65784Pro) aLAdapterS11S0200000_14.l1).invoke();
    }

    public static final void onAnimationEnd$11(ALAdapterS11S0200000_14 aLAdapterS11S0200000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((C82011WGp) aLAdapterS11S0200000_14.l0).LLD = null;
        ((InterfaceC65784Pro) aLAdapterS11S0200000_14.l1).invoke();
    }

    public static final void onAnimationEnd$12(ALAdapterS11S0200000_14 aLAdapterS11S0200000_14, Animator animator) {
        ((C82948Wgy) aLAdapterS11S0200000_14.l1).LJLIL.LJII();
        ((C82948Wgy) aLAdapterS11S0200000_14.l1).LJII();
        ((InterfaceC82947Wgx) aLAdapterS11S0200000_14.l0).LJII();
    }

    public static final void onAnimationEnd$13(ALAdapterS11S0200000_14 aLAdapterS11S0200000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C6QQ.LIZ(new AqS164S0100000_14(aLAdapterS11S0200000_14, 522));
    }

    public static final void onAnimationEnd$14(ALAdapterS11S0200000_14 aLAdapterS11S0200000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        TKH tkh = ((C83101WjR) aLAdapterS11S0200000_14.l0).LJLIL;
        if (tkh != null) {
            tkh.LJII();
        }
        InterfaceC82947Wgx interfaceC82947Wgx = (InterfaceC82947Wgx) aLAdapterS11S0200000_14.l1;
        if (interfaceC82947Wgx != null) {
            interfaceC82947Wgx.LJII();
        }
    }

    public static final void onAnimationEnd$15(ALAdapterS11S0200000_14 aLAdapterS11S0200000_14, Animator animator) {
        super.onAnimationEnd(animator);
        ((WNT) aLAdapterS11S0200000_14.l0).LIZ(1.0f);
        ((WNI) aLAdapterS11S0200000_14.l1).LIZLLL();
    }

    public static final void onAnimationEnd$2(ALAdapterS11S0200000_14 aLAdapterS11S0200000_14, Animator animator) {
        ((AnimatorSet) aLAdapterS11S0200000_14.l0).start();
        InterfaceC81662W3e interfaceC81662W3e = ((C81658W3a) aLAdapterS11S0200000_14.l1).LJLIL;
        if (interfaceC81662W3e != null) {
            interfaceC81662W3e.LIZIZ(1);
        }
    }

    public static final void onAnimationEnd$3(ALAdapterS11S0200000_14 aLAdapterS11S0200000_14, Animator animator) {
        ((C83209WlB) aLAdapterS11S0200000_14.l1).LJLIL.LJII();
        ((C83209WlB) aLAdapterS11S0200000_14.l1).LJII();
        ((InterfaceC82947Wgx) aLAdapterS11S0200000_14.l0).LJII();
    }

    public static final void onAnimationEnd$4(ALAdapterS11S0200000_14 aLAdapterS11S0200000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (!C16330kX.LIZIZ(((C83050Wic) aLAdapterS11S0200000_14.l0).LJLJJI)) {
            return;
        }
        TKH tkh = ((C83050Wic) aLAdapterS11S0200000_14.l0).LJLIL;
        if (tkh != null) {
            tkh.LJII();
        }
        ((C83050Wic) aLAdapterS11S0200000_14.l0).LJLJI.post(new ARunnableS50S0100000_14(aLAdapterS11S0200000_14, 151));
        InterfaceC82947Wgx interfaceC82947Wgx = (InterfaceC82947Wgx) aLAdapterS11S0200000_14.l1;
        if (interfaceC82947Wgx != null) {
            interfaceC82947Wgx.LJII();
        }
    }

    public static final void onAnimationEnd$5(ALAdapterS11S0200000_14 aLAdapterS11S0200000_14, Animator animator) {
        super.onAnimationEnd(animator);
        ((C82949Wgz) aLAdapterS11S0200000_14.l1).LJLIL.LJFF();
        ((C82949Wgz) aLAdapterS11S0200000_14.l1).getClass();
        ((InterfaceC82947Wgx) aLAdapterS11S0200000_14.l0).LJFF();
    }

    public static final void onAnimationEnd$6(ALAdapterS11S0200000_14 aLAdapterS11S0200000_14, Animator animator) {
        ((C82949Wgz) aLAdapterS11S0200000_14.l1).LJLIL.LJII();
        ((C82949Wgz) aLAdapterS11S0200000_14.l1).LJII();
        ((InterfaceC82947Wgx) aLAdapterS11S0200000_14.l0).LJII();
    }

    public static final void onAnimationEnd$7(ALAdapterS11S0200000_14 aLAdapterS11S0200000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        TKH tkh = ((C83093WjJ) aLAdapterS11S0200000_14.l0).LJLIL;
        if (tkh != null) {
            tkh.LJII();
        }
        InterfaceC82947Wgx interfaceC82947Wgx = (InterfaceC82947Wgx) aLAdapterS11S0200000_14.l1;
        if (interfaceC82947Wgx != null) {
            interfaceC82947Wgx.LJII();
        }
    }

    public static final void onAnimationEnd$8(ALAdapterS11S0200000_14 aLAdapterS11S0200000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((View) aLAdapterS11S0200000_14.l0).dispatchTouchEvent(C80077Vbl.LIZIZ(((Number) ((OSZ) aLAdapterS11S0200000_14.l1).getFirst()).floatValue(), ((Number) ((OSZ) aLAdapterS11S0200000_14.l1).getSecond()).floatValue(), 1));
    }

    public static final void onAnimationEnd$9(ALAdapterS11S0200000_14 aLAdapterS11S0200000_14, Animator animator) {
        super.onAnimationEnd(animator);
        ((C82000WGe) aLAdapterS11S0200000_14.l1).LLD = null;
        ((InterfaceC65784Pro) aLAdapterS11S0200000_14.l0).invoke();
    }

    public static final void onAnimationStart$0(ALAdapterS11S0200000_14 aLAdapterS11S0200000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C82313WSf) aLAdapterS11S0200000_14.l0).LIZJ = true;
    }

    public static final void onAnimationStart$1(ALAdapterS11S0200000_14 aLAdapterS11S0200000_14, Animator animator) {
        InterfaceC81662W3e interfaceC81662W3e = ((C81658W3a) aLAdapterS11S0200000_14.l1).LJLIL;
        if (interfaceC81662W3e != null) {
            interfaceC81662W3e.LIZIZ(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ALAdapterS11S0200000_14(Object obj, View view, OSZ<Float, Float> osz) {
        this.$t = osz;
        this.l0 = obj;
        this.l1 = view;
    }

    public ALAdapterS11S0200000_14(WNI wni, WNT wnt, boolean z, int i) {
        this.$t = i;
        this.l1 = wni;
        this.l0 = wnt;
    }
}

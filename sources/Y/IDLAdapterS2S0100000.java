package Y;

import X.AbstractC03490Bt;
import X.BZI;
import X.C0TX;
import X.C11040c0;
import X.C15380j0;
import X.C16880lQ;
import X.C17280m4;
import X.C1HK;
import X.C1VL;
import X.C278217i;
import X.C28787BRn;
import X.C29306Beo;
import X.C29701Eo;
import X.C35641aa;
import X.C42681lw;
import X.C45161pw;
import X.C73943T0h;
import X.InterfaceC005200i;
import X.InterfaceC05930Ld;
import X.InterfaceC65784Pro;
import X.X1D;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.bytedance.android.live.commentcombo.view.ExtendedCommentComboTrayWidget;
import com.bytedance.android.live.effect.api.OnFilterSelectedEvent;
import com.bytedance.android.live.effect.music.LiveBGMFragment;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public class IDLAdapterS2S0100000 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 1:
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
            case 7:
            default:
                super.onAnimationEnd(animator);
                return;
            case 8:
                onAnimationEnd$6(this, animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 6:
                onAnimationStart$0(this, animator);
                return;
            case 7:
                onAnimationStart$1(this, animator);
                return;
            case 8:
            default:
                super.onAnimationStart(animator);
                return;
            case 9:
                onAnimationStart$2(this, animator);
                return;
        }
    }

    public IDLAdapterS2S0100000(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationCancel$0(IDLAdapterS2S0100000 iDLAdapterS2S0100000, Animator animator) {
        C45161pw c45161pw = (C45161pw) iDLAdapterS2S0100000.l0;
        c45161pw.LLF = null;
        c45161pw.LJLLI = false;
    }

    public static final void onAnimationEnd$0(IDLAdapterS2S0100000 iDLAdapterS2S0100000, Animator animator) {
        ((C278217i) iDLAdapterS2S0100000.l0).LIZJ.removeAllUpdateListeners();
        C16880lQ.LJLJL(((C278217i) iDLAdapterS2S0100000.l0).LIZJ);
        C278217i c278217i = (C278217i) iDLAdapterS2S0100000.l0;
        c278217i.LIZJ = null;
        InterfaceC005200i interfaceC005200i = c278217i.LIZIZ.LJIILIIL;
        if (interfaceC005200i != null) {
            interfaceC005200i.LJFF();
        }
    }

    public static final void onAnimationEnd$1(IDLAdapterS2S0100000 iDLAdapterS2S0100000, Animator animator) {
        C45161pw c45161pw = (C45161pw) iDLAdapterS2S0100000.l0;
        c45161pw.LLF = null;
        c45161pw.LJLLI = false;
    }

    public static final void onAnimationEnd$2(IDLAdapterS2S0100000 iDLAdapterS2S0100000, Animator animator) {
        ((AbstractC03490Bt) iDLAdapterS2S0100000.l0).LJIIL();
        C16880lQ.LJLJLJ(iDLAdapterS2S0100000, animator);
    }

    public static final void onAnimationEnd$3(IDLAdapterS2S0100000 iDLAdapterS2S0100000, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C29306Beo.LJI(((LiveBGMFragment) iDLAdapterS2S0100000.l0)._$_findCachedViewById(R.id.akg));
    }

    public static final void onAnimationEnd$4(IDLAdapterS2S0100000 iDLAdapterS2S0100000, Animator animation) {
        o.LJIIIZ(animation, "animation");
        InterfaceC05930Ld interfaceC05930Ld = ((C1HK) iDLAdapterS2S0100000.l0).LJLIL;
        if (interfaceC05930Ld != null) {
            o.LJI(interfaceC05930Ld);
            interfaceC05930Ld.LIZ();
        }
        C1HK.LJLJI = false;
        ((C1HK) iDLAdapterS2S0100000.l0).getClass();
    }

    public static final void onAnimationEnd$5(IDLAdapterS2S0100000 iDLAdapterS2S0100000, Animator animation) {
        int i;
        String str;
        String str2;
        DataChannel dataChannel;
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C1VL c1vl = C1VL.LIZ;
        if (C15380j0.LJIIZILJ()) {
            if (C1VL.LJFF) {
                C1VL.LJIIIZ.LJ();
            } else {
                C1VL.LJIIIZ.LIZLLL();
            }
        } else if (C1VL.LJFF) {
            C1VL.LJIIIZ.LIZLLL();
        } else {
            C1VL.LJIIIZ.LJ();
        }
        LiveEffect liveEffect = C1VL.LJII;
        if (liveEffect != null) {
            C42681lw c42681lw = C1VL.LIZIZ;
            String panelKey = C1VL.LIZJ;
            o.LJIIIIZZ(panelKey, "panelKey");
            c42681lw.LJIILL(liveEffect, panelKey);
        }
        LiveEffect liveEffect2 = C1VL.LJI;
        if (liveEffect2 != null && (dataChannel = C1VL.LJIIJJI) != null) {
            dataChannel.qv0(OnFilterSelectedEvent.class, liveEffect2);
        }
        C1VL.LJII = C1VL.LJI;
        if (!C15380j0.LJIIZILJ() ? !C1VL.LJFF : C1VL.LJFF) {
            i = 2;
        } else {
            i = 1;
        }
        C0TX.LIZ.LIZJ("ComposerFilterSlideHelper");
        C0TX.LIZLLL = "removePreviousAndUpdateCurrentFilter";
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("current: ");
        LIZ.append(C1VL.LJII);
        LIZ.append(" newFilter: ");
        LIZ.append(C1VL.LJI);
        C0TX.LIZIZ(X1D.LIZIZ(LIZ));
        C73943T0h.LIZ().LIZIZ(new C11040c0(i));
        BZI LIZ2 = C28787BRn.LIZ("livesdk_live_take_filter_slide");
        LIZ2.LJIILLIIL(C1VL.LJIIJJI);
        Room LJJIJLIJ = C29306Beo.LJJIJLIJ(C1VL.LJIIJJI);
        if (LJJIJLIJ == null || (str = C17280m4.LIZ(LJJIJLIJ)) == null) {
            str = "";
        }
        LIZ2.LJIJJ(str, "room_id");
        LiveEffect liveEffect3 = C1VL.LJII;
        if (liveEffect3 != null) {
            str2 = liveEffect3.getFilterId();
        } else {
            str2 = null;
        }
        LIZ2.LJIJJ(str2, "filter_id");
        LIZ2.LJIL("filter_value", Float.valueOf(C1VL.LJIIIIZZ.LJII(C1VL.LJII)));
        LIZ2.LJIJJ(Integer.valueOf(C1VL.LJIIL ? 1 : 0), "is_beauty_panel_show");
        LIZ2.LJJIIJZLJL();
        c1vl.LIZIZ(null, false);
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) iDLAdapterS2S0100000.l0;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void onAnimationEnd$6(IDLAdapterS2S0100000 iDLAdapterS2S0100000, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((ExtendedCommentComboTrayWidget) iDLAdapterS2S0100000.l0).hide();
    }

    public static final void onAnimationStart$0(IDLAdapterS2S0100000 iDLAdapterS2S0100000, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C29701Eo c29701Eo = ((C35641aa) iDLAdapterS2S0100000.l0).LJLLI;
        if (c29701Eo == null) {
            return;
        }
        c29701Eo.setVisibility(8);
    }

    public static final void onAnimationStart$1(IDLAdapterS2S0100000 iDLAdapterS2S0100000, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C29701Eo c29701Eo = ((C35641aa) iDLAdapterS2S0100000.l0).LJLL;
        if (c29701Eo == null) {
            return;
        }
        c29701Eo.setVisibility(8);
    }

    public static final void onAnimationStart$2(IDLAdapterS2S0100000 iDLAdapterS2S0100000, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((ExtendedCommentComboTrayWidget) iDLAdapterS2S0100000.l0).show();
    }
}

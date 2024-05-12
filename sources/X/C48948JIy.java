package X;

import Y.ACListenerS28S0100000_8;
import Y.ACallableS111S0100000_8;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.IDqS433S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.JIy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48948JIy extends JNU implements JIG, InterfaceC49148JQq {
    public static final C48946JIw LJZ = new C48946JIw(C48947JIx.LIZJ);
    public final C48946JIw LJLJL;
    public final InterfaceC88473Ynt<View, Integer, Aweme, C76800UCe> LJLJLJ;
    public final C48936JIm LJLJLLL;
    public final FrameLayout LJLL;
    public final SmartImageView LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public JON LJLLJ;
    public final View LJLLL;
    public final View LJLLLL;
    public Aweme LJLLLLLL;
    public final C48939JIp LJLZ;

    public C48948JIy() {
        throw null;
    }

    @Override // X.InterfaceC49148JQq
    public final Boolean LLFFF() {
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public final boolean LLIIII() {
        return true;
    }

    @Override // X.InterfaceC49148JQq
    public final View getDetectView() {
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public final InterfaceC46334IGk getPreload() {
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public final InterfaceC49137JQf getPriority() {
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public final boolean isPlaying() {
        return false;
    }

    @Override // X.InterfaceC49148JQq
    public final void LLLLLIL() {
        this.LJLJLLL.getLiveCore().LJFF();
    }

    @Override // X.InterfaceC49148JQq
    public final View LLLLZLLIL() {
        return this.itemView;
    }

    @Override // X.JIG
    public final void LL(JIB jib) {
        this.LJLJLLL.getLiveCore().getDataProvider().LIZ = new JIF(this, jib);
    }

    public final void Q(J1M j1m) {
        JON jon;
        JYH jyh = JYH.LIZIZ;
        if (jyh.LJIIJ()) {
            J1C.LIZ = false;
            jyh.LIZLLL("general_search", j1m, J1O.STYLE_NO_BUTTON);
        }
        J1C.LIZJ(!J1C.LIZIZ() ? 1 : 0);
        this.LJLJLLL.getLiveCore().setMute(J1C.LIZ(C46314IFq.LIZIZ() ? 1 : 0, 0, this.LJLLLLLL));
        JHK jhk = EnumC48916JHs.Companion;
        J1C.LJ();
        int i = J1C.LIZIZ;
        jhk.getClass();
        EnumC48916JHs LIZ = JHK.LIZ(i);
        if (LIZ != null && (jon = this.LJLLJ) != null) {
            jon.LIZ(LIZ, false);
        }
    }

    public final void T(View view) {
        Aweme aweme = this.LJLLLLLL;
        if (aweme == null || C6ZT.LIZ(view) || JTG.LIZIZ()) {
            return;
        }
        this.itemView.getContext();
        if (C2NU.LIZ.LIZIZ()) {
            if (!((RBX) HG3.LJIILL()).isLogin()) {
                Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
                if (LJIIIIZZ == null) {
                    return;
                }
                InterfaceC65895Ptb LJIIIIZZ2 = HG3.LJIIIIZZ();
                C78450Uqc c78450Uqc = new C78450Uqc();
                c78450Uqc.LIZ = LJIIIIZZ;
                c78450Uqc.LJ = new C48949JIz(this, aweme, view);
                C40925G4j.LIZ(c78450Uqc, LJIIIIZZ2);
                return;
            }
            P(view, aweme);
            return;
        }
        C5S1 c5s1 = new C5S1(this.itemView.getContext());
        c5s1.LIZJ(R.string.img);
        c5s1.LJ();
    }

    @Override // X.JNU, android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        C34X c34x;
        o.LJIIIZ(v, "v");
        super.onViewAttachedToWindow(v);
        JLU.LJII(this.LJLJLLL.getLiveCore());
        C49153JQv c49153JQv = this.LJLJLLL.getLiveCore().getDataProvider().LIZJ;
        if (c49153JQv != null) {
            c49153JQv.LJII(this.LJLJLLL.getLiveCore().getDataProvider().LIZLLL);
        }
        C10K.LIZJ(new ACallableS111S0100000_8(this, 22));
        InterfaceC36571c5 activity = getActivity();
        if ((activity instanceof C34X) && (c34x = (C34X) activity) != null) {
            c34x.registerActivityOnKeyDownListener(this.LJLZ);
        }
    }

    @Override // X.JNU, android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        C34X c34x;
        o.LJIIIZ(v, "v");
        super.onViewDetachedFromWindow(v);
        JLU.LJIIIIZZ(this.LJLJLLL.getLiveCore());
        InterfaceC48908JHk interfaceC48908JHk = this.LJLJLLL.getLiveCore().getDataProvider().LJ;
        if (interfaceC48908JHk != null) {
            interfaceC48908JHk.onDestroy();
        }
        C49153JQv c49153JQv = this.LJLJLLL.getLiveCore().getDataProvider().LIZJ;
        if (c49153JQv != null) {
            c49153JQv.LJIIIIZZ(this.LJLJLLL.getLiveCore().getDataProvider().LIZLLL);
        }
        InterfaceC36571c5 activity = getActivity();
        if ((activity instanceof C34X) && (c34x = (C34X) activity) != null) {
            c34x.unRegisterActivityOnKeyDownListener(this.LJLZ);
        }
    }

    @Override // X.InterfaceC49148JQq
    public final void x4(C49187JSd listener) {
        o.LJIIIZ(listener, "listener");
    }

    @Override // X.InterfaceC49148JQq
    public final void y(long j) {
        this.LJLJLLL.getLiveCore().LLLJIL();
    }

    @Override // X.InterfaceC49148JQq
    public final void z8(C49187JSd listener) {
        o.LJIIIZ(listener, "listener");
    }

    public final void P(View view, Aweme aweme) {
        JJG.LJLJLLL = aweme.getAid();
        JON jon = this.LJLLJ;
        if (jon != null) {
            jon.setVisibility(8);
        }
        InterfaceC88473Ynt<View, Integer, Aweme, C76800UCe> interfaceC88473Ynt = this.LJLJLJ;
        if (interfaceC88473Ynt != null) {
            interfaceC88473Ynt.invoke(view, Integer.valueOf(getAdapterPosition()), aweme);
        }
    }

    public C48948JIy(View view, C48946JIw c48946JIw, IDqS433S0100000_8 iDqS433S0100000_8) {
        super(view);
        boolean z;
        int i;
        ViewGroup.LayoutParams layoutParams;
        TuxTextView tuxTextView;
        ConstraintLayout constraintLayout;
        this.LJLJL = c48946JIw;
        this.LJLJLJ = iDqS433S0100000_8;
        View findViewById = this.itemView.findViewById(R.id.mzr);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.user_live_view)");
        C48936JIm c48936JIm = (C48936JIm) findViewById;
        this.LJLJLLL = c48936JIm;
        View findViewById2 = this.itemView.findViewById(R.id.mzs);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.…user_live_view_container)");
        this.LJLL = (FrameLayout) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.mzl);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.user_live_cover)");
        SmartImageView smartImageView = (SmartImageView) findViewById3;
        this.LJLLI = smartImageView;
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 651));
        View findViewById4 = this.itemView.findViewById(R.id.mzq);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.…e_video_container_layout)");
        this.LJLLL = findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.mzp);
        this.LJLLLL = findViewById5;
        this.LJLZ = new C48939JIp(this);
        View view2 = this.itemView;
        Context context = view2.getContext();
        o.LJIIIIZZ(context, "context");
        C49098JOs.LIZ.getClass();
        Integer valueOf = Integer.valueOf(C49098JOs.LIZJ());
        if (valueOf.intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = valueOf.intValue();
        } else {
            i = 2;
        }
        view2.setOutlineProvider(new C43251GyF((int) C79043V0l.LIZIZ(context, i)));
        view2.setClipToOutline(true);
        if (!c48946JIw.LIZIZ) {
            C16880lQ.LJIIJ(new ACListenerS28S0100000_8(this, 89), view2);
        }
        C48966JJq.LIZIZ(this.itemView, new AqS174S0100000_8(this, 242));
        Integer valueOf2 = Integer.valueOf(C49098JOs.LIZIZ());
        if (valueOf2.intValue() > 0) {
            float LJIIZILJ = C32151Nz.LJIIZILJ(valueOf2);
            if (findViewById5 != null) {
                C79043V0l.LJIJI(findViewById5, LJIIZILJ, LJIIZILJ, LJIIZILJ, LJIIZILJ);
            }
        }
        JJ8.LIZ.getClass();
        if (JJ8.LIZ()) {
            ViewParent parent = findViewById5 != null ? findViewById5.getParent() : null;
            if ((parent instanceof ConstraintLayout) && (constraintLayout = (ConstraintLayout) parent) != null) {
                AnonymousClass064 anonymousClass064 = new AnonymousClass064();
                anonymousClass064.LJII(constraintLayout);
                anonymousClass064.LJI(R.id.mzp, 6);
                anonymousClass064.LJIIIZ(R.id.mzp, 7, 0, 7, O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
                anonymousClass064.LIZIZ(constraintLayout);
            }
        }
        JJC.LIZ.getClass();
        if (JJC.LIZ()) {
            if ((findViewById5 instanceof TuxTextView) && (tuxTextView = (TuxTextView) findViewById5) != null) {
                tuxTextView.setTuxFont(82);
            }
            if (findViewById5 != null && (layoutParams = findViewById5.getLayoutParams()) != null) {
                layoutParams.height = C7MY.LIZIZ(16);
            }
        }
        Integer valueOf3 = Integer.valueOf(C49098JOs.LJ());
        if (valueOf3.intValue() > 0) {
            V1B.LJLJLJ(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(valueOf3.intValue()))), findViewById4);
        }
        new AqS174S0100000_8(this, 241).invoke(new C48942JIs());
        c48936JIm.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS28S0100000_8(this, 88)));
        c48936JIm.setMCoverView(smartImageView);
        c48936JIm.getLiveCore().LIZ(new AqS158S0100000_8(this, 650));
    }
}

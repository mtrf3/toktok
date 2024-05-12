package X;

import Y.ACListenerS24S0100000_4;
import android.app.Dialog;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import o3.IDaS467S0100000_4;
import o3.h0;

/* renamed from: X.ARf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26231ARf extends AbstractDialogInterfaceC26236ARk<C26227ARb> {
    public static final /* synthetic */ int LJLLLL = 0;
    public final C26227ARb LJLJLJ;
    public final View LJLJLLL;
    public final C74291TDr LJLL;
    public final ImageView LJLLI;
    public final C26233ARh LJLLILLLL;
    public boolean LJLLJ;
    public final OOQ LJLLL;

    public final void LJIIIIZZ() {
        this.LJLLJ = false;
        C16880lQ.LJIIJ(null, this.LJLJLLL);
        this.LJLLL.setCancelable(false);
    }

    public final AbstractC243009gG LJI() {
        return this.LJLLILLLL.getAction();
    }

    public final boolean LJII() {
        return this.LJLLL.isShowing();
    }

    @Override // X.AbstractDialogInterfaceC26236ARk
    public final Dialog LIZJ() {
        return this.LJLLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26231ARf(C26227ARb builder) {
        super(builder);
        InterfaceC80752Vme c80748Vma;
        o.LJIIIZ(builder, "builder");
        this.LJLJLJ = builder;
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.c5, C16880lQ.LLZIL(this.LJLILLLLZI), null);
        o.LJIIIIZZ(LLLZIIL, "from(context).inflate(R.…_tux_layout_dialog, null)");
        this.LJLJLLL = LLLZIIL;
        View findViewById = LLLZIIL.findViewById(R.id.ndc);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.visual_area)");
        C74291TDr c74291TDr = (C74291TDr) findViewById;
        this.LJLL = c74291TDr;
        View findViewById2 = LLLZIIL.findViewById(R.id.bfj);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.close_button)");
        ImageView imageView = (ImageView) findViewById2;
        this.LJLLI = imageView;
        View findViewById3 = LLLZIIL.findViewById(R.id.aaf);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.auto_dark_detect_view)");
        C81144Vsy c81144Vsy = (C81144Vsy) findViewById3;
        View findViewById4 = LLLZIIL.findViewById(R.id.j83);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.root_view)");
        C80751Vmd c80751Vmd = (C80751Vmd) findViewById4;
        View findViewById5 = LLLZIIL.findViewById(R.id.lf8);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.top_image_area)");
        C4RZ c4rz = (C4RZ) findViewById5;
        View findViewById6 = LLLZIIL.findViewById(R.id.b4l);
        o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.caption_area)");
        FrameLayout frameLayout = (FrameLayout) findViewById6;
        View findViewById7 = LLLZIIL.findViewById(R.id.mv);
        o.LJIIIIZZ(findViewById7, "view.findViewById(R.id.accessory_area)");
        FrameLayout frameLayout2 = (FrameLayout) findViewById7;
        View findViewById8 = LLLZIIL.findViewById(R.id.nj);
        o.LJIIIIZZ(findViewById8, "view.findViewById(R.id.action_area)");
        C26233ARh c26233ARh = (C26233ARh) findViewById8;
        this.LJLLILLLL = c26233ARh;
        this.LJLLJ = builder.LJII;
        OOQ ooq = new OOQ(this, LLLZIIL, c74291TDr);
        this.LJLLL = ooq;
        if (builder.LJIILIIL == 1) {
            c80748Vma = new C80749Vmb();
        } else {
            c80748Vma = new C80748Vma();
        }
        c80751Vmd.setConstraints(c80748Vma);
        if (builder.LJIIIIZZ) {
            imageView.setVisibility(0);
            C2068389v c2068389v = new C2068389v();
            ARJ arj = this.LJLIL;
            c2068389v.LIZ = arj.LJIILLIIL;
            c2068389v.LIZLLL = Integer.valueOf(arj.LJIILJJIL);
            SY9 LIZ = c2068389v.LIZ(this.LJLILLLLZI);
            imageView.setImageDrawable(LIZ);
            C16880lQ.LJIILLIIL(imageView, new ACListenerS24S0100000_4(this, 233));
            c81144Vsy.setVisibility(0);
            c81144Vsy.setAutoDarkListener(new C26226ARa(this, LIZ));
            c81144Vsy.LJLJJL = true;
        } else {
            imageView.setVisibility(8);
            c81144Vsy.setVisibility(8);
        }
        c74291TDr.setBackgroundColor(this.LJLIL.LJIIJ);
        c74291TDr.setRadius(this.LJLIL.LJI);
        AbstractC244669iw abstractC244669iw = builder.LJIIIZ;
        if (abstractC244669iw == null) {
            c4rz.LIZ();
        } else {
            c4rz.removeAllViews();
            abstractC244669iw.LIZLLL = this;
            c4rz.addView(abstractC244669iw.LIZIZ());
        }
        ART art = builder.LJIIJ;
        frameLayout.removeAllViews();
        if (art != null) {
            art.LIZLLL = this;
            frameLayout.addView(art.LIZIZ());
        }
        AbstractC242999gF abstractC242999gF = builder.LJIIJJI;
        frameLayout2.removeAllViews();
        if (abstractC242999gF == null) {
            frameLayout2.setVisibility(8);
        } else {
            frameLayout2.setVisibility(0);
            abstractC242999gF.LIZ(this);
            frameLayout2.addView(abstractC242999gF.LIZIZ());
        }
        AbstractC243009gG abstractC243009gG = builder.LJIIL;
        c26233ARh.removeAllViews();
        c26233ARh.LJLIL = abstractC243009gG;
        if (abstractC243009gG != null) {
            abstractC243009gG.LIZ(this);
            c26233ARh.addView(abstractC243009gG.LIZIZ());
        }
        LIZ();
        boolean z = builder.LJII;
        if (z) {
            C16880lQ.LJIIJ(new ACListenerS24S0100000_4(this, 234), LLLZIIL);
        } else {
            C16880lQ.LJIIJ(null, LLLZIIL);
        }
        ooq.setCancelable(z);
        h0.LJIJI(c74291TDr, new IDaS467S0100000_4(this, 1));
        ooq.setOnShowListener(new DialogInterfaceOnShowListenerC26232ARg(this));
        if (builder.LJIIIIZZ) {
            if (builder.LJIIJ == null) {
                if (builder.LJIIJJI != null) {
                    frameLayout = frameLayout2;
                } else if (builder.LJIIL == null) {
                    return;
                } else {
                    frameLayout = c26233ARh;
                }
            }
            if (!frameLayout.isFocusable()) {
                frameLayout.setImportantForAccessibility(1);
                frameLayout.setFocusable(false);
            }
            h0.LJIJI(imageView, new C26234ARi(frameLayout));
        }
    }

    public final <T extends View> T LJFF(int i) {
        T t = (T) this.LJLLL.findViewById(i);
        o.LJIIIIZZ(t, "internalDialog.findViewById(id)");
        return t;
    }
}

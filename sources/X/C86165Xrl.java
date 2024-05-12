package X;

import Y.AUListenerS90S0100000_1;
import Y.IDAListenerS82S0100000_15;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.profile.ui.CropActivity;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Xrl, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86165Xrl {
    public final String LIZ;
    public final Context LIZIZ;
    public final ViewGroup LIZJ;
    public final GradientDrawable LIZLLL;
    public final InterfaceC86180Xs0 LJ;
    public final View LJFF;
    public final FrameLayout LJI;
    public final C62846OlW LJII;
    public final TuxIconView LJIIIIZZ;
    public final ConstraintLayout LJIIIZ;
    public final FrameLayout LJIIJ;
    public final TuxTextView LJIIJJI;
    public final C71897SJp LJIIL;
    public final TuxTextView LJIILIIL;
    public final C62354Oda LJIILJJIL;
    public final TuxIconView LJIILL;
    public final TuxTextView LJIILLIIL;
    public final TuxTextView LJIIZILJ;
    public final TuxTextView LJIJ;
    public final TuxTextView LJIJI;
    public final AnimatorSet LJIJJ;

    public final void LIZ() {
        C16880lQ.LJLJJL(this.LJIJJ);
        this.LJIJJ.cancel();
        if (this.LJIIL.isChecked()) {
            FrameLayout coverContainer = this.LJI;
            o.LJIIIIZZ(coverContainer, "coverContainer");
            ValueAnimator ofInt = ValueAnimator.ofInt((int) KL2.LIZJ(this.LIZIZ, 120.0f), (int) KL2.LIZJ(this.LIZIZ, 240.0f));
            ofInt.setDuration(250L);
            ofInt.addUpdateListener(new AUListenerS90S0100000_1(coverContainer, 89));
            C62846OlW cover = this.LJII;
            o.LJIIIIZZ(cover, "cover");
            ValueAnimator ofInt2 = ValueAnimator.ofInt(0, 100);
            ofInt2.setDuration(100L);
            ofInt2.addUpdateListener(new AUListenerS90S0100000_1(cover, 91));
            C62354Oda roundCover = this.LJIILJJIL;
            o.LJIIIIZZ(roundCover, "roundCover");
            ValueAnimator ofInt3 = ValueAnimator.ofInt((int) ((KL2.LIZJ(this.LIZIZ, 120.0f) / KL2.LIZJ(this.LIZIZ, 84.0f)) * 100), 100);
            ofInt3.setDuration(250L);
            ofInt3.addUpdateListener(new AUListenerS90S0100000_1(roundCover, 90));
            this.LJIJJ.addListener(new IDAListenerS82S0100000_15(this, 8));
            this.LJIJJ.playTogether(ofInt, ofInt2, ofInt3);
            this.LJIJJ.start();
            return;
        }
        this.LJIJJ.cancel();
        C16880lQ.LJLJJL(this.LJIJJ);
        FrameLayout coverContainer2 = this.LJI;
        o.LJIIIIZZ(coverContainer2, "coverContainer");
        ValueAnimator ofInt4 = ValueAnimator.ofInt((int) KL2.LIZJ(this.LIZIZ, 240.0f), (int) KL2.LIZJ(this.LIZIZ, 120.0f));
        ofInt4.setDuration(250L);
        ofInt4.addUpdateListener(new AUListenerS90S0100000_1(coverContainer2, 89));
        C62846OlW cover2 = this.LJII;
        o.LJIIIIZZ(cover2, "cover");
        ValueAnimator ofInt5 = ValueAnimator.ofInt(100, 0);
        ofInt5.setDuration(100L);
        ofInt5.addUpdateListener(new AUListenerS90S0100000_1(cover2, 91));
        C62354Oda roundCover2 = this.LJIILJJIL;
        o.LJIIIIZZ(roundCover2, "roundCover");
        ValueAnimator ofInt6 = ValueAnimator.ofInt(100, (int) ((KL2.LIZJ(this.LIZIZ, 120.0f) / KL2.LIZJ(this.LIZIZ, 84.0f)) * 100));
        ofInt6.setDuration(250L);
        ofInt6.addUpdateListener(new AUListenerS90S0100000_1(roundCover2, 90));
        this.LJIJJ.addListener(new IDAListenerS82S0100000_15(this, 9));
        this.LJIJJ.playTogether(ofInt4, ofInt5, ofInt6);
        this.LJIJJ.start();
    }

    public C86165Xrl(String originPath, CropActivity context, ViewGroup viewGroup, GradientDrawable gradientDrawable, EnumC86168Xro style, C86166Xrm c86166Xrm) {
        String LJJZ;
        o.LJIIIZ(originPath, "originPath");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(style, "style");
        this.LIZ = originPath;
        this.LIZIZ = context;
        this.LIZJ = viewGroup;
        this.LIZLLL = gradientDrawable;
        this.LJ = c86166Xrm;
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.c2p, viewGroup, false);
        this.LJFF = LLLLIILL;
        this.LJI = (FrameLayout) LLLLIILL.findViewById(R.id.bxm);
        this.LJII = (C62846OlW) LLLLIILL.findViewById(R.id.abv);
        this.LJIIIIZZ = (TuxIconView) LLLLIILL.findViewById(R.id.c6j);
        this.LJIIIZ = (ConstraintLayout) LLLLIILL.findViewById(R.id.hy2);
        this.LJIIJ = (FrameLayout) LLLLIILL.findViewById(R.id.hzw);
        this.LJIIJJI = (TuxTextView) LLLLIILL.findViewById(R.id.hy3);
        this.LJIIL = (C71897SJp) LLLLIILL.findViewById(R.id.hzv);
        this.LJIILIIL = (TuxTextView) LLLLIILL.findViewById(R.id.hzx);
        this.LJIILJJIL = (C62354Oda) LLLLIILL.findViewById(R.id.j8b);
        this.LJIILL = (TuxIconView) LLLLIILL.findViewById(R.id.co3);
        this.LJIILLIIL = (TuxTextView) LLLLIILL.findViewById(R.id.c_1);
        this.LJIIZILJ = (TuxTextView) LLLLIILL.findViewById(R.id.acv);
        TuxTextView tuxTextView = (TuxTextView) LLLLIILL.findViewById(R.id.by7);
        int i = C86169Xrp.LIZ[style.ordinal()];
        if (i != 1) {
            if (i == 2) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append((char) 10024);
                LIZ.append(C44384HbQ.LJJZ(R.string.p7u));
                LJJZ = X1D.LIZIZ(LIZ);
            } else {
                throw new C162476Zf();
            }
        } else {
            LJJZ = C44384HbQ.LJJZ(R.string.ds);
        }
        tuxTextView.setText(LJJZ);
        this.LJIJ = tuxTextView;
        TuxTextView tuxTextView2 = (TuxTextView) LLLLIILL.findViewById(R.id.bxk);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append('@');
        LIZ2.append(AccountService.LJIJ().LJFF().getCurUser().getNickname());
        tuxTextView2.setText(X1D.LIZIZ(LIZ2));
        this.LJIJI = tuxTextView2;
        this.LJIJJ = new AnimatorSet();
    }
}

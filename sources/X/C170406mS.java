package X;

import android.animation.ObjectAnimator;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.6mS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C170406mS extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LJLZ = 0;
    public final View LJLIL;
    public final C164926dc LJLILLLLZI;
    public final boolean LJLJI;
    public final boolean LJLJJI;
    public final InterfaceC165006dk LJLJJL;
    public InterfaceC170486ma LJLJJLL;
    public EffectModel LJLJL;
    public LinearLayout LJLJLJ;
    public C72790ShW LJLJLLL;
    public TuxTextView LJLL;
    public TuxIconView LJLLI;
    public ImageView LJLLILLLL;
    public View LJLLJ;
    public ObjectAnimator LJLLL;
    public int LJLLLL;
    public Drawable LJLLLLLL;

    public final void L() {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = this.LJLLL;
        if (objectAnimator2 != null && objectAnimator2.isRunning() && (objectAnimator = this.LJLLL) != null) {
            objectAnimator.cancel();
        }
        TuxIconView tuxIconView = this.LJLLI;
        if (tuxIconView != null) {
            tuxIconView.setRotation(0.0f);
        }
        TuxIconView tuxIconView2 = this.LJLLI;
        if (tuxIconView2 != null) {
            tuxIconView2.setIconRes(R.raw.icon_arrow_down_circle_fill);
        }
    }

    public final void N() {
        int LIZ;
        EffectModel effectModel;
        InterfaceC170486ma interfaceC170486ma;
        InterfaceC170486ma interfaceC170486ma2 = this.LJLJJLL;
        if (interfaceC170486ma2 == null || -1 == (LIZ = interfaceC170486ma2.LIZ(getAbsoluteAdapterPosition())) || (effectModel = this.LJLJL) == null) {
            return;
        }
        InterfaceC170486ma interfaceC170486ma3 = this.LJLJJLL;
        if (interfaceC170486ma3 != null) {
            interfaceC170486ma3.LJFF(5, LIZ, effectModel);
        }
        if (this.LJLJI && !this.LJLJJI && (interfaceC170486ma = this.LJLJJLL) != null) {
            interfaceC170486ma.LJ(LIZ);
        }
        Q(1.0f);
    }

    public final void M(boolean z) {
        int i;
        TuxTextView tuxTextView = this.LJLL;
        if (tuxTextView != null) {
            i = tuxTextView.getCurrentTextColor();
        } else {
            i = R.attr.dl;
        }
        if (!z) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            ColorMatrixColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(colorMatrix);
            C72790ShW c72790ShW = this.LJLJLLL;
            if (c72790ShW != null) {
                c72790ShW.setColorFilter(colorMatrixColorFilter);
            }
            i = R.attr.dn;
        } else {
            C72790ShW c72790ShW2 = this.LJLJLLL;
            if (c72790ShW2 != null) {
                c72790ShW2.setColorFilter((ColorFilter) null);
            }
        }
        TuxTextView tuxTextView2 = this.LJLL;
        if (tuxTextView2 != null) {
            tuxTextView2.setTextColorRes(i);
        }
    }

    public final void Q(float f) {
        ViewPropertyAnimator animate;
        C72790ShW c72790ShW = this.LJLJLLL;
        if (c72790ShW != null && (animate = c72790ShW.animate()) != null) {
            animate.scaleX(f);
            animate.scaleY(f);
            animate.setDuration(100L);
            animate.start();
        }
    }

    public final void P(int i, boolean z) {
        EffectModel effectModel;
        EffectModel effectModel2;
        InterfaceC165006dk interfaceC165006dk;
        if ((!this.LJLJI || (effectModel2 = this.LJLJL) == null || (interfaceC165006dk = this.LJLJJL) == null || !interfaceC165006dk.LIZ(effectModel2)) && z) {
            N();
            return;
        }
        InterfaceC170486ma interfaceC170486ma = this.LJLJJLL;
        if (interfaceC170486ma != null) {
            if (i < 0) {
                i = getAbsoluteAdapterPosition();
            }
            int LIZ = interfaceC170486ma.LIZ(i);
            if (-1 == LIZ || (effectModel = this.LJLJL) == null) {
                return;
            }
            Q(1.0f);
            InterfaceC170486ma interfaceC170486ma2 = this.LJLJJLL;
            if (interfaceC170486ma2 != null) {
                interfaceC170486ma2.LJFF(1, LIZ, effectModel);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C170406mS(View view, C164926dc config, boolean z, boolean z2, InterfaceC165006dk interfaceC165006dk, InterfaceC170486ma interfaceC170486ma) {
        super(view);
        int i;
        C72790ShW c72790ShW;
        o.LJIIIZ(config, "config");
        this.LJLIL = view;
        this.LJLILLLLZI = config;
        this.LJLJI = z;
        this.LJLJJI = z2;
        this.LJLJJL = interfaceC165006dk;
        this.LJLJJLL = interfaceC170486ma;
        this.LJLLLL = 1;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.etn);
        linearLayout.getLayoutParams().width = config.LJJIFFI + config.LJJI;
        this.LJLJLJ = linearLayout;
        C72790ShW c72790ShW2 = (C72790ShW) view.findViewById(R.id.f2e);
        if (c72790ShW2 != null) {
            c72790ShW2.LJLLILLLL = true;
            if (config.LJIILLIIL) {
                c72790ShW2.setRectFRadius(KL2.LIZJ(c72790ShW2.getContext(), 8.0f));
                c72790ShW2.setClipStyle(1);
            }
            i = Math.min(SFS.LJI(60.0d), (int) (C143205jg.LJ() * 0.14d));
            c72790ShW2.getLayoutParams().width = i;
            c72790ShW2.getLayoutParams().height = i;
            c72790ShW2.setEnableAnimation(true);
        } else {
            i = 0;
            c72790ShW2 = null;
        }
        this.LJLJLLL = c72790ShW2;
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.m64);
        tuxTextView.setHorizontalFadingEdgeEnabled(true);
        tuxTextView.setFadingEdgeLength((int) KL2.LIZJ(tuxTextView.getContext(), 4.0f));
        tuxTextView.getLayoutParams().width = config.LJJIFFI;
        this.LJLL = tuxTextView;
        this.LJLLI = (TuxIconView) view.findViewById(R.id.f23);
        this.LJLLILLLL = (ImageView) view.findViewById(R.id.f28);
        View findViewById = view.findViewById(R.id.kgn);
        findViewById.getLayoutParams().width = SFS.LJI(8.0d) + i;
        findViewById.getLayoutParams().height = findViewById.getLayoutParams().width;
        this.LJLLJ = findViewById;
        if (!z && (c72790ShW = this.LJLJLLL) != null) {
            c72790ShW.setOnTouchListener(new ViewOnTouchListenerC170476mZ(1.2f, 100L, c72790ShW));
        }
        C72790ShW c72790ShW3 = this.LJLJLLL;
        if (c72790ShW3 != null) {
            this.LJLLLLLL = C78885Uxd.LJ(c72790ShW3.getContext().getDrawable(R.drawable.tm), c72790ShW3.getResources().getColor(R.color.y0));
            c72790ShW3.getHierarchy().LJIILJJIL(InterfaceC78716Uuu.LJJL);
            c72790ShW3.getHierarchy().LJIILL(this.LJLLLLLL, 5);
        }
    }
}

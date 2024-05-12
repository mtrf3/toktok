package X;

import Y.ALAdapterS1S0100000_2;
import Y.ARunnableS38S0100000_2;
import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.6QK, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6QK extends C6P6 implements C6SE {
    public static final /* synthetic */ int LJFF = 0;
    public final FrameLayout LIZ;
    public final FrameLayout LIZIZ;
    public final InterfaceC159886Pg LIZJ;
    public final LifecycleOwner LIZLLL;
    public final TuxTextView LJ;

    @Override // X.C6SE
    public final void LIZ(int i, boolean z) {
    }

    @Override // X.C6SE
    public final void LIZIZ(int i) {
    }

    @Override // X.C6SE
    public final void LIZLLL() {
    }

    @Override // X.C6SE
    public final void LJIIJ(int i) {
    }

    @Override // X.C6SE
    public final void LJIIJJI(int i) {
    }

    @Override // X.C6SE
    public final void LJIIL() {
    }

    @Override // X.C6SE
    public final void LJJI(int i) {
    }

    public final void LJJIFFI() {
        ViewGroup viewGroup;
        this.LJ.animate().alpha(0.0f).setDuration(150L).setInterpolator(C55953Lxd.LJIIJ()).setListener(new ALAdapterS1S0100000_2(this, 43)).start();
        if (this.LJ.getParent() != null) {
            ViewParent parent = this.LJ.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C16880lQ.LJLLL(this.LJ, viewGroup);
            }
        }
    }

    @Override // X.C6P6, X.C6V2
    public final boolean onDown(MotionEvent motionEvent) {
        LJJIFFI();
        return false;
    }

    @Override // X.C6SE
    public final void LJIILIIL(int i, RectF visibleRect) {
        o.LJIIIZ(visibleRect, "visibleRect");
    }

    @Override // X.C6SE
    public final void LJIILL(float f, int i, RectF visibleRect) {
        o.LJIIIZ(visibleRect, "visibleRect");
    }

    public final void LJJII(float f, float f2, Integer num) {
        long j;
        if (this.LJ.getParent() != null) {
            this.LJ.setX(f);
            this.LJ.setY(f2);
            this.LJ.setAlpha(0.0f);
            this.LJ.setVisibility(0);
            this.LJ.animate().alpha(1.0f).setDuration(150L).setListener(new ALAdapterS1S0100000_2(this, 44)).setInterpolator(C55953Lxd.LJIIJ()).start();
            TuxTextView tuxTextView = this.LJ;
            ARunnableS38S0100000_2 aRunnableS38S0100000_2 = new ARunnableS38S0100000_2(this, 174);
            if (num != null) {
                j = num.intValue();
            } else {
                j = 3000;
            }
            tuxTextView.postDelayed(aRunnableS38S0100000_2, j);
        }
    }

    @Override // X.C6SE
    public final void LJ(int i, float f, float f2, RectF visibleRect) {
        o.LJIIIZ(visibleRect, "visibleRect");
    }

    public C6QK(Context context, FrameLayout stickerContainer, FrameLayout stickerHigherContainer, LifecycleOwner lifecycleOwner, InterfaceC159886Pg editProvideStickerService, C159816Oz stickerConfig) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(stickerContainer, "stickerContainer");
        o.LJIIIZ(stickerHigherContainer, "stickerHigherContainer");
        o.LJIIIZ(editProvideStickerService, "editProvideStickerService");
        o.LJIIIZ(stickerConfig, "stickerConfig");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LIZ = stickerContainer;
        this.LIZIZ = stickerHigherContainer;
        this.LIZJ = editProvideStickerService;
        this.LIZLLL = lifecycleOwner;
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        tuxTextView.setGravity(17);
        tuxTextView.setTuxFont(82);
        tuxTextView.setTextColorRes(R.attr.dj);
        tuxTextView.setVisibility(4);
        tuxTextView.setShadowLayer(5.0f, 2.0f, 2.0f, R.attr.d6);
        this.LJ = tuxTextView;
    }

    @Override // X.C6SE
    public final void LJFF(int i, EnumC157656Gr enumC157656Gr, float f, float f2, RectF rectF, float f3) {
        C160076Pz.LJFF(enumC157656Gr, rectF);
    }

    @Override // X.C6SE
    public final void LJIILLIIL(int i, EnumC157656Gr enumC157656Gr, float f, float f2, RectF rectF, float f3) {
        C160076Pz.LIZJ(enumC157656Gr, rectF);
    }

    @Override // X.C6SE
    public final void LJIL(int i, EnumC157656Gr enumC157656Gr, float f, float f2, RectF rectF, float f3) {
        C160076Pz.LIZLLL(enumC157656Gr, rectF);
    }

    @Override // X.C6SE
    public final void LJJ(int i, EnumC157656Gr enumC157656Gr, float f, float f2, RectF rectF, float f3) {
        C160076Pz.LJ(enumC157656Gr, rectF);
    }

    @Override // X.C6SE
    public final void LJIIIZ(int i, EnumC157656Gr enumC157656Gr, MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2, RectF rectF, float f3) {
        C160076Pz.LIZIZ(enumC157656Gr, motionEvent, motionEvent2, rectF);
    }

    @Override // X.C6SE
    public final void LJIJI(int i, EnumC157656Gr enumC157656Gr, MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2, RectF rectF, float f3) {
        C160076Pz.LIZ(enumC157656Gr, motionEvent, motionEvent2, rectF);
    }
}

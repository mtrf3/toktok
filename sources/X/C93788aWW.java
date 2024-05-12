package X;

import Y.IDUListenerS265S0100000_42;
import android.R;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.StateSet;
import android.view.animation.PathInterpolator;
import kotlin.jvm.internal.o;

/* renamed from: X.aWW, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93788aWW extends StateListDrawable {
    public static final /* synthetic */ int LJLJJLL = 0;
    public boolean LJLIL;
    public final boolean LJLILLLLZI;
    public final Drawable LJLJI;
    public final ValueAnimator LJLJJI;
    public final ValueAnimator LJLJJL;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C93788aWW() {
        /*
            r4 = this;
            android.content.Context r0 = X.C93901aYL.LIZ
            r3 = 0
            if (r0 == 0) goto L2d
            android.content.res.Resources r1 = r0.getResources()
            r0 = 1711603740(0x6605001c, float:1.5701919E23)
            android.graphics.drawable.Drawable r2 = X.C0OW.LIZ(r1, r0, r3)
            if (r2 == 0) goto L2d
        L12:
            android.content.Context r0 = X.C93901aYL.LIZ
            if (r0 == 0) goto L27
            android.content.res.Resources r1 = r0.getResources()
            r0 = 1711603774(0x6605003e, float:1.570198E23)
            android.graphics.drawable.Drawable r0 = X.C0OW.LIZ(r1, r0, r3)
            if (r0 == 0) goto L27
        L23:
            r4.<init>(r2, r0)
            return
        L27:
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            goto L23
        L2d:
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93788aWW.<init>():void");
    }

    @Override // android.graphics.drawable.StateListDrawable, android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (iArr != null && ORY.LJJIJ(R.attr.state_pressed, iArr) && !this.LJLIL) {
            if (this.LJLILLLLZI) {
                ValueAnimator valueAnimator = this.LJLJJL;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = this.LJLJJI;
                if (valueAnimator2 != null) {
                    valueAnimator2.start();
                }
            }
            this.LJLIL = true;
        } else if (this.LJLIL) {
            if (this.LJLILLLLZI) {
                ValueAnimator valueAnimator3 = this.LJLJJI;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
                ValueAnimator valueAnimator4 = this.LJLJJL;
                if (valueAnimator4 != null) {
                    valueAnimator4.start();
                }
            }
            this.LJLIL = false;
        }
        return super.onStateChange(iArr);
    }

    public C93788aWW(Drawable backgroundDrawable, Drawable pressedMaskDrawable) {
        Drawable drawable;
        o.LJIIIZ(backgroundDrawable, "backgroundDrawable");
        o.LJIIIZ(pressedMaskDrawable, "pressedMaskDrawable");
        this.LJLILLLLZI = true;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
        ofInt.setDuration(300L);
        ofInt.setInterpolator(new PathInterpolator(0.44f, 0.05f, 0.55f, 0.95f));
        ofInt.addUpdateListener(new IDUListenerS265S0100000_42(this, 6));
        this.LJLJJI = ofInt;
        ValueAnimator ofInt2 = ValueAnimator.ofInt(255, 0);
        ofInt2.setDuration(220L);
        ofInt2.setInterpolator(new PathInterpolator(0.44f, 0.05f, 0.55f, 0.95f));
        ofInt2.addUpdateListener(new IDUListenerS265S0100000_42(this, 7));
        this.LJLJJL = ofInt2;
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{backgroundDrawable, pressedMaskDrawable});
        addState(StateSet.WILD_CARD, layerDrawable);
        try {
            drawable = layerDrawable.getDrawable(1);
        } catch (Exception unused) {
            drawable = null;
        }
        this.LJLJI = drawable;
        if (drawable != null) {
            drawable.mutate();
            drawable.setAlpha(0);
        }
    }
}

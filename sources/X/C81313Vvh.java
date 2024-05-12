package X;

import Y.AUListenerS103S0200000_14;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Vvh, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81313Vvh extends Drawable {
    public EnumC81316Vvk LIZ = EnumC81316Vvk.NORMAL;
    public final Paint LIZIZ;
    public final RectF LIZJ;
    public float LIZLLL;
    public final Paint LJ;
    public final RectF LJFF;
    public final ValueAnimator LJI;
    public final AUListenerS103S0200000_14 LJII;
    public final /* synthetic */ C81312Vvg LJIIIIZZ;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final int LIZ() {
        int i = C81315Vvj.LIZ[this.LIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new C162476Zf();
                }
            } else {
                return this.LJIIIIZZ.LJLJLLL;
            }
        }
        return this.LJIIIIZZ.LJLJLJ;
    }

    public final int LIZIZ() {
        int i = C81315Vvj.LIZ[this.LIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new C162476Zf();
                }
            } else {
                return this.LJIIIIZZ.LJLJJLL;
            }
        }
        return this.LJIIIIZZ.LJLJJL;
    }

    public C81313Vvh(C81312Vvg c81312Vvg) {
        int i;
        this.LJIIIIZZ = c81312Vvg;
        Paint paint = new Paint();
        this.LIZIZ = paint;
        this.LIZJ = new RectF();
        this.LIZLLL = -1.0f;
        Paint paint2 = new Paint();
        this.LJ = paint2;
        this.LJFF = new RectF();
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 1);
        o.LJIIIIZZ(ofInt, "ofInt(0, 1)");
        this.LJI = ofInt;
        AUListenerS103S0200000_14 aUListenerS103S0200000_14 = new AUListenerS103S0200000_14(this, c81312Vvg, 0);
        this.LJII = aUListenerS103S0200000_14;
        paint.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
        Context context = c81312Vvg.getContext();
        o.LJIIIIZZ(context, "context");
        Integer LJI = C79045V0n.LJI(R.attr.da, context);
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = 0;
        }
        paint2.setColor(i);
        ofInt.setDuration(c81312Vvg.LJLLJ);
        ofInt.setRepeatMode(1);
        ofInt.setRepeatCount(-1);
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.addUpdateListener(aUListenerS103S0200000_14);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0147  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r12) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81313Vvh.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        invalidateSelf();
        return onLevelChange;
    }
}

package X;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YK3 extends View {
    public static final int LJLJJL = C15380j0.LIZ(36.0f);
    public static final int LJLJJLL = C15380j0.LIZ(28.0f);
    public final Paint LJLIL;
    public final LinkedList<YK4> LJLILLLLZI;
    public final C1UB<YK4> LJLJI;
    public Bitmap LJLJJI;

    public final void LIZIZ() {
        Iterator<YK4> it = this.LJLILLLLZI.iterator();
        while (it.hasNext()) {
            YK4 next = it.next();
            o.LJIIIIZZ(next, "next()");
            YK4 yk4 = next;
            it.remove();
            this.LJLJI.LIZ(yk4);
            yk4.LJI.cancel();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        Iterator<YK4> it = this.LJLILLLLZI.iterator();
        while (it.hasNext()) {
            YK4 next = it.next();
            Bitmap bitmap = this.LJLJJI;
            if (bitmap != null && !bitmap.isRecycled() && next.LJII.width() > 0.0f) {
                this.LJLIL.setAlpha(next.LJIIJJI);
                canvas.drawBitmap(bitmap, (Rect) null, next.LJII, this.LJLIL);
            }
            Bitmap bitmap2 = next.LJIILIIL;
            if (bitmap2 != null && !bitmap2.isRecycled() && next.LJIIIIZZ.width() > 0.0f) {
                this.LJLIL.setAlpha(next.LJIIL);
                canvas.drawBitmap(bitmap2, (Rect) null, next.LJIIIIZZ, this.LJLIL);
            }
        }
    }

    public final void setAvatar(Bitmap bitmap) {
        this.LJLJJI = bitmap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YK3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C04560Fw.LIZ(context, "context", attributeSet, "attributeSet");
        this.LJLIL = new Paint(1);
        this.LJLILLLLZI = new LinkedList<>();
        this.LJLJI = new C1UB<>(10);
    }

    public final void LIZ(Bitmap iconBitmap, float f, float f2, float f3, float f4, float f5, float f6) {
        o.LJIIIZ(iconBitmap, "iconBitmap");
        YK4 LIZIZ = this.LJLJI.LIZIZ();
        if (LIZIZ == null) {
            LIZIZ = new YK4(this);
        }
        this.LJLILLLLZI.add(LIZIZ);
        LIZIZ.LJIILIIL = iconBitmap;
        LIZIZ.LJIIIZ = 0.0f;
        LIZIZ.LJIIL = 0;
        LIZIZ.LIZ.LIZ = f5;
        LIZIZ.LIZIZ.LIZ = f6;
        LIZIZ.LIZJ.setFloatValues(f, f3);
        LIZIZ.LIZLLL.setFloatValues(f2, f4);
        if (LIZIZ.LJIILJJIL.LJLJJI != null) {
            LIZIZ.LJIIJJI = 255;
            LIZIZ.LJIIJ = 0.0f;
            long nextLong = V0Q.Default.nextLong(500L, 1200L);
            LIZIZ.LJ.setStartDelay(nextLong);
            long nextInt = nextLong + r8.nextInt(100, 200);
            LIZIZ.LJFF.setStartDelay(nextInt);
            LIZIZ.LJFF.setDuration(2000 - nextInt);
        } else {
            LIZIZ.LJIIJJI = 0;
            LIZIZ.LJIIJ = 1.0f;
            LIZIZ.LJFF.setStartDelay(V0Q.Default.nextLong(666L, 1100L));
            Animator animator = LIZIZ.LJFF;
            animator.setDuration(2000 - animator.getStartDelay());
        }
        LIZIZ.LJI.start();
    }
}

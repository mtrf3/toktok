package X;

import Y.ARunnableS33S0200000_14;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.WFv, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81991WFv extends View {
    public Paint LJLIL;
    public final C81990WFu LJLILLLLZI;
    public float LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public AVMusicWaveBean LJLJL;
    public final RectF LJLJLJ;
    public int LJLJLLL;

    public final int getMHeight() {
        return this.LJLJJL;
    }

    public final Paint getMPaint() {
        return this.LJLIL;
    }

    public final AVMusicWaveBean getMusicWaveBean() {
        return this.LJLJL;
    }

    public final int getViewWidth() {
        return this.LJLJJI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81991WFv(Context context) {
        super(context, null, 0);
        a1.LJFF(context, "ctx");
        this.LJLJLJ = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.color}, 0, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…sicView, defStyleAttr, 0)");
        int color = obtainStyledAttributes.getColor(0, -16777216);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.LJLIL = paint;
        paint.setStyle(Paint.Style.FILL);
        this.LJLIL.setColor(color);
        C81990WFu c81990WFu = new C81990WFu();
        this.LJLILLLLZI = c81990WFu;
        c81990WFu.LIZLLL(context);
        c81990WFu.LJIILIIL = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        canvas.save();
        this.LJLILLLLZI.LJ(canvas);
        canvas.restore();
        canvas.save();
        int i = this.LJLJJLL;
        this.LJLJLJ.set(i, 0.0f, (this.LJLJI * getWidth()) + i, getHeight());
        canvas.clipRect(this.LJLJLJ);
        C81990WFu c81990WFu = this.LJLILLLLZI;
        Paint paint = this.LJLIL;
        c81990WFu.getClass();
        o.LJIIIZ(paint, "paint");
        int length = c81990WFu.LJIIJ.length;
        for (int i2 = 0; i2 < length; i2++) {
            float f = c81990WFu.LJIIJ[i2];
            int i3 = c81990WFu.LIZLLL;
            int i4 = (int) (f * i3);
            int i5 = c81990WFu.LIZJ;
            int i6 = c81990WFu.LIZIZ;
            int i7 = (i5 + i6) * i2;
            int i8 = c81990WFu.LJI;
            if (i8 > 0 && i8 > c81990WFu.LJFF) {
                i6 = 0;
            }
            RectF rectF = new RectF(i7 + i6, ((i3 - i4) / 2) + c81990WFu.LJ, i5 + r2, i4 + r1);
            float f2 = c81990WFu.LJII;
            canvas.drawRoundRect(rectF, f2, f2, paint);
        }
    }

    public void setAudioWaveViewData(AVMusicWaveBean aVMusicWaveBean) {
        if (aVMusicWaveBean != null) {
            this.LJLJL = aVMusicWaveBean;
            post(new ARunnableS33S0200000_14(aVMusicWaveBean, this, 97));
        }
    }

    public final void setColor(int i) {
        this.LJLIL.setColor(i);
        invalidate();
    }

    public final void setMHeight(int i) {
        this.LJLJJL = i;
    }

    public final void setMPaint(Paint paint) {
        o.LJIIIZ(paint, "<set-?>");
        this.LJLIL = paint;
    }

    public final void setMusicWaveBean(AVMusicWaveBean aVMusicWaveBean) {
        this.LJLJL = aVMusicWaveBean;
    }

    public final void setProgressMaxWidth(int i) {
        this.LJLJLLL = i;
    }

    public final void setViewWidth(int i) {
        this.LJLJJI = i;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        AVMusicWaveBean aVMusicWaveBean = this.LJLJL;
        if (aVMusicWaveBean != null && C81995WFz.LJ(aVMusicWaveBean.getMusicWavePointArray())) {
            int i3 = WG0.LJI.LIZ;
            int i4 = WG0.LJI.LIZIZ;
            o.LJI(this.LJLJL);
            this.LJLJJI = C0EH.LIZ(i3, i4, r0.getMusicWavePointArray().length - 1, i4);
            int i5 = WG0.LJI.LIZJ;
            this.LJLJJL = i5;
            setMeasuredDimension(this.LJLJJI, i5);
            this.LJLILLLLZI.LJI(this.LJLJJI, this.LJLJJL);
            return;
        }
        super.onMeasure(i, i2);
    }
}

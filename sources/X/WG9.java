package X;

import Y.ARunnableS33S0200000_14;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WG9 extends View {
    public Paint LJLIL;
    public final WGA LJLILLLLZI;
    public float LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public MusicWaveBean LJLJJLL;
    public final RectF LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public final WGB LJLLI;

    public final int getMaxCntOnScreen() {
        WGB wgb = this.LJLLI;
        int i = wgb.LIZIZ;
        int i2 = wgb.LIZJ;
        if (i + i2 != 0) {
            return this.LJLJLJ / (i + i2);
        }
        return 60;
    }

    public final int getViewWidth() {
        int i;
        float[] musicWavePointArray;
        MusicWaveBean musicWaveBean = this.LJLJJLL;
        if (musicWaveBean != null && (musicWavePointArray = musicWaveBean.getMusicWavePointArray()) != null) {
            i = musicWavePointArray.length;
        } else {
            i = 0;
        }
        WGB wgb = this.LJLLI;
        return (wgb.LIZIZ + wgb.LIZJ) * i;
    }

    public final int getMMarginStartX() {
        return this.LJLJJI;
    }

    public final Paint getMPlayedPaint() {
        return this.LJLIL;
    }

    public final int getMSelectedPartWidth() {
        return this.LJLJLJ;
    }

    public final MusicWaveBean getMusicWaveBean() {
        return this.LJLJJLL;
    }

    public final int getStartX() {
        return this.LJLJJI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WG9(Context context) {
        super(context, null, 0);
        a1.LJFF(context, "ctx");
        this.LJLJL = new RectF();
        WGC wgc = new WGC();
        this.LJLJLLL = AnonymousClass636.LJIIIIZZ(R.attr.eb, context);
        this.LJLL = AnonymousClass636.LJIIIIZZ(R.attr.gv, context);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.LJLJLLL);
        this.LJLIL = paint;
        WGB wgb = new WGB(context, wgc);
        this.LJLLI = wgb;
        WGA wga = new WGA();
        Paint paint2 = new Paint();
        wga.LJIIIIZZ = paint2;
        paint2.setColor(wga.LJIIJJI);
        Paint paint3 = wga.LJIIIIZZ;
        if (paint3 != null) {
            paint3.setStyle(Paint.Style.FILL);
            Paint paint4 = wga.LJIIIIZZ;
            if (paint4 != null) {
                paint4.setAntiAlias(true);
                Paint paint5 = new Paint();
                wga.LJIIIZ = paint5;
                paint5.setColor(wga.LJIIJJI);
                Paint paint6 = wga.LJIIIZ;
                if (paint6 != null) {
                    paint6.setStyle(Paint.Style.FILL);
                    Paint paint7 = wga.LJIIIZ;
                    if (paint7 != null) {
                        paint7.setAntiAlias(true);
                        Paint paint8 = wga.LJIIIZ;
                        if (paint8 != null) {
                            paint8.setAlpha(25);
                            wga.LIZ(this.LJLL);
                            wga.LIZ = wgb.LIZIZ;
                            wga.LIZIZ = wgb.LIZJ;
                            wga.LJ = wgb.LJI;
                            wga.LIZLLL = wgb.LJ;
                            wga.LIZJ = wgb.LJFF;
                            this.LJLILLLLZI = wga;
                            this.LJLJLJ = wgb.LJIIIIZZ;
                            return;
                        }
                        o.LJIJI("mOuterPaint");
                        throw null;
                    }
                    o.LJIJI("mOuterPaint");
                    throw null;
                }
                o.LJIJI("mOuterPaint");
                throw null;
            }
            o.LJIJI("mPaint");
            throw null;
        }
        o.LJIJI("mPaint");
        throw null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint;
        int i;
        o.LJIIIZ(canvas, "canvas");
        canvas.save();
        WGA wga = this.LJLILLLLZI;
        wga.getClass();
        int length = wga.LJIIJ.length;
        for (int i2 = 0; i2 < length; i2++) {
            float f = wga.LJIIJ[i2];
            int i3 = wga.LJFF;
            int i4 = (int) (f * i3);
            int i5 = wga.LIZLLL;
            if (i4 < i5) {
                i4 = i5;
            }
            int i6 = wga.LIZIZ;
            int i7 = wga.LIZ;
            int i8 = (i6 + i7) * i2;
            int i9 = wga.LJII;
            if (i9 > 0 && i9 > wga.LJI) {
                i7 = 0;
            }
            int i10 = i8 + i7;
            int i11 = i6 + i10;
            RectF rectF = new RectF(i10, ((i3 - i4) / 2) + wga.LIZJ, i11, i4 + r1);
            float f2 = wga.LJ;
            int i12 = wga.LJII;
            if (i12 > 0 && i12 > (i = wga.LJI) && (i11 <= i || i10 >= i12)) {
                paint = wga.LJIIIZ;
                if (paint == null) {
                    o.LJIJI("mOuterPaint");
                    throw null;
                }
            } else {
                paint = wga.LJIIIIZZ;
                if (paint == null) {
                    o.LJIJI("mPaint");
                    throw null;
                }
            }
            canvas.drawRoundRect(rectF, f2, f2, paint);
        }
        canvas.restore();
        canvas.save();
        if (this.LJLJJI < (this.LJLJI * getWidth()) + this.LJLJJL) {
            this.LJLJL.set(this.LJLJJI, 0.0f, (this.LJLJI * getWidth()) + this.LJLJJL, getHeight());
            canvas.clipRect(this.LJLJL);
            WGA wga2 = this.LJLILLLLZI;
            Paint paint2 = this.LJLIL;
            wga2.getClass();
            o.LJIIIZ(paint2, "paint");
            int length2 = wga2.LJIIJ.length;
            for (int i13 = 0; i13 < length2; i13++) {
                float f3 = wga2.LJIIJ[i13];
                int i14 = wga2.LJFF;
                int i15 = (int) (f3 * i14);
                int i16 = wga2.LIZLLL;
                if (i15 < i16) {
                    i15 = i16;
                }
                int i17 = wga2.LIZIZ;
                int i18 = wga2.LIZ;
                int i19 = (i17 + i18) * i13;
                int i20 = wga2.LJII;
                if (i20 > 0 && i20 > wga2.LJI) {
                    i18 = 0;
                }
                RectF rectF2 = new RectF(i19 + i18, ((i14 - i15) / 2) + wga2.LIZJ, i17 + r2, i15 + r1);
                float f4 = wga2.LJ;
                canvas.drawRoundRect(rectF2, f4, f4, paint2);
            }
        }
    }

    public void setAudioWaveViewData(MusicWaveBean musicWaveBean) {
        if (musicWaveBean != null) {
            this.LJLJJLL = musicWaveBean;
            post(new ARunnableS33S0200000_14(musicWaveBean, this, 72));
        }
    }

    public final void setMMarginStartX(int i) {
        this.LJLJJI = i;
    }

    public final void setMPlayedPaint(Paint paint) {
        o.LJIIIZ(paint, "<set-?>");
        this.LJLIL = paint;
    }

    public final void setMSelectedPartWidth(int i) {
        this.LJLJLJ = i;
    }

    public final void setMusicWaveBean(MusicWaveBean musicWaveBean) {
        this.LJLJJLL = musicWaveBean;
    }

    public final void setParam(WGC param) {
        o.LJIIIZ(param, "param");
        this.LJLLI.LIZ(param);
        WGA wga = this.LJLILLLLZI;
        WGB wgb = this.LJLLI;
        wga.LIZ = wgb.LIZIZ;
        wga.LIZIZ = wgb.LIZJ;
        wga.LJ = wgb.LJI;
        wga.LIZLLL = wgb.LJ;
        wga.LIZJ = wgb.LJFF;
        this.LJLJLJ = wgb.LJIIIIZZ;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        MusicWaveBean musicWaveBean = this.LJLJJLL;
        if (musicWaveBean != null) {
            WGB wgb = this.LJLLI;
            float[] musicWavePointArray = musicWaveBean.getMusicWavePointArray();
            wgb.getClass();
            if (musicWavePointArray != null && musicWavePointArray.length != 0) {
                int viewWidth = getViewWidth();
                WGA wga = this.LJLILLLLZI;
                WGB wgb2 = this.LJLLI;
                int i3 = wgb2.LJFF;
                wga.LIZJ = i3;
                setMeasuredDimension(viewWidth, (i3 * 2) + wgb2.LIZLLL);
                WGA wga2 = this.LJLILLLLZI;
                WGB wgb3 = this.LJLLI;
                wga2.LJFF = ((wgb3.LJFF * 2) + wgb3.LIZLLL) - (wga2.LIZJ * 2);
                return;
            }
        }
        super.onMeasure(i, i2);
    }
}

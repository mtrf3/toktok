package X;

import Y.ALAdapterS11S0100000_14;
import Y.AUListenerS101S0100000_14;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.animation.AccelerateDecelerateInterpolator;

/* loaded from: classes15.dex */
public final class WET extends C81964WEu {
    public C81250Vug<V92> LLILL;
    public int LLILLIZIL;
    public int LLILLJJLI;
    public final int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public long LLIZLLLIL;
    public boolean LLJ;
    public Paint LLJI;
    public Matrix LLJIJIL;
    public WEX LLJILJIL;
    public WEY LLJILJILJ;

    public WET() {
        throw null;
    }

    public InterfaceC81252Vui getController() {
        C81250Vug<V92> c81250Vug = this.LLILL;
        if (c81250Vug == null) {
            return null;
        }
        return c81250Vug.LJ;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C81250Vug<V92> c81250Vug = this.LLILL;
        if (c81250Vug != null) {
            c81250Vug.LJ();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C81250Vug<V92> c81250Vug = this.LLILL;
        if (c81250Vug != null) {
            c81250Vug.LJFF();
        }
        C54339LUh.LIZ(this);
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        C81250Vug<V92> c81250Vug = this.LLILL;
        if (c81250Vug != null) {
            c81250Vug.LJ();
        }
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        C81250Vug<V92> c81250Vug = this.LLILL;
        if (c81250Vug != null) {
            c81250Vug.LJFF();
        }
    }

    public long getDuration() {
        return this.LLIZLLLIL;
    }

    public int getState() {
        return this.LLILLIZIL;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        WEW wew;
        PropertyValuesHolder ofFloat;
        PropertyValuesHolder ofFloat2;
        PropertyValuesHolder ofFloat3;
        PropertyValuesHolder ofFloat4;
        PropertyValuesHolder ofFloat5;
        WEW wew2;
        WEW wew3;
        WEX wex;
        Matrix matrix;
        Drawable drawable;
        if (getDrawable() == null) {
            return;
        }
        if (this.LLILLIZIL != 0) {
            if (this.LLJ && (drawable = getDrawable()) != null && getWidth() != 0 && getHeight() != 0) {
                this.LLJILJIL = new WEX();
                float intrinsicWidth = this.LLILZ / drawable.getIntrinsicWidth();
                float intrinsicHeight = this.LLILZIL / drawable.getIntrinsicHeight();
                if (intrinsicWidth <= intrinsicHeight) {
                    intrinsicWidth = intrinsicHeight;
                }
                this.LLJILJIL.LIZ = intrinsicWidth;
                float width = getWidth() / drawable.getIntrinsicWidth();
                float height = getHeight() / drawable.getIntrinsicHeight();
                if (width >= height) {
                    width = height;
                }
                if (this.LLILLJJLI == 200 && this.LLILLL == 201) {
                    this.LLJILJIL.LIZIZ = intrinsicWidth;
                } else {
                    this.LLJILJIL.LIZIZ = width;
                }
                WEX wex2 = this.LLJILJIL;
                WEW wew4 = new WEW();
                wex2.LIZLLL = wew4;
                wew4.LJLIL = this.LLILZLL;
                wew4.LJLILLLLZI = this.LLIZ;
                wew4.LJLJI = this.LLILZ;
                wew4.LJLJJI = this.LLILZIL;
                wex2.LJ = new WEW();
                float intrinsicWidth2 = drawable.getIntrinsicWidth() * this.LLJILJIL.LIZIZ;
                float intrinsicHeight2 = drawable.getIntrinsicHeight();
                WEX wex3 = this.LLJILJIL;
                float f = intrinsicHeight2 * wex3.LIZIZ;
                wex3.LJ.LJLIL = (getWidth() - intrinsicWidth2) / 2.0f;
                this.LLJILJIL.LJ.LJLILLLLZI = (getHeight() - f) / 2.0f;
                WEX wex4 = this.LLJILJIL;
                WEW wew5 = wex4.LJ;
                wew5.LJLJI = intrinsicWidth2;
                wew5.LJLJJI = f;
                wex4.LJFF = new WEW();
            }
            WEX wex5 = this.LLJILJIL;
            if (wex5 == null) {
                super.onDraw(canvas);
                return;
            }
            if (this.LLJ) {
                int i = this.LLILLIZIL;
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            wex5.LIZJ = wex5.LIZ;
                            try {
                                WEW wew6 = wex5.LJ;
                                if (wew6 != null) {
                                    wex5.LJFF = (WEW) wew6.clone();
                                }
                            } catch (CloneNotSupportedException e) {
                                C16880lQ.LLLLIIL(e);
                            }
                        }
                    } else {
                        wex5.LIZJ = wex5.LIZIZ;
                        try {
                            WEW wew7 = wex5.LJ;
                            if (wew7 != null) {
                                wex5.LJFF = (WEW) wew7.clone();
                            }
                        } catch (CloneNotSupportedException e2) {
                            C16880lQ.LLLLIIL(e2);
                        }
                    }
                } else {
                    wex5.LIZJ = wex5.LIZ;
                    try {
                        WEW wew8 = wex5.LIZLLL;
                        if (wew8 != null) {
                            wex5.LJFF = (WEW) wew8.clone();
                        }
                    } catch (CloneNotSupportedException e3) {
                        C16880lQ.LLLLIIL(e3);
                    }
                }
            }
            canvas.drawPaint(this.LLJI);
            int saveCount = canvas.getSaveCount();
            canvas.save();
            if (getDrawable() != null && (wex = this.LLJILJIL) != null && (matrix = this.LLJIJIL) != null) {
                float f2 = wex.LIZJ;
                matrix.setScale(f2, f2);
                Matrix matrix2 = this.LLJIJIL;
                float intrinsicWidth3 = (this.LLJILJIL.LIZJ * r11.getIntrinsicWidth()) / 2.0f;
                WEX wex6 = this.LLJILJIL;
                matrix2.postTranslate(-(intrinsicWidth3 - (wex6.LJFF.LJLJI / 2.0f)), -(((wex6.LIZJ * r11.getIntrinsicHeight()) / 2.0f) - (this.LLJILJIL.LJFF.LJLJJI / 2.0f)));
            }
            WEW wew9 = this.LLJILJIL.LJFF;
            if (wew9 != null) {
                canvas.translate(wew9.LJLIL, wew9.LJLILLLLZI);
                WEW wew10 = this.LLJILJIL.LJFF;
                canvas.clipRect(0.0f, 0.0f, wew10.LJLJI, wew10.LJLJJI);
            }
            canvas.concat(this.LLJIJIL);
            getDrawable().draw(canvas);
            canvas.restoreToCount(saveCount);
            if (this.LLJ && this.LLILLIZIL != 3) {
                this.LLJ = false;
                int i2 = this.LLILLJJLI;
                if (i2 != 100) {
                    if (i2 != 200 || this.LLJILJIL == null) {
                        return;
                    }
                    ValueAnimator valueAnimator = new ValueAnimator();
                    valueAnimator.setDuration(this.LLIZLLLIL);
                    valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
                    if (this.LLILLL == 201) {
                        WEX wex7 = this.LLJILJIL;
                        WEW wew11 = wex7.LIZLLL;
                        if (wew11 != null && (wew3 = wex7.LJ) != null) {
                            PropertyValuesHolder ofFloat6 = PropertyValuesHolder.ofFloat("left", wew11.LJLIL, wew3.LJLIL);
                            WEX wex8 = this.LLJILJIL;
                            PropertyValuesHolder ofFloat7 = PropertyValuesHolder.ofFloat("top", wex8.LIZLLL.LJLILLLLZI, wex8.LJ.LJLILLLLZI);
                            WEX wex9 = this.LLJILJIL;
                            PropertyValuesHolder ofFloat8 = PropertyValuesHolder.ofFloat("width", wex9.LIZLLL.LJLJI, wex9.LJ.LJLJI);
                            WEX wex10 = this.LLJILJIL;
                            valueAnimator.setValues(ofFloat6, ofFloat7, ofFloat8, PropertyValuesHolder.ofFloat("height", wex10.LIZLLL.LJLJJI, wex10.LJ.LJLJJI));
                        }
                        valueAnimator.addUpdateListener(new AUListenerS101S0100000_14(this, 58));
                    } else {
                        WEX wex11 = this.LLJILJIL;
                        WEW wew12 = wex11.LIZLLL;
                        if (wew12 != null && (wew2 = wex11.LJ) != null) {
                            PropertyValuesHolder ofFloat9 = PropertyValuesHolder.ofFloat("left", wew12.LJLIL, wew2.LJLIL);
                            WEX wex12 = this.LLJILJIL;
                            PropertyValuesHolder ofFloat10 = PropertyValuesHolder.ofFloat("top", wex12.LIZLLL.LJLILLLLZI, wex12.LJ.LJLILLLLZI);
                            WEX wex13 = this.LLJILJIL;
                            PropertyValuesHolder ofFloat11 = PropertyValuesHolder.ofFloat("width", wex13.LIZLLL.LJLJI, wex13.LJ.LJLJI);
                            WEX wex14 = this.LLJILJIL;
                            PropertyValuesHolder ofFloat12 = PropertyValuesHolder.ofFloat("height", wex14.LIZLLL.LJLJJI, wex14.LJ.LJLJJI);
                            WEX wex15 = this.LLJILJIL;
                            valueAnimator.setValues(PropertyValuesHolder.ofFloat("scale", wex15.LIZ, wex15.LIZIZ), ofFloat9, ofFloat10, ofFloat11, ofFloat12);
                        }
                        valueAnimator.addUpdateListener(new AUListenerS101S0100000_14(this, 59));
                    }
                    valueAnimator.addListener(new ALAdapterS11S0100000_14(this, 56));
                    if (this.LLILLIZIL == 1) {
                        valueAnimator.start();
                        return;
                    } else {
                        valueAnimator.reverse();
                        return;
                    }
                }
                if (this.LLJILJIL == null) {
                    return;
                }
                ValueAnimator valueAnimator2 = new ValueAnimator();
                valueAnimator2.setDuration(this.LLIZLLLIL);
                valueAnimator2.setInterpolator(new AccelerateDecelerateInterpolator());
                WEX wex16 = this.LLJILJIL;
                WEW wew13 = wex16.LIZLLL;
                if (wew13 != null && (wew = wex16.LJ) != null) {
                    if (wew13.LJLJI == 0.0f || wew13.LJLJJI == 0.0f) {
                        float f3 = wex16.LIZIZ;
                        ofFloat = PropertyValuesHolder.ofFloat("scale", f3, f3);
                        float f4 = this.LLJILJIL.LJ.LJLIL;
                        ofFloat2 = PropertyValuesHolder.ofFloat("left", f4, f4);
                        float f5 = this.LLJILJIL.LJ.LJLILLLLZI;
                        ofFloat3 = PropertyValuesHolder.ofFloat("top", f5, f5);
                        float f6 = this.LLJILJIL.LJ.LJLJI;
                        ofFloat4 = PropertyValuesHolder.ofFloat("width", f6, f6);
                        float f7 = this.LLJILJIL.LJ.LJLJJI;
                        ofFloat5 = PropertyValuesHolder.ofFloat("height", f7, f7);
                    } else if (wew.LJLJI == 0.0f || wew.LJLJJI == 0.0f) {
                        float f8 = wex16.LIZ;
                        ofFloat = PropertyValuesHolder.ofFloat("scale", f8, f8);
                        float f9 = this.LLJILJIL.LIZLLL.LJLIL;
                        ofFloat2 = PropertyValuesHolder.ofFloat("left", f9, f9);
                        float f10 = this.LLJILJIL.LIZLLL.LJLILLLLZI;
                        ofFloat3 = PropertyValuesHolder.ofFloat("top", f10, f10);
                        float f11 = this.LLJILJIL.LIZLLL.LJLJI;
                        ofFloat4 = PropertyValuesHolder.ofFloat("width", f11, f11);
                        float f12 = this.LLJILJIL.LIZLLL.LJLJJI;
                        ofFloat5 = PropertyValuesHolder.ofFloat("height", f12, f12);
                    } else {
                        ofFloat = PropertyValuesHolder.ofFloat("scale", wex16.LIZ, wex16.LIZIZ);
                        WEX wex17 = this.LLJILJIL;
                        ofFloat2 = PropertyValuesHolder.ofFloat("left", wex17.LIZLLL.LJLIL, wex17.LJ.LJLIL);
                        WEX wex18 = this.LLJILJIL;
                        ofFloat3 = PropertyValuesHolder.ofFloat("top", wex18.LIZLLL.LJLILLLLZI, wex18.LJ.LJLILLLLZI);
                        WEX wex19 = this.LLJILJIL;
                        ofFloat4 = PropertyValuesHolder.ofFloat("width", wex19.LIZLLL.LJLJI, wex19.LJ.LJLJI);
                        WEX wex20 = this.LLJILJIL;
                        ofFloat5 = PropertyValuesHolder.ofFloat("height", wex20.LIZLLL.LJLJJI, wex20.LJ.LJLJJI);
                    }
                    valueAnimator2.setValues(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5);
                }
                valueAnimator2.addUpdateListener(new AUListenerS101S0100000_14(this, 60));
                valueAnimator2.addListener(new ALAdapterS11S0100000_14(this, 57));
                if (this.LLILLIZIL == 1) {
                    valueAnimator2.start();
                    return;
                } else {
                    valueAnimator2.reverse();
                    return;
                }
            }
            return;
        }
        canvas.drawPaint(this.LLJI);
        try {
            super.onDraw(canvas);
        } catch (Exception e4) {
            C16880lQ.LLLLIIL(e4);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C81250Vug<V92> c81250Vug = this.LLILL;
        if (c81250Vug == null) {
            return false;
        }
        if (!c81250Vug.LJI(motionEvent) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setController(InterfaceC81252Vui interfaceC81252Vui) {
        C81250Vug<V92> c81250Vug = this.LLILL;
        if (c81250Vug != null) {
            c81250Vug.LJII(interfaceC81252Vui);
        }
    }

    public void setDuration(long j) {
        this.LLIZLLLIL = j;
    }

    public void setOnTransferListener(WEY wey) {
        this.LLJILJILJ = wey;
    }

    public void setState(int i) {
        this.LLILLIZIL = i;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        super.verifyDrawable(drawable);
        C81250Vug<V92> c81250Vug = this.LLILL;
        if (c81250Vug == null) {
            return false;
        }
        c81250Vug.LIZLLL.getClass();
        V92 v92 = this.LLILL.LIZLLL;
        v92.getClass();
        if (drawable != v92.LIZLLL) {
            return false;
        }
        return true;
    }

    public WET(Context context, int i) {
        super(context);
        this.LLILLJJLI = 100;
        this.LLILLL = 201;
        this.LLIZLLLIL = 300L;
        this.LLJIJIL = new Matrix();
        Paint paint = new Paint();
        this.LLJI = paint;
        paint.setAlpha(0);
        if (this.LLILL == null) {
            V92 LIZ = new C79077V1t(getResources()).LIZ();
            getContext();
            this.LLILL = new C81250Vug<>(LIZ);
        }
    }
}

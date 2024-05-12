package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8ei, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C216568ei extends AbstractC216578ej<C215958dj> {
    public static final C216618en LJIILLIIL = new InterfaceC216878fD() { // from class: X.8en
        @Override // X.InterfaceC216878fD
        public final int LIZIZ() {
            return 20002;
        }

        @Override // X.InterfaceC216878fD
        public final AbstractC216708ew LIZ() {
            return new C216568ei();
        }
    };
    public float LJIIL;
    public float LJIILIIL;
    public final C216548eg LJIILJJIL = new AbstractC216708ew() { // from class: X.8eg
        public int LJIIJJI;
        public T5R LJIILIIL;
        public Layout LJIILJJIL;
        public final T5S LJIIJ = new T5S();
        public float LJIIL = 1.0f;

        @Override // X.AbstractC216708ew
        public final /* bridge */ /* synthetic */ int LIZJ() {
            return 1001;
        }

        @Override // X.AbstractC216708ew
        public final void LJIIIZ() {
            super.LJIIIZ();
            this.LJIILIIL = null;
            this.LJIILJJIL = null;
            this.LJIIJ.reset();
            this.LJIILIIL = null;
        }

        @Override // X.AbstractC216708ew
        public final void LJI(AbstractC216018dp abstractC216018dp) {
            this.LJIIJ.setFlags(5);
        }

        @Override // X.AbstractC216708ew
        public final void LJIIIIZZ(C216758f1 config) {
            CharSequence charSequence;
            StaticLayout staticLayout;
            o.LJIIIZ(config, "config");
            float f = config.LIZLLL.LIZIZ;
            this.LJIIJ.setTextSize(f);
            this.LJIIJJI = (int) (C32151Nz.LJIIZILJ(4) + f);
            this.LJIIJ.setTypeface(config.LIZLLL.LIZLLL);
            T5R t5r = this.LJIILIIL;
            if (t5r == null || this.LJIIL != f) {
                C215958dj c215958dj = (C215958dj) this.LIZ;
                if (c215958dj == null || (charSequence = c215958dj.LJIILL) == null) {
                    charSequence = "";
                }
                t5r = new T5R(charSequence);
                C8FU[] spans = (C8FU[]) t5r.getSpans(0, t5r.length(), C8FU.class);
                C8FU c8fu = new C8FU(this.LJIIJJI);
                o.LJIIIIZZ(spans, "spans");
                for (C8FU c8fu2 : spans) {
                    t5r.removeSpan(c8fu2);
                }
                t5r.setSpan(c8fu, 0, t5r.length(), 17);
                this.LJIILIIL = t5r;
                this.LJIIL = f;
            }
            if (!ujb.o.LJJJJJL(t5r)) {
                T5S t5s = this.LJIIJ;
                t5s.setTypeface(config.LIZLLL.LIZLLL);
                t5s.setTextSize(f);
                t5s.setStrokeWidth(config.LIZLLL.LJ);
                T5S paint = this.LJIIJ;
                o.LJIIIZ(paint, "paint");
                if (Build.VERSION.SDK_INT >= 23) {
                    staticLayout = StaticLayout.Builder.obtain(t5r, 0, t5r.length(), paint, Integer.MAX_VALUE).build();
                    o.LJIIIIZZ(staticLayout, "{\n            StaticLayo…       .build()\n        }");
                } else {
                    staticLayout = new StaticLayout(t5r, paint, Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
                }
                this.LIZLLL = staticLayout.getLineWidth(0);
                this.LJ = staticLayout.getHeight();
                this.LJIILJJIL = staticLayout;
                return;
            }
            this.LIZLLL = 0.0f;
            this.LJ = 0.0f;
        }

        @Override // X.AbstractC216708ew
        public final void LJII(Canvas canvas, C216758f1 config) {
            CharSequence charSequence;
            int i;
            int i2;
            Integer num;
            TextPaint paint;
            Integer num2;
            o.LJIIIZ(canvas, "canvas");
            o.LJIIIZ(config, "config");
            C215958dj c215958dj = (C215958dj) this.LIZ;
            if (c215958dj == null || (charSequence = c215958dj.LJIILL) == null || ujb.o.LJJJJJL(charSequence)) {
                return;
            }
            canvas.save();
            canvas.translate(this.LIZIZ, this.LIZJ);
            C215958dj c215958dj2 = (C215958dj) this.LIZ;
            if (c215958dj2 != null && (num2 = c215958dj2.LJIILLIIL) != null) {
                i = num2.intValue();
            } else {
                i = config.LIZLLL.LIZJ;
            }
            Layout layout = this.LJIILJJIL;
            if (layout != null && (paint = layout.getPaint()) != null) {
                paint.setColor(i);
            }
            Layout layout2 = this.LJIILJJIL;
            if (layout2 == null) {
                return;
            }
            C216348eM c216348eM = config.LIZLLL;
            float f = c216348eM.LJ;
            if (f > 1.0E-4d) {
                int i3 = c216348eM.LJFF;
                TextPaint paint2 = layout2.getPaint();
                paint2.setStyle(Paint.Style.STROKE);
                paint2.setColor(i3);
                paint2.setStrokeWidth(f);
                layout2.draw(canvas);
            }
            C215958dj c215958dj3 = (C215958dj) this.LIZ;
            if (c215958dj3 != null && (num = c215958dj3.LJIILLIIL) != null) {
                i2 = num.intValue();
            } else {
                i2 = config.LIZLLL.LIZJ;
            }
            TextPaint paint3 = layout2.getPaint();
            paint3.setStyle(Paint.Style.FILL);
            paint3.setColor(i2);
            paint3.setStrokeWidth(f);
            layout2.draw(canvas);
        }
    };
    public final C216518ed LJIILL;

    @Override // X.AbstractC216708ew
    public final int LIZJ() {
        return 20002;
    }

    public final void LJIIL() {
        float f;
        C216518ed c216518ed = this.LJIILL;
        float f2 = this.LJIIL;
        c216518ed.LIZIZ = f2;
        float f3 = this.LJIILIIL;
        c216518ed.LIZJ = f3;
        C216548eg c216548eg = this.LJIILJJIL;
        T t = this.LIZ;
        C215958dj c215958dj = (C215958dj) t;
        float f4 = 0.0f;
        if (c215958dj != null) {
            f = c215958dj.LJIL;
        } else {
            f = 0.0f;
        }
        c216548eg.LIZIZ = f2 + f;
        C215958dj c215958dj2 = (C215958dj) t;
        if (c215958dj2 != null) {
            f4 = c215958dj2.LJJ;
        }
        c216548eg.LIZJ = f3 + f4;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.8eg] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.8ed] */
    public C216568ei() {
        final AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(this, 1545);
        this.LJIILL = new AbstractC216708ew<C215958dj>(aqS153S0100000_3) { // from class: X.8ed
            public final InterfaceC65784Pro<float[]> LJIIJ;
            public final C216168e4 LJIIJJI;
            public final Integer LJIIL;
            public final C62822Ol8 LJIILIIL;
            public final RectF LJIILJJIL;

            @Override // X.AbstractC216708ew
            public final int LIZJ() {
                return 20003;
            }

            public final Paint LJIIL() {
                return (Paint) this.LJIILIIL.getValue();
            }

            {
                C216168e4 c216168e4;
                C216168e4 c216168e42;
                this.LJIIJ = aqS153S0100000_3;
                boolean z = C61447O9r.LJIIIZ;
                if (z) {
                    c216168e4 = C216228eA.LJIILJJIL;
                } else {
                    c216168e4 = C216068du.LJIILJJIL;
                }
                this.LJIIJJI = c216168e4;
                Context LIZIZ = EF7.LIZIZ();
                if (z) {
                    c216168e42 = C216228eA.LJIILJJIL;
                } else {
                    c216168e42 = C216068du.LJIILJJIL;
                }
                this.LJIIL = C79045V0n.LJI(c216168e42.LJIIJ, LIZIZ);
                this.LJIILIIL = C221108m2.LIZIZ(C216528ee.LJLIL);
                this.LJIILJJIL = new RectF();
            }

            @Override // X.AbstractC216708ew
            public final void LJIIIIZZ(C216758f1 config) {
                float f;
                o.LJIIIZ(config, "config");
                float[] invoke = this.LJIIJ.invoke();
                float f2 = invoke[0];
                C215958dj c215958dj = (C215958dj) this.LIZ;
                float f3 = 0.0f;
                if (c215958dj != null) {
                    f = c215958dj.LJIL;
                } else {
                    f = 0.0f;
                }
                float f4 = 2;
                this.LIZLLL = (float) Math.ceil((f * f4) + f2);
                float f5 = invoke[1];
                C215958dj c215958dj2 = (C215958dj) this.LIZ;
                if (c215958dj2 != null) {
                    f3 = c215958dj2.LJJ;
                }
                this.LJ = (float) Math.ceil((f3 * f4) + f5);
            }

            @Override // X.AbstractC216708ew
            public final void LJI(C215958dj c215958dj) {
            }

            @Override // X.AbstractC216708ew
            public final void LJII(Canvas canvas, C216758f1 config) {
                boolean z;
                int i;
                float f;
                float LIZIZ;
                Float f2;
                Float f3;
                o.LJIIIZ(canvas, "canvas");
                o.LJIIIZ(config, "config");
                canvas.save();
                canvas.translate(this.LIZIZ, this.LIZJ);
                C215958dj c215958dj = (C215958dj) this.LIZ;
                if (c215958dj != null && c215958dj.LJIIL) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    Integer num = this.LJIIL;
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = -16777216;
                    }
                    LJIIL().setColor(i);
                    Paint LJIIL = LJIIL();
                    C215958dj c215958dj2 = (C215958dj) this.LIZ;
                    if (c215958dj2 != null && (f3 = c215958dj2.LJIJ) != null) {
                        f = f3.floatValue();
                    } else {
                        f = 0.0f;
                    }
                    LJIIL.setStrokeWidth(f);
                    LJIIL().setStyle(Paint.Style.FILL);
                    int[] iArr = {0, -16777216, -16777216, 0};
                    C215958dj c215958dj3 = (C215958dj) this.LIZ;
                    if ((c215958dj3 != null && (f2 = c215958dj3.LJIJ) != null && f2.floatValue() != 0.0f) || this.LIZLLL < C7MY.LIZIZ(24)) {
                        LIZIZ = 0.0f;
                    } else {
                        LIZIZ = C7MY.LIZIZ(12) / this.LIZLLL;
                    }
                    LJIIL().setShader(new LinearGradient(0.0f, 0.0f, this.LIZLLL, 0.0f, iArr, new float[]{0.0f, LIZIZ, 1 - LIZIZ, 1.0f}, Shader.TileMode.CLAMP));
                    float strokeWidth = LJIIL().getStrokeWidth() / 2.0f;
                    float f4 = this.LIZLLL - strokeWidth;
                    float f5 = this.LJ - strokeWidth;
                    float LJFF = this.LJIIJJI.LJFF();
                    float LJFF2 = this.LJIIJJI.LJFF();
                    Paint LJIIL2 = LJIIL();
                    this.LJIILJJIL.set(strokeWidth, strokeWidth, f4, f5);
                    canvas.drawRoundRect(this.LJIILJJIL, LJFF, LJFF2, LJIIL2);
                }
                C215958dj c215958dj4 = (C215958dj) this.LIZ;
                if (c215958dj4 != null) {
                    Float f6 = c215958dj4.LJIJ;
                    Integer num2 = c215958dj4.LJIIZILJ;
                    if (f6 != null && num2 != null && f6.floatValue() > 0.0f) {
                        LJIIL().setColor(num2.intValue());
                        LJIIL().setStrokeWidth(f6.floatValue());
                        LJIIL().setStyle(Paint.Style.STROKE);
                        LJIIL().setStrokeJoin(Paint.Join.ROUND);
                        LJIIL().setShader(null);
                        float strokeWidth2 = LJIIL().getStrokeWidth() / 2.0f;
                        float f7 = this.LIZLLL - strokeWidth2;
                        float f8 = this.LJ - strokeWidth2;
                        float LJFF3 = this.LJIIJJI.LJFF();
                        float LJFF4 = this.LJIIJJI.LJFF();
                        Paint LJIIL3 = LJIIL();
                        this.LJIILJJIL.set(strokeWidth2, strokeWidth2, f7, f8);
                        canvas.drawRoundRect(this.LJIILJJIL, LJFF3, LJFF4, LJIIL3);
                    }
                }
                canvas.restore();
            }
        };
    }

    @Override // X.AbstractC216578ej, X.AbstractC216708ew
    public final void LJIIIZ() {
        super.LJIIIZ();
        LJIIIZ();
        LJIIIZ();
    }

    @Override // X.AbstractC216708ew
    public final float LIZLLL() {
        return this.LJIIL;
    }

    @Override // X.AbstractC216708ew
    public final float LJ() {
        return this.LJIILIIL;
    }

    @Override // X.AbstractC216708ew
    public final void LJI(AbstractC216018dp abstractC216018dp) {
        LIZ(abstractC216018dp);
        LIZ(abstractC216018dp);
    }

    @Override // X.AbstractC216708ew
    public final void LJIIIIZZ(C216758f1 config) {
        o.LJIIIZ(config, "config");
        C216548eg c216548eg = this.LJIILJJIL;
        c216548eg.getClass();
        c216548eg.LJIIIIZZ(config);
        C216518ed c216518ed = this.LJIILL;
        c216518ed.getClass();
        c216518ed.LJIIIIZZ(config);
        C216518ed c216518ed2 = this.LJIILL;
        this.LIZLLL = c216518ed2.LIZLLL;
        this.LJ = c216518ed2.LJ;
    }

    @Override // X.AbstractC216708ew
    public final void LJIIJ(float f) {
        this.LJIIL = f;
        LJIIL();
    }

    @Override // X.AbstractC216708ew
    public final void LJIIJJI(float f) {
        this.LJIILIIL = f;
        LJIIL();
    }

    @Override // X.AbstractC216708ew
    public final void LJII(Canvas canvas, C216758f1 config) {
        o.LJIIIZ(canvas, "canvas");
        o.LJIIIZ(config, "config");
        LIZIZ(canvas, config);
        LIZIZ(canvas, config);
    }
}

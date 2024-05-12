package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.291, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass291 extends AbstractC45041pk {
    public AbstractC22650uj<Float, Float> LJIL;
    public final List<AbstractC45041pk> LJJ;
    public final RectF LJJI;
    public final RectF LJJIFFI;
    public Boolean LJJII;
    public Boolean LJJIII;

    public final boolean LJIJI() {
        if (this.LJJIII == null) {
            for (int size = ((ArrayList) this.LJJ).size() - 1; size >= 0; size--) {
                AbstractC45041pk abstractC45041pk = (AbstractC45041pk) ListProtector.get(this.LJJ, size);
                if (abstractC45041pk instanceof AnonymousClass294) {
                    if (abstractC45041pk.LJIIL()) {
                        this.LJJIII = Boolean.TRUE;
                        return true;
                    }
                } else if ((abstractC45041pk instanceof AnonymousClass291) && ((AnonymousClass291) abstractC45041pk).LJIJI()) {
                    this.LJJIII = Boolean.TRUE;
                    return true;
                }
            }
            this.LJJIII = Boolean.FALSE;
        }
        return this.LJJIII.booleanValue();
    }

    @Override // X.AbstractC45041pk
    public final void LJIIZILJ(float f) {
        super.LJIIZILJ(f);
        if (C03970Dp.LIZ) {
            AbstractC22650uj<Float, Float> abstractC22650uj = this.LJIL;
            if (abstractC22650uj != null) {
                C0GY c0gy = this.LJIIL.LJLILLLLZI;
                f = ((abstractC22650uj.LJI().floatValue() * this.LJIILIIL.LIZIZ.LJIIJJI) - this.LJIILIIL.LIZIZ.LJIIIZ) / ((c0gy.LJIIJ - c0gy.LJIIIZ) + 0.01f);
            }
            if (this.LJIL == null) {
                C274816a c274816a = this.LJIILIIL;
                float f2 = c274816a.LJIILIIL;
                C0GY c0gy2 = c274816a.LIZIZ;
                f -= f2 / (c0gy2.LJIIJ - c0gy2.LJIIIZ);
            }
            float f3 = this.LJIILIIL.LJIIL;
            if (f3 != 0.0f) {
                f /= f3;
            }
            int size = ((ArrayList) this.LJJ).size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((AbstractC45041pk) ListProtector.get(this.LJJ, size)).LJIIZILJ(f);
                } else {
                    return;
                }
            }
        } else {
            if (this.LJIL != null) {
                f = (this.LJIL.LJI().floatValue() * 1000.0f) / this.LJIIL.LJLILLLLZI.LIZIZ();
            }
            C274816a c274816a2 = this.LJIILIIL;
            float f4 = c274816a2.LJIIL;
            if (f4 != 0.0f) {
                f /= f4;
            }
            float f5 = c274816a2.LJIILIIL;
            C0GY c0gy3 = c274816a2.LIZIZ;
            float f6 = f - (f5 / (c0gy3.LJIIJ - c0gy3.LJIIIZ));
            int size2 = ((ArrayList) this.LJJ).size();
            while (true) {
                size2--;
                if (size2 >= 0) {
                    ((AbstractC45041pk) ListProtector.get(this.LJJ, size2)).LJIIZILJ(f6);
                } else {
                    return;
                }
            }
        }
    }

    public final void LJIJ(RectF rectF) {
        if (C03970Dp.LIZ) {
            int size = ((ArrayList) this.LJJ).size();
            while (true) {
                size--;
                if (size >= 0) {
                    this.LJJI.set(0.0f, 0.0f, 0.0f, 0.0f);
                    ((AbstractC45041pk) ListProtector.get(this.LJJ, size)).LJIIJJI(this.LJJI, this.LJIIJJI);
                    rectF.union(this.LJJI);
                } else {
                    return;
                }
            }
        } else {
            this.LJJI.set(0.0f, 0.0f, 0.0f, 0.0f);
            int size2 = ((ArrayList) this.LJJ).size();
            while (true) {
                size2--;
                if (size2 >= 0) {
                    ((AbstractC45041pk) ListProtector.get(this.LJJ, size2)).LIZ(this.LJJI, this.LJIIJJI);
                    if (rectF.isEmpty()) {
                        rectF.set(this.LJJI);
                    } else {
                        rectF.set(Math.min(rectF.left, this.LJJI.left), Math.min(rectF.top, this.LJJI.top), Math.max(rectF.right, this.LJJI.right), Math.max(rectF.bottom, this.LJJI.bottom));
                    }
                } else {
                    return;
                }
            }
        }
    }

    @Override // X.AbstractC45041pk, X.InterfaceC34831Yh
    public final void LIZ(RectF rectF, Matrix matrix) {
        super.LIZ(rectF, matrix);
        LJIJ(rectF);
    }

    @Override // X.AbstractC45041pk, X.InterfaceC263811u
    public final <T> void LIZIZ(T t, C06800Om<T> c06800Om) {
        super.LIZIZ(t, c06800Om);
        if (t == C0GO.LJIL) {
            if (c06800Om == null) {
                if (C03970Dp.LIZ) {
                    AbstractC22650uj<Float, Float> abstractC22650uj = this.LJIL;
                    if (abstractC22650uj != null) {
                        abstractC22650uj.LJIIJ(null);
                        return;
                    }
                    return;
                }
                this.LJIL = null;
                return;
            }
            C35171Zp c35171Zp = new C35171Zp(c06800Om);
            this.LJIL = c35171Zp;
            if (C03970Dp.LIZ) {
                c35171Zp.LIZ(this);
            }
            LJFF(this.LJIL);
        }
    }

    @Override // X.AbstractC45041pk
    public final void LJIIJJI(RectF rectF, Matrix matrix) {
        super.LJIIJJI(rectF, matrix);
        LJIJ(rectF);
    }

    @Override // X.AbstractC45041pk
    public final void LJIIJ(Canvas canvas, Matrix matrix, int i) {
        canvas.save();
        RectF rectF = this.LJJIFFI;
        C274816a c274816a = this.LJIILIIL;
        rectF.set(0.0f, 0.0f, c274816a.LJIILJJIL, c274816a.LJIILL);
        matrix.mapRect(this.LJJIFFI);
        for (int size = ((ArrayList) this.LJJ).size() - 1; size >= 0; size--) {
            if (this.LJJIFFI.isEmpty() || canvas.clipRect(this.LJJIFFI)) {
                ((AbstractC45041pk) ListProtector.get(this.LJJ, size)).LIZJ(canvas, matrix, i);
            }
        }
        canvas.restore();
        C0GR.LIZ();
    }

    public AnonymousClass291(final C04740Go c04740Go, C274816a c274816a, List<C274816a> list, C0GY c0gy) {
        super(c04740Go, c274816a);
        AbstractC45041pk abstractC45041pk;
        AbstractC45041pk abstractC45041pk2;
        this.LJJ = new ArrayList();
        this.LJJI = new RectF();
        this.LJJIFFI = new RectF();
        C44451on c44451on = c274816a.LJIJ;
        if (c44451on != null) {
            AbstractC22650uj<Float, Float> LIZ = c44451on.LIZ();
            this.LJIL = LIZ;
            LJFF(LIZ);
            this.LJIL.LIZ(this);
        } else {
            this.LJIL = null;
        }
        C0M5 c0m5 = new C0M5(c0gy.LJII.size());
        int size = list.size() - 1;
        AbstractC45041pk abstractC45041pk3 = null;
        while (true) {
            if (size >= 0) {
                final C274816a c274816a2 = (C274816a) ListProtector.get(list, size);
                switch (C16W.LIZ[c274816a2.LJ.ordinal()]) {
                    case 1:
                        abstractC45041pk2 = new AbstractC45041pk(c04740Go, c274816a2) { // from class: X.294
                            public final C43611nR LJIL;

                            {
                                super(c04740Go, c274816a2);
                                C43611nR c43611nR = new C43611nR(c04740Go, this, new C38851fl("__container", c274816a2.LIZ));
                                this.LJIL = c43611nR;
                                c43611nR.LIZLLL(Collections.emptyList(), Collections.emptyList());
                            }

                            @Override // X.AbstractC45041pk, X.InterfaceC34831Yh
                            public final void LIZ(RectF rectF, Matrix matrix) {
                                super.LIZ(rectF, matrix);
                                this.LJIL.LIZ(rectF, this.LJIIJJI);
                            }

                            @Override // X.AbstractC45041pk
                            public final void LJIIJJI(RectF rectF, Matrix matrix) {
                                super.LJIIJJI(rectF, matrix);
                                this.LJIL.LIZ(rectF, this.LJIIJJI);
                            }

                            @Override // X.AbstractC45041pk
                            public final void LJIIJ(Canvas canvas, Matrix matrix, int i) {
                                this.LJIL.LIZJ(canvas, matrix, i);
                            }

                            @Override // X.AbstractC45041pk
                            public final void LJIILL(C263711t c263711t, int i, List<C263711t> list2, C263711t c263711t2) {
                                this.LJIL.LJ(c263711t, i, list2, c263711t2);
                            }
                        };
                        break;
                    case 2:
                        abstractC45041pk2 = new AnonymousClass291(c04740Go, c274816a2, c0gy.LIZJ.get(c274816a2.LJI), c0gy);
                        break;
                    case 3:
                        abstractC45041pk2 = new AbstractC45041pk(c04740Go, c274816a2) { // from class: X.295
                            public final RectF LJIL = new RectF();
                            public final Paint LJJ;
                            public final float[] LJJI;
                            public final Path LJJIFFI;
                            public final C274816a LJJII;
                            public C35171Zp LJJIII;

                            {
                                Paint paint = new Paint();
                                this.LJJ = paint;
                                this.LJJI = new float[8];
                                this.LJJIFFI = new Path();
                                this.LJJII = c274816a2;
                                paint.setAlpha(0);
                                paint.setStyle(Paint.Style.FILL);
                                paint.setColor(c274816a2.LJIIJJI);
                            }

                            @Override // X.AbstractC45041pk, X.InterfaceC34831Yh
                            public final void LIZ(RectF rectF, Matrix matrix) {
                                super.LIZ(rectF, matrix);
                                RectF rectF2 = this.LJIL;
                                C274816a c274816a3 = this.LJJII;
                                rectF2.set(0.0f, 0.0f, c274816a3.LJIIIZ, c274816a3.LJIIJ);
                                this.LJIIJJI.mapRect(this.LJIL);
                                rectF.set(this.LJIL);
                            }

                            @Override // X.AbstractC45041pk, X.InterfaceC263811u
                            public final <T> void LIZIZ(T t, C06800Om<T> c06800Om) {
                                super.LIZIZ(t, c06800Om);
                                if (t == C0GO.LJJ) {
                                    if (c06800Om == null) {
                                        this.LJJIII = null;
                                    } else {
                                        this.LJJIII = new C35171Zp(c06800Om);
                                    }
                                }
                            }

                            @Override // X.AbstractC45041pk
                            public final void LJIIJJI(RectF rectF, Matrix matrix) {
                                super.LJIIJJI(rectF, matrix);
                                RectF rectF2 = this.LJIL;
                                C274816a c274816a3 = this.LJJII;
                                rectF2.set(0.0f, 0.0f, c274816a3.LJIIIZ, c274816a3.LJIIJ);
                                this.LJIIJJI.mapRect(this.LJIL);
                                rectF.set(this.LJIL);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // X.AbstractC45041pk
                            public final void LJIIJ(Canvas canvas, Matrix matrix, int i) {
                                int alpha = Color.alpha(this.LJJII.LJIIJJI);
                                if (alpha == 0) {
                                    return;
                                }
                                int intValue = (int) ((((alpha / 255.0f) * LJI().intValue()) / 100.0f) * (i / 255.0f) * 255.0f);
                                this.LJJ.setAlpha(intValue);
                                C35171Zp c35171Zp = this.LJJIII;
                                if (c35171Zp != null) {
                                    this.LJJ.setColorFilter((ColorFilter) c35171Zp.LJI());
                                }
                                if (intValue > 0) {
                                    float[] fArr = this.LJJI;
                                    fArr[0] = 0.0f;
                                    fArr[1] = 0.0f;
                                    C274816a c274816a3 = this.LJJII;
                                    float f = c274816a3.LJIIIZ;
                                    fArr[2] = f;
                                    fArr[3] = 0.0f;
                                    fArr[4] = f;
                                    float f2 = c274816a3.LJIIJ;
                                    fArr[5] = f2;
                                    fArr[6] = 0.0f;
                                    fArr[7] = f2;
                                    matrix.mapPoints(fArr);
                                    this.LJJIFFI.reset();
                                    Path path = this.LJJIFFI;
                                    float[] fArr2 = this.LJJI;
                                    path.moveTo(fArr2[0], fArr2[1]);
                                    Path path2 = this.LJJIFFI;
                                    float[] fArr3 = this.LJJI;
                                    path2.lineTo(fArr3[2], fArr3[3]);
                                    Path path3 = this.LJJIFFI;
                                    float[] fArr4 = this.LJJI;
                                    path3.lineTo(fArr4[4], fArr4[5]);
                                    Path path4 = this.LJJIFFI;
                                    float[] fArr5 = this.LJJI;
                                    path4.lineTo(fArr5[6], fArr5[7]);
                                    Path path5 = this.LJJIFFI;
                                    float[] fArr6 = this.LJJI;
                                    path5.lineTo(fArr6[0], fArr6[1]);
                                    this.LJJIFFI.close();
                                    canvas.drawPath(this.LJJIFFI, this.LJJ);
                                }
                            }
                        };
                        break;
                    case 4:
                        abstractC45041pk2 = new AbstractC45041pk(c04740Go, c274816a2) { // from class: X.292
                            public final Paint LJIL;
                            public final Rect LJJ = new Rect();
                            public final Rect LJJI = new Rect();
                            public final C04750Gp LJJIFFI;
                            public C35171Zp LJJII;

                            /* JADX WARN: Multi-variable type inference failed */
                            public final Bitmap LJIJ() {
                                String str;
                                String str2 = this.LJIILIIL.LJI;
                                C04740Go c04740Go2 = this.LJIIL;
                                C10M LJIILIIL = c04740Go2.LJIILIIL();
                                Bitmap bitmap = null;
                                if (LJIILIIL == null) {
                                    return null;
                                }
                                if (C03970Dp.LIZ) {
                                    try {
                                        bitmap = LJIILIIL.LIZ(str2);
                                        return bitmap;
                                    } catch (IllegalStateException e) {
                                        Drawable.Callback callback = c04740Go2.getCallback();
                                        if (callback != null && (callback instanceof C29701Eo)) {
                                            str = ((C29701Eo) callback).getAnimationName();
                                        } else {
                                            str = bitmap;
                                        }
                                        if (!c04740Go2.LJLJL && !C03970Dp.LJIIIZ) {
                                            if (!C03970Dp.LIZ || C04020Du.LIZ) {
                                                StringBuilder LIZIZ = C25620zW.LIZIZ("animName:", str, " message:");
                                                LIZIZ.append(e.getMessage());
                                                throw new IllegalStateException(X1D.LIZIZ(LIZIZ));
                                            }
                                            return bitmap;
                                        }
                                        return bitmap;
                                    }
                                }
                                return LJIILIIL.LIZ(str2);
                            }

                            public final void LJIJI(RectF rectF) {
                                int width;
                                int height;
                                Bitmap LJIJ = LJIJ();
                                if (LJIJ != null) {
                                    if (C03970Dp.LIZ) {
                                        C04750Gp c04750Gp = this.LJJIFFI;
                                        if (c04750Gp != null && c04750Gp.LJII) {
                                            width = c04750Gp.LIZ;
                                        } else {
                                            width = LJIJ.getWidth();
                                        }
                                        float LIZLLL = C06310Mp.LIZLLL() * width;
                                        C04750Gp c04750Gp2 = this.LJJIFFI;
                                        if (c04750Gp2 != null && c04750Gp2.LJII) {
                                            height = c04750Gp2.LIZIZ;
                                        } else {
                                            height = LJIJ.getHeight();
                                        }
                                        rectF.set(0.0f, 0.0f, LIZLLL, C06310Mp.LIZLLL() * height);
                                    } else {
                                        rectF.set(rectF.left, rectF.top, Math.min(rectF.right, LJIJ.getWidth()), Math.min(rectF.bottom, LJIJ.getHeight()));
                                    }
                                    this.LJIIJJI.mapRect(rectF);
                                }
                            }

                            {
                                java.util.Map<String, C04750Gp> map;
                                if (C03970Dp.LIZ) {
                                    if (C03970Dp.LJII && C04010Dt.LIZ) {
                                        this.LJIL = new C19440pY(1);
                                    } else {
                                        this.LJIL = new C19440pY(3);
                                    }
                                } else {
                                    this.LJIL = new Paint(3);
                                }
                                C0GY c0gy2 = c274816a2.LIZIZ;
                                if (c0gy2 != null && (map = c0gy2.LIZLLL) != null) {
                                    this.LJJIFFI = map.get(c274816a2.LJI);
                                }
                            }

                            @Override // X.AbstractC45041pk, X.InterfaceC34831Yh
                            public final void LIZ(RectF rectF, Matrix matrix) {
                                super.LIZ(rectF, matrix);
                                LJIJI(rectF);
                            }

                            @Override // X.AbstractC45041pk, X.InterfaceC263811u
                            public final <T> void LIZIZ(T t, C06800Om<T> c06800Om) {
                                super.LIZIZ(t, c06800Om);
                                if (t == C0GO.LJJ) {
                                    if (c06800Om == null) {
                                        this.LJJII = null;
                                    } else {
                                        this.LJJII = new C35171Zp(c06800Om);
                                    }
                                }
                            }

                            @Override // X.AbstractC45041pk
                            public final void LJIIJJI(RectF rectF, Matrix matrix) {
                                super.LJIIJJI(rectF, matrix);
                                LJIJI(rectF);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // X.AbstractC45041pk
                            public final void LJIIJ(Canvas canvas, Matrix matrix, int i) {
                                int width;
                                int height;
                                Bitmap LJIJ = LJIJ();
                                if (LJIJ == null || LJIJ.isRecycled()) {
                                    return;
                                }
                                float LIZLLL = C06310Mp.LIZLLL();
                                this.LJIL.setAlpha(i);
                                C35171Zp c35171Zp = this.LJJII;
                                if (c35171Zp != null) {
                                    this.LJIL.setColorFilter((ColorFilter) c35171Zp.LJI());
                                }
                                canvas.save();
                                canvas.concat(matrix);
                                this.LJJ.set(0, 0, LJIJ.getWidth(), LJIJ.getHeight());
                                Rect rect = this.LJJI;
                                C04750Gp c04750Gp = this.LJJIFFI;
                                if (c04750Gp != null && c04750Gp.LJII) {
                                    width = c04750Gp.LIZ;
                                } else {
                                    width = LJIJ.getWidth();
                                }
                                int i2 = (int) (width * LIZLLL);
                                C04750Gp c04750Gp2 = this.LJJIFFI;
                                if (c04750Gp2 != null && c04750Gp2.LJII) {
                                    height = c04750Gp2.LIZIZ;
                                } else {
                                    height = LJIJ.getHeight();
                                }
                                rect.set(0, 0, i2, (int) (height * LIZLLL));
                                canvas.drawBitmap(LJIJ, this.LJJ, this.LJJI, this.LJIL);
                                canvas.restore();
                            }
                        };
                        break;
                    case 5:
                        abstractC45041pk2 = new AbstractC45041pk(c04740Go, c274816a2) { // from class: X.293
                            @Override // X.AbstractC45041pk
                            public final void LJIIJ(Canvas canvas, Matrix matrix, int i) {
                            }

                            @Override // X.AbstractC45041pk, X.InterfaceC34831Yh
                            public final void LIZ(RectF rectF, Matrix matrix) {
                                super.LIZ(rectF, matrix);
                                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                            }

                            @Override // X.AbstractC45041pk
                            public final void LJIIJJI(RectF rectF, Matrix matrix) {
                                super.LJIIJJI(rectF, matrix);
                                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                            }
                        };
                        break;
                    case 6:
                        abstractC45041pk2 = new AbstractC45041pk(c04740Go, c274816a2) { // from class: X.296
                            public final char[] LJIL;
                            public final RectF LJJ;
                            public final Matrix LJJI;
                            public final C274916b LJJIFFI;
                            public final C275016c LJJII;
                            public final java.util.Map<C263611s, List<C43611nR>> LJJIII;
                            public final C43811nl LJJIIJ;
                            public final C04740Go LJJIIJZLJL;
                            public final C0GY LJJIIZ;
                            public final C43741ne LJJIIZI;
                            public final C43741ne LJJIJ;
                            public final C43751nf LJJIJIIJI;
                            public final C43751nf LJJIJIIJIL;

                            /* JADX WARN: Type inference failed for: r0v4, types: [X.16b] */
                            /* JADX WARN: Type inference failed for: r0v5, types: [X.16c] */
                            {
                                super(c04740Go, c274816a2);
                                this.LJIL = new char[1];
                                this.LJJ = new RectF();
                                this.LJJI = new Matrix();
                                this.LJJIFFI = new Paint() { // from class: X.16b
                                    {
                                        setStyle(Paint.Style.FILL);
                                    }
                                };
                                this.LJJII = new Paint() { // from class: X.16c
                                    {
                                        setStyle(Paint.Style.STROKE);
                                    }
                                };
                                this.LJJIII = new HashMap();
                                this.LJJIIJZLJL = c04740Go;
                                this.LJJIIZ = c274816a2.LIZIZ;
                                C44511ot c44511ot = c274816a2.LJIILLIIL;
                                c44511ot.getClass();
                                C43811nl c43811nl = new C43811nl((List) c44511ot.LJLILLLLZI);
                                this.LJJIIJ = c43811nl;
                                c43811nl.LIZ(this);
                                LJFF(c43811nl);
                                C268813s c268813s = c274816a2.LJIIZILJ;
                                if (c268813s != null) {
                                    C44441om c44441om = (C44441om) c268813s.LIZ;
                                    if (c44441om != null) {
                                        AbstractC22650uj<?, ?> LIZ2 = c44441om.LIZ();
                                        this.LJJIIZI = (C43741ne) LIZ2;
                                        LIZ2.LIZ(this);
                                        LJFF(LIZ2);
                                    }
                                    C44441om c44441om2 = (C44441om) c268813s.LIZIZ;
                                    if (c44441om2 != null) {
                                        AbstractC22650uj<?, ?> LIZ3 = c44441om2.LIZ();
                                        this.LJJIJ = (C43741ne) LIZ3;
                                        LIZ3.LIZ(this);
                                        LJFF(LIZ3);
                                    }
                                    C44451on c44451on2 = (C44451on) c268813s.LIZJ;
                                    if (c44451on2 != null) {
                                        AbstractC22650uj<?, ?> LIZ4 = c44451on2.LIZ();
                                        this.LJJIJIIJI = (C43751nf) LIZ4;
                                        LIZ4.LIZ(this);
                                        LJFF(LIZ4);
                                    }
                                    C44451on c44451on3 = (C44451on) c268813s.LIZLLL;
                                    if (c44451on3 != null) {
                                        AbstractC22650uj<?, ?> LIZ5 = c44451on3.LIZ();
                                        this.LJJIJIIJIL = (C43751nf) LIZ5;
                                        LIZ5.LIZ(this);
                                        LJFF(LIZ5);
                                    }
                                }
                            }

                            @Override // X.AbstractC45041pk, X.InterfaceC34831Yh
                            public final void LIZ(RectF rectF, Matrix matrix) {
                                super.LIZ(rectF, matrix);
                                if (C03970Dp.LIZ) {
                                    rectF.set(0.0f, 0.0f, this.LJJIIZ.LJIIIIZZ.width(), this.LJJIIZ.LJIIIIZZ.height());
                                }
                            }

                            @Override // X.AbstractC45041pk, X.InterfaceC263811u
                            public final <T> void LIZIZ(T t, C06800Om<T> c06800Om) {
                                C43751nf c43751nf;
                                C43751nf c43751nf2;
                                C43741ne c43741ne;
                                C43741ne c43741ne2;
                                super.LIZIZ(t, c06800Om);
                                if (t == C0GO.LIZ && (c43741ne2 = this.LJJIIZI) != null) {
                                    c43741ne2.LJIIJ(c06800Om);
                                    return;
                                }
                                if (t == C0GO.LIZIZ && (c43741ne = this.LJJIJ) != null) {
                                    c43741ne.LJIIJ(c06800Om);
                                    return;
                                }
                                if (t == C0GO.LJIIJ && (c43751nf2 = this.LJJIJIIJI) != null) {
                                    c43751nf2.LJIIJ(c06800Om);
                                } else {
                                    if (t != C0GO.LJIIJJI || (c43751nf = this.LJJIJIIJIL) == null) {
                                        return;
                                    }
                                    c43751nf.LJIIJ(c06800Om);
                                }
                            }

                            @Override // X.AbstractC45041pk
                            public final void LJIIJJI(RectF rectF, Matrix matrix) {
                                super.LJIIJJI(rectF, matrix);
                                if (C03970Dp.LIZ) {
                                    rectF.set(0.0f, 0.0f, this.LJJIIZ.LJIIIIZZ.width(), this.LJJIIZ.LJIIIIZZ.height());
                                }
                            }

                            public static void LJIJ(char[] cArr, Paint paint, Canvas canvas) {
                                if (paint.getColor() == 0) {
                                    return;
                                }
                                if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
                                    return;
                                }
                                canvas.drawText(cArr, 0, 1, 0.0f, 0.0f, paint);
                            }

                            public static void LJIJI(Path path, Paint paint, Canvas canvas) {
                                if (paint.getColor() == 0) {
                                    return;
                                }
                                if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
                                    return;
                                }
                                canvas.drawPath(path, paint);
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:87:0x02a4, code lost:
                            
                                if (r8 == null) goto L55;
                             */
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r0v34, types: [java.util.HashMap] */
                            /* JADX WARN: Type inference failed for: r11v4, types: [java.util.List] */
                            /* JADX WARN: Type inference failed for: r7v2, types: [T, java.lang.String] */
                            /* JADX WARN: Type inference failed for: r9v1, types: [T, java.lang.Object, java.lang.String] */
                            @Override // X.AbstractC45041pk
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void LJIIJ(android.graphics.Canvas r19, android.graphics.Matrix r20, int r21) {
                                /*
                                    Method dump skipped, instructions count: 722
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass296.LJIIJ(android.graphics.Canvas, android.graphics.Matrix, int):void");
                            }
                        };
                        break;
                    default:
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("Unknown layer type ");
                        LIZ2.append(c274816a2.LJ);
                        C0GR.LIZIZ(X1D.LIZIZ(LIZ2));
                        continue;
                }
                c0m5.LJI(abstractC45041pk2.LJIILIIL.LIZLLL, abstractC45041pk2);
                if (abstractC45041pk3 != null) {
                    abstractC45041pk3.LJIILLIIL = abstractC45041pk2;
                    abstractC45041pk3 = null;
                } else {
                    ListProtector.add(this.LJJ, 0, abstractC45041pk2);
                    int i = C16X.LIZ[c274816a2.LJIJJ.ordinal()];
                    if (i == 1 || i == 2) {
                        abstractC45041pk3 = abstractC45041pk2;
                    }
                }
                size--;
            } else {
                for (int i2 = 0; i2 < c0m5.LJIIIIZZ(); i2++) {
                    AbstractC45041pk abstractC45041pk4 = (AbstractC45041pk) c0m5.LJ(c0m5.LJFF(i2), null);
                    if (abstractC45041pk4 != null && (abstractC45041pk = (AbstractC45041pk) c0m5.LJ(abstractC45041pk4.LJIILIIL.LJFF, null)) != null) {
                        abstractC45041pk4.LJIIZILJ = abstractC45041pk;
                    }
                }
                return;
            }
        }
    }

    @Override // X.AbstractC45041pk
    public final void LJIILL(C263711t c263711t, int i, List<C263711t> list, C263711t c263711t2) {
        for (int i2 = 0; i2 < ((ArrayList) this.LJJ).size(); i2++) {
            ((AbstractC45041pk) ListProtector.get(this.LJJ, i2)).LJ(c263711t, i, list, c263711t2);
        }
    }
}

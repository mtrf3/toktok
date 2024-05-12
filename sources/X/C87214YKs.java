package X;

import android.content.Context;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Vibrator;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.ui.state.LiveState;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS146S0200000_15;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS16S0010000_12;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.YKs, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87214YKs implements C6SJ, C6SE {
    public final Context LIZ;
    public final FrameLayout LIZIZ;
    public final C159816Oz LIZJ;
    public final LifecycleOwner LIZLLL;
    public final C62822Ol8 LJ;
    public final C62822Ol8 LJFF;
    public C6SC LJI;
    public final C62822Ol8 LJII;
    public C87215YKt LJIIIIZZ;
    public final C62822Ol8 LJIIIZ;
    public final C62822Ol8 LJIIJ;
    public final C62822Ol8 LJIIJJI;
    public final C62822Ol8 LJIIL;
    public final C62822Ol8 LJIILIIL;
    public final C62822Ol8 LJIILJJIL;
    public final C62822Ol8 LJIILL;
    public final C62822Ol8 LJIILLIIL;
    public final C62822Ol8 LJIIZILJ;
    public final C62822Ol8 LJIJ;
    public int LJIJI;
    public final C62822Ol8 LJIJJ;
    public final C62822Ol8 LJIJJLI;
    public long LJIL;

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
    public final void LJIIL() {
    }

    @Override // X.C6SJ
    public final boolean LJIJ() {
        return false;
    }

    public final float LJIJJ() {
        return ((Number) this.LJIIL.getValue()).floatValue();
    }

    public final int LJJIFFI() {
        return ((Number) this.LJIJJ.getValue()).intValue();
    }

    public final float LJJII() {
        return ((Number) this.LJIIIZ.getValue()).floatValue();
    }

    public final float LJJIIJ() {
        return ((Number) this.LJIIJ.getValue()).floatValue();
    }

    public final C1NS<C87216YKu> LJJIIJZLJL() {
        return (C1NS) this.LJFF.getValue();
    }

    public final RectF LJJIIZ() {
        return (RectF) this.LJII.getValue();
    }

    public final List<C6QO> LJJIIZI() {
        return (List) this.LJ.getValue();
    }

    public final float LJJIJ() {
        return ((Number) this.LJIIJJI.getValue()).floatValue();
    }

    public final void LJJIJIIJIL() {
        if (this.LJIIIIZZ == null) {
            this.LJIIIIZZ = new C87215YKt(this.LIZ);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            FrameLayout frameLayout = this.LIZIZ;
            C87215YKt c87215YKt = this.LJIIIIZZ;
            if (c87215YKt != null) {
                frameLayout.addView(c87215YKt, layoutParams);
                C87215YKt c87215YKt2 = this.LJIIIIZZ;
                if (c87215YKt2 != null) {
                    C16360ka.LJJ(c87215YKt2, 100101.0f);
                    C87215YKt c87215YKt3 = this.LJIIIIZZ;
                    if (c87215YKt3 != null) {
                        C1NS<C87216YKu> state = LJJIIJZLJL();
                        LifecycleOwner owner = this.LIZLLL;
                        o.LJIIIZ(state, "state");
                        o.LJIIIZ(owner, "owner");
                        c87215YKt3.LJLIL = state;
                        c87215YKt3.LJLILLLLZI = owner;
                        Paint paint = new Paint();
                        c87215YKt3.LJLJI = paint;
                        paint.setColor(C04330Ez.LIZIZ(c87215YKt3.getContext(), R.color.cb));
                        Paint paint2 = c87215YKt3.LJLJI;
                        if (paint2 != null) {
                            paint2.setAntiAlias(true);
                            Paint paint3 = c87215YKt3.LJLJI;
                            if (paint3 != null) {
                                paint3.setStyle(Paint.Style.STROKE);
                                Paint paint4 = c87215YKt3.LJLJI;
                                if (paint4 != null) {
                                    paint4.setStrokeWidth(KL2.LIZJ(c87215YKt3.getContext(), 1.5f));
                                    Paint paint5 = c87215YKt3.LJLJI;
                                    if (paint5 != null) {
                                        paint5.setShadowLayer(10.0f, 0.0f, 0.0f, -7829368);
                                        c87215YKt3.setWillNotDraw(false);
                                        c87215YKt3.LJLJJI = new DashPathEffect(new float[]{KL2.LIZJ(c87215YKt3.getContext(), 2.0f), KL2.LIZJ(c87215YKt3.getContext(), 1.0f)}, 0.0f);
                                        Iterator it = C47261Igj.LJII(new TBT() { // from class: X.YL8
                                            @Override // X.TBT, X.TBZ, X.TBW
                                            public final Object get(Object obj) {
                                                return Boolean.valueOf(((C87216YKu) obj).LJLL);
                                            }
                                        }, new TBT() { // from class: X.YL9
                                            @Override // X.TBT, X.TBZ, X.TBW
                                            public final Object get(Object obj) {
                                                return Boolean.valueOf(((C87216YKu) obj).LJLLI);
                                            }
                                        }, new TBT() { // from class: X.YLA
                                            @Override // X.TBT, X.TBZ, X.TBW
                                            public final Object get(Object obj) {
                                                return Boolean.valueOf(((C87216YKu) obj).LJLJLJ);
                                            }
                                        }, new TBT() { // from class: X.YLB
                                            @Override // X.TBT, X.TBZ, X.TBW
                                            public final Object get(Object obj) {
                                                return Boolean.valueOf(((C87216YKu) obj).LJLJLLL);
                                            }
                                        }, new TBT() { // from class: X.YL5
                                            @Override // X.TBT, X.TBZ, X.TBW
                                            public final Object get(Object obj) {
                                                return Boolean.valueOf(((C87216YKu) obj).LJLLJ);
                                            }
                                        }, new TBT() { // from class: X.YL6
                                            @Override // X.TBT, X.TBZ, X.TBW
                                            public final Object get(Object obj) {
                                                return Boolean.valueOf(((C87216YKu) obj).LJLLILLLL);
                                            }
                                        }, new TBT() { // from class: X.YL7
                                            @Override // X.TBT, X.TBZ, X.TBW
                                            public final Object get(Object obj) {
                                                return Boolean.valueOf(((C87216YKu) obj).LJLLL);
                                            }
                                        }).iterator();
                                        while (it.hasNext()) {
                                            TBW visible = (TBW) it.next();
                                            C08610Vl<C87216YKu> c08610Vl = c87215YKt3.LJLIL;
                                            if (c08610Vl != null) {
                                                o.LJIIIIZZ(visible, "visible");
                                                LiveState<V> LIZIZ = c08610Vl.LIZIZ(visible);
                                                LifecycleOwner lifecycleOwner = c87215YKt3.LJLILLLLZI;
                                                if (lifecycleOwner == null) {
                                                    o.LJIJI("lifecycleOwner");
                                                    throw null;
                                                }
                                                LIZIZ.LJIIIIZZ(lifecycleOwner, Lifecycle.State.STARTED, new AqS175S0100000_9(c87215YKt3, 544));
                                            } else {
                                                o.LJIJI("stateContainer");
                                                throw null;
                                            }
                                        }
                                        Iterator it2 = C47261Igj.LJII(new TBT() { // from class: X.YKy
                                            @Override // X.TBT, X.TBZ, X.TBW
                                            public final Object get(Object obj) {
                                                return Float.valueOf(((C87216YKu) obj).LJLZ);
                                            }
                                        }, new TBT() { // from class: X.YKz
                                            @Override // X.TBT, X.TBZ, X.TBW
                                            public final Object get(Object obj) {
                                                return Float.valueOf(((C87216YKu) obj).LJZ);
                                            }
                                        }, new TBT() { // from class: X.YL0
                                            @Override // X.TBT, X.TBZ, X.TBW
                                            public final Object get(Object obj) {
                                                return Float.valueOf(((C87216YKu) obj).LJLLLL);
                                            }
                                        }, new TBT() { // from class: X.YL1
                                            @Override // X.TBT, X.TBZ, X.TBW
                                            public final Object get(Object obj) {
                                                return Float.valueOf(((C87216YKu) obj).LJLLLLLL);
                                            }
                                        }, new TBT() { // from class: X.YL2
                                            @Override // X.TBT, X.TBZ, X.TBW
                                            public final Object get(Object obj) {
                                                return Float.valueOf(((C87216YKu) obj).LJZI);
                                            }
                                        }, new TBT() { // from class: X.YL3
                                            @Override // X.TBT, X.TBZ, X.TBW
                                            public final Object get(Object obj) {
                                                return Float.valueOf(((C87216YKu) obj).LJZL);
                                            }
                                        }, new TBT() { // from class: X.YL4
                                            @Override // X.TBT, X.TBZ, X.TBW
                                            public final Object get(Object obj) {
                                                return Float.valueOf(((C87216YKu) obj).LL);
                                            }
                                        }).iterator();
                                        while (it2.hasNext()) {
                                            TBW alpha = (TBW) it2.next();
                                            C08610Vl<C87216YKu> c08610Vl2 = c87215YKt3.LJLIL;
                                            if (c08610Vl2 != null) {
                                                o.LJIIIIZZ(alpha, "alpha");
                                                LiveState<V> LIZIZ2 = c08610Vl2.LIZIZ(alpha);
                                                LifecycleOwner lifecycleOwner2 = c87215YKt3.LJLILLLLZI;
                                                if (lifecycleOwner2 == null) {
                                                    o.LJIJI("lifecycleOwner");
                                                    throw null;
                                                }
                                                LIZIZ2.LJIIIIZZ(lifecycleOwner2, Lifecycle.State.STARTED, new AqS175S0100000_9(c87215YKt3, 545));
                                            } else {
                                                o.LJIJI("stateContainer");
                                                throw null;
                                            }
                                        }
                                        return;
                                    }
                                    o.LJIJI("linePaint");
                                    throw null;
                                }
                                o.LJIJI("linePaint");
                                throw null;
                            }
                            o.LJIJI("linePaint");
                            throw null;
                        }
                        o.LJIJI("linePaint");
                        throw null;
                    }
                    o.LJIJI("stickerBorderLineView");
                    throw null;
                }
                o.LJIJI("stickerBorderLineView");
                throw null;
            }
            o.LJIJI("stickerBorderLineView");
            throw null;
        }
    }

    public final void LJJIJIIJI() {
        LJJIIJZLJL().LJ(C87219YKx.LJLIL);
        C6SC c6sc = this.LJI;
        if (c6sc != null) {
            c6sc.LJFF.getValue();
            ((C1NS) c6sc.LJ.getValue()).LJ(new AqS16S0010000_12(false, 22));
        }
        C6SC c6sc2 = this.LJI;
        if (c6sc2 != null) {
            c6sc2.LJFF.getValue();
            ((C1NS) c6sc2.LJ.getValue()).LJ(new AqS16S0010000_12(false, 21));
        }
        C6SC c6sc3 = this.LJI;
        if (c6sc3 != null) {
            c6sc3.LJFF.getValue();
            ((C1NS) c6sc3.LJ.getValue()).LJ(new AqS16S0010000_12(false, 20));
        }
    }

    public final void LJJIJIL() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.LJIL > 200) {
            this.LJIL = currentTimeMillis;
            try {
                ((Vibrator) this.LJIJJLI.getValue()).vibrate(30L);
            } catch (Throwable unused) {
            }
        }
    }

    public final BaseStickerModel LJIIIIZZ(BaseStickerModel model) {
        float f;
        float f2;
        o.LJIIIZ(model, "model");
        this.LJIJI--;
        RectF stickerBoundingRect = model.getStickerBoundingRect();
        int LIZIZ = C7MY.LIZIZ(5);
        if (stickerBoundingRect.left < LJJII()) {
            f = (LJJII() - stickerBoundingRect.left) + LIZIZ;
        } else if (stickerBoundingRect.right > LJJIIJ()) {
            f = (LJJIIJ() - stickerBoundingRect.right) - LIZIZ;
        } else {
            f = 0.0f;
        }
        if (stickerBoundingRect.top < LJJIJ()) {
            f2 = (LJJIJ() - stickerBoundingRect.top) + LIZIZ;
        } else if (stickerBoundingRect.bottom > LJIJJ()) {
            f2 = (LJIJJ() - stickerBoundingRect.bottom) - LIZIZ;
        } else {
            f2 = 0.0f;
        }
        RectF rectF = new RectF(LJJII(), LJJIJ(), LJJIIJ(), LJIJJ());
        BaseStickerModel copy$default = BaseStickerModel.copy$default(model, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, model.getTranslateX() + f, model.getTranslateY() + f2, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -6291457, null);
        if (rectF.contains(copy$default.getStickerBoundingRect()) || this.LJIJI < 0) {
            this.LJIJI = 100;
            return copy$default;
        }
        return LJIIIIZZ(BaseStickerModel.copy$default(copy$default, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, copy$default.getScale() * 0.9f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -8388609, null));
    }

    @Override // X.C6SE
    public final void LJIIJ(int i) {
        LJJIJIIJI();
    }

    @Override // X.C6SE
    public final void LJIIJJI(int i) {
        LJJIJIIJI();
    }

    @Override // X.C6SE
    public final void LJJI(int i) {
        LJJIJIIJI();
    }

    public final RectF LJJIII(RectF rectF) {
        return new RectF(rectF.left - this.LIZIZ.getLeft(), rectF.top - this.LIZIZ.getTop(), rectF.right - this.LIZIZ.getLeft(), rectF.bottom - this.LIZIZ.getTop());
    }

    @Override // X.C6SE
    public final void LJIILIIL(int i, RectF visibleRect) {
        o.LJIIIZ(visibleRect, "visibleRect");
    }

    @Override // X.C6SJ
    public final boolean LJI(float f, int i, RectF targetRect) {
        o.LJIIIZ(targetRect, "targetRect");
        boolean LJIIZILJ = LJIIZILJ(f, i, targetRect);
        C6QO LJJJ = C30581Hy.LJJJ(i, LJJIIZI());
        if (LJJJ == null || !LJJJ.LIZJ()) {
            return false;
        }
        return LJIIZILJ;
    }

    @Override // X.C6SJ
    public final boolean LJII(float f, int i, RectF targetRect) {
        o.LJIIIZ(targetRect, "targetRect");
        boolean LJIIZILJ = LJIIZILJ(f, i, targetRect);
        C6QO LJJJ = C30581Hy.LJJJ(i, LJJIIZI());
        if (LJJJ == null || !LJJJ.LIZJ()) {
            return false;
        }
        return LJIIZILJ;
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [android.graphics.PointF, T] */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.graphics.PointF, T] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.graphics.PointF, T] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.graphics.PointF, T] */
    @Override // X.C6SE
    public final void LJIILL(float f, int i, RectF visibleRect) {
        o.LJIIIZ(visibleRect, "visibleRect");
        RectF LJJIII = LJJIII(visibleRect);
        if (Math.abs(f % 180) <= 2.0f) {
            if (!LJJIIJZLJL().LJ.LJLLL) {
                LJJIJIL();
            }
            LJJIJIIJIL();
            LJJIIJZLJL().LJ(new AqS146S0200000_15(LJJIII, this, 66));
            return;
        }
        if (Math.abs(f % 90) <= 2.0f) {
            if (!LJJIIJZLJL().LJ.LJLLL) {
                LJJIJIL();
            }
            LJJIJIIJIL();
            LJJIIJZLJL().LJ(new AqS146S0200000_15(LJJIII, this, 67));
            return;
        }
        if (Math.abs(f % 45) <= 2.0f) {
            if (!LJJIIJZLJL().LJ.LJLLL) {
                LJJIJIL();
            }
            LJJIJIIJIL();
            double tan = Math.tan(Math.toRadians(f));
            ?? pointF = new PointF(LJJIIZ().left, (float) (((LJJIIZ().left - LJJIII.centerX()) * tan) + LJJIII.centerY()));
            ?? pointF2 = new PointF(LJJIIZ().right, (float) (((LJJIIZ().right - LJJIII.centerX()) * tan) + LJJIII.centerY()));
            ?? pointF3 = new PointF((float) (((LJJIIZ().top - LJJIII.centerY()) / tan) + LJJIII.centerX()), LJJIIZ().top);
            ?? pointF4 = new PointF((float) (((LJJIIZ().bottom - LJJIII.centerY()) / tan) + LJJIII.centerX()), LJJIIZ().bottom);
            C68322mC c68322mC = new C68322mC();
            C68322mC c68322mC2 = new C68322mC();
            if (((PointF) pointF).y >= LJJIIZ().top && ((PointF) pointF).y <= LJJIIZ().bottom) {
                c68322mC.element = pointF;
            }
            if (((PointF) pointF3).x >= LJJIIZ().left && ((PointF) pointF3).x <= LJJIIZ().right) {
                if (c68322mC.element == 0) {
                    c68322mC.element = pointF3;
                } else {
                    c68322mC2.element = pointF3;
                }
            }
            if (((PointF) pointF2).y >= LJJIIZ().top && ((PointF) pointF2).y <= LJJIIZ().bottom) {
                if (c68322mC.element == 0) {
                    c68322mC.element = pointF2;
                } else if (c68322mC2.element == 0) {
                    c68322mC2.element = pointF2;
                }
            }
            if (((PointF) pointF4).x >= LJJIIZ().left && ((PointF) pointF4).x <= LJJIIZ().right) {
                if (c68322mC.element == 0) {
                    c68322mC.element = pointF4;
                } else if (c68322mC2.element == 0) {
                    c68322mC2.element = pointF4;
                }
            }
            if (c68322mC.element == 0 || c68322mC2.element == 0) {
                return;
            }
            LJJIIJZLJL().LJ(new AqS146S0200000_15(c68322mC, (C68322mC<PointF>) c68322mC2, (C68322mC<PointF>) 68));
            return;
        }
        LJJIIJZLJL().LJ(YKN.LJLIL);
    }

    public final boolean LJIIZILJ(float f, int i, RectF rectF) {
        boolean z;
        boolean z2;
        Matrix matrix = new Matrix();
        matrix.postRotate(f, rectF.centerX(), rectF.centerY());
        matrix.mapRect(rectF);
        C6QO LJJJ = C30581Hy.LJJJ(i, LJJIIZI());
        if (LJJJ != null && LJJJ.LIZJ()) {
            z = true;
        } else {
            z = false;
        }
        if (rectF.left < LJJII() + LJJIFFI()) {
            LJJIJIIJIL();
            C56K c56k = new C56K();
            c56k.element = 1.0f;
            if (Math.abs(rectF.left - LJJII()) <= 2.0f) {
                LJJIJIL();
            }
            if (rectF.left < LJJII()) {
                z2 = true;
            } else {
                c56k.element = 1 - (Math.abs(rectF.left - LJJII()) / LJJIFFI());
                z2 = false;
            }
            if (z) {
                LJJIIJZLJL().LJ(new AqS146S0200000_15(this, c56k, 62));
            }
        } else {
            LJJIIJZLJL().LJ(YKJ.LJLIL);
            z2 = false;
        }
        if (rectF.right > LJJIIJ() - LJJIFFI()) {
            LJJIJIIJIL();
            C56K c56k2 = new C56K();
            c56k2.element = 1.0f;
            if (Math.abs(rectF.right - LJJIIJ()) <= 2.0f) {
                LJJIJIL();
            }
            if (rectF.right > LJJIIJ()) {
                z2 = true;
            } else {
                c56k2.element = 1 - (Math.abs(rectF.right - LJJIIJ()) / LJJIFFI());
            }
            if (z) {
                LJJIIJZLJL().LJ(new AqS146S0200000_15(this, c56k2, 63));
            }
            C6SC c6sc = this.LJI;
            if (c6sc != null) {
                c6sc.LJFF.getValue();
                ((C1NS) c6sc.LJ.getValue()).LJ(new AqS16S0010000_12(true, 21));
            }
        } else {
            LJJIIJZLJL().LJ(YKK.LJLIL);
            C6SC c6sc2 = this.LJI;
            if (c6sc2 != null) {
                c6sc2.LJFF.getValue();
                ((C1NS) c6sc2.LJ.getValue()).LJ(new AqS16S0010000_12(false, 21));
            }
        }
        if (rectF.top < LJJIJ() + LJJIFFI()) {
            LJJIJIIJIL();
            C56K c56k3 = new C56K();
            c56k3.element = 1.0f;
            if (Math.abs(rectF.top - LJJIJ()) <= 2.0f) {
                LJJIJIL();
            }
            if (rectF.top < LJJIJ()) {
                z2 = true;
            } else {
                c56k3.element = 1 - (Math.abs(rectF.top - LJJIJ()) / LJJIFFI());
            }
            if (z) {
                LJJIIJZLJL().LJ(new AqS146S0200000_15(this, c56k3, 64));
            }
            C6SC c6sc3 = this.LJI;
            if (c6sc3 != null) {
                c6sc3.LJFF.getValue();
                ((C1NS) c6sc3.LJ.getValue()).LJ(new AqS16S0010000_12(true, 22));
            }
        } else {
            LJJIIJZLJL().LJ(YKL.LJLIL);
            C6SC c6sc4 = this.LJI;
            if (c6sc4 != null) {
                c6sc4.LJFF.getValue();
                ((C1NS) c6sc4.LJ.getValue()).LJ(new AqS16S0010000_12(false, 22));
            }
        }
        if (rectF.bottom > LJIJJ() - LJJIFFI()) {
            LJJIJIIJIL();
            C56K c56k4 = new C56K();
            c56k4.element = 1.0f;
            if (Math.abs(rectF.bottom - LJIJJ()) <= 2.0f) {
                LJJIJIL();
            }
            if (rectF.bottom > LJIJJ()) {
                z2 = true;
            } else {
                c56k4.element = 1 - (Math.abs(rectF.bottom - LJIJJ()) / LJJIFFI());
            }
            if (z) {
                LJJIIJZLJL().LJ(new AqS146S0200000_15(this, c56k4, 65));
            }
            C6SC c6sc5 = this.LJI;
            if (c6sc5 != null) {
                c6sc5.LJFF.getValue();
                ((C1NS) c6sc5.LJ.getValue()).LJ(new AqS16S0010000_12(true, 20));
            }
        } else {
            LJJIIJZLJL().LJ(YKM.LJLIL);
            C6SC c6sc6 = this.LJI;
            if (c6sc6 != null) {
                c6sc6.LJFF.getValue();
                ((C1NS) c6sc6.LJ.getValue()).LJ(new AqS16S0010000_12(false, 20));
            }
        }
        return z2;
    }

    @Override // X.C6SE
    public final void LJ(int i, float f, float f2, RectF visibleRect) {
        o.LJIIIZ(visibleRect, "visibleRect");
        RectF LJJIII = LJJIII(visibleRect);
        if (Math.abs(LJJIII.centerX() - LJJIIZ().centerX()) <= 2.0f) {
            LJJIJIIJIL();
            if (!LJJIIJZLJL().LJ.LJLLILLLL) {
                LJJIJIL();
            }
            LJJIIJZLJL().LJ(new AqS181S0100000_15(this, 267));
        } else {
            LJJIIJZLJL().LJ(YKO.LJLIL);
        }
        if (Math.abs(LJJIII.centerY() - LJJIIZ().centerY()) <= 2.0f) {
            LJJIJIIJIL();
            if (!LJJIIJZLJL().LJ.LJLLJ) {
                LJJIJIL();
            }
            LJJIIJZLJL().LJ(new AqS181S0100000_15(this, 266));
            return;
        }
        LJJIIJZLJL().LJ(YKI.LJLIL);
    }

    public C87214YKs(Context context, FrameLayout stickerContainer, C159816Oz stickerConfig, LifecycleOwner lifecycleOwner, C160056Px stickerObjectContainer) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(stickerContainer, "stickerContainer");
        o.LJIIIZ(stickerConfig, "stickerConfig");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(stickerObjectContainer, "stickerObjectContainer");
        this.LIZ = context;
        this.LIZIZ = stickerContainer;
        this.LIZJ = stickerConfig;
        this.LIZLLL = lifecycleOwner;
        this.LJ = C221108m2.LIZIZ(new AqS152S0100000_2(stickerObjectContainer, 936));
        this.LJFF = C221108m2.LIZIZ(C87217YKv.LJLIL);
        this.LJII = C221108m2.LIZIZ(new AqS165S0100000_15(this, 886));
        this.LJIIIZ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 882));
        this.LJIIJ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 884));
        this.LJIIJJI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 887));
        this.LJIIL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 878));
        this.LJIILIIL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 883));
        this.LJIILJJIL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 885));
        this.LJIILL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 888));
        this.LJIILLIIL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 879));
        this.LJIIZILJ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 881));
        this.LJIJ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 880));
        this.LJIJI = 100;
        this.LJIJJ = C221108m2.LIZIZ(C87218YKw.LJLIL);
        this.LJIJJLI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 889));
    }

    @Override // X.C6SJ
    public final boolean LIZJ(float f, float f2, int i, RectF rectF, EnumC157656Gr stickerType) {
        o.LJIIIZ(stickerType, "stickerType");
        return false;
    }

    @Override // X.C6SJ
    public final boolean LJIILJJIL(float f, float f2, int i, RectF rectF, EnumC157656Gr stickerType) {
        o.LJIIIZ(stickerType, "stickerType");
        return false;
    }

    @Override // X.C6SJ
    public final boolean LJIJJLI(float f, float f2, int i, RectF targetRect, EnumC157656Gr stickerType) {
        o.LJIIIZ(stickerType, "stickerType");
        o.LJIIIZ(targetRect, "targetRect");
        boolean LJIIZILJ = LJIIZILJ(f2, i, targetRect);
        C6QO LJJJ = C30581Hy.LJJJ(i, LJJIIZI());
        if (LJJJ == null || !LJJJ.LIZJ()) {
            return false;
        }
        return LJIIZILJ;
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

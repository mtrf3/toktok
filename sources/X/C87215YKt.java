package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.a1;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.YKt, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87215YKt extends View {
    public C08610Vl<C87216YKu> LJLIL;
    public LifecycleOwner LJLILLLLZI;
    public Paint LJLJI;
    public DashPathEffect LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C87215YKt(Context context) {
        super(context, null, 0);
        a1.LJFF(context, "context");
    }

    private final void setLinePaintShadowRadius(float f) {
        Paint paint = this.LJLJI;
        if (paint != null) {
            paint.setShadowLayer(10 * f, 0.0f, 0.0f, -7829368);
        } else {
            o.LJIJI("linePaint");
            throw null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        super.onDraw(canvas);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("left line visible ");
        C08610Vl<C87216YKu> c08610Vl = this.LJLIL;
        if (c08610Vl != null) {
            LIZ.append(c08610Vl.LJ.LJLL);
            X1D.LIZIZ(LIZ);
            Paint paint = this.LJLJI;
            if (paint != null) {
                paint.setPathEffect(null);
                Boolean[] boolArr = new Boolean[6];
                C08610Vl<C87216YKu> c08610Vl2 = this.LJLIL;
                if (c08610Vl2 != null) {
                    boolArr[0] = Boolean.valueOf(c08610Vl2.LJ.LJLL);
                    C08610Vl<C87216YKu> c08610Vl3 = this.LJLIL;
                    if (c08610Vl3 != null) {
                        boolArr[1] = Boolean.valueOf(c08610Vl3.LJ.LJLJLJ);
                        C08610Vl<C87216YKu> c08610Vl4 = this.LJLIL;
                        if (c08610Vl4 != null) {
                            boolArr[2] = Boolean.valueOf(c08610Vl4.LJ.LJLLI);
                            C08610Vl<C87216YKu> c08610Vl5 = this.LJLIL;
                            if (c08610Vl5 != null) {
                                boolArr[3] = Boolean.valueOf(c08610Vl5.LJ.LJLJLLL);
                                C08610Vl<C87216YKu> c08610Vl6 = this.LJLIL;
                                if (c08610Vl6 != null) {
                                    boolArr[4] = Boolean.valueOf(c08610Vl6.LJ.LJLLJ);
                                    C08610Vl<C87216YKu> c08610Vl7 = this.LJLIL;
                                    if (c08610Vl7 != null) {
                                        boolArr[5] = Boolean.valueOf(c08610Vl7.LJ.LJLLILLLL);
                                        ArrayList LJII = C47261Igj.LJII(boolArr);
                                        RectF[] rectFArr = new RectF[6];
                                        C08610Vl<C87216YKu> c08610Vl8 = this.LJLIL;
                                        if (c08610Vl8 != null) {
                                            C87216YKu c87216YKu = c08610Vl8.LJ;
                                            rectFArr[0] = c87216YKu.LJLJI;
                                            rectFArr[1] = c87216YKu.LJLIL;
                                            rectFArr[2] = c87216YKu.LJLJJI;
                                            rectFArr[3] = c87216YKu.LJLILLLLZI;
                                            rectFArr[4] = c87216YKu.LJLJJLL;
                                            rectFArr[5] = c87216YKu.LJLJJL;
                                            ArrayList LJII2 = C47261Igj.LJII(rectFArr);
                                            Float[] fArr = new Float[6];
                                            C08610Vl<C87216YKu> c08610Vl9 = this.LJLIL;
                                            if (c08610Vl9 != null) {
                                                fArr[0] = Float.valueOf(c08610Vl9.LJ.LJLZ);
                                                C08610Vl<C87216YKu> c08610Vl10 = this.LJLIL;
                                                if (c08610Vl10 != null) {
                                                    fArr[1] = Float.valueOf(c08610Vl10.LJ.LJLLLL);
                                                    C08610Vl<C87216YKu> c08610Vl11 = this.LJLIL;
                                                    if (c08610Vl11 != null) {
                                                        fArr[2] = Float.valueOf(c08610Vl11.LJ.LJZ);
                                                        C08610Vl<C87216YKu> c08610Vl12 = this.LJLIL;
                                                        if (c08610Vl12 != null) {
                                                            fArr[3] = Float.valueOf(c08610Vl12.LJ.LJLLLLLL);
                                                            C08610Vl<C87216YKu> c08610Vl13 = this.LJLIL;
                                                            if (c08610Vl13 != null) {
                                                                fArr[4] = Float.valueOf(c08610Vl13.LJ.LJZL);
                                                                C08610Vl<C87216YKu> c08610Vl14 = this.LJLIL;
                                                                if (c08610Vl14 != null) {
                                                                    fArr[5] = Float.valueOf(c08610Vl14.LJ.LJZI);
                                                                    ArrayList LJII3 = C47261Igj.LJII(fArr);
                                                                    int size = LJII.size();
                                                                    for (int i = 0; i < size; i++) {
                                                                        Object obj = ListProtector.get(LJII, i);
                                                                        o.LJIIIIZZ(obj, "borderVisibleList[index]");
                                                                        boolean booleanValue = ((Boolean) obj).booleanValue();
                                                                        Object obj2 = ListProtector.get(LJII2, i);
                                                                        o.LJIIIIZZ(obj2, "borderLineRectList[index]");
                                                                        RectF rectF = (RectF) obj2;
                                                                        Object obj3 = ListProtector.get(LJII3, i);
                                                                        o.LJIIIIZZ(obj3, "borderLineAlphaList[index]");
                                                                        float floatValue = ((Number) obj3).floatValue();
                                                                        if (booleanValue) {
                                                                            Paint paint2 = this.LJLJI;
                                                                            if (paint2 != null) {
                                                                                paint2.setAlpha((int) (255 * floatValue));
                                                                                if (floatValue <= 0.5d) {
                                                                                    floatValue = 0.0f;
                                                                                }
                                                                                setLinePaintShadowRadius(floatValue);
                                                                                float f = rectF.left;
                                                                                float f2 = rectF.top;
                                                                                float f3 = rectF.right;
                                                                                float f4 = rectF.bottom;
                                                                                Paint paint3 = this.LJLJI;
                                                                                if (paint3 != null) {
                                                                                    canvas.drawLine(f, f2, f3, f4, paint3);
                                                                                } else {
                                                                                    o.LJIJI("linePaint");
                                                                                    throw null;
                                                                                }
                                                                            } else {
                                                                                o.LJIJI("linePaint");
                                                                                throw null;
                                                                            }
                                                                        }
                                                                    }
                                                                    Paint paint4 = this.LJLJI;
                                                                    if (paint4 != null) {
                                                                        DashPathEffect dashPathEffect = this.LJLJJI;
                                                                        if (dashPathEffect != null) {
                                                                            paint4.setPathEffect(dashPathEffect);
                                                                            Paint paint5 = this.LJLJI;
                                                                            if (paint5 != null) {
                                                                                paint5.setAlpha(255);
                                                                                Boolean[] boolArr2 = new Boolean[1];
                                                                                C08610Vl<C87216YKu> c08610Vl15 = this.LJLIL;
                                                                                if (c08610Vl15 != null) {
                                                                                    boolArr2[0] = Boolean.valueOf(c08610Vl15.LJ.LJLLL);
                                                                                    ArrayList LJII4 = C47261Igj.LJII(boolArr2);
                                                                                    RectF[] rectFArr2 = new RectF[1];
                                                                                    C08610Vl<C87216YKu> c08610Vl16 = this.LJLIL;
                                                                                    if (c08610Vl16 != null) {
                                                                                        rectFArr2[0] = c08610Vl16.LJ.LJLJL;
                                                                                        ArrayList LJII5 = C47261Igj.LJII(rectFArr2);
                                                                                        int size2 = LJII5.size();
                                                                                        for (int i2 = 0; i2 < size2; i2++) {
                                                                                            Object obj4 = ListProtector.get(LJII4, i2);
                                                                                            o.LJIIIIZZ(obj4, "rotationVisibleList[i]");
                                                                                            if (((Boolean) obj4).booleanValue()) {
                                                                                                float f5 = ((RectF) ListProtector.get(LJII5, i2)).left;
                                                                                                float f6 = ((RectF) ListProtector.get(LJII5, i2)).top;
                                                                                                float f7 = ((RectF) ListProtector.get(LJII5, i2)).right;
                                                                                                float f8 = ((RectF) ListProtector.get(LJII5, i2)).bottom;
                                                                                                Paint paint6 = this.LJLJI;
                                                                                                if (paint6 != null) {
                                                                                                    canvas.drawLine(f5, f6, f7, f8, paint6);
                                                                                                } else {
                                                                                                    o.LJIJI("linePaint");
                                                                                                    throw null;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        return;
                                                                                    }
                                                                                    o.LJIJI("stateContainer");
                                                                                    throw null;
                                                                                }
                                                                                o.LJIJI("stateContainer");
                                                                                throw null;
                                                                            }
                                                                            o.LJIJI("linePaint");
                                                                            throw null;
                                                                        }
                                                                        o.LJIJI("pathEffect");
                                                                        throw null;
                                                                    }
                                                                    o.LJIJI("linePaint");
                                                                    throw null;
                                                                }
                                                                o.LJIJI("stateContainer");
                                                                throw null;
                                                            }
                                                            o.LJIJI("stateContainer");
                                                            throw null;
                                                        }
                                                        o.LJIJI("stateContainer");
                                                        throw null;
                                                    }
                                                    o.LJIJI("stateContainer");
                                                    throw null;
                                                }
                                                o.LJIJI("stateContainer");
                                                throw null;
                                            }
                                            o.LJIJI("stateContainer");
                                            throw null;
                                        }
                                        o.LJIJI("stateContainer");
                                        throw null;
                                    }
                                    o.LJIJI("stateContainer");
                                    throw null;
                                }
                                o.LJIJI("stateContainer");
                                throw null;
                            }
                            o.LJIJI("stateContainer");
                            throw null;
                        }
                        o.LJIJI("stateContainer");
                        throw null;
                    }
                    o.LJIJI("stateContainer");
                    throw null;
                }
                o.LJIJI("stateContainer");
                throw null;
            }
            o.LJIJI("linePaint");
            throw null;
        }
        o.LJIJI("stateContainer");
        throw null;
    }
}

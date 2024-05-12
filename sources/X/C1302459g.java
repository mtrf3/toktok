package X;

import Y.ALAdapterS1S0100000_2;
import Y.AUListenerS91S0100000_2;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.59g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1302459g extends AbstractC1301158t {
    public final C29S LJIIJ;
    public float LJIIJJI;
    public float LJIIL;
    public long LJIILIIL;
    public final Rect LJIILJJIL;
    public float LJIILL;
    public int LJIILLIIL;
    public final int LJIIZILJ;
    public final int LJIJ;
    public final int LJIJI;
    public final C62822Ol8 LJIJJ;
    public final int LJIJJLI;
    public boolean LJIL;
    public final Rect LJJ;
    public final Rect LJJI;
    public final Paint LJJIFFI;
    public final Paint LJJII;
    public final C62822Ol8 LJJIII;
    public final C62822Ol8 LJJIIJ;
    public final C62822Ol8 LJJIIJZLJL;
    public final C62822Ol8 LJJIIZ;
    public final C62822Ol8 LJJIIZI;
    public final ValueAnimator LJJIJ;
    public final C62822Ol8 LJJIJIIJI;
    public C5BJ LJJIJIIJIL;
    public boolean LJJIJIL;
    public List<Float> LJJIJL;
    public final RectF LJJIJLIJ;
    public final C62822Ol8 LJJIL;

    @Override // X.InterfaceC1304259y
    public final void onMove(int i, int i2, NLETrackSlot nLETrackSlot, long j, long j2, long j3, boolean z) {
    }

    public final float LJIIZILJ() {
        return ((Number) this.LJIJJ.getValue()).floatValue();
    }

    public final C1302759j LJIJ() {
        return (C1302759j) this.LJJIIZI.getValue();
    }

    @Override // X.AbstractC1301158t, X.InterfaceC1304259y
    public final void LJII(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float measuredWidth;
        float measuredWidth2;
        o.LJIIIZ(canvas, "canvas");
        List<Float> list = this.LJJIJL;
        if (list == null || list.isEmpty() || !this.LJJIJIL) {
            return;
        }
        float f4 = C1303859u.LLJJI;
        float LJIILIIL = LJIILIIL() * list.size() * 30;
        float LJIILIIL2 = (LJIILIIL() * ((float) this.LJIILIIL)) + f4;
        if (LJIILJJIL()) {
            float LJIIL = f4 - LJIIL();
            if (Math.abs(LJIIL()) > LJIILIIL2) {
                measuredWidth = this.LIZ.getMeasuredWidth() - (Math.abs(LJIIL()) - LJIILIIL2);
            } else {
                measuredWidth = this.LIZ.getMeasuredWidth();
            }
            if (LJIIL < LJIILIIL) {
                measuredWidth2 = this.LIZ.getMeasuredWidth() - LJIIL;
            } else {
                measuredWidth2 = this.LIZ.getMeasuredWidth() - LJIILIIL;
            }
            this.LJJIJLIJ.set(measuredWidth2, 0.0f, measuredWidth, this.LJII);
        } else {
            float LJIIL2 = LJIIL() + f4;
            if (LJIIL() > LJIILIIL2) {
                f = LJIIL() - LJIILIIL2;
            } else {
                f = 0.0f;
            }
            if (LJIIL2 < LJIILIIL) {
                LJIILIIL = LJIIL2;
            }
            this.LJJIJLIJ.set(f, 0.0f, LJIILIIL, this.LJII);
        }
        canvas.save();
        if (LJIILJJIL()) {
            canvas.translate(-((LJIILIIL() * ((float) this.LJIILIIL)) + f4), this.LJIILL);
        } else {
            canvas.translate((LJIILIIL() * ((float) this.LJIILIIL)) + f4, this.LJIILL);
        }
        this.LJJII.setColor(this.LJIJJLI);
        ((RectF) this.LJJIL.getValue()).set(this.LJJIJLIJ);
        if (this.LJIL) {
            ((RectF) this.LJJIL.getValue()).left += C130675Ax.LJLJL;
        }
        canvas.drawRoundRect((RectF) this.LJJIL.getValue(), LJIIZILJ(), LJIIZILJ(), this.LJJII);
        canvas.save();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Float f5 : list) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(new OSZ(Long.valueOf(i * 30), Float.valueOf(f5.floatValue() * 2)));
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        if (!arrayList.isEmpty()) {
            canvas.getClipBounds(this.LJIILJJIL);
            C5BJ c5bj = this.LJJIJIIJIL;
            if (c5bj != null) {
                c5bj.LIZIZ(canvas, this.LJJIJLIJ, arrayList, LJIILIIL(), this.LJIILJJIL, C5BH.RECORD, this.LIZ.getMeasuredWidth());
            }
            if (((Boolean) this.LJJIII.getValue()).booleanValue()) {
                int LIZIZ = C04330Ez.LIZIZ(this.LJIIJ, R.color.kb);
                int LIZIZ2 = C04330Ez.LIZIZ(this.LJIIJ, R.color.ka);
                RectF rectF = this.LJJIJLIJ;
                this.LJJIFFI.setShader(new LinearGradient(rectF.left, 0.0f, rectF.right, 0.0f, LIZIZ, LIZIZ2, Shader.TileMode.CLAMP));
                if (LJIIZILJ() > 0.0f) {
                    canvas.drawRoundRect(new RectF(this.LJJIJLIJ), LJIIZILJ(), LJIIZILJ(), this.LJJIFFI);
                } else {
                    canvas.drawRect(this.LJJIJLIJ, this.LJJIFFI);
                }
            }
        }
        String str = LJIJ().LIZ;
        TextPaint textPaint = LJIJ().LJIIJJI;
        if (this.LJJ.width() == 0) {
            LJIJ().LJIIJJI.getTextBounds(str, 0, str.length(), this.LJJ);
        }
        if (((Boolean) this.LJJIIJ.getValue()).booleanValue()) {
            f2 = this.LJJIJLIJ.top;
            f3 = C134845Qy.LIZ(8.5f);
        } else {
            f2 = this.LJJIJLIJ.top;
            f3 = LJIJ().LJIIIIZZ;
        }
        float f6 = f2 + f3;
        float f7 = this.LJJIJLIJ.top + LJIJ().LJIIIIZZ + LJIJ().LJII;
        if (LJIILJJIL()) {
            LJIJ().LJIIJ.set((((((this.LJJIJLIJ.right - LJIJ().LJIIIIZZ) - LJIJ().LIZLLL) - LJIJ().LJ) - this.LJIJ) - this.LJJ.width()) - this.LJIJI, f6, this.LJJIJLIJ.right - LJIJ().LJIIIIZZ, f7);
        } else {
            LJIJ().LJIIJ.set(this.LJJIJLIJ.left + LJIJ().LJIIIIZZ, f6, this.LJJIJLIJ.left + LJIJ().LJIIIIZZ + LJIJ().LIZLLL + LJIJ().LJ + this.LJIJ + this.LJJ.width() + this.LJIJI, f7);
        }
        canvas.clipRect(this.LJJIJLIJ);
        if (!((Boolean) this.LJJIIJ.getValue()).booleanValue()) {
            this.LJJII.setColor(LJIJ().LJFF);
            canvas.drawRoundRect(LJIJ().LJIIJ, LJIJ().LJIIIZ, LJIJ().LJIIIZ, this.LJJII);
        }
        Drawable drawable = LJIJ().LIZJ;
        if (drawable != null) {
            if (LJIILJJIL()) {
                this.LJJI.set((int) ((LJIJ().LJIIJ.right - LJIJ().LIZLLL) - LJIJ().LJ), (int) (LJIJ().LJIIJ.top + this.LJIIZILJ), (int) (LJIJ().LJIIJ.right - LJIJ().LIZLLL), (int) (LJIJ().LJIIJ.top + this.LJIIZILJ + LJIJ().LJ));
            } else {
                this.LJJI.set((int) (LJIJ().LJIIJ.left + LJIJ().LIZLLL), (int) (LJIJ().LJIIJ.top + this.LJIIZILJ), (int) (LJIJ().LJIIJ.left + LJIJ().LIZLLL + LJIJ().LJ), (int) (LJIJ().LJIIJ.top + this.LJIIZILJ + LJIJ().LJ));
            }
            drawable.setBounds(this.LJJI);
            drawable.draw(canvas);
        }
        float centerY = this.LJJIJLIJ.centerY() - ((textPaint.ascent() + textPaint.descent()) / 2);
        if (LJIILJJIL()) {
            canvas.drawText(str, ((this.LJJI.right - LJIJ().LJ) - this.LJIJ) - this.LJJ.width(), centerY, textPaint);
        } else {
            canvas.drawText(str, this.LJJI.left + LJIJ().LJ + this.LJIJ, centerY, textPaint);
        }
        canvas.restore();
    }

    @Override // X.AbstractC1301158t, X.InterfaceC1304259y
    public final int LJIIIIZZ(int i) {
        int i2;
        if (this.LJJIJIL) {
            i2 = this.LJIILLIIL;
        } else {
            i2 = -1;
        }
        if (i <= i2) {
            return super.LJIIIIZZ(i) + this.LJII;
        }
        return super.LJIIIIZZ(i);
    }

    @Override // X.InterfaceC1304259y
    public final C5A5 LIZJ(int i, C1303859u parent) {
        o.LJIIIZ(parent, "parent");
        C130675Ax c130675Ax = new C130675Ax(this.LJIIJ);
        C5BJ c5bj = this.LJJIJIIJIL;
        if (c5bj != null) {
            c130675Ax.LJLJJI.setPainter(c5bj);
        }
        return c130675Ax;
    }

    @Override // X.AbstractC1301158t, X.InterfaceC1304259y
    public final void LJFF(OSZ<? extends NLETrackSlot, C1301058s> osz, boolean z) {
        super.LJFF(osz, z);
        if (!z) {
            LJIILL(osz);
        }
    }

    @Override // X.InterfaceC1304259y
    public final void LIZ(long j, NLETrackSlot nLETrackSlot, long j2, long j3) {
        C59B trackGroupActionListener = this.LIZ.getTrackGroupActionListener();
        if (trackGroupActionListener != null) {
            trackGroupActionListener.LIZ(j, nLETrackSlot, j2, j3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1302459g(C29S activity, C1303859u c1303859u, C1303959v c1303959v, C1299358b c1299358b, C58R c58r) {
        super(c1303859u, c1303959v, c1299358b, c58r);
        int i;
        o.LJIIIZ(activity, "activity");
        this.LJIIJ = activity;
        this.LJIILJJIL = new Rect();
        this.LJIIZILJ = C134845Qy.LIZ(1.5f);
        C134845Qy.LIZ(1.0f);
        this.LJIJ = C134845Qy.LIZ(2.0f);
        this.LJIJI = C134845Qy.LIZ(4.0f);
        C134845Qy.LIZ(10.0f);
        this.LJIJJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 890));
        Integer num = C1291054w.LJ().LJIIL;
        if (num != null) {
            i = num.intValue();
        } else {
            i = -16777216;
        }
        this.LJIJJLI = i;
        this.LJJ = new Rect();
        this.LJJI = new Rect();
        this.LJJIFFI = new Paint();
        Paint paint = new Paint();
        this.LJJII = paint;
        this.LJJIII = C221108m2.LIZIZ(C127514zT.LJLIL);
        this.LJJIIJ = C221108m2.LIZIZ(C127494zR.LJLIL);
        this.LJJIIJZLJL = C221108m2.LIZIZ(C127504zS.LJLIL);
        this.LJJIIZ = C221108m2.LIZIZ(C1302959l.LJLIL);
        this.LJJIIZI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 892));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.LJJIJ = ofFloat;
        this.LJJIJIIJI = C221108m2.LIZIZ(new AqS152S0100000_2(c1303859u, 891));
        paint.setAntiAlias(true);
        ofFloat.setRepeatCount(-1);
        ofFloat.addListener(new ALAdapterS1S0100000_2(this, 42));
        ofFloat.addUpdateListener(new AUListenerS91S0100000_2(this, 52));
        this.LJJIJLIJ = new RectF();
        this.LJJIL = C221108m2.LIZIZ(C1303259o.LJLIL);
    }
}

package X;

import Y.IDaS224S0100000_15;
import Y.IDhS108S0100000_15;
import Y.IDuS325S0100000_15;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.XsC, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86192XsC implements MCS {
    public final Context LIZ;
    public final C197267og LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final Integer LJ;
    public final int LJFF;
    public final float LJI;
    public final float LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final boolean LJIIJ;
    public final EnumC86195XsF LJIIJJI;
    public final boolean LJIIL;
    public final boolean LJIILIIL;
    public final C62822Ol8 LJIILJJIL;
    public final C62822Ol8 LJIILL;
    public final C62822Ol8 LJIILLIIL;
    public final C62822Ol8 LJIIZILJ;
    public final C62822Ol8 LJIJ;
    public final C62822Ol8 LJIJI;
    public final C62822Ol8 LJIJJ;
    public final C62822Ol8 LJIJJLI;
    public final C62822Ol8 LJIL;
    public final C62822Ol8 LJJ;
    public final C62822Ol8 LJJI;
    public final C62822Ol8 LJJIFFI;
    public final int LJJII;
    public final int LJJIII;
    public long LJJIIJ;
    public boolean LJJIIJZLJL;
    public long LJJIIZ;
    public String LJJIIZI;

    @Override // X.MCS
    public final Bitmap LIZLLL() {
        Bitmap LIZ = XLY.LIZ(LJIIJ());
        if (LIZ != null) {
            return LIZ;
        }
        return null;
    }

    @Override // X.MCS
    public final Bitmap LIZ() {
        Bitmap defaultOutput = (Bitmap) this.LJJIFFI.getValue();
        o.LJIIIIZZ(defaultOutput, "defaultOutput");
        return defaultOutput;
    }

    @Override // X.MCS
    public final AbstractC73672Svk<Bitmap> LIZIZ() {
        boolean z;
        AbstractC73638SvC LJIJ;
        Bitmap LIZ;
        this.LJJIIZI = "incomplete";
        this.LJJIIJ = System.nanoTime();
        this.LJJIIJZLJL = false;
        this.LJJIIZ = 0L;
        if (this.LIZJ > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.LIZLLL >= 0) {
                if (this.LJFF > 0) {
                    if (this.LJI >= 0.0f) {
                        if (this.LJII >= 0.0f) {
                            if (this.LJIIL && (LIZ = XLY.LIZ(LJIIJ())) != null) {
                                this.LJJIIJZLJL = true;
                                this.LJJIIZI = "complete";
                                LJIIJJI("overall");
                                return AbstractC73672Svk.LJJIJIL(LIZ);
                            }
                            List list = (List) this.LJIILJJIL.getValue();
                            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
                            for (Object obj : list) {
                                if (obj instanceof UrlModel) {
                                    LJIJ = AbstractC73638SvC.LJI(new C57745MlR((UrlModel) obj, this, System.currentTimeMillis())).LJJIIJ(T16.LIZ());
                                } else if (obj instanceof Bitmap) {
                                    LJIJ = AbstractC73638SvC.LJIJ(obj);
                                } else {
                                    LJIJ = AbstractC73638SvC.LJIJ(null);
                                }
                                arrayList.add(LJIJ);
                            }
                            ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(((AbstractC73638SvC) it.next()).LJJIIJZLJL());
                            }
                            return AbstractC73672Svk.LJJLJ(arrayList2, new IDhS108S0100000_15(this, 0)).LJJL(T16.LIZIZ).LJJ(new IDaS224S0100000_15(this, 0));
                        }
                        "Failed requirement.".toString();
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    "Failed requirement.".toString();
                    throw new IllegalArgumentException("Failed requirement.");
                }
                "Failed requirement.".toString();
                throw new IllegalArgumentException("Failed requirement.");
            }
            "Failed requirement.".toString();
            throw new IllegalArgumentException("Failed requirement.");
        }
        "Failed requirement.".toString();
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // X.MCS
    public final AbstractC73672Svk<Bitmap> LIZJ() {
        Bitmap LIZ;
        this.LJJIIZI = "incomplete";
        this.LJJIIJ = System.nanoTime();
        this.LJJIIJZLJL = false;
        this.LJJIIZ = 0L;
        if (this.LJIIL && (LIZ = XLY.LIZ(LJIIJ())) != null) {
            this.LJJIIJZLJL = true;
            this.LJJIIZI = "complete";
            LJIIJJI("separate");
            return AbstractC73672Svk.LJJIJIL(LIZ);
        }
        return AbstractC73672Svk.LJIIJ(new IDuS325S0100000_15(this, 0)).LJJL(T16.LIZIZ).LJJ(new IDaS224S0100000_15(this, 1));
    }

    public final int LJI() {
        return ((Number) this.LJIILL.getValue()).intValue();
    }

    public final int LJII() {
        return ((Number) this.LJIJ.getValue()).intValue();
    }

    public final String LJIIJ() {
        return (String) this.LJIJJ.getValue();
    }

    public final Bitmap LJFF(List<Bitmap> list) {
        int i;
        int i2;
        int i3;
        int i4;
        long nanoTime = System.nanoTime();
        Bitmap output = Bitmap.createBitmap(((Number) this.LJIL.getValue()).intValue(), ((Number) this.LJIJJLI.getValue()).intValue(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(output);
        int LJI = LJI();
        for (int i5 = 0; i5 < LJI; i5++) {
            LJ(canvas, (Bitmap) ListProtector.get(list, i5), (C86197XsH) ListProtector.get((List) this.LJJ.getValue(), i5));
        }
        int i6 = C86193XsD.LIZ[this.LJIIJJI.ordinal()];
        if (i6 != 1) {
            if (i6 == 2 && LJII() != -1) {
                int LJII = LJII();
                C86197XsH c86197XsH = (C86197XsH) ORZ.LLFF((List) this.LJJ.getValue());
                Paint LIZIZ = C6D8.LIZIZ(true);
                Integer LJI2 = C79045V0n.LJI(this.LJIIIIZZ, this.LIZ);
                if (LJI2 != null) {
                    i3 = LJI2.intValue();
                } else {
                    i3 = 0;
                }
                LIZIZ.setColor(i3);
                LIZIZ.setStyle(Paint.Style.FILL);
                canvas.drawCircle(c86197XsH.LIZ, c86197XsH.LIZIZ, this.LJJII, LIZIZ);
                String LJIIIIZZ = LJIIIIZZ(LJII);
                int LJIIIZ = LJIIIZ(LJII);
                Typeface LIZLLL = C8HI.LIZJ().LIZLLL("medium");
                TextPaint textPaint = new TextPaint();
                textPaint.setAntiAlias(true);
                float f = LJIIIZ;
                textPaint.setTextSize(f);
                Integer LJI3 = C79045V0n.LJI(this.LJIIIZ, this.LIZ);
                if (LJI3 != null) {
                    i4 = LJI3.intValue();
                } else {
                    i4 = 0;
                }
                textPaint.setColor(i4);
                textPaint.setTextAlign(Paint.Align.CENTER);
                textPaint.setTypeface(LIZLLL);
                textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
                canvas.drawText(LJIIIIZZ, c86197XsH.LIZ, (f / 3.0f) + c86197XsH.LIZIZ, textPaint);
            }
        } else if (((Number) this.LJIILLIIL.getValue()).intValue() > 0) {
            int LJII2 = LJII();
            int i7 = this.LJJIII * 2;
            Bitmap outputBitmap = Bitmap.createBitmap(i7, i7, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(outputBitmap);
            String LJIIIIZZ2 = LJIIIIZZ(LJII2);
            int LJIIIZ2 = LJIIIZ(LJII2);
            Paint LIZIZ2 = C6D8.LIZIZ(true);
            LIZIZ2.setStyle(Paint.Style.FILL);
            Integer LJI4 = C79045V0n.LJI(this.LJIIIIZZ, this.LIZ);
            if (LJI4 != null) {
                i = LJI4.intValue();
            } else {
                i = 0;
            }
            LIZIZ2.setColor(i);
            float f2 = i7;
            canvas2.drawRect(0.0f, 0.0f, f2, f2, LIZIZ2);
            Typeface LIZLLL2 = C8HI.LIZJ().LIZLLL("medium");
            TextPaint textPaint2 = new TextPaint();
            textPaint2.setAntiAlias(true);
            float f3 = LJIIIZ2;
            textPaint2.setTextSize(f3);
            Integer LJI5 = C79045V0n.LJI(this.LJIIIZ, this.LIZ);
            if (LJI5 != null) {
                i2 = LJI5.intValue();
            } else {
                i2 = 0;
            }
            textPaint2.setColor(i2);
            textPaint2.setTextAlign(Paint.Align.CENTER);
            textPaint2.setTypeface(LIZLLL2);
            textPaint2.setStyle(Paint.Style.FILL);
            float f4 = this.LJJIII;
            canvas2.drawText(LJIIIIZZ2, f4, (f3 / 3.0f) + f4, textPaint2);
            o.LJIIIIZZ(outputBitmap, "outputBitmap");
            LJ(canvas, outputBitmap, (C86197XsH) ORZ.LLFF((List) this.LJJ.getValue()));
        }
        this.LJJIIZ = (System.nanoTime() - nanoTime) + this.LJJIIZ;
        o.LJIIIIZZ(output, "output");
        return output;
    }

    public final String LJIIIIZZ(int i) {
        String str;
        if (this.LJIIJ) {
            str = "%d+";
        } else {
            str = "+%d";
        }
        Object[] objArr = new Object[1];
        if (i > 99) {
            i = 99;
        } else if (i < 1) {
            i = 1;
        }
        objArr[0] = Integer.valueOf(i);
        return Q8U.LIZIZ(objArr, 1, str, "format(this, *args)");
    }

    public final int LJIIIZ(int i) {
        float f;
        float f2;
        if (i >= 0) {
            if (i < 10) {
                return (int) (this.LJJIII * 1.3d * this.LJII);
            }
            if (i < 100) {
                f = this.LJJIII;
                f2 = this.LJII;
                return (int) (f * f2);
            }
        }
        f = this.LJJIII;
        f2 = this.LJII;
        return (int) (f * f2);
    }

    public final void LJIIJJI(String str) {
        long nanoTime = System.nanoTime();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("draw_method", str);
        c188727au.LJ(nanoTime - this.LJJIIJ, "total_draw_time");
        c188727au.LJ(this.LJJIIZ, "internal_draw_time");
        c188727au.LJFF(Boolean.valueOf(this.LJJIIJZLJL), "hit_cache");
        c188727au.LIZLLL(XLY.LIZIZ.size(), "cache_occupancy");
        c188727au.LIZLLL(this.LIZJ, "config_avatar_width");
        c188727au.LIZLLL(this.LIZLLL, "config_stroke_width");
        c188727au.LIZLLL(this.LJFF, "config_max_circle_num");
        c188727au.LIZIZ(this.LJI, "config_circle_interval");
        c188727au.LIZIZ(this.LJII, "config_text_size_scale");
        c188727au.LIZLLL(this.LJIIIIZZ, "config_number_circle_bg_color");
        c188727au.LIZLLL(this.LJIIIZ, "config_number_circle_text_color");
        c188727au.LJFF(Boolean.valueOf(this.LJIIJ), "config_is_rtl");
        c188727au.LJFF(Boolean.valueOf(this.LJIIL), "config_enable_cache");
        c188727au.LIZLLL(LJI(), "avatar_circle_num");
        c188727au.LIZLLL(((Number) this.LJIILLIIL.getValue()).intValue(), "number_circle_num");
        c188727au.LIZLLL(LJII(), "plus_number");
        c188727au.LJIIIZ("draw_result", this.LJJIIZI);
        FMX.LJIIL("avatar_union_draw", c188727au.LIZ);
    }

    public final void LJ(Canvas canvas, Bitmap bitmap, C86197XsH c86197XsH) {
        int i;
        Paint LIZIZ = C6D8.LIZIZ(true);
        LIZIZ.setStyle(Paint.Style.FILL);
        LIZIZ.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        canvas.drawCircle(c86197XsH.LIZ, c86197XsH.LIZIZ, this.LJJIII, LIZIZ);
        if (this.LJ != null) {
            int color = LIZIZ.getColor();
            LIZIZ.setStyle(Paint.Style.FILL);
            LIZIZ.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
            Integer LJI = C79045V0n.LJI(this.LJ.intValue(), this.LIZ);
            if (LJI != null) {
                i = LJI.intValue();
            } else {
                i = 0;
            }
            LIZIZ.setColor(i);
            canvas.drawCircle(c86197XsH.LIZ, c86197XsH.LIZIZ, this.LJJIII, LIZIZ);
            LIZIZ.setColor(color);
        }
        int i2 = this.LIZJ;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i2, i2, true);
        o.LJIIIIZZ(createScaledBitmap, "Bitmap.createScaledBitma…s, width, height, filter)");
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(createScaledBitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        bitmapShader.getLocalMatrix(matrix);
        int i3 = c86197XsH.LIZ;
        int i4 = this.LJJII;
        matrix.setTranslate(i3 - i4, c86197XsH.LIZIZ - i4);
        bitmapShader.setLocalMatrix(matrix);
        LIZIZ.setStyle(Paint.Style.FILL);
        LIZIZ.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        LIZIZ.setShader(bitmapShader);
        canvas.drawCircle(c86197XsH.LIZ, c86197XsH.LIZIZ, this.LJJII, LIZIZ);
    }

    public C86192XsC(Context context, C197267og c197267og, int i, int i2, Integer num, int i3, float f, float f2, int i4, int i5, boolean z, EnumC86195XsF tailStyle, boolean z2, boolean z3) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(tailStyle, "tailStyle");
        this.LIZ = context;
        this.LIZIZ = c197267og;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = num;
        this.LJFF = i3;
        this.LJI = f;
        this.LJII = f2;
        this.LJIIIIZZ = i4;
        this.LJIIIZ = i5;
        this.LJIIJ = z;
        this.LJIIJJI = tailStyle;
        this.LJIIL = z2;
        this.LJIILIIL = z3;
        this.LJIILJJIL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 7));
        this.LJIILL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 0));
        this.LJIILLIIL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 6));
        this.LJIIZILJ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 10));
        this.LJIJ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 8));
        this.LJIJI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 3));
        this.LJIJJ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 9));
        this.LJIJJLI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 4));
        this.LJIL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 5));
        this.LJJ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 1));
        this.LJJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 4));
        this.LJJIFFI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 2));
        int i6 = i / 2;
        this.LJJII = i6;
        this.LJJIII = i6 + i2;
        this.LJJIIJ = Long.MAX_VALUE;
        this.LJJIIZI = "complete";
    }
}

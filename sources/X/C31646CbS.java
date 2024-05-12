package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveEnableLevelBadgeInnerBorderSetting;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AqS152S0200000_5;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.CbS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C31646CbS extends AbstractC31467CWp {
    public static final C31655Cbb LJJJJZI;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJJJLIIL;
    public static WeakReference<Bitmap> LJJJLL;
    public final Bitmap LJI;
    public final Bitmap LJII;
    public final Bitmap LJIIIIZZ;
    public final String LJIIIZ;
    public final C62822Ol8 LJIIJ;
    public final boolean LJIIJJI;
    public final boolean LJIIL;
    public final boolean LJIILIIL;
    public final boolean LJIILJJIL;
    public final boolean LJIILL;
    public final int LJIILLIIL;
    public final C5H3 LJIIZILJ;
    public final C31650CbW LJIJ;
    public final Paint LJIJI;
    public final int LJIJJ;
    public final boolean LJIJJLI;
    public final boolean LJIL;
    public int LJJ;
    public int LJJI;
    public final int LJJIFFI;
    public final int LJJII;
    public final int LJJIII;
    public final int LJJIIJ;
    public final int LJJIIJZLJL;
    public final boolean LJJIIZ;
    public final int LJJIIZI;
    public final int LJJIJ;
    public final int LJJIJIIJI;
    public final Boolean LJJIJIIJIL;
    public final boolean LJJIJIL;
    public float LJJIJL;
    public int LJJIJLIJ;
    public int LJJIL;
    public final C62822Ol8 LJJIZ;
    public final C62822Ol8 LJJJ;
    public final int LJJJI;
    public int LJJJIL;
    public int LJJJJ;
    public int LJJJJI;
    public int LJJJJIZL;
    public final int LJJJJJ;
    public final boolean LJJJJJL;
    public int LJJJJL;
    public int LJJJJLI;
    public int LJJJJLL;
    public final boolean LJJJJZ;

    static {
        TBT tbt = new TBT(C31646CbS.class, "finalArrowBitmap", "getFinalArrowBitmap()Landroid/graphics/Bitmap;", 0);
        C65352Pkq.LIZ.getClass();
        LJJJLIIL = new InterfaceC74236TBo[]{tbt};
        LJJJJZI = new C31655Cbb();
        LJJJLL = new WeakReference<>(null);
    }

    public int LJIIIIZZ() {
        return -1;
    }

    public int LJIIIZ() {
        return -1;
    }

    public String LJIIL() {
        return null;
    }

    public void LJIILJJIL(Canvas canvas, RectF rectF) {
        o.LJIIIZ(canvas, "canvas");
        o.LJIIIZ(rectF, "rectF");
    }

    public void LJIILL(Canvas canvas, RectF rectF) {
        o.LJIIIZ(canvas, "canvas");
        o.LJIIIZ(rectF, "rectF");
    }

    public int LJFF() {
        if (this.LJJJJJL) {
            return this.LJJJJJ;
        }
        return (LJIIJ() - this.LJJII) - this.LJJIII;
    }

    public final int LJIIJ() {
        return ((Number) this.LJIIZILJ.getValue()).intValue();
    }

    public final C31652CbY LJIIJJI() {
        return (C31652CbY) this.LJIIJ.getValue();
    }

    public String LJIILIIL() {
        return this.LJIIIZ;
    }

    @Override // X.AbstractC31467CWp
    public int LJ(Paint paint) {
        int i;
        int i2;
        int i3;
        Bitmap bitmap;
        int i4;
        Bitmap bitmap2;
        String LJIILIIL;
        int i5;
        Bitmap bitmap3;
        o.LJIIIZ(paint, "paint");
        int LJFF = LJFF();
        this.LJJJJIZL = LJFF;
        if (this.LJIIL && (bitmap3 = this.LJI) != null && bitmap3.getWidth() > 0 && this.LJI.getHeight() > 0) {
            i = (this.LJI.getWidth() * LJFF) / this.LJI.getHeight();
        } else {
            i = 0;
        }
        this.LJJJJI = i;
        if (!this.LJIILIIL || (LJIILIIL = LJIILIIL()) == null || LJIILIIL.length() == 0) {
            i2 = 0;
        } else {
            C23010vJ.LIZIZ(this.LIZ, paint, this.LIZLLL, this.LJJJI);
            String LJIILIIL2 = LJIILIIL();
            String LJIILIIL3 = LJIILIIL();
            if (LJIILIIL3 != null) {
                i5 = LJIILIIL3.length();
            } else {
                i5 = 0;
            }
            i2 = (int) paint.measureText(LJIILIIL2, 0, i5);
        }
        this.LJJJJLL = i2;
        int i6 = i2 + this.LJJIIJZLJL;
        float f = 0.0f;
        this.LJJIJL = 0.0f;
        if (o.LJ(this.LJJIJIIJIL, Boolean.TRUE)) {
            int LIZ = C15380j0.LIZ(0.5f);
            if (this.LJJIJIL) {
                if (this.LJJIJIIJI != 0) {
                    f = LIZ / 2.0f;
                }
                this.LJJIJL = f;
            } else {
                this.LJJ += LIZ;
                this.LJJIJLIJ += LIZ;
                this.LJJI += LIZ;
                this.LJJIL += LIZ;
            }
        }
        if (this.LJJIIZ && this.LJJIIJ != 0) {
            this.LJJJJL = C15380j0.LIZ(2.0f);
            int i7 = this.LJJIIJ;
            int i8 = this.LJJ;
            int i9 = i7 + i8;
            this.LJJJJ = i9;
            int i10 = (i9 - i8) - this.LJJI;
            this.LJJJIL = i10;
            int i11 = (i10 - this.LJJJJI) - i6;
            if (this.LJIILJJIL && (bitmap2 = (Bitmap) this.LJIJ.LIZ(this, LJJJLIIL[0])) != null) {
                i4 = bitmap2.getWidth();
            } else {
                i4 = 0;
            }
            this.LJJJJLI = (i11 - i4) - this.LJJJJL;
        } else {
            int i12 = this.LJJJJI + i6;
            if (this.LJIILJJIL && (bitmap = (Bitmap) this.LJIJ.LIZ(this, LJJJLIIL[0])) != null) {
                i3 = bitmap.getWidth();
            } else {
                i3 = 0;
            }
            int i13 = i3 + i12 + this.LJJJJL + this.LJJJJLI;
            this.LJJJIL = i13;
            this.LJJJJ = i13 + this.LJJI + this.LJJ;
        }
        if (this.LJJJJZ) {
            return 0;
        }
        return this.LJJJJ;
    }

    @Override // X.AbstractC31467CWp
    public void LIZLLL(Canvas canvas, Paint paint) {
        Bitmap bitmap;
        int i;
        int i2;
        Bitmap bitmap2;
        int i3;
        boolean z;
        boolean z2;
        byte[] bArr;
        o.LJIIIZ(canvas, "canvas");
        o.LJIIIZ(paint, "paint");
        if (this.LJJJJZ) {
            return;
        }
        paint.reset();
        paint.setAntiAlias(true);
        if (this.LJIILL) {
            Bitmap bitmap3 = this.LJII;
            RectF rectF = (RectF) this.LJJIZ.getValue();
            if (this.LJIIJJI) {
                int i4 = this.LIZIZ - this.LJJ;
                float f = i4 - this.LJJJIL;
                float f2 = this.LJJIJL;
                rectF.left = f + f2;
                rectF.right = i4 - f2;
                rectF.top = this.LJJIJLIJ + f2;
                rectF.bottom = (LJIIJ() - this.LJJIL) - this.LJJIJL;
            } else {
                float f3 = this.LJJ;
                float f4 = this.LJJIJL;
                rectF.left = f3 + f4;
                rectF.right = (this.LJJJIL + f3) - f4;
                rectF.top = this.LJJIJLIJ + f4;
                rectF.bottom = (LJIIJ() - this.LJJIL) - this.LJJIJL;
            }
            if (bitmap3 != null) {
                RectF rectF2 = (RectF) this.LJJIZ.getValue();
                if (this.LJIIJJI && this.LJIL) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (bitmap3.getNinePatchChunk() != null) {
                    Bitmap bitmap4 = this.LJII;
                    if (bitmap4 != null) {
                        bArr = bitmap4.getNinePatchChunk();
                    } else {
                        bArr = null;
                    }
                    NinePatch ninePatch = new NinePatch(bitmap4, bArr, null);
                    if (z2) {
                        canvas.save();
                        canvas.translate(rectF2.right - rectF2.left, 0.0f);
                        canvas.scale(-1.0f, 1.0f);
                    }
                    ninePatch.draw(canvas, rectF2);
                    if (z2) {
                        canvas.restore();
                    }
                } else {
                    LJI(canvas, bitmap3, rectF2, z2, rectF2.right - rectF2.left, null, null);
                }
            } else {
                RectF rectF3 = (RectF) this.LJJIZ.getValue();
                paint.setAntiAlias(true);
                paint.setColor(this.LJJIJ);
                float f5 = this.LJIJJ;
                canvas.drawRoundRect(rectF3, f5, f5, paint);
                paint.setColor(this.LJJIJIIJI);
                paint.setDither(true);
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(KL2.LIZJ(this.LIZ, 0.5f));
                float f6 = this.LJIJJ;
                canvas.drawRoundRect(rectF3, f6, f6, paint);
            }
        }
        if (this.LJIIL && (bitmap2 = this.LJI) != null && !bitmap2.isRecycled()) {
            if (this.LJJJJJL) {
                i3 = 0;
            } else {
                i3 = this.LJJII;
                if (i3 <= 0 && this.LJJIII <= 0) {
                    i3 = (LJIIJ() - this.LJJJJIZL) / 2;
                }
            }
            Rect rect = (Rect) this.LJJJ.getValue();
            if (this.LJIIJJI) {
                int i5 = this.LIZIZ - (this.LJJJJL + this.LJJ);
                rect.left = i5 - this.LJJJJI;
                rect.right = i5;
            } else {
                int i6 = this.LJJJJL + this.LJJ;
                rect.left = i6;
                rect.right = i6 + this.LJJJJI;
            }
            rect.top = i3;
            rect.bottom = this.LJJJJIZL + i3;
            Bitmap bitmap5 = this.LJI;
            RectF rectF4 = new RectF((Rect) this.LJJJ.getValue());
            if (this.LJIIJJI && this.LJIJJLI) {
                z = true;
            } else {
                z = false;
            }
            LJI(canvas, bitmap5, rectF4, z, ((this.LIZIZ + ((Rect) this.LJJJ.getValue()).left) - this.LJJJJL) - this.LJJ, new C31648CbU(this), new C31649CbV(this));
        }
        if (this.LJIILIIL) {
            C23010vJ.LIZIZ(this.LIZ, paint, this.LIZLLL, this.LJJJI);
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            paint.setColor(this.LJJIIZI);
            paint.setStyle(Paint.Style.FILL);
            if (this.LJIIJJI) {
                i2 = (((this.LIZIZ - this.LJJJJI) - this.LJJIIJZLJL) - (this.LJJJJL + this.LJJ)) - this.LJJJJLL;
            } else {
                int i7 = ((Rect) this.LJJJ.getValue()).right + this.LJJIIJZLJL;
                if (this.LJIIL && this.LJI != null) {
                    i = 0;
                } else {
                    i = this.LJJJJL + this.LJJ;
                }
                i2 = i7 + i;
            }
            int alpha = paint.getAlpha();
            Integer valueOf = Integer.valueOf(LJIIIZ());
            if (valueOf.intValue() >= 0) {
                paint.setAlpha(valueOf.intValue());
            }
            float LJIIJ = ((LJIIJ() - fontMetricsInt.descent) - fontMetricsInt.ascent) / 2.0f;
            float f7 = i2;
            canvas.drawText(String.valueOf(LJIILIIL()), f7, LJIIJ, paint);
            Integer valueOf2 = Integer.valueOf(LJIIIIZZ());
            if (valueOf2.intValue() >= 0) {
                paint.setAlpha(valueOf2.intValue());
            }
            String LJIIL = LJIIL();
            if (LJIIL != null) {
                canvas.drawText(LJIIL, f7, LJIIJ, paint);
            }
            paint.setAlpha(alpha);
        }
        if (this.LJIILJJIL && (bitmap = (Bitmap) this.LJIJ.LIZ(this, LJJJLIIL[0])) != null && !bitmap.isRecycled()) {
            int LJIIJ2 = LJIIJ() - bitmap.getHeight();
            Rect rect2 = new Rect();
            if (this.LJIIJJI) {
                int i8 = this.LJJIFFI + this.LJJI;
                rect2.left = i8;
                rect2.right = bitmap.getWidth() + i8;
            } else {
                rect2.left = ((this.LIZIZ - this.LJJIFFI) - this.LJJI) - bitmap.getWidth();
                rect2.right = (this.LIZIZ - this.LJJIFFI) - this.LJJI;
            }
            int i9 = LJIIJ2 / 2;
            rect2.top = i9;
            rect2.bottom = bitmap.getHeight() + i9;
            LJI(canvas, bitmap, new RectF(rect2), this.LJIIJJI, (this.LJJI * 2) + (this.LJJIFFI * 2) + (rect2.right - rect2.left), null, null);
        }
        paint.reset();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31646CbS(Context context, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, String str, C31647CbT c31647CbT) {
        super(context);
        Integer num;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        Integer num2;
        Boolean bool6;
        Boolean bool7;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        Integer num8;
        Integer num9;
        Integer num10;
        boolean z;
        Boolean bool8;
        Integer num11;
        Integer num12;
        Integer num13;
        int i;
        Integer num14;
        int i2;
        Integer num15;
        int i3;
        Boolean bool9;
        Integer num16;
        boolean z2;
        o.LJIIIZ(context, "context");
        this.LJI = bitmap;
        this.LJII = bitmap2;
        this.LJIIIIZZ = bitmap3;
        this.LJIIIZ = str;
        this.LJIIJ = C221108m2.LIZIZ(new AqS155S0100000_5(context, 324));
        C31652CbY LJIIJJI = LJIIJJI();
        if (c31647CbT != null) {
            num = Integer.valueOf(c31647CbT.LJLLLL);
        } else {
            num = null;
        }
        C31652CbY.LIZIZ(LJIIJJI, num, -1, false, 4);
        C31652CbY LJIIJJI2 = LJIIJJI();
        if (c31647CbT != null) {
            bool = Boolean.valueOf(c31647CbT.LJLJL);
        } else {
            bool = null;
        }
        this.LJIIJJI = C31652CbY.LIZ(LJIIJJI2, bool);
        C31652CbY LJIIJJI3 = LJIIJJI();
        if (c31647CbT != null) {
            bool2 = Boolean.valueOf(c31647CbT.LJLIL);
        } else {
            bool2 = null;
        }
        boolean LIZ = C31652CbY.LIZ(LJIIJJI3, bool2);
        this.LJIIL = LIZ;
        C31652CbY LJIIJJI4 = LJIIJJI();
        if (c31647CbT != null) {
            bool3 = Boolean.valueOf(c31647CbT.LJLILLLLZI);
        } else {
            bool3 = null;
        }
        boolean LIZ2 = C31652CbY.LIZ(LJIIJJI4, bool3);
        this.LJIILIIL = LIZ2;
        C31652CbY LJIIJJI5 = LJIIJJI();
        if (c31647CbT != null) {
            bool4 = Boolean.valueOf(c31647CbT.LJLJI);
        } else {
            bool4 = null;
        }
        boolean LIZ3 = C31652CbY.LIZ(LJIIJJI5, bool4);
        this.LJIILJJIL = LIZ3;
        C31652CbY LJIIJJI6 = LJIIJJI();
        if (c31647CbT != null) {
            bool5 = Boolean.valueOf(c31647CbT.LJLJJI);
        } else {
            bool5 = null;
        }
        boolean LIZ4 = C31652CbY.LIZ(LJIIJJI6, bool5);
        this.LJIILL = LIZ4;
        C31652CbY LJIIJJI7 = LJIIJJI();
        if (c31647CbT != null) {
            num2 = Integer.valueOf(c31647CbT.LJLLL);
        } else {
            num2 = null;
        }
        this.LJIILLIIL = C31652CbY.LIZIZ(LJIIJJI7, num2, 0, false, 6);
        this.LJIIZILJ = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 323));
        this.LJIJ = new C31650CbW(new AqS152S0200000_5(this, context, 17));
        this.LJIJI = new Paint(1);
        this.LJIJJ = context.getResources().getDimensionPixelSize(R.dimen.nz);
        C31652CbY LJIIJJI8 = LJIIJJI();
        if (c31647CbT != null) {
            bool6 = Boolean.valueOf(c31647CbT.LJLJJL);
        } else {
            bool6 = null;
        }
        this.LJIJJLI = C31652CbY.LIZ(LJIIJJI8, bool6);
        C31652CbY LJIIJJI9 = LJIIJJI();
        if (c31647CbT != null) {
            bool7 = Boolean.valueOf(c31647CbT.LJLJJLL);
        } else {
            bool7 = null;
        }
        this.LJIL = C31652CbY.LIZ(LJIIJJI9, bool7);
        C31652CbY LJIIJJI10 = LJIIJJI();
        if (c31647CbT != null) {
            num3 = Integer.valueOf(c31647CbT.LJLJLJ);
        } else {
            num3 = null;
        }
        this.LJJ = C31652CbY.LIZIZ(LJIIJJI10, num3, 0, false, 6);
        C31652CbY LJIIJJI11 = LJIIJJI();
        if (c31647CbT != null) {
            num4 = Integer.valueOf(c31647CbT.LJLJLLL);
        } else {
            num4 = null;
        }
        this.LJJI = C31652CbY.LIZIZ(LJIIJJI11, num4, 0, false, 6);
        C31652CbY LJIIJJI12 = LJIIJJI();
        if (c31647CbT != null) {
            num5 = Integer.valueOf(c31647CbT.LJLL);
        } else {
            num5 = null;
        }
        int LIZIZ = C31652CbY.LIZIZ(LJIIJJI12, num5, 0, false, 6);
        C31652CbY LJIIJJI13 = LJIIJJI();
        if (c31647CbT != null) {
            num6 = Integer.valueOf(c31647CbT.LJLLI);
        } else {
            num6 = null;
        }
        int LIZIZ2 = C31652CbY.LIZIZ(LJIIJJI13, num6, 0, false, 6);
        this.LJJIFFI = LIZIZ2;
        C31652CbY LJIIJJI14 = LJIIJJI();
        if (c31647CbT != null) {
            num7 = Integer.valueOf(c31647CbT.LJLLILLLL);
        } else {
            num7 = null;
        }
        this.LJJII = C31652CbY.LIZIZ(LJIIJJI14, num7, 0, false, 6);
        C31652CbY LJIIJJI15 = LJIIJJI();
        if (c31647CbT != null) {
            num8 = Integer.valueOf(c31647CbT.LJLLJ);
        } else {
            num8 = null;
        }
        this.LJJIII = C31652CbY.LIZIZ(LJIIJJI15, num8, 0, false, 6);
        C31652CbY LJIIJJI16 = LJIIJJI();
        if (c31647CbT != null) {
            num9 = Integer.valueOf(c31647CbT.LJLLLLLL);
        } else {
            num9 = null;
        }
        this.LJJIIJ = C31652CbY.LIZIZ(LJIIJJI16, num9, 0, false, 6);
        C31652CbY LJIIJJI17 = LJIIJJI();
        if (c31647CbT != null) {
            num10 = Integer.valueOf(c31647CbT.LJLZ);
        } else {
            num10 = null;
        }
        if (LIZ && LIZ2) {
            z = true;
        } else {
            z = false;
        }
        this.LJJIIJZLJL = C31652CbY.LIZIZ(LJIIJJI17, num10, 0, z, 2);
        C31652CbY LJIIJJI18 = LJIIJJI();
        if (c31647CbT != null) {
            bool8 = Boolean.valueOf(c31647CbT.LJZ);
        } else {
            bool8 = null;
        }
        this.LJJIIZ = C31652CbY.LIZ(LJIIJJI18, bool8);
        C31652CbY LJIIJJI19 = LJIIJJI();
        if (c31647CbT != null) {
            num11 = Integer.valueOf(c31647CbT.LJZI);
        } else {
            num11 = null;
        }
        C31652CbY.LIZIZ(LJIIJJI19, num11, 0, false, 6);
        C31652CbY LJIIJJI20 = LJIIJJI();
        if (c31647CbT != null) {
            num12 = Integer.valueOf(c31647CbT.LJZL);
        } else {
            num12 = null;
        }
        C31652CbY.LIZIZ(LJIIJJI20, num12, 0, false, 6);
        C31652CbY LJIIJJI21 = LJIIJJI();
        if (c31647CbT != null) {
            num13 = Integer.valueOf(c31647CbT.LL);
        } else {
            num13 = null;
        }
        LJIIJJI21.getClass();
        if (num13 != null) {
            i = num13.intValue();
        } else {
            i = -1;
        }
        this.LJJIIZI = i;
        C31652CbY LJIIJJI22 = LJIIJJI();
        if (c31647CbT != null) {
            num14 = Integer.valueOf(c31647CbT.LLF);
        } else {
            num14 = null;
        }
        LJIIJJI22.getClass();
        if (num14 != null) {
            i2 = num14.intValue();
        } else {
            i2 = 0;
        }
        this.LJJIJ = i2;
        C31652CbY LJIIJJI23 = LJIIJJI();
        if (c31647CbT != null) {
            num15 = Integer.valueOf(c31647CbT.LLFF);
        } else {
            num15 = null;
        }
        LJIIJJI23.getClass();
        if (num15 != null) {
            i3 = num15.intValue();
        } else {
            i3 = 0;
        }
        this.LJJIJIIJI = i3;
        if (c31647CbT != null) {
            bool9 = Boolean.valueOf(c31647CbT.LLD);
        } else {
            bool9 = null;
        }
        this.LJJIJIIJIL = bool9;
        this.LJJIJIL = LiveEnableLevelBadgeInnerBorderSetting.INSTANCE.getValue();
        this.LJJIZ = C221108m2.LIZIZ(C31654Cba.LJLIL);
        this.LJJJ = C221108m2.LIZIZ(C31653CbZ.LJLIL);
        this.LJJJI = 600;
        C31652CbY LJIIJJI24 = LJIIJJI();
        if (c31647CbT != null) {
            num16 = Integer.valueOf(c31647CbT.LJLLL);
        } else {
            num16 = null;
        }
        this.LJJJJJ = C31652CbY.LIZIZ(LJIIJJI24, num16, this.LIZJ, false, 4);
        if (LIZ && !LIZ2 && !LIZ3) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJJJJJL = z2;
        this.LJJJJL = z2 ? 0 : LIZIZ;
        this.LJJJJLI = z2 ? 0 : LIZIZ2;
        this.LJJJJZ = !(LIZ || LIZ2 || LIZ3 || (LIZ4 && bitmap2 != null)) || c31647CbT == null;
    }

    public final void LJI(Canvas canvas, Bitmap bitmap, RectF rectF, boolean z, float f, InterfaceC88471Ynr<? super Canvas, ? super RectF, C76800UCe> interfaceC88471Ynr, InterfaceC88471Ynr<? super Canvas, ? super RectF, C76800UCe> interfaceC88471Ynr2) {
        if (bitmap != null) {
            if (z && f > 0.0f) {
                canvas.save();
                canvas.translate(f, 0.0f);
                canvas.scale(-1.0f, 1.0f);
            }
            if (interfaceC88471Ynr != null) {
                interfaceC88471Ynr.invoke(canvas, rectF);
            }
            canvas.drawBitmap(bitmap, (Rect) null, rectF, this.LJIJI);
            if (interfaceC88471Ynr2 != null) {
                interfaceC88471Ynr2.invoke(canvas, rectF);
            }
            if (z && f > 0.0f) {
                canvas.restore();
            }
        }
    }
}

package X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.Arrays;

/* renamed from: X.27b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C532327b extends QXX implements InterfaceC36821cU {
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public final float[] LJLJJLL;
    public final Path LJLJL;
    public final Path LJLJLJ;
    public final Paint LJLJLLL;
    public final Paint LJLL;
    public final RectF LJLLI;
    public float LJLLILLLL;
    public C260010i LJLLJ;
    public ColorStateList LJLLL;
    public float LJLLLL;
    public float LJLLLLLL;
    public float LJLZ;
    public float LJZ;
    public float LJZI;
    public boolean LJZL;
    public final InterfaceC36811cT LL;
    public final Rect LLD;
    public C35661ac LLF;

    @Override // X.QXX
    public final int[] LLLLLLL() {
        return new int[]{R.attr.startColor, R.attr.endColor, R.attr.centerColor, com.zhiliaoapp.musically.R.attr.w9, com.zhiliaoapp.musically.R.attr.z6, com.zhiliaoapp.musically.R.attr.z7, com.zhiliaoapp.musically.R.attr.zf, com.zhiliaoapp.musically.R.attr.zg, com.zhiliaoapp.musically.R.attr.a3c, com.zhiliaoapp.musically.R.attr.a7i, com.zhiliaoapp.musically.R.attr.af2, com.zhiliaoapp.musically.R.attr.af3, com.zhiliaoapp.musically.R.attr.af4, com.zhiliaoapp.musically.R.attr.b6h, com.zhiliaoapp.musically.R.attr.bf6, com.zhiliaoapp.musically.R.attr.bf7, com.zhiliaoapp.musically.R.attr.bf8, com.zhiliaoapp.musically.R.attr.bf9, com.zhiliaoapp.musically.R.attr.bka, com.zhiliaoapp.musically.R.attr.bkb, com.zhiliaoapp.musically.R.attr.bkj, com.zhiliaoapp.musically.R.attr.bkk};
    }

    public final C35661ac LLLLZIL() {
        if (this.LLF == null) {
            C35661ac c35661ac = new C35661ac();
            this.LLF = c35661ac;
            InterfaceC36811cT interfaceC36811cT = this.LL;
            c35661ac.LJLJJLL = interfaceC36811cT;
            c35661ac.LIZ();
            if (interfaceC36811cT != null) {
                interfaceC36811cT.invalidate();
            }
        }
        return this.LLF;
    }

    public final void LLLLZLLLI() {
        float f;
        float f2;
        if (this.LLD.width() <= 0 || this.LLD.height() <= 0) {
            return;
        }
        boolean LJJIJLIJ = this.LL.LJJIJLIJ();
        this.LJLJL.reset();
        this.LJLJLJ.reset();
        this.LJZL = false;
        float width = this.LLD.width();
        float height = this.LLD.height();
        this.LJLLI.set(0.0f, 0.0f, width, height);
        Arrays.fill(this.LJLJJLL, 0.0f);
        float min = Math.min(width, height) / 2.0f;
        float f3 = this.LJLLLL;
        if (f3 > 0.0f) {
            float[] fArr = this.LJLJJLL;
            fArr[7] = f3;
            fArr[6] = f3;
            fArr[5] = f3;
            fArr[4] = f3;
            fArr[3] = f3;
            fArr[2] = f3;
            fArr[1] = f3;
            fArr[0] = f3;
            this.LJZL = true;
        }
        float f4 = this.LJLLLLLL;
        if (f4 > 0.0f) {
            if (!LJJIJLIJ) {
                float[] fArr2 = this.LJLJJLL;
                fArr2[1] = f4;
                fArr2[0] = f4;
            } else {
                float[] fArr3 = this.LJLJJLL;
                fArr3[3] = f4;
                fArr3[2] = f4;
            }
            this.LJZL = true;
        }
        float f5 = this.LJLZ;
        if (f5 > 0.0f) {
            if (!LJJIJLIJ) {
                float[] fArr4 = this.LJLJJLL;
                fArr4[3] = f5;
                fArr4[2] = f5;
            } else {
                float[] fArr5 = this.LJLJJLL;
                fArr5[1] = f5;
                fArr5[0] = f5;
            }
            this.LJZL = true;
        }
        float f6 = this.LJZ;
        if (f6 > 0.0f) {
            if (!LJJIJLIJ) {
                float[] fArr6 = this.LJLJJLL;
                fArr6[7] = f6;
                fArr6[6] = f6;
            } else {
                float[] fArr7 = this.LJLJJLL;
                fArr7[5] = f6;
                fArr7[4] = f6;
            }
            this.LJZL = true;
        }
        float f7 = this.LJZI;
        if (f7 > 0.0f) {
            if (!LJJIJLIJ) {
                float[] fArr8 = this.LJLJJLL;
                fArr8[5] = f7;
                fArr8[4] = f7;
            } else {
                float[] fArr9 = this.LJLJJLL;
                fArr9[7] = f7;
                fArr9[6] = f7;
            }
            this.LJZL = true;
        }
        if (this.LJLIL) {
            Arrays.fill(this.LJLJJLL, min);
            this.LJZL = true;
        }
        if (this.LJLILLLLZI) {
            if (!LJJIJLIJ) {
                float[] fArr10 = this.LJLJJLL;
                fArr10[1] = min;
                fArr10[0] = min;
            } else {
                float[] fArr11 = this.LJLJJLL;
                fArr11[3] = min;
                fArr11[2] = min;
            }
            this.LJZL = true;
        }
        if (this.LJLJI) {
            if (!LJJIJLIJ) {
                float[] fArr12 = this.LJLJJLL;
                fArr12[3] = min;
                fArr12[2] = min;
            } else {
                float[] fArr13 = this.LJLJJLL;
                fArr13[1] = min;
                fArr13[0] = min;
            }
            this.LJZL = true;
        }
        if (this.LJLJJI) {
            if (!LJJIJLIJ) {
                float[] fArr14 = this.LJLJJLL;
                fArr14[7] = min;
                fArr14[6] = min;
            } else {
                float[] fArr15 = this.LJLJJLL;
                fArr15[5] = min;
                fArr15[4] = min;
            }
            this.LJZL = true;
        }
        if (this.LJLJJL) {
            if (!LJJIJLIJ) {
                float[] fArr16 = this.LJLJJLL;
                fArr16[5] = min;
                fArr16[4] = min;
            } else {
                float[] fArr17 = this.LJLJJLL;
                fArr17[7] = min;
                fArr17[6] = min;
            }
            this.LJZL = true;
        }
        if (this.LJZL) {
            this.LJLJL.addRoundRect(this.LJLLI, this.LJLJJLL, Path.Direction.CW);
        }
        this.LJLJLJ.addRoundRect(this.LJLLI, this.LJLJJLL, Path.Direction.CW);
        if (this.LJLLJ == null) {
            return;
        }
        Paint paint = this.LJLL;
        if (LJJIJLIJ) {
            f2 = width;
            f = 2.0f;
        } else {
            f = 2.0f;
            f2 = 0.0f;
        }
        float f8 = height / f;
        if (LJJIJLIJ) {
            width = 0.0f;
        }
        paint.setShader(new LinearGradient(f2, f8, width, f8, this.LJLLJ.LIZ, (float[]) null, Shader.TileMode.CLAMP));
    }

    @Override // X.InterfaceC24210xF
    public final int[] getGradientColors() {
        return LLLLZIL().LJLIL;
    }

    @Override // X.InterfaceC24210xF
    public final float[] getGradientPositions() {
        return LLLLZIL().LJLILLLLZI;
    }

    public C532327b(InterfaceC36811cT interfaceC36811cT) {
        super((Object) null);
        this.LJLJJLL = new float[8];
        Path path = new Path();
        this.LJLJL = path;
        Path path2 = new Path();
        this.LJLJLJ = path2;
        Paint paint = new Paint(1);
        this.LJLJLLL = paint;
        Paint paint2 = new Paint(1);
        this.LJLL = paint2;
        this.LJLLI = new RectF();
        this.LLD = new Rect();
        this.LL = interfaceC36811cT;
        path.setFillType(Path.FillType.INVERSE_WINDING);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        path2.setFillType(Path.FillType.WINDING);
        paint2.setStyle(Paint.Style.STROKE);
    }

    public final void LLLLZLLIL(Canvas canvas) {
        int colorForState;
        C35661ac c35661ac = this.LLF;
        if (c35661ac != null && c35661ac.LJLIL != null) {
            canvas.drawRect(0.0f, 0.0f, c35661ac.LJLJJL.width(), c35661ac.LJLJJL.height(), c35661ac.LJLJI);
        }
        float f = this.LJLLILLLL;
        if (f > 0.0f) {
            if (this.LJLLJ != null) {
                this.LJLL.setStrokeWidth(f * 2.0f);
                canvas.drawPath(this.LJLJLJ, this.LJLL);
                return;
            }
            ColorStateList colorStateList = this.LJLLL;
            if (colorStateList == null || (colorForState = colorStateList.getColorForState(this.LL.getState(), 0)) == 0) {
                return;
            }
            this.LJLL.setStrokeWidth(this.LJLLILLLL * 2.0f);
            this.LJLL.setColor(colorForState);
            canvas.drawPath(this.LJLJLJ, this.LJLL);
        }
    }

    @Override // X.InterfaceC24210xF
    public final void LJIJJLI(float[] fArr, int[] iArr) {
        LLLLZIL().LJIJJLI(fArr, iArr);
    }

    public final void LLLLZ(Context context, TypedArray typedArray) {
        boolean z;
        if (typedArray.getBoolean(3, false)) {
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId, new int[]{com.zhiliaoapp.musically.R.attr.b6h});
                this.LJLLLL = obtainStyledAttributes.getDimension(0, this.LJLLLL);
                obtainStyledAttributes.recycle();
            } else {
                this.LJLLLL = typedArray.getDimension(13, this.LJLLLL);
            }
        } else {
            this.LJLLLL = typedArray.getDimension(13, this.LJLLLL);
        }
        this.LJLIL = typedArray.getBoolean(8, this.LJLIL);
        this.LJLILLLLZI = typedArray.getBoolean(20, this.LJLILLLLZI);
        this.LJLJI = typedArray.getBoolean(18, this.LJLJI);
        this.LJLJJI = typedArray.getBoolean(6, this.LJLJJI);
        this.LJLJJL = typedArray.getBoolean(4, this.LJLJJL);
        this.LJLLLLLL = typedArray.getDimension(21, this.LJLLLLLL);
        this.LJLZ = typedArray.getDimension(19, this.LJLZ);
        this.LJZ = typedArray.getDimension(7, this.LJZ);
        this.LJZI = typedArray.getDimension(5, this.LJZI);
        int resourceId2 = typedArray.getResourceId(14, 0);
        if (resourceId2 != 0) {
            this.LJLLL = C04330Ez.LIZJ(resourceId2, context);
        } else if (typedArray.hasValue(14)) {
            this.LJLLL = typedArray.getColorStateList(14);
        }
        if (typedArray.hasValue(16)) {
            if (this.LJLLJ == null) {
                C260010i c260010i = new C260010i();
                this.LJLLJ = c260010i;
                c260010i.LIZ = new int[2];
            }
            this.LJLLJ.LIZ[0] = typedArray.getColor(16, 0);
            z = true;
        } else {
            z = false;
        }
        if (typedArray.hasValue(15)) {
            if (this.LJLLJ == null) {
                C260010i c260010i2 = new C260010i();
                this.LJLLJ = c260010i2;
                c260010i2.LIZ = new int[2];
            }
            this.LJLLJ.LIZ[1] = typedArray.getColor(15, 0);
            z = true;
        }
        if (!z) {
            this.LJLLJ = null;
        } else {
            this.LJLLL = null;
        }
        this.LJLLILLLL = typedArray.getDimension(17, this.LJLLILLLL);
        this.LLF = null;
        if (typedArray.hasValue(0) && typedArray.hasValue(1)) {
            int color = typedArray.getColor(0, 0);
            int color2 = typedArray.getColor(1, 0);
            if (typedArray.hasValue(2)) {
                LLLLZIL().LJIJJLI(null, new int[]{color, typedArray.getColor(2, 0), color2});
            } else {
                LLLLZIL().LJIJJLI(null, new int[]{color, color2});
            }
        } else if (typedArray.hasValue(10)) {
            int resourceId3 = typedArray.getResourceId(10, 0);
            Resources resources = context.getResources();
            C35661ac LLLLZIL = LLLLZIL();
            if (resourceId3 != 0) {
                LLLLZIL.getClass();
                TypedArray obtainTypedArray = resources.obtainTypedArray(resourceId3);
                int length = obtainTypedArray.length();
                int[] iArr = new int[length];
                for (int i = 0; i < length; i++) {
                    iArr[i] = obtainTypedArray.getColor(i, -16777216);
                }
                LLLLZIL.LJIJJLI(null, iArr);
                obtainTypedArray.recycle();
            } else {
                LLLLZIL.LJIJJLI(null, null);
            }
        }
        if (typedArray.hasValue(12)) {
            int resourceId4 = typedArray.getResourceId(12, 0);
            Resources resources2 = context.getResources();
            int[] gradientColors = getGradientColors();
            C35661ac LLLLZIL2 = LLLLZIL();
            if (resourceId4 != 0) {
                LLLLZIL2.getClass();
                TypedArray obtainTypedArray2 = resources2.obtainTypedArray(resourceId4);
                int length2 = obtainTypedArray2.length();
                float[] fArr = new float[length2];
                for (int i2 = 0; i2 < length2; i2++) {
                    fArr[i2] = obtainTypedArray2.getFloat(i2, 0.0f);
                }
                LLLLZIL2.LJIJJLI(fArr, gradientColors);
                obtainTypedArray2.recycle();
            } else {
                LLLLZIL2.LJIJJLI(null, gradientColors);
            }
        }
        int i3 = typedArray.getInt(11, LLLLZIL().LJLJJI);
        C35661ac LLLLZIL3 = LLLLZIL();
        LLLLZIL3.LJLJJI = i3;
        LLLLZIL3.LIZ();
        InterfaceC24200xE interfaceC24200xE = LLLLZIL3.LJLJJLL;
        if (interfaceC24200xE != null) {
            interfaceC24200xE.invalidate();
        }
        LLLLZLLLI();
    }
}

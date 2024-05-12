package androidx.appcompat.widget;

import X.AnonymousClass032;
import X.C19D;
import X.C19K;
import X.X1D;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.TypedValue;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class c0 {
    public static final RectF LJIIJJI = new RectF();
    public static final ConcurrentHashMap<String, Method> LJIIL = new ConcurrentHashMap<>();
    public int LIZ;
    public boolean LIZIZ;
    public float LIZJ = -1.0f;
    public float LIZLLL = -1.0f;
    public float LJ = -1.0f;
    public int[] LJFF = new int[0];
    public boolean LJI;
    public TextPaint LJII;
    public final TextView LJIIIIZZ;
    public final Context LJIIIZ;
    public final AnonymousClass032 LJIIJ;

    static {
        new ConcurrentHashMap();
    }

    public final boolean LJI() {
        boolean z;
        if (this.LJFF.length > 0) {
            z = true;
        } else {
            z = false;
        }
        this.LJI = z;
        if (z) {
            this.LIZ = 1;
            this.LIZLLL = r4[0];
            this.LJ = r4[r3 - 1];
            this.LIZJ = -1.0f;
        }
        return z;
    }

    public final boolean LJII() {
        return !(this.LJIIIIZZ instanceof C19K);
    }

    public final void LIZ() {
        int measuredWidth;
        if (LJII() && this.LIZ != 0) {
            if (this.LIZIZ) {
                if (this.LJIIIIZZ.getMeasuredHeight() <= 0 || this.LJIIIIZZ.getMeasuredWidth() <= 0) {
                    return;
                }
                if (this.LJIIJ.LIZIZ(this.LJIIIIZZ)) {
                    measuredWidth = 1048576;
                } else {
                    measuredWidth = (this.LJIIIIZZ.getMeasuredWidth() - this.LJIIIIZZ.getTotalPaddingLeft()) - this.LJIIIIZZ.getTotalPaddingRight();
                }
                int height = (this.LJIIIIZZ.getHeight() - this.LJIIIIZZ.getCompoundPaddingBottom()) - this.LJIIIIZZ.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = LJIIJJI;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float LIZJ = LIZJ(rectF);
                    if (LIZJ != this.LJIIIIZZ.getTextSize()) {
                        LJ(LIZJ, 0);
                    }
                }
            }
            this.LIZIZ = true;
        }
    }

    public final boolean LJFF() {
        if (LJII() && this.LIZ == 1) {
            if (!this.LJI || this.LJFF.length == 0) {
                int floor = ((int) Math.floor((this.LJ - this.LIZLLL) / this.LIZJ)) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round((i * this.LIZJ) + this.LIZLLL);
                }
                this.LJFF = LIZIZ(iArr);
            }
            this.LIZIZ = true;
        } else {
            this.LIZIZ = false;
        }
        return this.LIZIZ;
    }

    public c0(TextView textView) {
        this.LJIIIIZZ = textView;
        this.LJIIIZ = textView.getContext();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            this.LJIIJ = new C19D() { // from class: X.1hQ
                @Override // X.AnonymousClass032
                public boolean LIZIZ(TextView textView2) {
                    return textView2.isHorizontallyScrollable();
                }

                @Override // X.C19D, X.AnonymousClass032
                public void LIZ(StaticLayout.Builder builder, TextView textView2) {
                    builder.setTextDirection(textView2.getTextDirectionHeuristic());
                }
            };
        } else if (i >= 23) {
            this.LJIIJ = new C19D();
        } else {
            this.LJIIJ = new AnonymousClass032();
        }
    }

    public static int[] LIZIZ(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            int i2 = iArr[i];
            if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                arrayList.add(Integer.valueOf(i2));
            }
            i++;
        } while (i < length);
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr2[i3] = ((Integer) ListProtector.get(arrayList, i3)).intValue();
        }
        return iArr2;
    }

    public static Method LIZLLL(String str) {
        try {
            ConcurrentHashMap<String, Method> concurrentHashMap = LJIIL;
            Method method = concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (Exception unused) {
            return null;
        }
    }

    public final int LIZJ(RectF rectF) {
        StaticLayout staticLayout;
        int i;
        int i2;
        CharSequence transformation;
        int length = this.LJFF.length;
        if (length != 0) {
            int i3 = length - 1;
            int i4 = 0;
            int i5 = 1;
            int i6 = 0;
            while (i5 <= i3) {
                int i7 = (i5 + i3) / 2;
                int i8 = this.LJFF[i7];
                CharSequence text = this.LJIIIIZZ.getText();
                TransformationMethod transformationMethod = this.LJIIIIZZ.getTransformationMethod();
                if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.LJIIIIZZ)) != null) {
                    text = transformation;
                }
                int maxLines = this.LJIIIIZZ.getMaxLines();
                TextPaint textPaint = this.LJII;
                if (textPaint == null) {
                    this.LJII = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.LJII.set(this.LJIIIIZZ.getPaint());
                this.LJII.setTextSize(i8);
                TextView textView = this.LJIIIIZZ;
                Object obj = Layout.Alignment.ALIGN_NORMAL;
                try {
                    obj = LIZLLL("getLayoutAlignment").invoke(textView, new Object[i4]);
                } catch (Exception unused) {
                }
                Layout.Alignment alignment = (Layout.Alignment) obj;
                int round = Math.round(rectF.right);
                if (Build.VERSION.SDK_INT >= 23) {
                    StaticLayout.Builder obtain = StaticLayout.Builder.obtain(text, i4, text.length(), this.LJII, round);
                    StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.LJIIIIZZ.getLineSpacingExtra(), this.LJIIIIZZ.getLineSpacingMultiplier()).setIncludePad(this.LJIIIIZZ.getIncludeFontPadding()).setBreakStrategy(this.LJIIIIZZ.getBreakStrategy()).setHyphenationFrequency(this.LJIIIIZZ.getHyphenationFrequency());
                    if (maxLines == -1) {
                        i2 = Integer.MAX_VALUE;
                    } else {
                        i2 = maxLines;
                    }
                    hyphenationFrequency.setMaxLines(i2);
                    try {
                        this.LJIIJ.LIZ(obtain, this.LJIIIIZZ);
                    } catch (ClassCastException unused2) {
                    }
                    staticLayout = obtain.build();
                    i = -1;
                } else {
                    i = -1;
                    staticLayout = new StaticLayout(text, this.LJII, round, alignment, this.LJIIIIZZ.getLineSpacingMultiplier(), this.LJIIIIZZ.getLineSpacingExtra(), this.LJIIIIZZ.getIncludeFontPadding());
                }
                if ((maxLines != i && (staticLayout.getLineCount() > maxLines || staticLayout.getLineEnd(staticLayout.getLineCount() - 1) != text.length())) || staticLayout.getHeight() > rectF.bottom) {
                    i6 = i7 - 1;
                    i3 = i6;
                    i4 = 0;
                } else {
                    i4 = 0;
                    i6 = i5;
                    i5 = i7 + 1;
                }
            }
            return this.LJFF[i6];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public final void LJ(float f, int i) {
        Resources resources;
        Context context = this.LJIIIZ;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i, f, resources.getDisplayMetrics());
        if (applyDimension != this.LJIIIIZZ.getPaint().getTextSize()) {
            this.LJIIIIZZ.getPaint().setTextSize(applyDimension);
            boolean isInLayout = this.LJIIIIZZ.isInLayout();
            if (this.LJIIIIZZ.getLayout() != null) {
                this.LIZIZ = false;
                try {
                    Method LIZLLL = LIZLLL("nullLayouts");
                    if (LIZLLL != null) {
                        LIZLLL.invoke(this.LJIIIIZZ, new Object[0]);
                    }
                } catch (Exception unused) {
                }
                if (!isInLayout) {
                    this.LJIIIIZZ.requestLayout();
                } else {
                    this.LJIIIIZZ.forceLayout();
                }
                this.LJIIIIZZ.invalidate();
            }
        }
    }

    public final void LJIIIIZZ(float f, float f2, float f3) {
        if (f > 0.0f) {
            if (f2 > f) {
                if (f3 > 0.0f) {
                    this.LIZ = 1;
                    this.LIZLLL = f;
                    this.LJ = f2;
                    this.LIZJ = f3;
                    this.LJI = false;
                    return;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("The auto-size step granularity (");
                LIZ.append(f3);
                LIZ.append("px) is less or equal to (0px)");
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Maximum auto-size text size (");
            LIZ2.append(f2);
            LIZ2.append("px) is less or equal to minimum auto-size text size (");
            LIZ2.append(f);
            LIZ2.append("px)");
            throw new IllegalArgumentException(X1D.LIZIZ(LIZ2));
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("Minimum auto-size text size (");
        LIZ3.append(f);
        LIZ3.append("px) is less or equal to (0px)");
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ3));
    }
}

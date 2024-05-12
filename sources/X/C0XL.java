package X;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.o;

/* renamed from: X.0XL, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0XL {
    public static final C0XN LIZ;

    static {
        C0XN c0xn;
        if (Build.VERSION.SDK_INT >= 23) {
            c0xn = new C0XN() { // from class: X.1ON
                @Override // X.C0XN
                public StaticLayout LIZIZ(C0XO params) {
                    o.LJIIIZ(params, "params");
                    StaticLayout.Builder obtain = StaticLayout.Builder.obtain(params.LIZ, params.LIZIZ, params.LIZJ, params.LIZLLL, params.LJ);
                    obtain.setTextDirection(params.LJFF);
                    obtain.setAlignment(params.LJI);
                    obtain.setMaxLines(params.LJII);
                    obtain.setEllipsize(params.LJIIIIZZ);
                    obtain.setEllipsizedWidth(params.LJIIIZ);
                    obtain.setLineSpacing(params.LJIIJJI, params.LJIIJ);
                    obtain.setIncludePad(params.LJIILIIL);
                    obtain.setBreakStrategy(1);
                    obtain.setHyphenationFrequency(params.LJIILJJIL);
                    obtain.setIndents(params.LJIILL, params.LJIILLIIL);
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 26) {
                        C0XK.LIZ(obtain, params.LJIIL);
                        if (i >= 28) {
                            obtain.setUseLineSpacingFromFallbacks(false);
                        }
                    }
                    StaticLayout build = obtain.build();
                    o.LJIIIIZZ(build, "obtain(params.text, para…  }\n            }.build()");
                    return build;
                }

                @Override // X.C0XN
                public final boolean LIZ(StaticLayout staticLayout, boolean z) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        return z;
                    }
                    return false;
                }
            };
        } else {
            c0xn = new C0XN() { // from class: X.1OO
                public static boolean LIZ;
                public static Constructor<StaticLayout> LIZIZ;

                @Override // X.C0XN
                public final boolean LIZ(StaticLayout staticLayout, boolean z) {
                    return false;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r5v0 */
                /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.reflect.Constructor<android.text.StaticLayout>] */
                /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.reflect.Constructor<android.text.StaticLayout>] */
                /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.reflect.Constructor<android.text.StaticLayout>] */
                /* JADX WARN: Type inference failed for: r5v4 */
                /* JADX WARN: Type inference failed for: r5v7 */
                /* JADX WARN: Type inference failed for: r5v8 */
                /* JADX WARN: Type inference failed for: r5v9 */
                @Override // X.C0XN
                public StaticLayout LIZIZ(C0XO params) {
                    Constructor<StaticLayout> constructor;
                    o.LJIIIZ(params, "params");
                    StaticLayout staticLayout = 0;
                    staticLayout = 0;
                    staticLayout = 0;
                    staticLayout = 0;
                    if (LIZ) {
                        constructor = LIZIZ;
                    } else {
                        LIZ = true;
                        try {
                            Class cls = Integer.TYPE;
                            Class cls2 = Float.TYPE;
                            LIZIZ = StaticLayout.class.getConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
                        } catch (NoSuchMethodException unused) {
                            LIZIZ = null;
                        }
                        constructor = LIZIZ;
                    }
                    if (constructor != null) {
                        try {
                            staticLayout = constructor.newInstance(params.LIZ, Integer.valueOf(params.LIZIZ), Integer.valueOf(params.LIZJ), params.LIZLLL, Integer.valueOf(params.LJ), params.LJI, params.LJFF, Float.valueOf(params.LJIIJ), Float.valueOf(params.LJIIJJI), Boolean.valueOf(params.LJIILIIL), params.LJIIIIZZ, Integer.valueOf(params.LJIIIZ), Integer.valueOf(params.LJII));
                        } catch (IllegalAccessException unused2) {
                            LIZIZ = staticLayout;
                        } catch (InstantiationException unused3) {
                            LIZIZ = staticLayout;
                        } catch (InvocationTargetException unused4) {
                            LIZIZ = staticLayout;
                        }
                    }
                    if (staticLayout != 0) {
                        return staticLayout;
                    }
                    return new StaticLayout(params.LIZ, params.LIZIZ, params.LIZJ, params.LIZLLL, params.LJ, params.LJI, params.LJIIJ, params.LJIIJJI, params.LJIILIIL, params.LJIIIIZZ, params.LJIIIZ);
                }
            };
        }
        LIZ = c0xn;
    }

    public static StaticLayout LIZ(CharSequence text, int i, int i2, C17650mf paint, int i3, TextDirectionHeuristic textDir, Layout.Alignment alignment, int i4, TextUtils.TruncateAt truncateAt, int i5, float f, float f2, int i6, boolean z, boolean z2, int i7, int i8, int i9, int i10, int[] iArr, int[] iArr2) {
        o.LJIIIZ(text, "text");
        o.LJIIIZ(paint, "paint");
        o.LJIIIZ(textDir, "textDir");
        o.LJIIIZ(alignment, "alignment");
        return LIZ.LIZIZ(new C0XO(text, i, i2, paint, i3, textDir, alignment, i4, truncateAt, i5, f, f2, i6, z, z2, i10, iArr, iArr2));
    }
}

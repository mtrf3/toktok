package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.03g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C012803g {
    public static C012803g LJIIIIZZ;
    public WeakHashMap<Context, C0MB<ColorStateList>> LIZ;
    public C0MA<String, InterfaceC012603e> LIZIZ;
    public C0MB<String> LIZJ;
    public final WeakHashMap<Context, C0M5<WeakReference<Drawable.ConstantState>>> LIZLLL = new WeakHashMap<>(0);
    public TypedValue LJ;
    public boolean LJFF;
    public InterfaceC012703f LJI;
    public static final PorterDuff.Mode LJII = PorterDuff.Mode.SRC_IN;
    public static final C19R LJIIIZ = new C0M6<Integer, PorterDuffColorFilter>() { // from class: X.19R
    };

    public static synchronized C012803g LJ() {
        C012803g c012803g;
        synchronized (C012803g.class) {
            if (LJIIIIZZ == null) {
                C012803g c012803g2 = new C012803g();
                LJIIIIZZ = c012803g2;
                LJIIJ(c012803g2);
            }
            c012803g = LJIIIIZZ;
        }
        return c012803g;
    }

    public static void LJIIJ(C012803g c012803g) {
        if (Build.VERSION.SDK_INT < 24) {
            c012803g.LIZIZ("vector", new InterfaceC012603e() { // from class: X.19T
                @Override // X.InterfaceC012603e
                public final Drawable LIZ(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
                    try {
                        Resources resources = context.getResources();
                        C40681ii c40681ii = new C40681ii();
                        c40681ii.inflate(resources, xmlPullParser, attributeSet, theme);
                        return c40681ii;
                    } catch (Exception unused) {
                        return null;
                    }
                }
            });
            c012803g.LIZIZ("animated-vector", new InterfaceC012603e() { // from class: X.19Q
                @Override // X.InterfaceC012603e
                public final Drawable LIZ(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
                    try {
                        Resources resources = context.getResources();
                        C40651if c40651if = new C40651if(context);
                        c40651if.inflate(resources, xmlPullParser, attributeSet, theme);
                        return c40651if;
                    } catch (Exception unused) {
                        return null;
                    }
                }
            });
            c012803g.LIZIZ("animated-selector", new InterfaceC012603e() { // from class: X.19P
                @Override // X.InterfaceC012603e
                public final Drawable LIZ(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
                    try {
                        return C43721nc.LJI(context, theme, context.getResources(), attributeSet, xmlPullParser);
                    } catch (Exception unused) {
                        return null;
                    }
                }
            });
            c012803g.LIZIZ("drawable", new InterfaceC012603e() { // from class: X.19S
                @Override // X.InterfaceC012603e
                public final Drawable LIZ(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
                    String classAttribute = attributeSet.getClassAttribute();
                    if (classAttribute != null) {
                        try {
                            Drawable drawable = (Drawable) C19S.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                            C23170vZ.LIZJ(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                            return drawable;
                        } catch (Exception unused) {
                            return null;
                        }
                    }
                    return null;
                }
            });
        }
    }

    public final synchronized void LJIIJJI(Context context) {
        C0M5<WeakReference<Drawable.ConstantState>> c0m5 = this.LIZLLL.get(context);
        if (c0m5 != null) {
            c0m5.LIZIZ();
        }
    }

    public final synchronized void LJIIL(C19I c19i) {
        this.LJI = c19i;
    }

    public static void LIZ(C012803g c012803g, Context context) {
        if (!((Boolean) C52365Kgr.LIZ.getValue()).booleanValue() || c012803g.LJFF) {
            return;
        }
        c012803g.LJFF = true;
        Drawable LJI = c012803g.LJI(context, R.drawable.nl);
        if (LJI != null && ((LJI instanceof C40681ii) || "android.graphics.drawable.VectorDrawable".equals(LJI.getClass().getName()))) {
            return;
        }
        c012803g.LJFF = false;
        throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
    }

    public static synchronized PorterDuffColorFilter LJIIIIZZ(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter LIZIZ;
        synchronized (C012803g.class) {
            C19R c19r = LJIIIZ;
            c19r.getClass();
            int i2 = (i + 31) * 31;
            LIZIZ = c19r.LIZIZ(Integer.valueOf(mode.hashCode() + i2));
            if (LIZIZ == null) {
                LIZIZ = new PorterDuffColorFilter(i, mode);
                c19r.LIZJ(Integer.valueOf(mode.hashCode() + i2), LIZIZ);
            }
        }
        return LIZIZ;
    }

    public final void LIZIZ(String str, InterfaceC012603e interfaceC012603e) {
        if (this.LIZIZ == null) {
            this.LIZIZ = new C0MA<>();
        }
        this.LIZIZ.put(str, interfaceC012603e);
    }

    public final Drawable LIZLLL(int i, Context context) {
        LayerDrawable LIZJ;
        if (this.LJ == null) {
            this.LJ = new TypedValue();
        }
        TypedValue typedValue = this.LJ;
        context.getResources().getValue(i, typedValue, true);
        long j = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable LJFF = LJFF(j, context);
        if (LJFF != null) {
            return LJFF;
        }
        if (this.LJI != null) {
            if (i == R.drawable.lx) {
                LIZJ = new LayerDrawable(new Drawable[]{LJI(context, R.drawable.lw), LJI(context, R.drawable.ly)});
            } else {
                if (i == R.drawable.mv) {
                    LIZJ = C19I.LIZJ(this, context, R.dimen.cv);
                } else if (i == R.drawable.mu) {
                    LIZJ = C19I.LIZJ(this, context, R.dimen.cw);
                } else if (i == R.drawable.mw) {
                    LIZJ = C19I.LIZJ(this, context, R.dimen.cx);
                }
                if (LIZJ == null) {
                    return LIZJ;
                }
            }
            LIZJ.setChangingConfigurations(typedValue.changingConfigurations);
            LIZJ(context, j, LIZJ);
            return LIZJ;
        }
        return null;
    }

    public final synchronized Drawable LJFF(long j, Context context) {
        C0M5<WeakReference<Drawable.ConstantState>> c0m5 = this.LIZLLL.get(context);
        if (c0m5 == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> LJ = c0m5.LJ(j, null);
        if (LJ != null) {
            Drawable.ConstantState constantState = LJ.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c0m5.LJII(j);
        }
        return null;
    }

    public final synchronized Drawable LJI(Context context, int i) {
        return LJII(context, i, false);
    }

    public final synchronized ColorStateList LJIIIZ(int i, Context context) {
        ColorStateList colorStateList;
        C0MB<ColorStateList> c0mb;
        WeakHashMap<Context, C0MB<ColorStateList>> weakHashMap = this.LIZ;
        ColorStateList colorStateList2 = null;
        if (weakHashMap != null && (c0mb = weakHashMap.get(context)) != null) {
            colorStateList = c0mb.LJ(i, null);
        } else {
            colorStateList = null;
        }
        if (colorStateList == null) {
            InterfaceC012703f interfaceC012703f = this.LJI;
            if (interfaceC012703f != null) {
                colorStateList2 = ((C19I) interfaceC012703f).LIZLLL(i, context);
            }
            if (colorStateList2 != null) {
                if (this.LIZ == null) {
                    this.LIZ = new WeakHashMap<>();
                }
                C0MB<ColorStateList> c0mb2 = this.LIZ.get(context);
                if (c0mb2 == null) {
                    c0mb2 = new C0MB<>();
                    this.LIZ.put(context, c0mb2);
                }
                c0mb2.LIZ(i, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    public final synchronized void LIZJ(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            C0M5<WeakReference<Drawable.ConstantState>> c0m5 = this.LIZLLL.get(context);
            if (c0m5 == null) {
                c0m5 = new C0M5<>();
                this.LIZLLL.put(context, c0m5);
            }
            c0m5.LJI(j, new WeakReference<>(constantState));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e8, code lost:
    
        X.C07820Sk.LJIIIIZZ(r1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0168, code lost:
    
        if (r5 != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0161, code lost:
    
        if (r14 != false) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b7 A[Catch: all -> 0x0178, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x000a, B:7:0x0010, B:9:0x0016, B:12:0x0024, B:15:0x0035, B:17:0x0039, B:18:0x0040, B:22:0x00b7, B:24:0x00bd, B:26:0x00c3, B:28:0x00c9, B:30:0x00cf, B:31:0x00d3, B:35:0x00e8, B:40:0x00e4, B:41:0x00ed, B:45:0x0104, B:55:0x013a, B:56:0x016c, B:62:0x0173, B:66:0x005a, B:68:0x005e, B:71:0x006a, B:72:0x0072, B:78:0x007e, B:80:0x0091, B:82:0x009b, B:83:0x00a4, B:84:0x00ab, B:88:0x00ae, B:89:0x002e), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bd A[Catch: all -> 0x0178, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x000a, B:7:0x0010, B:9:0x0016, B:12:0x0024, B:15:0x0035, B:17:0x0039, B:18:0x0040, B:22:0x00b7, B:24:0x00bd, B:26:0x00c3, B:28:0x00c9, B:30:0x00cf, B:31:0x00d3, B:35:0x00e8, B:40:0x00e4, B:41:0x00ed, B:45:0x0104, B:55:0x013a, B:56:0x016c, B:62:0x0173, B:66:0x005a, B:68:0x005e, B:71:0x006a, B:72:0x0072, B:78:0x007e, B:80:0x0091, B:82:0x009b, B:83:0x00a4, B:84:0x00ab, B:88:0x00ae, B:89:0x002e), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c3 A[Catch: all -> 0x0178, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x000a, B:7:0x0010, B:9:0x0016, B:12:0x0024, B:15:0x0035, B:17:0x0039, B:18:0x0040, B:22:0x00b7, B:24:0x00bd, B:26:0x00c3, B:28:0x00c9, B:30:0x00cf, B:31:0x00d3, B:35:0x00e8, B:40:0x00e4, B:41:0x00ed, B:45:0x0104, B:55:0x013a, B:56:0x016c, B:62:0x0173, B:66:0x005a, B:68:0x005e, B:71:0x006a, B:72:0x0072, B:78:0x007e, B:80:0x0091, B:82:0x009b, B:83:0x00a4, B:84:0x00ab, B:88:0x00ae, B:89:0x002e), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized android.graphics.drawable.Drawable LJII(android.content.Context r12, int r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C012803g.LJII(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIILIIL(int r6, android.content.Context r7, android.graphics.drawable.Drawable r8) {
        /*
            r5 = this;
            X.03f r4 = r5.LJI
            r1 = 0
            if (r4 == 0) goto L31
            X.19I r4 = (X.C19I) r4
            android.graphics.PorterDuff$Mode r3 = X.C03R.LIZIZ
            int[] r0 = r4.LIZ
            boolean r0 = X.C19I.LIZ(r6, r0)
            r2 = -1
            if (r0 == 0) goto L32
            r4 = 2130969640(0x7f040428, float:1.7547968E38)
        L15:
            r1 = -1
        L16:
            boolean r0 = X.C03D.LIZ(r8)
            if (r0 == 0) goto L20
            android.graphics.drawable.Drawable r8 = r8.mutate()
        L20:
            int r0 = X.C014003s.LIZIZ(r4, r7)
            android.graphics.PorterDuffColorFilter r0 = X.C03R.LIZJ(r0, r3)
            r8.setColorFilter(r0)
            if (r1 == r2) goto L30
            r8.setAlpha(r1)
        L30:
            r1 = 1
        L31:
            return r1
        L32:
            int[] r0 = r4.LIZJ
            boolean r0 = X.C19I.LIZ(r6, r0)
            if (r0 == 0) goto L3e
            r4 = 2130969638(0x7f040426, float:1.7547964E38)
            goto L15
        L3e:
            int[] r0 = r4.LIZLLL
            boolean r0 = X.C19I.LIZ(r6, r0)
            if (r0 == 0) goto L4c
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.MULTIPLY
        L48:
            r4 = 16842801(0x1010031, float:2.3693695E-38)
            goto L15
        L4c:
            r0 = 2131230772(0x7f080034, float:1.8077606E38)
            if (r6 != r0) goto L5c
            r0 = 1109603123(0x42233333, float:40.8)
            int r1 = java.lang.Math.round(r0)
            r4 = 16842800(0x1010030, float:2.3693693E-38)
            goto L16
        L5c:
            r0 = 2131230754(0x7f080022, float:1.807757E38)
            if (r6 != r0) goto L31
            goto L48
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C012803g.LJIILIIL(int, android.content.Context, android.graphics.drawable.Drawable):boolean");
    }
}

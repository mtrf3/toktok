package X;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: X.1k1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C41491k1 extends C1JZ {
    public final Class<?> LJFF;
    public final Constructor<?> LJI;
    public final Method LJII;
    public final Method LJIIIIZZ;
    public final Method LJIIIZ;
    public final Method LJIIJ;
    public final Method LJIIJJI;

    public C41491k1() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = LJIIJJI(cls);
            method3 = LJIIL(cls);
            method4 = cls.getMethod("freeze", new Class[0]);
            method = cls.getMethod("abortCreation", new Class[0]);
            method5 = LJIILIIL(cls);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.LJFF = cls;
        this.LJI = constructor;
        this.LJII = method2;
        this.LJIIIIZZ = method3;
        this.LJIIIZ = method4;
        this.LJIIJ = method;
        this.LJIIJJI = method5;
    }

    public static Method LJIIJJI(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public static Method LJIIL(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    public Typeface LJIIIZ(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.LJFF, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.LJIIJJI.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean LJIIJ(Object obj) {
        try {
            return ((Boolean) this.LJIIIZ.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method LJIILIIL(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // X.C1JZ, X.C07390Qt
    public final Typeface LIZIZ(Context context, C12180dq[] c12180dqArr, int i) {
        boolean z;
        Object obj;
        Typeface LJIIIZ;
        boolean z2;
        if (c12180dqArr.length < 1) {
            return null;
        }
        if (this.LJII != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C12180dq LJFF = LJFF(i, c12180dqArr);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(LJFF.LIZ, "r", null);
                if (openFileDescriptor == null) {
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(LJFF.LIZJ).setItalic(LJFF.LIZLLL).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (C12180dq c12180dq : c12180dqArr) {
            if (c12180dq.LJ == 0) {
                android.net.Uri uri = c12180dq.LIZ;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, C07410Qv.LJ(context, uri));
                }
            }
        }
        java.util.Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        try {
            obj = this.LJI.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused2) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        boolean z3 = false;
        for (C12180dq c12180dq2 : c12180dqArr) {
            Object obj2 = unmodifiableMap.get(c12180dq2.LIZ);
            if (obj2 != null) {
                try {
                    z2 = ((Boolean) this.LJIIIIZZ.invoke(obj, obj2, Integer.valueOf(c12180dq2.LIZIZ), null, Integer.valueOf(c12180dq2.LIZJ), Integer.valueOf(c12180dq2.LIZLLL ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused3) {
                    z2 = false;
                }
                if (z2) {
                    z3 = true;
                } else {
                    try {
                        this.LJIIJ.invoke(obj, new Object[0]);
                    } catch (IllegalAccessException | InvocationTargetException unused4) {
                    }
                    return null;
                }
            }
        }
        if (!z3) {
            try {
                this.LJIIJ.invoke(obj, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused5) {
            }
            return null;
        }
        if (!LJIIJ(obj) || (LJIIIZ = LJIIIZ(obj)) == null) {
            return null;
        }
        return Typeface.create(LJIIIZ, i);
    }

    @Override // X.C1JZ, X.C07390Qt
    public final Typeface LIZ(Context context, C1IU c1iu, Resources resources, int i) {
        boolean z;
        Object obj;
        if (this.LJII != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return super.LIZ(context, c1iu, resources, i);
        }
        try {
            obj = this.LJI.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (C0OT c0ot : c1iu.LIZ) {
            if (!LJIIIIZZ(context, obj, c0ot.LIZ, c0ot.LJ, c0ot.LIZIZ, c0ot.LIZJ ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c0ot.LIZLLL))) {
                try {
                    this.LJIIJ.invoke(obj, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
                return null;
            }
        }
        if (!LJIIJ(obj)) {
            return null;
        }
        return LJIIIZ(obj);
    }

    @Override // X.C07390Qt
    public final Typeface LIZLLL(Context context, Resources resources, int i, String str, int i2) {
        boolean z;
        Object obj;
        if (this.LJII != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return super.LIZLLL(context, resources, i, str, i2);
        }
        try {
            obj = this.LJI.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        if (!LJIIIIZZ(context, obj, str, 0, -1, -1, null)) {
            try {
                this.LJIIJ.invoke(obj, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
            return null;
        }
        if (!LJIIJ(obj)) {
            return null;
        }
        return LJIIIZ(obj);
    }

    public final boolean LJIIIIZZ(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.LJII.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }
}

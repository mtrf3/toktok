package X;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import defpackage.i0;
import java.lang.reflect.Constructor;
import java.util.HashMap;

/* renamed from: X.06F, reason: invalid class name */
/* loaded from: classes.dex */
public class C06F extends ViewGroup.MarginLayoutParams {
    public C06C LIZ;
    public boolean LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public View LJIIJ;
    public View LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public final Rect LJIILLIIL;
    public Object LJIIZILJ;

    public C06F(C06F c06f) {
        super((ViewGroup.MarginLayoutParams) c06f);
        this.LJ = -1;
        this.LJFF = -1;
        this.LJIILLIIL = new Rect();
    }

    public final boolean LIZ(int i) {
        if (i != 0) {
            if (i != 1) {
                return false;
            }
            return this.LJIILJJIL;
        }
        return this.LJIILIIL;
    }

    public final void LIZIZ(C06C c06c) {
        C06C c06c2 = this.LIZ;
        if (c06c2 != c06c) {
            if (c06c2 != null) {
                c06c2.onDetachedFromLayoutParams();
            }
            this.LIZ = c06c;
            this.LJIIZILJ = null;
            this.LIZIZ = true;
            if (c06c != null) {
                c06c.onAttachedToLayoutParams(this);
            }
        }
    }

    public C06F(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.LJ = -1;
        this.LJFF = -1;
        this.LJIILLIIL = new Rect();
    }

    public C06F(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.LJ = -1;
        this.LJFF = -1;
        this.LJIILLIIL = new Rect();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C06F(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C06C newInstance;
        this.LJ = -1;
        this.LJFF = -1;
        this.LJIILLIIL = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.layout_gravity, com.zhiliaoapp.musically.R.attr.alf, com.zhiliaoapp.musically.R.attr.alg, com.zhiliaoapp.musically.R.attr.alh, com.zhiliaoapp.musically.R.attr.amw, com.zhiliaoapp.musically.R.attr.an9, com.zhiliaoapp.musically.R.attr.an_});
        this.LIZJ = obtainStyledAttributes.getInteger(0, 0);
        this.LJFF = obtainStyledAttributes.getResourceId(1, -1);
        this.LIZLLL = obtainStyledAttributes.getInteger(2, 0);
        this.LJ = obtainStyledAttributes.getInteger(6, -1);
        this.LJI = obtainStyledAttributes.getInt(5, 0);
        this.LJII = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.LIZIZ = hasValue;
        if (hasValue) {
            String LLLZLZ = C16880lQ.LLLZLZ(obtainStyledAttributes, 3);
            if (TextUtils.isEmpty(LLLZLZ)) {
                newInstance = null;
            } else {
                if (LLLZLZ.startsWith(".")) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(context.getPackageName());
                    LIZ.append(LLLZLZ);
                    LLLZLZ = X1D.LIZIZ(LIZ);
                } else if (LLLZLZ.indexOf(46) < 0) {
                    String str = C45621qg.LL;
                    if (!TextUtils.isEmpty(str)) {
                        LLLZLZ = C00F.LIZIZ(str, '.', LLLZLZ);
                    }
                }
                try {
                    ThreadLocal<java.util.Map<String, Constructor<C06C>>> threadLocal = C45621qg.LLF;
                    java.util.Map<String, Constructor<C06C>> map = threadLocal.get();
                    if (map == null) {
                        map = new HashMap<>();
                        threadLocal.set(map);
                    }
                    Constructor<C06C> constructor = map.get(LLLZLZ);
                    if (constructor == null) {
                        constructor = Class.forName(LLLZLZ, false, context.getClassLoader()).getConstructor(C45621qg.LLD);
                        constructor.setAccessible(true);
                        map.put(LLLZLZ, constructor);
                    }
                    newInstance = constructor.newInstance(context, attributeSet);
                } catch (Exception e) {
                    throw new RuntimeException(i0.LJFF("Could not inflate Behavior subclass ", LLLZLZ), e);
                }
            }
            this.LIZ = newInstance;
        }
        obtainStyledAttributes.recycle();
        C06C c06c = this.LIZ;
        if (c06c != null) {
            c06c.onAttachedToLayoutParams(this);
        }
    }

    public C06F(int i, int i2) {
        super(i, i2);
        this.LJ = -1;
        this.LJFF = -1;
        this.LJIILLIIL = new Rect();
    }
}

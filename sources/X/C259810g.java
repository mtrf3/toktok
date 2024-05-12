package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.SparseArray;
import android.util.TypedValue;
import com.bytedance.android.livesdkapi.host.IHostConfig;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

/* renamed from: X.10g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C259810g {
    public static volatile SparseArray<String> LJJ = new SparseArray<>();
    public boolean LIZ;
    public Context LIZIZ;
    public volatile C06420Na LIZJ;
    public volatile C48693J9d LIZLLL;
    public volatile C78927UyJ LJ;
    public volatile int LJFF;
    public volatile boolean LJI;
    public volatile boolean LJII;
    public volatile boolean LJIIIIZZ;
    public volatile int LJIIIZ;
    public volatile int LJIIJ;
    public volatile C31211CMt LJIIJJI;
    public volatile C06420Na LJIIL;
    public volatile C31215CMx LJIILIIL;
    public volatile boolean LJIILJJIL;
    public volatile boolean LJIILL;
    public volatile boolean LJIIZILJ;
    public C31212CMu LJIJ;
    public volatile int LJIILLIIL = 2;
    public java.util.Map<String, String> LJIJI = new HashMap();
    public java.util.Map<String, String> LJIJJ = new HashMap();
    public java.util.Map<String, String> LJIJJLI = new HashMap();
    public final float LJIL = TypedValue.applyDimension(1, 20.0f, Resources.getSystem().getDisplayMetrics());

    static {
        LJJ.put(1, "regular");
        LJJ.put(2, "bold");
        LJJ.put(3, "boldItalic");
        LJJ.put(4, "italic");
        LJJ.put(5, "light");
        LJJ.put(6, "lightItalic");
        LJJ.put(7, "medium");
        LJJ.put(8, "mediumItalic");
    }

    public final float LIZIZ() {
        if (this.LJIJ == null) {
            return 1.0f;
        }
        ((IHostConfig) CN1.LIZ(IHostConfig.class)).qS().getClass();
        int i = G4K.LIZ;
        if (i == 0) {
            return 1.0f;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return 1.0f;
                }
                return 1.18f;
            }
            return 1.1f;
        }
        return 1.05f;
    }

    public final int LIZJ() {
        if (this.LJIIJ != 0) {
            return this.LJIIJ;
        }
        if (this.LJIIJ == 0) {
            if (this.LJIIL != null) {
                C06420Na c06420Na = this.LJIIL;
                IllegalStateException illegalStateException = new IllegalStateException("Dark theme overlay is not set.");
                c06420Na.getClass();
                C0K2.LIZ("Dark theme overlay is not set.", illegalStateException);
            }
            if (this.LJIIJJI != null) {
                this.LJIIJJI.getClass();
                C0NB.LJ("DesignManager", "Dark theme overlay is not set.");
                return R.style.s9;
            }
            return R.style.s9;
        }
        return R.style.s9;
    }

    public final int LIZLLL() {
        if (this.LJIIIZ != 0) {
            return this.LJIIIZ;
        }
        if (this.LJIIIZ == 0) {
            if (this.LJIIL != null) {
                C06420Na c06420Na = this.LJIIL;
                IllegalStateException illegalStateException = new IllegalStateException("Light theme overlay is not set.");
                c06420Na.getClass();
                C0K2.LIZ("Light theme overlay is not set.", illegalStateException);
            }
            if (this.LJIIJJI != null) {
                this.LJIIJJI.getClass();
                C0NB.LJ("DesignManager", "Light theme overlay is not set.");
                return R.style.sa;
            }
            return R.style.sa;
        }
        return R.style.sa;
    }

    public final boolean LJIIIZ() {
        if (this.LJIJ != null) {
            ((IHostConfig) CN1.LIZ(IHostConfig.class)).qS().getClass();
            int i = G4K.LIZ;
            if (i != 0 && (i == 1 || i == 2 || i == 3)) {
                return true;
            }
        }
        return false;
    }

    public static Activity LIZ(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        return LIZ(((ContextWrapper) context).getBaseContext());
    }

    public final int LJ(float f) {
        float f2 = 1.0f;
        if (this.LJIJ != null) {
            ((IHostConfig) CN1.LIZ(IHostConfig.class)).qS().getClass();
            int i = G4K.LIZ;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        f2 = 1.1f;
                    }
                } else {
                    f2 = 1.05f;
                }
            }
        }
        return (int) (f2 * f);
    }

    public final int LJFF(Context context) {
        if (LJII(context)) {
            return LIZJ();
        }
        return LIZLLL();
    }

    public final boolean LJII(Context context) {
        if (!this.LJIIZILJ || LIZ(context) != null) {
            if (this.LJIIIIZZ && this.LJ != null && C78927UyJ.LIZ(context)) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("Context must be an activity context to test if in dark mode.");
    }

    public static void LJIIIIZZ(int i, C1MV c1mv) {
        ((java.util.Map) C0TT.LIZ.LIZ.LIZ).put(Integer.valueOf(i), c1mv);
    }

    public final Typeface LJI(float f, int i, boolean z) {
        String str;
        java.util.Map<String, String> map;
        String str2 = LJJ.get(i);
        if (z) {
            str = this.LJIJJLI.get(str2);
        } else if (f < this.LJIL || ((map = this.LJIJI) != null && !map.isEmpty())) {
            str = this.LJIJI.get(str2);
        } else {
            str = this.LJIJJ.get(str2);
        }
        if (str == null) {
            return C49616Jdc.LIZIZ().LIZJ(i);
        }
        Typeface LIZIZ = C61589OFd.LIZIZ(str);
        if (LIZIZ == null) {
            return C49616Jdc.LIZIZ().LIZJ(i);
        }
        return LIZIZ;
    }
}

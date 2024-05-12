package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.HashMap;

/* renamed from: X.Jdc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49616Jdc {
    public static volatile C49616Jdc LIZLLL;
    public static volatile SparseArray<String> LJ = new SparseArray<>();
    public static volatile java.util.Map<String, Integer> LJFF;
    public SparseArray<Typeface> LIZ = new SparseArray<>();
    public java.util.Map<String, String> LIZIZ = new HashMap();
    public Context LIZJ;

    static {
        LJ.put(1, "regular");
        LJ.put(2, "bold");
        LJ.put(3, "boldItalic");
        LJ.put(4, "italic");
        LJ.put(5, "light");
        LJ.put(6, "lightItalic");
        LJ.put(7, "medium");
        LJ.put(8, "mediumItalic");
        LJFF = new HashMap();
        LJFF.put("regular", 1);
        LJFF.put("bold", 2);
        LJFF.put("boldItalic", 3);
        LJFF.put("italic", 4);
        LJFF.put("light", 5);
        LJFF.put("lightItalic", 6);
        LJFF.put("medium", 7);
        LJFF.put("mediumItalic", 8);
    }

    public static void LIZ() {
        if (LIZLLL != null) {
            LIZLLL.LIZJ = null;
            if (LIZLLL.LIZIZ != null) {
                LIZLLL.LIZIZ.clear();
                LIZLLL.LIZIZ = null;
            }
            if (LIZLLL.LIZ != null) {
                LIZLLL.LIZ.clear();
                LIZLLL.LIZ = null;
            }
            LIZLLL = null;
        }
    }

    public static C49616Jdc LIZIZ() {
        if (LIZLLL == null) {
            synchronized (C49616Jdc.class) {
                if (LIZLLL == null) {
                    LIZLLL = new C49616Jdc();
                }
            }
        }
        return LIZLLL;
    }

    public final Typeface LIZJ(int i) {
        Typeface typeface = null;
        Typeface typeface2 = this.LIZ.get(i, null);
        if (typeface2 == null) {
            String str = this.LIZIZ.get(LJ.get(i));
            Context context = this.LIZJ;
            if (context != null) {
                try {
                    typeface = Typeface.createFromAsset(context.getAssets(), str);
                } catch (Exception unused) {
                }
            }
            this.LIZ.put(i, typeface);
            return typeface;
        }
        return typeface2;
    }

    public final Typeface LIZLLL(String str) {
        if (this.LIZIZ.containsKey(str)) {
            return LIZJ(((Integer) ((HashMap) LJFF).get(str)).intValue());
        }
        return null;
    }

    public final void LJ(Context context, java.util.Map<String, String> map) {
        if (context != null && map != null) {
            this.LIZJ = C16880lQ.LLLLL(context);
            this.LIZIZ = map;
            if (((HashMap) map).size() >= 0) {
                for (String str : this.LIZIZ.keySet()) {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    } else {
                        LIZJ(((Integer) ((HashMap) LJFF).get(str)).intValue());
                    }
                }
            }
        }
    }
}

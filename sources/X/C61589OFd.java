package X;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import ujb.o;

/* renamed from: X.OFd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61589OFd {
    public static Context LIZ;
    public static final java.util.Map<String, Typeface> LIZIZ = new LinkedHashMap();

    public static Typeface LIZ(String str) {
        AssetManager assetManager;
        Typeface typeface = null;
        if (o.LJJJLIIL(str, "font/", false)) {
            Context context = LIZ;
            if (context != null) {
                assetManager = context.getAssets();
            } else {
                assetManager = null;
            }
            if (assetManager != null) {
                typeface = Typeface.createFromAsset(assetManager, str);
            }
            if (((Boolean) DZR.LIZ.getValue()).booleanValue() && typeface != null) {
                try {
                    Paint paint = new Paint();
                    paint.setAntiAlias(true);
                    paint.setTypeface(typeface);
                    paint.measureText("H");
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
            return typeface;
        }
        typeface = C16880lQ.LJJLIIIJLLLLLLLZ(str);
        if (((Boolean) DZR.LIZ.getValue()).booleanValue()) {
            Paint paint2 = new Paint();
            paint2.setAntiAlias(true);
            paint2.setTypeface(typeface);
            paint2.measureText("H");
        }
        return typeface;
    }

    public static Typeface LIZIZ(String path) {
        kotlin.jvm.internal.o.LJIIIZ(path, "path");
        if (TextUtils.isEmpty(path)) {
            return null;
        }
        java.util.Map<String, Typeface> map = LIZIZ;
        Typeface typeface = (Typeface) ((LinkedHashMap) map).get(path);
        if (typeface == null) {
            Typeface LIZ2 = LIZ(path);
            map.put(path, LIZ2);
            return LIZ2;
        }
        return typeface;
    }

    public static void LIZJ(Context context, List list) {
        kotlin.jvm.internal.o.LJIIIZ(context, "context");
        LIZ = C16880lQ.LLLLL(context);
        ((LinkedHashMap) LIZIZ).clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            LIZIZ.put(str, LIZ(str));
        }
    }
}

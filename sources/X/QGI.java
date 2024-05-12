package X;

import android.content.res.Resources;
import android.util.DisplayMetrics;

/* loaded from: classes12.dex */
public final class QGI {
    public static final int LIZ;
    public static final long LIZIZ;
    public static final long LIZJ;
    public static boolean LIZLLL;

    static {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        long j = displayMetrics.heightPixels * displayMetrics.widthPixels * 4;
        LIZ = 2;
        LIZIZ = 20971520L;
        LIZJ = j;
        LIZLLL = false;
    }
}

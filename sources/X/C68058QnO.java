package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* renamed from: X.QnO, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68058QnO {
    public static final android.net.Uri LIZ = UriProtector.parse("content://com.google.android.gsf.gservices");
    public static final Pattern LIZIZ;
    public static final Pattern LIZJ;
    public static final AtomicBoolean LIZLLL;
    public static HashMap LJ;
    public static final HashMap LJFF;
    public static final HashMap LJI;
    public static final HashMap LJII;
    public static final HashMap LJIIIIZZ;
    public static Object LJIIIZ;
    public static final String[] LJIIJ;

    static {
        UriProtector.parse("content://com.google.android.gsf.gservices/prefix");
        LIZIZ = PatternProtector.compile("^(1|true|t|on|yes|y)$", 2);
        LIZJ = PatternProtector.compile("^(0|false|f|off|no|n)$", 2);
        LIZLLL = new AtomicBoolean();
        LJFF = new HashMap();
        LJI = new HashMap();
        LJII = new HashMap();
        LJIIIIZZ = new HashMap();
        LJIIJ = new String[0];
    }

    public static void LIZ(String str, Object obj, String str2) {
        synchronized (C68058QnO.class) {
            if (obj == LJIIIZ) {
                LJ.put(str, str2);
            }
        }
    }
}

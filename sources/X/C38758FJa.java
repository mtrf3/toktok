package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import com.ss.android.ugc.tiktok.deeplink.impl.DeeplinkPrefetchImpl;
import java.util.regex.Pattern;
import kotlin.jvm.internal.o;

/* renamed from: X.FJa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38758FJa {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(android.net.Uri uri) {
        o.LJIIIZ(uri, "uri");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(uri.getHost());
        LIZ2.append(uri.getPath());
        String LIZIZ = X1D.LIZIZ(LIZ2);
        String lastPathSegment = uri.getLastPathSegment();
        int i = 0;
        if (lastPathSegment != null) {
            Pattern compile = PatternProtector.compile("^[0-9]+\\d*$");
            o.LJIIIIZZ(compile, "compile(regex)");
            if (compile.matcher(lastPathSegment).find()) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(uri.getHost());
                StringBuilder sb = new StringBuilder("/");
                for (String str : uri.getPathSegments()) {
                    int i2 = i + 1;
                    if (i < uri.getPathSegments().size() - 1) {
                        sb.append(str);
                    }
                    i = i2;
                }
                String sb2 = sb.toString();
                o.LJIIIIZZ(sb2, "sb.toString()");
                LIZ3.append(sb2);
                return X1D.LIZIZ(LIZ3);
            }
            return LIZIZ;
        }
        return LIZIZ;
    }

    public static boolean LIZIZ(M5X m5x) {
        return DeeplinkPrefetchImpl.LIZLLL().LIZ(new FDP(m5x.LJLILLLLZI, Boolean.valueOf(C78977Uz7.LJJJ(m5x.LJLJI, "from_notification")))).LJLJLLL;
    }
}

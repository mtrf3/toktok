package X;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import kotlin.jvm.internal.o;

/* renamed from: X.Ejy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37270Ejy {
    public static Charset LIZIZ(String str) {
        Object LIZ;
        try {
            LIZ = Charset.forName(str);
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Charset defaultCharset = Charset.defaultCharset();
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = defaultCharset;
        }
        o.LJFF(LIZ, "runCatching { Charset.fo…Charset.defaultCharset())");
        return (Charset) LIZ;
    }

    public static final String LIZ(InputStream readAndClose, String str) {
        o.LJIIJ(readAndClose, "$this$readAndClose");
        try {
            String LJIILJJIL = C77321UWf.LJIILJJIL(new InputStreamReader(readAndClose, LIZIZ(str)));
            AnonymousClass636.LJFF(readAndClose, null);
            return LJIILJJIL;
        } finally {
        }
    }
}

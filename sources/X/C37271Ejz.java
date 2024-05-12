package X;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import kotlin.jvm.internal.o;

/* renamed from: X.Ejz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37271Ejz {
    public static final C37271Ejz LIZ = new C37271Ejz();

    public static String LIZ(InputStream inputStream, String str) {
        Object LIZ2;
        try {
            LIZ2 = Charset.forName(str);
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th) {
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        Charset defaultCharset = Charset.defaultCharset();
        if (C3C5.m12isFailureimpl(LIZ2)) {
            LIZ2 = defaultCharset;
        }
        Charset charset = (Charset) LIZ2;
        try {
            o.LJFF(charset, "charset");
            String LJIILJJIL = C77321UWf.LJIILJJIL(new InputStreamReader(inputStream, charset));
            AnonymousClass636.LJFF(inputStream, null);
            return LJIILJJIL;
        } finally {
        }
    }
}

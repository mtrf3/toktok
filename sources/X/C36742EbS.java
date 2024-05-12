package X;

import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.jvm.internal.o;

/* renamed from: X.EbS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36742EbS extends AbstractC65781Prl implements InterfaceC88472Yns<Throwable, String> {
    public static final C36742EbS LJLIL = new C36742EbS();

    public C36742EbS() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final String invoke(Throwable th) {
        Throwable throwable = th;
        o.LJIIIZ(throwable, "throwable");
        StringWriter stringWriter = new StringWriter();
        throwable.printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        o.LJIIIIZZ(stringWriter2, "stringWriter.toString()");
        return stringWriter2;
    }
}

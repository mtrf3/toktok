package X;

import java.io.Writer;
import kotlin.jvm.internal.o;

/* renamed from: X.1Pw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C32641Pw implements InterfaceC10860bi {
    public final Writer LIZ;

    public final void LIZ() {
        this.LIZ.flush();
    }

    @Override // X.InterfaceC10860bi
    public final void close() {
        this.LIZ.close();
    }

    public C32641Pw(Writer writer) {
        this.LIZ = writer;
    }

    public final void LIZIZ(String str) {
        o.LJIIJ(str, "str");
        this.LIZ.write(str);
    }
}

package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N0E extends AbstractC65781Prl implements InterfaceC88472Yns<M95, String> {
    public static final N0E LJLIL = new N0E();

    public N0E() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final String invoke(M95 m95) {
        M95 string = m95;
        o.LJIIIZ(string, "$this$string");
        Object LIZ = string.LIZ(Exception.class);
        if (LIZ != null) {
            String message = ((Throwable) LIZ).getMessage();
            if (message == null) {
                return "unknown";
            }
            return message;
        }
        throw new C58623Mzb(Exception.class);
    }
}

package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IZC extends AbstractC65781Prl implements InterfaceC65784Pro<IZD> {
    public static final IZC LJLIL = new IZC();

    public IZC() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IZD invoke() {
        Object value = IZ8.LLZLLIL.getValue();
        o.LJIIIIZZ(value, "<get-callbackOpt>(...)");
        return new IZD(((Number) value).intValue());
    }
}

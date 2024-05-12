package X;

import kotlin.jvm.internal.o;

/* renamed from: X.IYb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46793IYb extends F9E {
    public static final C46793IYb LJLJI;
    public final boolean LJLIL;
    public final boolean LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), Boolean.valueOf(this.LJLILLLLZI)};
    }

    static {
        Object value = IZ8.LJLLL.getValue();
        o.LJIIIIZZ(value, "<get-bindCpuCoreConfig>(...)");
        int intValue = ((Number) value).intValue();
        LJLJI = new C46793IYb(C79057V0z.LJJIIZI(intValue, 0), C79057V0z.LJJIIZI(intValue, 1));
    }

    public C46793IYb(boolean z, boolean z2) {
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
    }
}

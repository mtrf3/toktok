package X;

import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EDO extends F9E {
    public final String LJLIL;
    public final EnumC36074EDu LJLILLLLZI;
    public final boolean LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Boolean.valueOf(this.LJLJI)};
    }

    public final int L() {
        if (this.LJLJI) {
            return EDQ.CRITICAL.getValue();
        }
        if (this.LJLILLLLZI != EnumC36074EDu.REDUNDANT) {
            return EDQ.ERROR.getValue();
        }
        return EDQ.WARNING.getValue();
    }

    public EDO(String key, EnumC36074EDu type, boolean z) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(type, "type");
        this.LJLIL = key;
        this.LJLILLLLZI = type;
        this.LJLJI = z;
    }
}

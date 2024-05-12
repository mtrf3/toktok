package X;

import kotlin.jvm.internal.o;

/* renamed from: X.EgF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37039EgF extends F9E {
    public final EnumC37040EgG LJLIL;
    public final String LJLILLLLZI;

    public C37039EgF() {
        this(null, 3);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public C37039EgF(EnumC37040EgG type, int i) {
        String identifier;
        type = (i & 1) != 0 ? EnumC37040EgG.UNKNOWN : type;
        if ((i & 2) != 0) {
            identifier = "";
        } else {
            identifier = null;
        }
        o.LJIIIZ(type, "type");
        o.LJIIIZ(identifier, "identifier");
        this.LJLIL = type;
        this.LJLILLLLZI = identifier;
    }
}

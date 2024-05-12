package X;

import kotlin.jvm.internal.o;

/* renamed from: X.TNy, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74558TNy extends F9E {
    public final EnumC74555TNv LJLIL;
    public final String LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public C74558TNy(EnumC74555TNv state, String filePath) {
        o.LJIIIZ(state, "state");
        o.LJIIIZ(filePath, "filePath");
        this.LJLIL = state;
        this.LJLILLLLZI = filePath;
    }
}

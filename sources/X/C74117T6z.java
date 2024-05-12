package X;

import kotlin.jvm.internal.o;

/* renamed from: X.T6z, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74117T6z extends F9E implements C33Q {
    public final EnumC74116T6y LJLIL;

    public C74117T6z() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    public C74117T6z(EnumC74116T6y event) {
        o.LJIIIZ(event, "event");
        this.LJLIL = event;
    }

    public /* synthetic */ C74117T6z(int i) {
        this(EnumC74116T6y.NONE);
    }
}

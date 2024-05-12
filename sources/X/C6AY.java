package X;

import kotlin.jvm.internal.o;

/* renamed from: X.6AY, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6AY extends F9E {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final String LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), this.LJLJJI};
    }

    public C6AY(int i, int i2, int i3, String type) {
        o.LJIIIZ(type, "type");
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = i3;
        this.LJLJJI = type;
    }
}

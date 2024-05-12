package X;

import kotlin.jvm.internal.o;

/* renamed from: X.6Lx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C159016Lx extends F9E {
    public final float LJLIL;
    public final float LJLILLLLZI;
    public final EnumC159036Lz LJLJI;
    public int LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Float.valueOf(this.LJLIL), Float.valueOf(this.LJLILLLLZI), this.LJLJI};
    }

    public C159016Lx(float f, float f2, EnumC159036Lz type) {
        o.LJIIIZ(type, "type");
        this.LJLIL = f;
        this.LJLILLLLZI = f2;
        this.LJLJI = type;
    }
}

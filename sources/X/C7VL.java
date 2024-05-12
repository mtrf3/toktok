package X;

import kotlin.jvm.internal.o;

/* renamed from: X.7VL, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7VL extends F9E implements InterfaceC87283bg {
    public final String LJLIL;
    public final boolean LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI)};
    }

    public C7VL(String mobKey, boolean z) {
        o.LJIIIZ(mobKey, "mobKey");
        this.LJLIL = mobKey;
        this.LJLILLLLZI = z;
    }
}

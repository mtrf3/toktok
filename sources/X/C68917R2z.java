package X;

import kotlin.jvm.internal.o;

/* renamed from: X.R2z, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68917R2z<T> implements InterfaceC73592SuS<InterfaceC68901R2j<OSZ<Object, Object>>> {
    public final /* synthetic */ C73919Szj LJLIL;

    public C68917R2z(C73919Szj c73919Szj) {
        this.LJLIL = c73919Szj;
    }

    @Override // X.InterfaceC73592SuS
    public final boolean test(InterfaceC68901R2j<OSZ<Object, Object>> interfaceC68901R2j) {
        InterfaceC68901R2j<OSZ<Object, Object>> traceable = interfaceC68901R2j;
        o.LJIIJ(traceable, "traceable");
        if (this.LJLIL.LIZIZ.LIZIZ() != null) {
            return !traceable.LIZJ(r0);
        }
        return false;
    }
}

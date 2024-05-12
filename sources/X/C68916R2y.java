package X;

import kotlin.jvm.internal.o;

/* renamed from: X.R2y, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68916R2y<T> implements InterfaceC73592SuS<InterfaceC68901R2j<OSZ<Object, Object>>> {
    public final /* synthetic */ InterfaceC68914R2w[] LJLIL;

    public C68916R2y(InterfaceC68914R2w[] interfaceC68914R2wArr) {
        this.LJLIL = interfaceC68914R2wArr;
    }

    @Override // X.InterfaceC73592SuS
    public final boolean test(InterfaceC68901R2j<OSZ<Object, Object>> interfaceC68901R2j) {
        InterfaceC68901R2j<OSZ<Object, Object>> traceable = interfaceC68901R2j;
        o.LJIIJ(traceable, "traceable");
        boolean z = false;
        for (InterfaceC68914R2w interfaceC68914R2w : this.LJLIL) {
            QDR<?> LIZIZ = interfaceC68914R2w.LIZIZ();
            if (LIZIZ == null || traceable.LIZJ(LIZIZ)) {
                z = true;
                break;
            }
        }
        return !z;
    }
}

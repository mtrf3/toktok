package X;

import kotlin.jvm.internal.o;

/* JADX INFO: Add missing generic type declarations: [K1, V1] */
/* renamed from: X.Szq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73926Szq<T, K1, V1> implements InterfaceC73592SuS<OSZ<? extends K1, ? extends V1>> {
    public static final C73926Szq LJLIL = new C73926Szq();

    @Override // X.InterfaceC73592SuS
    public final boolean test(Object obj) {
        OSZ it = (OSZ) obj;
        o.LJIIJ(it, "it");
        if (it.getSecond() != null) {
            return true;
        }
        return false;
    }
}

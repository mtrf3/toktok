package X;

import java.util.List;

/* renamed from: X.Ia5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46849Ia5 extends C0R1 implements InterfaceC46854IaA {
    @Override // X.InterfaceC46854IaA
    public final boolean onFetchedVideoInfo(C47164IfA c47164IfA) {
        for (Object obj : (List) this.LJLIL) {
            if (obj != null) {
                ((InterfaceC46854IaA) obj).onFetchedVideoInfo(c47164IfA);
            }
        }
        return false;
    }
}

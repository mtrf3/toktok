package X;

import java.util.ArrayList;

/* renamed from: X.1IK, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1IK implements C0O6 {
    public final /* synthetic */ InterfaceC88471Ynr<java.util.Set<? extends Object>, C0OA, C76800UCe> LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C1IK(InterfaceC88471Ynr<? super java.util.Set<? extends Object>, ? super C0OA, C76800UCe> interfaceC88471Ynr) {
        this.LIZ = interfaceC88471Ynr;
    }

    @Override // X.C0O6
    public final void dispose() {
        InterfaceC88471Ynr<java.util.Set<? extends Object>, C0OA, C76800UCe> interfaceC88471Ynr = this.LIZ;
        synchronized (C0OF.LIZJ) {
            ((ArrayList) C0OF.LJI).remove(interfaceC88471Ynr);
        }
    }
}

package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Wsw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83690Wsw implements InterfaceC142275iB {
    public final /* synthetic */ InterfaceC83704WtA LIZ;

    public C83690Wsw(InterfaceC83704WtA interfaceC83704WtA) {
        this.LIZ = interfaceC83704WtA;
    }

    @Override // X.InterfaceC142275iB
    public final void LIZ(String error) {
        o.LJIIIZ(error, "error");
        this.LIZ.onError(error);
    }

    @Override // X.InterfaceC142275iB
    public final void onSuccess(String str) {
        this.LIZ.onSuccess(str);
    }
}

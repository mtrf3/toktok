package X;

import kotlin.jvm.internal.o;

/* renamed from: X.TkA, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75502TkA implements InterfaceC75014TcI {
    public final /* synthetic */ InterfaceC75507TkF LIZ;

    public C75502TkA(BAP bap) {
        this.LIZ = bap;
    }

    @Override // X.InterfaceC75014TcI
    public final void LIZIZ(String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        InterfaceC75507TkF interfaceC75507TkF = this.LIZ;
        if (interfaceC75507TkF != null) {
            interfaceC75507TkF.onSuccess();
        }
    }

    @Override // X.InterfaceC75014TcI
    public final void LIZ(int i, String linkMicId, String errorMessage, Throwable th) {
        o.LJIIIZ(linkMicId, "linkMicId");
        o.LJIIIZ(errorMessage, "errorMessage");
        InterfaceC75507TkF interfaceC75507TkF = this.LIZ;
        if (interfaceC75507TkF != null) {
            interfaceC75507TkF.onFailed(errorMessage);
        }
    }
}

package X;

import kotlin.jvm.internal.o;

/* renamed from: X.abW, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94098abW implements InterfaceC93663aUV<String> {
    public final /* synthetic */ C93625aTt LIZ;

    @Override // X.InterfaceC93663aUV
    public final void onFail() {
        InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) this.LIZ.get();
        if (interfaceC88471Ynr != null) {
            interfaceC88471Ynr.invoke(Boolean.FALSE, "");
        }
    }

    public C94098abW(C93625aTt c93625aTt) {
        this.LIZ = c93625aTt;
    }

    @Override // X.InterfaceC93663aUV
    public final void onSuccess(String result) {
        o.LJIIIZ(result, "result");
        InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) this.LIZ.get();
        if (interfaceC88471Ynr != null) {
            interfaceC88471Ynr.invoke(Boolean.TRUE, result);
        }
    }
}

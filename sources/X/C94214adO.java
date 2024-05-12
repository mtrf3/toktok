package X;

import kotlin.jvm.internal.o;

/* renamed from: X.adO, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94214adO implements InterfaceC93663aUV<String> {
    public final /* synthetic */ InterfaceC88471Ynr LIZ;

    @Override // X.InterfaceC93663aUV
    public final void onFail() {
        this.LIZ.invoke(Boolean.FALSE, "");
    }

    public C94214adO(InterfaceC88471Ynr interfaceC88471Ynr) {
        this.LIZ = interfaceC88471Ynr;
    }

    @Override // X.InterfaceC93663aUV
    public final void onSuccess(String result) {
        o.LJIIIZ(result, "result");
        this.LIZ.invoke(Boolean.TRUE, result);
    }
}

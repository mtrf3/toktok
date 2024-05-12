package X;

import kotlin.jvm.internal.o;

/* renamed from: X.abT, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94095abT implements InterfaceC93663aUV<C94411agZ> {
    @Override // X.InterfaceC93663aUV
    public final void onFail() {
        C94034aaU.LIZ("ObjectSelectImpl", "prefetchFeatureList: fail");
    }

    @Override // X.InterfaceC93663aUV
    public final void onSuccess(C94411agZ result) {
        o.LJIIIZ(result, "result");
        C94034aaU.LIZ("ObjectSelectImpl", "prefetchFeatureList: success");
    }
}

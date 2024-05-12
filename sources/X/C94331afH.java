package X;

import kotlin.jvm.internal.o;

/* renamed from: X.afH, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94331afH implements InterfaceC93663aUV<String> {
    public final /* synthetic */ XJL LIZ;

    @Override // X.InterfaceC93663aUV
    public final void onFail() {
        XJL xjl = this.LIZ;
        C76800UCe c76800UCe = C76800UCe.LIZ;
        C3C5.m7constructorimpl(c76800UCe);
        xjl.resumeWith(c76800UCe);
    }

    public C94331afH(XKS xks) {
        this.LIZ = xks;
    }

    @Override // X.InterfaceC93663aUV
    public final void onSuccess(String result) {
        o.LJIIIZ(result, "result");
        XJL xjl = this.LIZ;
        C76800UCe c76800UCe = C76800UCe.LIZ;
        C3C5.m7constructorimpl(c76800UCe);
        xjl.resumeWith(c76800UCe);
    }
}

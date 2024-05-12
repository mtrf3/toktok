package X;

import kotlin.jvm.internal.o;

/* renamed from: X.aba, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94102aba implements InterfaceC93663aUV<String> {
    public final /* synthetic */ XJL LIZ;

    @Override // X.InterfaceC93663aUV
    public final void onFail() {
        XJL xjl = this.LIZ;
        C94275aeN c94275aeN = new C94275aeN(EnumC93840aXM.Fail, "");
        C3C5.m7constructorimpl(c94275aeN);
        xjl.resumeWith(c94275aeN);
    }

    public C94102aba(XKS xks) {
        this.LIZ = xks;
    }

    @Override // X.InterfaceC93663aUV
    public final void onSuccess(String result) {
        o.LJIIIZ(result, "result");
        XJL xjl = this.LIZ;
        C94275aeN c94275aeN = new C94275aeN(EnumC93840aXM.Success, result);
        C3C5.m7constructorimpl(c94275aeN);
        xjl.resumeWith(c94275aeN);
    }
}

package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.abb, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94103abb implements InterfaceC93663aUV<List<? extends C93838aXK>> {
    public final /* synthetic */ XJL LIZ;

    @Override // X.InterfaceC93663aUV
    public final void onFail() {
        XJL xjl = this.LIZ;
        C94275aeN c94275aeN = new C94275aeN(EnumC93840aXM.Fail, C61878OQg.INSTANCE);
        C3C5.m7constructorimpl(c94275aeN);
        xjl.resumeWith(c94275aeN);
    }

    public C94103abb(XKS xks) {
        this.LIZ = xks;
    }

    @Override // X.InterfaceC93663aUV
    public final void onSuccess(List<? extends C93838aXK> result) {
        o.LJIIIZ(result, "result");
        XJL xjl = this.LIZ;
        C94275aeN c94275aeN = new C94275aeN(EnumC93840aXM.Success, result);
        C3C5.m7constructorimpl(c94275aeN);
        xjl.resumeWith(c94275aeN);
    }
}

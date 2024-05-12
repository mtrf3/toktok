package X;

import com.bytedance.effectcreatormobile.objectselect.api.AssetsLibData;
import kotlin.jvm.internal.o;

/* renamed from: X.abi, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94110abi implements InterfaceC93663aUV<AssetsLibData> {
    public final /* synthetic */ XJL LIZ;

    @Override // X.InterfaceC93663aUV
    public final void onFail() {
        XJL xjl = this.LIZ;
        C3C4 LIZ = C141335gf.LIZ(new Exception());
        C3C5.m7constructorimpl(LIZ);
        xjl.resumeWith(LIZ);
    }

    public C94110abi(XKS xks) {
        this.LIZ = xks;
    }

    @Override // X.InterfaceC93663aUV
    public final void onSuccess(AssetsLibData result) {
        o.LJIIIZ(result, "result");
        XJL xjl = this.LIZ;
        C3C5.m7constructorimpl(result);
        xjl.resumeWith(result);
    }
}

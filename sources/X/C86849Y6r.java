package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;

/* renamed from: X.Y6r, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86849Y6r implements InterfaceC141885hY {
    public final /* synthetic */ C86848Y6q LIZ;
    public final /* synthetic */ CompletionBlock<InterfaceC86851Y6t> LIZIZ;

    @Override // X.InterfaceC141885hY
    public final void onFailure() {
        String str;
        InterfaceC38263Ezz interfaceC38263Ezz = this.LIZ.LJLIL;
        if (interfaceC38263Ezz != null) {
            str = interfaceC38263Ezz.LIZIZ();
        } else {
            str = null;
        }
        InterfaceC86851Y6t interfaceC86851Y6t = (InterfaceC86851Y6t) ED5.LIZJ(InterfaceC86851Y6t.class, str);
        interfaceC86851Y6t.setVopCode(-1);
        this.LIZIZ.onFailure(0, "client error", interfaceC86851Y6t);
    }

    @Override // X.InterfaceC141885hY
    public final void onSuccess(String str) {
        String str2;
        C86853Y6v init = C86850Y6s.LIZIZ.LIZ.init(str);
        InterfaceC38263Ezz interfaceC38263Ezz = this.LIZ.LJLIL;
        if (interfaceC38263Ezz != null) {
            str2 = interfaceC38263Ezz.LIZIZ();
        } else {
            str2 = null;
        }
        InterfaceC86851Y6t interfaceC86851Y6t = (InterfaceC86851Y6t) ED5.LIZJ(InterfaceC86851Y6t.class, str2);
        interfaceC86851Y6t.setVopCode(init.LJI);
        Integer num = init.LJI;
        if (num == null || num.intValue() != 0) {
            this.LIZIZ.onFailure(0, "sdk error", interfaceC86851Y6t);
        } else {
            this.LIZIZ.onSuccess(interfaceC86851Y6t, "");
        }
    }

    public C86849Y6r(C86848Y6q c86848Y6q, C37356ElM c37356ElM) {
        this.LIZ = c86848Y6q;
        this.LIZIZ = c37356ElM;
    }
}

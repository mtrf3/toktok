package X;

import com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend;

/* renamed from: X.Wj4, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83078Wj4 implements InterfaceC78617UtJ {
    public final /* synthetic */ IHostUserDepend LIZ;
    public final /* synthetic */ InterfaceC83079Wj5 LIZIZ;

    @Override // X.InterfaceC78617UtJ
    public final void onFail() {
        InterfaceC83079Wj5 interfaceC83079Wj5 = this.LIZIZ;
        C83077Wj3 c83077Wj3 = new C83077Wj3();
        c83077Wj3.LIZ = "cancelled";
        c83077Wj3.LIZIZ = Boolean.FALSE;
        interfaceC83079Wj5.LIZ(c83077Wj3, "");
    }

    @Override // X.InterfaceC78617UtJ
    public final void onSuccess() {
        if (this.LIZ.hasLogin()) {
            InterfaceC83079Wj5 interfaceC83079Wj5 = this.LIZIZ;
            C83077Wj3 c83077Wj3 = new C83077Wj3();
            c83077Wj3.LIZIZ = Boolean.FALSE;
            c83077Wj3.LIZ = "loggedIn";
            interfaceC83079Wj5.LIZ(c83077Wj3, "");
            return;
        }
        InterfaceC83079Wj5 interfaceC83079Wj52 = this.LIZIZ;
        C83077Wj3 c83077Wj32 = new C83077Wj3();
        c83077Wj32.LIZIZ = Boolean.FALSE;
        c83077Wj32.LIZ = "cancelled";
        interfaceC83079Wj52.LIZ(c83077Wj32, "");
    }

    public C83078Wj4(IHostUserDepend iHostUserDepend, C83075Wj1 c83075Wj1) {
        this.LIZ = iHostUserDepend;
        this.LIZIZ = c83075Wj1;
    }
}

package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.Xnj, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85915Xnj extends C8BR<C8BS<BaseResponse>, InterfaceC85916Xnk> {
    @Override // X.C8BR, X.C8BT
    public final void onSuccess() {
        InterfaceC85916Xnk interfaceC85916Xnk;
        T t = this.LJLIL;
        if (t != 0 && (interfaceC85916Xnk = (InterfaceC85916Xnk) this.LJLILLLLZI) != null) {
            Object data = t.getData();
            o.LJIIIIZZ(data, "data");
            interfaceC85916Xnk.xc0((BaseResponse) data);
        }
    }

    public C85915Xnj() {
        LJJ(new C85914Xni());
    }

    @Override // X.C8BR, X.C8BT
    public final void onFailed(Exception exc) {
        InterfaceC85916Xnk interfaceC85916Xnk = (InterfaceC85916Xnk) this.LJLILLLLZI;
        if (interfaceC85916Xnk != null) {
            interfaceC85916Xnk.fd0();
        }
    }
}

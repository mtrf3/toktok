package X;

import kotlin.jvm.internal.o;

/* renamed from: X.ASo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26266ASo extends C8BR<C3I0, InterfaceC26267ASp> {
    @Override // X.C8BR, X.C8BT
    public final void onSuccess() {
        String str;
        InterfaceC26267ASp interfaceC26267ASp = (InterfaceC26267ASp) this.LJLILLLLZI;
        if (interfaceC26267ASp != null) {
            T t = this.LJLIL;
            if (t == 0 || (str = (String) t.getData()) == null) {
                str = "";
            }
            interfaceC26267ASp.w70(str);
        }
    }

    @Override // X.C8BR, X.C8BT
    public final void onFailed(Exception e) {
        o.LJIIIZ(e, "e");
        InterfaceC26267ASp interfaceC26267ASp = (InterfaceC26267ASp) this.LJLILLLLZI;
        if (interfaceC26267ASp != null) {
            interfaceC26267ASp.Vq0(e);
        }
    }
}

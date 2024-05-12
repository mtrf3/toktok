package X;

import kotlin.jvm.internal.o;

/* renamed from: X.QtC, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68418QtC implements InterfaceC67679QhH {
    public final /* synthetic */ InterfaceC68422QtG LJLIL;

    public C68418QtC(InterfaceC68422QtG interfaceC68422QtG) {
        this.LJLIL = interfaceC68422QtG;
    }

    @Override // X.InterfaceC67679QhH
    public final void onFailure(Exception e) {
        o.LJIIIZ(e, "e");
        InterfaceC68422QtG interfaceC68422QtG = this.LJLIL;
        if (interfaceC68422QtG != null) {
            interfaceC68422QtG.onSave(false, -1);
        }
    }
}

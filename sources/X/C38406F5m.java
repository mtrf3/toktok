package X;

import kotlin.jvm.internal.o;

/* renamed from: X.F5m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38406F5m implements InterfaceC40570Fw6 {
    public final /* synthetic */ String LJLIL;

    public C38406F5m(String str) {
        this.LJLIL = str;
    }

    @Override // X.InterfaceC40570Fw6
    public final void onFailure(Exception e) {
        o.LJIIIZ(e, "e");
        F5W.LIZIZ(e, this.LJLIL);
    }
}

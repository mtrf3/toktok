package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Pw7, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66051Pw7 implements InterfaceC66072PwS {
    public final /* synthetic */ InterfaceC66045Pw1 LIZ;

    public C66051Pw7(InterfaceC66045Pw1 interfaceC66045Pw1) {
        this.LIZ = interfaceC66045Pw1;
    }

    @Override // X.InterfaceC66072PwS
    public final void d(String message) {
        o.LJIIIZ(message, "message");
        this.LIZ.LIZJ().d("Helios.CacheController", message, null);
    }
}

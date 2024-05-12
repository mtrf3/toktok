package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Sfg, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72676Sfg implements C5ZR {
    public final InterfaceC72616Sei LIZ;

    public C72676Sfg(InterfaceC72616Sei interfaceC72616Sei) {
        this.LIZ = interfaceC72616Sei;
    }

    @Override // X.C5ZR
    public final void LIZ(int i, long j, long j2, String msg) {
        o.LJIIIZ(msg, "msg");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sendMessage msgID=");
        LIZ.append(i);
        LIZ.append(", arg1=");
        LIZ.append(j);
        C0MT.LIZLLL(LIZ, ", arg2=", j2, ", msg=");
        LIZ.append(msg);
        H78.LIZIZ("JEFF", X1D.LIZIZ(LIZ));
        this.LIZ.LJJJJIZL(i, (int) j, (int) j2, msg);
    }
}

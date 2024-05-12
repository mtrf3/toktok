package X;

import defpackage.b1;
import kotlin.jvm.internal.o;

/* renamed from: X.Gb4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41814Gb4 implements InterfaceC41817Gb7 {
    @Override // X.InterfaceC41817Gb7
    public final String getName() {
        return "DefaultReportWay";
    }

    @Override // X.InterfaceC41817Gb7
    public final void log(String msg) {
        o.LJIIIZ(msg, "msg");
    }

    @Override // X.InterfaceC41817Gb7
    public final void LIZ(C41815Gb5 c41815Gb5) {
        StringBuilder LIZJ = b1.LIZJ("DefaultReportWay", " {e.msg} ");
        LIZJ.append(c41815Gb5.getCode());
        throw new RuntimeException(X1D.LIZIZ(LIZJ));
    }
}

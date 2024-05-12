package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Ict, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47023Ict implements InterfaceC47033Id3 {
    @Override // X.InterfaceC47033Id3
    public final boolean LIZIZ(IX4 ix4) {
        return true;
    }

    @Override // X.InterfaceC47033Id3
    public final boolean LIZ(C47007Icd c47007Icd) {
        boolean z;
        if (c47007Icd != null) {
            z = true;
        } else {
            z = false;
        }
        String msg = o.LJIILLIIL(Boolean.valueOf(!z), "isForceNotReuse : ");
        o.LJIIIZ(msg, "msg");
        return z;
    }
}

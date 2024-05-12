package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Ico, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47018Ico implements InterfaceC47033Id3 {
    @Override // X.InterfaceC47033Id3
    public final boolean LIZIZ(IX4 ix4) {
        return true;
    }

    @Override // X.InterfaceC47033Id3
    public final boolean LIZ(C47007Icd c47007Icd) {
        boolean z;
        if (c47007Icd != null && !c47007Icd.LJFF.LIZLLL()) {
            z = true;
        } else {
            z = false;
        }
        String msg = o.LJIILLIIL(Boolean.valueOf(!z), "sr : ");
        o.LJIIIZ(msg, "msg");
        return z;
    }
}

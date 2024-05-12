package X;

import kotlin.jvm.internal.AqS14S2200000_6;
import kotlin.jvm.internal.AqS21S2100000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.FUe */
/* loaded from: classes7.dex */
public final class C39048FUe {
    public static InterfaceC39049FUf LIZ;
    public static final C39048FUe LIZIZ = new C39048FUe();

    public final void LIZ(String msg, EnumC39866Fkk logLevel, String tag) {
        o.LJIIJ(msg, "msg");
        o.LJIIJ(logLevel, "logLevel");
        o.LJIIJ(tag, "tag");
        try {
            FD6.LIZ(new AqS14S2200000_6(this, logLevel, tag, msg, 0));
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public static void LIZJ(C39048FUe c39048FUe, Throwable th, String extraMsg, int i) {
        String tag;
        if ((i & 2) != 0) {
            extraMsg = "";
        }
        if ((i & 4) != 0) {
            tag = "HybridKit";
        } else {
            tag = null;
        }
        c39048FUe.getClass();
        o.LJIIJ(extraMsg, "extraMsg");
        o.LJIIJ(tag, "tag");
        try {
            FD6.LIZ(new AqS21S2100000_6(tag, extraMsg, th, 0));
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th2) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th2));
        }
    }

    public static /* synthetic */ void LIZIZ(C39048FUe c39048FUe, String str, EnumC39866Fkk enumC39866Fkk, String str2, int i) {
        if ((i & 2) != 0) {
            enumC39866Fkk = EnumC39866Fkk.I;
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        c39048FUe.LIZ(str, enumC39866Fkk, str2);
    }
}

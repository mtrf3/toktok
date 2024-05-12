package Y;

import X.C36636EZk;
import X.C38306F1q;
import X.C38333F2r;
import X.C77266UUc;
import X.C78613UtF;
import X.C80853Fh;
import X.C81143Gk;
import X.EnumC81123Gi;
import X.InterfaceC64592gB;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class AfS18S1000000_1 implements InterfaceC64592gB {
    public final int $t;
    public String s0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            default:
                return;
        }
    }

    public AfS18S1000000_1(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }

    public static final void accept$0(AfS18S1000000_1 afS18S1000000_1, Object obj) {
        String str;
        C38306F1q c38306F1q;
        Throwable th = (Throwable) obj;
        if ((th instanceof C38333F2r) && (c38306F1q = (C38306F1q) th) != null) {
            String str2 = afS18S1000000_1.s0;
            if (c38306F1q.getErrorCode() == 3002047) {
                C77266UUc.LIZIZ.LJIIJ().LIZ(str2);
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("upload facebook token error: ");
        if (th == null || (str = th.getMessage()) == null) {
            str = "";
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
    }

    public static final void accept$1(AfS18S1000000_1 afS18S1000000_1, Object obj) {
        List it = (List) obj;
        C81143Gk c81143Gk = C81143Gk.LIZ;
        EnumC81123Gi enumC81123Gi = EnumC81123Gi.AddMember;
        String str = afS18S1000000_1.s0;
        o.LJIIIIZZ(it, "it");
        c81143Gk.getClass();
        C81143Gk.LJ(enumC81123Gi, str, it);
    }

    public static final void accept$2(AfS18S1000000_1 afS18S1000000_1, Object obj) {
        List it = (List) obj;
        C81143Gk c81143Gk = C81143Gk.LIZ;
        EnumC81123Gi enumC81123Gi = EnumC81123Gi.FetchMemberInfo;
        String str = afS18S1000000_1.s0;
        o.LJIIIIZZ(it, "it");
        c81143Gk.getClass();
        C81143Gk.LJ(enumC81123Gi, str, it);
        C81143Gk.LIZIZ(afS18S1000000_1.s0, it, C78613UtF.LIZJ, C36636EZk.LIZ, C80853Fh.LJ());
    }
}

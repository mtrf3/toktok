package az6;

import X.C101043xs;
import X.C16880lQ;
import X.C95063oE;
import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import kotlin.jvm.internal.o;
import p8.a;

/* loaded from: classes2.dex */
public final class b {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0010. Please report as an issue. */
    public static void LIZ(String str, a.b bVar, C101043xs c101043xs, ViewGroup.LayoutParams layoutParams) {
        Context context = c101043xs.getContext();
        String LJ = q8.a.LJ(str);
        switch (LJ.hashCode()) {
            case -1731289041:
                if (LJ.equals("imTitleColor")) {
                    o.LJIIIIZZ(context, "context");
                    c101043xs.setTitleTextColor(q8.a.LIZIZ(context, bVar));
                    return;
                }
                q8.a.LJFF(c101043xs.getContext(), C16880lQ.LJLLJ(b.class), str);
                throw null;
            case -1345570069:
                if (LJ.equals("imRightColor")) {
                    o.LJIIIIZZ(context, "context");
                    c101043xs.setRightTextColor(q8.a.LIZIZ(context, bVar));
                    return;
                }
                q8.a.LJFF(c101043xs.getContext(), C16880lQ.LJLLJ(b.class), str);
                throw null;
            case -1115026664:
                if (LJ.equals("imLeftText")) {
                    c101043xs.setLeftText(bVar.LIZ);
                    return;
                }
                q8.a.LJFF(c101043xs.getContext(), C16880lQ.LJLLJ(b.class), str);
                throw null;
            case -694559925:
                if (LJ.equals("imRightIconDescription")) {
                    String str2 = bVar.LIZ;
                    o.LJIIIIZZ(str2, "param.value");
                    c101043xs.setRightIconDescription(CastIntegerProtector.parseInt(str2));
                    return;
                }
                q8.a.LJFF(c101043xs.getContext(), C16880lQ.LJLLJ(b.class), str);
                throw null;
            case -221501736:
                if (LJ.equals("imLeftColor")) {
                    o.LJIIIIZZ(context, "context");
                    c101043xs.setLeftTextColor(q8.a.LIZIZ(context, bVar));
                    return;
                }
                q8.a.LJFF(c101043xs.getContext(), C16880lQ.LJLLJ(b.class), str);
                throw null;
            case 788045809:
                if (LJ.equals("imRightIcon")) {
                    String str3 = bVar.LIZ;
                    o.LJIIIIZZ(str3, "param.value");
                    c101043xs.setRightIcon(new C95063oE(CastIntegerProtector.parseInt(str3), -1));
                    return;
                }
                q8.a.LJFF(c101043xs.getContext(), C16880lQ.LJLLJ(b.class), str);
                throw null;
            case 788375717:
                if (LJ.equals("imRightText")) {
                    c101043xs.setRightText(bVar.LIZ);
                    return;
                }
                q8.a.LJFF(c101043xs.getContext(), C16880lQ.LJLLJ(b.class), str);
                throw null;
            case 1217288419:
                if (LJ.equals("imUseBackIcon")) {
                    c101043xs.LIZIZ();
                    return;
                }
                q8.a.LJFF(c101043xs.getContext(), C16880lQ.LJLLJ(b.class), str);
                throw null;
            case 1900002196:
                if (LJ.equals("imTitle")) {
                    String str4 = bVar.LIZ;
                    o.LJIIIIZZ(str4, "param.value");
                    c101043xs.setTitle(str4);
                    return;
                }
                q8.a.LJFF(c101043xs.getContext(), C16880lQ.LJLLJ(b.class), str);
                throw null;
            default:
                q8.a.LJFF(c101043xs.getContext(), C16880lQ.LJLLJ(b.class), str);
                throw null;
        }
    }
}

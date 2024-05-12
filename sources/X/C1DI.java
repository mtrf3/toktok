package X;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* renamed from: X.1DI, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C1DI implements InterfaceC48038ItG {
    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        return new C73950T0o(C38995FSd.LIZLLL());
    }

    public static void LIZIZ(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void LIZJ(StringBuilder sb, boolean z, StringBuilder sb2, int i) {
        sb.append(z);
        C36746EbW.LIZ(i, X1D.LIZIZ(sb2));
    }

    public static View LIZ(ViewGroup viewGroup, String str, int i, ViewGroup viewGroup2, boolean z, String str2) {
        o.LJIIIZ(viewGroup, str);
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(viewGroup.getContext()), i, viewGroup2, z);
        o.LJIIIIZZ(LLLLIILL, str2);
        return LLLLIILL;
    }
}

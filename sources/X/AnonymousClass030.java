package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.030, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class AnonymousClass030 {
    public static int LIZ() {
        if (C33949DUb.LIZIZ()) {
            return 1;
        }
        return 16777215;
    }

    public static EnumC36103EEx LIZIZ(EFM efm) {
        EF2 ef2 = EF2.LIZIZ;
        return (EnumC36103EEx) ((HashMap) ef2.LIZ).get(efm.type());
    }

    public static void LJFF(C48459J0d c48459J0d) {
        c48459J0d.LIZ(Long.valueOf(System.currentTimeMillis()));
    }

    public static void LJ(View view, int i) {
        C26045AKb c26045AKb = new C26045AKb(view);
        c26045AKb.LJIIIIZZ(i);
        c26045AKb.LJIIJ();
    }

    public static int LIZJ(int i, int i2, int i3, int i4) {
        return ((i - i2) / i3) + i4;
    }

    public static View LIZLLL(Context context, int i, ViewGroup viewGroup, boolean z, String str) {
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), i, viewGroup, z);
        o.LJIIIIZZ(LLLLIILL, str);
        return LLLLIILL;
    }
}

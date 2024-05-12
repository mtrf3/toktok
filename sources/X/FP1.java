package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final /* synthetic */ class FP1 {
    public static C31808Ce4 LIZJ(Context context, int i) {
        C31808Ce4 c31808Ce4 = new C31808Ce4(context);
        c31808Ce4.setId(i);
        return c31808Ce4;
    }

    public static void LJ(String str, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(str2);
        H78.LIZ(X1D.LIZIZ(LIZ));
    }

    public static void LJFF(String str, String str2, String str3) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(str2);
        C0NB.LJIIIZ(str3, X1D.LIZIZ(LIZ));
    }

    public static ViewModel LIZIZ(InterfaceC65350Pko interfaceC65350Pko, ViewModelProvider viewModelProvider, String str, String str2) {
        ViewModel viewModel = viewModelProvider.get(str, C39557Ffl.LIZ(interfaceC65350Pko));
        o.LJFF(viewModel, str2);
        return viewModel;
    }

    public static String LIZLLL(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static View LIZ(LayoutInflater layoutInflater, String str, ViewGroup viewGroup, String str2, LayoutInflater layoutInflater2, int i, ViewGroup viewGroup2, boolean z, String str3) {
        o.LJIIIZ(layoutInflater, str);
        o.LJIIIZ(viewGroup, str2);
        View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater2, i, viewGroup2, z);
        o.LJIIIIZZ(LLLLIILL, str3);
        return LLLLIILL;
    }
}

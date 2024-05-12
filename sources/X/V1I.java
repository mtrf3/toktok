package X;

import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import n.b;
import o7a.i;
import p8.a;

/* loaded from: classes14.dex */
public final /* synthetic */ class V1I {
    public static C24440xc LIZIZ(InterfaceC24520xk interfaceC24520xk, InterfaceC015404g interfaceC015404g, C45911r9 c45911r9, InterfaceC24520xk interfaceC24520xk2) {
        C24830yF.LIZ(interfaceC24520xk, interfaceC015404g, c45911r9);
        interfaceC24520xk.LJIIIIZZ();
        return new C24440xc(interfaceC24520xk2);
    }

    public static void LIZJ(StringBuilder sb, long j, String str, boolean z) {
        sb.append(j);
        sb.append(str);
        sb.append(z);
    }

    public static void LIZLLL(StringBuilder sb, String str, int i, String str2) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
    }

    public static ViewParent LIZ(String str, a.b bVar, TuxIconView tuxIconView, FrameLayout.LayoutParams layoutParams, TuxIconView tuxIconView2) {
        i.LIZ(str, bVar, tuxIconView, layoutParams);
        b.LIZ(tuxIconView2);
        return tuxIconView.getParent();
    }
}

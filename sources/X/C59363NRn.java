package X;

import android.view.ViewGroup;

/* renamed from: X.NRn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59363NRn {
    public static <DEPEND extends NSG> void LIZ(InterfaceC59366NRq<DEPEND> interfaceC59366NRq, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup container = ((NSG) interfaceC59366NRq.L9()).getContainer();
        ViewGroup.LayoutParams layoutParams = container.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.bottomMargin = i;
        }
        container.setLayoutParams(container.getLayoutParams());
    }

    public static <DEPEND extends NSG> void LIZIZ(InterfaceC59366NRq<DEPEND> interfaceC59366NRq, int i) {
        ViewGroup container = ((NSG) interfaceC59366NRq.L9()).getContainer();
        container.getLayoutParams().height = i;
        container.setLayoutParams(container.getLayoutParams());
    }

    public static <DEPEND extends NSG> void LIZJ(InterfaceC59366NRq<DEPEND> interfaceC59366NRq, int i) {
        ((NSG) interfaceC59366NRq.L9()).getContainer().setVisibility(i);
    }
}

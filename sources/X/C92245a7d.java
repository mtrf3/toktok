package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.internal.o;

/* renamed from: X.a7d, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92245a7d implements InterfaceC91773a01 {
    @Override // X.InterfaceC91773a01
    public final void LIZ(View view, C92158a6E controller, String str, String str2, String str3, InterfaceC65784Pro primaryAction, String str4, InterfaceC65784Pro interfaceC65784Pro, InterfaceC88471Ynr topImage, C43401n6 c43401n6, C11850dJ c11850dJ, InterfaceC65784Pro onDismissRequest) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(controller, "controller");
        o.LJIIIZ(primaryAction, "primaryAction");
        o.LJIIIZ(topImage, "topImage");
        o.LJIIIZ(onDismissRequest, "onDismissRequest");
        ViewGroup LIZ = C92116a5Y.LIZ(view);
        Context context = LIZ.getContext();
        o.LJIIIIZZ(context, "viewGroup.context");
        ComposeView composeView = new ComposeView(context, null, 6);
        composeView.setContent(C1DJ.LJFF(new C92872aHk(controller, str, str2, str3, primaryAction, str4, interfaceC65784Pro, topImage, c43401n6, c11850dJ, LIZ, composeView, onDismissRequest), -985541249, true));
        LIZ.addView(composeView);
    }
}

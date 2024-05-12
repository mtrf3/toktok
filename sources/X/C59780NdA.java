package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.NdA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59780NdA {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(View view, InterfaceC65784Pro interfaceC65784Pro, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(view, "view");
        C58632Mzk c58632Mzk = new C58632Mzk(view.getContext(), interfaceC88472Yns);
        c58632Mzk.LJLJLJ = new C59782NdC(interfaceC65784Pro);
        c58632Mzk.LJLJLLL = ViewOnTouchListenerC43328GzU.LJLIL;
        view.setOnTouchListener(c58632Mzk);
    }
}

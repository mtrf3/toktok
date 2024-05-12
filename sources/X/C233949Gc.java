package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.9Gc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C233949Gc extends AbstractC65781Prl implements InterfaceC88472Yns<Context, View> {
    public static final C233949Gc LJLIL = new C233949Gc();

    public C233949Gc() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final View invoke(Context context) {
        Context context2 = context;
        o.LJIIIZ(context2, "context");
        return new LinearLayout(context2);
    }
}

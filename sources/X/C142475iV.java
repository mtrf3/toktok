package X;

import android.content.Context;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import kotlin.jvm.internal.o;

/* renamed from: X.5iV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C142475iV extends AbstractC65781Prl implements InterfaceC88472Yns<Context, View> {
    public static final C142475iV LJLIL = new C142475iV();

    public C142475iV() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final View invoke(Context context) {
        Context context2 = context;
        o.LJIIIZ(context2, "context");
        return new TuxIconView(context2, null, 0, 6, null);
    }
}

package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.WPx, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82253WPx extends AbstractC65781Prl implements InterfaceC88471Ynr<Context, WQ1, C82254WPy> {
    public static final C82253WPx LJLIL = new C82253WPx();

    public C82253WPx() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C82254WPy invoke(Context context, WQ1 wq1) {
        Context context2 = context;
        WQ1 tab = wq1;
        o.LJIIIZ(context2, "context");
        o.LJIIIZ(tab, "tab");
        return new C82254WPy(context2, tab);
    }
}

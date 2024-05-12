package X;

import android.content.Context;
import android.content.ContextWrapper;
import kotlin.jvm.internal.o;

/* renamed from: X.J8m, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48676J8m extends AbstractC65781Prl implements InterfaceC88472Yns<Context, Context> {
    public static final C48676J8m LJLIL = new C48676J8m();

    public C48676J8m() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Context invoke(Context context) {
        Context it = context;
        o.LJIIIZ(it, "it");
        if (it instanceof ContextWrapper) {
            return ((ContextWrapper) it).getBaseContext();
        }
        return null;
    }
}

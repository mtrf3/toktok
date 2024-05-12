package X;

import android.content.Context;
import android.content.ContextWrapper;
import kotlin.jvm.internal.o;

/* renamed from: X.J8j, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48673J8j extends AbstractC65781Prl implements InterfaceC88472Yns<Context, Context> {
    public static final C48673J8j LJLIL = new C48673J8j();

    public C48673J8j() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Context invoke(Context context) {
        ContextWrapper contextWrapper;
        Context it = context;
        o.LJIIIZ(it, "it");
        if (!(it instanceof ContextWrapper) || (contextWrapper = (ContextWrapper) it) == null) {
            return null;
        }
        return contextWrapper.getBaseContext();
    }
}

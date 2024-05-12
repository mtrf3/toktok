package X;

import android.content.Context;
import android.content.ContextWrapper;
import kotlin.jvm.internal.o;

/* renamed from: X.J8l, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48675J8l extends AbstractC65781Prl implements InterfaceC88472Yns<Context, Context> {
    public static final C48675J8l LJLIL = new C48675J8l();

    public C48675J8l() {
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

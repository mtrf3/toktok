package X;

import android.content.Context;
import android.content.ContextWrapper;
import kotlin.jvm.internal.o;

/* renamed from: X.aA3, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92395aA3 extends AbstractC65781Prl implements InterfaceC88472Yns<Context, Context> {
    public static final C92395aA3 LJLIL = new C92395aA3();

    public C92395aA3() {
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

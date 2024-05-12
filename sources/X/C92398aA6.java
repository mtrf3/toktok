package X;

import android.content.Context;
import android.content.ContextWrapper;
import kotlin.jvm.internal.o;

/* renamed from: X.aA6, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92398aA6 extends AbstractC65781Prl implements InterfaceC88472Yns<Context, Context> {
    public static final C92398aA6 LJLIL = new C92398aA6();

    public C92398aA6() {
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

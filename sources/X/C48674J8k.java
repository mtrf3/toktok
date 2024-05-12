package X;

import android.content.Context;
import android.content.ContextWrapper;
import kotlin.jvm.internal.o;

/* renamed from: X.J8k, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48674J8k extends AbstractC65781Prl implements InterfaceC88472Yns<Context, Context> {
    public static final C48674J8k LJLIL = new C48674J8k();

    public C48674J8k() {
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

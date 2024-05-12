package X;

import android.content.Context;
import android.content.ContextWrapper;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class L9V extends AbstractC65781Prl implements InterfaceC88472Yns<Context, Context> {
    public static final L9V LJLIL = new L9V();

    public L9V() {
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

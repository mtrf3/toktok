package X;

import android.content.Context;
import android.content.ContextWrapper;
import kotlin.jvm.internal.o;

/* renamed from: X.Crq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32662Crq extends AbstractC65781Prl implements InterfaceC88472Yns<Context, Context> {
    public static final C32662Crq LJLIL = new C32662Crq();

    public C32662Crq() {
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

package X;

import android.content.Context;
import android.content.ContextWrapper;
import kotlin.jvm.internal.o;

/* renamed from: X.PNs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64360PNs extends AbstractC65781Prl implements InterfaceC88472Yns<Context, ContextWrapper> {
    public static final C64360PNs LJLIL = new C64360PNs();

    public C64360PNs() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final ContextWrapper invoke(Context context) {
        Context it = context;
        o.LJIIIZ(it, "it");
        return new ContextWrapper(it);
    }
}

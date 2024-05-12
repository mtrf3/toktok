package X;

import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* renamed from: X.SnN, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73153SnN extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, C73176Snk> {
    public static final C73153SnN LJLIL = new C73153SnN();

    public C73153SnN() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C73176Snk invoke(ViewGroup viewGroup) {
        ViewGroup parent = viewGroup;
        o.LJIIJ(parent, "parent");
        return new C73176Snk(parent, null);
    }
}

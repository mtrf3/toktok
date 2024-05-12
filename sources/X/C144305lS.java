package X;

import android.util.Size;
import kotlin.jvm.internal.o;

/* renamed from: X.5lS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C144305lS extends AbstractC65781Prl implements InterfaceC88472Yns<C144315lT, C144315lT> {
    public static final C144305lS LJLIL = new C144305lS();

    public C144305lS() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C144315lT invoke(C144315lT c144315lT) {
        C144315lT setState = c144315lT;
        o.LJIIIZ(setState, "$this$setState");
        Size size = setState.LJLIL;
        o.LJIIIZ(size, "size");
        return new C144315lT(size, true);
    }
}

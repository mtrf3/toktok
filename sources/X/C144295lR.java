package X;

import android.util.Size;
import kotlin.jvm.internal.o;

/* renamed from: X.5lR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C144295lR extends AbstractC65781Prl implements InterfaceC88472Yns<C144315lT, C144315lT> {
    public static final C144295lR LJLIL = new C144295lR();

    public C144295lR() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C144315lT invoke(C144315lT c144315lT) {
        C144315lT setState = c144315lT;
        o.LJIIIZ(setState, "$this$setState");
        Size size = setState.LJLIL;
        o.LJIIIZ(size, "size");
        return new C144315lT(size, false);
    }
}

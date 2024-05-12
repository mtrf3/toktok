package X;

import android.util.TypedValue;
import kotlin.jvm.internal.o;

/* renamed from: X.V0p, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79047V0p extends AbstractC65781Prl implements InterfaceC88472Yns<TypedValue, Integer> {
    public static final C79047V0p LJLIL = new C79047V0p();

    public C79047V0p() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Integer invoke(TypedValue typedValue) {
        TypedValue it = typedValue;
        o.LJIIIZ(it, "it");
        int i = it.type;
        if (i >= 28 && i <= 31) {
            return Integer.valueOf(it.data);
        }
        return null;
    }
}

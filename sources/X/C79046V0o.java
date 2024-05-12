package X;

import android.util.TypedValue;
import kotlin.jvm.internal.o;

/* renamed from: X.V0o, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79046V0o extends AbstractC65781Prl implements InterfaceC88472Yns<TypedValue, Float> {
    public static final C79046V0o LJLIL = new C79046V0o();

    public C79046V0o() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Float invoke(TypedValue typedValue) {
        TypedValue it = typedValue;
        o.LJIIIZ(it, "it");
        if (it.type == 4) {
            return Float.valueOf(it.getFloat());
        }
        return null;
    }
}

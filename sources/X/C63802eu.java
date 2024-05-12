package X;

import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.2eu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63802eu extends AbstractC65781Prl implements InterfaceC88472Yns<Map.Entry<? extends String, ? extends Boolean>, CharSequence> {
    public static final C63802eu LJLIL = new C63802eu();

    public C63802eu() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(Map.Entry<? extends String, ? extends Boolean> entry) {
        Map.Entry<? extends String, ? extends Boolean> it = entry;
        o.LJIIIZ(it, "it");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(it.getKey());
        LIZ.append('=');
        LIZ.append(it.getValue().booleanValue());
        return X1D.LIZIZ(LIZ);
    }
}

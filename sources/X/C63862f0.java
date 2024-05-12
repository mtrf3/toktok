package X;

import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.2f0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63862f0 extends AbstractC65781Prl implements InterfaceC88472Yns<Map.Entry<String, Integer>, CharSequence> {
    public static final C63862f0 LJLIL = new C63862f0();

    public C63862f0() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(Map.Entry<String, Integer> entry) {
        Map.Entry<String, Integer> entry2 = entry;
        o.LJIIIZ(entry2, "entry");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(entry2.getKey());
        LIZ.append('-');
        LIZ.append(entry2.getValue().intValue());
        return X1D.LIZIZ(LIZ);
    }
}

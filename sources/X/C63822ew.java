package X;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.2ew, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63822ew extends AbstractC65781Prl implements InterfaceC88472Yns<Map.Entry<? extends String, ? extends String>, OSZ<? extends String, ? extends List<? extends String>>> {
    public static final C63822ew LJLIL = new C63822ew();

    public C63822ew() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final OSZ<? extends String, ? extends List<? extends String>> invoke(Map.Entry<? extends String, ? extends String> entry) {
        Map.Entry<? extends String, ? extends String> it = entry;
        o.LJIIIZ(it, "it");
        return new OSZ<>(it.getKey(), C47261Igj.LJJIJ(it.getValue()));
    }
}

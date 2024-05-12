package X;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.2ex, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63832ex extends AbstractC65781Prl implements InterfaceC88472Yns<Map.Entry<? extends String, ? extends List<? extends String>>, Boolean> {
    public static final C63832ex LJLIL = new C63832ex();

    public C63832ex() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(Map.Entry<? extends String, ? extends List<? extends String>> entry) {
        boolean z;
        Map.Entry<? extends String, ? extends List<? extends String>> it = entry;
        o.LJIIIZ(it, "it");
        String key = it.getKey();
        if (key == null || key.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

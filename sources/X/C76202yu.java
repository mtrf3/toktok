package X;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.2yu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76202yu extends AbstractC65781Prl implements InterfaceC88472Yns<Map.Entry<? extends String, ? extends List<? extends String>>, Boolean> {
    public static final C76202yu LJLIL = new C76202yu();

    public C76202yu() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(Map.Entry<? extends String, ? extends List<? extends String>> entry) {
        boolean z;
        Map.Entry<? extends String, ? extends List<? extends String>> it = entry;
        o.LJIIIZ(it, "it");
        List<? extends String> value = it.getValue();
        if (value == null || value.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

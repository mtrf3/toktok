package X;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.2ev, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63812ev extends AbstractC65781Prl implements InterfaceC88472Yns<Map.Entry<? extends String, ? extends List<? extends String>>, OSZ<? extends String, ? extends String>> {
    public static final C63812ev LJLIL = new C63812ev();

    public C63812ev() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final OSZ<? extends String, ? extends String> invoke(Map.Entry<? extends String, ? extends List<? extends String>> entry) {
        Object LJLLLL;
        Map.Entry<? extends String, ? extends List<? extends String>> it = entry;
        o.LJIIIZ(it, "it");
        String key = it.getKey();
        Object obj = "";
        if (key == null) {
            key = "";
        }
        List<? extends String> value = it.getValue();
        if (value != null && (LJLLLL = ORZ.LJLLLL(value)) != null) {
            obj = LJLLLL;
        }
        return new OSZ<>(key, obj);
    }
}

package X;

import java.util.LinkedHashMap;

/* renamed from: X.DyM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35614DyM extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Map<String, Integer>> {
    public static final C35614DyM LJLIL = new C35614DyM();

    public C35614DyM() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Map<String, Integer> invoke() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C35615DyN.LIZ.getClass();
        String[] strArr = (String[]) C35615DyN.LIZJ.getValue();
        if (strArr != null) {
            for (String str : strArr) {
                linkedHashMap.put(str, 2);
            }
        }
        return linkedHashMap;
    }
}

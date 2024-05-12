package X;

import java.util.LinkedHashMap;

/* renamed from: X.4yM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C126824yM extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Map<String, Integer[]>> {
    public static final C126824yM LJLIL = new C126824yM();

    public C126824yM() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Map<String, Integer[]> invoke() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (EnumC126814yL enumC126814yL : EnumC126814yL.values()) {
            linkedHashMap.put(enumC126814yL.getNameId(), new Integer[]{Integer.valueOf(enumC126814yL.getUndoId()), enumC126814yL.getRedoId()});
        }
        return linkedHashMap;
    }
}

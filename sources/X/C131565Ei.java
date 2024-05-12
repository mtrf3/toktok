package X;

import java.util.HashMap;

/* renamed from: X.5Ei, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131565Ei extends AbstractC65781Prl implements InterfaceC65784Pro<C131555Eh> {
    public static final C131565Ei LJLIL = new C131565Ei();

    public C131565Ei() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C131555Eh invoke() {
        HashMap hashMap = new HashMap();
        hashMap.put(C52V.UNDO, 8);
        hashMap.put(C52V.REDO, 8);
        hashMap.put(C52V.FULL_SCREEN, 8);
        return new C131555Eh(new C08630Vn(hashMap), 111);
    }
}

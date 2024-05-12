package X;

import java.util.HashMap;

/* loaded from: classes16.dex */
public final class XIM extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Map<String, String>> {
    public final /* synthetic */ long LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XIM(long j) {
        super(0);
        this.LJLIL = j;
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Map<String, String> invoke() {
        long j = this.LJLIL;
        HashMap hashMap = new HashMap();
        hashMap.put("duration", String.valueOf(j));
        hashMap.put("is_new_user", String.valueOf(((Boolean) XIW.LIZIZ.getValue()).booleanValue()));
        hashMap.put("is_optimise_assembler", String.valueOf(C214368bA.LJIJ));
        hashMap.put("is_optimise_store", String.valueOf(C214368bA.LJIJI));
        return hashMap;
    }
}

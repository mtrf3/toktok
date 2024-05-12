package X;

import java.util.LinkedHashMap;

/* renamed from: X.7GS, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7GS extends F9E implements InterfaceC60152Xr {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;

    @Override // X.InterfaceC54035LIp
    public final boolean LLD() {
        return true;
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLILZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_method", this.LJLIL);
        linkedHashMap.put("element", this.LJLILLLLZI);
        linkedHashMap.put("to_status", this.LJLJI);
        linkedHashMap.put("overall_status", this.LJLJJI);
        return linkedHashMap;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI};
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLJZ() {
        return LLLILZ();
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLLIL() {
        return C113554cx.LJJJLIIL();
    }

    public C7GS(String str, String str2, String str3, String str4) {
        C43588H8u.LIZLLL(str, "enterMethod", str2, "element", str3, "toStatus", str4, "overallStatus");
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = str4;
    }
}

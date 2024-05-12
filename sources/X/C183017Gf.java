package X;

import java.util.LinkedHashMap;

/* renamed from: X.7Gf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C183017Gf extends F9E implements InterfaceC60152Xr {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;

    @Override // X.InterfaceC54035LIp
    public final boolean LLD() {
        return true;
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLILZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("search_keyword", this.LJLIL);
        linkedHashMap.put("search_id", this.LJLILLLLZI);
        linkedHashMap.put("search_type", this.LJLJI);
        return linkedHashMap;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI};
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLJZ() {
        return LLLILZ();
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLLIL() {
        return C113554cx.LJJJLIIL();
    }

    public C183017Gf(String str, String str2, String str3) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
    }
}

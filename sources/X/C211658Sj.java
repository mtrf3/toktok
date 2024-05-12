package X;

import java.util.LinkedHashMap;

/* renamed from: X.8Sj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211658Sj implements InterfaceC54035LIp {
    public String LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public final String LJLJJLL;

    public C211658Sj() {
        this(0);
    }

    @Override // X.InterfaceC54035LIp
    public final boolean LLD() {
        return true;
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLILZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("author_id", this.LJLIL);
        linkedHashMap.put("component_key", this.LJLILLLLZI);
        linkedHashMap.put("component_type", this.LJLJI);
        linkedHashMap.put("enter_from", this.LJLJJI);
        linkedHashMap.put("group_id", this.LJLJJL);
        linkedHashMap.put("search_id", this.LJLJJLL);
        return linkedHashMap;
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLJZ() {
        return LLLILZ();
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLLIL() {
        return C113554cx.LJJJLIIL();
    }

    public C211658Sj(int i) {
        this.LJLIL = null;
        this.LJLILLLLZI = null;
        this.LJLJI = null;
        this.LJLJJI = null;
        this.LJLJJL = null;
        this.LJLJJLL = null;
    }
}

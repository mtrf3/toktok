package X;

import java.util.LinkedHashMap;

/* renamed from: X.7is, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C193667is extends F9E implements InterfaceC54035LIp {
    public final String LJLIL;
    public final int LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;
    public final String LJLJL;

    @Override // X.InterfaceC54035LIp
    public final boolean LLD() {
        return true;
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLILZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("group_id", this.LJLIL);
        linkedHashMap.put("aweme_type", Integer.valueOf(this.LJLILLLLZI));
        linkedHashMap.put("enter_from", this.LJLJI);
        linkedHashMap.put("download_method", this.LJLJJI);
        linkedHashMap.put("is_self_video", this.LJLJJL);
        linkedHashMap.put("detail_tab_name", this.LJLJJLL);
        linkedHashMap.put("download_id", this.LJLJL);
        return linkedHashMap;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI), this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL};
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLJZ() {
        return LLLILZ();
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLLIL() {
        return C113554cx.LJJJLIIL();
    }

    public C193667is(int i, String str, String str2, String str3, String str4, String str5, String str6) {
        C43588H8u.LIZLLL(str2, "enterFrom", str3, "downloadMethod", str5, "detailTabName", str6, "downloadID");
        this.LJLIL = str;
        this.LJLILLLLZI = i;
        this.LJLJI = str2;
        this.LJLJJI = str3;
        this.LJLJJL = str4;
        this.LJLJJLL = str5;
        this.LJLJL = str6;
    }
}

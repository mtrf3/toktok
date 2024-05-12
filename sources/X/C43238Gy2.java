package X;

import java.util.LinkedHashMap;

/* renamed from: X.Gy2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43238Gy2 extends F9E implements InterfaceC54035LIp {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final int LJLJJLL;
    public final int LJLJL;

    @Override // X.InterfaceC54035LIp
    public final boolean LLD() {
        return true;
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLILZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("watermark_id", this.LJLIL);
        linkedHashMap.put("watermark_sdk", this.LJLILLLLZI);
        linkedHashMap.put("watermark_type", this.LJLJI);
        linkedHashMap.put("start_watermark", this.LJLJJI);
        linkedHashMap.put("end_watermark", this.LJLJJL);
        linkedHashMap.put("duration", Integer.valueOf(this.LJLJJLL));
        linkedHashMap.put("succeed", Integer.valueOf(this.LJLJL));
        return linkedHashMap;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, Integer.valueOf(this.LJLJJLL), Integer.valueOf(this.LJLJL)};
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLJZ() {
        return LLLILZ();
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLLIL() {
        return C113554cx.LJJJLIIL();
    }

    public C43238Gy2(String str, String str2, String str3, String str4, String str5, int i, int i2) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = str4;
        this.LJLJJL = str5;
        this.LJLJJLL = i;
        this.LJLJL = i2;
    }
}

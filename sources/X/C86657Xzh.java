package X;

import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Xzh, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86657Xzh extends F9E implements InterfaceC60152Xr {
    public final int LJLIL;
    public final String LJLILLLLZI;
    public final int LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;
    public final int LJLJL;
    public final int LJLJLJ;
    public final String LJLJLLL;

    @Override // X.InterfaceC54035LIp
    public final boolean LLD() {
        return true;
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLILZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("has_subtitle", Integer.valueOf(this.LJLIL));
        linkedHashMap.put("subtitle_type", this.LJLILLLLZI);
        linkedHashMap.put("is_burned_in", Integer.valueOf(this.LJLJI));
        linkedHashMap.put("captions_show_type", this.LJLJJI);
        linkedHashMap.put("subtitle_source_lang", this.LJLJJL);
        linkedHashMap.put("subtitle_load_type", this.LJLJJLL);
        linkedHashMap.put("have_transl", Integer.valueOf(this.LJLJL));
        linkedHashMap.put("use_transl", Integer.valueOf(this.LJLJLJ));
        linkedHashMap.put("subtitle_lang", this.LJLJLLL);
        return linkedHashMap;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), this.LJLILLLLZI, Integer.valueOf(this.LJLJI), this.LJLJJI, this.LJLJJL, this.LJLJJLL, Integer.valueOf(this.LJLJL), Integer.valueOf(this.LJLJLJ), this.LJLJLLL};
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLJZ() {
        if (!o.LJ(((LinkedHashMap) LLLILZ()).get("has_subtitle"), 1)) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap();
        hashMap.putAll(LLLILZ());
        if (!o.LJ(((LinkedHashMap) LLLILZ()).get("have_transl"), 1)) {
            hashMap.remove("use_transl");
        }
        if (o.LJ(((LinkedHashMap) LLLILZ()).get("subtitle_load_type"), "")) {
            hashMap.remove("subtitle_load_type");
        }
        return hashMap;
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLLIL() {
        return C113554cx.LJJJLIIL();
    }

    public C86657Xzh(int i, int i2, int i3, int i4, String str, String str2, String str3, String str4, String str5) {
        HH1.LIZ(str, "subtitleType", str2, "captionsShowType", str4, "subtitleLoadType");
        this.LJLIL = i;
        this.LJLILLLLZI = str;
        this.LJLJI = i2;
        this.LJLJJI = str2;
        this.LJLJJL = str3;
        this.LJLJJLL = str4;
        this.LJLJL = i3;
        this.LJLJLJ = i4;
        this.LJLJLLL = str5;
    }
}

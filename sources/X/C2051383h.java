package X;

import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.83h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2051383h extends F9E implements InterfaceC60152Xr {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public final String LJLJJLL;

    @Override // X.InterfaceC54035LIp
    public final boolean LLD() {
        return true;
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLILZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("has_title", Integer.valueOf(this.LJLIL));
        linkedHashMap.put("title_length", Integer.valueOf(this.LJLILLLLZI));
        linkedHashMap.put("title_without_hashtag_length", Integer.valueOf(this.LJLJI));
        linkedHashMap.put("is_title_translatable", Integer.valueOf(this.LJLJJI));
        linkedHashMap.put("is_title_translated", Integer.valueOf(this.LJLJJL));
        linkedHashMap.put("title_source_lang", this.LJLJJLL);
        return linkedHashMap;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), Integer.valueOf(this.LJLJJI), Integer.valueOf(this.LJLJJL), this.LJLJJLL};
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLJZ() {
        if (!o.LJ(((LinkedHashMap) LLLILZ()).get("has_title"), 1)) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap();
        hashMap.putAll(LLLILZ());
        if (!o.LJ(((LinkedHashMap) LLLILZ()).get("is_title_translatable"), 1)) {
            hashMap.remove("is_title_translated");
        }
        return hashMap;
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLLIL() {
        return C113554cx.LJJJLIIL();
    }

    public C2051383h(int i, int i2, String str, int i3, int i4, int i5) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = i3;
        this.LJLJJI = i4;
        this.LJLJJL = i5;
        this.LJLJJLL = str;
    }
}

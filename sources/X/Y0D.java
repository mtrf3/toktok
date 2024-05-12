package X;

import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y0D extends F9E implements InterfaceC60152Xr {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public final int LJLJJLL;
    public final String LJLJL;
    public final String LJLJLJ;

    @Override // X.InterfaceC54035LIp
    public final boolean LLD() {
        return true;
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLILZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("has_text_sticker", Integer.valueOf(this.LJLIL));
        linkedHashMap.put("text_sticker_cnt", Integer.valueOf(this.LJLILLLLZI));
        linkedHashMap.put("transparent_text_sticker_cnt", Integer.valueOf(this.LJLJI));
        linkedHashMap.put("opaque_text_sticker_cnt", Integer.valueOf(this.LJLJJI));
        linkedHashMap.put("is_text_sticker_translatable", Integer.valueOf(this.LJLJJL));
        linkedHashMap.put("is_text_sticker_translated", Integer.valueOf(this.LJLJJLL));
        linkedHashMap.put("text_sticker_source_lang", this.LJLJL);
        linkedHashMap.put("background_reduced_cnt", this.LJLJLJ);
        return linkedHashMap;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), Integer.valueOf(this.LJLJJI), Integer.valueOf(this.LJLJJL), Integer.valueOf(this.LJLJJLL), this.LJLJL, this.LJLJLJ};
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLJZ() {
        if (!o.LJ(((LinkedHashMap) LLLILZ()).get("has_text_sticker"), 1)) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap();
        hashMap.putAll(LLLILZ());
        if (!o.LJ(((LinkedHashMap) LLLILZ()).get("is_text_sticker_translatable"), 1)) {
            hashMap.remove("is_text_sticker_translated");
        }
        return hashMap;
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLLIL() {
        return C113554cx.LJJJLIIL();
    }

    public Y0D(int i, String str, int i2, int i3, int i4, int i5, String str2, int i6) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = i3;
        this.LJLJJI = i4;
        this.LJLJJL = i5;
        this.LJLJJLL = i6;
        this.LJLJL = str;
        this.LJLJLJ = str2;
    }
}

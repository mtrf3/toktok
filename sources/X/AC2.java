package X;

import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public final class AC2 extends F9E implements InterfaceC60152Xr {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final int LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;

    @Override // X.InterfaceC54035LIp
    public final boolean LLD() {
        return true;
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLILZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_method", this.LJLIL);
        linkedHashMap.put("target_lang", this.LJLILLLLZI);
        linkedHashMap.put("not_translate_langs", this.LJLJI);
        linkedHashMap.put("more_translation_options", Integer.valueOf(this.LJLJJI));
        linkedHashMap.put("translate_sticker_status", this.LJLJJL);
        linkedHashMap.put("translate_title_status", this.LJLJJLL);
        return linkedHashMap;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, Integer.valueOf(this.LJLJJI), this.LJLJJL, this.LJLJJLL};
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLJZ() {
        return LLLILZ();
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLLIL() {
        return C113554cx.LJJJLIIL();
    }

    public AC2(int i, String str, String str2, String str3, String str4, String str5) {
        C43588H8u.LIZLLL(str, "enterMethod", str3, "notTranslateLangs", str4, "translateStickerStatus", str5, "translateTitleStatus");
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = i;
        this.LJLJJL = str4;
        this.LJLJJLL = str5;
    }
}

package X;

import defpackage.q;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E3E implements InterfaceC60152Xr {
    public final Integer LJLIL;
    public final Integer LJLILLLLZI;
    public final Integer LJLJI;
    public final Integer LJLJJI;
    public final String LJLJJL;

    @Override // X.InterfaceC54035LIp
    public final boolean LLD() {
        return true;
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLILZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sticker_translated_size", this.LJLIL);
        linkedHashMap.put("sticker_result", this.LJLILLLLZI);
        linkedHashMap.put("sticker_is_cached", this.LJLJI);
        linkedHashMap.put("sticker_duration", this.LJLJJI);
        linkedHashMap.put("sticker_msg", this.LJLJJL);
        return linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E3E)) {
            return false;
        }
        E3E e3e = (E3E) obj;
        return o.LJ(this.LJLIL, e3e.LJLIL) && o.LJ(this.LJLILLLLZI, e3e.LJLILLLLZI) && o.LJ(this.LJLJI, e3e.LJLJI) && o.LJ(this.LJLJJI, e3e.LJLJJI) && o.LJ(this.LJLJJL, e3e.LJLJJL);
    }

    public final int hashCode() {
        Integer num = this.LJLIL;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.LJLJI;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.LJLJJI;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str = this.LJLJJL;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLJZ() {
        return LLLILZ();
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLLIL() {
        return C113554cx.LJJJLIIL();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PerfStickerTranslationEndParams(translatedSize=");
        LIZ.append(this.LJLIL);
        LIZ.append(", result=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", isCached=");
        LIZ.append(this.LJLJI);
        LIZ.append(", duration=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", failureMsg=");
        return q.LIZIZ(LIZ, this.LJLJJL, ')', LIZ);
    }

    public E3E(String str, Integer num, Integer num2, Integer num3, Integer num4) {
        this.LJLIL = num;
        this.LJLILLLLZI = num2;
        this.LJLJI = num3;
        this.LJLJJI = num4;
        this.LJLJJL = str;
    }
}

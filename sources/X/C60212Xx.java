package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.2Xx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60212Xx implements InterfaceC54035LIp {
    public String LJLIL;
    public java.util.Map<String, ? extends Object> LJLILLLLZI;

    public C60212Xx() {
        this(null);
    }

    @Override // X.InterfaceC54035LIp
    public final boolean LLD() {
        return true;
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLILZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("is_city_name", this.LJLIL);
        return linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60212Xx)) {
            return false;
        }
        C60212Xx c60212Xx = (C60212Xx) obj;
        return o.LJ(this.LJLIL, c60212Xx.LJLIL) && o.LJ(this.LJLILLLLZI, c60212Xx.LJLILLLLZI);
    }

    public final int hashCode() {
        String str = this.LJLIL;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.util.Map<String, ? extends Object> map = this.LJLILLLLZI;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLLIL() {
        java.util.Map<String, ? extends Object> map = this.LJLILLLLZI;
        if (map == null) {
            return C113554cx.LJJJLIIL();
        }
        return map;
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLJZ() {
        return LLLILZ();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NearbyHomePageMobParamGroup(isCityName=");
        LIZ.append(this.LJLIL);
        LIZ.append(", map=");
        return C15890jp.LIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    public C60212Xx(Object obj) {
        this.LJLIL = null;
        this.LJLILLLLZI = null;
    }
}

package X;

import java.util.LinkedHashMap;

/* renamed from: X.2Xk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60082Xk extends F9E implements InterfaceC60152Xr {
    public final int LJLIL;
    public final int LJLILLLLZI;

    @Override // X.InterfaceC54035LIp
    public final boolean LLD() {
        return true;
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLILZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("result_code", Integer.valueOf(this.LJLIL));
        linkedHashMap.put("duration", Integer.valueOf(this.LJLILLLLZI));
        return linkedHashMap;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI)};
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLJZ() {
        return LLLILZ();
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLLIL() {
        return C113554cx.LJJJLIIL();
    }

    public C60082Xk(int i, int i2) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
    }
}
package X;

import java.util.LinkedHashMap;

/* renamed from: X.2Xf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60032Xf extends F9E implements InterfaceC60152Xr {
    public final int LJLIL;

    @Override // X.InterfaceC54035LIp
    public final boolean LLD() {
        return true;
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLILZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("duration", Integer.valueOf(this.LJLIL));
        return linkedHashMap;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL)};
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLJZ() {
        return LLLILZ();
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLLIL() {
        return C113554cx.LJJJLIIL();
    }

    public C60032Xf(int i) {
        this.LJLIL = i;
    }
}

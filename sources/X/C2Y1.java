package X;

import java.util.LinkedHashMap;

/* renamed from: X.2Y1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2Y1 extends F9E implements InterfaceC60152Xr {
    public final int LJLIL;

    @Override // X.InterfaceC54035LIp
    public final boolean LLD() {
        return true;
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLILZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("is_from_subtitle", Integer.valueOf(this.LJLIL));
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

    public C2Y1(int i) {
        this.LJLIL = i;
    }
}

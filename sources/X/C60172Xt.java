package X;

import java.util.LinkedHashMap;

/* renamed from: X.2Xt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60172Xt extends F9E implements InterfaceC54035LIp {
    public final int LJLIL;

    public C60172Xt() {
        this(0);
    }

    @Override // X.InterfaceC54035LIp
    public final boolean LLD() {
        return true;
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLILZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("danmaku_length", Integer.valueOf(this.LJLIL));
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

    public C60172Xt(int i) {
        this.LJLIL = i;
    }
}

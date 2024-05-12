package X;

import java.util.LinkedHashMap;

/* renamed from: X.2Xz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60232Xz extends F9E implements InterfaceC60152Xr {
    public final double LJLIL;
    public final int LJLILLLLZI;

    @Override // X.InterfaceC54035LIp
    public final boolean LLD() {
        return true;
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLILZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("launch_volume_pct", Double.valueOf(this.LJLIL));
        linkedHashMap.put("is_landscape_screen", Integer.valueOf(this.LJLILLLLZI));
        return linkedHashMap;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Double.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI)};
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLJZ() {
        return LLLILZ();
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLLIL() {
        return C113554cx.LJJJLIIL();
    }

    public C60232Xz(double d, int i) {
        this.LJLIL = d;
        this.LJLILLLLZI = i;
    }
}

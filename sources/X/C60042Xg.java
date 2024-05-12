package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.2Xg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60042Xg extends F9E implements InterfaceC60152Xr {
    public final String LJLIL;

    @Override // X.InterfaceC54035LIp
    public final boolean LLD() {
        return true;
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLILZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_method", this.LJLIL);
        return linkedHashMap;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLJZ() {
        return LLLILZ();
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLLIL() {
        return C113554cx.LJJJLIIL();
    }

    public C60042Xg(String enterMethodEnum) {
        o.LJIIIZ(enterMethodEnum, "enterMethodEnum");
        this.LJLIL = enterMethodEnum;
    }
}

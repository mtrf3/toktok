package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ELH extends F9E implements InterfaceC60152Xr {
    public final String LJLIL;
    public final String LJLILLLLZI;

    @Override // X.InterfaceC54035LIp
    public final boolean LLD() {
        return true;
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLILZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("target_language", this.LJLIL);
        linkedHashMap.put("trigger_method", this.LJLILLLLZI);
        return linkedHashMap;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLJZ() {
        return LLLILZ();
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLLIL() {
        return C113554cx.LJJJLIIL();
    }

    public ELH(String targetLang, String triggerMethod) {
        o.LJIIIZ(targetLang, "targetLang");
        o.LJIIIZ(triggerMethod, "triggerMethod");
        this.LJLIL = targetLang;
        this.LJLILLLLZI = triggerMethod;
    }
}

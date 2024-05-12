package X;

import java.util.HashMap;

/* renamed from: X.27u, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C534227u extends AbstractC44281oW {
    @Override // X.AbstractC44281oW
    public final String LJIIIIZZ() {
        return "pipoAppInfo";
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final EnumC38005Evp getAccess() {
        return EnumC38005Evp.PUBLIC;
    }

    @Override // X.AbstractC44281oW, X.InterfaceC37774Es6
    public final void LIZJ(InterfaceC78280Uns interfaceC78280Uns, InterfaceC31943CgF interfaceC31943CgF, EnumC37847EtH enumC37847EtH) {
        super.LIZJ(interfaceC78280Uns, interfaceC31943CgF, enumC37847EtH);
        HashMap hashMap = new HashMap();
        hashMap.put("aid", 2112);
        hashMap.put("appVersion", "1.0.0-rc.51.1-bugfix");
        interfaceC31943CgF.LIZ(hashMap);
    }
}

package X;

import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: X.27o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C533627o extends AbstractC44281oW {
    @Override // X.AbstractC44281oW
    public final String LJIIIIZZ() {
        return "pipo.encryptString";
    }

    @Override // X.AbstractC44281oW, X.InterfaceC37774Es6
    public final void LIZJ(InterfaceC78280Uns interfaceC78280Uns, InterfaceC31943CgF interfaceC31943CgF, EnumC37847EtH enumC37847EtH) {
        super.LIZJ(interfaceC78280Uns, interfaceC31943CgF, enumC37847EtH);
        String string = interfaceC78280Uns.getString("key");
        String string2 = interfaceC78280Uns.getString("origin_str");
        if (TextUtils.isEmpty(string)) {
            C04490Fp.LIZLLL("pipo.encryptString", "key is null!", interfaceC31943CgF);
            return;
        }
        if (TextUtils.isEmpty(string2)) {
            C04490Fp.LIZLLL("pipo.encryptString", "origin_str is null!", interfaceC31943CgF);
            return;
        }
        C0TI LIZ = C0TJ.LIZ(string, string2);
        if (!LIZ.LIZ) {
            C04490Fp.LIZLLL("pipo.encryptString", LIZ.LIZIZ, interfaceC31943CgF);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("result", LIZ.LIZIZ);
        C04490Fp.LIZJ("pipo.encryptString", hashMap, interfaceC31943CgF);
    }
}

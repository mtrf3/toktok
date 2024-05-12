package X;

import android.text.TextUtils;

/* renamed from: X.27p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C533727p extends AbstractC44281oW {
    @Override // X.AbstractC44281oW
    public final String LJIIIIZZ() {
        return "pipo.executeRiskJS";
    }

    @Override // X.AbstractC44281oW, X.InterfaceC37774Es6
    public final void LIZJ(InterfaceC78280Uns interfaceC78280Uns, InterfaceC31943CgF interfaceC31943CgF, EnumC37847EtH enumC37847EtH) {
        String str;
        super.LIZJ(interfaceC78280Uns, interfaceC31943CgF, enumC37847EtH);
        if (interfaceC78280Uns.hasKey("session_id")) {
            str = interfaceC78280Uns.getString("session_id");
        } else {
            str = "";
        }
        if (interfaceC78280Uns.hasKey("merchant_id")) {
            interfaceC78280Uns.getString("merchant_id");
        }
        if (interfaceC78280Uns.hasKey("org_id")) {
            interfaceC78280Uns.getString("org_id");
        }
        if (TextUtils.isEmpty(str)) {
            C04490Fp.LIZLLL("pipo.executeRiskJS", "sessionId is null!", interfaceC31943CgF);
            return;
        }
        try {
            C276216o c276216o = C276216o.LJIIL;
            if (c276216o.LJII == null) {
                synchronized (c276216o) {
                    if (c276216o.LJII == null) {
                        c276216o.LJII = new C0TF(c276216o.LIZ.LIZ);
                    }
                }
            }
            String LIZ = c276216o.LJII.LIZ(str);
            if (TextUtils.equals(LIZ, "success")) {
                C04490Fp.LIZJ("pipo.executeRiskJS", "success", interfaceC31943CgF);
            } else {
                C04490Fp.LIZLLL("pipo.executeRiskJS", LIZ, interfaceC31943CgF);
            }
        } catch (Throwable th) {
            C04490Fp.LIZLLL("pipo.executeRiskJS", th.getMessage(), interfaceC31943CgF);
        }
    }
}

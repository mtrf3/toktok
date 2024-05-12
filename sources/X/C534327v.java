package X;

import android.text.TextUtils;

/* renamed from: X.27v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C534327v extends AbstractC44281oW {
    @Override // X.AbstractC44281oW
    public final String LJIIIIZZ() {
        return "pipo.getStarlingData";
    }

    @Override // X.AbstractC44281oW, X.InterfaceC37774Es6
    public final void LIZJ(InterfaceC78280Uns interfaceC78280Uns, InterfaceC31943CgF interfaceC31943CgF, EnumC37847EtH enumC37847EtH) {
        super.LIZJ(interfaceC78280Uns, interfaceC31943CgF, enumC37847EtH);
        String string = interfaceC78280Uns.getString("language");
        String string2 = interfaceC78280Uns.getString("url");
        if (TextUtils.isEmpty(string)) {
            C04490Fp.LIZLLL("pipo.getStarlingData", "language is null!", interfaceC31943CgF);
        } else {
            if (TextUtils.isEmpty(string2)) {
                C04490Fp.LIZLLL("pipo.getStarlingData", "url is null!", interfaceC31943CgF);
                return;
            }
            ((C31041Js) C276216o.LJIIL.LJ()).LIZ(string, new C37611dl(this, interfaceC31943CgF), string2);
        }
    }
}

package X;

import java.util.HashMap;

/* renamed from: X.27t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C534127t extends AbstractC44281oW {
    @Override // X.AbstractC44281oW
    public final String LJIIIIZZ() {
        return "pipo.openWebView";
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.1Jt] */
    @Override // X.AbstractC44281oW, X.InterfaceC37774Es6
    public final void LIZJ(InterfaceC78280Uns interfaceC78280Uns, InterfaceC31943CgF interfaceC31943CgF, EnumC37847EtH enumC37847EtH) {
        String str;
        super.LIZJ(interfaceC78280Uns, interfaceC31943CgF, enumC37847EtH);
        if (interfaceC78280Uns.hasKey("url")) {
            str = interfaceC78280Uns.getString("url");
        } else {
            str = "";
        }
        interfaceC31943CgF.LIZ(new HashMap());
        C276216o c276216o = C276216o.LJIIL;
        if (c276216o.LJIIIIZZ == null) {
            synchronized (c276216o) {
                if (c276216o.LJIIIIZZ == null) {
                    c276216o.LJIIIIZZ = new C0RF(c276216o.LIZ.LJIILJJIL) { // from class: X.1Jt
                        public final C0RF LIZ;

                        {
                            this.LIZ = r1;
                        }

                        @Override // X.C0RF
                        public final void LIZ(String str2) {
                            C1JX.LJIIIIZZ("openWebView url:", str2);
                            C0RF c0rf = this.LIZ;
                            if (c0rf != null) {
                                c0rf.LIZ(str2);
                            }
                        }
                    };
                }
            }
        }
        c276216o.LJIIIIZZ.LIZ(str);
        interfaceC31943CgF.LIZ(null);
    }
}

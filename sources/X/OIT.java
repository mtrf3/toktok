package X;

import com.google.android.play.core.appupdate.u;
import com.ss.android.agilelogger.ALog;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public abstract class OIT extends AbstractC37780EsC {
    public final EnumC38005Evp LIZIZ = EnumC38005Evp.PROTECT;

    @Override // X.InterfaceC37774Es6
    public final String getName() {
        return "x.reportALog";
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<OIS> LIZ() {
        return OIS.class;
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<C61335O5j> LIZLLL() {
        return C61335O5j.class;
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final EnumC38005Evp getAccess() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC37774Es6
    public final void LIZJ(InterfaceC78280Uns params, InterfaceC31943CgF interfaceC31943CgF, EnumC37847EtH type) {
        boolean z;
        String str;
        String str2;
        int i;
        String str3;
        String str4;
        o.LJIIJ(params, "params");
        o.LJIIJ(type, "type");
        String LJJIJIL = u.LJJIJIL(params, "message", "");
        int i2 = 0;
        if (LJJIJIL.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String LJJIJIL2 = u.LJJIJIL(params, "level", EnumC61033NxN.INFO.name());
            try {
                Locale locale = Locale.US;
                o.LJFF(locale, "Locale.US");
                if (LJJIJIL2 != null) {
                    String upperCase = LJJIJIL2.toUpperCase(locale);
                    o.LJFF(upperCase, "(this as java.lang.String).toUpperCase(locale)");
                    EnumC61033NxN.valueOf(upperCase);
                    String LJJIJIL3 = u.LJJIJIL(params, "tag", "unknown");
                    InterfaceC78280Uns LJJIJIIJIL = u.LJJIJIIJIL(params, "codePosition");
                    if (LJJIJIIJIL == null) {
                        str = "";
                        str2 = "";
                        i = 0;
                    } else {
                        i = u.LJJIJIIJI(LJJIJIIJIL, "line", 0);
                        str2 = u.LJJIJIL(LJJIJIIJIL, "function", "");
                        str = u.LJJIJIL(LJJIJIIJIL, "file", "");
                    }
                    OIV oiv = new OIV(str, str2, i);
                    OIS ois = new OIS();
                    ois.LIZ = LJJIJIL2;
                    ois.LIZIZ = LJJIJIL;
                    o.LJIIJ(LJJIJIL3, "<set-?>");
                    ois.LIZJ = LJJIJIL3;
                    ois.LIZLLL = oiv;
                    OIU oiu = new OIU(this, interfaceC31943CgF);
                    String str5 = ois.LIZIZ;
                    if (str5 != null) {
                        String str6 = ois.LIZJ;
                        if (str6 != null) {
                            String str7 = ois.LIZ;
                            if (str7 != null) {
                                OIV oiv2 = ois.LIZLLL;
                                if (oiv2 == null) {
                                    str3 = "";
                                    str4 = "";
                                } else {
                                    i2 = oiv2.LIZJ;
                                    str4 = oiv2.LIZIZ;
                                    str3 = oiv2.LIZ;
                                }
                                try {
                                    C36781Ec5.LIZ(i2, str5, str6, str7, str3, str4);
                                    oiu.LIZIZ(new C61335O5j(), "");
                                    return;
                                } catch (IllegalArgumentException e) {
                                    ALog.w("XReportALogMethod", e);
                                    oiu.LIZ();
                                    return;
                                }
                            }
                            o.LJIJI("level");
                            throw null;
                        }
                        o.LJIJI("tag");
                        throw null;
                    }
                    o.LJIJI("message");
                    throw null;
                }
                throw new C37692Eqm("null cannot be cast to non-null type java.lang.String");
            } catch (Exception unused) {
            }
        }
        AbstractC37780EsC.LJFF(this, interfaceC31943CgF, -3, null, 12);
    }
}

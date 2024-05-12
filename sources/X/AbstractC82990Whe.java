package X;

import android.content.Context;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend;
import com.google.android.play.core.appupdate.u;
import java.util.Date;
import kotlin.jvm.internal.o;

/* renamed from: X.Whe, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC82990Whe extends AbstractC37780EsC {
    public final EnumC38005Evp LIZIZ = EnumC38005Evp.PRIVATE;

    @Override // X.InterfaceC37774Es6
    public final String getName() {
        return "x.setStorageItem";
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<C82992Whg> LIZ() {
        return C82992Whg.class;
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
        InterfaceC78505UrV interfaceC78505UrV;
        Double d;
        C82992Whg c82992Whg;
        IHostContextDepend iHostContextDepend;
        boolean LIZ;
        o.LJIIJ(params, "params");
        o.LJIIJ(type, "type");
        String LJJIJIL = u.LJJIJIL(params, "key", "");
        if (LJJIJIL.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || params.isNull("data") || (interfaceC78505UrV = params.get("data")) == null) {
            c82992Whg = null;
        } else {
            String LJJIJIL2 = u.LJJIJIL(params, "biz", "");
            if (!params.isNull("validDuration")) {
                d = Double.valueOf(params.getDouble("validDuration"));
            } else {
                d = null;
            }
            c82992Whg = new C82992Whg();
            c82992Whg.LIZ = LJJIJIL;
            c82992Whg.LIZIZ = interfaceC78505UrV;
            c82992Whg.LIZJ = LJJIJIL2;
            c82992Whg.LIZLLL = d;
        }
        if (c82992Whg == null) {
            AbstractC37780EsC.LJFF(this, interfaceC31943CgF, -3, null, 12);
            return;
        }
        C82991Whf c82991Whf = new C82991Whf(this, interfaceC31943CgF);
        Context context = (Context) LJII(Context.class);
        if (context == null) {
            C86291Xtn c86291Xtn = C86291Xtn.LJIIL;
            if (c86291Xtn != null && (iHostContextDepend = c86291Xtn.LJ) != null) {
                context = iHostContextDepend.getApplication();
            } else {
                context = null;
            }
        }
        if (context != null) {
            String str = c82992Whg.LIZ;
            if (str != null) {
                InterfaceC78505UrV interfaceC78505UrV2 = c82992Whg.LIZIZ;
                if (interfaceC78505UrV2 != null) {
                    String str2 = c82992Whg.LIZJ;
                    Double d2 = c82992Whg.LIZLLL;
                    switch (C78509UrZ.LIZ[interfaceC78505UrV2.getType().ordinal()]) {
                        case 1:
                            LIZ = C78524Uro.LIZ(context).LIZ(str2, Boolean.valueOf(interfaceC78505UrV2.asBoolean()), str);
                            break;
                        case 2:
                            LIZ = C78524Uro.LIZ(context).LIZ(str2, Integer.valueOf(interfaceC78505UrV2.asInt()), str);
                            break;
                        case 3:
                            LIZ = C78524Uro.LIZ(context).LIZ(str2, interfaceC78505UrV2.asString(), str);
                            break;
                        case 4:
                            LIZ = C78524Uro.LIZ(context).LIZ(str2, Double.valueOf(interfaceC78505UrV2.asDouble()), str);
                            break;
                        case 5:
                            LIZ = C78524Uro.LIZ(context).LIZ(str2, interfaceC78505UrV2.asArray(), str);
                            break;
                        case 6:
                            LIZ = C78524Uro.LIZ(context).LIZ(str2, interfaceC78505UrV2.asMap(), str);
                            break;
                        default:
                            AbstractC37780EsC.LJFF(c82991Whf.LIZ, c82991Whf.LIZIZ, -3, "Illegal value type", 8);
                            return;
                    }
                    if (LIZ) {
                        if (d2 != null) {
                            try {
                                InterfaceC32666Cru LIZ2 = C78524Uro.LIZ(context);
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append(str);
                                LIZ3.append("_TIME");
                                if (LIZ2.LIZ(str2, String.valueOf(new Date(System.currentTimeMillis() + ((long) (1000 * d2.doubleValue()))).getTime()), X1D.LIZIZ(LIZ3))) {
                                }
                            } catch (Exception e) {
                                e.getMessage();
                                C82978WhS.LIZ(context, str2, str);
                            }
                        }
                        c82991Whf.LIZ(new C61335O5j(), "");
                        return;
                    }
                    AbstractC37780EsC.LJFF(c82991Whf.LIZ, c82991Whf.LIZIZ, -3, "Illegal value type", 8);
                    return;
                }
                o.LJIJI("data");
                throw null;
            }
            o.LJIJI("key");
            throw null;
        }
        AbstractC37780EsC.LJFF(this, interfaceC31943CgF, 0, "Context not provided in host", 8);
    }
}

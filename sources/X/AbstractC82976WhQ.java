package X;

import android.content.Context;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.google.android.play.core.appupdate.u;
import java.util.Date;
import kotlin.jvm.internal.o;

/* renamed from: X.WhQ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC82976WhQ extends AbstractC37780EsC {
    public final EnumC38005Evp LIZIZ = EnumC38005Evp.PRIVATE;

    @Override // X.InterfaceC37774Es6
    public final String getName() {
        return "x.getStorageItem";
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<C82977WhR> LIZ() {
        return C82977WhR.class;
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<C79504VIe> LIZLLL() {
        return C79504VIe.class;
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final EnumC38005Evp getAccess() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC37774Es6
    public final void LIZJ(InterfaceC78280Uns params, InterfaceC31943CgF interfaceC31943CgF, EnumC37847EtH type) {
        boolean z;
        IHostContextDepend iHostContextDepend;
        String str;
        o.LJIIJ(params, "params");
        o.LJIIJ(type, "type");
        String LJJIJIL = u.LJJIJIL(params, "key", "");
        if (LJJIJIL.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        Object obj = null;
        if (z) {
            AbstractC37780EsC.LJFF(this, interfaceC31943CgF, -3, null, 12);
            return;
        }
        String LJJIJIL2 = u.LJJIJIL(params, "biz", "");
        C82977WhR c82977WhR = new C82977WhR();
        c82977WhR.LIZ = LJJIJIL;
        c82977WhR.LIZIZ = LJJIJIL2;
        C82975WhP c82975WhP = new C82975WhP(this, interfaceC31943CgF);
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
            String str2 = c82977WhR.LIZ;
            if (str2 != null) {
                String str3 = c82977WhR.LIZIZ;
                try {
                    Object LJIIIZ = C78524Uro.LIZ(context).LJIIIZ(str3, str2);
                    InterfaceC32666Cru LIZ = C78524Uro.LIZ(context);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(str2);
                    LIZ2.append("_TIME");
                    Object LJIIIZ2 = LIZ.LJIIIZ(str3, X1D.LIZIZ(LIZ2));
                    if ((LJIIIZ2 instanceof String) && (str = (String) LJIIIZ2) != null) {
                        if (!new Date().before(new Date(CastLongProtector.parseLong(str)))) {
                            C82978WhS.LIZ(context, str3, str2);
                            C79504VIe c79504VIe = new C79504VIe();
                            c79504VIe.LIZ = obj;
                            c82975WhP.LIZ(c79504VIe, "");
                            return;
                        }
                    }
                    obj = LJIIIZ;
                    C79504VIe c79504VIe2 = new C79504VIe();
                    c79504VIe2.LIZ = obj;
                    c82975WhP.LIZ(c79504VIe2, "");
                    return;
                } catch (Exception e) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("failed to properly getStorageItem with exception ");
                    LIZ3.append(e);
                    String msg = X1D.LIZIZ(LIZ3);
                    o.LJIIJ(msg, "msg");
                    AbstractC37780EsC.LJFF(c82975WhP.LIZ, c82975WhP.LIZIZ, 0, msg, 8);
                    return;
                }
            }
            o.LJIJI("key");
            throw null;
        }
        AbstractC37780EsC.LJFF(this, interfaceC31943CgF, 0, "Context not provided in host", 8);
    }
}

package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend;
import com.google.android.play.core.appupdate.u;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Wid, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC83051Wid extends AbstractC37780EsC {
    public final EnumC38005Evp LIZIZ = EnumC38005Evp.PRIVATE;
    public final String LIZJ = "x.logout";

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<C83053Wif> LIZ() {
        return C83053Wif.class;
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<C79506VIg> LIZLLL() {
        return C79506VIg.class;
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final EnumC38005Evp getAccess() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC37774Es6
    public final String getName() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC37774Es6
    public final void LIZJ(InterfaceC78280Uns params, InterfaceC31943CgF interfaceC31943CgF, EnumC37847EtH type) {
        C86291Xtn c86291Xtn;
        IHostUserDepend iHostUserDepend;
        o.LJIIJ(params, "params");
        o.LJIIJ(type, "type");
        InterfaceC78280Uns LJJIJIIJIL = u.LJJIJIIJIL(params, "context");
        C83053Wif c83053Wif = new C83053Wif();
        if (LJJIJIIJIL != null) {
            c83053Wif.LIZ = LJJIJIIJIL;
        }
        C83052Wie c83052Wie = new C83052Wie(this, interfaceC31943CgF);
        Context context = (Context) LJII(Context.class);
        if (context != null) {
            Activity LIZ = HT4.LIZ(context);
            if (LIZ != null) {
                C86291Xtn c86291Xtn2 = (C86291Xtn) LJII(C86291Xtn.class);
                if ((c86291Xtn2 != null && (iHostUserDepend = c86291Xtn2.LJII) != null) || ((c86291Xtn = C86291Xtn.LJIIL) != null && (iHostUserDepend = c86291Xtn.LJII) != null)) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    InterfaceC78280Uns interfaceC78280Uns = c83053Wif.LIZ;
                    if (interfaceC78280Uns != null) {
                        UFL LIZ2 = interfaceC78280Uns.LIZ();
                        while (LIZ2.hasNextKey()) {
                            String nextKey = LIZ2.nextKey();
                            InterfaceC78505UrV interfaceC78505UrV = interfaceC78280Uns.get(nextKey);
                            int i = C77896Uhg.LIZ[interfaceC78505UrV.getType().ordinal()];
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        if (i == 4) {
                                            linkedHashMap.put(nextKey, String.valueOf(interfaceC78505UrV.asBoolean()));
                                        }
                                    } else {
                                        linkedHashMap.put(nextKey, interfaceC78505UrV.asString());
                                    }
                                } else {
                                    linkedHashMap.put(nextKey, String.valueOf(interfaceC78505UrV.asDouble()));
                                }
                            } else {
                                linkedHashMap.put(nextKey, String.valueOf(interfaceC78505UrV.asInt()));
                            }
                        }
                    }
                    iHostUserDepend.logout(LIZ, new C83054Wig(c83052Wie), linkedHashMap);
                    return;
                }
                c83052Wie.LIZIZ("hostUserDepend is null");
                return;
            }
            c83052Wie.LIZIZ("context can not convert to activity");
            return;
        }
        c83052Wie.LIZIZ("context is null");
    }
}

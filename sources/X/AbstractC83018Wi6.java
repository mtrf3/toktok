package X;

import com.bytedance.ies.xbridge.base.runtime.depend.IHostLogDepend;
import com.google.android.play.core.appupdate.u;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Wi6, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC83018Wi6 extends AbstractC37780EsC {
    public final EnumC38005Evp LIZIZ = EnumC38005Evp.PUBLIC;

    @Override // X.InterfaceC37774Es6
    public final String getName() {
        return "x.reportAppLog";
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<C83020Wi8> LIZ() {
        return C83020Wi8.class;
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
        C86291Xtn c86291Xtn;
        IHostLogDepend iHostLogDepend;
        UFL LIZ;
        o.LJIIJ(params, "params");
        o.LJIIJ(type, "type");
        String LJJIJIL = u.LJJIJIL(params, "eventName", "");
        if (LJJIJIL.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            AbstractC37780EsC.LJFF(this, interfaceC31943CgF, -3, null, 12);
            return;
        }
        InterfaceC78280Uns LJJIJIIJIL = u.LJJIJIIJIL(params, "params");
        C83020Wi8 c83020Wi8 = new C83020Wi8();
        c83020Wi8.LIZ = LJJIJIL;
        if (LJJIJIIJIL != null) {
            c83020Wi8.LIZIZ = LJJIJIIJIL;
        }
        C83019Wi7 c83019Wi7 = new C83019Wi7(this, interfaceC31943CgF);
        String str = c83020Wi8.LIZ;
        if (str != null) {
            InterfaceC78280Uns interfaceC78280Uns = c83020Wi8.LIZIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (interfaceC78280Uns != null && (LIZ = interfaceC78280Uns.LIZ()) != null) {
                while (LIZ.hasNextKey()) {
                    String nextKey = LIZ.nextKey();
                    InterfaceC78505UrV interfaceC78505UrV = interfaceC78280Uns.get(nextKey);
                    switch (C78508UrY.LIZ[interfaceC78505UrV.getType().ordinal()]) {
                        case 1:
                            linkedHashMap.put(nextKey, String.valueOf(interfaceC78505UrV.asBoolean()));
                            break;
                        case 2:
                            linkedHashMap.put(nextKey, String.valueOf(interfaceC78505UrV.asInt()));
                            break;
                        case 3:
                            linkedHashMap.put(nextKey, String.valueOf(interfaceC78505UrV.asDouble()));
                            break;
                        case 4:
                            linkedHashMap.put(nextKey, interfaceC78505UrV.asString());
                            break;
                        case 5:
                            InterfaceC78280Uns asMap = interfaceC78505UrV.asMap();
                            if (asMap == null) {
                                break;
                            } else {
                                String jSONObject = C78501UrR.LIZIZ(asMap).toString();
                                o.LJFF(jSONObject, "XReadableJSONUtils.xRead…JSONObject(it).toString()");
                                linkedHashMap.put(nextKey, jSONObject);
                                break;
                            }
                        case 6:
                            InterfaceC78502UrS asArray = interfaceC78505UrV.asArray();
                            if (asArray == null) {
                                break;
                            } else {
                                String jSONArray = C78501UrR.LIZ(asArray).toString();
                                o.LJFF(jSONArray, "XReadableJSONUtils.xRead…oJSONArray(it).toString()");
                                linkedHashMap.put(nextKey, jSONArray);
                                break;
                            }
                    }
                }
            }
            C86291Xtn c86291Xtn2 = (C86291Xtn) LJII(C86291Xtn.class);
            if ((c86291Xtn2 != null && (iHostLogDepend = c86291Xtn2.LIZIZ) != null) || ((c86291Xtn = C86291Xtn.LJIIL) != null && (iHostLogDepend = c86291Xtn.LIZIZ) != null)) {
                iHostLogDepend.onEventV3Map(str, linkedHashMap);
            }
            c83019Wi7.LIZ(new C61335O5j(), "");
            return;
        }
        o.LJIJI("eventName");
        throw null;
    }
}

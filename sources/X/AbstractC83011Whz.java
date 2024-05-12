package X;

import android.content.Context;
import com.bytedance.frameworks.baselib.network.http.cronet.websocket.IWsClient;
import com.google.android.play.core.appupdate.u;
import java.util.HashMap;
import java.util.UUID;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Whz, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC83011Whz extends AbstractC37780EsC {
    @Override // X.InterfaceC37774Es6
    public final String getName() {
        return "x.connectSocket";
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<C83013Wi1> LIZ() {
        return C83013Wi1.class;
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<C83014Wi2> LIZLLL() {
        return C83014Wi2.class;
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final EnumC38005Evp getAccess() {
        return EnumC38005Evp.PROTECT;
    }

    @Override // X.InterfaceC37774Es6
    public final void LIZJ(InterfaceC78280Uns params, InterfaceC31943CgF interfaceC31943CgF, EnumC37847EtH type) {
        boolean z;
        String containerID;
        JSONObject jSONObject;
        o.LJIIJ(params, "params");
        o.LJIIJ(type, "type");
        String LJJIJIL = u.LJJIJIL(params, "url", "");
        if (LJJIJIL.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        JSONArray jSONArray = null;
        if (z) {
            AbstractC37780EsC.LJFF(this, interfaceC31943CgF, -3, null, 12);
            return;
        }
        InterfaceC78280Uns LJJIJIIJIL = u.LJJIJIIJIL(params, "header");
        InterfaceC78502UrS LJJIIZ = u.LJJIIZ(params, "protocols", null);
        C83013Wi1 c83013Wi1 = new C83013Wi1();
        c83013Wi1.LIZ = LJJIJIL;
        c83013Wi1.LIZIZ = LJJIJIIJIL;
        c83013Wi1.LIZJ = LJJIIZ;
        C83012Wi0 c83012Wi0 = new C83012Wi0(this, interfaceC31943CgF);
        Context context = (Context) LJII(Context.class);
        if (context != null) {
            InterfaceC37790EsM interfaceC37790EsM = (InterfaceC37790EsM) LJII(InterfaceC37790EsM.class);
            if (interfaceC37790EsM == null || (containerID = interfaceC37790EsM.LIZ()) == null || containerID.length() == 0) {
                c83012Wi0.LIZ("ContainerID not provided in host");
                return;
            }
            InterfaceC40311Frv interfaceC40311Frv = (InterfaceC40311Frv) LJII(InterfaceC40311Frv.class);
            if (interfaceC40311Frv != null) {
                String str = c83013Wi1.LIZ;
                if (str != null) {
                    InterfaceC78280Uns interfaceC78280Uns = c83013Wi1.LIZIZ;
                    if (interfaceC78280Uns != null) {
                        jSONObject = C78501UrR.LIZIZ(interfaceC78280Uns);
                    } else {
                        jSONObject = null;
                    }
                    InterfaceC78502UrS interfaceC78502UrS = c83013Wi1.LIZJ;
                    if (interfaceC78502UrS != null) {
                        jSONArray = C78501UrR.LIZ(interfaceC78502UrS);
                    }
                    C46590IQg c46590IQg = new C46590IQg(str, jSONArray, jSONObject);
                    C83006Whu c83006Whu = new C83006Whu(interfaceC40311Frv);
                    o.LJIIJ(containerID, "containerID");
                    C79453VGf c79453VGf = (C79453VGf) C79453VGf.LIZIZ.getValue();
                    c79453VGf.getClass();
                    C66691QFj c66691QFj = new C66691QFj(context, c46590IQg);
                    try {
                        IWsClient LIZ = C66689QFh.LIZ(new C66692QFk(c66691QFj));
                        if (LIZ != null) {
                            c66691QFj.LJFF = new C44378HbK(LIZ);
                            String uuid = UUID.randomUUID().toString();
                            o.LJFF(uuid, "UUID.randomUUID().toString()");
                            c66691QFj.LIZ = new C83007Whv(c79453VGf, containerID, uuid, c83006Whu);
                            HashMap<String, HashMap<String, ? super InterfaceC79523VIx>> hashMap = C79453VGf.LIZ;
                            synchronized (hashMap) {
                                if (hashMap.containsKey(containerID)) {
                                    HashMap<String, ? super InterfaceC79523VIx> hashMap2 = hashMap.get(containerID);
                                    if (hashMap2 != null) {
                                        hashMap2.put(uuid, c66691QFj);
                                    }
                                } else {
                                    HashMap<String, ? super InterfaceC79523VIx> hashMap3 = new HashMap<>();
                                    hashMap3.put(uuid, c66691QFj);
                                    hashMap.put(containerID, hashMap3);
                                }
                            }
                            c66691QFj.LJ();
                            if (uuid != null) {
                                C83014Wi2 c83014Wi2 = new C83014Wi2();
                                c83014Wi2.LIZ = uuid;
                                c83012Wi0.LIZIZ(c83014Wi2, "");
                                return;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                    c83012Wi0.LIZ("can not get the socketTaskID");
                    return;
                }
                o.LJIJI("url");
                throw null;
            }
            c83012Wi0.LIZ("JsEventDelegate not provided in host");
            return;
        }
        c83012Wi0.LIZ("Context not provided in host");
    }
}

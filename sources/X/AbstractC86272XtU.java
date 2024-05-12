package X;

import com.bytedance.ies.xbridge.base.runtime.depend.IHostFrameworkDepend;
import com.google.android.play.core.appupdate.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.XtU, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC86272XtU extends AbstractC37780EsC {
    public final EnumC38005Evp LIZIZ = EnumC38005Evp.PRIVATE;
    public final String LIZJ = "x.batchEvents";

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<C86274XtW> LIZ() {
        return C86274XtW.class;
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
    public final String getName() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC37774Es6
    public final void LIZJ(InterfaceC78280Uns params, InterfaceC31943CgF interfaceC31943CgF, EnumC37847EtH type) {
        C86291Xtn c86291Xtn;
        IHostFrameworkDepend iHostFrameworkDepend;
        C86291Xtn c86291Xtn2;
        java.util.Map map;
        o.LJIIJ(params, "params");
        o.LJIIJ(type, "type");
        InterfaceC78502UrS LJJIIZ = u.LJJIIZ(params, "actionList", null);
        if (LJJIIZ != null) {
            String LJJIJIL = u.LJJIJIL(params, "actionType", "");
            C86274XtW c86274XtW = new C86274XtW();
            o.LJIIJ(LJJIJIL, "<set-?>");
            c86274XtW.LIZ = LJJIJIL;
            ArrayList arrayList = new ArrayList();
            int size = LJJIIZ.size();
            for (int i = 0; i < size; i++) {
                InterfaceC78280Uns map2 = LJJIIZ.getMap(i);
                if (map2 != null) {
                    String LJJIJIL2 = u.LJJIJIL(map2, "methodName", "");
                    InterfaceC78280Uns LJJIJIIJIL = u.LJJIJIIJIL(map2, "params");
                    if (LJJIJIIJIL != null) {
                        map = u.LJJIZ(LJJIJIIJIL);
                    } else {
                        map = null;
                    }
                    arrayList.add(new C86275XtX(LJJIJIL2, new JSONObject(map)));
                }
            }
            c86274XtW.LIZIZ = arrayList;
            C86273XtV c86273XtV = new C86273XtV(this, interfaceC31943CgF);
            X7G x7g = (X7G) this;
            String str = c86274XtW.LIZ;
            if (str != null) {
                List<C86275XtX> list = c86274XtW.LIZIZ;
                for (X7F x7f : X7F.values()) {
                    if (o.LJ(x7f.getActionType(), str)) {
                        if (list == null || ((ArrayList) list).isEmpty()) {
                            c86273XtV.LIZ(x7g.LIZLLL);
                            return;
                        }
                        ArrayList arrayList2 = (ArrayList) list;
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            if (((C86275XtX) it.next()).LIZ.length() == 0) {
                                c86273XtV.LIZ(x7g.LIZLLL);
                                return;
                            }
                        }
                        C31926Cfy c31926Cfy = x7g.LIZ;
                        if ((c31926Cfy != null && (c86291Xtn2 = (C86291Xtn) c31926Cfy.LIZ(C86291Xtn.class)) != null && (iHostFrameworkDepend = c86291Xtn2.LIZ) != null) || ((c86291Xtn = C86291Xtn.LJIIL) != null && (iHostFrameworkDepend = c86291Xtn.LIZ) != null)) {
                            C31926Cfy c31926Cfy2 = x7g.LIZ;
                            ArrayList arrayList3 = new ArrayList(C32I.LJJL(arrayList2, 10));
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                arrayList3.add(((C86275XtX) it2.next()).LIZ);
                            }
                            ArrayList arrayList4 = new ArrayList(C32I.LJJL(arrayList2, 10));
                            Iterator it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                arrayList4.add(((C86275XtX) it3.next()).LIZIZ);
                            }
                            iHostFrameworkDepend.addObserverEvent(c31926Cfy2, str, arrayList3, arrayList4);
                        }
                        c86273XtV.LIZIZ(new C61335O5j(), "");
                        return;
                    }
                }
                c86273XtV.LIZ(x7g.LIZLLL);
                return;
            }
            o.LJIJI("actionType");
            throw null;
        }
        AbstractC37780EsC.LJFF(this, interfaceC31943CgF, -3, null, 12);
    }
}

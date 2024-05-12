package X;

import com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend;
import com.google.android.play.core.appupdate.u;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Fdz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39447Fdz extends AbstractC37780EsC {
    public final EnumC38005Evp LIZIZ = EnumC38005Evp.PROTECT;

    @Override // X.InterfaceC37774Es6
    public final String getName() {
        return "x.getSettings";
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<C39450Fe2> LIZ() {
        return C39450Fe2.class;
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<C39449Fe1> LIZLLL() {
        return C39449Fe1.class;
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final EnumC38005Evp getAccess() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC37774Es6
    public final void LIZJ(InterfaceC78280Uns params, InterfaceC31943CgF interfaceC31943CgF, EnumC37847EtH type) {
        C39450Fe2 c39450Fe2;
        C86291Xtn c86291Xtn;
        IHostContextDepend iHostContextDepend;
        List<FCV> settings;
        o.LJIIJ(params, "params");
        o.LJIIJ(type, "type");
        InterfaceC78502UrS LJJIIZ = u.LJJIIZ(params, "keys", null);
        if (LJJIIZ != null) {
            c39450Fe2 = new C39450Fe2();
            ArrayList arrayList = new ArrayList();
            int size = LJJIIZ.size();
            for (int i = 0; i < size; i++) {
                InterfaceC78280Uns map = LJJIIZ.getMap(i);
                if (map != null) {
                    String LJJIJIL = u.LJJIJIL(map, "key", "");
                    String LJJIJIL2 = u.LJJIJIL(map, "type", "");
                    String LJJIJIL3 = u.LJJIJIL(map, "biz", "");
                    if (LJJIJIL.length() > 0 && LJJIJIL2.length() > 0) {
                        C39451Fe3 c39451Fe3 = new C39451Fe3(LJJIJIL, LJJIJIL2);
                        o.LJIIJ(LJJIJIL3, "<set-?>");
                        c39451Fe3.LIZ = LJJIJIL3;
                        arrayList.add(c39451Fe3);
                    }
                }
            }
            c39450Fe2.LIZ = arrayList;
        } else {
            c39450Fe2 = null;
        }
        if (c39450Fe2 == null) {
            AbstractC37780EsC.LJFF(this, interfaceC31943CgF, -3, null, 12);
            return;
        }
        C39448Fe0 c39448Fe0 = new C39448Fe0(this, interfaceC31943CgF);
        List<C39451Fe3> list = c39450Fe2.LIZ;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (C39451Fe3 c39451Fe32 : list) {
                String str = c39451Fe32.LIZIZ;
                String str2 = c39451Fe32.LIZ;
                FJ7 fj7 = FJ6.Companion;
                String str3 = c39451Fe32.LIZJ;
                fj7.getClass();
                FJ6 LIZ = FJ7.LIZ(str3);
                if (str.length() > 0 && LIZ != FJ6.UNSUPPORTED) {
                    FCU fcu = new FCU(str, LIZ);
                    o.LJIIJ(str2, "<set-?>");
                    fcu.LIZ = str2;
                    arrayList2.add(fcu);
                    linkedHashSet.add(str);
                }
            }
            if (arrayList2.isEmpty()) {
                c39448Fe0.LIZ(-3, "empty key or unsupported key type in params");
                return;
            }
            if (linkedHashSet.size() < arrayList2.size()) {
                c39448Fe0.LIZ(-3, "duplicate keys in params");
                return;
            }
            C86291Xtn c86291Xtn2 = (C86291Xtn) LJII(C86291Xtn.class);
            if (((c86291Xtn2 == null || (iHostContextDepend = c86291Xtn2.LJ) == null) && ((c86291Xtn = C86291Xtn.LJIIL) == null || (iHostContextDepend = c86291Xtn.LJ) == null)) || (settings = iHostContextDepend.getSettings(arrayList2)) == null) {
                c39448Fe0.LIZ(0, "getSettings not implemented in host");
                return;
            }
            C39449Fe1 c39449Fe1 = new C39449Fe1();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (FCV fcv : settings) {
                linkedHashMap.put(fcv.LIZ, fcv.LIZIZ);
            }
            c39449Fe1.LIZ = linkedHashMap;
            c39448Fe0.LIZIZ(c39449Fe1, "");
            return;
        }
        o.LJIJI("keys");
        throw null;
    }
}

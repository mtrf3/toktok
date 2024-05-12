package X;

import android.os.SystemClock;
import com.bytedance.mt.protector.impl.UriProtector;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.jsb.service.PdpLepusBridgeModule;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.AqS192S0100000_10;
import kotlin.jvm.internal.IDqS435S0100000_10;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class O9B implements InterfaceC60061Nhh {
    public boolean LJLIL;
    public String LJLILLLLZI;
    public final List<String> LJLJI = new ArrayList();
    public final ConcurrentHashMap<String, Long> LJLJJI = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Integer, Long> LJLJJL = new ConcurrentHashMap<>();
    public final List<Integer> LJLJJLL = new ArrayList();
    public final ConcurrentHashMap<String, Boolean> LJLJL = new ConcurrentHashMap<>();
    public String LJLJLJ = "";
    public final M1V LJLJLLL;
    public boolean LJLL;

    public final void LIZJ() {
        String biz = this.LJLJLJ;
        o.LJIIIZ(biz, "biz");
        ConcurrentSkipListSet<String> concurrentSkipListSet = O9C.LIZ.get(biz);
        if (concurrentSkipListSet != null) {
            Iterator<String> it = concurrentSkipListSet.iterator();
            while (it.hasNext()) {
                String it2 = it.next();
                C60827Nu3 c60827Nu3 = C58310MuY.LIZIZ;
                o.LJIIIIZZ(it2, "it");
                c60827Nu3.getClass();
                C60827Nu3.LIZ(it2, biz);
            }
        }
        O9C.LIZ.remove(biz);
        O9C.LIZIZ.remove(biz);
        C58310MuY.LIZIZ.getClass();
        C60827Nu3.LJIIL(biz);
        M1V monitor = this.LJLJLLL;
        o.LJIIJ(monitor, "monitor");
        C61269O2v.LIZ.remove(monitor);
        ((ArrayList) this.LJLJI).clear();
        this.LJLJL.clear();
        this.LJLJJI.clear();
        ((ArrayList) this.LJLJJLL).clear();
        this.LJLJJL.clear();
        C26059AKp.LIZ().LIZIZ("ec_page_lynx_show", this);
    }

    public O9B() {
        C61257O2j predicate = C61257O2j.LJLIL;
        AqS192S0100000_10 aqS192S0100000_10 = new AqS192S0100000_10(this, 0);
        o.LJIIIZ(predicate, "predicate");
        this.LJLJLLL = new M1V(predicate, aqS192S0100000_10, null, null);
    }

    public static int LIZ(String str) {
        Integer num;
        int i = -1;
        try {
            String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(str), "scene_data");
            if (queryParameter == null) {
                queryParameter = "{}";
            }
            Object obj = new JSONObject(queryParameter).get("brick_name");
            if (!(obj instanceof Integer) || (num = (Integer) obj) == null) {
                return -1;
            }
            i = num.intValue();
            return i;
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
            return i;
        }
    }

    @Override // X.InterfaceC60061Nhh
    public final void onEvent(String eventName, String str) {
        o.LJIIIZ(eventName, "eventName");
        try {
            JSONObject jSONObject = new JSONObject(str);
            Object obj = jSONObject.get("brick_name");
            o.LJII(obj, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj).intValue();
            Object obj2 = jSONObject.get("product_id");
            o.LJII(obj2, "null cannot be cast to non-null type kotlin.String");
            if (o.LJ((String) obj2, this.LJLILLLLZI) && o.LJ(eventName, "ec_page_lynx_show")) {
                if (!((ArrayList) this.LJLJJLL).contains(Integer.valueOf(intValue))) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    Long l = this.LJLJJL.get(Integer.valueOf(intValue));
                    if (l == null) {
                        l = -1L;
                    }
                    long longValue = l.longValue();
                    ((ArrayList) this.LJLJJLL).add(Integer.valueOf(intValue));
                    C76542zS.LIZJ("rd_tiktokec_pdp_lynx_interaction_dur", new O9E(elapsedRealtime, longValue, intValue));
                }
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final void LIZIZ(InterfaceC71003Rtn interfaceC71003Rtn, OGE service, String productId) {
        o.LJIIIZ(service, "service");
        o.LJIIIZ(productId, "productId");
        if (this.LJLL) {
            return;
        }
        boolean z = true;
        this.LJLL = true;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ec_pdp");
        LIZ.append(interfaceC71003Rtn.hashCode());
        this.LJLJLJ = X1D.LIZIZ(LIZ);
        this.LJLILLLLZI = productId;
        O9V o9v = new O9V(new WeakReference(interfaceC71003Rtn), new WeakReference(service));
        M2M m2m = new M2M();
        if (C235179Kv.LIZ() == null || !(!r1.isEmpty())) {
            z = false;
        }
        m2m.LJIIZILJ = z;
        String biz = this.LJLJLJ;
        o.LJIIIZ(biz, "biz");
        m2m.LJIJ = biz;
        m2m.LJIJI = Integer.MAX_VALUE;
        m2m.LJ = "ec_pdp_lynx";
        m2m.LIZIZ(Boolean.TRUE, "hide_loading");
        m2m.LJFF = new AqS176S0100000_10(this, 0);
        m2m.LJI = new IDqS435S0100000_10(this, 0);
        m2m.LJIIIIZZ = new AqS192S0100000_10(this, 1);
        m2m.LJIILIIL = O9D.LIZIZ(new AqS141S0200000_10(interfaceC71003Rtn, service, 0));
        if (C2SH.LIZ()) {
            m2m.LJIILL.put(O9V.class, new M2G(o9v));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(PdpLepusBridgeModule.NAME, new C39947Fm3(PdpLepusBridgeModule.class, o9v));
            m2m.LJIILJJIL = linkedHashMap;
        }
        ALE ale = new ALE();
        ale.LJIIIZ = m2m.LJIIZILJ;
        String str = m2m.LJIJ;
        o.LJIIJ(str, "<set-?>");
        ale.LIZ = str;
        ale.LJIILIIL = null;
        ale.LJIILJJIL = null;
        ale.LIZIZ(m2m.LJIJJ);
        ale.LJIIJ = m2m.LJIJI;
        String str2 = m2m.LJ;
        TemplateData templateData = m2m.LIZ;
        java.util.Map<Object, Object> map = m2m.LIZIZ;
        InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns = m2m.LJFF;
        InterfaceC88473Ynt<? super String, ? super java.util.Map<String, ? extends Object>, ? super Boolean, C76800UCe> interfaceC88473Ynt = m2m.LJI;
        C61002Nws LIZ2 = O9D.LIZ(templateData, str2, map, new LinkedHashMap(), interfaceC88472Yns, m2m.LJII, m2m.LJIIIZ, m2m.LJIIJ, m2m.LJIIIIZZ, interfaceC88473Ynt, m2m.LJIIJJI);
        ale.LJ = false;
        ale.LJIIL = new M2F(m2m, ale, LIZ2);
        O9C.LIZIZ.put(ale.LIZ, m2m);
        C58310MuY.LIZIZ.getClass();
        C60827Nu3.LJIIJJI(ale, Boolean.FALSE);
        M1V monitor = this.LJLJLLL;
        o.LJIIJ(monitor, "monitor");
        C61269O2v.LIZ.add(monitor);
        C26059AKp.LIZ().LIZJ("ec_page_lynx_show", this);
    }
}

package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C39048FUe;
import X.C39973FmT;
import X.C61222O1a;
import X.C61237O1p;
import X.C61261O2n;
import X.C61268O2u;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.O1J;
import X.O2L;
import com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader;
import com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class AqS0S0711000_10 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i8;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;
    public boolean z7;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS0S0711000_10 aqS0S0711000_10, Object obj) {
        JSONObject jSONObject;
        Throwable it = (Throwable) obj;
        o.LJIIJ(it, "it");
        JSONArray jSONArray = ((C61222O1a) aqS0S0711000_10.l1).LIZIZ.LJ;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("name", ((IXResourceLoader) aqS0S0711000_10.l2).getTAG());
        jSONObject2.put("status", "fail");
        jSONObject2.put("message", String.valueOf(it.getMessage()));
        jSONArray.put(jSONObject2);
        O1J o1j = (O1J) aqS0S0711000_10.l0;
        String message = it.getMessage();
        if (message == null) {
            message = "";
        }
        C39973FmT.LIZIZ(o1j, message, null, null, 6);
        O1J o1j2 = (O1J) aqS0S0711000_10.l0;
        if (o1j2.LJLJI) {
            ((InterfaceC88472Yns) aqS0S0711000_10.l3).invoke(new Throwable("ResourceLoaderChain# on cancel load"));
        } else if (aqS0S0711000_10.z7) {
            o1j2.LIZIZ((C61222O1a) aqS0S0711000_10.l1, (Iterator) aqS0S0711000_10.l4, (InterfaceC88472Yns) aqS0S0711000_10.l5, (InterfaceC88472Yns) aqS0S0711000_10.l3, (C61237O1p) aqS0S0711000_10.l6, aqS0S0711000_10.i8 + 1);
        } else {
            if (o1j2.LJLJJI && (jSONObject = ((C61222O1a) aqS0S0711000_10.l1).LIZIZ.LIZLLL.LJII) != null) {
                jSONObject.put("l_total", ((C61237O1p) aqS0S0711000_10.l6).LIZ());
            }
            ((InterfaceC88472Yns) aqS0S0711000_10.l3).invoke(it);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS0S0711000_10 aqS0S0711000_10, Object obj) {
        Throwable it = (Throwable) obj;
        o.LJIIJ(it, "it");
        JSONArray jSONArray = ((C61261O2n) aqS0S0711000_10.l1).LIZ.LIZLLL;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", ((IHybridResourceLoader) aqS0S0711000_10.l2).getTAG());
        jSONObject.put("status", "fail");
        jSONObject.put("message", String.valueOf(it.getMessage()));
        jSONArray.put(jSONObject);
        C39048FUe c39048FUe = C39048FUe.LIZIZ;
        String message = it.getMessage();
        if (message == null) {
            message = "";
        }
        C39048FUe.LIZIZ(c39048FUe, message, null, null, 6);
        O2L o2l = (O2L) aqS0S0711000_10.l0;
        if (o2l.LIZJ) {
            ((InterfaceC88472Yns) aqS0S0711000_10.l3).invoke(new Throwable("ResourceLoaderChain# on cancel load"));
        } else if (aqS0S0711000_10.z7) {
            o2l.LIZIZ((C61261O2n) aqS0S0711000_10.l1, (Iterator) aqS0S0711000_10.l4, (InterfaceC88472Yns) aqS0S0711000_10.l5, (InterfaceC88472Yns) aqS0S0711000_10.l3, (C61268O2u) aqS0S0711000_10.l6, aqS0S0711000_10.i8 + 1);
        } else {
            ((InterfaceC88472Yns) aqS0S0711000_10.l3).invoke(it);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S0711000_10(O1J o1j, C61222O1a c61222O1a, IXResourceLoader iXResourceLoader, InterfaceC88472Yns interfaceC88472Yns, boolean z, Iterator it, InterfaceC88472Yns interfaceC88472Yns2, C61237O1p c61237O1p, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = o1j;
        this.l1 = c61222O1a;
        this.l2 = iXResourceLoader;
        this.l3 = interfaceC88472Yns;
        this.z7 = z;
        this.l4 = it;
        this.l5 = interfaceC88472Yns2;
        this.l6 = c61237O1p;
        this.i8 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S0711000_10(O2L o2l, C61261O2n c61261O2n, IHybridResourceLoader iHybridResourceLoader, InterfaceC88472Yns interfaceC88472Yns, boolean z, Iterator it, InterfaceC88472Yns interfaceC88472Yns2, C61268O2u c61268O2u, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = o2l;
        this.l1 = c61261O2n;
        this.l2 = iHybridResourceLoader;
        this.l3 = interfaceC88472Yns;
        this.z7 = z;
        this.l4 = it;
        this.l5 = interfaceC88472Yns2;
        this.l6 = c61268O2u;
        this.i8 = i;
    }
}

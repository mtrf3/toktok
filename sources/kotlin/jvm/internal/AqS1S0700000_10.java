package kotlin.jvm.internal;

import X.AbstractC60548NpY;
import X.AbstractC65781Prl;
import X.C10K;
import X.C16880lQ;
import X.C39973FmT;
import X.C60488Noa;
import X.C60547NpX;
import X.C61030NxK;
import X.C61222O1a;
import X.C61237O1p;
import X.C61242O1u;
import X.C65232Piu;
import X.C76800UCe;
import X.EnumC60490Noc;
import X.InterfaceC60323Nlv;
import X.InterfaceC88472Yns;
import X.O1D;
import X.O1I;
import X.O1J;
import X.O1L;
import X.O1W;
import X.O25;
import Y.ACallableS87S0200000_10;
import android.os.SystemClock;
import com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class AqS1S0700000_10 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;

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

    public final void invoke$0(O1I it) {
        JSONObject jSONObject;
        o.LJIIJ(it, "it");
        if (((O1J) this.l0).LJLJI) {
            ((InterfaceC88472Yns) this.l1).invoke(new Throwable("ResourceLoaderChain# on cancel load"));
            return;
        }
        C61222O1a c61222O1a = (C61222O1a) this.l2;
        c61222O1a.getClass();
        c61222O1a.LIZIZ = it;
        O1I o1i = ((C61222O1a) this.l2).LIZIZ;
        String LJLLJ = C16880lQ.LJLLJ((Class) this.l3);
        o1i.getClass();
        o1i.LJIILJJIL = LJLLJ;
        if (((O1J) this.l0).LJLJJI && (jSONObject = ((C61222O1a) this.l2).LIZIZ.LIZLLL.LJII) != null) {
            jSONObject.put("l_total", ((C61237O1p) this.l4).LIZ());
        }
        ((InterfaceC88472Yns) this.l5).invoke((C61222O1a) this.l2);
        JSONArray jSONArray = ((C61222O1a) this.l2).LIZIZ.LJ;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("name", ((IXResourceLoader) this.l6).getTAG());
        jSONObject2.put("status", "success");
        jSONArray.put(jSONObject2);
    }

    public static final Object invoke$0(AqS1S0700000_10 aqS1S0700000_10, Object obj) {
        AbstractC60548NpY abstractC60548NpY;
        C61222O1a it = (C61222O1a) obj;
        o.LJIIJ(it, "it");
        ((O1D) aqS1S0700000_10.l0).LJLL.remove((O25) aqS1S0700000_10.l1);
        ((C61237O1p) aqS1S0700000_10.l2).LIZ();
        O1L o1l = (O1L) aqS1S0700000_10.l3;
        o.LJFF(((O1W) aqS1S0700000_10.l4).LJ.toString(), "resInfo.pipelineStatus.toString()");
        o1l.getClass();
        ((InterfaceC88472Yns) aqS1S0700000_10.l5).invoke(it.LIZIZ);
        JSONObject jSONObject = ((O1W) aqS1S0700000_10.l4).LIZLLL.LJII;
        if (jSONObject != null) {
            jSONObject.put("m_resolve", ((C61237O1p) aqS1S0700000_10.l2).LIZ());
        }
        JSONObject jSONObject2 = ((O1W) aqS1S0700000_10.l4).LIZLLL.LJII;
        if (jSONObject2 != null) {
            jSONObject2.put("m_total", ((C61237O1p) aqS1S0700000_10.l2).LIZIZ());
        }
        ((O1D) aqS1S0700000_10.l0).LJJJ(it.LIZIZ, (O1L) aqS1S0700000_10.l3, SystemClock.uptimeMillis() - ((O1W) aqS1S0700000_10.l4).LJIILL);
        O1D o1d = (O1D) aqS1S0700000_10.l0;
        O1I o1i = it.LIZIZ;
        C60547NpX c60547NpX = o1i.LIZLLL;
        InterfaceC60323Nlv interfaceC60323Nlv = ((O1L) aqS1S0700000_10.l3).LJIIJ;
        if (interfaceC60323Nlv != null) {
            abstractC60548NpY = (AbstractC60548NpY) interfaceC60323Nlv.LLLIIL(AbstractC60548NpY.class);
        } else {
            abstractC60548NpY = null;
        }
        c60547NpX.LIZJ = abstractC60548NpY;
        c60547NpX.LJI = C65232Piu.LIZJ("res_state", "success");
        o1d.getClass();
        C10K.LIZIZ(new ACallableS87S0200000_10(o1i, o1d, 3), C10K.LJI, null);
        EnumC60490Noc enumC60490Noc = it.LIZIZ.LJIIIIZZ;
        if (enumC60490Noc != null && C60488Noa.LJ[enumC60490Noc.ordinal()] == 1 && ((O1W) aqS1S0700000_10.l4).LJIIZILJ != null && ((O1L) aqS1S0700000_10.l3).LJIILIIL) {
            C61242O1u.LIZ.LIZIZ(C61030NxK.LIZ(it.LIZIZ, (O1L) aqS1S0700000_10.l6), it.LIZIZ);
        }
        O1D o1d2 = (O1D) aqS1S0700000_10.l0;
        String jSONArray = it.LIZIZ.LJ.toString();
        o.LJFF(jSONArray, "it.info.pipelineStatus.toString()");
        C39973FmT.LIZIZ(o1d2, jSONArray, null, null, 6);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AqS1S0700000_10 aqS1S0700000_10, Object obj) {
        aqS1S0700000_10.invoke$0((O1I) obj);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS1S0700000_10(O1D o1d, O25 o25, C61237O1p c61237O1p, O1L o1l, O1W o1w, InterfaceC88472Yns interfaceC88472Yns, O1L o1l2, int i) {
        super(1);
        this.$t = i;
        this.l0 = o1d;
        this.l1 = o25;
        this.l2 = c61237O1p;
        this.l3 = o1l;
        this.l4 = o1w;
        this.l5 = interfaceC88472Yns;
        this.l6 = o1l2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS1S0700000_10(O1J o1j, InterfaceC88472Yns interfaceC88472Yns, C61222O1a c61222O1a, Class cls, C61237O1p c61237O1p, InterfaceC88472Yns interfaceC88472Yns2, IXResourceLoader iXResourceLoader, int i) {
        super(1);
        this.$t = i;
        this.l0 = o1j;
        this.l1 = interfaceC88472Yns;
        this.l2 = c61222O1a;
        this.l3 = cls;
        this.l4 = c61237O1p;
        this.l5 = interfaceC88472Yns2;
        this.l6 = iXResourceLoader;
    }
}

package kotlin.jvm.internal;

import X.AbstractC60548NpY;
import X.AbstractC65781Prl;
import X.C10K;
import X.C16880lQ;
import X.C37692Eqm;
import X.C39048FUe;
import X.C39973FmT;
import X.C60488Noa;
import X.C60547NpX;
import X.C60737Nsb;
import X.C61030NxK;
import X.C61222O1a;
import X.C61237O1p;
import X.C61242O1u;
import X.C61255O2h;
import X.C61261O2n;
import X.C61268O2u;
import X.C61269O2v;
import X.C65232Piu;
import X.C68322mC;
import X.C76800UCe;
import X.EnumC60490Noc;
import X.InterfaceC60323Nlv;
import X.InterfaceC88472Yns;
import X.O1D;
import X.O1L;
import X.O1M;
import X.O1W;
import X.O25;
import X.O26;
import X.O2C;
import X.O2L;
import X.O2R;
import X.O2Z;
import X.O31;
import Y.ACallableS39S1200000_10;
import Y.ACallableS87S0200000_10;
import android.os.SystemClock;
import com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class AqS3S0600000_10 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    public final void invoke$0(O26 it) {
        o.LJIIJ(it, "it");
        if (((O2L) this.l0).LIZJ) {
            ((InterfaceC88472Yns) this.l1).invoke(new Throwable("ResourceLoaderChain# on cancel load"));
            return;
        }
        C61261O2n c61261O2n = (C61261O2n) this.l2;
        c61261O2n.getClass();
        c61261O2n.LIZ = it;
        O26 o26 = ((C61261O2n) this.l2).LIZ;
        String LJLLJ = C16880lQ.LJLLJ((Class) this.l3);
        o26.getClass();
        o26.LJIILJJIL = LJLLJ;
        ((InterfaceC88472Yns) this.l4).invoke((C61261O2n) this.l2);
        JSONArray jSONArray = ((C61261O2n) this.l2).LIZ.LIZLLL;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", ((IHybridResourceLoader) this.l5).getTAG());
        jSONObject.put("status", "success");
        jSONArray.put(jSONObject);
    }

    public static final Object invoke$0(AqS3S0600000_10 aqS3S0600000_10, Object obj) {
        AbstractC60548NpY abstractC60548NpY;
        Throwable it = (Throwable) obj;
        o.LJIIJ(it, "it");
        O1D o1d = (O1D) aqS3S0600000_10.l0;
        String jSONArray = ((O1W) aqS3S0600000_10.l1).LJ.toString();
        o.LJFF(jSONArray, "resInfo.pipelineStatus.toString()");
        C39973FmT.LIZIZ(o1d, jSONArray, null, null, 6);
        JSONObject jSONObject = ((O1W) aqS3S0600000_10.l1).LIZLLL.LJII;
        if (jSONObject != null) {
            jSONObject.put("m_total", ((C61237O1p) aqS3S0600000_10.l2).LIZIZ());
        }
        ((O1D) aqS3S0600000_10.l0).LJLL.remove((O25) aqS3S0600000_10.l3);
        O1L o1l = (O1L) aqS3S0600000_10.l4;
        o.LJFF(((O1W) aqS3S0600000_10.l1).LJ.toString(), "resInfo.pipelineStatus.toString()");
        o1l.getClass();
        ((InterfaceC88472Yns) aqS3S0600000_10.l5).invoke(it);
        O1D o1d2 = (O1D) aqS3S0600000_10.l0;
        O1W o1w = (O1W) aqS3S0600000_10.l1;
        O1L o1l2 = (O1L) aqS3S0600000_10.l4;
        String message = it.getMessage();
        if (message == null) {
            message = "";
        }
        o1d2.LJJIZ(o1w, o1l2, message);
        O1D o1d3 = (O1D) aqS3S0600000_10.l0;
        O1W o1w2 = (O1W) aqS3S0600000_10.l1;
        C60547NpX c60547NpX = o1w2.LIZLLL;
        InterfaceC60323Nlv interfaceC60323Nlv = ((O1L) aqS3S0600000_10.l4).LJIIJ;
        if (interfaceC60323Nlv != null) {
            abstractC60548NpY = (AbstractC60548NpY) interfaceC60323Nlv.LLLIIL(AbstractC60548NpY.class);
        } else {
            abstractC60548NpY = null;
        }
        c60547NpX.LIZJ = abstractC60548NpY;
        c60547NpX.LJI = C65232Piu.LIZJ("res_state", "failed");
        o1d3.getClass();
        C10K.LIZIZ(new ACallableS87S0200000_10(o1w2, o1d3, 3), C10K.LJI, null);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, X.O1I] */
    public static final Object invoke$1(AqS3S0600000_10 aqS3S0600000_10, Object obj) {
        C61222O1a it = (C61222O1a) obj;
        o.LJIIJ(it, "it");
        ((C68322mC) aqS3S0600000_10.l1).element = it.LIZIZ;
        JSONObject jSONObject = ((O1W) aqS3S0600000_10.l2).LIZLLL.LJII;
        if (jSONObject != null) {
            jSONObject.put("m_resolve", ((C61237O1p) aqS3S0600000_10.l3).LIZ());
        }
        JSONObject jSONObject2 = ((O1W) aqS3S0600000_10.l2).LIZLLL.LJII;
        if (jSONObject2 != null) {
            jSONObject2.put("m_total", ((C61237O1p) aqS3S0600000_10.l3).LIZIZ());
        }
        ((O1D) aqS3S0600000_10.l0).LJJJ(it.LIZIZ, (O1L) aqS3S0600000_10.l4, SystemClock.uptimeMillis() - ((O1W) aqS3S0600000_10.l2).LJIILL);
        EnumC60490Noc enumC60490Noc = it.LIZIZ.LJIIIIZZ;
        if (enumC60490Noc != null && C60488Noa.LIZLLL[enumC60490Noc.ordinal()] == 1 && ((O1W) aqS3S0600000_10.l2).LJIIZILJ != null) {
            C61242O1u.LIZ.LIZIZ(C61030NxK.LIZ(it.LIZIZ, (O1L) aqS3S0600000_10.l5), it.LIZIZ);
        }
        O1D o1d = (O1D) aqS3S0600000_10.l0;
        String jSONArray = it.LIZIZ.LJ.toString();
        o.LJFF(jSONArray, "it.info.pipelineStatus.toString()");
        C39973FmT.LIZIZ(o1d, jSONArray, null, null, 6);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS3S0600000_10 aqS3S0600000_10, Object obj) {
        String str;
        String str2;
        C61261O2n it = (C61261O2n) obj;
        o.LJIIJ(it, "it");
        O2R.LIZJ.remove((O31) aqS3S0600000_10.l0);
        ((JSONObject) aqS3S0600000_10.l1).put("m_resolve", ((C61268O2u) aqS3S0600000_10.l2).LIZ());
        ((JSONObject) aqS3S0600000_10.l1).put("m_total", ((C61268O2u) aqS3S0600000_10.l2).LIZIZ());
        O1M o1m = (O1M) aqS3S0600000_10.l3;
        o.LJFF(((C61261O2n) aqS3S0600000_10.l4).LIZ.LIZLLL.toString(), "resourceLoadTask.info.pipelineStatus.toString()");
        o1m.getClass();
        O26 o26 = it.LIZ;
        C60737Nsb c60737Nsb = ((O1M) aqS3S0600000_10.l3).LJIIJJI;
        if (c60737Nsb != null) {
            str = c60737Nsb.bid;
        } else {
            str = null;
        }
        o26.LJ = str;
        if (c60737Nsb != null) {
            str2 = c60737Nsb.containerId;
        } else {
            str2 = null;
        }
        o26.LJFF = str2;
        ((InterfaceC88472Yns) aqS3S0600000_10.l5).invoke(o26);
        O26 resInfo = it.LIZ;
        O1M taskConfig = (O1M) aqS3S0600000_10.l3;
        o.LJIIJ(resInfo, "resInfo");
        o.LJIIJ(taskConfig, "taskConfig");
        C10K.LIZIZ(new ACallableS87S0200000_10(taskConfig, resInfo, 16), C10K.LJI, null);
        O2C.LIZIZ((JSONObject) aqS3S0600000_10.l1, it.LIZ, (O1M) aqS3S0600000_10.l3, true);
        C61269O2v.LIZIZ.LIZIZ(it.LIZ, ((C61261O2n) aqS3S0600000_10.l4).LIZIZ);
        C61261O2n c61261O2n = (C61261O2n) aqS3S0600000_10.l4;
        O26 o262 = c61261O2n.LIZ;
        if (o262 != null) {
            O2R.LIZ(it, (O2Z) o262, c61261O2n.LIZIZ);
            C39048FUe c39048FUe = C39048FUe.LIZIZ;
            String jSONArray = it.LIZ.LIZLLL.toString();
            o.LJFF(jSONArray, "it.info.pipelineStatus.toString()");
            C39048FUe.LIZIZ(c39048FUe, jSONArray, null, null, 6);
            return C76800UCe.LIZ;
        }
        throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.lynx.hybrid.resource.RLResourceInfo");
    }

    public static final Object invoke$3(AqS3S0600000_10 aqS3S0600000_10, Object obj) {
        Throwable it = (Throwable) obj;
        o.LJIIJ(it, "it");
        C39048FUe c39048FUe = C39048FUe.LIZIZ;
        String jSONArray = ((C61261O2n) aqS3S0600000_10.l0).LIZ.LIZLLL.toString();
        o.LJFF(jSONArray, "resourceLoadTask.info.pipelineStatus.toString()");
        C39048FUe.LIZIZ(c39048FUe, jSONArray, null, null, 6);
        ((JSONObject) aqS3S0600000_10.l1).put("m_total", ((C61268O2u) aqS3S0600000_10.l2).LIZIZ());
        O2R.LIZJ.remove((O31) aqS3S0600000_10.l3);
        O1M o1m = (O1M) aqS3S0600000_10.l4;
        o.LJFF(((C61261O2n) aqS3S0600000_10.l0).LIZ.LIZLLL.toString(), "resourceLoadTask.info.pipelineStatus.toString()");
        o1m.getClass();
        ((InterfaceC88472Yns) aqS3S0600000_10.l5).invoke(it);
        O26 resInfo = ((C61261O2n) aqS3S0600000_10.l0).LIZ;
        O1M taskConfig = (O1M) aqS3S0600000_10.l4;
        String message = it.getMessage();
        if (message == null) {
            message = "";
        }
        o.LJIIJ(resInfo, "resInfo");
        o.LJIIJ(taskConfig, "taskConfig");
        C10K.LIZIZ(new ACallableS39S1200000_10(resInfo, taskConfig, message, 2), C10K.LJI, null);
        O2C.LIZIZ((JSONObject) aqS3S0600000_10.l1, ((C61261O2n) aqS3S0600000_10.l0).LIZ, (O1M) aqS3S0600000_10.l4, false);
        C61255O2h c61255O2h = C61269O2v.LIZIZ;
        C61261O2n c61261O2n = (C61261O2n) aqS3S0600000_10.l0;
        c61255O2h.LIZJ(c61261O2n.LIZ, c61261O2n.LIZIZ, it);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AqS3S0600000_10 aqS3S0600000_10, Object obj) {
        aqS3S0600000_10.invoke$0((O26) obj);
        return C76800UCe.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS3S0600000_10(X.O1M r3, X.O31 r4, X.C61261O2n r5, X.C61268O2u r6, X.InterfaceC88472Yns r7, org.json.JSONObject r8, int r9) {
        /*
            r2 = this;
            r2.$t = r9
            switch(r9) {
                case 2: goto L17;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r5
            r1.l1 = r8
            r1.l2 = r6
            r1.l3 = r4
            r1.l4 = r3
            r1.l5 = r7
            r0 = 1
        L13:
            r1.<init>(r0)
            return
        L17:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r8
            r1.l2 = r6
            r1.l3 = r3
            r1.l4 = r5
            r1.l5 = r7
            r0 = 1
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS3S0600000_10.<init>(X.O1M, X.O31, X.O2n, X.O2u, X.Yns, org.json.JSONObject, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS3S0600000_10(O1D o1d, C68322mC c68322mC, O1W o1w, C61237O1p c61237O1p, O1L o1l, O1L o1l2, int i) {
        super(1);
        this.$t = i;
        this.l0 = o1d;
        this.l1 = c68322mC;
        this.l2 = o1w;
        this.l3 = c61237O1p;
        this.l4 = o1l;
        this.l5 = o1l2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS3S0600000_10(O1D o1d, O1W o1w, C61237O1p c61237O1p, O25 o25, O1L o1l, InterfaceC88472Yns interfaceC88472Yns, int i) {
        super(1);
        this.$t = i;
        this.l0 = o1d;
        this.l1 = o1w;
        this.l2 = c61237O1p;
        this.l3 = o25;
        this.l4 = o1l;
        this.l5 = interfaceC88472Yns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS3S0600000_10(O2L o2l, InterfaceC88472Yns interfaceC88472Yns, C61261O2n c61261O2n, Class cls, InterfaceC88472Yns interfaceC88472Yns2, IHybridResourceLoader iHybridResourceLoader, int i) {
        super(1);
        this.$t = i;
        this.l0 = o2l;
        this.l1 = interfaceC88472Yns;
        this.l2 = c61261O2n;
        this.l3 = cls;
        this.l4 = interfaceC88472Yns2;
        this.l5 = iHybridResourceLoader;
    }
}

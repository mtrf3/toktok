package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.bytedance.pipo.checkout.api.network.model.request.PaymentElements;
import com.bytedance.pipo.checkout.api.network.model.response.Elements;
import com.bytedance.pipo.checkout.api.network.model.response.Rules;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.util.List;
import kotlin.jvm.internal.IDqS418S0100000_31;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.a7D, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public class C92219a7D implements InterfaceC91938a2g<String> {
    public final Elements LIZ;
    public Integer LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;
    public List<? extends InterfaceC91946a2o<String>> LJ;
    public final InterfaceC88472Yns<JSONObject, C76800UCe> LJFF;
    public final C92229a7N LJI;
    public final ParcelableSnapshotMutableState LJII;
    public final ParcelableSnapshotMutableState LJIIIIZZ;
    public final ParcelableSnapshotMutableState LJIIIZ;
    public final ParcelableSnapshotMutableState LJIIJ;
    public PthreadTimer LJIIJJI;
    public final XLM LJIIL;
    public long LJIILIIL;
    public long LJIILJJIL;
    public final InterfaceC88472Yns<String, C76800UCe> LJIILL;
    public final InterfaceC88472Yns<Boolean, C76800UCe> LJIILLIIL;

    public C92219a7D() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC91938a2g
    public List<PaymentElements> LIZIZ() {
        return C47261Igj.LJJIJ(new PaymentElements(this.LIZ.getElement(), this.LIZ.getParamName(), (String) this.LJIIIIZZ.getValue()));
    }

    public final String LJI() {
        return C91969a3B.LJFF(this.LIZ, this.LJI);
    }

    public String LJIIIIZZ() {
        return C91969a3B.LJI(this.LIZ, this.LJI);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (r4 == null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL() {
        /*
            r8 = this;
            androidx.compose.runtime.ParcelableSnapshotMutableState r6 = r8.LJIIIZ
            java.util.List<? extends X.a2o<java.lang.String>> r1 = r8.LJ
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r1, r0)
            r3.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L13:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2d
            java.lang.Object r1 = r2.next()
            X.a2o r1 = (X.InterfaceC91946a2o) r1
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = r8.LJII
            java.lang.Object r0 = r0.getValue()
            X.a7H r0 = r1.LIZ(r0)
            r3.add(r0)
            goto L13
        L2d:
            boolean r0 = r3.isEmpty()
            r5 = 1
            if (r0 == 0) goto L72
        L34:
            r7 = 1
        L35:
            java.util.Iterator r2 = r3.iterator()
        L39:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L70
            java.lang.Object r4 = r2.next()
            r1 = r4
            X.a7H r1 = (X.C92223a7H) r1
            boolean r0 = r1.LJLIL
            if (r0 != 0) goto L39
            java.lang.String r0 = r1.LJLJI
            int r0 = r0.length()
            if (r0 <= 0) goto L39
        L52:
            X.a7H r4 = (X.C92223a7H) r4
            X.a2j r3 = new X.a2j
            java.lang.String r2 = ""
            if (r4 != 0) goto L64
        L5a:
            r1 = r2
            if (r4 != 0) goto L69
        L5d:
            r3.<init>(r7, r5, r1, r2)
            r6.setValue(r3)
            return
        L64:
            java.lang.String r1 = r4.LJLILLLLZI
            if (r1 != 0) goto L69
            goto L5a
        L69:
            java.lang.String r0 = r4.LJLJI
            if (r0 != 0) goto L6e
            goto L5d
        L6e:
            r2 = r0
            goto L5d
        L70:
            r4 = 0
            goto L52
        L72:
            java.util.Iterator r1 = r3.iterator()
        L76:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r0 = r1.next()
            X.a7H r0 = (X.C92223a7H) r0
            boolean r0 = r0.LJLIL
            if (r0 != 0) goto L76
            r7 = 0
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92219a7D.LJIIL():void");
    }

    public final void LJIILIIL() {
        try {
            this.LJIIJJI.cancel();
        } catch (Throwable unused) {
        }
        PthreadTimer pthreadTimer = new PthreadTimer("FieldController");
        this.LJIIJJI = pthreadTimer;
        pthreadTimer.schedule(new C91939a2h(this), 500L);
    }

    @Override // X.InterfaceC91938a2g
    public InterfaceC88472Yns<Boolean, C76800UCe> LIZ() {
        return this.LJIILLIIL;
    }

    @Override // X.InterfaceC91938a2g
    public InterfaceC24760y8<C91941a2j> LIZLLL() {
        return this.LJIIJ;
    }

    public String LJFF() {
        return this.LIZLLL;
    }

    public Integer LJII() {
        return this.LIZIZ;
    }

    public boolean LJIIJ() {
        return this.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JSONObject LJ(List<OSZ<String, String>> kvs) {
        o.LJIIIZ(kvs, "kvs");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("obj_id", this.LIZ.getParamName());
        jSONObject.put("click_timestamp", this.LJIILIIL);
        jSONObject.put("finish_timestamp", this.LJIILJJIL);
        jSONObject.put("duration", this.LJIILJJIL - this.LJIILIIL);
        jSONObject.put("verification_err_msg", ((C91941a2j) this.LJIIIZ.getValue()).LIZJ);
        jSONObject.put("fillin_payment_method", "");
        for (OSZ<String, String> osz : kvs) {
            jSONObject.put(osz.getFirst(), osz.getSecond());
        }
        return jSONObject;
    }

    public final void LJIIIZ(List<OSZ<String, String>> kvs) {
        o.LJIIIZ(kvs, "kvs");
        this.LJIILJJIL = C92047a4R.LIZ();
        InterfaceC88472Yns<JSONObject, C76800UCe> interfaceC88472Yns = this.LJFF;
        if (interfaceC88472Yns == null) {
            return;
        }
        interfaceC88472Yns.invoke(LJ(kvs));
    }

    public void LJIIJJI(Integer num) {
        this.LIZIZ = num;
    }

    public C92219a7D(Elements element, Integer num, boolean z, String str, InterfaceC88472Yns interfaceC88472Yns, String str2, C92229a7N c92229a7N, int i) {
        C61878OQg validators;
        Integer num2;
        num = (i & 4) != 0 ? null : num;
        z = (i & 8) != 0 ? false : z;
        str = (i & 16) != 0 ? null : str;
        if ((i & 32) != 0) {
            validators = C61878OQg.INSTANCE;
        } else {
            validators = null;
        }
        interfaceC88472Yns = (i & 64) != 0 ? null : interfaceC88472Yns;
        str2 = (i & 128) != 0 ? null : str2;
        c92229a7N = (i & 256) != 0 ? null : c92229a7N;
        o.LJIIIZ(element, "element");
        o.LJIIIZ(validators, "validators");
        this.LIZ = element;
        this.LIZIZ = num;
        this.LIZJ = z;
        this.LIZLLL = str;
        this.LJ = validators;
        this.LJFF = interfaceC88472Yns;
        this.LJI = c92229a7N;
        String LJFF = LJFF();
        ParcelableSnapshotMutableState LJJJIL = C78966Uyw.LJJJIL(LJFF == null ? "" : LJFF);
        this.LJII = LJJJIL;
        this.LJIIIIZZ = LJJJIL;
        ParcelableSnapshotMutableState LJJJIL2 = C78966Uyw.LJJJIL(new C91941a2j(null, false, 15));
        this.LJIIIZ = LJJJIL2;
        this.LJIIJ = LJJJIL2;
        this.LJIIJJI = new PthreadTimer("FieldController");
        this.LJIIL = V8H.LIZ(Boolean.FALSE);
        this.LJIILIIL = C92047a4R.LIZ();
        this.LJIILJJIL = C92047a4R.LIZ();
        this.LJIILL = new IDqS418S0100000_31(this, 82);
        this.LJIILLIIL = new IDqS418S0100000_31(this, 81);
        if (LJIIJ()) {
            this.LJ = ORZ.LLIIJI(new C92221a7F(str2), this.LJ);
        }
        List<Rules> backendRuleList = element.getBackendRuleList();
        if (backendRuleList != null) {
            for (Rules rules : backendRuleList) {
                if (o.LJ(rules.getType(), "regex")) {
                    this.LJ = ORZ.LLIIJI(new C92218a7C(rules, this), this.LJ);
                }
            }
        }
        String configuration = this.LIZ.getConfiguration();
        if (configuration == null) {
            return;
        }
        try {
            Object opt = new JSONObject(configuration).opt("elementExtral");
            if ((opt instanceof JSONObject) && ((JSONObject) opt) != null) {
                Object maxLength = ((JSONObject) opt).opt("maxLength");
                if ((maxLength instanceof Integer) && (num2 = (Integer) maxLength) != null) {
                    num2.intValue();
                    o.LJIIIIZZ(maxLength, "maxLength");
                    LJIIJJI((Integer) maxLength);
                }
            }
        } catch (Throwable unused) {
        }
    }
}

package X;

import android.graphics.Bitmap;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.bytedance.pipo.checkout.api.network.model.request.PaymentElements;
import com.bytedance.pipo.checkout.api.network.model.response.Elements;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.IDqS418S0100000_31;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.a6i, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92188a6i implements InterfaceC91938a2g<C91741ZzV>, InterfaceC91976a3I {
    public List<? extends InterfaceC91946a2o<C91741ZzV>> LIZ;
    public final InterfaceC88472Yns<JSONObject, C76800UCe> LIZIZ;
    public final Elements LIZJ;
    public final C91841a17 LIZLLL;
    public final ParcelableSnapshotMutableState LJ;
    public final ParcelableSnapshotMutableState LJFF;
    public final ParcelableSnapshotMutableState LJI;
    public final ParcelableSnapshotMutableState LJII;
    public final XLM LJIIIIZZ;
    public long LJIIIZ;
    public PthreadTimer LJIIJ;
    public final InterfaceC88472Yns<C91741ZzV, C76800UCe> LJIIJJI;
    public final InterfaceC88472Yns<Boolean, C76800UCe> LJIIL;

    public C92188a6i() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC91938a2g
    public final List<PaymentElements> LIZIZ() {
        ArrayList arrayList = new ArrayList();
        List<Elements> subElementList = this.LIZJ.getSubElementList();
        if (subElementList != null) {
            Iterator<Elements> it = subElementList.iterator();
            while (it.hasNext()) {
                String paramName = it.next().getParamName();
                EnumC91966a38 enumC91966a38 = EnumC91966a38.ExpirationYear;
                if (o.LJ(paramName, enumC91966a38.getType())) {
                    arrayList.add(new PaymentElements(EnumC91957a2z.ExpirationYear.getType(), enumC91966a38.getType(), ((C91741ZzV) this.LJFF.getValue()).LIZIZ));
                } else {
                    EnumC91966a38 enumC91966a382 = EnumC91966a38.ExpirationMonth;
                    if (o.LJ(paramName, enumC91966a382.getType())) {
                        arrayList.add(new PaymentElements(EnumC91957a2z.ExpirationMonth.getType(), enumC91966a382.getType(), ((C91741ZzV) this.LJFF.getValue()).LIZ));
                    }
                }
            }
        }
        return ORZ.LLJI(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        if (r4 == null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C91941a2j LJ() {
        /*
            r7 = this;
            java.util.List<? extends X.a2o<X.ZzV>> r1 = r7.LIZ
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r1, r0)
            r3.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L11:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2b
            java.lang.Object r1 = r2.next()
            X.a2o r1 = (X.InterfaceC91946a2o) r1
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = r7.LJ
            java.lang.Object r0 = r0.getValue()
            X.a7H r0 = r1.LIZ(r0)
            r3.add(r0)
            goto L11
        L2b:
            boolean r0 = r3.isEmpty()
            r5 = 1
            if (r0 == 0) goto L6d
        L32:
            r6 = 1
        L33:
            java.util.Iterator r2 = r3.iterator()
        L37:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L6b
            java.lang.Object r4 = r2.next()
            r1 = r4
            X.a7H r1 = (X.C92223a7H) r1
            boolean r0 = r1.LJLIL
            if (r0 != 0) goto L37
            java.lang.String r0 = r1.LJLJI
            int r0 = r0.length()
            if (r0 <= 0) goto L37
        L50:
            X.a7H r4 = (X.C92223a7H) r4
            X.a2j r3 = new X.a2j
            java.lang.String r2 = ""
            if (r4 != 0) goto L5f
        L58:
            r1 = r2
            if (r4 != 0) goto L64
        L5b:
            r3.<init>(r6, r5, r1, r2)
            return r3
        L5f:
            java.lang.String r1 = r4.LJLILLLLZI
            if (r1 != 0) goto L64
            goto L58
        L64:
            java.lang.String r0 = r4.LJLJI
            if (r0 != 0) goto L69
            goto L5b
        L69:
            r2 = r0
            goto L5b
        L6b:
            r4 = 0
            goto L50
        L6d:
            java.util.Iterator r1 = r3.iterator()
        L71:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r0 = r1.next()
            X.a7H r0 = (X.C92223a7H) r0
            boolean r0 = r0.LJLIL
            if (r0 != 0) goto L71
            r6 = 0
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92188a6i.LJ():X.a2j");
    }

    @Override // X.InterfaceC91938a2g
    public final InterfaceC88472Yns<Boolean, C76800UCe> LIZ() {
        return this.LJIIL;
    }

    @Override // X.InterfaceC91938a2g
    public final InterfaceC24760y8<C91941a2j> LIZLLL() {
        return this.LJII;
    }

    public C92188a6i(InterfaceC88472Yns interfaceC88472Yns, Elements elements) {
        C61878OQg validators = C61878OQg.INSTANCE;
        o.LJIIIZ(validators, "validators");
        this.LIZ = validators;
        this.LIZIZ = interfaceC88472Yns;
        this.LIZJ = elements;
        this.LIZLLL = new C91841a17();
        ParcelableSnapshotMutableState LJJJIL = C78966Uyw.LJJJIL(C91740ZzU.LIZ(""));
        this.LJ = LJJJIL;
        this.LJFF = LJJJIL;
        ParcelableSnapshotMutableState LJJJIL2 = C78966Uyw.LJJJIL(new C91941a2j(null, false, 15));
        this.LJI = LJJJIL2;
        this.LJII = LJJJIL2;
        this.LJIIIIZZ = V8H.LIZ(Boolean.FALSE);
        this.LJIIIZ = C92047a4R.LIZ();
        this.LJIIJ = new PthreadTimer("ExpirationDateController");
        this.LJIIJJI = new IDqS418S0100000_31(this, 51);
        this.LJIIL = new IDqS418S0100000_31(this, 50);
        this.LIZ = C47261Igj.LJJIJ(new C92189a6j(new C91847a1D()));
    }

    @Override // X.InterfaceC91976a3I
    public final void LIZJ(Bitmap bitmap, String value) {
        o.LJIIIZ(value, "value");
        C91841a17 c91841a17 = this.LIZLLL;
        c91841a17.getClass();
        c91841a17.LIZ = Boolean.TRUE;
        c91841a17.LIZIZ = value;
        InterfaceC88472Yns<C91741ZzV, C76800UCe> interfaceC88472Yns = this.LJIIJJI;
        StringBuilder sb = new StringBuilder();
        int length = value.length();
        for (int i = 0; i < length; i++) {
            char charAt = value.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "filterTo(StringBuilder(), predicate).toString()");
        ((IDqS418S0100000_31) interfaceC88472Yns).invoke(C91740ZzU.LIZ(sb2));
    }
}

package kotlin.jvm.internal;

import X.AbstractC20690rZ;
import X.AbstractC60811Ntn;
import X.AbstractC65781Prl;
import X.C01C;
import X.C07260Qg;
import X.C1V9;
import X.C1VA;
import X.C20700ra;
import X.C514920j;
import X.C68322mC;
import X.C76800UCe;
import X.InterfaceC07280Qi;
import X.InterfaceC32651Px;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import com.bytedance.hybrid.spark.SparkContext;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public class IDqS15S1100000 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l1;
    public String s0;

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

    public static final Object invoke$0(IDqS15S1100000 iDqS15S1100000, Object obj) {
        SparkContext sparkContext = (SparkContext) obj;
        o.LJIIIZ(sparkContext, "sparkContext");
        final String str = iDqS15S1100000.s0;
        final C01C c01c = (C01C) iDqS15S1100000.l1;
        sparkContext.LJJI(new AbstractC60811Ntn() { // from class: X.1ps
            @Override // X.AbstractC60673NrZ
            public final void LJJJJI(InterfaceC60761Nsz view, String url, String str2) {
                o.LJIIIZ(view, "view");
                o.LJIIIZ(url, "url");
                LJJJJ(view, url);
                String str3 = str;
                C01C c01c2 = c01c;
                if (str2 == null) {
                    str2 = "onLoadUnknownFailed";
                }
                C01A.LIZIZ(str3, c01c2, true, str2);
            }
        });
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS15S1100000 iDqS15S1100000, Object obj) {
        String targetKey = (String) obj;
        o.LJIIIZ(targetKey, "targetKey");
        super/*X.1mf*/.LIZIZ(targetKey, iDqS15S1100000.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS15S1100000 iDqS15S1100000, Object obj) {
        return C1VA.LJIILIIL((C1V9) obj, (InterfaceC32651Px) iDqS15S1100000.l1, iDqS15S1100000.s0, null);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [X.0ra, T, java.lang.Object] */
    public static final Object invoke$3(IDqS15S1100000 iDqS15S1100000, Object obj) {
        boolean z;
        ?? it = (C20700ra) obj;
        o.LJIIIZ(it, "it");
        if (o.LJ(it.LIZ.LIZIZ(), iDqS15S1100000.s0)) {
            ((C68322mC) iDqS15S1100000.l1).element = it;
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$4(IDqS15S1100000 iDqS15S1100000, Object obj) {
        InterfaceC07280Qi semantics = (InterfaceC07280Qi) obj;
        o.LJIIIZ(semantics, "$this$semantics");
        C07260Qg.LIZIZ(semantics, iDqS15S1100000.s0);
        C07260Qg.LIZ(semantics, null, new IDqS420S0100000((InterfaceC65784Pro) iDqS15S1100000.l1, 163));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS15S1100000(InterfaceC32651Px interfaceC32651Px, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = interfaceC32651Px;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS15S1100000(C514920j c514920j, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c514920j;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS15S1100000(String str, C01C c01c, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c01c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS15S1100000(String str, String str2, C68322mC<C20700ra<AbstractC20690rZ>> c68322mC) {
        super(1);
        this.$t = c68322mC;
        this.s0 = str;
        this.l1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS15S1100000(String str, String str2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(1);
        this.$t = interfaceC65784Pro;
        this.s0 = str;
        this.l1 = str2;
    }
}

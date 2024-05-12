package kotlin.jvm.internal;

import X.AbstractC60811Ntn;
import X.AbstractC65781Prl;
import X.C07260Qg;
import X.C22810uz;
import X.C76800UCe;
import X.InterfaceC07280Qi;
import X.InterfaceC88472Yns;
import X.X1D;
import com.bytedance.hybrid.spark.SparkContext;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public class IDqS7S1000000 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS7S1000000(String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
    }

    public static final Object invoke$0(IDqS7S1000000 iDqS7S1000000, Object obj) {
        return Boolean.valueOf(o.LJ(((C22810uz) obj).LIZ, iDqS7S1000000.s0));
    }

    public static final Object invoke$1(IDqS7S1000000 iDqS7S1000000, Object obj) {
        InterfaceC07280Qi fakeSemanticsNode = (InterfaceC07280Qi) obj;
        o.LJIIIZ(fakeSemanticsNode, "$this$fakeSemanticsNode");
        C07260Qg.LIZIZ(fakeSemanticsNode, iDqS7S1000000.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS7S1000000 iDqS7S1000000, Object obj) {
        InterfaceC07280Qi semantics = (InterfaceC07280Qi) obj;
        o.LJIIIZ(semantics, "$this$semantics");
        C07260Qg.LIZIZ(semantics, iDqS7S1000000.s0);
        C07260Qg.LIZJ(semantics, 5);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS7S1000000 iDqS7S1000000, Object obj) {
        InterfaceC07280Qi semantics = (InterfaceC07280Qi) obj;
        o.LJIIIZ(semantics, "$this$semantics");
        C07260Qg.LIZIZ(semantics, iDqS7S1000000.s0);
        C07260Qg.LIZJ(semantics, 5);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(IDqS7S1000000 iDqS7S1000000, Object obj) {
        SparkContext it = (SparkContext) obj;
        o.LJIIIZ(it, "it");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("{ \"initial_data\":");
        LIZ.append(iDqS7S1000000.s0);
        LIZ.append('}');
        String initData = X1D.LIZIZ(LIZ);
        o.LJIIJ(initData, "initData");
        it.initData = initData;
        it.LJJI(new AbstractC60811Ntn() { // from class: X.26Q
            @Override // X.AbstractC60673NrZ
            public final void LJJJJJ(InterfaceC60761Nsz view) {
                o.LJIIIZ(view, "view");
            }

            @Override // X.AbstractC60673NrZ
            public final void LJJJJJL(InterfaceC60761Nsz view, String url) {
                o.LJIIIZ(view, "view");
                o.LJIIIZ(url, "url");
                super.LJJJJJL(view, url);
            }

            @Override // X.AbstractC60673NrZ
            public final void LJJJJI(InterfaceC60761Nsz view, String url, String str) {
                o.LJIIIZ(view, "view");
                o.LJIIIZ(url, "url");
                super.LJJJJI(view, url, str);
            }
        });
        return C76800UCe.LIZ;
    }
}

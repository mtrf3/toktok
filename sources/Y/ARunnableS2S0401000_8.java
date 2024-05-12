package Y;

import X.AnonymousClass901;
import X.IDP;
import X.IFG;
import X.IOA;
import X.InterfaceC65784Pro;
import X.InterfaceC78395Upj;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes9.dex */
public class ARunnableS2S0401000_8 implements Runnable {
    public final int $t;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public static final void run$0(ARunnableS2S0401000_8 aRunnableS2S0401000_8) {
        boolean LIZ;
        try {
            IOA.LIZ((InterfaceC88472Yns) aRunnableS2S0401000_8.l0, (InterfaceC88472Yns) aRunnableS2S0401000_8.l1, (InterfaceC65784Pro) aRunnableS2S0401000_8.l2, aRunnableS2S0401000_8.l3, aRunnableS2S0401000_8.i4 + 1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS2S0401000_8 aRunnableS2S0401000_8) {
        switch (aRunnableS2S0401000_8.i4) {
            case 0:
                Object obj = aRunnableS2S0401000_8.l0;
                InterfaceC78395Upj interfaceC78395Upj = (InterfaceC78395Upj) aRunnableS2S0401000_8.l3;
                obj.getClass();
                if (interfaceC78395Upj != null) {
                    interfaceC78395Upj.LJIIIZ();
                    return;
                }
                return;
            default:
                IDP idp = (IDP) aRunnableS2S0401000_8.l0;
                ((IFG) aRunnableS2S0401000_8.l1).LJIIJJI(idp.LJJIIZ(), idp.LJLJI, (Aweme) aRunnableS2S0401000_8.l2, ((AnonymousClass901) aRunnableS2S0401000_8.l3).LLI());
                return;
        }
    }

    public ARunnableS2S0401000_8(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.$t = i2;
        this.i4 = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}

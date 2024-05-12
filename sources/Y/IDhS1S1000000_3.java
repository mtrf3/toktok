package Y;

import X.AbstractC73672Svk;
import X.C189837ch;
import X.C193617in;
import X.C25620zW;
import X.C54838Lfe;
import X.C55723Ltv;
import X.C7XD;
import X.InterfaceC48038ItG;
import X.X1D;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes4.dex */
public class IDhS1S1000000_3 implements InterfaceC48038ItG {
    public final int $t;
    public String s0;

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            default:
                return null;
        }
    }

    public IDhS1S1000000_3(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }

    public static final Object apply$0(IDhS1S1000000_3 iDhS1S1000000_3, Object obj) {
        String str = iDhS1S1000000_3.s0;
        if (((Boolean) obj).booleanValue()) {
            return C55723Ltv.LIZIZ.LJIL().LJ(str).LJIJJLI(new AfS19S1000000_3(str, 1)).LJJJJ(new IDhS1S1000000_3(str, 1));
        }
        return AbstractC73672Svk.LJJIJIL(new Aweme());
    }

    public static final Object apply$1(IDhS1S1000000_3 iDhS1S1000000_3, Object obj) {
        Throwable th = (Throwable) obj;
        StringBuilder LIZIZ = C25620zW.LIZIZ("fetchListRx: fetch user(", iDhS1S1000000_3.s0, ") story on error: ");
        LIZIZ.append(C54838Lfe.LJII(th));
        C189837ch.LIZIZ("AwemeModel", X1D.LIZIZ(LIZIZ), th);
        return new Aweme();
    }

    public static final Object apply$2(IDhS1S1000000_3 iDhS1S1000000_3, Object obj) {
        Throwable th = (Throwable) obj;
        StringBuilder LIZIZ = C25620zW.LIZIZ("fetchListRx: fetch user(", iDhS1S1000000_3.s0, ") now on error: ");
        LIZIZ.append(C54838Lfe.LJII(th));
        C7XD.LIZJ("AwemeModel", X1D.LIZIZ(LIZIZ), th);
        return new Aweme();
    }

    public static final Object apply$3(IDhS1S1000000_3 iDhS1S1000000_3, Object obj) {
        String str = iDhS1S1000000_3.s0;
        if (((Boolean) obj).booleanValue()) {
            return C193617in.LIZIZ.LIZ(str).LJIJJLI(new AfS36S0101000_5(2, str, 45)).LJJJJ(new IDhS1S1000000_3(str, 2));
        }
        return AbstractC73672Svk.LJJIJIL(new Aweme());
    }
}

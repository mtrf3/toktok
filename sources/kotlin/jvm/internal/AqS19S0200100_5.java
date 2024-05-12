package kotlin.jvm.internal;

import X.AbstractC32415Cnr;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C15380j0;
import X.C30868C9o;
import X.C32399Cnb;
import X.C32800Cu4;
import X.C32816CuK;
import X.C76800UCe;
import X.CN1;
import X.EnumC32408Cnk;
import X.InterfaceC65784Pro;
import X.UV2;
import com.bytedance.android.live.wallet.IWalletExchange;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public class AqS19S0200100_5 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS19S0200100_5 aqS19S0200100_5) {
        C32399Cnb c32399Cnb = (C32399Cnb) aqS19S0200100_5.l0;
        if (c32399Cnb != null) {
            c32399Cnb.LJII = false;
            c32399Cnb.LJIIJJI = aqS19S0200100_5.j2;
            c32399Cnb.LIZIZ(EnumC32408Cnk.CANCEL);
        }
        AbstractC32415Cnr abstractC32415Cnr = (AbstractC32415Cnr) aqS19S0200100_5.l1;
        if (abstractC32415Cnr != null) {
            abstractC32415Cnr.LIZ((C32399Cnb) aqS19S0200100_5.l0);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS19S0200100_5 aqS19S0200100_5) {
        String str;
        C32816CuK c32816CuK = (C32816CuK) aqS19S0200100_5.l0;
        long j = 0;
        if (c32816CuK.LJ) {
            C30868C9o.LIZJ(R.string.l4o);
        } else {
            UV2 LIZIZ = c32816CuK.LIZIZ();
            if (LIZIZ != null && LIZIZ.LJIIL != null && aqS19S0200100_5.j2 > 0) {
                C30868C9o.LJI(C15380j0.LJIILL(R.string.l62, C15380j0.LJIILJJIL(R.string.l5u)));
            } else {
                C30868C9o.LIZJ(R.string.l4h);
            }
        }
        ActivityC45651qj LJFF = ((C32800Cu4) aqS19S0200100_5.l1).LJFF();
        DataChannel LJI = ((C32800Cu4) aqS19S0200100_5.l1).LJI();
        if (LJFF != null && LJI != null) {
            IWalletExchange walletExchange = ((IWalletService) CN1.LIZ(IWalletService.class)).walletExchange();
            C32816CuK c32816CuK2 = (C32816CuK) aqS19S0200100_5.l0;
            int i = c32816CuK2.LIZJ;
            UV2 LIZIZ2 = c32816CuK2.LIZIZ();
            if (LIZIZ2 != null) {
                j = LIZIZ2.LIZ;
            }
            Long valueOf = Long.valueOf(j);
            UV2 LIZIZ3 = ((C32816CuK) aqS19S0200100_5.l0).LIZIZ();
            if (LIZIZ3 == null || (str = LIZIZ3.LJIIL) == null) {
                str = "";
            }
            ((WalletExchange) walletExchange).LJIJJLI(LJFF, LJI, i, valueOf, str);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS19S0200100_5(C32399Cnb c32399Cnb, long j, AbstractC32415Cnr abstractC32415Cnr, int i) {
        super(0);
        this.$t = i;
        this.l0 = c32399Cnb;
        this.j2 = j;
        this.l1 = abstractC32415Cnr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS19S0200100_5(C32816CuK c32816CuK, long j, C32800Cu4 c32800Cu4, int i) {
        super(0);
        this.$t = i;
        this.l0 = c32816CuK;
        this.j2 = j;
        this.l1 = c32800Cu4;
    }
}

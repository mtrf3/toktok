package Y;

import X.C31524CYu;
import X.C77979Uj1;
import X.InterfaceC64592gB;
import X.InterfaceC78033Ujt;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankPageViewModel;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class AfS0S0420000_13 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public boolean z4;
    public boolean z5;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS0S0420000_13 afS0S0420000_13, Object obj) {
        String it = (String) obj;
        RankPageViewModel rankPageViewModel = (RankPageViewModel) afS0S0420000_13.l0;
        o.LJIIIIZZ(it, "it");
        rankPageViewModel.iv0(it, (RankTypeV2) afS0S0420000_13.l1, afS0S0420000_13.z4, afS0S0420000_13.z5, (InterfaceC78033Ujt) afS0S0420000_13.l2, (C77979Uj1) afS0S0420000_13.l3, false);
    }

    public static final void accept$1(AfS0S0420000_13 afS0S0420000_13, Object obj) {
        Throwable it = (Throwable) obj;
        RankPageViewModel rankPageViewModel = (RankPageViewModel) afS0S0420000_13.l0;
        o.LJIIIIZZ(it, "it");
        RankTypeV2 rankTypeV2 = (RankTypeV2) afS0S0420000_13.l1;
        int i = rankTypeV2.type;
        int i2 = rankTypeV2.rankPhase;
        boolean z = afS0S0420000_13.z4;
        boolean z2 = afS0S0420000_13.z5;
        InterfaceC78033Ujt interfaceC78033Ujt = (InterfaceC78033Ujt) afS0S0420000_13.l2;
        C77979Uj1 c77979Uj1 = (C77979Uj1) afS0S0420000_13.l3;
        if (z) {
            rankPageViewModel.hv0();
        } else {
            rankPageViewModel.getClass();
            interfaceC78033Ujt.onError();
        }
        if (!z2) {
            C31524CYu.LJFF(it, i, i2, c77979Uj1.LIZ, c77979Uj1.LIZIZ, c77979Uj1.LIZJ, c77979Uj1.LIZLLL);
        }
    }

    public AfS0S0420000_13(RankPageViewModel rankPageViewModel, RankTypeV2 rankTypeV2, boolean z, boolean z2, InterfaceC78033Ujt interfaceC78033Ujt, C77979Uj1 c77979Uj1, int i) {
        this.$t = i;
        this.l0 = rankPageViewModel;
        this.l1 = rankTypeV2;
        this.z4 = z;
        this.z5 = z2;
        this.l2 = interfaceC78033Ujt;
        this.l3 = c77979Uj1;
    }
}

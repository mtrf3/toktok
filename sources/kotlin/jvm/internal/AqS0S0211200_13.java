package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C28467BFf;
import X.C76439TzH;
import X.C76442TzK;
import X.InterfaceC88472Yns;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.viewmodel.MatchItemViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.match.CriticalStrikeCardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.SmokeCardInfo;
import webcast.api.battle.BattleAwardItemCardResponse;

/* loaded from: classes14.dex */
public class AqS0S0211200_13 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i3;
    public long j4;
    public long j5;
    public Object l0;
    public Object l1;
    public boolean z2;

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

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AqS0S0211200_13 aqS0S0211200_13, Object obj) {
        CriticalStrikeCardInfo criticalStrikeCardInfo;
        C76439TzH setState = (C76439TzH) obj;
        o.LJIIIZ(setState, "$this$setState");
        C76442TzK c76442TzK = new C76442TzK(aqS0S0211200_13.i3, aqS0S0211200_13.j4, aqS0S0211200_13.j5);
        MatchItemViewModel matchItemViewModel = (MatchItemViewModel) aqS0S0211200_13.l0;
        C28467BFf c28467BFf = (C28467BFf) aqS0S0211200_13.l1;
        boolean z = aqS0S0211200_13.z2;
        BattleAwardItemCardResponse.ResponseData responseData = (BattleAwardItemCardResponse.ResponseData) c28467BFf.data;
        if (responseData != null && (criticalStrikeCardInfo = responseData.criticalStrikeCard) != null) {
            c76442TzK.LIZLLL = MatchItemViewModel.hv0(matchItemViewModel, criticalStrikeCardInfo, z, true, false);
            return C76439TzH.M(setState, null, null, null, null, c76442TzK, 15);
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AqS0S0211200_13 aqS0S0211200_13, Object obj) {
        SmokeCardInfo smokeCardInfo;
        C76439TzH setState = (C76439TzH) obj;
        o.LJIIIZ(setState, "$this$setState");
        C76442TzK c76442TzK = new C76442TzK(aqS0S0211200_13.i3, aqS0S0211200_13.j4, aqS0S0211200_13.j5);
        MatchItemViewModel matchItemViewModel = (MatchItemViewModel) aqS0S0211200_13.l0;
        C28467BFf c28467BFf = (C28467BFf) aqS0S0211200_13.l1;
        boolean z = aqS0S0211200_13.z2;
        BattleAwardItemCardResponse.ResponseData responseData = (BattleAwardItemCardResponse.ResponseData) c28467BFf.data;
        if (responseData != null && (smokeCardInfo = responseData.smokeCard) != null) {
            c76442TzK.LIZLLL = matchItemViewModel.gv0(smokeCardInfo, z, true, false);
            return C76439TzH.M(setState, null, null, null, null, c76442TzK, 15);
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0007: IPUT (r6 I:long), (r1 I:kotlin.jvm.internal.AqS0S0211200_13) (LINE:117440519) kotlin.jvm.internal.AqS0S0211200_13.j5 long, block:B:1:0x0000 */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0009: IPUT (r8 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AqS0S0211200_13) (LINE:117440521) kotlin.jvm.internal.AqS0S0211200_13.l0 java.lang.Object, block:B:1:0x0000 */
    public AqS0S0211200_13(int i, int i2, long j, long j2, MatchItemViewModel matchItemViewModel, C28467BFf<BattleAwardItemCardResponse.ResponseData> c28467BFf, boolean z) {
        super(1);
        long j3;
        Object obj;
        this.$t = z ? 1 : 0;
        this.i3 = i;
        this.j4 = i2;
        this.j5 = j3;
        this.l0 = obj;
        this.l1 = matchItemViewModel;
        this.z2 = c28467BFf;
    }
}

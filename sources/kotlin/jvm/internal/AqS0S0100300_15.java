package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.C78685UuP;
import X.InterfaceC88472Yns;
import com.ss.ugc.effectplatform.task.FetchEffectListCheckedTask;
import com.ss.ugc.effectplatform.task.FetchPanelInfoCheckedTask;
import com.ss.ugc.effectplatform.task.FetchPanelInfoPagingCheckedTask;

/* loaded from: classes16.dex */
public class AqS0S0100300_15 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public long j1;
    public long j2;
    public long j3;
    public Object l0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS0S0100300_15 aqS0S0100300_15, Object obj) {
        C78685UuP.LJJLJ(((FetchPanelInfoCheckedTask) aqS0S0100300_15.l0).LJIIL, Long.valueOf(((Number) obj).intValue()));
        ((FetchPanelInfoCheckedTask) aqS0S0100300_15.l0).LJIILLIIL(aqS0S0100300_15.j1, aqS0S0100300_15.j2, aqS0S0100300_15.j3, System.currentTimeMillis());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS0S0100300_15 aqS0S0100300_15, Object obj) {
        C78685UuP.LJJLJ(((FetchPanelInfoPagingCheckedTask) aqS0S0100300_15.l0).LJIIL, Long.valueOf(((Number) obj).intValue()));
        ((FetchPanelInfoPagingCheckedTask) aqS0S0100300_15.l0).LJIILLIIL(aqS0S0100300_15.j1, aqS0S0100300_15.j2, aqS0S0100300_15.j3, System.currentTimeMillis());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS0S0100300_15 aqS0S0100300_15, Object obj) {
        ((FetchEffectListCheckedTask) aqS0S0100300_15.l0).LJIILLIIL(aqS0S0100300_15.j1, aqS0S0100300_15.j2, aqS0S0100300_15.j3, ((Number) obj).intValue(), System.currentTimeMillis());
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S0100300_15(FetchEffectListCheckedTask fetchEffectListCheckedTask, long j, long j2, long j3, int i) {
        super(1);
        this.$t = i;
        this.l0 = fetchEffectListCheckedTask;
        this.j1 = j;
        this.j2 = j2;
        this.j3 = j3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S0100300_15(FetchPanelInfoCheckedTask fetchPanelInfoCheckedTask, long j, long j2, long j3, int i) {
        super(1);
        this.$t = i;
        this.l0 = fetchPanelInfoCheckedTask;
        this.j1 = j;
        this.j2 = j2;
        this.j3 = j3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S0100300_15(FetchPanelInfoPagingCheckedTask fetchPanelInfoPagingCheckedTask, long j, long j2, long j3, int i) {
        super(1);
        this.$t = i;
        this.l0 = fetchPanelInfoPagingCheckedTask;
        this.j1 = j;
        this.j2 = j2;
        this.j3 = j3;
    }
}

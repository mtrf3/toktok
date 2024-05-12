package X;

import com.ss.android.ugc.aweme.search.source.utils.ConsumptionInfoNum;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K3U extends AbstractC65781Prl implements InterfaceC65784Pro<ConsumptionInfoNum> {
    public static final K3U LJLIL = new K3U();

    public K3U() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final ConsumptionInfoNum invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        ConsumptionInfoNum consumptionInfoNum = K3T.LIZ;
        LJIIIZ.getClass();
        Object LJIJ = FFL.LJIJ(true, "search_consumption_info_num", 31744, ConsumptionInfoNum.class, consumptionInfoNum);
        if (LJIJ != 0) {
            consumptionInfoNum = LJIJ;
        }
        o.LJIIIIZZ(consumptionInfoNum, "ABManager.getInstance().…ig::class.java) ?: CONFIG");
        return consumptionInfoNum;
    }
}

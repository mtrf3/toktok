package X;

import com.bytedance.effectcreatormobile.ckeapi.api.foundation.statistic.StatisticReporter;

/* renamed from: X.aiO, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94524aiO extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public static final C94524aiO LJLIL = new C94524aiO();

    public C94524aiO() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        StatisticReporter LIZ = C93670aUc.LIZ();
        if (LIZ != null) {
            LIZ.onEvent("interaction_sheet_enter", C51029K0z.LJJIIZI(new OSZ("object_num", String.valueOf(C93991aZn.LIZ().getObjectList().size()))));
        }
        return C76800UCe.LIZ;
    }
}

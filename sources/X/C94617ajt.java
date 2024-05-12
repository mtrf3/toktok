package X;

import com.bytedance.effectcreatormobile.ckeapi.api.foundation.statistic.StatisticReporter;

/* renamed from: X.ajt, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94617ajt extends AbstractC65781Prl implements InterfaceC88472Yns<Boolean, C76800UCe> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ C94618aju LJLILLLLZI;
    public final /* synthetic */ C94033aaT LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94617ajt(long j, C94618aju c94618aju, C94033aaT c94033aaT) {
        super(1);
        this.LJLIL = j;
        this.LJLILLLLZI = c94618aju;
        this.LJLJI = c94033aaT;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Boolean bool) {
        String str;
        boolean booleanValue = bool.booleanValue();
        C94618aju c94618aju = this.LJLILLLLZI;
        long j = this.LJLIL;
        C94033aaT c94033aaT = this.LJLJI;
        c94618aju.getClass();
        OSZ[] oszArr = new OSZ[1];
        if (booleanValue) {
            str = "success";
        } else {
            str = "fail";
        }
        oszArr[0] = new OSZ("deliver_result", str);
        java.util.Map<String, String> LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        if (booleanValue) {
            LJJLIIIIJ.put("time_cost", String.valueOf(System.currentTimeMillis() - j));
        } else {
            LJJLIIIIJ.put("err_msg", c94033aaT.LIZIZ);
        }
        StatisticReporter LIZ = C93670aUc.LIZ();
        if (LIZ != null) {
            LIZ.onEvent("server_deliver_feature_icon", LJJLIIIIJ);
        }
        return C76800UCe.LIZ;
    }
}

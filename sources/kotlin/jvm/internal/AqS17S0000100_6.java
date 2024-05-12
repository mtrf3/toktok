package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C113554cx;
import X.C76800UCe;
import X.E86;
import X.FMX;
import X.InterfaceC88472Yns;
import X.OSZ;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.pipo.PipoService;

/* loaded from: classes7.dex */
public class AqS17S0000100_6 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public long j0;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS17S0000100_6(long j, int i) {
        super(1);
        this.$t = i;
        this.j0 = j;
    }

    public static final Object invoke$0(AqS17S0000100_6 aqS17S0000100_6, Object obj) {
        String str;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        long currentTimeMillis = System.currentTimeMillis() - aqS17S0000100_6.j0;
        if (booleanValue && PipoService.LJ().LIZJ()) {
            str = "succeed";
        } else {
            str = "fail";
        }
        FMX.LJIIL("rd_pipo_bnpl_df_download_end", C113554cx.LJJLIIIIJ(new OSZ("bnpl_source_id", "init_task"), new OSZ("download_scene", "initTask"), new OSZ("download_status", str), new OSZ("download_cost", String.valueOf(currentTimeMillis)), new OSZ("download_retry_count", CardStruct.IStatusCode.DEFAULT)));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS17S0000100_6 aqS17S0000100_6, Object obj) {
        E86 setState = (E86) obj;
        o.LJIIIZ(setState, "$this$setState");
        return E86.LIZ(setState, null, null, Long.valueOf(aqS17S0000100_6.j0), null, false, null, null, 123);
    }
}

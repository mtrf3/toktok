package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C35857E5l;
import X.C35858E5m;
import X.C47135Ieh;
import X.C60292NlQ;
import X.C60299NlX;
import X.C60547NpX;
import X.C60549NpZ;
import X.C76800UCe;
import X.FH5;
import X.InterfaceC60276NlA;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.client.experiment.UploadVidApi;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class AqS13S0200100_6 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

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

    public static final Object invoke$0(AqS13S0200100_6 aqS13S0200100_6, Object obj) {
        UploadVidApi.UploadVidResponse uploadVidResponse = (UploadVidApi.UploadVidResponse) obj;
        o.LJIIIZ(uploadVidResponse, "uploadVidResponse");
        String str = uploadVidResponse.vid;
        if (str != null) {
            FH5.LIZIZ().getClass();
            FH5.LIZ(str);
        }
        if (uploadVidResponse.statusCode == 0) {
            ((InterfaceC65784Pro) aqS13S0200100_6.l0).invoke();
        } else {
            ((InterfaceC65784Pro) aqS13S0200100_6.l1).invoke();
        }
        C35857E5l.LIZIZ(uploadVidResponse.statusCode, aqS13S0200100_6.j2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS13S0200100_6 aqS13S0200100_6, Object obj) {
        Throwable it = (Throwable) obj;
        o.LJIIJ(it, "it");
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - aqS13S0200100_6.j2);
        C60292NlQ c60292NlQ = (C60292NlQ) aqS13S0200100_6.l0;
        c60292NlQ.getClass();
        InterfaceC60276NlA interfaceC60276NlA = (InterfaceC60276NlA) C60299NlX.LIZ(c60292NlQ, InterfaceC60276NlA.class);
        C60549NpZ c60549NpZ = ((C60292NlQ) aqS13S0200100_6.l0).LJLLLLLL;
        String message = it.getMessage();
        Long valueOf = Long.valueOf(millis);
        if (interfaceC60276NlA != null) {
            C60547NpX c60547NpX = new C60547NpX("bdx_monitor_lynx_resource_load", null, null, 254);
            c60547NpX.LIZJ = c60549NpZ;
            JSONObject LJ = C47135Ieh.LJ("res_url", "Unknown", "res_version", "-1");
            LJ.put("res_status", "failure");
            LJ.put("fail_reason", message);
            c60547NpX.LJI = LJ;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", valueOf);
            c60547NpX.LJII = jSONObject;
            interfaceC60276NlA.LJ(c60547NpX);
        }
        ((InterfaceC88472Yns) aqS13S0200100_6.l1).invoke(it);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS13S0200100_6(long j, AqS156S0100000_6 aqS156S0100000_6, C35858E5m c35858E5m, int i) {
        super(1);
        this.$t = i;
        this.l0 = aqS156S0100000_6;
        this.l1 = c35858E5m;
        this.j2 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS13S0200100_6(C60292NlQ c60292NlQ, long j, InterfaceC88472Yns interfaceC88472Yns, int i) {
        super(1);
        this.$t = i;
        this.l0 = c60292NlQ;
        this.j2 = j;
        this.l1 = interfaceC88472Yns;
    }
}

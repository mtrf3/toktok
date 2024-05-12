package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.AbstractC73672Svk;
import X.C04270Et;
import X.C36311EMx;
import X.C36425ERh;
import X.C39745Fin;
import X.C68322mC;
import X.C76800UCe;
import X.E1T;
import X.EAO;
import X.FO6;
import X.FYO;
import X.InterfaceC65784Pro;
import X.LVL;
import X.PVJ;
import X.PVP;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.libcore.network.IExploreApi;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class AqS106S0101000_6 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS106S0101000_6 aqS106S0101000_6) {
        Drawable LIZIZ = C04270Et.LIZIZ((Context) aqS106S0101000_6.l0, aqS106S0101000_6.i1);
        if (LIZIZ != null) {
            FO6.LIZ.put(Integer.valueOf(aqS106S0101000_6.i1), LIZIZ);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS106S0101000_6 aqS106S0101000_6) {
        AbstractC73672Svk<String> reportSampled;
        PVJ LIZJ = PVP.LIZJ(C39745Fin.LIZJ("Content-Type, application/json"), new JSONObject().put("explore_type", aqS106S0101000_6.i1).toString());
        ((C36425ERh) aqS106S0101000_6.l0).getClass();
        IExploreApi iExploreApi = (IExploreApi) C36425ERh.LIZ.getValue();
        if (iExploreApi != null && (reportSampled = iExploreApi.reportSampled(LIZJ, FYO.LIZJ.invoke())) != null) {
            reportSampled.LJJJLIIL(E1T.LJLIL, EAO.LJLIL);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS106S0101000_6 aqS106S0101000_6) {
        LVL lvl = LVL.LJLIL;
        NoticeList noticeList = (NoticeList) aqS106S0101000_6.l0;
        int i = aqS106S0101000_6.i1;
        lvl.getClass();
        LVL.LJJIIJZLJL(noticeList, i);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$3(AqS106S0101000_6 aqS106S0101000_6) {
        T t;
        C68322mC c68322mC = (C68322mC) aqS106S0101000_6.l0;
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) ((LinkedHashMap) C36311EMx.LJII).get(Integer.valueOf(aqS106S0101000_6.i1));
        if (interfaceC65784Pro != null) {
            t = interfaceC65784Pro.invoke();
        } else {
            t = 0;
        }
        c68322mC.element = t;
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS106S0101000_6(C68322mC c68322mC, int i) {
        super(0);
        this.$t = i;
        this.l0 = c68322mC;
        this.i1 = 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS106S0101000_6(C36425ERh c36425ERh, int i) {
        super(0);
        this.$t = i;
        this.l0 = c36425ERh;
        this.i1 = 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS106S0101000_6(Context context, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = context;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS106S0101000_6(NoticeList noticeList, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = noticeList;
        this.i1 = i;
    }
}

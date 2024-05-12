package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C0H1;
import X.C198507qg;
import X.C2U8;
import X.C36636EZk;
import X.C50420Jqa;
import X.C57430MgM;
import X.C59962Wy;
import X.C60552Zf;
import X.C62912dT;
import X.C70402pY;
import X.C76800UCe;
import X.C780334l;
import X.EnumC57366MfK;
import X.InterfaceC65784Pro;
import X.InterfaceC789838c;
import X.ORZ;
import X.X1D;
import X.XKX;
import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.feed.experiment.SurfaceViewPage;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public class AqS39S1000000_1 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public String s0;

    @Override // X.InterfaceC65784Pro
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0();
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            default:
                return null;
        }
    }

    public final InterfaceC789838c invoke$0() {
        return RetrofitFactory.LIZLLL().create(this.s0);
    }

    public static final Object invoke$1(AqS39S1000000_1 aqS39S1000000_1) {
        XKX.LIZLLL(C780334l.LJLIL, C36636EZk.LIZ, null, new C62912dT(aqS39S1000000_1.s0, null), 2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS39S1000000_1 aqS39S1000000_1) {
        C50420Jqa c50420Jqa = new C50420Jqa(78);
        c50420Jqa.LJLJI = C0H1.LIZ("quick_share_aid", aqS39S1000000_1.s0);
        C2U8.LIZ(c50420Jqa);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS39S1000000_1 aqS39S1000000_1) {
        Integer num;
        C198507qg c198507qg = C198507qg.LIZIZ;
        if ((c198507qg.LJI() || c198507qg.LIZLLL()) && (num = (Integer) C59962Wy.LIZIZ().get(aqS39S1000000_1.s0)) != null && num.intValue() == 1) {
            C59962Wy.LIZIZ().put(aqS39S1000000_1.s0, 2);
            LiveData liveData = (LiveData) ((HashMap) C59962Wy.LIZJ.getValue()).get(aqS39S1000000_1.s0);
            if (liveData != null) {
                liveData.postValue(2);
            }
            C59962Wy.LIZ(2, aqS39S1000000_1.s0);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS39S1000000_1 aqS39S1000000_1) {
        SurfaceViewPage surfaceViewPage;
        List<String> list;
        boolean LJLJJI;
        if (TextUtils.isEmpty(aqS39S1000000_1.s0) || (surfaceViewPage = (SurfaceViewPage) C60552Zf.LIZ.getValue()) == null || (list = surfaceViewPage.pages) == null) {
            LJLJJI = false;
        } else {
            LJLJJI = ORZ.LJLJJI(aqS39S1000000_1.s0, list);
        }
        return Boolean.valueOf(LJLJJI);
    }

    public static final Object invoke$5(AqS39S1000000_1 aqS39S1000000_1) {
        C70402pY.LIZJ.add(aqS39S1000000_1.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS39S1000000_1 aqS39S1000000_1) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("submit instructionIds = ");
        LIZ.append(aqS39S1000000_1.s0);
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$7(AqS39S1000000_1 aqS39S1000000_1) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("triggerKey: ");
        LIZ.append(aqS39S1000000_1.s0);
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$8(AqS39S1000000_1 aqS39S1000000_1) {
        return new C57430MgM("chat", null, aqS39S1000000_1.s0, null, null, null, null, null, null, null, EnumC57366MfK.MESSAGE_CARD.getType(), null, null, "bottom", null, null, null, 0, 0, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, -9222, 511);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS39S1000000_1(String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
    }
}

package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C39048FUe;
import X.C39902FlK;
import X.C60737Nsb;
import X.C60757Nsv;
import X.C60905NvJ;
import X.C76800UCe;
import X.EnumC61028NxI;
import X.InterfaceC61488OBg;
import X.InterfaceC65784Pro;
import X.NDW;
import X.NDX;
import X.NDZ;
import com.bytedance.forest.model.RequestParams;

/* loaded from: classes11.dex */
public class AqS77S1100000_10 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS77S1100000_10 aqS77S1100000_10) {
        NDW ndw = NDZ.LIZIZ;
        if (!ndw.LIZLLL && o.LJ(aqS77S1100000_10.s0, ndw.LIZ)) {
            ((NDX) aqS77S1100000_10.l1).LIZ();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS77S1100000_10 aqS77S1100000_10) {
        InterfaceC61488OBg LIZIZ = C60905NvJ.LIZIZ((C60737Nsb) aqS77S1100000_10.l1, Boolean.TRUE);
        if (!(LIZIZ instanceof C39902FlK)) {
            LIZIZ = null;
        }
        C39902FlK c39902FlK = (C39902FlK) LIZIZ;
        if (c39902FlK == null) {
            C39048FUe.LIZIZ(C39048FUe.LIZIZ, "cannot get resource service", null, "LYNX_I18N", 2);
        } else {
            String LIZ = C60757Nsv.LIZ(aqS77S1100000_10.s0);
            RequestParams requestParams = new RequestParams(EnumC61028NxI.LYNX_I18N);
            requestParams.setWaitGeckoUpdate(true);
            requestParams.setNeedLocalFile(Boolean.FALSE);
            requestParams.setDisableCdn(true);
            requestParams.setChannel(aqS77S1100000_10.s0);
            requestParams.setBundle("lang.json");
            requestParams.setWaitLowStorageUpdate(true);
            c39902FlK.LJ(LIZ, requestParams, (C60737Nsb) aqS77S1100000_10.l1);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS77S1100000_10(C60737Nsb c60737Nsb, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c60737Nsb;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS77S1100000_10(String str, NDX ndx, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = ndx;
    }
}

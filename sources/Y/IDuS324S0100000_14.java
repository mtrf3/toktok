package Y;

import X.C61878OQg;
import X.C73433Srt;
import X.C82237WPh;
import X.C82256WQa;
import X.C82258WQc;
import X.C82259WQd;
import X.C83413WoT;
import X.InterfaceC73573Su9;
import X.InterfaceC86003Zc;
import X.WQO;
import com.bytedance.ies.actionai.jni.ActionAIPlatform;
import com.bytedance.ies.actionai.jni.SessionConfig;
import com.ss.android.ugc.aweme.actionai.sdk.ActionAISDKAgent;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes15.dex */
public class IDuS324S0100000_14 implements InterfaceC86003Zc {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<String> interfaceC73573Su9) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, interfaceC73573Su9);
                return;
            case 1:
                subscribe$1(this, interfaceC73573Su9);
                return;
            case 2:
                subscribe$2(this, interfaceC73573Su9);
                return;
            default:
                return;
        }
    }

    public IDuS324S0100000_14(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void subscribe$0(IDuS324S0100000_14 iDuS324S0100000_14, InterfaceC73573Su9 interfaceC73573Su9) {
        ActionAIPlatform actionAIPlatform = ((ActionAISDKAgent) iDuS324S0100000_14.l0).LJLILLLLZI;
        if (actionAIPlatform != null) {
            actionAIPlatform.initSession((SessionConfig) ActionAISDKAgent.LJLJJL.getValue(), new C83413WoT((C73433Srt) interfaceC73573Su9));
        }
    }

    public static final void subscribe$1(IDuS324S0100000_14 iDuS324S0100000_14, InterfaceC73573Su9 interfaceC73573Su9) {
        C82256WQa c82256WQa = (C82256WQa) iDuS324S0100000_14.l0;
        c82256WQa.getClass();
        interfaceC73573Su9.onNext(new WQO(new C82237WPh(c82256WQa.LIZJ.LIZIZ(), C61878OQg.INSTANCE), true));
        interfaceC73573Su9.onComplete();
    }

    public static final void subscribe$2(IDuS324S0100000_14 iDuS324S0100000_14, InterfaceC73573Su9 interfaceC73573Su9) {
        AtomicInteger atomicInteger = new AtomicInteger();
        C82258WQc c82258WQc = (C82258WQc) iDuS324S0100000_14.l0;
        c82258WQc.LJLIL.LJFF.LIZ(c82258WQc.LJLILLLLZI, c82258WQc.LJLJI, new C82259WQd(iDuS324S0100000_14, (C73433Srt) interfaceC73573Su9, atomicInteger));
    }
}

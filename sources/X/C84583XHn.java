package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.agilelogger.ALog;
import kotlin.jvm.internal.o;

/* renamed from: X.XHn, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84583XHn extends AbstractC65781Prl implements InterfaceC88472Yns<XGQ, C76800UCe> {
    public static final C84583XHn LJLIL = new C84583XHn();

    public C84583XHn() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(XGQ xgq) {
        XGQ initGlobalContext = xgq;
        o.LJIIIZ(initGlobalContext, "$this$initGlobalContext");
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        initGlobalContext.LIZ = initGlobalContext.LIZ.LIZJ(new XH7(C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str)));
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("Mota", "MotaInitTask setRetrofitInstance");
        return C76800UCe.LIZ;
    }
}

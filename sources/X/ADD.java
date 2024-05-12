package X;

import com.ss.android.ugc.aweme.creatortools.api.ProAccountApi;
import com.ss.android.ugc.aweme.creatortools.api.ShowCaseModel;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ADD {
    public static ShowCaseModel LIZ;

    public static void LIZ(ADV adv, C73318Sq2 compositeDisposable, boolean z) {
        Object obj;
        o.LJIIIZ(compositeDisposable, "compositeDisposable");
        if (!C25750A8s.LIZ() || !((RBX) HG3.LJIILL()).isLogin()) {
            return;
        }
        ProAccountApi.LIZ.getClass();
        InterfaceC789838c create = C46104I7o.LJJII().create("https://oec-api.tiktokv.com");
        if (create != null) {
            obj = create.create(ProAccountApi.class);
        } else {
            obj = null;
        }
        o.LJI(obj);
        ((ProAccountApi) obj).getShowCaseResp().LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new ADC(adv, compositeDisposable, z));
    }
}

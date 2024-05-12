package X;

import com.ss.android.ugc.aweme.data.HybridABApi;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E6Z<T> implements InterfaceC86003Zc {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ E71 LJLILLLLZI;

    public E6Z(String str, E71 e71) {
        this.LJLIL = str;
        this.LJLILLLLZI = e71;
    }

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<HybridABApi.HybridABBody> interfaceC73573Su9) {
        List list;
        try {
            list = C38705FGz.LIZIZ();
            if (list == null) {
                list = C61878OQg.INSTANCE;
            }
        } catch (Throwable th) {
            String featureName = this.LJLIL;
            String errorMsg = th.toString();
            o.LJIIIZ(featureName, "featureName");
            o.LJIIIZ(errorMsg, "errorMsg");
            C188727au c188727au = new C188727au();
            c188727au.LIZLLL(E73.LIZ() ? 1 : 0, "is_cold_start_first_launch");
            c188727au.LJIIIZ("feature_name", featureName);
            c188727au.LJIIIZ("error_message", errorMsg);
            FMX.LJIIL("hybrid_ab_collect_vid_error", c188727au.LIZ);
            list = C61878OQg.INSTANCE;
        }
        E71 e71 = this.LJLILLLLZI;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String str = (String) obj;
            e71.getClass();
            if (str != null && C38350F3i.LJJIL(str) != null) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() < list.size()) {
            List LLIIIILZ = ORZ.LLIIIILZ(list, ORZ.LLJJ(arrayList));
            String str2 = this.LJLIL;
            String LLD = ORZ.LLD(LLIIIILZ, ",", null, null, null, 62);
            C188727au LIZLLL = KNV.LIZLLL(str2, "featureName");
            LIZLLL.LIZLLL(E73.LIZ() ? 1 : 0, "is_cold_start_first_launch");
            LIZLLL.LJIIIZ("feature_name", str2);
            LIZLLL.LJIIIZ("error_vids", LLD);
            FMX.LJIIL("hybrid_ab_vid_error", LIZLLL.LIZ);
        }
        interfaceC73573Su9.onNext(new HybridABApi.HybridABBody(ORZ.LLD(arrayList, ",", null, null, null, 62)));
        interfaceC73573Su9.onComplete();
    }
}

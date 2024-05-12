package Y;

import X.AbstractC73672Svk;
import X.C1DG;
import X.C41363GLf;
import X.C41802Gas;
import X.C41958GdO;
import X.C42611Gnv;
import X.C60903NvH;
import X.C76L;
import X.C82237WPh;
import X.EnumC169566l6;
import X.GUH;
import X.GUQ;
import X.GUU;
import X.GVA;
import X.H0V;
import X.RunnableC65751PrH;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.out.AVServiceImpl;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.ss.android.ugc.aweme.uploader.retrofit.UploaderRetrofitService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class ACallableS42S0000000_7 implements Callable {
    public final int $t;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            default:
                return null;
        }
    }

    public ACallableS42S0000000_7(int i) {
        this.$t = i;
    }

    public static final Object call$0(ACallableS42S0000000_7 aCallableS42S0000000_7) {
        UploaderRetrofitService uploaderRetrofitService = (UploaderRetrofitService) C60903NvH.LJIIJJI().getNetworkService().createRetrofit(AVApiImpl.LIZJ().LIZ(), true, UploaderRetrofitService.class);
        HashMap hashMap = new HashMap(0);
        long currentTimeMillis = System.currentTimeMillis();
        C76L<UploadAuthKeyConfig> uploadAuthKeyConfig = uploaderRetrofitService.getUploadAuthKeyConfig(hashMap);
        H0V h0v = new H0V(currentTimeMillis);
        uploadAuthKeyConfig.LJFF(new RunnableC65751PrH(uploadAuthKeyConfig, h0v), EnumC169566l6.LJLIL);
        return null;
    }

    public static final Object call$1(ACallableS42S0000000_7 aCallableS42S0000000_7) {
        AwemeDraft LJ;
        String str;
        GUU guu;
        List<String> LIZJ = C60903NvH.LJIIJJI().getPublishService().LJIILIIL().LIZJ();
        if (LIZJ.isEmpty()) {
            return null;
        }
        int i = 0;
        do {
            String str2 = (String) ListProtector.get(LIZJ, i);
            if (TextUtils.isEmpty(str2)) {
                return null;
            }
            LJ = C1DG.LJFF().LJ(new C41363GLf(new CreativeInfo(str2), true));
            if ((LJ == null || !C41802Gas.LJII(LJ) || C41802Gas.LJI(LJ)) && !GUH.LJIJI(str2)) {
                if (str2 != null) {
                    GUQ guq = GUH.LJI;
                    if (guq != null && (guu = guq.LJLJJL) != null) {
                        str = guu.LIZIZ;
                    } else {
                        str = null;
                    }
                    if (!o.LJ(str, str2)) {
                        break;
                    }
                } else if (GUH.LJI == null) {
                    break;
                }
            }
            C60903NvH.LJIIJJI().getPublishService().LJIILIIL();
            C41958GdO.LJIILJJIL(str2);
            LJ = null;
            i++;
        } while (i < LIZJ.size());
        AbstractC73672Svk<C82237WPh> LIZIZ = C60903NvH.LJIIJJI().LJIILL().LJ().LIZIZ();
        if (LJ != null && GVA.LIZJ(LJ)) {
            new C82237WPh(new ArrayList(), new ArrayList());
            LIZIZ.getClass();
            C42611Gnv c42611Gnv = new C42611Gnv();
            LIZIZ.LIZ(c42611Gnv);
            c42611Gnv.LIZ();
        }
        return LJ;
    }

    public static final Object call$2(ACallableS42S0000000_7 aCallableS42S0000000_7) {
        AVServiceImpl.LIZ().tryCopyDuetDefaultLayout();
        return null;
    }
}

package com.ss.android.ugc.aweme.spark;

import X.AbstractC40201Fq9;
import X.AbstractC59064NGa;
import X.C16880lQ;
import X.C38312F1w;
import X.C39900FlI;
import X.C39912FlU;
import X.C40171Fpf;
import X.C40205FqD;
import X.C40342FsQ;
import X.C40343FsR;
import X.C52205KeH;
import X.C58096Mr6;
import X.C58582Rq;
import X.C59066NGc;
import X.C59421NTt;
import X.C59802NdW;
import X.EnumC59053NFp;
import X.EnumC59241NMv;
import X.InterfaceC60819Ntv;
import X.M2K;
import X.NGQ;
import X.NGY;
import X.NIA;
import X.NLX;
import X.NVO;
import X.NVQ;
import X.NVR;
import X.NVU;
import X.NVV;
import X.NZ1;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridContainerManager;
import com.ss.android.ugc.aweme.commercialize.hybrid.impl.AdHybridContainerManager;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AdSparkUtils implements IAdSparkUtils {
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);

    public static IAdSparkUtils LJFF() {
        Object LIZ2 = C58096Mr6.LIZ(IAdSparkUtils.class, false);
        if (LIZ2 != null) {
            return (IAdSparkUtils) LIZ2;
        }
        if (C58096Mr6.g7 == null) {
            synchronized (IAdSparkUtils.class) {
                if (C58096Mr6.g7 == null) {
                    C58096Mr6.g7 = new AdSparkUtils();
                }
            }
        }
        return C58096Mr6.g7;
    }

    public AdSparkUtils() {
        if (!LIZ.compareAndSet(false, true)) {
            return;
        }
        ((ArrayList) C39900FlI.LIZ).add(new C39912FlU());
    }

    @Override // com.ss.android.ugc.aweme.spark.IAdSparkUtils
    public final AdSparkFragment LIZJ(boolean z) {
        return new AdSparkFragment(z);
    }

    @Override // com.ss.android.ugc.aweme.spark.IAdSparkUtils
    public final void LIZ(SparkContext sparkContext, String str) {
        o.LJIIIZ(sparkContext, "sparkContext");
        if (str == null || ujb.o.LJJJJJL(str)) {
            C58582Rq.LIZ("no ak, please confirm", null);
            if (str == null) {
                return;
            }
        }
        sparkContext.LJII(AbstractC40201Fq9.class, new C40205FqD(str));
    }

    @Override // com.ss.android.ugc.aweme.spark.IAdSparkUtils
    public final void LIZIZ(SparkContext sparkContext, Bundle bundle) {
        o.LJIIIZ(sparkContext, "sparkContext");
        if (bundle != null) {
            for (String key : bundle.keySet()) {
                if (!o.LJ("url", key)) {
                    Object LLJJIII = C16880lQ.LLJJIII(bundle, key);
                    if (LLJJIII instanceof Boolean) {
                        o.LJIIIIZZ(key, "key");
                        sparkContext.LJJIIJZLJL(key, ((Boolean) LLJJIII).booleanValue());
                    } else if (LLJJIII instanceof Double) {
                        o.LJIIIIZZ(key, "key");
                        sparkContext.LJJII(key, ((Number) LLJJIII).doubleValue());
                    } else if (LLJJIII instanceof Integer) {
                        o.LJIIIIZZ(key, "key");
                        sparkContext.LJJIFFI(((Number) LLJJIII).intValue(), key);
                    } else if (LLJJIII instanceof String) {
                        o.LJIIIIZZ(key, "key");
                        sparkContext.LJJIIJ(key, (String) LLJJIII);
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.spark.IAdSparkUtils
    public final AdSparkContext LJ(Context context, String str, Bundle bundle, Map<String, String> map, boolean z) {
        o.LJIIIZ(context, "context");
        NVO nvo = new NVO(0);
        AdSparkContext adSparkContext = new AdSparkContext();
        if (str != null) {
            adSparkContext.LJJIJLIJ(str);
        }
        adSparkContext.LJJIL(new C38312F1w(this, context, bundle));
        adSparkContext.LJJIL(nvo);
        adSparkContext.LJJIJIIJI(new NVU(nvo));
        if (!z) {
            adSparkContext.LJII(M2K.class, new C40171Fpf());
        }
        adSparkContext.LJII(NZ1.class, nvo);
        adSparkContext.LJII(Bundle.class, bundle);
        adSparkContext.LJII(InterfaceC60819Ntv.class, new C59802NdW(adSparkContext, str, bundle, nvo, map, context, this));
        adSparkContext.LJJIJL(nvo);
        return adSparkContext;
    }

    @Override // com.ss.android.ugc.aweme.spark.IAdSparkUtils
    public final void LIZLLL(Context context, String url, Bundle bundle, String str, boolean z, boolean z2) {
        Bundle bundle2;
        String str2;
        String str3;
        Integer num;
        Integer num2;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(url, "url");
        if (!C52205KeH.LIZ()) {
            AdSparkContext LIZ2 = NGQ.LIZ(this, context, url, bundle, z2, 8);
            LIZIZ(LIZ2, bundle);
            if (z) {
                LIZ2.LJJIIJZLJL("use_forest", true);
                if (str != null) {
                    LIZ2.LJJIIJ("access_key", str);
                }
            } else {
                LIZ(LIZ2, str);
            }
            C40343FsR.LJIILJJIL.getClass();
            C40342FsQ.LIZ(context, LIZ2).LIZIZ();
            return;
        }
        NVO nvo = new NVO(0);
        EnumC59053NFp enumC59053NFp = EnumC59053NFp.ONLY_RENDER;
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = bundle;
        }
        String str4 = null;
        C59421NTt c59421NTt = new C59421NTt(enumC59053NFp, "", 0, false, new NIA("landing_page_1p", url, bundle2, str, new NLX(nvo), false, null, false, 992), null, z2, 92);
        IAdHybridContainerManager LIZLLL = AdHybridContainerManager.LIZLLL();
        EnumC59241NMv enumC59241NMv = EnumC59241NMv.SPARK;
        if (bundle != null) {
            str4 = bundle.getString("aweme_creative_id");
            str2 = bundle.getString("bundle_download_app_log_extra");
            str3 = bundle.getString("aweme_group_id");
            num = Integer.valueOf(bundle.getInt("charge_type"));
            num2 = Integer.valueOf(bundle.getInt("ad_system_origin"));
        } else {
            str2 = null;
            str3 = null;
            num = null;
            num2 = null;
        }
        AbstractC59064NGa LIZJ = LIZLLL.LIZJ(new C59066NGc("landing_page_1p", enumC59241NMv, context, new NGY(str4, str2, str3, num, num2, 32)), c59421NTt);
        LIZJ.LJIILJJIL(new NVV(nvo));
        LIZJ.LJIIZILJ(new NVR(nvo));
        LIZJ.LJIILL(new NVQ(nvo));
        LIZJ.LJIJJLI(c59421NTt);
    }
}

package X;

import android.net.Uri;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.AqS137S0200000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.Fuw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40498Fuw {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(SparkContext hybridContext, AbstractC50884Jy4 abstractC50884Jy4, Forest forest) {
        Forest forest2;
        o.LJIIJ(hybridContext, "hybridContext");
        Uri.Builder buildUpon = UriProtector.parse(hybridContext.url).buildUpon();
        if (!o.LJ(UriProtector.getQueryParameter(r0, "enable_memory_cache"), "1")) {
            buildUpon.appendQueryParameter("enable_memory_cache", "1");
        }
        String uri = buildUpon.build().toString();
        o.LJFF(uri, "uriBuilder.build().toString()");
        hybridContext.url = uri;
        HybridSchemaParam LJJIIZI = C1XY.LJJIIZI(uri);
        hybridContext.resourcePreloadTriggered = true;
        Object obj = forest;
        if (forest == null) {
            try {
                obj = C60905NvJ.LIZIZ(hybridContext, Boolean.TRUE);
            } catch (Throwable th) {
                abstractC50884Jy4.LJ(th.toString());
                return;
            }
        }
        if (!(obj instanceof Forest)) {
            if (obj instanceof C39902FlK) {
                forest2 = ((C39902FlK) obj).LIZ;
            } else {
                abstractC50884Jy4.LJ("ResourceLoader Not Found!");
                forest2 = null;
            }
        } else {
            forest2 = (Forest) obj;
        }
        RequestParams requestParams = new RequestParams(EnumC61028NxI.LYNX_TEMPLATE);
        requestParams.setLoadToMemory(true);
        requestParams.setNeedLocalFile(Boolean.FALSE);
        requestParams.getCustomParams().put("rl_container_uuid", hybridContext.containerId);
        requestParams.setAllowIOOnMainThread(true);
        C60905NvJ.LJII(requestParams, LJJIIZI);
        String LIZJ = C60905NvJ.LIZJ(LJJIIZI, uri, true);
        if (true ^ o.LJ(LIZJ, uri)) {
            requestParams.getCustomParams().put("resource_url", uri);
        }
        if (forest2 != null) {
            forest2.fetchResourceAsync(LIZJ, requestParams, new AqS137S0200000_6(abstractC50884Jy4, hybridContext, 36));
        } else {
            abstractC50884Jy4.LJ("ResourceLoader Not Found!");
        }
    }
}

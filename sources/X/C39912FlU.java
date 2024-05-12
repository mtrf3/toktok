package X;

import com.bytedance.forest.model.RequestParams;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.spark.AdSparkContext;
import kotlin.jvm.internal.o;

/* renamed from: X.FlU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39912FlU implements InterfaceC39901FlJ {
    @Override // X.InterfaceC39901FlJ
    public final void LIZ(C61295O3v response) {
        o.LJIIIZ(response, "response");
    }

    @Override // X.InterfaceC39901FlJ
    public final void LIZIZ(String url, RequestParams requestParams) {
        C60737Nsb c60737Nsb;
        SparkContext sparkContext;
        Object LIZ;
        Object LIZ2;
        String str;
        o.LJIIIZ(url, "url");
        o.LJIIIZ(requestParams, "requestParams");
        if (requestParams.getResourceScene() != EnumC61028NxI.LYNX_IMAGE) {
            return;
        }
        Object obj = requestParams.getCustomParams().get("rl_container_uuid");
        Object obj2 = null;
        if ((obj instanceof String) && (str = (String) obj) != null) {
            SparkContext.Companion.getClass();
            c60737Nsb = C39359FcZ.LIZIZ(str);
        } else {
            c60737Nsb = null;
        }
        if (!(c60737Nsb instanceof AdSparkContext) || (sparkContext = (SparkContext) c60737Nsb) == null) {
            return;
        }
        if (requestParams.getChannel() != null && requestParams.getBundle() != null) {
            return;
        }
        android.net.Uri parse = UriProtector.parse(url);
        try {
            LIZ = UriProtector.getQueryParameter(parse, "channel");
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        String str2 = (String) LIZ;
        if (str2 == null) {
            return;
        }
        try {
            LIZ2 = UriProtector.getQueryParameter(parse, "bundle");
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th2) {
            LIZ2 = C141335gf.LIZ(th2);
            C3C5.m7constructorimpl(LIZ2);
        }
        if (!C3C5.m12isFailureimpl(LIZ2)) {
            obj2 = LIZ2;
        }
        String str3 = (String) obj2;
        if (str3 == null) {
            return;
        }
        String str4 = sparkContext.defaultParams.get("access_key");
        if (str4 == null) {
            str4 = "";
        }
        requestParams.setAccessKey(str4);
        requestParams.setChannel(str2);
        requestParams.setBundle(str3);
    }
}

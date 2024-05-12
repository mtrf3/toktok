package X;

import android.text.TextUtils;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostThreadPoolExecutorDepend;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* renamed from: X.Xyp, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86603Xyp extends AbstractC86612Xyy {
    public static final ExecutorService LJII() {
        IHostThreadPoolExecutorDepend iHostThreadPoolExecutorDepend;
        ExecutorService normalThreadExecutor;
        C86291Xtn c86291Xtn = C86291Xtn.LJIIL;
        if (c86291Xtn != null && (iHostThreadPoolExecutorDepend = c86291Xtn.LJIIJ) != null && (normalThreadExecutor = iHostThreadPoolExecutorDepend.getNormalThreadExecutor()) != null) {
            return normalThreadExecutor;
        }
        ExecutorService executorService = C38016Ew0.LIZ;
        o.LJIIIIZZ(executorService, "getNormalExecutor()");
        return executorService;
    }

    public static IHostNetworkDepend LJIIIIZZ() {
        IHostNetworkDepend iHostNetworkDepend;
        C86291Xtn c86291Xtn = C86291Xtn.LJIIL;
        if (c86291Xtn == null || (iHostNetworkDepend = c86291Xtn.LJIIIIZZ) == null) {
            return new C65084PgW();
        }
        return iHostNetworkDepend;
    }

    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        HashMap hashMap;
        int i;
        InterfaceC86610Xyw interfaceC86610Xyw = (InterfaceC86610Xyw) xBaseParamModel;
        o.LJIIIZ(type, "type");
        C37990Eva c37990Eva = C37990Eva.LIZ;
        String jsbSecureDataflowId = interfaceC86610Xyw.getJsbSecureDataflowId();
        String str = this.LJLILLLLZI;
        c37990Eva.getClass();
        OSJ LIZ = C37990Eva.LIZ(jsbSecureDataflowId, str);
        Integer num = (Integer) LIZ.getSecond();
        if (num == null) {
            C31626Cb8.LIZ(c37356ElM, 0, (String) LIZ.getThird(), 4);
            return;
        }
        String url = interfaceC86610Xyw.getUrl();
        java.util.Map<String, Object> header = interfaceC86610Xyw.getHeader();
        if (header == null) {
            header = new LinkedHashMap<>();
        }
        String method = interfaceC86610Xyw.getMethod();
        String bodyType = interfaceC86610Xyw.getBodyType();
        Object body = interfaceC86610Xyw.getBody();
        boolean LJ = o.LJ(interfaceC86610Xyw.getDisableRedirect(), Boolean.TRUE);
        java.util.Map<String, Object> params = interfaceC86610Xyw.getParams();
        if (params instanceof HashMap) {
            hashMap = (HashMap) params;
        } else {
            hashMap = null;
        }
        Number jsonFormatOption = interfaceC86610Xyw.getJsonFormatOption();
        if (jsonFormatOption != null) {
            i = jsonFormatOption.intValue();
        } else {
            i = 0;
        }
        if (TextUtils.isEmpty(interfaceC86610Xyw.getUrl())) {
            LJIIIZ(-3, method, interfaceC86610Xyw.getUrl(), "Illegal empty url", 0, type.name());
            C31626Cb8.LIZ(c37356ElM, -3, "url is empty", 4);
        } else {
            LJII().execute(new RunnableC86596Xyi(header, interfaceC86610Xyw, hashMap, type, this, method, body, bodyType, i, LJ, num, LJ(type), c37356ElM, url));
        }
    }

    public final void LJIIIZ(int i, String str, String str2, String str3, Integer num, String str4) {
        LJII().execute(new RunnableC59962Ng6(str4, this, str2, i, str3, str, num));
    }
}

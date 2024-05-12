package X;

import com.bytedance.mt.protector.impl.UriProtector;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EA7 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public static final EA7 LJLIL = new EA7();

    public EA7() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        java.util.Set<String> queryParameterNames;
        String queryParameter;
        android.net.Uri uri = (android.net.Uri) obj;
        o.LJIIJ(uri, "uri");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("__AUTHORITY__", uri.getAuthority());
        linkedHashMap.put("__PATH__", uri.getPath());
        if (uri.isHierarchical() && (queryParameterNames = UriProtector.getQueryParameterNames(uri)) != null) {
            for (String str : queryParameterNames) {
                if (str != null && (queryParameter = UriProtector.getQueryParameter(uri, str)) != null) {
                    linkedHashMap.put(str, queryParameter);
                }
            }
        }
        return new EA8(java.util.Map.class, linkedHashMap);
    }
}

package com.ss.android.ugc.aweme.ecommerce.core.router;

import X.C38995FSd;
import X.C47117IeP;
import X.C62712d9;
import X.C70851RrL;
import X.C77275UUl;
import X.X1D;
import Y.ARunnableS48S0100000_12;
import android.content.Context;
import android.net.Uri;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class EcomSchemaFallbackInterceptor implements IInterceptor {
    public static final Set<String> LJLJI = C77275UUl.LJIIIIZZ("aweme://ec/pdp", "aweme://ec/sku", "aweme://ec/store", "aweme://ec/showcase", "aweme://ec/shop_message", "aweme://ec/delivery", "aweme://ec/address/list", "aweme://ec/address/edit", "aweme://ec/channel/racun", "aweme://ec/order_center");
    public volatile boolean LJLIL;
    public volatile HashMap<String, SchemaFallbackConfig> LJLILLLLZI;

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    public final void LIZ() {
        HashMap<String, SchemaFallbackConfig> hashMap = new HashMap<>();
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        SchemaFallbackConfig[] schemaFallbackConfigArr = C70851RrL.LIZ;
        SchemaFallbackConfig[] schemaFallbackConfigArr2 = (SchemaFallbackConfig[]) LIZLLL.LJIIIIZZ("ecom_schema_fallback_config", SchemaFallbackConfig[].class, schemaFallbackConfigArr);
        if (schemaFallbackConfigArr2 != null) {
            schemaFallbackConfigArr = schemaFallbackConfigArr2;
        }
        ArrayList arrayList = new ArrayList();
        for (SchemaFallbackConfig schemaFallbackConfig : schemaFallbackConfigArr) {
            if (LJLJI.contains(schemaFallbackConfig.getKey())) {
                arrayList.add(schemaFallbackConfig);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            SchemaFallbackConfig schemaFallbackConfig2 = (SchemaFallbackConfig) it.next();
            hashMap.put(schemaFallbackConfig2.getKey(), schemaFallbackConfig2);
        }
        this.LJLILLLLZI = hashMap;
        this.LJLIL = true;
    }

    public EcomSchemaFallbackInterceptor() {
        C38995FSd.LIZJ().execute(new ARunnableS48S0100000_12(this, 27));
    }

    public static String LIZIZ(Uri uri) {
        StringBuilder sb = new StringBuilder();
        String scheme = uri.getScheme();
        if (scheme != null && scheme.length() > 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(uri.getScheme());
            LIZ.append("://");
            sb.append(X1D.LIZIZ(LIZ));
        }
        String authority = uri.getAuthority();
        if (authority != null && authority.length() > 0) {
            sb.append(uri.getAuthority());
        }
        String path = uri.getPath();
        if (path != null && path.length() > 0) {
            sb.append(uri.getPath());
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "sb.toString()");
        return sb2;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        Uri uri;
        if (routeIntent != null) {
            uri = routeIntent.getUri();
        } else {
            uri = null;
        }
        if (uri == null) {
            return false;
        }
        if (!this.LJLIL) {
            LIZ();
        }
        HashMap<String, SchemaFallbackConfig> hashMap = this.LJLILLLLZI;
        if (hashMap != null) {
            if (hashMap.isEmpty()) {
                return false;
            }
            Uri uri2 = routeIntent.getUri();
            o.LJIIIIZZ(uri2, "routeIntent.uri");
            String LIZIZ = LIZIZ(uri2);
            HashMap<String, SchemaFallbackConfig> hashMap2 = this.LJLILLLLZI;
            if (hashMap2 != null) {
                if (hashMap2.get(LIZIZ) == null || UriProtector.getQueryParameterNames(routeIntent.getUri()).contains("fallback")) {
                    return false;
                }
                return true;
            }
            o.LJIJI("configMap");
            throw null;
        }
        o.LJIJI("configMap");
        throw null;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Uri uri;
        if (routeIntent != null) {
            uri = routeIntent.getUri();
        } else {
            uri = null;
        }
        if (uri == null) {
            return false;
        }
        Uri uri2 = routeIntent.getUri();
        o.LJIIIIZZ(uri2, "uri");
        String LIZIZ = LIZIZ(uri2);
        HashMap<String, SchemaFallbackConfig> hashMap = this.LJLILLLLZI;
        if (hashMap != null) {
            SchemaFallbackConfig schemaFallbackConfig = hashMap.get(LIZIZ);
            if (schemaFallbackConfig != null) {
                Uri.Builder builder = new Uri.Builder();
                Uri.Builder encodedPath = builder.scheme(uri2.getScheme()).encodedAuthority(uri2.getAuthority()).encodedPath(uri2.getPath());
                Iterator LIZ = C47117IeP.LIZ(uri2, "uri.queryParameterNames");
                while (LIZ.hasNext()) {
                    String str = (String) LIZ.next();
                    encodedPath.appendQueryParameter(str, UriProtector.getQueryParameter(uri2, str));
                }
                builder.appendQueryParameter("fallback", schemaFallbackConfig.getFallback());
                routeIntent.setUrl(builder.build().toString());
            }
            return false;
        }
        o.LJIJI("configMap");
        throw null;
    }
}

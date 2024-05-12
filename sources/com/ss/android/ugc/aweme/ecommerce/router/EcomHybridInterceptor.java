package com.ss.android.ugc.aweme.ecommerce.router;

import X.C62712d9;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EcomHybridInterceptor implements IInterceptor {
    public static final Uri LJLIL;

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    static {
        Uri parse = UriProtector.parse("aweme://echybrid");
        o.LJIIIIZZ(parse, "parse(ECRouteConst.EC_HYBRID_ROUTE)");
        LJLIL = parse;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        Uri uri;
        if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
            String scheme = uri.getScheme();
            Uri uri2 = LJLIL;
            if (TextUtils.equals(scheme, uri2.getScheme()) && TextUtils.equals(uri.getAuthority(), uri2.getAuthority()) && TextUtils.equals(uri.getPath(), uri2.getPath())) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d2  */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptRoute(android.content.Context r8, com.bytedance.router.RouteIntent r9) {
        /*
            r7 = this;
            if (r9 == 0) goto La4
            android.net.Uri r2 = r9.getUri()
            if (r2 == 0) goto La4
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            java.lang.String r1 = "bullet"
            android.net.Uri$Builder r0 = r0.scheme(r1)
            android.net.Uri$Builder r4 = r0.encodedAuthority(r1)
            java.lang.String r0 = "originUri.queryParameterNames"
            java.util.Iterator r3 = X.C47117IeP.LIZ(r2, r0)
        L1d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L31
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r2, r1)
            r4.appendQueryParameter(r1, r0)
            goto L1d
        L31:
            android.net.Uri r4 = r4.build()
            java.lang.String r0 = "targetUri"
            kotlin.jvm.internal.o.LJIIIIZZ(r4, r0)
            java.lang.String r0 = "aweme"
            android.net.Uri r3 = X.E98.LIZ(r4, r0)
            boolean r0 = r8 instanceof X.ActivityC45651qj
            if (r0 == 0) goto L59
            r1 = r8
            X.1qj r1 = (X.ActivityC45651qj) r1
            androidx.fragment.app.FragmentManager r0 = r1.getSupportFragmentManager()
            boolean r0 = r0.mDestroyed
            if (r0 != 0) goto L59
            androidx.fragment.app.FragmentManager r0 = r1.getSupportFragmentManager()
            boolean r0 = r0.LJJJLZIJ()
            if (r0 == 0) goto Ld4
        L59:
            r5 = 0
        L5a:
            java.lang.String r0 = "is_large_half"
            java.lang.String r1 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r2, r0)
            if (r1 == 0) goto Ld2
            java.lang.String r0 = "1"
            boolean r6 = kotlin.jvm.internal.o.LJ(r1, r0)
        L68:
            java.lang.String r0 = "container_height"
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r2, r0)
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto Lcf
            java.lang.Float r0 = X.C38350F3i.LJJIJLIJ(r0)
            if (r0 == 0) goto Lcf
            r0.floatValue()
            float r1 = r0.floatValue()
        L7f:
            X.Fox r0 = X.C40127Fox.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.ecommerce.ab.SparkSwitchConfig r0 = X.C40127Fox.LIZ()
            boolean r0 = r0.enableSparkContainer
            if (r0 == 0) goto L8d
            r4 = r3
        L8d:
            java.lang.String r3 = "finalTargetUri.toString()"
            if (r5 == 0) goto Lbe
            if (r6 == 0) goto La6
            com.ss.android.ugc.aweme.ecommerce.service.ICommerceHybridBottomSheetDialogFragmentBehavior r2 = com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceHybridBottomSheetDialogFragmentBehaviorImpl.LIZIZ()
            float r0 = X.C27162AlK.LIZJ
            int r1 = (int) r0
            java.lang.String r0 = r4.toString()
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r3)
            r2.LIZ(r4, r1, r5, r0)
        La4:
            r0 = 1
            return r0
        La6:
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 >= 0) goto Lbe
            com.ss.android.ugc.aweme.ecommerce.service.ICommerceHybridBottomSheetDialogFragmentBehavior r2 = com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceHybridBottomSheetDialogFragmentBehaviorImpl.LIZIZ()
            int r0 = X.C27162AlK.LIZIZ
            float r0 = (float) r0
            float r0 = r0 * r1
            int r1 = (int) r0
            java.lang.String r0 = r4.toString()
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r3)
            r2.LIZ(r4, r1, r5, r0)
            goto La4
        Lbe:
            if (r8 == 0) goto La4
            com.ss.android.ugc.aweme.bullet.api.IBulletService r1 = com.ss.android.ugc.aweme.bullet.impl.BulletService.LIZ()
            java.lang.String r0 = r4.toString()
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r3)
            r1.LJIIIIZZ(r8, r0)
            goto La4
        Lcf:
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L7f
        Ld2:
            r6 = 0
            goto L68
        Ld4:
            androidx.fragment.app.FragmentManager r5 = r1.getSupportFragmentManager()
            goto L5a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.router.EcomHybridInterceptor.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }
}

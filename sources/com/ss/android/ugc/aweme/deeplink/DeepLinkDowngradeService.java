package com.ss.android.ugc.aweme.deeplink;

import X.CU2;
import X.M5X;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class DeepLinkDowngradeService implements IDeepLinkService {
    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final Class<? extends Activity> LIZIZ() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LIZJ(String scheme) {
        o.LJIIIZ(scheme, "scheme");
        return false;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LIZLLL(Context context) {
        o.LJIIIZ(context, "context");
        return false;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJ(Activity activity, String minAppVersion, String uriToGo) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(minAppVersion, "minAppVersion");
        o.LJIIIZ(uriToGo, "uriToGo");
        return false;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String LJFF(Context context) {
        o.LJIIIZ(context, "context");
        return "";
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJI(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void LJII() {
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String LJIIIIZZ(Uri uri) {
        o.LJIIIZ(uri, "uri");
        return "";
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String LJIIIZ() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final Class<? extends Activity> LJIIJ() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJIIJJI() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final Class<? extends Activity> LJIIL() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJIILIIL(String str, String str2) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String LJIILJJIL(String url) {
        o.LJIIIZ(url, "url");
        return null;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String LJIILL() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String LJIILLIIL() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final Class<? extends Activity> LJIIZILJ() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJIJ(Uri uri) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void LJIJI(Activity activity, String str) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String LJIJJ() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String LJIJJLI(String url) {
        o.LJIIIZ(url, "url");
        return "";
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void LJIL(String str, String str2, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void LJJ(String tag, String extraResult) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(extraResult, "extraResult");
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final long LJJI() {
        return 0L;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJIFFI(Activity activity, String str, boolean z) {
        o.LJIIIZ(activity, "activity");
        return false;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void LJJII(M5X m5x, CU2 config) {
        o.LJIIIZ(config, "config");
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String getCustomScheme() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean isDeepLinkHandlerActivity(Context context) {
        o.LJIIIZ(context, "context");
        return false;
    }
}

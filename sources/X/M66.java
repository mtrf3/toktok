package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.deeplink.DeepLinkServiceImpl;
import com.ss.android.ugc.aweme.deeplink.IDeepLinkService;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M66 implements IDeepLinkService {
    public static final M66 LIZIZ = new M66();
    public final /* synthetic */ IDeepLinkService LIZ = DeepLinkServiceImpl.LIZ();

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final Class<? extends Activity> LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LIZJ(String scheme) {
        o.LJIIIZ(scheme, "scheme");
        return this.LIZ.LIZJ(scheme);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LIZLLL(Context context) {
        o.LJIIIZ(context, "context");
        return this.LIZ.LIZLLL(context);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJ(Activity activity, String minAppVersion, String uriToGo) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(minAppVersion, "minAppVersion");
        o.LJIIIZ(uriToGo, "uriToGo");
        return this.LIZ.LJ(activity, minAppVersion, uriToGo);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String LJFF(Context context) {
        o.LJIIIZ(context, "context");
        return this.LIZ.LJFF(context);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJI(String str) {
        return this.LIZ.LJI(str);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void LJII() {
        this.LIZ.LJII();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String LJIIIIZZ(android.net.Uri uri) {
        o.LJIIIZ(uri, "uri");
        return this.LIZ.LJIIIIZZ(uri);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String LJIIIZ() {
        return this.LIZ.LJIIIZ();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final Class<? extends Activity> LJIIJ() {
        return this.LIZ.LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJIIJJI() {
        return this.LIZ.LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final Class<? extends Activity> LJIIL() {
        return this.LIZ.LJIIL();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJIILIIL(String str, String str2) {
        return this.LIZ.LJIILIIL(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String LJIILJJIL(String url) {
        o.LJIIIZ(url, "url");
        return this.LIZ.LJIILJJIL(url);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String LJIILL() {
        return this.LIZ.LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String LJIILLIIL() {
        return this.LIZ.LJIILLIIL();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final Class<? extends Activity> LJIIZILJ() {
        return this.LIZ.LJIIZILJ();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJIJ(android.net.Uri uri) {
        return this.LIZ.LJIJ(uri);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void LJIJI(Activity activity, String str) {
        o.LJIIIZ(activity, "activity");
        this.LIZ.LJIJI(activity, str);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String LJIJJ() {
        return this.LIZ.LJIJJ();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String LJIJJLI(String url) {
        o.LJIIIZ(url, "url");
        return this.LIZ.LJIJJLI(url);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void LJIL(String str, String str2, boolean z) {
        this.LIZ.LJIL(str, str2, z);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void LJJ(String tag, String extraResult) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(extraResult, "extraResult");
        this.LIZ.LJJ(tag, extraResult);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final long LJJI() {
        return this.LIZ.LJJI();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJIFFI(Activity activity, String str, boolean z) {
        o.LJIIIZ(activity, "activity");
        return this.LIZ.LJJIFFI(activity, str, z);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void LJJII(M5X m5x, CU2 config) {
        o.LJIIIZ(config, "config");
        this.LIZ.LJJII(m5x, config);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String getCustomScheme() {
        return this.LIZ.getCustomScheme();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean isDeepLinkHandlerActivity(Context context) {
        o.LJIIIZ(context, "context");
        return this.LIZ.isDeepLinkHandlerActivity(context);
    }
}

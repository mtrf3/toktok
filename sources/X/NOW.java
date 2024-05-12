package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NOW implements NLW {
    @Override // X.NLW
    public final U4A LJJIFFI() {
        return new U4A();
    }

    @Override // X.NLW
    public final boolean LJIILLIIL(Aweme aweme) {
        if (aweme == null || !C63081OpJ.LLFZ(aweme)) {
            return false;
        }
        return true;
    }

    @Override // X.NLW
    public final void LJIJJLI(Context context) {
        C224488rU.LIZIZ(context, "click_ad_web");
    }

    @Override // X.NLW
    public final C59190NKw LIZLLL(SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, String str, NM4 loadCallback) {
        o.LJIIIZ(loadCallback, "loadCallback");
        return new C59190NKw(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, str, loadCallback);
    }

    @Override // X.NLW
    public final C59447NUt LJI(C60193Njp c60193Njp, String str, NM6 nm6) {
        return new C59447NUt(c60193Njp, str, nm6);
    }

    @Override // X.NLW
    public final void LJIIIIZZ(Context context, Bundle bundle, Aweme aweme) {
        String str;
        o.LJIIIZ(context, "context");
        C17J.LJIIJJI(context, bundle, aweme);
        C17J.LJIIL(context, bundle, aweme);
        if (aweme != null && aweme.getAwemeRawAd() != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd.getNonNativeClick() == 0) {
                YG5.LIZIZ.getAdLynxLandPageUtil();
                if (NOX.LIZJ(awemeRawAd)) {
                    bundle.putLong("bundle_real_ad_id", awemeRawAd.getAdId().longValue());
                    bundle.putString("bundle_render_type", awemeRawAd.getNativeSiteConfig().getRenderType());
                    bundle.putString("bundle_lynx_scheme", awemeRawAd.getNativeSiteConfig().getLynxScheme());
                    bundle.putInt("bundle_lynx_landing_style", awemeRawAd.getNativeSiteConfig().getLynxLandingStyle());
                    if (aweme.getVideo() != null && aweme.getVideo().getOriginCover() != null && !C79004UzY.LJJIFFI(aweme.getVideo().getOriginCover().getUrlList())) {
                        bundle.putString("bundle_full_screen_bg_image", (String) ListProtector.get(aweme.getVideo().getOriginCover().getUrlList(), 0));
                    }
                    List<String> geckoChannel = awemeRawAd.getNativeSiteConfig().getGeckoChannel();
                    if (!C79004UzY.LJJIFFI(geckoChannel)) {
                        str = (String) ListProtector.get(geckoChannel, 0);
                    } else {
                        str = "";
                    }
                    bundle.putString("lynx_channel_name", str);
                    bundle.putString("bundle_native_site_custom_data", awemeRawAd.getNativeSiteCustomData());
                    if (awemeRawAd.getNativeSiteConfig().getSecondPageGeckoChannel() != null) {
                        bundle.putStringArrayList("bundle_second_page_gecko_channels", (ArrayList) awemeRawAd.getNativeSiteConfig().getSecondPageGeckoChannel());
                    }
                    bundle.putString("bundle_native_site_ad_info", awemeRawAd.getNativeSiteAdInfo());
                    bundle.putString("bundle_native_site_app_data", awemeRawAd.getAppData());
                }
            }
        }
        C17J.LJIILJJIL(context, bundle, aweme);
        C17J.LJIILIIL(context, bundle);
    }

    @Override // X.NLW
    public final boolean LIZ(Context context, Aweme aweme, int i, C74R c74r) {
        return NOE.LJJIIJ(context, aweme, 48, NPD.LIZ);
    }
}

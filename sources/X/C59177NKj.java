package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.commercialize.model.AdProductTile;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: X.NKj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59177NKj implements InterfaceC59183NKp<C59179NKl> {
    public static WeakReference<Context> LIZJ;
    public static final C59177NKj LIZ = new C59177NKj();
    public static final ConcurrentHashMap<String, C59179NKl> LIZIZ = new ConcurrentHashMap<>();
    public static final String LIZLLL = "feed_lynx_product_tile_preload_cache_error";
    public static final int LJ = 3;
    public static final int LJFF = 2;

    @Override // X.InterfaceC59183NKp
    public final boolean LJI() {
        return true;
    }

    @Override // X.InterfaceC59183NKp
    public final int LIZIZ() {
        return LJFF().size();
    }

    @Override // X.InterfaceC59183NKp
    public final int LJ() {
        return LJ;
    }

    @Override // X.InterfaceC59183NKp
    public final ConcurrentHashMap<String, C59179NKl> LJFF() {
        return LIZIZ;
    }

    @Override // X.InterfaceC59183NKp
    public final String LJII() {
        return LIZLLL;
    }

    @Override // X.InterfaceC59183NKp
    public final int LJIIIZ() {
        return LJFF;
    }

    @Override // X.InterfaceC59183NKp
    public final WeakReference<Context> LJIILIIL() {
        return LIZJ;
    }

    @Override // X.InterfaceC59183NKp
    public final void releaseAll() {
        C59182NKo.LJ(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.NKq, X.NKl] */
    @Override // X.InterfaceC59183NKp
    public final C59179NKl LIZ(String str) {
        return C59182NKo.LIZIZ(this, str);
    }

    @Override // X.InterfaceC59183NKp
    public final boolean LIZJ(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        if (aweme.isAd() && C63081OpJ.LLII(aweme)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC59183NKp, X.InterfaceC58172Qb
    public final void LIZLLL(String str) {
        C59182NKo.LJFF(this, str);
    }

    @Override // X.InterfaceC58172Qb
    public final void LJIIIIZZ(Aweme aweme) {
        C59182NKo.LIZLLL(this, aweme);
    }

    @Override // X.InterfaceC59183NKp
    public final void LJIIL(WeakReference<Context> weakReference) {
        LIZJ = weakReference;
    }

    public final void LJIILJJIL(Context context) {
        C59182NKo.LIZ(this, context);
        C42625Go9.LIZIZ(this);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onCardStatusEvent(F9N event) {
        o.LJIIIZ(event, "event");
        Iterator LIZLLL2 = C47135Ieh.LIZLLL(LIZIZ, "cacheModelMap.values");
        while (LIZLLL2.hasNext()) {
            AbstractC59184NKq abstractC59184NKq = (AbstractC59184NKq) LIZLLL2.next();
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = abstractC59184NKq.LIZLLL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.hashCode() == event.LJLILLLLZI && event.LJLIL == 1) {
                abstractC59184NKq.LIZLLL(3);
                return;
            }
        }
    }

    @Override // X.InterfaceC58172Qb
    public final void LJIIJ(int i, List list) {
        C59182NKo.LIZJ(i, this, list);
    }

    @Override // X.InterfaceC59183NKp
    public final void LJIIJJI(Context context, Aweme aweme) {
        Context context2;
        AdProductTile productTile;
        String lynxScheme;
        String str;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2;
        o.LJIIIZ(aweme, "aweme");
        ConcurrentHashMap<String, C59179NKl> concurrentHashMap = LIZIZ;
        C59179NKl c59179NKl = concurrentHashMap.get(aweme.getAid());
        if (c59179NKl != null && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = c59179NKl.LIZLLL) != null && sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView() != null && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = c59179NKl.LIZLLL) != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2);
        }
        String aid = aweme.getAid();
        o.LJIIIIZZ(aid, "aweme.aid");
        C59179NKl c59179NKl2 = new C59179NKl(aweme);
        WeakReference<Context> weakReference = LIZJ;
        if (weakReference != null && (context2 = weakReference.get()) != null) {
            String jVar = NGJ.LIZ(context2, aweme).toString();
            o.LJIIIIZZ(jVar, "FeedAdLynxProductTileDat…weme, context).toString()");
            Bundle LIZIZ2 = NGJ.LIZIZ(context2, aweme);
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null && (productTile = awemeRawAd.getProductTile()) != null && (lynxScheme = productTile.getLynxScheme()) != null) {
                Uri.Builder buildUpon = UriProtector.parse(lynxScheme).buildUpon();
                buildUpon.appendQueryParameter("initialData", jVar).toString();
                String builder = buildUpon.toString();
                o.LJIIIIZZ(builder, "parse(lynxScheme).buildU…g()\n                    }");
                IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
                if (LJJI != null) {
                    str = LJJI.LJIIL("lynx_feed");
                } else {
                    str = null;
                }
                aweme.getAwemeRawAd();
                c59179NKl2.LIZLLL = new C59189NKv(context2, str).LIZ(builder, LIZIZ2, new C59176NKi(c59179NKl2, context2), C59209NLp.LIZ().enableProductTitle);
            }
        }
        concurrentHashMap.put(aid, c59179NKl2);
    }
}

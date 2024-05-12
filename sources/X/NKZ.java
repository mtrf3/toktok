package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.commercialize.model.AdLynxEntryData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NKZ implements InterfaceC59183NKp<C59169NKb> {
    public static final NKZ LIZ = new NKZ();
    public static final ConcurrentHashMap<String, C59169NKb> LIZIZ = new ConcurrentHashMap<>();
    public static WeakReference<Context> LIZJ;

    @Override // X.InterfaceC59183NKp
    public final int LJ() {
        return 6;
    }

    @Override // X.InterfaceC59183NKp
    public final boolean LJI() {
        return true;
    }

    @Override // X.InterfaceC59183NKp
    public final String LJII() {
        return "feed_lynx_superlike_preload_cache_error";
    }

    @Override // X.InterfaceC59183NKp
    public final int LJIIIZ() {
        return 4;
    }

    @Override // X.InterfaceC59183NKp
    public final int LIZIZ() {
        return LJFF().size();
    }

    @Override // X.InterfaceC59183NKp
    public final ConcurrentHashMap<String, C59169NKb> LJFF() {
        return LIZIZ;
    }

    @Override // X.InterfaceC59183NKp
    public final WeakReference<Context> LJIILIIL() {
        return LIZJ;
    }

    @Override // X.InterfaceC59183NKp
    public final void releaseAll() {
        C59182NKo.LJ(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.NKq, X.NKb] */
    @Override // X.InterfaceC59183NKp
    public final C59169NKb LIZ(String str) {
        return C59182NKo.LIZIZ(this, str);
    }

    @Override // X.InterfaceC59183NKp
    public final boolean LIZJ(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        return C63081OpJ.LJLLL(aweme);
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

    @Override // X.InterfaceC58172Qb
    public final void LJIIJ(int i, List list) {
        C59182NKo.LIZJ(i, this, list);
    }

    @Override // X.InterfaceC59183NKp
    public final void LJIIJJI(Context context, Aweme aweme) {
        AdLynxEntryData lynxEntryData;
        String lynxScheme;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        o.LJIIIZ(aweme, "aweme");
        C59169NKb c59169NKb = new C59169NKb(aweme);
        ConcurrentHashMap<String, C59169NKb> concurrentHashMap = LIZIZ;
        C59169NKb c59169NKb2 = concurrentHashMap.get(aweme.getAid());
        C59190NKw c59190NKw = null;
        String str = null;
        if (c59169NKb2 != null && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = c59169NKb2.LIZLLL) != null && sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView() != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = c59169NKb2.LIZLLL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 != null) {
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2);
            }
            c59169NKb2.LJ = null;
        }
        String aid = aweme.getAid();
        o.LJIIIIZZ(aid, "aweme.aid");
        concurrentHashMap.put(aid, c59169NKb);
        View inflate = View.inflate(context, R.layout.bjp, null);
        o.LJIIIIZZ(inflate, "inflate(context, R.layou…x_super_like_spark, null)");
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3 = (SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) inflate.findViewById(R.id.feed_ad_lynx_super_like_spark_container);
        c59169NKb.LIZIZ = inflate;
        c59169NKb.LIZLLL = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3 != null) {
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3.getKitView() != null) {
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3);
            }
            NLW LIZ2 = NGL.LIZ();
            if (LIZ2 != null) {
                IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
                if (LJJI != null) {
                    str = LJJI.LJIIL("lynx_feed");
                }
                aweme.getAwemeRawAd();
                c59190NKw = LIZ2.LIZLLL(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3, str, new C59168NKa(c59169NKb, context));
            }
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null && (lynxEntryData = awemeRawAd.getLynxEntryData()) != null && (lynxScheme = lynxEntryData.getLynxScheme()) != null) {
                c59169NKb.LIZLLL(1);
                Uri.Builder appendQueryParameter = UriProtector.parse(lynxScheme).buildUpon().appendQueryParameter("initialData", NG1.LIZ(context, aweme).toString());
                if (c59190NKw != null) {
                    String builder = appendQueryParameter.toString();
                    o.LJIIIIZZ(builder, "urlBuilder.toString()");
                    Bundle bundle = new Bundle();
                    NLW LIZ3 = NGL.LIZ();
                    if (LIZ3 != null) {
                        LIZ3.LJIIIIZZ(context, bundle, aweme);
                    }
                    c59190NKw.LIZ(bundle, builder, C59209NLp.LIZ().enableLynxSuperLike);
                }
            }
        }
        C58582Rq.LIZIZ(context, "superlike old prerender");
    }
}

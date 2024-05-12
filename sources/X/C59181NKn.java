package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.NKn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59181NKn implements InterfaceC59183NKp {
    public static final C59181NKn LIZ = new C59181NKn();
    public static final ConcurrentHashMap<String, C59186NKs> LIZIZ = new ConcurrentHashMap<>();
    public static WeakReference<Context> LIZJ;

    @Override // X.InterfaceC59183NKp
    public final int LJ() {
        return 6;
    }

    @Override // X.InterfaceC59183NKp
    public final String LJII() {
        return "feed_lynx_mask_preload_cache_error";
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
    public final boolean LJI() {
        return C59207NLn.LIZ();
    }

    public final void LJIILJJIL() {
        C42625Go9.LIZJ(this);
        releaseAll();
    }

    @Override // X.InterfaceC59183NKp
    public final ConcurrentHashMap<String, C59186NKs> LJFF() {
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

    @Override // X.InterfaceC59183NKp
    public final AbstractC59184NKq LIZ(String str) {
        return C59182NKo.LIZIZ(this, str);
    }

    @Override // X.InterfaceC59183NKp
    public final boolean LIZJ(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        return C63081OpJ.LLJJJIL(aweme);
    }

    @Override // X.InterfaceC59183NKp, X.InterfaceC58172Qb
    public final void LIZLLL(String str) {
        C59182NKo.LJFF(this, str);
    }

    @Override // X.InterfaceC58172Qb
    public final void LJIIIIZZ(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        C59182NKo.LIZLLL(this, aweme);
    }

    @Override // X.InterfaceC59183NKp
    public final void LJIIL(WeakReference<Context> weakReference) {
        LIZJ = weakReference;
    }

    @Override // X.InterfaceC58172Qb
    public final void LJIIJ(int i, List list) {
        o.LJIIIZ(list, "list");
        C59182NKo.LIZJ(i, this, list);
    }

    @Override // X.InterfaceC59183NKp
    public final void LJIIJJI(Context context, Aweme aweme) {
        C59447NUt c59447NUt;
        String cardUrl;
        String str;
        C59190NKw c59190NKw;
        String cardUrl2;
        String str2;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        o.LJIIIZ(aweme, "aweme");
        C59186NKs c59186NKs = new C59186NKs(aweme);
        ConcurrentHashMap<String, C59186NKs> concurrentHashMap = LIZIZ;
        C59186NKs c59186NKs2 = concurrentHashMap.get(aweme.getAid());
        JSONObject jSONObject = null;
        if (c59186NKs2 != null && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = c59186NKs2.LIZLLL) != null && sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView() != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = c59186NKs2.LIZLLL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 != null) {
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2);
            }
            c59186NKs2.LJ = null;
        }
        String aid = aweme.getAid();
        o.LJIIIIZZ(aid, "aweme.aid");
        concurrentHashMap.put(aid, c59186NKs);
        C60193Njp c60193Njp = (C60193Njp) View.inflate(context, R.layout.bjl, null).findViewById(R.id.feed_ad_lynx_mask_container_bullet);
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3 = (SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) View.inflate(context, R.layout.bjm, null).findViewById(R.id.feed_ad_lynx_mask_container_spark);
        c59186NKs.LIZJ = c60193Njp;
        c59186NKs.LIZLLL = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3;
        if (C59207NLn.LIZ()) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS4 = c59186NKs.LIZLLL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS4 != null) {
                if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS4.getKitView() != null) {
                    SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS4);
                }
                NLW LIZ2 = NGL.LIZ();
                if (LIZ2 != null) {
                    IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
                    if (LJJI != null) {
                        str2 = LJJI.LJIIL("lynx_feed");
                    } else {
                        str2 = null;
                    }
                    aweme.getAwemeRawAd();
                    c59190NKw = LIZ2.LIZLLL(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS4, str2, new C59178NKk(c59186NKs, context));
                } else {
                    c59190NKw = null;
                }
                Bundle LIZIZ2 = NGI.LIZIZ(context, aweme);
                CardStruct LJJJIL = C63081OpJ.LJJJIL(aweme);
                if (LJJJIL != null && (cardUrl2 = LJJJIL.getCardUrl()) != null) {
                    c59186NKs.LIZLLL(1);
                    Uri.Builder buildUpon = UriProtector.parse(cardUrl2).buildUpon();
                    CardStruct LJJJIL2 = C63081OpJ.LJJJIL(aweme);
                    if (LJJJIL2 != null) {
                        jSONObject = LJJJIL2.getCardData();
                    }
                    buildUpon.appendQueryParameter("initialData", NGI.LIZ(context, aweme, jSONObject).toString());
                    if (c59190NKw != null) {
                        String builder = buildUpon.toString();
                        o.LJIIIIZZ(builder, "urlBuilder.toString()");
                        c59190NKw.LIZ(LIZIZ2, builder, C59209NLp.LIZ().enableLynxMask);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        C60193Njp c60193Njp2 = c59186NKs.LIZJ;
        if (c60193Njp2 == null) {
            return;
        }
        NLW LIZ3 = NGL.LIZ();
        if (LIZ3 != null) {
            IAdLandPagePreloadService LJJI2 = AdLandPagePreloadServiceImpl.LJJI();
            if (LJJI2 != null) {
                str = LJJI2.LJIIL("lynx_feed");
            } else {
                str = null;
            }
            aweme.getAwemeRawAd();
            c59447NUt = LIZ3.LJI(c60193Njp2, str, new C59185NKr(c59186NKs, context));
        } else {
            c59447NUt = null;
        }
        Bundle LIZIZ3 = NGI.LIZIZ(context, aweme);
        CardStruct LJJJIL3 = C63081OpJ.LJJJIL(aweme);
        if (LJJJIL3 == null || (cardUrl = LJJJIL3.getCardUrl()) == null) {
            return;
        }
        c59186NKs.LIZLLL(1);
        Uri.Builder buildUpon2 = UriProtector.parse(cardUrl).buildUpon();
        CardStruct LJJJIL4 = C63081OpJ.LJJJIL(aweme);
        if (LJJJIL4 != null) {
            jSONObject = LJJJIL4.getCardData();
        }
        buildUpon2.appendQueryParameter("initialData", NGI.LIZ(context, aweme, jSONObject).toString());
        if (c59447NUt == null) {
            return;
        }
        String builder2 = buildUpon2.toString();
        o.LJIIIIZZ(builder2, "urlBuilder.toString()");
        c59447NUt.LIZ(LIZIZ3, builder2);
    }

    public final void LJIILL(int i, List<? extends Aweme> items) {
        o.LJIIIZ(items, "items");
        C59182NKo.LJI(i, this, items);
    }
}

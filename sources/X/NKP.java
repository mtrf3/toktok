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
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes11.dex */
public final class NKP implements NKX {
    public static final NKP LIZ = new NKP();
    public static final ConcurrentHashMap<String, NKU> LIZIZ = new ConcurrentHashMap<>();
    public static WeakReference<Context> LIZJ;
    public static CardStruct LIZLLL;

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
        return "feed_lynx_card_preload_cache_error";
    }

    @Override // X.InterfaceC59183NKp
    public final int LJIIIZ() {
        return 4;
    }

    @Override // X.InterfaceC59183NKp
    public final int LIZIZ() {
        return LJFF().size();
    }

    public final void LJIILL() {
        C42625Go9.LIZJ(this);
        releaseAll();
    }

    @Override // X.InterfaceC59183NKp
    public final ConcurrentHashMap<String, NKU> LJFF() {
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

    public static final boolean LJIJ(Aweme aweme) {
        WeakReference<Context> weakReference;
        Context context;
        if (aweme == null || (weakReference = LIZJ) == null || (context = weakReference.get()) == null) {
            return false;
        }
        ConcurrentHashMap<String, NKU> concurrentHashMap = LIZIZ;
        if (!concurrentHashMap.containsKey(aweme.getAid())) {
            return false;
        }
        NKU nku = concurrentHashMap.get(aweme.getAid());
        if (nku != null && !nku.LJII && nku.LIZ == 3) {
            return false;
        }
        LJIILLIIL(aweme, context, nku);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.NKq, X.NKU] */
    @Override // X.InterfaceC59183NKp
    public final NKU LIZ(String str) {
        return C59182NKo.LIZIZ(this, str);
    }

    @Override // X.InterfaceC59183NKp
    public final boolean LIZJ(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        if (aweme.isAd() && C63081OpJ.LLI(aweme)) {
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
        o.LJIIIZ(aweme, "aweme");
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
        int i;
        o.LJIIIZ(event, "event");
        Iterator LIZLLL2 = C47135Ieh.LIZLLL(LIZIZ, "cacheModelMap.values");
        while (LIZLLL2.hasNext()) {
            AbstractC59184NKq abstractC59184NKq = (AbstractC59184NKq) LIZLLL2.next();
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = abstractC59184NKq.LIZLLL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
                i = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.hashCode();
            } else {
                i = 0;
            }
            if (i == event.LJLILLLLZI && event.LJLIL == 1) {
                abstractC59184NKq.LIZLLL(3);
                return;
            }
        }
    }

    @Override // X.InterfaceC58172Qb
    public final void LJIIJ(int i, List list) {
        o.LJIIIZ(list, "list");
        C59182NKo.LIZJ(i, this, list);
    }

    @Override // X.InterfaceC59183NKp
    public final void LJIIJJI(Context context, Aweme aweme) {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        o.LJIIIZ(aweme, "aweme");
        NKU nku = new NKU(aweme);
        ConcurrentHashMap<String, NKU> concurrentHashMap = LIZIZ;
        NKU nku2 = concurrentHashMap.get(aweme.getAid());
        if (nku2 != null && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = nku2.LIZLLL) != null && sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView() != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = nku2.LIZLLL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 != null) {
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2);
            }
            nku2.LJ = null;
        }
        String aid = aweme.getAid();
        o.LJIIIIZZ(aid, "aweme.aid");
        concurrentHashMap.put(aid, nku);
        View inflate = View.inflate(context, R.layout.bjk, null);
        o.LJIIIIZZ(inflate, "inflate(context, R.layou…ad_lynx_card_spark, null)");
        C60193Njp c60193Njp = (C60193Njp) inflate.findViewById(R.id.b0v);
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3 = (SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) inflate.findViewById(R.id.spark_container);
        nku.LIZJ = c60193Njp;
        nku.LIZLLL = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3;
        LJIILLIIL(aweme, context, nku);
    }

    public final void LJIIZILJ(int i, List<? extends Aweme> items) {
        o.LJIIIZ(items, "items");
        C59182NKo.LJI(i, this, items);
    }

    public static void LJIILLIIL(Aweme aweme, Context context, NKU nku) {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        String cardUrl;
        C59190NKw c59190NKw = null;
        String str = null;
        if (nku != null && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = nku.LIZLLL) != null) {
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView() != null) {
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
            }
            NLW LIZ2 = NGL.LIZ();
            if (LIZ2 != null) {
                IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
                if (LJJI != null) {
                    str = LJJI.LJIIL("lynx_feed");
                }
                aweme.getAwemeRawAd();
                c59190NKw = LIZ2.LIZLLL(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, str, new NKY(nku, context));
            }
            Bundle LIZIZ2 = NHP.LIZIZ(context, aweme);
            CardStruct LJJJ = C63081OpJ.LJJJ(aweme);
            LIZLLL = LJJJ;
            if (LJJJ != null && (cardUrl = LJJJ.getCardUrl()) != null) {
                Uri.Builder buildUpon = UriProtector.parse(cardUrl).buildUpon();
                buildUpon.appendQueryParameter("initialData", NHP.LIZ(aweme, LIZLLL, context).toString());
                if (c59190NKw != null) {
                    String builder = buildUpon.toString();
                    o.LJIIIIZZ(builder, "urlBuilder.toString()");
                    c59190NKw.LIZ(LIZIZ2, builder, C59209NLp.LIZ().enableLynxCard);
                }
                nku.LIZLLL(1);
            }
        }
    }
}

package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.m;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.commercialize.model.AdStickerData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.NKd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59171NKd implements InterfaceC59183NKp {
    public static final C59171NKd LIZ = new C59171NKd();
    public static final ConcurrentHashMap<String, C59173NKf> LIZIZ = new ConcurrentHashMap<>();
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
        return "feed_lynx_sticker_preload_cache_error";
    }

    @Override // X.InterfaceC59183NKp
    public final int LJIIIZ() {
        return 4;
    }

    @Override // X.InterfaceC59183NKp
    public final int LIZIZ() {
        return LJFF().size();
    }

    public final void LJIILJJIL() {
        C42625Go9.LIZJ(this);
        releaseAll();
    }

    @Override // X.InterfaceC59183NKp
    public final ConcurrentHashMap<String, C59173NKf> LJFF() {
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
        return C63081OpJ.LLJJJJJIL(aweme);
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
        String stickerUrl;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        o.LJIIIZ(aweme, "aweme");
        C59173NKf c59173NKf = new C59173NKf(aweme);
        ConcurrentHashMap<String, C59173NKf> concurrentHashMap = LIZIZ;
        C59173NKf c59173NKf2 = concurrentHashMap.get(aweme.getAid());
        C59190NKw c59190NKw = null;
        String str = null;
        if (c59173NKf2 != null && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = c59173NKf2.LIZLLL) != null && sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView() != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = c59173NKf2.LIZLLL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 != null) {
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2);
            }
            c59173NKf2.LJ = null;
        }
        String aid = aweme.getAid();
        o.LJIIIIZZ(aid, "aweme.aid");
        concurrentHashMap.put(aid, c59173NKf);
        View inflate = View.inflate(context, R.layout.bjo, null);
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3 = (SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) inflate.findViewById(R.id.spark_ad_sticker_view);
        c59173NKf.LIZIZ = inflate;
        c59173NKf.LIZLLL = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3;
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
                c59190NKw = LIZ2.LIZLLL(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3, str, new C59172NKe(c59173NKf, context));
            }
            Bundle LIZIZ2 = NG2.LIZIZ(context, aweme);
            AdStickerData LJJIIZ = C63081OpJ.LJJIIZ(aweme);
            if (LJJIIZ != null && (stickerUrl = LJJIIZ.getStickerUrl()) != null) {
                c59173NKf.LIZLLL(1);
                Uri.Builder buildUpon = UriProtector.parse(stickerUrl).buildUpon();
                m LIZ3 = NG2.LIZ(context, aweme);
                NGP.LIZ(aweme, LIZ3);
                buildUpon.appendQueryParameter("initialData", LIZ3.toString());
                if (c59190NKw != null) {
                    String builder = buildUpon.toString();
                    o.LJIIIIZZ(builder, "urlBuilder.toString()");
                    c59190NKw.LIZ(LIZIZ2, builder, C59209NLp.LIZ().enableLynxSticker);
                }
            }
        }
    }

    public final void LJIILL(int i, List<? extends Aweme> items) {
        o.LJIIIZ(items, "items");
        C59182NKo.LJI(i, this, items);
    }
}

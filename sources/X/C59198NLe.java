package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.m;
import com.ss.android.ugc.aweme.ad.experiment.AdSparkRefactorData;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.DynamicVideo;
import com.ss.android.ugc.aweme.spark.AdSparkUtils;
import com.ss.android.ugc.aweme.spark.IAdSparkUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* renamed from: X.NLe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59198NLe implements FDK {
    public static final C59198NLe LIZ = new C59198NLe();
    public static final C5H3 LIZIZ;
    public static final C5H3 LIZJ;
    public static final C5H3 LIZLLL;
    public static final C5H3 LJ;
    public static final HashMap<String, C59201NLh> LJFF;
    public static WeakReference<Context> LJI;
    public static int LJII;
    public static int LJIIIIZZ;
    public static int LJIIIZ;

    static {
        EnumC221088m0 enumC221088m0 = EnumC221088m0.NONE;
        LIZIZ = C221108m2.LIZ(enumC221088m0, C59203NLj.LJLIL);
        LIZJ = C221108m2.LIZ(enumC221088m0, C59202NLi.LJLIL);
        LIZLLL = C221108m2.LIZ(enumC221088m0, NHE.LJLIL);
        LJ = C221108m2.LIZ(enumC221088m0, NHF.LJLIL);
        LJFF = new HashMap<>();
    }

    public static int LJI() {
        return ((Number) LIZIZ.getValue()).intValue();
    }

    public static final OSZ<Integer, Integer> LJII() {
        return new OSZ<>(Integer.valueOf(LJII), Integer.valueOf(LJIIIIZZ));
    }

    public final void LJ() {
        C42625Go9.LIZJ(this);
        for (Map.Entry<String, C59201NLh> entry : LJFF.entrySet()) {
            if (entry.getValue().LJFF) {
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = entry.getValue().LJ;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
                    SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
                }
            } else {
                C60193Njp c60193Njp = entry.getValue().LIZLLL;
                if (c60193Njp != null) {
                    c60193Njp.release();
                }
            }
        }
        LJFF.clear();
        LJII = 0;
        LJIIIIZZ = 0;
        LJIIIZ = 0;
    }

    public static String LIZJ(Aweme aweme) {
        String str;
        m mVar = new m();
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            Long adId = awemeRawAd.getAdId();
            String str2 = null;
            if (adId != null) {
                str = String.valueOf(adId);
            } else {
                str = null;
            }
            mVar.LJJIIZ("adId", str);
            mVar.LJJIIZ("creativeId", awemeRawAd.getCreativeIdStr());
            mVar.LJJIIZ("logExtra", awemeRawAd.getLogExtra());
            Long groupId = awemeRawAd.getGroupId();
            if (groupId != null) {
                str2 = String.valueOf(groupId);
            }
            mVar.LJJIIZ("groupId", str2);
        }
        String jVar = mVar.toString();
        o.LJIIIIZZ(jVar, "dataObj.toString()");
        return jVar;
    }

    public static final C59201NLh LJFF(String str) {
        return LJFF.get(str);
    }

    public final void LIZIZ(Context context) {
        if (context == null) {
            return;
        }
        LJI = new WeakReference<>(context);
        C42625Go9.LIZIZ(this);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onAdFeedRefreshEvent(C2LG event) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        o.LJIIIZ(event, "event");
        Iterator<Map.Entry<String, C59201NLh>> it = LJFF.entrySet().iterator();
        while (it.hasNext()) {
            C59201NLh value = it.next().getValue();
            if (value.LJFF) {
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = value.LJ;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
                    ViewParent parent = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getParent();
                    if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                        C16880lQ.LJLLL(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, viewGroup);
                    }
                    SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
                    C0JU.LIZJ(value.LIZIZ ? 1 : 0, C58704N2e.LIZLLL("draw_ad", "dc_release", value.LIZ.getAwemeRawAd()), "is_first");
                }
            } else {
                C60193Njp c60193Njp = value.LIZLLL;
                if (c60193Njp != null) {
                    ViewParent parent2 = c60193Njp.getParent();
                    if ((parent2 instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent2) != null) {
                        C16880lQ.LJLLL(c60193Njp, viewGroup2);
                    }
                    c60193Njp.release();
                    C0JU.LIZJ(value.LIZIZ ? 1 : 0, C58704N2e.LIZLLL("draw_ad", "dc_release", value.LIZ.getAwemeRawAd()), "is_first");
                }
            }
        }
        LJFF.clear();
        LJIIIZ = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    @X.QD3(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDynamicAdReadyEvent(X.C40494Fus r8) {
        /*
            r7 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            int r3 = r8.LJLIL
            java.util.HashMap<java.lang.String, X.NLh> r1 = X.C59198NLe.LJFF
            java.lang.String r0 = "viewMap.values"
            java.util.Iterator r2 = X.C06540Nm.LJ(r1, r0)
        Lf:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L7d
            java.lang.Object r5 = r2.next()
            X.NLh r5 = (X.C59201NLh) r5
            boolean r0 = r5.LJFF
            r1 = 0
            if (r0 == 0) goto L72
            X.NtS r0 = r5.LJ
            if (r0 == 0) goto L70
            X.Nsz r0 = r0.getKitView()
            if (r0 == 0) goto L70
            int r0 = r0.hashCode()
        L2e:
            if (r0 != r3) goto L72
        L30:
            r0 = 1
            r5.LIZJ = r0
            long r0 = r8.LJLILLLLZI
            r5.LJII = r0
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r5.LIZ
            com.ss.android.ugc.aweme.feed.model.Video r4 = r6.getVideo()
            if (r4 == 0) goto L45
            long r2 = r8.LJLILLLLZI
            double r0 = (double) r2
            r4.setDuration(r0)
        L45:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r6.getAwemeRawAd()
            java.lang.String r1 = "draw_ad"
            java.lang.String r0 = "dc_ready"
            X.N0h r4 = X.C58704N2e.LIZLLL(r1, r0, r2)
            boolean r0 = r5.LIZIZ
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "is_first"
            r4.LIZIZ(r1, r0)
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r5.LJIIIIZZ
            long r2 = r2 - r0
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            java.lang.String r0 = "time"
            r4.LIZIZ(r1, r0)
            r4.LJI()
            return
        L70:
            r0 = 0
            goto L2e
        L72:
            X.Njp r0 = r5.LIZLLL
            if (r0 == 0) goto L7a
            int r1 = r0.hashCode()
        L7a:
            if (r1 != r3) goto Lf
            goto L30
        L7d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59198NLe.onDynamicAdReadyEvent(X.Fus):void");
    }

    public static final void LJIIIIZZ(int i, int i2) {
        InterfaceC60761Nsz kitView;
        LJII = i;
        LJIIIIZZ = i2;
        Iterator LJ2 = C06540Nm.LJ(LJFF, "viewMap.values");
        while (LJ2.hasNext()) {
            C59201NLh c59201NLh = (C59201NLh) LJ2.next();
            if (c59201NLh.LJFF) {
                JSONObject put = new JSONObject().put("viewPortWidth", i).put("viewPortHeight", i2);
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = c59201NLh.LJ;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null) {
                    if (put == null) {
                        put = new C59205NLl();
                    }
                    kitView.LJIIIZ("onDCViewSize", put);
                }
            } else {
                InterfaceC40516FvE interfaceC40516FvE = c59201NLh.LJI;
                if (interfaceC40516FvE != null) {
                    interfaceC40516FvE.onEvent(new C59204NLk(i, i2));
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0010, code lost:
    
        if (r6.LJFF == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIL(java.lang.String r9, boolean r10) {
        /*
            if (r9 != 0) goto L3
            return
        L3:
            java.util.HashMap<java.lang.String, X.NLh> r3 = X.C59198NLe.LJFF
            java.lang.Object r6 = r3.get(r9)
            X.NLh r6 = (X.C59201NLh) r6
            if (r6 == 0) goto L95
            boolean r1 = r6.LJFF
            r0 = 1
            if (r1 != r0) goto L95
        L12:
            java.lang.String r5 = "is_first"
            java.lang.String r8 = "dc_release"
            java.lang.String r7 = "draw_ad"
            java.lang.String r4 = "releaseCacheByAwemeId, awemeId: "
            if (r0 == 0) goto L5a
            if (r6 == 0) goto L56
            X.NtS r2 = r6.LJ
            if (r2 == 0) goto L56
            android.view.ViewParent r1 = r2.getParent()
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L31
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 == 0) goto L31
            X.C16880lQ.LJLLL(r2, r1)
        L31:
            X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(r2)
            if (r10 == 0) goto L45
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.LIZ
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            X.N0h r1 = X.C58704N2e.LIZLLL(r7, r8, r0)
            boolean r0 = r6.LIZIZ
            X.C0JU.LIZJ(r0, r1, r5)
        L45:
            java.lang.StringBuilder r0 = X.X1D.LIZ()
            r0.append(r4)
            r0.append(r9)
            java.lang.String r0 = X.X1D.LIZIZ(r0)
            X.FDL.LIZ(r0)
        L56:
            r3.remove(r9)
            return
        L5a:
            if (r6 == 0) goto L56
            X.Njp r2 = r6.LIZLLL
            if (r2 == 0) goto L56
            android.view.ViewParent r1 = r2.getParent()
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L6f
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 == 0) goto L6f
            X.C16880lQ.LJLLL(r2, r1)
        L6f:
            r2.release()
            if (r10 == 0) goto L83
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.LIZ
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            X.N0h r1 = X.C58704N2e.LIZLLL(r7, r8, r0)
            boolean r0 = r6.LIZIZ
            X.C0JU.LIZJ(r0, r1, r5)
        L83:
            java.lang.StringBuilder r0 = X.X1D.LIZ()
            r0.append(r4)
            r0.append(r9)
            java.lang.String r0 = X.X1D.LIZIZ(r0)
            X.FDL.LIZ(r0)
            goto L56
        L95:
            r0 = 0
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59198NLe.LJIIL(java.lang.String, boolean):void");
    }

    public static void LJIILIIL(int i, List list) {
        if (i < 0 || i >= list.size()) {
            return;
        }
        Aweme aweme = (Aweme) ListProtector.get(list, i);
        if (!C63081OpJ.LJLJI(aweme)) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("trigger release cache, index = ");
        LIZ2.append(i);
        FDL.LIZ(X1D.LIZIZ(LIZ2));
        LJIIL(aweme.getAid(), true);
    }

    @Override // X.FDK
    public final void LIZ(Aweme aweme, boolean z) {
        WeakReference<Context> weakReference;
        Context context;
        AwemeRawAd awemeRawAd;
        DynamicVideo dynamicVideo;
        String lynxScheme;
        C59447NUt LJI2;
        SparkContext sparkContext;
        C59190NKw LIZLLL2;
        if (aweme == null || (weakReference = LJI) == null || (context = weakReference.get()) == null || !aweme.isAd() || (awemeRawAd = aweme.getAwemeRawAd()) == null || (dynamicVideo = awemeRawAd.getDynamicVideo()) == null || (lynxScheme = dynamicVideo.getLynxScheme()) == null || lynxScheme.length() == 0) {
            return;
        }
        HashMap<String, C59201NLh> hashMap = LJFF;
        if (hashMap.get(aweme.getAid()) != null) {
            return;
        }
        C59201NLh c59201NLh = new C59201NLh(aweme, z);
        c59201NLh.LJFF = ((AdSparkRefactorData) C59207NLn.LIZIZ.getValue()).enableDynamicAd;
        String aid = aweme.getAid();
        o.LJIIIIZZ(aid, "aweme.aid");
        hashMap.put(aid, c59201NLh);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("preload start, lynxScheme: ");
        LIZ2.append(lynxScheme);
        FDL.LIZ(X1D.LIZIZ(LIZ2));
        c59201NLh.LJIIIIZZ = System.currentTimeMillis();
        if (c59201NLh.LJFF) {
            Uri.Builder buildUpon = UriProtector.parse(lynxScheme).buildUpon();
            buildUpon.appendQueryParameter("initialData", LIZJ(aweme));
            Bundle bundle = new Bundle();
            C5H3 c5h3 = LIZLLL;
            NLW nlw = (NLW) c5h3.getValue();
            if (nlw != null) {
                nlw.LJIIIIZZ(context, bundle, aweme);
            }
            IAdSparkUtils LJFF2 = AdSparkUtils.LJFF();
            if (LJFF2 == null || (sparkContext = NGQ.LIZ(LJFF2, context, buildUpon.toString(), bundle, false, 24)) == null) {
                sparkContext = new SparkContext();
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZJ2 = KMP.LIZJ(C40343FsR.LJIILJJIL, context, sparkContext);
            c59201NLh.LJ = LIZJ2;
            NLW nlw2 = (NLW) c5h3.getValue();
            if (nlw2 != null && (LIZLLL2 = nlw2.LIZLLL(LIZJ2, (String) LJ.getValue(), new C59199NLf(c59201NLh))) != null) {
                String builder = buildUpon.toString();
                o.LJIIIIZZ(builder, "urlBuilder.toString()");
                LIZLLL2.LIZ(bundle, builder, C59209NLp.LIZ().enableDynamicAd);
            }
        } else {
            C60193Njp c60193Njp = new C60193Njp(context, null, 6, 0);
            c59201NLh.LIZLLL = c60193Njp;
            NVG.LIZIZ(c60193Njp, BulletService.LIZ().LJIIJJI(context));
            Uri.Builder buildUpon2 = UriProtector.parse(lynxScheme).buildUpon();
            buildUpon2.appendQueryParameter("initialData", LIZJ(aweme));
            Bundle bundle2 = new Bundle();
            C5H3 c5h32 = LIZLLL;
            NLW nlw3 = (NLW) c5h32.getValue();
            if (nlw3 != null) {
                nlw3.LJIIIIZZ(context, bundle2, aweme);
            }
            NLW nlw4 = (NLW) c5h32.getValue();
            if (nlw4 != null && (LJI2 = nlw4.LJI(c60193Njp, (String) LJ.getValue(), new C59200NLg(c59201NLh))) != null) {
                String builder2 = buildUpon2.toString();
                o.LJIIIIZZ(builder2, "urlBuilder.toString()");
                LJI2.LIZ(bundle2, builder2);
            }
        }
        C0JU.LIZJ(z ? 1 : 0, C58704N2e.LIZLLL("draw_ad", "dc_prerender", aweme.getAwemeRawAd()), "is_first");
    }

    public final void LIZLLL(Aweme aweme, C2JP c2jp) {
        boolean z;
        ViewParent viewParent;
        if (aweme == null || !C63081OpJ.LJLJI(aweme)) {
            return;
        }
        C59201NLh LJFF2 = LJFF(aweme.getAid());
        int i = 0;
        if (LJFF2 != null && LJFF2.LIZJ == 1) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("checkForFallback ");
        LIZ2.append(!z);
        FDL.LIZ(X1D.LIZIZ(LIZ2));
        if (!z) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                awemeRawAd.setDynamicVideo(null);
            }
            c2jp.invoke();
            LJIIL(aweme.getAid(), false);
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (LJFF2 == null) {
                C58655N0h LIZLLL2 = C58704N2e.LIZLLL("draw_ad", "dc_show_failed", awemeRawAd2);
                LIZLLL2.LIZIZ("data_load_fail", "fail_reason");
                LIZLLL2.LIZIZ("dynamicAdCache not found", "error_discription");
                LIZLLL2.LJI();
            } else {
                if (LJFF2.LJFF) {
                    viewParent = LJFF2.LJ;
                } else {
                    viewParent = LJFF2.LIZLLL;
                }
                if (viewParent == null) {
                    C58655N0h LIZLLL3 = C58704N2e.LIZLLL("draw_ad", "dc_show_failed", awemeRawAd2);
                    LIZLLL3.LIZIZ("data_load_fail", "fail_reason");
                    LIZLLL3.LIZIZ("lynxView is null", "error_discription");
                    LIZLLL3.LJI();
                } else if (LJFF2.LJIIJ) {
                    C58655N0h LIZLLL4 = C58704N2e.LIZLLL("draw_ad", "dc_show_failed", awemeRawAd2);
                    LIZLLL4.LIZIZ("data_load_fail", "fail_reason");
                    LIZLLL4.LIZIZ(LJFF2.LJIIIZ, "error_discription");
                    LIZLLL4.LJI();
                } else if (LJFF2.LIZJ != 1) {
                    C58655N0h LIZLLL5 = C58704N2e.LIZLLL("draw_ad", "dc_show_failed", awemeRawAd2);
                    LIZLLL5.LIZIZ("load_timeout", "fail_reason");
                    LIZLLL5.LJI();
                }
            }
            C58655N0h LIZLLL6 = C58704N2e.LIZLLL("draw_ad", "dc_downgrade", aweme.getAwemeRawAd());
            if (LJFF2 != null && !LJFF2.LIZIZ) {
                i = 1;
            }
            C0JU.LIZJ(i ^ 1, LIZLLL6, "is_first");
        }
    }

    public final void LJIIJ(int i, List<? extends Aweme> list) {
        if (i < 0 || i >= list.size()) {
            return;
        }
        Aweme aweme = (Aweme) ListProtector.get(list, i);
        if (!C63081OpJ.LJLJI(aweme)) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("trigger preload again, index = ");
        LIZ2.append(i);
        FDL.LIZ(X1D.LIZIZ(LIZ2));
        LIZ(aweme, false);
    }

    public final void LJIIJJI(int i, List<? extends Aweme> list) {
        if (list == null) {
            return;
        }
        int i2 = LJIIIZ;
        if (i > i2) {
            LJIILIIL(i - ((Number) LIZJ.getValue()).intValue(), list);
            LJIIJ(LJI() + i, list);
        } else if (i < i2) {
            LJIILIIL(((Number) LIZJ.getValue()).intValue() + i, list);
            LJIIJ(i - LJI(), list);
        }
        LJIIIZ = i;
    }

    public final void LJIIIZ(int i, Aweme aweme, List items) {
        o.LJIIIZ(items, "items");
        if (aweme != null && C63081OpJ.LJLJI(aweme)) {
            LJIIL(aweme.getAid(), true);
        }
        LJIIJ(LJI() + i, items);
    }
}

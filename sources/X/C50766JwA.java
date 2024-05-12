package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.hybridkit.task.HybridKitConfigTask;
import com.ss.android.ugc.aweme.search.common.config.SearchIntermediateCardsConfig;
import com.ss.android.ugc.aweme.search.lynx.core.model.DynamicData;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.JwA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50766JwA {
    public static WeakReference<C50799Jwh> LIZ;
    public static boolean LIZIZ;
    public static volatile boolean LIZLLL;
    public static boolean LJ;
    public static SparkContext LJI;
    public static String LIZJ = "";
    public static final C5H3 LJFF = V16.LJJJJLL(C50792Jwa.LJLIL);

    public static void LIZIZ() {
        C50770JwE c50770JwE;
        String str = ((DynamicData) ListProtector.get(SearchIntermediateCardsConfig.LIZ(), 0)).dynamicPatch.schema;
        if (str != null) {
            LIZIZ = true;
            if (((Boolean) LJFF.getValue()).booleanValue()) {
                c50770JwE = C50783JwR.LIZIZ;
            } else {
                c50770JwE = null;
            }
            C34444DfU c34444DfU = C34444DfU.LJLILLLLZI;
            if (c34444DfU.LJJII() || C34178DbC.LJLILLLLZI.LJJII()) {
                Context LIZIZ2 = EF7.LIZIZ();
                JSONObject jSONObject = new JSONObject();
                if (c34444DfU.LJJII()) {
                    System.currentTimeMillis();
                    List<SearchHistory> LJFF2 = C50837JxJ.LJIIL(null, null).LJFF(C50837JxJ.LJIILJJIL());
                    JSONArray jSONArray = new JSONArray();
                    for (SearchHistory searchHistory : LJFF2) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("word", searchHistory.keyword);
                        jSONArray.put(jSONObject2);
                    }
                    jSONObject.put("historyList", jSONArray);
                    System.currentTimeMillis();
                }
                if (C34178DbC.LJLILLLLZI.LJJII()) {
                    LJ = true;
                    Object LIZ2 = C35339Dtv.LIZ();
                    if (LIZ2 != null) {
                        jSONObject.put("isFromCache", true);
                        jSONObject.put("guessSearchData", LIZ2);
                    }
                }
                String jSONObject3 = jSONObject.toString();
                o.LJIIIIZZ(jSONObject3, "ret.toString()");
                C50804Jwm.LIZLLL(LIZIZ2, str, jSONObject3, false, c50770JwE, 24);
                return;
            }
            C50804Jwm.LIZLLL(EF7.LIZIZ(), str, null, false, c50770JwE, 24);
        }
    }

    public static OSZ LIZJ() {
        CharSequence charSequence;
        boolean z;
        ViewGroup viewGroup;
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ == null || (charSequence = C79045V0n.LJIIJJI(LJIIIIZZ)) == null) {
            charSequence = "";
        }
        C50799Jwh c50799Jwh = null;
        if ((TextUtils.equals(charSequence, "TikTok Theme Dark") || TextUtils.equals(LIZJ, "TikTok Theme Dark")) && !TextUtils.equals(charSequence, LIZJ)) {
            LIZ = null;
            LIZJ = charSequence.toString();
        }
        Context context = GlobalContext.getContext();
        if (context == null) {
            return null;
        }
        WeakReference<C50799Jwh> weakReference = LIZ;
        if (weakReference != null && weakReference.get() != null) {
            z = true;
            WeakReference<C50799Jwh> weakReference2 = LIZ;
            if (weakReference2 != null) {
                c50799Jwh = weakReference2.get();
            }
        } else {
            z = false;
            c50799Jwh = new C50799Jwh(context, null, EnumC50812Jwu.SEARCH_MIDDLE, LJI);
        }
        o.LJI(c50799Jwh);
        ViewParent parent = c50799Jwh.LJIIJJI.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            viewGroup.removeAllViews();
        }
        LIZ = new WeakReference<>(c50799Jwh);
        return new OSZ(c50799Jwh, Boolean.valueOf(z));
    }

    public static void LIZ(String str) {
        if (((Boolean) LJFF.getValue()).booleanValue()) {
            if (LIZLLL) {
                return;
            } else {
                LIZLLL = true;
            }
        }
        List LIZ2 = SearchIntermediateCardsConfig.LIZ();
        if (LIZ2.isEmpty()) {
            return;
        }
        String str2 = ((DynamicData) ListProtector.get(LIZ2, 0)).dynamicPatch.schema;
        C50102JlS c50102JlS = new C50102JlS();
        c50102JlS.LJIIZILJ("type", "start_preload");
        c50102JlS.LJIIZILJ("schema", str2);
        c50102JlS.LJIJI(str);
        c50102JlS.LJIILIIL();
        if (!HybridKitConfigTask.LJLILLLLZI) {
            C50102JlS c50102JlS2 = new C50102JlS();
            c50102JlS2.LJIIZILJ("type", "hybrid_kit_config_not_ready");
            c50102JlS2.LJIIZILJ("schema", str2);
            c50102JlS2.LJIJI(str);
            c50102JlS2.LJIILIIL();
            return;
        }
        if (C1DF.LJJII()) {
            C79012Uzg.LJFF(C50794Jwc.LJLIL);
        } else {
            LIZIZ();
            LIZLLL = false;
        }
    }
}

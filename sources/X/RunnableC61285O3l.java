package X;

import android.net.Uri;
import com.bytedance.forest.model.Request;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.O3l, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC61285O3l implements Runnable {
    public final /* synthetic */ C61295O3v LJLIL;

    public RunnableC61285O3l(C61295O3v c61295O3v) {
        this.LJLIL = c61295O3v;
    }

    public final void LIZ() {
        String str;
        String P;
        O4O N;
        Integer valueOf;
        String str2;
        String str3;
        android.net.Uri parse;
        String str4;
        Request request = this.LJLIL.LJZI;
        LinkedHashMap LIZIZ = JF1.LIZIZ("res_loader_name", "forest", "res_loader_version", "3.4.2.1-bugfix");
        C61295O3v c61295O3v = this.LJLIL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("res_src", request.getUrl());
        linkedHashMap.put("gecko_access_key", request.getGeckoModel().LJLIL);
        linkedHashMap.put("gecko_channel", request.getGeckoModel().LJLILLLLZI);
        linkedHashMap.put("gecko_bundle", request.getGeckoModel().LJLJI);
        linkedHashMap.put("res_version", Long.valueOf(c61295O3v.LLFFF));
        if (c61295O3v.LJZL) {
            str = "success";
        } else {
            str = "failed";
        }
        linkedHashMap.put("res_state", str);
        linkedHashMap.put("gecko_sync_update", Boolean.valueOf(request.getWaitGeckoUpdate()));
        linkedHashMap.put("wait_low_storage_update", Boolean.valueOf(request.getWaitLowStorageUpdate()));
        linkedHashMap.put("cdn_cache_enable", Boolean.valueOf(request.getEnableCDNCache()));
        linkedHashMap.put("load_to_memory", Boolean.valueOf(request.getLoadToMemory()));
        linkedHashMap.put("parallel_loading", Boolean.valueOf(request.getParallelLoading()));
        String name = request.getScene().name();
        Locale locale = Locale.ENGLISH;
        o.LJFF(locale, "Locale.ENGLISH");
        if (name != null) {
            String lowerCase = name.toLowerCase(locale);
            o.LJFF(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            linkedHashMap.put("res_scene", lowerCase);
            String name2 = request.getGeckoSource().name();
            if (name2 != null) {
                String lowerCase2 = name2.toLowerCase(locale);
                o.LJFF(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
                linkedHashMap.put("gecko_config_from", lowerCase2);
                linkedHashMap.put("res_trace_id", request.getGroupId());
                linkedHashMap.put("is_async", Boolean.valueOf(request.isASync()));
                boolean LJ = o.LJ(c61295O3v.LLD, "memory");
                linkedHashMap.put("is_memory", Boolean.valueOf(LJ));
                C61296O3w c61296O3w = c61295O3v.LJLJJLL;
                if (c61296O3w != null) {
                    linkedHashMap.put("is_ttnet", Boolean.valueOf(o.LJ(request.getNetDepender(), C61298O3y.LIZJ)));
                    if (c61295O3v.LJZL) {
                        linkedHashMap.put("final_cdn_url", c61296O3w.LIZLLL.LIZLLL);
                    }
                    if (c61295O3v.LLFF) {
                        if (c61295O3v.LJLJL) {
                            str4 = "cdn_negotiation_cache";
                        } else if (c61295O3v.LJLJLJ) {
                            str4 = "cdn_expired_cache";
                        } else {
                            str4 = "cdn_strong_cache";
                        }
                        linkedHashMap.put("cdn_cache_type", str4);
                    }
                    String str5 = c61296O3w.LIZLLL.LJIIIZ;
                    if (str5 != null) {
                        linkedHashMap.put("redirect_url", str5);
                    }
                    linkedHashMap.put("area_redirected", Integer.valueOf(c61296O3w.LIZLLL.LJII));
                    linkedHashMap.put("region_redirected", Integer.valueOf(c61296O3w.LIZLLL.LJI));
                    List<String> LIZ = c61296O3w.LIZLLL.LIZ();
                    if (!LIZ.isEmpty()) {
                        JSONArray jSONArray = new JSONArray();
                        Iterator<String> it = LIZ.iterator();
                        while (it.hasNext()) {
                            jSONArray.put(it.next());
                        }
                        linkedHashMap.put("fallback_urls", jSONArray);
                    }
                }
                if (LJ) {
                    P = c61295O3v.P(c61295O3v.LLF);
                } else {
                    P = c61295O3v.P(c61295O3v.LLD);
                }
                linkedHashMap.put("res_from", P);
                String M = c61295O3v.M();
                if (M == null) {
                    M = "unknown";
                }
                linkedHashMap.put("res_type", M);
                List<String> fetcherSequence = request.getFetcherSequence();
                ArrayList arrayList = new ArrayList(C32I.LJJL(fetcherSequence, 10));
                for (String str6 : fetcherSequence) {
                    Locale locale2 = Locale.ENGLISH;
                    o.LJFF(locale2, "Locale.ENGLISH");
                    if (str6 != null) {
                        String lowerCase3 = str6.toLowerCase(locale2);
                        o.LJFF(lowerCase3, "(this as java.lang.String).toLowerCase(locale)");
                        arrayList.add(lowerCase3);
                    } else {
                        throw new C37692Eqm("null cannot be cast to non-null type java.lang.String");
                    }
                }
                linkedHashMap.put("fetcher_list", arrayList);
                if (c61295O3v.LJZL && (N = c61295O3v.N()) != null && (valueOf = Integer.valueOf(N.LJIIJJI())) != null) {
                    C61845OOz.LIZLLL(valueOf, linkedHashMap, "res_size");
                }
                linkedHashMap.put("is_preload", Boolean.valueOf(c61295O3v.LJZI.isPreload()));
                if (request.getScene() == EnumC61028NxI.LYNX_IMAGE && !c61295O3v.LJLLLL && !request.isPreload()) {
                    W6J LIZ2 = W5I.LIZ();
                    if (c61295O3v.LJZL) {
                        parse = new Uri.Builder().scheme("file").authority("").path(c61295O3v.getFilePath()).build();
                    } else {
                        parse = UriProtector.parse(request.getUrl());
                    }
                    c61295O3v.LJLLLL = LIZ2.LJII(parse);
                }
                linkedHashMap.put("is_preloaded", Boolean.valueOf(c61295O3v.LJLLLL));
                linkedHashMap.put("is_request_reused", Boolean.valueOf(c61295O3v.LJLLLLLL));
                linkedHashMap.put("is_cdn_cache_loaded", Boolean.valueOf(c61295O3v.LJLZ));
                linkedHashMap.put("enable_request_reuse", Boolean.valueOf(c61295O3v.LJZI.getEnableRequestReuse()));
                linkedHashMap.put("has_been_paused", Boolean.valueOf(c61295O3v.LJLJI));
                C61295O3v c61295O3v2 = this.LJLIL;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("net_library_error_code", Integer.valueOf(c61295O3v2.LL.LIZLLL));
                linkedHashMap2.put("http_status_code", Integer.valueOf(c61295O3v2.LL.LJ));
                linkedHashMap2.put("res_loader_error_code", Integer.valueOf(c61295O3v2.LL.LIZIZ));
                linkedHashMap2.put("res_error_msg", c61295O3v2.LL.toString());
                linkedHashMap2.put("gecko_error_code", Integer.valueOf(c61295O3v2.LL.LIZJ));
                linkedHashMap2.put("gecko_error_msg", c61295O3v2.LL.LJIIIIZZ);
                linkedHashMap2.put("builtin_error_msg", c61295O3v2.LL.LJIIIZ);
                linkedHashMap2.put("cdn_error_msg", c61295O3v2.LL.LJIIJ);
                linkedHashMap2.put("memory_error", c61295O3v2.LL.LJII);
                C61295O3v c61295O3v3 = this.LJLIL;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                linkedHashMap3.put("res_loader_info", LIZIZ);
                linkedHashMap3.put("res_info", linkedHashMap);
                linkedHashMap3.put("res_load_perf", c61295O3v3.LJZ);
                linkedHashMap3.put("res_load_error", linkedHashMap2);
                JSONObject jSONObject = new JSONObject(linkedHashMap);
                for (Map.Entry entry : LIZIZ.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
                for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                    jSONObject.put((String) entry2.getKey(), entry2.getValue());
                }
                boolean contains = C47261Igj.LJJIJIIJI(EnumC61028NxI.LYNX_TEMPLATE, EnumC61028NxI.WEB_MAIN_DOCUMENT).contains(request.getScene());
                JSONObject jSONObject2 = new JSONObject(request.getCustomParams());
                C61295O3v c61295O3v4 = this.LJLIL;
                if (!c61295O3v4.LJZL) {
                    if (contains) {
                        str3 = "res_loader_error_template";
                    } else {
                        str3 = "res_loader_error";
                    }
                    C61288O3o.LIZ(str3, jSONObject, c61295O3v4, jSONObject2, linkedHashMap3, 0);
                }
                if (contains) {
                    str2 = "res_loader_perf_template";
                } else {
                    str2 = "res_loader_perf";
                }
                C61288O3o.LIZ(str2, jSONObject, this.LJLIL, jSONObject2, linkedHashMap3, 1);
                return;
            }
            throw new C37692Eqm("null cannot be cast to non-null type java.lang.String");
        }
        throw new C37692Eqm("null cannot be cast to non-null type java.lang.String");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}

package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Jho, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49876Jho implements InterfaceC50392Jq8 {
    public final String LJLIL;
    public final InterfaceC49878Jhq LJLILLLLZI;
    public final InterfaceC49889Ji1 LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public SearchMixFeedList LJLJJLL;
    public boolean LJLJL;
    public final C5H3 LJLJLJ;
    public final C5H3 LJLJLLL;
    public boolean LJLL;
    public final C5H3 LJLLI;
    public final C5H3 LJLLILLLL;
    public Aweme LJLLJ;

    @Override // X.InterfaceC50392Jq8
    public final void Mt() {
    }

    public final java.util.Set<String> LIZIZ() {
        return (java.util.Set) this.LJLJLJ.getValue();
    }

    public final JSONObject LIZJ() {
        Integer num;
        Object LIZ;
        String str;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("search_id", this.LJLIL);
        SearchMixFeedList searchMixFeedList = this.LJLJJLL;
        String str2 = null;
        if (searchMixFeedList != null) {
            num = Integer.valueOf(searchMixFeedList.cursor);
        } else {
            num = null;
        }
        jSONObject.put("cursor", num);
        SearchMixFeedList searchMixFeedList2 = this.LJLJJLL;
        Object obj = "";
        if (searchMixFeedList2 != null) {
            try {
                JSONObject optJSONObject = new JSONObject(searchMixFeedList2.LJLIL).optJSONObject("extra");
                if (optJSONObject != null) {
                    LIZ = optJSONObject.optString("inner_search_id");
                } else {
                    LIZ = null;
                }
                if (LIZ == null) {
                    LIZ = "";
                }
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            if (C3C5.m12isFailureimpl(LIZ)) {
                LIZ = null;
            }
        } else {
            LIZ = null;
        }
        if (LIZ != null) {
            obj = LIZ;
        }
        jSONObject.put("inner_search_id", obj);
        SearchMixFeedList searchMixFeedList3 = this.LJLJJLL;
        if (searchMixFeedList3 != null) {
            str = searchMixFeedList3.mBacktrace;
        } else {
            str = null;
        }
        jSONObject.put("backTrace", str);
        SearchMixFeedList searchMixFeedList4 = this.LJLJJLL;
        if (searchMixFeedList4 != null) {
            str2 = C78963Uyt.LJIILJJIL(searchMixFeedList4);
        }
        jSONObject.put("log_id", str2);
        return jSONObject;
    }

    public final void LJ() {
        if (this.LJLJL && C50050Jkc.LIZ() && (!LIZIZ().isEmpty())) {
            C49887Jhz c49887Jhz = new C49887Jhz();
            c49887Jhz.LIZLLL("type", "dual_stream");
            c49887Jhz.LIZLLL("event", "dual_empty_assure_success");
            JSONObject LIZJ = LIZJ();
            LIZJ.put("fallback_ids", new JSONArray((Collection) LIZIZ()));
            String jSONObject = LIZJ.toString();
            o.LJIIIIZZ(jSONObject, "getExtraMobParams().appl…             }.toString()");
            c49887Jhz.LIZLLL("params", jSONObject);
            c49887Jhz.LJIILIIL();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("post empty result fallback_ids:");
            LIZ.append(LIZIZ());
            X1D.LIZIZ(LIZ);
            LIZIZ().clear();
        }
    }

    public final void LJFF() {
        if (this.LJLL && C50048Jka.LIZ() && (!((java.util.Set) this.LJLLI.getValue()).isEmpty())) {
            C49887Jhz c49887Jhz = new C49887Jhz();
            c49887Jhz.LIZLLL("type", "dual_stream");
            c49887Jhz.LIZLLL("event", "dual_caton_assure_success");
            JSONObject LIZJ = LIZJ();
            LIZJ.put("fallback_ids", new JSONArray((Collection) this.LJLLI.getValue()));
            String jSONObject = LIZJ.toString();
            o.LJIIIIZZ(jSONObject, "getExtraMobParams().appl…             }.toString()");
            c49887Jhz.LIZLLL("params", jSONObject);
            c49887Jhz.LJIILIIL();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("post load more caton fallback_ids:");
            LIZ.append(this.LJLLI.getValue());
            X1D.LIZIZ(LIZ);
            ((java.util.Set) this.LJLLI.getValue()).clear();
        }
        this.LJLL = false;
    }

    public final void LIZLLL(InterfaceC88472Yns<? super JSONObject, ? extends JSONObject> interfaceC88472Yns) {
        if (C49893Ji5.LIZ()) {
            C49887Jhz c49887Jhz = new C49887Jhz();
            c49887Jhz.LIZLLL("type", "dual_stream");
            c49887Jhz.LIZLLL("event", "dual_repeat_assure");
            String jSONObject = interfaceC88472Yns.invoke(LIZJ()).toString();
            o.LJIIIIZZ(jSONObject, "getExtraMobParams().builder().toString()");
            c49887Jhz.LIZLLL("params", jSONObject);
            c49887Jhz.LJIILIIL();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("post deduplication mob event:");
            LIZ.append(interfaceC88472Yns.invoke(LIZJ()));
            X1D.LIZIZ(LIZ);
        }
    }

    public C49876Jho(String str, InterfaceC49878Jhq innerModel, InterfaceC49889Ji1 fallbackDataProvider) {
        o.LJIIIZ(innerModel, "innerModel");
        o.LJIIIZ(fallbackDataProvider, "fallbackDataProvider");
        this.LJLIL = str;
        this.LJLILLLLZI = innerModel;
        this.LJLJI = fallbackDataProvider;
        EnumC221088m0 enumC221088m0 = EnumC221088m0.NONE;
        this.LJLJLJ = C221108m2.LIZ(enumC221088m0, C49882Jhu.LJLIL);
        this.LJLJLLL = C221108m2.LIZ(enumC221088m0, C49884Jhw.LJLIL);
        this.LJLLI = C221108m2.LIZ(enumC221088m0, C49885Jhx.LJLIL);
        this.LJLLILLLL = C221108m2.LIZ(enumC221088m0, C49883Jhv.LJLIL);
        List<Aweme> awemeList = innerModel.getAwemeList();
        if (awemeList != null) {
            for (Aweme aweme : awemeList) {
                String aid = aweme.getAid();
                if (aid != null && aid.equals(this.LJLILLLLZI.V6())) {
                    this.LJLLJ = aweme;
                }
                String aid2 = aweme.getAid();
                if (aid2 != null) {
                    ((java.util.Set) this.LJLLILLLL.getValue()).add(aid2);
                }
            }
        }
    }

    public static boolean LIZ(int i, Aweme aweme, List curAwemeList) {
        String str;
        o.LJIIIZ(curAwemeList, "curAwemeList");
        int size = curAwemeList.size();
        Iterator it = curAwemeList.iterator();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (it.hasNext()) {
                String aid = ((Aweme) it.next()).getAid();
                if (aid != null) {
                    if (aweme != null) {
                        str = aweme.getAid();
                    } else {
                        str = null;
                    }
                    if (aid.equals(str)) {
                        break;
                    }
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        StringBuilder LIZJ = C06460Ne.LIZJ("curPos:", i2, ", totalCnt:", size, ", preloadCnt:");
        LIZJ.append(i);
        X1D.LIZIZ(LIZJ);
        if (i2 >= size - i) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : curAwemeList) {
            if (C78963Uyt.LJJIJIIJI((Aweme) obj)) {
                arrayList.add(obj);
            }
        }
        int size2 = arrayList.size();
        if (i2 >= (size - size2) - i) {
            z = true;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("presetCnt:");
        LIZ.append(size2);
        LIZ.append(", preload:");
        LIZ.append(z);
        X1D.LIZIZ(LIZ);
        return z;
    }

    @Override // X.InterfaceC50392Jq8
    public final void zX(int i, int i2, Aweme aweme) {
        boolean z;
        SearchMixFeedList searchMixFeedList = this.LJLJJLL;
        if (searchMixFeedList != null && !searchMixFeedList.hasMore) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (C50048Jka.LIZ()) {
                C49887Jhz c49887Jhz = new C49887Jhz();
                c49887Jhz.LIZLLL("type", "dual_stream");
                c49887Jhz.LIZLLL("event", "dual_caton_assure_failure");
                String jSONObject = LIZJ().toString();
                o.LJIIIIZZ(jSONObject, "getExtraMobParams().toString()");
                c49887Jhz.LIZLLL("params", jSONObject);
                c49887Jhz.LJIILIIL();
                return;
            }
            return;
        }
        if (i >= i2 - 1 && C50050Jkc.LIZ()) {
            C49887Jhz c49887Jhz2 = new C49887Jhz();
            c49887Jhz2.LIZLLL("type", "dual_stream");
            c49887Jhz2.LIZLLL("event", "dual_empty_assure_failure");
            String jSONObject2 = LIZJ().toString();
            o.LJIIIIZZ(jSONObject2, "getExtraMobParams().toString()");
            c49887Jhz2.LIZLLL("params", jSONObject2);
            c49887Jhz2.LJIILIIL();
        }
    }
}

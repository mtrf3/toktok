package X;

import Y.ARunnableS44S0100000_8;
import android.os.Handler;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugResponse;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class K4Q extends C8BR<C8BS<SearchSugResponse>, K4U> {
    public static Long LJLLLLLL = 0L;
    public static Long LJLZ = 0L;
    public K4R LJLJJLL;
    public final InterfaceC55235Lm3 LJLJLJ;
    public String LJLLI;
    public ArrayList<Integer> LJLLILLLL;
    public ArrayList<String> LJLLJ;
    public Long LJLLL;
    public final Handler LJLJJI = new Handler(C16880lQ.LLJJJJ());
    public long LJLJJL = 0;
    public final Deque<K4T> LJLJL = new LinkedList();
    public boolean LJLJLLL = false;
    public final ConcurrentHashMap<String, SearchSugResponse> LJLL = new ConcurrentHashMap<>();
    public final ARunnableS44S0100000_8 LJLLLL = new ARunnableS44S0100000_8(this, 81);

    @Override // X.C8BR, X.C8BT
    public final void onSuccess() {
        SearchSugResponse searchSugResponse;
        T t = this.LJLIL;
        if (t != 0) {
            searchSugResponse = (SearchSugResponse) t.getData();
        } else {
            searchSugResponse = null;
        }
        K k = this.LJLILLLLZI;
        if (k != 0) {
            if (searchSugResponse != null) {
                C3A5.LIZ.LJFF(searchSugResponse.requestId, searchSugResponse.logPb);
                if (KD5.LJLILLLLZI.LJJII()) {
                    this.LJLL.put(searchSugResponse.LJLILLLLZI, searchSugResponse);
                }
                String keyword = searchSugResponse.LJLILLLLZI;
                o.LJIIIZ(keyword, "keyword");
                long currentTimeMillis = System.currentTimeMillis();
                long j = C50832JxE.LIZIZ;
                if (j != 0) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("gap", currentTimeMillis - j);
                    jSONObject.put("keyword", keyword);
                    jSONObject.put("type", "request_success");
                    AppLogNewUtils.onEventV3("search_sug_frequency_monitor", jSONObject);
                }
                C50832JxE.LIZIZ = currentTimeMillis;
                ((K4U) this.LJLILLLLZI).Ft(searchSugResponse, false);
                return;
            }
            ((K4U) k).r0();
        }
    }

    @Override // X.C8BR, X.C8BT
    public final void onFailed(Exception exc) {
        K k = this.LJLILLLLZI;
        if (k != 0) {
            ((K4U) k).r0();
        }
    }

    public K4Q(ActivityC45651qj activityC45651qj, InterfaceC55235Lm3 interfaceC55235Lm3) {
        this.LJLJLJ = interfaceC55235Lm3;
        LJJ(new K4P(this, activityC45651qj, interfaceC55235Lm3));
    }

    public final void LJJIII(String str, boolean z) {
        if (z) {
            this.LJLLILLLL = new ArrayList<>();
            this.LJLLJ = new ArrayList<>();
            this.LJLLILLLL.add(0);
        } else {
            this.LJLLILLLL.add(Integer.valueOf((int) (System.currentTimeMillis() - this.LJLLL.longValue())));
        }
        this.LJLLJ.add(str);
        this.LJLLL = Long.valueOf(System.currentTimeMillis());
    }
}

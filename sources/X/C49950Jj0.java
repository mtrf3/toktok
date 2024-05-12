package X;

import Y.ARunnableS44S0100000_8;
import android.view.View;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchApi;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Jj0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49950Jj0 {
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static final C49950Jj0 LIZ = new C49950Jj0();
    public static final C49954Jj4 LIZLLL = new C49954Jj4();
    public static final C49951Jj1 LJ = new C49951Jj1();
    public static final C49949Jiz LJFF = new C49949Jiz();
    public static final C49953Jj3 LJI = new C49953Jj3();

    public static void LJII() {
        LIZIZ = false;
        LIZJ = false;
        C49954Jj4 c49954Jj4 = LIZLLL;
        if (c49954Jj4.LIZIZ == null) {
            c49954Jj4.LIZIZ = null;
            c49954Jj4.LIZ("", "search_domain");
        }
        if (c49954Jj4.LIZJ == null) {
            c49954Jj4.LIZJ = null;
            c49954Jj4.LIZ("", "network");
        }
        if (c49954Jj4.LIZLLL == null) {
            c49954Jj4.LIZLLL = null;
            c49954Jj4.LIZ("", "band_width_quality");
        }
        C49951Jj1 c49951Jj1 = LJ;
        c49951Jj1.LIZIZ = null;
        c49951Jj1.LIZJ = null;
        c49951Jj1.LIZLLL = -2;
        c49951Jj1.LJ = null;
        c49951Jj1.LJFF = null;
        c49951Jj1.LJI = null;
        c49951Jj1.LJII = null;
        C49953Jj3 c49953Jj3 = LJI;
        c49953Jj3.LJ = null;
        c49953Jj3.LIZIZ = null;
        c49953Jj3.LIZLLL = null;
        c49953Jj3.LIZJ = null;
        C49949Jiz c49949Jiz = LJFF;
        c49949Jiz.LIZIZ = -1L;
        c49949Jiz.LIZJ = -1L;
        c49949Jiz.LIZLLL = -1L;
        c49949Jiz.LJ = -1L;
        c49949Jiz.LJI = null;
        c49949Jiz.LJFF = false;
    }

    public static boolean LIZ() {
        String str;
        if (LJFF.LIZIZ == -1 || (str = LJI.LIZLLL) == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    public static void LJFF() {
        long j;
        if (LIZIZ || LIZJ || !LIZ()) {
            return;
        }
        C49949Jiz c49949Jiz = LJFF;
        if (c49949Jiz.LIZIZ != -1 && c49949Jiz.LJI == null) {
            Long valueOf = Long.valueOf(System.currentTimeMillis() - c49949Jiz.LIZIZ);
            c49949Jiz.LJI = valueOf;
            if (valueOf != null) {
                j = valueOf.longValue();
            } else {
                j = 0;
            }
            c49949Jiz.LIZ(Long.valueOf(j), "cost");
        }
        LJI();
    }

    public static void LJI() {
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, Object> entry : LIZLLL.LIZ.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (LIZIZ(value)) {
                    jSONObject.put(key, value);
                }
            }
            for (Map.Entry<String, Object> entry2 : LJI.LIZ.entrySet()) {
                String key2 = entry2.getKey();
                Object value2 = entry2.getValue();
                if (LIZIZ(value2)) {
                    jSONObject.put(key2, value2);
                }
            }
            for (Map.Entry<String, Object> entry3 : LJFF.LIZ.entrySet()) {
                String key3 = entry3.getKey();
                Object value3 = entry3.getValue();
                if (LIZIZ(value3)) {
                    jSONObject.put(key3, value3);
                }
            }
            for (Map.Entry<String, Object> entry4 : LJ.LIZ.entrySet()) {
                String key4 = entry4.getKey();
                Object value4 = entry4.getValue();
                if (LIZIZ(value4)) {
                    jSONObject.put(key4, value4);
                }
            }
            AppLogNewUtils.onEventV3("search_trigger_refresh_monitor_v3", jSONObject);
        } catch (Exception unused) {
        } catch (Throwable th) {
            LIZJ();
            throw th;
        }
        LIZJ();
    }

    public static void LIZJ() {
        LJII();
        LIZIZ = true;
    }

    public static boolean LIZIZ(Object obj) {
        Long l;
        if (obj instanceof Integer) {
            Integer num = (Integer) obj;
            if (num == null || Math.abs(num.intValue()) >= 1000000) {
                return false;
            }
            return true;
        }
        if ((obj instanceof Long) && ((l = (Long) obj) == null || Math.abs(l.longValue()) >= 1000000)) {
            return false;
        }
        return true;
    }

    public static void LIZLLL(InterfaceC88472Yns status) {
        o.LJIIIZ(status, "status");
        status.invoke(LJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onEventStart(SearchResultParam searchResultParam) {
        String str;
        String str2;
        LJII();
        C49953Jj3 c49953Jj3 = LJI;
        Integer num = null;
        if (searchResultParam != null) {
            c49953Jj3.getClass();
            str = searchResultParam.getKeyword();
        } else {
            str = null;
        }
        String str3 = "";
        if (c49953Jj3.LIZLLL == null) {
            c49953Jj3.LIZLLL = str;
            if (str == null) {
                str = "";
            }
            c49953Jj3.LIZ(str, "search_keyword");
        }
        if (searchResultParam != null) {
            str2 = searchResultParam.getSearchFrom();
        } else {
            str2 = null;
        }
        if (c49953Jj3.LIZIZ == null) {
            c49953Jj3.LIZIZ = str2;
            if (str2 == null) {
                str2 = "";
            }
            c49953Jj3.LIZ(str2, "search_source");
        }
        if (searchResultParam != null) {
            num = Integer.valueOf(searchResultParam.getIndex());
        }
        if (c49953Jj3.LIZJ == null && num != null) {
            num.intValue();
            c49953Jj3.LIZJ = num;
            c49953Jj3.LIZ(num, "search_position");
        }
        C49954Jj4 c49954Jj4 = LIZLLL;
        c49954Jj4.getClass();
        String str4 = SearchApi.LIZ;
        if (c49954Jj4.LIZIZ == null) {
            c49954Jj4.LIZIZ = str4;
            if (str4 == null) {
                str4 = "";
            }
            c49954Jj4.LIZ(str4, "search_domain");
        }
        EnumC48190Ivi enumC48190Ivi = C2NU.LIZ.LIZIZ;
        if (c49954Jj4.LIZJ == null) {
            c49954Jj4.LIZJ = enumC48190Ivi;
            Object obj = enumC48190Ivi;
            if (enumC48190Ivi == null) {
                obj = "";
            }
            c49954Jj4.LIZ(obj, "network");
        }
        EnumC48394Iz0 LIZIZ2 = C48398Iz4.LIZ.LIZIZ();
        if (c49954Jj4.LIZLLL == null) {
            c49954Jj4.LIZLLL = LIZIZ2;
            if (LIZIZ2 != 0) {
                str3 = LIZIZ2;
            }
            c49954Jj4.LIZ(str3, "band_width_quality");
        }
        EnumC48190Ivi enumC48190Ivi2 = c49954Jj4.LIZJ;
        EnumC48190Ivi enumC48190Ivi3 = EnumC48190Ivi.NONE;
        if (enumC48190Ivi2 == enumC48190Ivi3 || enumC48190Ivi2 == enumC48190Ivi3) {
            LJ.LIZJ(1, "NO_NETWORK");
        }
        C49951Jj1 c49951Jj1 = LJ;
        if (c49951Jj1.LJ == null) {
            c49951Jj1.LJ = 0;
            c49951Jj1.LIZ(0, "count");
        }
        C49949Jiz c49949Jiz = LJFF;
        c49949Jiz.getClass();
        c49949Jiz.LIZIZ = System.currentTimeMillis();
    }

    public static void LJ(View view, String str) {
        boolean z;
        C49949Jiz c49949Jiz = LJFF;
        c49949Jiz.getClass();
        boolean z2 = LIZIZ;
        boolean z3 = LIZJ;
        if (c49949Jiz.LIZLLL != -1 || c49949Jiz.LJFF) {
            z = true;
        } else {
            z = false;
        }
        if (z2 || !z || z3 || !o.LJ(str, LJI.LJ)) {
            return;
        }
        view.postOnAnimation(new ARunnableS44S0100000_8(c49949Jiz, 151));
    }
}

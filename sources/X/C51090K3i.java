package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.K3i, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51090K3i {
    public static final long LIZ;
    public static final java.util.Map<String, KAL> LIZIZ;
    public static Integer LIZJ;
    public static long LIZLLL;
    public static long LJ;

    public static String LIZ() {
        C50469JrN searchVideoModel;
        C50652JuK.Companion.getClass();
        C50650JuI LIZJ2 = C50651JuJ.LIZJ();
        if (LIZJ2 != null && (searchVideoModel = LIZJ2.getSearchVideoModel()) != null) {
            return searchVideoModel.getGroupId();
        }
        return null;
    }

    public static void LIZJ() {
        C51091K3j c51091K3j = new C51091K3j();
        c51091K3j.LJIILL("start_time", String.valueOf(LIZLLL));
        c51091K3j.LJIILL("refresh_blankpage_time", String.valueOf(0L));
        c51091K3j.LJIILL("end_blankpage_time", String.valueOf(LJ));
        c51091K3j.LJIILL("refresh_blankpage_cost", String.valueOf(0 - LIZLLL));
        c51091K3j.LJIILL("decision_blankpage_cost", String.valueOf(LJ - 0));
        c51091K3j.LJIILL("end_blankpage_cost", String.valueOf(LJ - LIZLLL));
        c51091K3j.LJIILIIL();
        LIZLLL = 0L;
        LJ = 0L;
    }

    static {
        SettingsManager.LIZLLL().getClass();
        LIZ = SettingsManager.LJ("middle_page_recom_search_valid_time", 15) * 1000;
        LIZIZ = new LinkedHashMap();
        LIZJ = 0;
    }

    public static String LIZIZ(String str) {
        HashMap<?, ?> hashMap;
        KAL kal = (KAL) ((LinkedHashMap) LIZIZ).get(str);
        if (kal == null || (hashMap = kal.LIZJ) == null || hashMap.isEmpty()) {
            return "[]";
        }
        String json = GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), hashMap);
        o.LJIIIIZZ(json, "get().gson.toJson(words)");
        return json;
    }
}

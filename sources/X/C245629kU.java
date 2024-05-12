package X;

import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.consume.model.SearchConsumeModel;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.9kU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C245629kU {
    public static boolean LIZ;
    public static String LIZIZ = "";
    public static final LruCache<String, String> LIZJ = new LruCache<>(200);

    public static ArrayList LIZIZ() {
        ArrayList<C86919Y9j> LIZIZ2;
        ArrayList arrayList = new ArrayList();
        C245599kR c245599kR = C86918Y9i.LIZJ;
        String curUserId = C86918Y9i.LJ;
        o.LJIIIIZZ(curUserId, "curUserId");
        c245599kR.getClass();
        C245619kT c245619kT = (C245619kT) ((HashMap) c245599kR.LIZ).get(curUserId);
        if (c245619kT == null) {
            c245619kT = new C245619kT(curUserId);
            ((HashMap) c245599kR.LIZ).put(curUserId, c245619kT);
        }
        if (c245619kT.LJLJI == null) {
            c245619kT.LJLJI = new C170206m8(2);
        }
        C170206m8 c170206m8 = c245619kT.LJLJI;
        if (c170206m8 != null && (LIZIZ2 = ((C245589kQ) c170206m8.LIZ).LIZIZ(20)) != null && (!LIZIZ2.isEmpty())) {
            Iterator<C86919Y9j> it = LIZIZ2.iterator();
            while (it.hasNext()) {
                SearchConsumeModel LIZ2 = C86922Y9m.LIZ(it.next());
                if (LIZ2 != null) {
                    arrayList.add(GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), LIZ2));
                }
            }
        }
        return arrayList;
    }

    public static void LIZ(String str, String str2) {
        if (!TextUtils.equals(str, LIZIZ)) {
            LIZJ.evictAll();
            if (!TextUtils.isEmpty("general_search") && ORZ.LJLJJI("general_search", (HashSet) C87091YFz.LIZIZ.getValue())) {
                C245599kR c245599kR = C86918Y9i.LIZJ;
                String curUserId = C86918Y9i.LJ;
                o.LJIIIIZZ(curUserId, "curUserId");
                c245599kR.LIZ(curUserId, "general_search");
            }
        }
        LIZIZ = str;
        LIZJ.put(str2, str2);
    }
}

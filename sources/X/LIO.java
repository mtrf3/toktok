package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LIO {
    public static boolean LIZIZ;
    public static final ArrayList<String> LIZ = new ArrayList<>();
    public static final ArrayList<Aweme> LIZJ = new ArrayList<>();

    public static LIP LIZ() {
        ActivityC45651qj LIZLLL = StateOwner.LJLIL.LIZLLL();
        if (LIZLLL != null) {
            LMU lmu = C3SZ.LIZ(LIZLLL).LJLIL;
            if (lmu.LIZ == 2) {
                String str = lmu.LIZIZ;
                lmu.LIZIZ = null;
                if (str == null) {
                    str = "";
                }
                if (str.length() > 0) {
                    ListProtector.add(LIZ, 0, str);
                    lmu.LIZIZ = "";
                }
            }
        }
        ArrayList<String> arrayList = LIZ;
        if (arrayList.size() == 0) {
            return new LIP("", false);
        }
        String LIZJ2 = C75792yF.LIZJ(arrayList);
        o.LJIIIIZZ(LIZJ2, "toJson(insertAwemeIds)");
        LIP lip = new LIP(LIZJ2, LIZIZ);
        arrayList.clear();
        LIZIZ = false;
        return lip;
    }
}

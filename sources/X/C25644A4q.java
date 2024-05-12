package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.A4q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25644A4q {
    public static final int[] LIZ;

    static {
        int[] iArr;
        String optValue = "";
        String string = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getString("zl_mtk_param", "");
        if (!C35810E3q.LJIIIIZZ() || !o.LJ(string, "")) {
            optValue = string;
        }
        if (optValue != null && optValue.length() != 0) {
            try {
                o.LJIIIIZZ(optValue, "optValue");
                List LJLJJI = s.LJLJJI(optValue, new char[]{','}, false, 6);
                ArrayList arrayList = new ArrayList(C32I.LJJL(LJLJJI, 10));
                Iterator it = LJLJJI.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.decode((String) it.next()));
                }
                iArr = ORZ.LLJ(arrayList);
            } catch (Throwable unused) {
            }
            LIZ = iArr;
        }
        iArr = null;
        LIZ = iArr;
    }
}

package X;

import com.ss.android.ugc.aweme.experiment.Candidate;
import com.ss.android.ugc.aweme.experiment.Entrance;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.LKy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54096LKy {
    public final ActivityC45651qj LIZ;
    public final LNP LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final List<? extends LML> LIZ(boolean z) {
        List<Candidate> list;
        LM4 c54095LKx;
        if (z) {
            Entrance LIZJ = C53765L8f.LIZJ();
            if (LIZJ != null) {
                list = LIZJ.candidates;
            }
            list = null;
        } else {
            Entrance LJFF = C53765L8f.LJFF();
            if (LJFF != null) {
                list = LJFF.candidates;
            }
            list = null;
        }
        if (!C40471FuV.LIZ() || list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Candidate> it = list.iterator();
        while (it.hasNext()) {
            String str = it.next().entranceKey;
            if (o.LJ(str, this.LIZJ) || o.LJ(str, this.LIZLLL)) {
                if (o.LJ(str, this.LIZLLL)) {
                    c54095LKx = new C54095LKx(this.LIZ, this.LIZIZ);
                } else if (o.LJ(str, this.LIZJ)) {
                    c54095LKx = new LL0(this.LIZ, this.LIZIZ);
                }
                arrayList.add(new LM5(c54095LKx));
            }
        }
        return arrayList;
    }

    public C54096LKy(ActivityC45651qj activityC45651qj, LNP environmentConfig) {
        o.LJIIIZ(environmentConfig, "environmentConfig");
        this.LIZ = activityC45651qj;
        this.LIZIZ = environmentConfig;
        this.LIZJ = "USER";
        this.LIZLLL = "NOTIFICATION";
    }
}

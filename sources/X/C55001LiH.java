package X;

import android.os.Handler;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LiH, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55001LiH {
    public static volatile C55001LiH LIZJ;
    public final List<RunnableC55000LiG> LIZ = new ArrayList();
    public final Handler LIZIZ = new Handler(C16880lQ.LLJJJJ());

    public static C55001LiH LIZ() {
        if (LIZJ == null) {
            synchronized (C55001LiH.class) {
                if (LIZJ == null) {
                    LIZJ = new C55001LiH();
                }
            }
        }
        return LIZJ;
    }

    public final void LIZJ(C55002LiI c55002LiI) {
        Aweme aweme = c55002LiI.LIZIZ;
        if (aweme == null || TextUtils.isEmpty(aweme.getAid()) || c55002LiI.LIZLLL == null) {
            return;
        }
        RunnableC55000LiG runnableC55000LiG = new RunnableC55000LiG(c55002LiI);
        ((ArrayList) this.LIZ).add(runnableC55000LiG);
        this.LIZIZ.postDelayed(runnableC55000LiG, c55002LiI.LIZ);
    }

    public final RunnableC55000LiG LIZIZ(String str, EnumC55042Liw enumC55042Liw) {
        C55002LiI c55002LiI;
        Aweme aweme;
        Iterator it = ((ArrayList) this.LIZ).iterator();
        while (it.hasNext()) {
            RunnableC55000LiG runnableC55000LiG = (RunnableC55000LiG) it.next();
            if (runnableC55000LiG != null && (c55002LiI = runnableC55000LiG.LJLIL) != null && (aweme = c55002LiI.LIZIZ) != null && aweme.getAid() != null && runnableC55000LiG.LJLIL.LIZIZ.getAid().equals(str) && runnableC55000LiG.LJLIL.LIZLLL == enumC55042Liw) {
                return runnableC55000LiG;
            }
        }
        return null;
    }
}

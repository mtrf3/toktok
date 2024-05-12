package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NN3 {
    public String LIZ;
    public final String LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public List<String> LJII;
    public List<NN3> LJIIIIZZ;

    public NN3() {
        this("", "", -1, -1, -1, -1, -1, new ArrayList(), new ArrayList());
    }

    public NN3(String sessionId, String aid, int i, int i2, int i3, int i4, int i5, List<String> thisReqAidList, List<NN3> lastReqList) {
        o.LJIIIZ(sessionId, "sessionId");
        o.LJIIIZ(aid, "aid");
        o.LJIIIZ(thisReqAidList, "thisReqAidList");
        o.LJIIIZ(lastReqList, "lastReqList");
        this.LIZ = sessionId;
        this.LIZIZ = aid;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = i3;
        this.LJFF = i4;
        this.LJI = i5;
        this.LJII = thisReqAidList;
        this.LJIIIIZZ = lastReqList;
    }
}

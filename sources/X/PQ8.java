package X;

import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes12.dex */
public final class PQ8 {
    public final java.util.Map<String, PQM> LIZ;
    public final List<PQN> LIZIZ;
    public final List<InterfaceC28215B5n> LIZJ;
    public final List<InterfaceC28214B5m> LIZLLL;
    public Executor LJ;
    public final List<PQO> LJFF;

    public PQ8(AwemeHostApplication awemeHostApplication) {
        if (C16880lQ.LLLLL(awemeHostApplication) != null) {
            this.LIZ = new LinkedHashMap();
            this.LIZIZ = new ArrayList();
            this.LIZJ = new ArrayList();
            this.LIZLLL = new ArrayList();
            this.LJFF = new ArrayList();
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Cannot get application context from context : ");
        LIZ.append(awemeHostApplication);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }
}

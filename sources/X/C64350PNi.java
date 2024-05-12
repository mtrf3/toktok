package X;

import Y.ARunnableS0S1200110_11;
import com.ss.android.ugc.aweme.services.performance.LagDataCallback;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.PNi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64350PNi implements PH7, PH6 {
    public final String LJLIL;
    public LagDataCallback LJLILLLLZI;
    public double LJLJI;
    public long LJLJJI;

    public C64350PNi(String mScene) {
        o.LJIIIZ(mScene, "mScene");
        this.LJLIL = mScene;
        this.LJLILLLLZI = null;
    }

    @Override // X.PH6
    public final void LIZJ(JSONObject frameDropInfo) {
        o.LJIIIZ(frameDropInfo, "frameDropInfo");
        String scene = this.LJLIL;
        long j = this.LJLJJI;
        double d = this.LJLJI;
        o.LJIIIZ(scene, "scene");
        F9U.LIZ.LIZJ(new ARunnableS0S1200110_11(this, scene, j, d, frameDropInfo, 1));
        this.LJLJJI = -1L;
        this.LJLJI = -1.0d;
    }

    @Override // X.PH7
    public final void LIZLLL(double d) {
        this.LJLJI = d;
    }
}

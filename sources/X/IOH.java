package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.experiment.CommitConfig;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes9.dex */
public final class IOH {
    public static boolean LIZJ;
    public static final CommitConfig LIZ = new CommitConfig(false, null, 0, 7, 0 == true ? 1 : 0);
    public static final C5H3 LIZIZ = C221108m2.LIZ(EnumC221088m0.PUBLICATION, IOI.LJLIL);
    public static final IOJ LIZLLL = IOJ.LJLIL;

    public static final void LIZ() {
        C5H3 c5h3 = LIZIZ;
        if (!((CommitConfig) c5h3.getValue()).open) {
            return;
        }
        IOJ ioj = LIZLLL;
        C1DH.LIZJ(ioj);
        C1DH.LJJIJIIJIL(((CommitConfig) c5h3.getValue()).delayTime, ioj);
    }

    public static final void LIZIZ(String scene) {
        o.LJIIIZ(scene, "scene");
        C5H3 c5h3 = LIZIZ;
        String str = ((CommitConfig) c5h3.getValue()).affectScene;
        if (!((CommitConfig) c5h3.getValue()).open || str == null || TextUtils.isEmpty(str) || !s.LJJJLZIJ(str, scene, false)) {
            return;
        }
        LIZJ = true;
        C1DH.LIZJ(LIZLLL);
    }
}

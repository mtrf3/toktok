package X;

import com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HAR implements HAZ {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ HAM LIZIZ;

    @Override // X.HAZ
    public final void onFailed() {
    }

    @Override // X.HAZ
    public final void LIZ(MvThemeData mvThemeData) {
        o.LJIIIZ(mvThemeData, "mvThemeData");
        if (o.LJ("singlepiceffect", this.LIZ)) {
            this.LIZIZ.LIZ(mvThemeData);
        } else {
            if (!o.LJ("slideshoweffect", this.LIZ)) {
                return;
            }
            this.LIZIZ.LIZIZ(mvThemeData);
        }
    }

    public HAR(String str, HAM ham) {
        this.LIZ = str;
        this.LIZIZ = ham;
    }
}

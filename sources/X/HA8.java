package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HA8 implements HAY {
    public final HA6 LIZ;
    public final MvThemeData LIZIZ;
    public final /* synthetic */ HAA LIZJ;

    @Override // X.HAY
    public final void onFailed() {
        HA6 ha6;
        if (!this.LIZJ.LIZLLL && (ha6 = this.LIZ) != null) {
            ha6.LIZ(this.LIZIZ, null, null, false, false);
        }
        this.LIZJ.LIZIZ.removeCallbacksAndMessages(null);
    }

    public HA8(HAA haa, HA6 ha6, MvThemeData mvThemeData) {
        o.LJIIIZ(mvThemeData, "mvThemeData");
        this.LIZJ = haa;
        this.LIZ = ha6;
        this.LIZIZ = mvThemeData;
    }

    @Override // X.HAY
    public final void LIZ(MusicModel musicModel, String musicFile, boolean z) {
        HA6 ha6;
        o.LJIIIZ(musicModel, "musicModel");
        o.LJIIIZ(musicFile, "musicFile");
        if (!this.LIZJ.LIZLLL && (ha6 = this.LIZ) != null) {
            ha6.LIZ(this.LIZIZ, musicModel, musicFile, z, false);
        }
        this.LIZJ.LIZIZ.removeCallbacksAndMessages(null);
    }
}

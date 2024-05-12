package X;

import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.tools.live.RecordLiveViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WU8 implements WUI {
    public final /* synthetic */ WU4 LIZ;
    public final /* synthetic */ WU7 LIZIZ;

    public final boolean LIZJ() {
        RecordLiveViewModel recordLiveViewModel = this.LIZ.LJLJJL;
        if (recordLiveViewModel != null) {
            ShortVideoContext shortVideoContext = recordLiveViewModel.LJLJJI;
            if (shortVideoContext == null) {
                return false;
            }
            o.LJI(shortVideoContext);
            return !shortVideoContext.LJJJI();
        }
        o.LJIJI("recordLiveViewModel");
        throw null;
    }

    @Override // X.WUI
    public final void LIZ() {
        if (LIZJ() && this.LIZIZ.LJIIJ() != null) {
            View LJIIJ = this.LIZIZ.LJIIJ();
            o.LJI(LJIIJ);
            LJIIJ.setVisibility(8);
        }
    }

    @Override // X.WUI
    public final void LIZIZ() {
        if (LIZJ() && this.LIZIZ.LJIIJ() != null) {
            View LJIIJ = this.LIZIZ.LJIIJ();
            o.LJI(LJIIJ);
            LJIIJ.setVisibility(0);
        }
    }

    public WU8(WU4 wu4, WU7 wu7) {
        this.LIZ = wu4;
        this.LIZIZ = wu7;
    }
}

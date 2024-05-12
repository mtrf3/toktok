package com.ss.android.ugc.aweme.commercialize.media.impl.viewmodel;

import X.C221108m2;
import X.C61878OQg;
import X.C62822Ol8;
import X.N4R;
import X.N4T;
import X.N4Y;
import X.NFK;
import X.ORZ;
import X.V1M;
import X.V8H;
import X.XLM;
import androidx.lifecycle.ViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.commercialize.media.impl.utils.ScopedMusicPlayer;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;
import kotlin.jvm.internal.AqS160S0100000_10;

/* loaded from: classes11.dex */
public final class RecommendMusicV2ViewModel extends ViewModel {
    public N4R LJLIL;
    public MusicDetail LJLILLLLZI;
    public final XLM LJLJI = V8H.LIZ(null);
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 92));
    public final XLM LJLJJL = V8H.LIZ(new N4T("", C61878OQg.INSTANCE, false));

    public final void gv0(int i) {
        ScopedMusicPlayer scopedMusicPlayer;
        MusicModel musicModel = (MusicModel) ORZ.LJLLLLLL(i, (List) this.LJLJJI.getValue());
        if (musicModel == null) {
            return;
        }
        int i2 = N4Y.LIZ[((NFK) ListProtector.get(((N4T) V1M.LIZLLL(this.LJLJJL).getValue()).LJLIL, i)).LJI.ordinal()];
        if (i2 != 1) {
            if (i2 != 2 || (scopedMusicPlayer = (ScopedMusicPlayer) this.LJLJI.getValue()) == null) {
                return;
            }
            scopedMusicPlayer.pause();
            return;
        }
        ScopedMusicPlayer scopedMusicPlayer2 = (ScopedMusicPlayer) this.LJLJI.getValue();
        if (scopedMusicPlayer2 == null) {
            return;
        }
        scopedMusicPlayer2.LIZIZ(musicModel);
    }
}

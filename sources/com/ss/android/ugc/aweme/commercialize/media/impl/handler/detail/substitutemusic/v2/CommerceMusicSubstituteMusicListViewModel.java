package com.ss.android.ugc.aweme.commercialize.media.impl.handler.detail.substitutemusic.v2;

import X.C221108m2;
import X.C61878OQg;
import X.C62822Ol8;
import X.N4T;
import X.N4X;
import X.NFK;
import X.ORZ;
import X.V1M;
import X.V8H;
import X.XLM;
import androidx.lifecycle.ViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.commercialize.media.impl.logging.CommerceMusicLogger;
import com.ss.android.ugc.aweme.commercialize.media.impl.utils.ScopedMusicPlayer;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class CommerceMusicSubstituteMusicListViewModel extends ViewModel {
    public MusicDetail LJLIL;
    public ScopedMusicPlayer LJLILLLLZI;
    public CommerceMusicLogger LJLJI;
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 91));
    public final Map<Integer, Long> LJLJJL = new LinkedHashMap();
    public final XLM LJLJJLL = V8H.LIZ(new N4T("", C61878OQg.INSTANCE, false));

    public final List<MusicModel> hv0() {
        return (List) this.LJLJJI.getValue();
    }

    public final void gv0(int i) {
        MusicModel musicModel = (MusicModel) ORZ.LJLLLLLL(i, hv0());
        if (musicModel == null) {
            return;
        }
        int i2 = N4X.LIZ[((NFK) ListProtector.get(((N4T) V1M.LIZLLL(this.LJLJJLL).getValue()).LJLIL, i)).LJI.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                return;
            }
            ScopedMusicPlayer scopedMusicPlayer = this.LJLILLLLZI;
            if (scopedMusicPlayer != null) {
                scopedMusicPlayer.pause();
                return;
            } else {
                o.LJIJI("musicPlayer");
                throw null;
            }
        }
        ScopedMusicPlayer scopedMusicPlayer2 = this.LJLILLLLZI;
        if (scopedMusicPlayer2 != null) {
            scopedMusicPlayer2.LIZIZ(musicModel);
        } else {
            o.LJIJI("musicPlayer");
            throw null;
        }
    }
}

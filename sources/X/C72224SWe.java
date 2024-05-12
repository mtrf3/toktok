package X;

import Y.ACListenerS32S0100000_12;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.assem.music.refactor.VideoMusicTitleRefactorAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicReleaseInfo;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.SWe, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72224SWe implements SXL {
    public final VideoMusicTitleRefactorAssem LIZ;
    public final LinearLayout LIZIZ;
    public final ImageView LIZJ;
    public final TuxIconView LIZLLL;
    public final InterfaceC65784Pro<Boolean> LJ;

    @Override // X.SXL
    public final boolean LIZIZ(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        return true;
    }

    @Override // X.SXL
    public final void LIZ(VideoItemParams item) {
        Music music;
        MusicReleaseInfo musicReleaseInfo;
        o.LJIIIZ(item, "item");
        if (C30581Hy.LJIL(item.mEventType) && (music = item.getAweme().getMusic()) != null && (musicReleaseInfo = music.getMusicReleaseInfo()) != null && musicReleaseInfo.isNewReleaseSong()) {
            C225098sT.LIZ(item, false);
        }
    }

    @Override // X.SXL
    public final void LIZJ(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        TuxIconView tuxIconView = this.LIZLLL;
        if (tuxIconView != null) {
            C17N.LJJLIIIJJI(tuxIconView);
        }
        LinearLayout linearLayout = this.LIZIZ;
        if (linearLayout != null) {
            C17N.LJJIIJZLJL(linearLayout);
        }
        ImageView imageView = this.LIZJ;
        if (imageView != null) {
            C17N.LJJIIJZLJL(imageView);
        }
        TuxIconView tuxIconView2 = this.LIZLLL;
        if (tuxIconView2 != null) {
            C16880lQ.LJJJ(tuxIconView2, new ACListenerS32S0100000_12(this, 178));
        }
    }

    @Override // X.SXL
    public final boolean LIZLLL(VideoItemParams item, double d) {
        o.LJIIIZ(item, "item");
        return true;
    }

    public C72224SWe(VideoMusicTitleRefactorAssem musicTitleAssem, LinearLayout linearLayout, ImageView imageView, TuxIconView tuxIconView, AqS162S0100000_12 aqS162S0100000_12) {
        o.LJIIIZ(musicTitleAssem, "musicTitleAssem");
        this.LIZ = musicTitleAssem;
        this.LIZIZ = linearLayout;
        this.LIZJ = imageView;
        this.LIZLLL = tuxIconView;
        this.LJ = aqS162S0100000_12;
    }
}

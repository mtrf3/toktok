package X;

import Y.ARunnableS14S0210000_15;
import Y.ARunnableS34S0200000_15;
import Y.ARunnableS51S0100000_15;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicView;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.XTe, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84886XTe {
    public final /* synthetic */ VerticalMusicView LIZ;

    public final void LIZIZ() {
        VerticalMusicView verticalMusicView = this.LIZ;
        SafeHandler safeHandler = verticalMusicView.LLILIL;
        if (safeHandler != null) {
            safeHandler.post(new ARunnableS51S0100000_15(verticalMusicView, 46));
            WPY.LIZIZ(false, "edit_music", XW2.TAB_COLLECT.getStringValue(), 8);
        } else {
            o.LJIJI("safeHander");
            throw null;
        }
    }

    public final void LIZLLL() {
        VerticalMusicView verticalMusicView = this.LIZ;
        SafeHandler safeHandler = verticalMusicView.LLILIL;
        if (safeHandler != null) {
            safeHandler.post(new ARunnableS51S0100000_15(verticalMusicView, 47));
            WPY.LIZIZ(false, "edit_music", XW2.TAB_COLLECT.getStringValue(), 8);
        } else {
            o.LJIJI("safeHander");
            throw null;
        }
    }

    public C84886XTe(VerticalMusicView verticalMusicView) {
        this.LIZ = verticalMusicView;
    }

    public final void LIZ(List<? extends MusicModel> musicList) {
        o.LJIIIZ(musicList, "musicList");
        this.LIZ.LJLILLLLZI.Q9(musicList);
    }

    public final void LIZJ(List<? extends MusicModel> recommendedMusicList, boolean z) {
        o.LJIIIZ(recommendedMusicList, "recommendedMusicList");
        VerticalMusicView verticalMusicView = this.LIZ;
        Iterator<? extends MusicModel> it = recommendedMusicList.iterator();
        while (it.hasNext()) {
            verticalMusicView.LJLILLLLZI.X9(it.next());
        }
        VerticalMusicView verticalMusicView2 = this.LIZ;
        verticalMusicView2.LLJ.LJII.LIZ = z;
        SafeHandler safeHandler = verticalMusicView2.LLILIL;
        if (safeHandler != null) {
            safeHandler.post(new ARunnableS34S0200000_15(verticalMusicView2, recommendedMusicList, 24));
        } else {
            o.LJIJI("safeHander");
            throw null;
        }
    }

    public final void LJ(List<? extends MusicModel> musicList, boolean z) {
        o.LJIIIZ(musicList, "musicList");
        VerticalMusicView verticalMusicView = this.LIZ;
        Iterator<? extends MusicModel> it = musicList.iterator();
        while (it.hasNext()) {
            verticalMusicView.LJLILLLLZI.X9(it.next());
        }
        VerticalMusicView verticalMusicView2 = this.LIZ;
        SafeHandler safeHandler = verticalMusicView2.LLILIL;
        if (safeHandler != null) {
            safeHandler.post(new ARunnableS14S0210000_15(musicList, verticalMusicView2, z, 3));
            WPY.LIZIZ(true, "edit_music", XW2.TAB_COLLECT.getStringValue(), 8);
        } else {
            o.LJIJI("safeHander");
            throw null;
        }
    }
}

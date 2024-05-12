package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicView;
import kotlin.jvm.internal.o;

/* renamed from: X.XTx, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84905XTx<T1, T2, R> implements RTU {
    public final /* synthetic */ VerticalMusicView LJLIL;

    public C84905XTx(VerticalMusicView verticalMusicView) {
        this.LJLIL = verticalMusicView;
    }

    @Override // X.RTU
    public final Object apply(Object obj, Object obj2) {
        C43023GuZ it = (C43023GuZ) obj;
        MusicModel musicModel = (MusicModel) obj2;
        o.LJIIIZ(it, "it");
        o.LJIIIZ(musicModel, "musicModel");
        VerticalMusicView verticalMusicView = this.LJLIL;
        XZG xzg = verticalMusicView.LLIZLLLIL;
        xzg.LJIIIZ = true;
        xzg.LJIIJ = musicModel;
        verticalMusicView.LJIJ(it, musicModel);
        return it;
    }
}

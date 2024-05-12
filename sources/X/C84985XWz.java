package X;

import com.ss.android.ugc.aweme.choosemusic.fragment.LocalMusicTabFragment;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.XWz, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84985XWz implements InterfaceC43955HMx {
    public final /* synthetic */ LocalMusicTabFragment LIZ;

    public C84985XWz(LocalMusicTabFragment localMusicTabFragment) {
        this.LIZ = localMusicTabFragment;
    }

    @Override // X.InterfaceC43955HMx
    public final void onFailed(int i) {
        this.LIZ.LJLLL = false;
    }

    @Override // X.InterfaceC43955HMx
    public final void onSuccess(List<? extends MusicModel> musicList) {
        o.LJIIIZ(musicList, "musicList");
        this.LIZ.LJLLL = true;
    }
}

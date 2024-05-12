package X;

import com.ss.android.ugc.aweme.services.upload.IServiceMusicResDownListener;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HAW implements HAY {
    public final /* synthetic */ IServiceMusicResDownListener LIZ;

    @Override // X.HAY
    public final void onFailed() {
        IServiceMusicResDownListener iServiceMusicResDownListener = this.LIZ;
        if (iServiceMusicResDownListener != null) {
            iServiceMusicResDownListener.onFailed();
        }
    }

    public HAW(C45461Hsn c45461Hsn) {
        this.LIZ = c45461Hsn;
    }

    @Override // X.HAY
    public final void LIZ(MusicModel musicModel, String musicFile, boolean z) {
        o.LJIIIZ(musicModel, "musicModel");
        o.LJIIIZ(musicFile, "musicFile");
        IServiceMusicResDownListener iServiceMusicResDownListener = this.LIZ;
        if (iServiceMusicResDownListener != null) {
            iServiceMusicResDownListener.onSuccess(musicModel, musicFile);
        }
    }
}

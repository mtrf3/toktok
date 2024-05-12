package X;

import com.ss.android.ugc.aweme.services.upload.IServiceMusicResDownListener;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import kotlin.jvm.internal.AqS12S0010000_7;
import kotlin.jvm.internal.AqS60S1100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Hsn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45461Hsn implements IServiceMusicResDownListener {
    public final ShortVideoContext LIZ;
    public final ChooseMediaViewModel LIZIZ;
    public final int LIZJ;

    @Override // com.ss.android.ugc.aweme.services.upload.IServiceMusicResDownListener
    public final void onFailed() {
    }

    @Override // com.ss.android.ugc.aweme.services.upload.IServiceMusicResDownListener
    public final void onSuccess(MusicModel musicModel, String musicFile) {
        ShortVideoContext shortVideoContext;
        Workspace workspace;
        o.LJIIIZ(musicModel, "musicModel");
        o.LJIIIZ(musicFile, "musicFile");
        ChooseMediaViewModel chooseMediaViewModel = this.LIZIZ;
        if (chooseMediaViewModel != null) {
            chooseMediaViewModel.setState(new AqS12S0010000_7(true, 15));
        }
        ChooseMediaViewModel chooseMediaViewModel2 = this.LIZIZ;
        if (chooseMediaViewModel2 != null) {
            chooseMediaViewModel2.setState(new AqS60S1100000_7(musicModel, musicFile, 5));
        }
        ChooseMediaViewModel chooseMediaViewModel3 = this.LIZIZ;
        if (chooseMediaViewModel3 != null) {
            chooseMediaViewModel3.setState(new AqS60S1100000_7(musicModel, musicFile, 4));
        }
        int i = this.LIZJ;
        if ((i == 9 || i == 18 || i == 24 || i == 36 || i == 31) && (shortVideoContext = this.LIZ) != null && (workspace = shortVideoContext.cameraComponentModel.mWorkspace) != null) {
            workspace.LLILLL(musicFile);
        }
    }

    public C45461Hsn(ShortVideoContext shortVideoContext, ChooseMediaViewModel chooseMediaViewModel, int i) {
        this.LIZ = shortVideoContext;
        this.LIZIZ = chooseMediaViewModel;
        this.LIZJ = i;
    }
}

package X;

import com.ss.android.ugc.aweme.services.story.forward.ForwardImageDownloader;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMedia;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader;
import djb.IDaS23S0000000_7;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes8.dex */
public final class GZJ implements ForwardImageDownloader {
    public final C64962gm LIZ = C48841JEv.LIZ(C78613UtF.LIZJ.plus(new IDaS23S0000000_7(CoroutineExceptionHandler.LJJJJIZL, 1)));

    @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardImageDownloader
    public final void downloadPhotoModeResource(ForwardMedia source, List<ForwardMediaDownloader.DownloadConfig> downloadConfig, ForwardImageDownloader.ImageDownloadListener callback) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(downloadConfig, "downloadConfig");
        o.LJIIIZ(callback, "callback");
        XKX.LIZLLL(this.LIZ, null, null, new GZH(source, downloadConfig, callback, this, null), 3);
    }
}

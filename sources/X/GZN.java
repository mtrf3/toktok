package X;

import com.ss.android.ugc.aweme.canvas.ForwardVideo;
import com.ss.android.ugc.aweme.canvas.VideoDownloadPartialResult;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GZN implements ForwardMediaDownloader {
    @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader
    public final void download(ForwardVideo video, ForwardMediaDownloader.DownloadConfig downloadConfig, VideoDownloadPartialResult videoDownloadPartialResult, ForwardMediaDownloader.DownloadListener callback) {
        o.LJIIIZ(video, "video");
        o.LJIIIZ(downloadConfig, "downloadConfig");
        o.LJIIIZ(callback, "callback");
    }
}

package X;

import com.ss.android.ugc.aweme.services.story.forward.ForwardImageDownloader;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMedia;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GZK implements ForwardImageDownloader {
    @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardImageDownloader
    public final void downloadPhotoModeResource(ForwardMedia source, List<ForwardMediaDownloader.DownloadConfig> downloadConfig, ForwardImageDownloader.ImageDownloadListener callback) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(downloadConfig, "downloadConfig");
        o.LJIIIZ(callback, "callback");
    }
}

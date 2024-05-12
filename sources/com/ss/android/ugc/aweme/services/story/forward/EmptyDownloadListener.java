package com.ss.android.ugc.aweme.services.story.forward;

import com.ss.android.ugc.aweme.canvas.VideoDownloadPartialResult;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class EmptyDownloadListener implements ForwardMediaDownloader.DownloadListener {
    @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader.DownloadListener
    public void onError(int i, String str, Exception exc, VideoDownloadPartialResult videoDownloadPartialResult) {
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader.DownloadListener
    public void onFileHeaderInfoReady(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader.DownloadListener
    public void onSuccess(String sourcePath) {
        o.LJIIIZ(sourcePath, "sourcePath");
    }
}

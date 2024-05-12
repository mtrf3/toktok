package com.ss.android.ugc.aweme.services.story.forward;

import com.ss.android.ugc.aweme.canvas.VideoDownloadPartialResult;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader;
import java.util.List;

/* loaded from: classes8.dex */
public interface ForwardImageDownloader {
    void downloadPhotoModeResource(ForwardMedia forwardMedia, List<ForwardMediaDownloader.DownloadConfig> list, ImageDownloadListener imageDownloadListener);

    /* loaded from: classes8.dex */
    public interface ImageDownloadListener {
        void onError(int i, String str, Exception exc, VideoDownloadPartialResult videoDownloadPartialResult);

        void onFileHeaderInfoReady(boolean z);

        void onSuccess(List<String> list);

        /* loaded from: classes8.dex */
        public static final class DefaultImpls {
            public static /* synthetic */ void onError$default(ImageDownloadListener imageDownloadListener, int i, String str, Exception exc, VideoDownloadPartialResult videoDownloadPartialResult, int i2, Object obj) {
                if (obj == null) {
                    if ((i2 & 8) != 0) {
                        videoDownloadPartialResult = null;
                    }
                    imageDownloadListener.onError(i, str, exc, videoDownloadPartialResult);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onError");
            }
        }
    }
}

package X;

import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.comment.viewerlist.viewmodel.VideoViewerListVM;

/* renamed from: X.77Q, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C77Q {
    public static VideoViewerListVM LIZ(ActivityC45651qj activityC45651qj) {
        VideoViewerListVM videoViewerListVM = (VideoViewerListVM) ViewModelProviders.of(activityC45651qj).get(VideoViewerListVM.class);
        if (videoViewerListVM.LJLILLLLZI == null) {
            videoViewerListVM.LJLILLLLZI = new VideoViewerListVM.BubbleVideoViewerViewModel(videoViewerListVM, activityC45651qj);
        }
        return videoViewerListVM;
    }
}

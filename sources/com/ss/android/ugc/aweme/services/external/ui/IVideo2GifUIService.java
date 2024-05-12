package com.ss.android.ugc.aweme.services.external.ui;

import X.ActivityC45651qj;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.services.videochoose.IVideoChoose;
import com.ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;

/* loaded from: classes8.dex */
public interface IVideo2GifUIService {
    IVideoChoose toMusVideoChooseFragment(ActivityC45651qj activityC45651qj, Fragment fragment, IVideoChoose.Callback callback, Integer num);

    Fragment video2GifFragment(VideoShare2GifEditContext videoShare2GifEditContext);
}

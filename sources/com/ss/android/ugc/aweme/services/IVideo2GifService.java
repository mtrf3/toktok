package com.ss.android.ugc.aweme.services;

import X.HOR;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;

/* loaded from: classes8.dex */
public interface IVideo2GifService {

    /* loaded from: classes8.dex */
    public interface ConvertListener {
        void onConfigured(HOR hor);

        void onDone(boolean z);

        void onStart();

        void onUpdateProgress(int i);
    }

    Fragment getGifCutVideoFragment(VideoShare2GifEditContext videoShare2GifEditContext);
}

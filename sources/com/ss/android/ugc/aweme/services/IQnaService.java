package com.ss.android.ugc.aweme.services;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* loaded from: classes13.dex */
public interface IQnaService {
    void clearSearchHistoryKeva();

    boolean enablePublicQna();

    String getQaPersonalProfileEventName();

    String getQaPersonalProfileSearchEventName();

    void injectQnaBanner(FrameLayout frameLayout, List<Long> list);

    boolean isQnaAugmentationFYPBannerEnabled();

    boolean isQnaAugmentationQuestionDetailBannerEnabled();

    void setQuestionAwemeListCacheCache(long j, int i, int i2, List<Aweme> list);

    void setupQnaBanner(ViewGroup viewGroup, Fragment fragment, String str, View.OnClickListener onClickListener);
}

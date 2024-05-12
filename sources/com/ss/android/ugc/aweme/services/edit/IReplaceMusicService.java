package com.ss.android.ugc.aweme.services.edit;

import X.ActivityC45651qj;
import X.C9PK;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public interface IReplaceMusicService {
    void doRequest(String str, ReplaceMusicRequest replaceMusicRequest, ActivityC45651qj activityC45651qj);

    void doRequest(String str, ReplaceMusicRequest replaceMusicRequest, ActivityC45651qj activityC45651qj, PromoteReplaceMusicRequest promoteReplaceMusicRequest);

    boolean getClickPost();

    String getCover();

    String getReplaceMusicContentType();

    ReplaceMusicRequest getReplaceMusicRequest();

    int getSimilarTag();

    boolean isCopyrightPhase2Enabled();

    boolean isInPublish();

    int isLongVideo();

    void mobProfileTabClientClick(String str, int i, int i2, String str2, String str3, String str4, String str5);

    void mobProfileTabClientShow(String str, int i, int i2, String str2, String str3, String str4, String str5);

    void retryInPromoteScene(PromoteReplaceMusicRequest promoteReplaceMusicRequest);

    void setClickPost(boolean z);

    void setCover(String str);

    void setLongVideo(int i);

    void setReplaceMusicContentType(String str);

    void setReplaceMusicRequest(ReplaceMusicRequest replaceMusicRequest);

    void setSimilarTag(int i);

    boolean shouldShowCopyrightViolationSnackBar(Aweme aweme);

    void showCopyrightViolationSnackBar(ViewGroup viewGroup, C9PK c9pk, Aweme aweme);

    void showWindow(JSONObject jSONObject, boolean z);

    void showWindow(boolean z, String str, ReplaceMusicRequest replaceMusicRequest);
}

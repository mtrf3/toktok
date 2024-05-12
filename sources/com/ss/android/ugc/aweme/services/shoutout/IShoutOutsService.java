package com.ss.android.ugc.aweme.services.shoutout;

import X.ActivityC45651qj;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.shoutouts.ShoutOutsData;
import com.ss.android.ugc.aweme.shoutouts.ShoutoutSettings;

/* loaded from: classes8.dex */
public interface IShoutOutsService {
    int getAuthorCount();

    boolean getInFollowingTab();

    boolean getInMainTab();

    ShoutoutSettings getShoutOutSettingsModel();

    boolean getUseShoutoutAuthor();

    boolean isShoutoutPostDialog(Object obj);

    void publishShoutOuts(ActivityC45651qj activityC45651qj, Object obj, Bundle bundle);

    void setAuthorCount(int i);

    void setInFollowingTab(boolean z);

    void setInMainTab(boolean z);

    void setUseShoutoutAuthor(boolean z);

    void startDownLoadVideo(ActivityC45651qj activityC45651qj, CreativeInfo creativeInfo, String str, ShoutoutVideoDownloadListener shoutoutVideoDownloadListener);

    void startShoutoutsPublishActivity(Activity activity, Intent intent);

    void startShoutoutsPublishActivityFromDL(Activity activity, Uri uri);

    void startShoutoutsPublishActivityFromNative(Activity activity, ShoutOutsData shoutOutsData);

    void startShoutoutsPublishSyncActivity(Activity activity, CreativeInfo creativeInfo, String str, String str2, String str3);
}

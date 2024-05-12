package com.ss.android.ugc.aweme.services.external;

import android.content.Context;
import com.ss.android.ugc.aweme.composer.model.CreationConfigModelCompat;
import com.ss.android.ugc.aweme.services.external.ui.IEditService;
import com.ss.android.ugc.aweme.services.external.ui.IPublishPageService;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import com.ss.android.ugc.aweme.services.external.ui.ITestActivityService;
import com.ss.android.ugc.aweme.services.external.ui.IVideo2GifUIService;

/* loaded from: classes8.dex */
public interface IUIService {
    IVideo2GifUIService abilityUiService();

    IEditService editService();

    IPublishPageService publishService();

    IRecordService recordService();

    ITestActivityService schemaTestService();

    void startCreation(Context context, CreationConfigModelCompat creationConfigModelCompat);

    void startCreationFromDeepLink(Context context, CreationConfigModelCompat creationConfigModelCompat);

    void startSuperEntraceActivity(Context context);
}

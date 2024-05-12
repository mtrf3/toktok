package com.ss.android.ugc.aweme.services.dm;

import X.GUX;
import X.OSZ;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.io.File;

/* loaded from: classes2.dex */
public interface IDMPublishService {
    void addPublishCallback(String str, GUX gux);

    OSZ<Boolean, BaseShortVideoContext> createPhotoPublishEditModel(String str, String str2, int i, boolean z, boolean z2, boolean z3);

    OSZ<Boolean, BaseShortVideoContext> createVideoPublishEditModel(String str, String str2, int i, int i2, long j, int i3, int i4, int i5, int i6, boolean z);

    ICreativePathServiceProxy creativePathServiceProxy();

    File getCreativeToolsRootDir();

    String getCurrentUid();

    String getEnterDM(BaseShortVideoContext baseShortVideoContext);

    Integer getMediaType(BaseShortVideoContext baseShortVideoContext);

    String getVideoPath(BaseShortVideoContext baseShortVideoContext);

    String publishDMMedia(PublishModel publishModel);

    void removePublishCallback(String str, GUX gux);
}

package com.ss.android.ugc.aweme.services.dm;

import X.C58096Mr6;
import X.GUX;
import X.OSZ;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.wavepublish.dm.service.DMPublishServiceImpl;
import java.io.File;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class DMPublishService implements IDMPublishService {
    public static final DMPublishService INSTANCE = new DMPublishService();
    public final /* synthetic */ IDMPublishService $$delegate_0;

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public void addPublishCallback(String publishId, GUX publishCallback) {
        o.LJIIIZ(publishId, "publishId");
        o.LJIIIZ(publishCallback, "publishCallback");
        this.$$delegate_0.addPublishCallback(publishId, publishCallback);
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public OSZ<Boolean, BaseShortVideoContext> createPhotoPublishEditModel(String key, String path, int i, boolean z, boolean z2, boolean z3) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(path, "path");
        return this.$$delegate_0.createPhotoPublishEditModel(key, path, i, z, z2, z3);
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public OSZ<Boolean, BaseShortVideoContext> createVideoPublishEditModel(String key, String videoPath, int i, int i2, long j, int i3, int i4, int i5, int i6, boolean z) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(videoPath, "videoPath");
        return this.$$delegate_0.createVideoPublishEditModel(key, videoPath, i, i2, j, i3, i4, i5, i6, z);
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public ICreativePathServiceProxy creativePathServiceProxy() {
        return this.$$delegate_0.creativePathServiceProxy();
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public File getCreativeToolsRootDir() {
        return this.$$delegate_0.getCreativeToolsRootDir();
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public String getCurrentUid() {
        return this.$$delegate_0.getCurrentUid();
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public String getEnterDM(BaseShortVideoContext editModel) {
        o.LJIIIZ(editModel, "editModel");
        return this.$$delegate_0.getEnterDM(editModel);
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public Integer getMediaType(BaseShortVideoContext editModel) {
        o.LJIIIZ(editModel, "editModel");
        return this.$$delegate_0.getMediaType(editModel);
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public String getVideoPath(BaseShortVideoContext editModel) {
        o.LJIIIZ(editModel, "editModel");
        return this.$$delegate_0.getVideoPath(editModel);
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public String publishDMMedia(PublishModel publishModel) {
        o.LJIIIZ(publishModel, "publishModel");
        return this.$$delegate_0.publishDMMedia(publishModel);
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public void removePublishCallback(String publishId, GUX publishCallback) {
        o.LJIIIZ(publishId, "publishId");
        o.LJIIIZ(publishCallback, "publishCallback");
        this.$$delegate_0.removePublishCallback(publishId, publishCallback);
    }

    public DMPublishService() {
        IDMPublishService iDMPublishService;
        Object LIZ = C58096Mr6.LIZ(IDMPublishService.class, false);
        if (LIZ != null) {
            iDMPublishService = (IDMPublishService) LIZ;
        } else {
            if (C58096Mr6.c8 == null) {
                synchronized (IDMPublishService.class) {
                    if (C58096Mr6.c8 == null) {
                        C58096Mr6.c8 = new DMPublishServiceImpl();
                    }
                }
            }
            iDMPublishService = C58096Mr6.c8;
        }
        this.$$delegate_0 = iDMPublishService;
    }
}

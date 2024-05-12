package com.ss.android.ugc.effectmanager.knadapt;

import com.bef.effectsdk.ResourceFinder;
import com.ss.android.ugc.effectmanager.DownloadableModelSupportResourceFinder;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class KNResourceFinder extends DownloadableModelSupportResourceFinder {
    public final ResourceFinder resourceFinder;

    public KNResourceFinder(ResourceFinder resourceFinder) {
        o.LJIIJ(resourceFinder, "resourceFinder");
        this.resourceFinder = resourceFinder;
    }

    @Override // com.ss.android.ugc.effectmanager.DownloadableModelSupportResourceFinder, com.bef.effectsdk.ResourceFinder
    public long createNativeResourceFinder(long j) {
        return this.resourceFinder.createNativeResourceFinder(j);
    }

    @Override // com.ss.android.ugc.effectmanager.DownloadableModelSupportResourceFinder, com.bef.effectsdk.ResourceFinder
    public void release(long j) {
        this.resourceFinder.release(j);
    }
}

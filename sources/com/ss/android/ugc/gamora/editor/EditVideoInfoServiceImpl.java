package com.ss.android.ugc.gamora.editor;

import X.C58096Mr6;
import android.text.TextUtils;
import android.util.LruCache;
import com.ss.android.ugc.aweme.services.edit.IEditVideoInfoService;
import com.ss.android.ugc.aweme.services.edit.VideoInfoData;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class EditVideoInfoServiceImpl implements IEditVideoInfoService {
    public final LruCache<String, Long> LIZ = new LruCache<>(10);
    public final LruCache<String, VideoInfoData> LIZIZ = new LruCache<>(10);

    public static IEditVideoInfoService LIZ() {
        Object LIZ = C58096Mr6.LIZ(IEditVideoInfoService.class, false);
        if (LIZ != null) {
            return (IEditVideoInfoService) LIZ;
        }
        if (C58096Mr6.u8 == null) {
            synchronized (IEditVideoInfoService.class) {
                if (C58096Mr6.u8 == null) {
                    C58096Mr6.u8 = new EditVideoInfoServiceImpl();
                }
            }
        }
        return C58096Mr6.u8;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IEditVideoInfoService
    public final VideoInfoData getVideoInfoData(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.LIZIZ.get(str);
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IEditVideoInfoService
    public final Long getVideoLength(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return this.LIZ.get(str);
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IEditVideoInfoService
    public final void setVideoInfoData(String str, VideoInfoData model) {
        o.LJIIIZ(model, "model");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.LIZIZ.put(str, model);
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IEditVideoInfoService
    public final void setVideoLength(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.LIZ.put(str, Long.valueOf(j));
    }
}

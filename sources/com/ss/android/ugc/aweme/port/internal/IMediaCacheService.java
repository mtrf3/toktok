package com.ss.android.ugc.aweme.port.internal;

import X.OSZ;
import android.graphics.Bitmap;

/* loaded from: classes8.dex */
public interface IMediaCacheService {
    void cacheImageColor(String str, int i);

    void cacheImageSize(String str);

    void cacheMediaBlurThumbnail(String str, int i, Integer num);

    OSZ<Integer, Integer> getImageColorCache(String str);

    OSZ<Integer, Integer> getImageSizeCache(String str);

    Bitmap getMediaBlurThumbnail(String str);

    Boolean getMediaTypeCache(String str);

    void removeTargetMediaBlurThumbnailCache(String str);

    void updateMediaTypeCache(String str);
}

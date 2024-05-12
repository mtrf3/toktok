package com.ss.android.ugc.aweme.feed.model;

import X.ORZ;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;
import ujb.o;

/* loaded from: classes4.dex */
public final class PhotoModeImageInfoKt {
    public static final boolean hasLocalImagePath(PhotoModeImageInfo photoModeImageInfo) {
        List<PhotoModeImageUrlModel> imageList;
        Boolean bool;
        boolean z;
        List<String> urlList;
        String str;
        if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
            for (PhotoModeImageUrlModel photoModeImageUrlModel : imageList) {
                UrlModel displayImageNoWatermark = photoModeImageUrlModel.getDisplayImageNoWatermark();
                if (displayImageNoWatermark != null && (urlList = displayImageNoWatermark.getUrlList()) != null && (str = (String) ORZ.LJLLLLLL(0, urlList)) != null) {
                    bool = Boolean.valueOf(o.LJJJLIIL(str, "file://", false));
                } else {
                    bool = null;
                }
                if (photoModeImageUrlModel.getSourceFrom() == PhotoSourceFromScene.PUBLISH) {
                    z = true;
                } else {
                    z = false;
                }
                if (kotlin.jvm.internal.o.LJ(bool, Boolean.TRUE) || z) {
                    return true;
                }
            }
        }
        return false;
    }
}

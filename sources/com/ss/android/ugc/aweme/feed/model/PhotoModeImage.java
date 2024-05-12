package com.ss.android.ugc.aweme.feed.model;

import X.F9E;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PhotoModeImage extends F9E {
    public final int height;
    public final UrlModel urlModel;
    public final int width;

    public static /* synthetic */ PhotoModeImage copy$default(PhotoModeImage photoModeImage, UrlModel urlModel, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            urlModel = photoModeImage.urlModel;
        }
        if ((i3 & 2) != 0) {
            i = photoModeImage.width;
        }
        if ((i3 & 4) != 0) {
            i2 = photoModeImage.height;
        }
        return photoModeImage.copy(urlModel, i, i2);
    }

    public final PhotoModeImage copy(UrlModel urlModel, int i, int i2) {
        o.LJIIIZ(urlModel, "urlModel");
        return new PhotoModeImage(urlModel, i, i2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.urlModel, Integer.valueOf(this.width), Integer.valueOf(this.height)};
    }

    public PhotoModeImage(UrlModel urlModel, int i, int i2) {
        o.LJIIIZ(urlModel, "urlModel");
        this.urlModel = urlModel;
        this.width = i;
        this.height = i2;
    }
}

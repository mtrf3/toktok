package com.ss.android.ugc.aweme.services.video;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public interface OnGetVideoCoverCallback {
    void onGetVideoCoverFailed(int i);

    void onGetVideoCoverSuccess(Bitmap bitmap);
}

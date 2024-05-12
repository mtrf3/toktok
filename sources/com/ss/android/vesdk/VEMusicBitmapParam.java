package com.ss.android.vesdk;

import android.graphics.Bitmap;

/* loaded from: classes12.dex */
public class VEMusicBitmapParam {
    public int lineCnt;
    public Bitmap lyricsBitmap;

    public void recycleBitmap(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }

    public VEMusicBitmapParam(Bitmap bitmap, int i) {
        this.lyricsBitmap = bitmap;
        this.lineCnt = i;
    }
}

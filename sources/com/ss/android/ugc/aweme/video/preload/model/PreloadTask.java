package com.ss.android.ugc.aweme.video.preload.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;

/* loaded from: classes9.dex */
public class PreloadTask {
    public boolean alreadyPreload;

    @InterfaceC65349Pkn("count")
    public int count;

    @InterfaceC65349Pkn("offset")
    public int offset;

    @InterfaceC65349Pkn("download_progress")
    public int progress;

    @InterfaceC65349Pkn("size")
    public int size;

    public int getVideoPreloadSize() {
        int i = this.size;
        if (i <= 0) {
            return 10485759;
        }
        return i * 1024;
    }

    public PreloadTask() {
        this.progress = 100;
        this.count = 1;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PreloadTask{progress=");
        LIZ.append(this.progress);
        LIZ.append(", offset=");
        LIZ.append(this.offset);
        LIZ.append(", count=");
        LIZ.append(this.count);
        LIZ.append(", size=");
        return b0.LIZJ(LIZ, this.size, '}', LIZ);
    }

    public PreloadTask(int i, int i2) {
        this.progress = 100;
        this.count = i;
        this.size = i2;
    }
}

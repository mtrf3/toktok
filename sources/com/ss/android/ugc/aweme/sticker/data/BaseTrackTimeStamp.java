package com.ss.android.ugc.aweme.sticker.data;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class BaseTrackTimeStamp implements Serializable {

    @InterfaceC65349Pkn("p")
    public int pts;

    public boolean isFullTrack() {
        if (-1 == this.pts) {
            return true;
        }
        return false;
    }

    public BaseTrackTimeStamp() {
        this.pts = -1;
    }

    public int getPts() {
        return this.pts;
    }

    public BaseTrackTimeStamp(int i) {
        this.pts = i;
    }

    public void setPts(int i) {
        this.pts = i;
    }
}

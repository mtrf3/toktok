package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes13.dex */
public class FakeLandscapeInfo implements Serializable {

    @InterfaceC65349Pkn("bottom")
    public float bottom;

    @InterfaceC65349Pkn("fake_landscape_video_type")
    public int fakeLandscapeVideoType;

    @InterfaceC65349Pkn("left")
    public float left;

    @InterfaceC65349Pkn("right")
    public float right;

    @InterfaceC65349Pkn("top")
    public float top;

    /* loaded from: classes13.dex */
    public interface FAKE_VIDEO_TYPE {
    }

    public boolean isValid() {
        if (this.left >= 0.0f && this.right >= 0.0f && this.bottom >= 0.0f && this.top >= 0.0f) {
            return true;
        }
        return false;
    }

    public float getBottom() {
        return this.bottom;
    }

    public int getFakeLandscapeVideoType() {
        return this.fakeLandscapeVideoType;
    }

    public float getLeft() {
        return this.left;
    }

    public float getRight() {
        return this.right;
    }

    public float getTop() {
        return this.top;
    }

    public void setBottom(float f) {
        this.bottom = f;
    }

    public void setFakeLandscapeVideoType(int i) {
        this.fakeLandscapeVideoType = i;
    }

    public void setLeft(float f) {
        this.left = f;
    }

    public void setRight(float f) {
        this.right = f;
    }

    public void setTop(float f) {
        this.top = f;
    }
}

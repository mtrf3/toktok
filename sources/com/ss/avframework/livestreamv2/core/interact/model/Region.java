package com.ss.avframework.livestreamv2.core.interact.model;

/* loaded from: classes12.dex */
public class Region {
    public double cornerRadius;
    public String mInteractId;
    public int mMediaType;
    public boolean mMuteAudio;
    public boolean mMuteVideo;
    public int mStatus;
    public boolean mTalking;
    public long mUserId;
    public double mX;
    public double mY;
    public int mZorder;
    public float spatialPosX;
    public float spatialPosY;
    public float spatialPosZ;
    public double mWidth = 1.0d;
    public double mHeight = 1.0d;
    public boolean mNeedWriteToSei = true;
    public int renderMode = 1;

    public double getCornerRadius() {
        return this.cornerRadius;
    }

    public double getHeight() {
        return this.mHeight;
    }

    public String getInteractId() {
        return this.mInteractId;
    }

    public int getMediaType() {
        return this.mMediaType;
    }

    public int getRenderMode() {
        return this.renderMode;
    }

    public float getSpatialPosX() {
        return this.spatialPosX;
    }

    public float getSpatialPosY() {
        return this.spatialPosY;
    }

    public float getSpatialPosZ() {
        return this.spatialPosZ;
    }

    public int getStatus() {
        return this.mStatus;
    }

    public long getUserId() {
        return this.mUserId;
    }

    public double getWidth() {
        return this.mWidth;
    }

    public double getX() {
        return this.mX;
    }

    public double getY() {
        return this.mY;
    }

    public int getZorder() {
        return this.mZorder;
    }

    public boolean isMuteAudio() {
        return this.mMuteAudio;
    }

    public boolean isMuteVideo() {
        return this.mMuteVideo;
    }

    public boolean isTalking() {
        return this.mTalking;
    }

    public boolean needWriteToSei() {
        return this.mNeedWriteToSei;
    }

    public Region interactId(String str) {
        this.mInteractId = str;
        return this;
    }

    public Region mediaType(int i) {
        this.mMediaType = i;
        return this;
    }

    public Region muteAudio(boolean z) {
        this.mMuteAudio = z;
        return this;
    }

    public Region muteVideo(boolean z) {
        this.mMuteVideo = z;
        return this;
    }

    public Region setCornerRadius(double d) {
        this.cornerRadius = d;
        return this;
    }

    public Region setRenderMode(int i) {
        this.renderMode = i;
        return this;
    }

    public Region status(int i) {
        this.mStatus = i;
        return this;
    }

    public Region talking(boolean z) {
        this.mTalking = z;
        return this;
    }

    public Region userId(long j) {
        this.mUserId = j;
        return this;
    }

    public Region writeToSei(boolean z) {
        this.mNeedWriteToSei = z;
        return this;
    }

    public Region zOrder(int i) {
        this.mZorder = i;
        return this;
    }

    public Region position(double d, double d2) {
        this.mX = d;
        this.mY = d2;
        return this;
    }

    public Region size(double d, double d2) {
        this.mWidth = d;
        this.mHeight = d2;
        return this;
    }

    public Region setSpatialAudioPos(float f, float f2, float f3) {
        this.spatialPosX = f;
        this.spatialPosY = f2;
        this.spatialPosZ = f3;
        return this;
    }
}

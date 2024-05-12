package com.bytedance.android.live.broadcast.api.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.user.User;

/* loaded from: classes.dex */
public class DutyGiftInfo {

    @InterfaceC65349Pkn("duty_id")
    public long mDutyId;

    @InterfaceC65349Pkn("speedy_gift_id")
    public long mGiftId;

    @InterfaceC65349Pkn("contribute_most")
    public User mMvpUser;

    @InterfaceC65349Pkn("score")
    public long mScore;

    @InterfaceC65349Pkn("stage_count")
    public long mStageCount;

    @InterfaceC65349Pkn("status")
    public int mStatus;
    public int mSuccess;

    @InterfaceC65349Pkn("target_score")
    public long mTargetScore;

    public boolean isFinished() {
        if (this.mStatus == 4) {
            return true;
        }
        return false;
    }

    public boolean isPlaying() {
        if (this.mStatus == 3) {
            return true;
        }
        return false;
    }

    public boolean isStarted() {
        if (this.mStatus == 2) {
            return true;
        }
        return false;
    }

    public long getDutyId() {
        return this.mDutyId;
    }

    public long getGiftId() {
        return this.mGiftId;
    }

    public User getMvpUser() {
        return this.mMvpUser;
    }

    public long getScore() {
        return this.mScore;
    }

    public long getStageCount() {
        return this.mStageCount;
    }

    public int getStatus() {
        return this.mStatus;
    }

    public long getTargetScore() {
        return this.mTargetScore;
    }

    public int isSuccess() {
        return this.mSuccess;
    }

    public void setDutyId(long j) {
        this.mDutyId = j;
    }

    public void setGiftId(long j) {
        this.mGiftId = j;
    }

    public void setMvpUser(User user) {
        this.mMvpUser = user;
    }

    public void setScore(long j) {
        this.mScore = j;
    }

    public void setStageCount(long j) {
        this.mStageCount = j;
    }

    public void setStatus(int i) {
        this.mStatus = i;
    }

    public void setSuccess(int i) {
        this.mSuccess = i;
    }

    public void setTargetScore(long j) {
        this.mTargetScore = j;
    }
}

package com.heytap.msp.push.mode;

import X.X1D;

/* loaded from: classes28.dex */
public class DataMessage extends BaseMode {
    public String mAppId;
    public String mAppPackage;
    public String mBalanceTime;
    public String mContent;
    public String mDataExtra;
    public String mDescription;
    public String mDistinctContent;
    public String mEndDate;
    public String mEventId;
    public String mForcedDelivery;
    public String mGlobalId;
    public String mMessageID;
    public int mMessageType;
    public int mMsgCommand;
    public int mNotifyID;
    public String mRule;
    public String mStartDate;
    public String mStatisticsExtra;
    public String mTimeRanges;
    public String mTitle;
    public String mTaskID = "";
    public String mMiniProgramPkg = "";

    public String getAppId() {
        return this.mAppId;
    }

    public String getAppPackage() {
        return this.mAppPackage;
    }

    public String getBalanceTime() {
        return this.mBalanceTime;
    }

    public String getContent() {
        return this.mContent;
    }

    public String getDataExtra() {
        return this.mDataExtra;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public String getDistinctContent() {
        return this.mDistinctContent;
    }

    public String getEndDate() {
        return this.mEndDate;
    }

    public String getEventId() {
        return this.mEventId;
    }

    public String getForcedDelivery() {
        return this.mForcedDelivery;
    }

    public String getGlobalId() {
        return this.mGlobalId;
    }

    public String getMessageID() {
        return this.mMessageID;
    }

    public int getMessageType() {
        return this.mMessageType;
    }

    public String getMiniProgramPkg() {
        return this.mMiniProgramPkg;
    }

    public int getMsgCommand() {
        return this.mMsgCommand;
    }

    public int getNotifyID() {
        return this.mNotifyID;
    }

    public String getRule() {
        return this.mRule;
    }

    public String getStartDate() {
        return this.mStartDate;
    }

    public String getStatisticsExtra() {
        return this.mStatisticsExtra;
    }

    public String getTaskID() {
        return this.mTaskID;
    }

    public String getTimeRanges() {
        return this.mTimeRanges;
    }

    public String getTitle() {
        return this.mTitle;
    }

    @Override // com.heytap.msp.push.mode.BaseMode
    public int getType() {
        return 4103;
    }

    public void setAppId(String str) {
        this.mAppId = str;
    }

    public void setAppPackage(String str) {
        this.mAppPackage = str;
    }

    public void setBalanceTime(String str) {
        this.mBalanceTime = str;
    }

    public void setContent(String str) {
        this.mContent = str;
    }

    public void setDataExtra(String str) {
        this.mDataExtra = str;
    }

    public void setDescription(String str) {
        this.mDescription = str;
    }

    public void setDistinctContent(String str) {
        this.mDistinctContent = str;
    }

    public void setEndDate(String str) {
        this.mEndDate = str;
    }

    public void setEventId(String str) {
        this.mEventId = str;
    }

    public void setForcedDelivery(String str) {
        this.mForcedDelivery = str;
    }

    public void setGlobalId(String str) {
        this.mGlobalId = str;
    }

    public void setMessageID(String str) {
        this.mMessageID = str;
    }

    public void setMessageType(int i) {
        this.mMessageType = i;
    }

    public void setMiniProgramPkg(String str) {
        this.mMiniProgramPkg = str;
    }

    public void setMsgCommand(int i) {
        this.mMsgCommand = i;
    }

    public void setNotifyID(int i) {
        this.mNotifyID = i;
    }

    public void setRule(String str) {
        this.mRule = str;
    }

    public void setStartDate(String str) {
        this.mStartDate = str;
    }

    public void setStatisticsExtra(String str) {
        this.mStatisticsExtra = str;
    }

    public void setTaskID(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(i);
        LIZ.append("");
        this.mTaskID = X1D.LIZIZ(LIZ);
    }

    public void setTaskID(String str) {
        this.mTaskID = str;
    }

    public void setTimeRanges(String str) {
        this.mTimeRanges = str;
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DataMessage{mMessageID='");
        LIZ.append(this.mMessageID);
        LIZ.append('\'');
        LIZ.append("mMessageType='");
        LIZ.append(this.mMessageType);
        LIZ.append('\'');
        LIZ.append("mAppPackage='");
        LIZ.append(this.mAppPackage);
        LIZ.append('\'');
        LIZ.append(", mTaskID='");
        LIZ.append(this.mTaskID);
        LIZ.append('\'');
        LIZ.append("mTitle='");
        LIZ.append(this.mTitle);
        LIZ.append('\'');
        LIZ.append("mNotifyID='");
        LIZ.append(this.mNotifyID);
        LIZ.append('\'');
        LIZ.append(", mContent='");
        LIZ.append(this.mContent);
        LIZ.append('\'');
        LIZ.append(", mGlobalId='");
        LIZ.append(this.mGlobalId);
        LIZ.append('\'');
        LIZ.append(", mBalanceTime='");
        LIZ.append(this.mBalanceTime);
        LIZ.append('\'');
        LIZ.append(", mStartDate='");
        LIZ.append(this.mStartDate);
        LIZ.append('\'');
        LIZ.append(", mEndDate='");
        LIZ.append(this.mEndDate);
        LIZ.append('\'');
        LIZ.append(", mTimeRanges='");
        LIZ.append(this.mTimeRanges);
        LIZ.append('\'');
        LIZ.append(", mRule='");
        LIZ.append(this.mRule);
        LIZ.append('\'');
        LIZ.append(", mForcedDelivery='");
        LIZ.append(this.mForcedDelivery);
        LIZ.append('\'');
        LIZ.append(", mDistinctContent='");
        LIZ.append(this.mDistinctContent);
        LIZ.append('\'');
        LIZ.append(", mAppId='");
        LIZ.append(this.mAppId);
        LIZ.append('\'');
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }
}

package com.bytedance.android.livesdk.api.model;

import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes6.dex */
public class WaitingReviewInfo {

    @InterfaceC65349Pkn("audit_content")
    public String content;

    @InterfaceC65349Pkn("audit_status")
    public int status;

    @InterfaceC65349Pkn("total_queue_cnt")
    public int totalWaitingCount;

    @InterfaceC65349Pkn("cur_wait_cnt")
    public int waitingCount;

    @InterfaceC65349Pkn("rule_info")
    public List<WaitingReviewRule> waitingReviewRules;

    @InterfaceC65349Pkn("to_wait_time")
    public int waitingTime;

    public String getContent() {
        return this.content;
    }

    public int getStatus() {
        return this.status;
    }

    public int getTotalWaitingCount() {
        return this.totalWaitingCount;
    }

    public int getWaitingCount() {
        return this.waitingCount;
    }

    public List<WaitingReviewRule> getWaitingReviewRules() {
        return this.waitingReviewRules;
    }

    public int getWaitingTime() {
        return this.waitingTime;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setTotalWaitingCount(int i) {
        this.totalWaitingCount = i;
    }

    public void setWaitingCount(int i) {
        this.waitingCount = i;
    }

    public void setWaitingReviewRules(List<WaitingReviewRule> list) {
        this.waitingReviewRules = list;
    }

    public void setWaitingTime(int i) {
        this.waitingTime = i;
    }
}

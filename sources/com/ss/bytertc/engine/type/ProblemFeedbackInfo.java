package com.ss.bytertc.engine.type;

import java.util.List;

/* loaded from: classes33.dex */
public class ProblemFeedbackInfo {
    public String problemDesc;
    public List<ProblemFeedbackRoomInfo> roomInfo;

    public ProblemFeedbackRoomInfo[] getRoomInfo() {
        List<ProblemFeedbackRoomInfo> list = this.roomInfo;
        if (list == null) {
            return null;
        }
        return (ProblemFeedbackRoomInfo[]) list.toArray(new ProblemFeedbackRoomInfo[0]);
    }

    public ProblemFeedbackInfo() {
    }

    public String getProblemDesc() {
        return this.problemDesc;
    }

    public ProblemFeedbackInfo(String str) {
        this.problemDesc = str;
    }
}

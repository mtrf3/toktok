package com.bytedance.android.livesdk.survey.model;

import X.InterfaceC65349Pkn;
import java.util.HashMap;

/* loaded from: classes14.dex */
public class SurveySubmitRequest {

    @InterfaceC65349Pkn("content")
    public String content;

    @InterfaceC65349Pkn("room_id")
    public long roomId;

    @InterfaceC65349Pkn("survey_id")
    public String surveyId;

    public final HashMap<String, Object> LIZ() {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("room_id", Long.valueOf(this.roomId));
        hashMap.put("survey_id", this.surveyId);
        hashMap.put("content", this.content);
        return hashMap;
    }

    public SurveySubmitRequest(long j, String str, String str2) {
        this.roomId = j;
        this.surveyId = str;
        this.content = str2;
    }
}

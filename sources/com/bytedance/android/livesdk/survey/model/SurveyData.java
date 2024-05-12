package com.bytedance.android.livesdk.survey.model;

import X.InterfaceC65349Pkn;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* loaded from: classes14.dex */
public class SurveyData {

    @InterfaceC65349Pkn("background_audio")
    public String backgroundAudio;

    @InterfaceC65349Pkn("background_audio_length")
    public long backgroundAudioLength;

    @InterfaceC65349Pkn("background_video")
    public String backgroundVideo;

    @InterfaceC65349Pkn("background_video_length")
    public long backgroundVideoLength;

    @InterfaceC65349Pkn("feed_back")
    public String feedBack;

    @InterfaceC65349Pkn("question_list")
    public List<SurveyQuestion> questionList;

    @InterfaceC65349Pkn("show_mode")
    public SurveyShowMode showMode;

    @InterfaceC65349Pkn("survey_id")
    public String surveyId;

    @InterfaceC65349Pkn("survey_version")
    public long surveyVersion;

    public final SurveyQuestion LIZ() {
        return (SurveyQuestion) ListProtector.get(this.questionList, 0);
    }
}

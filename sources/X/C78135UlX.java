package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.watchlive.SurveyStyleV3Setting;
import com.bytedance.android.livesdk.survey.model.SurveyData;
import com.bytedance.android.livesdk.survey.model.SurveyOption;
import com.bytedance.android.livesdk.survey.model.SurveyQuestion;
import com.bytedance.android.livesdk.survey.model.SurveySecondQuestion;
import com.bytedance.android.livesdk.watch.IWatchLiveService;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.UlX, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78135UlX extends AbstractC31497CXt<InterfaceC78129UlR> {
    public final C73318Sq2 LJLIL = new C73318Sq2();
    public SurveyData LJLILLLLZI;
    public C87856Ydw LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;

    public final long LJJJJ() {
        long j;
        long j2;
        C87856Ydw c87856Ydw = this.LJLJI;
        if (c87856Ydw == null) {
            return 0L;
        }
        C78150Ulm c78150Ulm = c87856Ydw.LJIIIZ;
        c78150Ulm.getClass();
        long uptimeMillis = SystemClock.uptimeMillis();
        if (c78150Ulm.LIZIZ) {
            j = uptimeMillis - c78150Ulm.LIZLLL;
            j2 = c78150Ulm.LJFF;
        } else {
            long j3 = c78150Ulm.LJ;
            if (j3 != 0) {
                j = j3 - c78150Ulm.LIZLLL;
                j2 = c78150Ulm.LJFF;
            } else {
                return c78150Ulm.LJFF;
            }
        }
        return j + j2;
    }

    public final void LJJJJIZL() {
        String str;
        Integer num;
        SurveyQuestion LIZ;
        SurveyQuestion LIZ2;
        List<SurveyOption> list;
        if (this.LJLJJI) {
            return;
        }
        this.LJLJJI = true;
        SurveyData surveyData = this.LJLILLLLZI;
        BZI LIZ3 = C28787BRn.LIZ("livesdk_survey_notify");
        LIZ3.LJIILLIIL(this.dataChannel);
        String str2 = null;
        if (surveyData != null) {
            str = surveyData.surveyId;
        } else {
            str = null;
        }
        C06510Nj.LIZ((C29374Bfu) TTL.LIZJ(LIZ3, str, "survey_id"), LIZ3, "user_id");
        if (surveyData != null && (LIZ2 = surveyData.LIZ()) != null && (list = LIZ2.optionList) != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        LIZ3.LJIJJ(num, "no_of_choice");
        LIZ3.LJIJJ(Integer.valueOf(((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).ZY()), "room_position");
        if (surveyData != null && (LIZ = surveyData.LIZ()) != null) {
            str2 = LIZ.questionId;
        }
        C06490Nh.LIZLLL(LIZ3, str2, "question_id", "half_screen", "survey_format");
    }

    public final void LJJJJI(long j, EnumC78138Ula enumC78138Ula, long j2) {
        String str;
        Integer num;
        SurveyQuestion LIZ;
        List<SurveyOption> list;
        int i;
        List<SurveySecondQuestion> list2;
        SurveyQuestion LIZ2;
        SurveyQuestion LIZ3;
        List<SurveyOption> list3;
        if (o.LJ(enumC78138Ula.getMethod(), "nl") || this.LJLJJL || !this.LJLJJI) {
            return;
        }
        this.LJLJJL = true;
        SurveyData surveyData = this.LJLILLLLZI;
        BZI LIZ4 = C28787BRn.LIZ("livesdk_exit_survey");
        LIZ4.LJIILLIIL(this.dataChannel);
        String str2 = null;
        if (surveyData != null) {
            str = surveyData.surveyId;
        } else {
            str = null;
        }
        C06510Nj.LIZ((C29374Bfu) TTL.LIZJ(LIZ4, str, "survey_id"), LIZ4, "user_id");
        if (surveyData != null && (LIZ3 = surveyData.LIZ()) != null && (list3 = LIZ3.optionList) != null) {
            num = Integer.valueOf(list3.size());
        } else {
            num = null;
        }
        LIZ4.LJIJJ(num, "no_of_choice");
        LIZ4.LJIJJ(Long.valueOf(j), "stay_time");
        C06530Nl.LIZLLL(LIZ4, enumC78138Ula.getMethod(), "exit_method", j2, "option_id");
        LIZ4.LJIJJ(Long.valueOf(j2), "result");
        LIZ4.LJIJJ(Integer.valueOf(((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).ZY()), "room_position");
        if (surveyData != null && (LIZ2 = surveyData.LIZ()) != null) {
            str2 = LIZ2.questionId;
        }
        LIZ4.LJIJJ(str2, "question_id");
        LIZ4.LJIJJ("half_screen", "survey_format");
        if (SurveyStyleV3Setting.INSTANCE.hasSecondSurvey()) {
            int i2 = 0;
            if (surveyData != null && (LIZ = surveyData.LIZ()) != null && (list = LIZ.optionList) != null) {
                i2 = 0;
                for (SurveyOption surveyOption : list) {
                    if (surveyOption != null && (list2 = surveyOption.secondList) != null) {
                        i = list2.size();
                    } else {
                        i = 0;
                    }
                    i2 += i;
                }
            }
            LIZ4.LJIJJ(Integer.valueOf(i2), "no_of_secondary_choice");
        }
        LIZ4.LJJIIJZLJL();
    }
}

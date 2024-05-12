package com.bytedance.android.livesdk.survey.fullscreenstyle;

import X.BJL;
import X.BJO;
import X.BM1;
import X.BZI;
import X.C06510Nj;
import X.C28246B6s;
import X.C28787BRn;
import X.C29374Bfu;
import X.C73318Sq2;
import X.CN1;
import X.EnumC72165STx;
import X.InterfaceC75370Ti2;
import X.TTL;
import X.X1D;
import android.os.SystemClock;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.livesdk.dataChannel.FullScreenSurveyShowing;
import com.bytedance.android.livesdk.livesetting.watchlive.SurveyStyleV3Setting;
import com.bytedance.android.livesdk.survey.model.SurveyData;
import com.bytedance.android.livesdk.survey.model.SurveyOption;
import com.bytedance.android.livesdk.survey.model.SurveyQuestion;
import com.bytedance.android.livesdk.survey.model.SurveySecondQuestion;
import com.bytedance.android.livesdk.watch.IWatchLiveService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class SurveyViewModel extends ViewModel {
    public SurveyQuestion LJLILLLLZI;
    public SurveyOption LJLJI;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public DataChannel LJLJLLL;
    public long LJLL;
    public long LJLLI;
    public String LJLLILLLL;
    public SurveyData LJLLL;
    public long LJLLLLLL;
    public long LJLZ;
    public long LJZ;
    public long LJZI;
    public InterfaceC75370Ti2 LJZL;
    public long LL;
    public final C73318Sq2 LJLIL = new C73318Sq2();
    public final HashSet<SurveySecondQuestion> LJLJJI = new HashSet<>();
    public String LJLJJL = "";
    public final NextLiveData<SurveyData> LJLLJ = new NextLiveData<>();
    public final NextLiveData<Boolean> LJLLLL = new NextLiveData<>();

    public final EnumC72165STx hv0() {
        if (this.LJLJLJ) {
            return EnumC72165STx.SUBMIT;
        }
        if (this.LJLJI != null && this.LJLJJI.size() > 0) {
            return EnumC72165STx.SELECTED_SECONDARY;
        }
        if (this.LJLJI != null) {
            return EnumC72165STx.SELECTED;
        }
        return EnumC72165STx.CANCEL;
    }

    public final void iv0() {
        String str;
        Integer num;
        SurveyQuestion LIZ;
        List<SurveyOption> list;
        int i;
        List<SurveySecondQuestion> list2;
        SurveyQuestion LIZ2;
        SurveyQuestion LIZ3;
        List<SurveyOption> list3;
        C28246B6s c28246B6s;
        long j;
        String str2;
        if (this.LJLJJLL) {
            return;
        }
        this.LL = SystemClock.elapsedRealtime();
        SurveyStyleV3Setting surveyStyleV3Setting = SurveyStyleV3Setting.INSTANCE;
        if (surveyStyleV3Setting.hasSecondSurvey()) {
            this.LJZ = SystemClock.elapsedRealtime();
        }
        if (!this.LJLJJLL) {
            DataChannel dataChannel = this.LJLJLLL;
            String str3 = null;
            if (dataChannel != null && (c28246B6s = (C28246B6s) dataChannel.kv0(BJO.class)) != null) {
                Room room = c28246B6s.LIZIZ;
                long j2 = 0;
                if (room != null) {
                    j = room.getId();
                } else {
                    j = 0;
                }
                this.LJLL = j;
                Long l = c28246B6s.LIZJ;
                if (l != null) {
                    j2 = l.longValue();
                }
                this.LJLLI = j2;
                BJL bjl = c28246B6s.LJFF;
                if (bjl != null) {
                    str2 = bjl.LJ;
                } else {
                    str2 = null;
                }
                this.LJLLILLLL = str2;
            }
            SurveyData surveyData = this.LJLLL;
            BZI LIZ4 = C28787BRn.LIZ("livesdk_survey_notify");
            LIZ4.LJIILLIIL(this.LJLJLLL);
            LIZ4.LJIJJ(this.LJLLILLLL, "action_type");
            LIZ4.LJIJJ(Long.valueOf(this.LJLLI), "anchor_id");
            LIZ4.LJIJJ(Long.valueOf(this.LJLL), "room_id");
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
            LIZ4.LJIJJ(Integer.valueOf(((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).ZY()), "room_position");
            if (surveyData != null && (LIZ2 = surveyData.LIZ()) != null) {
                str3 = LIZ2.questionId;
            }
            LIZ4.LJIJJ(str3, "question_id");
            LIZ4.LJIJJ("full_screen", "survey_format");
            if (surveyStyleV3Setting.hasSecondSurvey()) {
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
        this.LJLJJLL = true;
        DataChannel dataChannel2 = this.LJLJLLL;
        if (dataChannel2 != null) {
            dataChannel2.rv0(FullScreenSurveyShowing.class, Boolean.TRUE);
        }
    }

    public final void gv0(EnumC72165STx exitMethod) {
        String str;
        Integer num;
        long j;
        SurveyQuestion LIZ;
        List<SurveyOption> list;
        int i;
        List<SurveySecondQuestion> list2;
        SurveyQuestion LIZ2;
        List<SurveyOption> list3;
        o.LJIIIZ(exitMethod, "exitMethod");
        if (!this.LJLJJLL || this.LJLJL) {
            return;
        }
        if (this.LJZ != 0) {
            this.LJLLLLLL = (SystemClock.elapsedRealtime() - this.LJZ) + this.LJLLLLLL;
            this.LJZ = 0L;
        }
        if (this.LJZI != 0) {
            this.LJLZ = (SystemClock.elapsedRealtime() - this.LJZI) + this.LJLZ;
            this.LJZI = 0L;
        }
        if (this.LL > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.LL;
            if (!o.LJ(exitMethod.getMethod(), "nl") && !this.LJLJL && this.LJLJJLL) {
                this.LJLJL = true;
                SurveyData surveyData = this.LJLLL;
                HashMap hashMap = new HashMap();
                String str2 = null;
                BM1.LIZ(null, hashMap);
                BZI LIZ3 = C28787BRn.LIZ("livesdk_exit_survey");
                LIZ3.LJIILLIIL(this.LJLJLLL);
                LIZ3.LJIJJ(this.LJLLILLLL, "action_type");
                LIZ3.LJIJJ(Long.valueOf(this.LJLLI), "anchor_id");
                LIZ3.LJIJJ(Long.valueOf(this.LJLL), "room_id");
                if (surveyData != null) {
                    str = surveyData.surveyId;
                } else {
                    str = null;
                }
                C06510Nj.LIZ((C29374Bfu) TTL.LIZJ(LIZ3, str, "survey_id"), LIZ3, "user_id");
                SurveyQuestion surveyQuestion = this.LJLILLLLZI;
                if (surveyQuestion != null && (list3 = surveyQuestion.optionList) != null) {
                    num = Integer.valueOf(list3.size());
                } else {
                    num = null;
                }
                LIZ3.LJIJJ(num, "no_of_choice");
                LIZ3.LJIJJ(Long.valueOf(elapsedRealtime), "stay_time");
                LIZ3.LJIJJ(exitMethod.getMethod(), "exit_method");
                SurveyOption surveyOption = this.LJLJI;
                if (surveyOption != null) {
                    j = surveyOption.optionId;
                } else {
                    j = 0;
                }
                LIZ3.LJIJJ(Long.valueOf(j), "option_id");
                LIZ3.LJIJJ(Integer.valueOf(((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).ZY()), "room_position");
                if (surveyData != null && (LIZ2 = surveyData.LIZ()) != null) {
                    str2 = LIZ2.questionId;
                }
                LIZ3.LJIJJ(str2, "question_id");
                LIZ3.LJIJJ("full_screen", "survey_format");
                LIZ3.LJJIFFI(hashMap);
                if (SurveyStyleV3Setting.INSTANCE.hasSecondSurvey()) {
                    int i2 = 0;
                    if (surveyData != null && (LIZ = surveyData.LIZ()) != null && (list = LIZ.optionList) != null) {
                        i2 = 0;
                        for (SurveyOption surveyOption2 : list) {
                            if (surveyOption2 != null && (list2 = surveyOption2.secondList) != null) {
                                i = list2.size();
                            } else {
                                i = 0;
                            }
                            i2 += i;
                        }
                    }
                    StringBuffer stringBuffer = new StringBuffer();
                    Iterator<SurveySecondQuestion> it = this.LJLJJI.iterator();
                    while (it.hasNext()) {
                        SurveySecondQuestion next = it.next();
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append(next.optionId);
                        LIZ4.append(',');
                        stringBuffer.append(X1D.LIZIZ(LIZ4));
                    }
                    if (this.LJLJJI.size() > 0) {
                        stringBuffer.deleteCharAt(stringBuffer.length() - 1);
                    }
                    LIZ3.LJIJJ(Integer.valueOf(i2), "no_of_secondary_choice");
                    LIZ3.LJIJJ(Long.valueOf(this.LJLLLLLL), "stay_time");
                    LIZ3.LJIJJ(Long.valueOf(this.LJLZ), "secondary_stay_time");
                    LIZ3.LJIJJ(stringBuffer.toString(), "secondary_option_id");
                    LIZ3.LJIJJ(this.LJLJJL, "secondary_text_content");
                    this.LJLLLLLL = 0L;
                    this.LJLZ = 0L;
                } else {
                    LIZ3.LJIJJ(Long.valueOf(elapsedRealtime), "stay_time");
                }
                LIZ3.LJJIIJZLJL();
            }
        }
        this.LJLJL = true;
        DataChannel dataChannel = this.LJLJLLL;
        if (dataChannel == null) {
            return;
        }
        dataChannel.rv0(FullScreenSurveyShowing.class, Boolean.FALSE);
    }
}

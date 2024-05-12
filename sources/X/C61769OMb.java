package X;

import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import com.ss.android.ugc.aweme.feed.model.survey.Question;
import com.ss.android.ugc.aweme.feed.model.survey.SurveyInfo;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.OMb */
/* loaded from: classes11.dex */
public final class C61769OMb {
    public static final C61769OMb LIZ = new C61769OMb();
    public static long LIZIZ;
    public static long LIZJ;

    public static void LIZ(C188727au c188727au, Aweme aweme) {
        String str;
        SurveyInfo surveyInfo;
        if (aweme == null || (surveyInfo = aweme.getSurveyInfo()) == null || (str = surveyInfo.getBitParams()) == null) {
            str = "";
        }
        if (C78685UuP.LJJJZ(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                o.LJIIIIZZ(keys, "bitParamsObj.keys()");
                while (keys.hasNext()) {
                    String next = keys.next();
                    c188727au.LJI(next, jSONObject.optString(next, ""));
                }
            } catch (JSONException unused) {
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("multi_survey", "bitparams parse error");
            }
        }
    }

    public static void LIZIZ(C188727au c188727au, Aweme aweme) {
        String str;
        if (C79081V1x.LJIILLIIL(aweme) != OML.LIVE_TYPE) {
            return;
        }
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        String LIZJ2 = LIZJ(aweme, str);
        if (LIZJ2 != null) {
            String str2 = (String) ((ConcurrentHashMap) C2KU.LIZ.getValue()).get(LIZJ2);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("getEnterType is invoked and aid is ");
            LIZ2.append(LIZJ2);
            LIZ2.append(" enterType is ");
            LIZ2.append(str2);
            LIZ2.append('.');
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("LiveRoomEventHelper", X1D.LIZIZ(LIZ2));
            if (str2 == null) {
                c188727au.LJI("live_entered_type", "unentered");
            } else {
                c188727au.LJI("live_entered_type", str2);
            }
        }
    }

    public static String LIZJ(Aweme aweme, String str) {
        if (C61776OMi.LIZIZ(aweme)) {
            return ONM.LIZLLL(str);
        }
        return str;
    }

    public static void LJI(String str, Aweme aweme, String type) {
        String str2;
        String str3;
        Integer num;
        String str4;
        Question[] questions;
        Question question;
        Option[] options;
        int i;
        o.LJIIIZ(type, "type");
        LIZJ = System.currentTimeMillis();
        C188727au c188727au = new C188727au();
        String str5 = null;
        if (aweme != null) {
            str2 = aweme.getAid();
        } else {
            str2 = null;
        }
        c188727au.LJIIIZ("group_id", LIZJ(aweme, str2));
        c188727au.LJIIIZ("survey_id", str);
        if (aweme != null) {
            str3 = aweme.getAuthorUid();
        } else {
            str3 = null;
        }
        c188727au.LJIIIZ("author_id", str3);
        c188727au.LJIIIZ("type", type);
        if (aweme != null) {
            if (OMU.LIZIZ(aweme) == OBQ.DEFAULT.getType()) {
                i = 1;
            } else {
                i = 0;
            }
            num = Integer.valueOf(i ^ 1);
        } else {
            num = null;
        }
        c188727au.LJFF(num, "privacy_policy_show");
        c188727au.LIZLLL(C79081V1x.LJIILLIIL(aweme).getType(), "survey_biz_type");
        if (aweme != null) {
            str4 = aweme.getRequestId();
        } else {
            str4 = null;
        }
        c188727au.LJIIIZ("request_id", str4);
        if (aweme != null) {
            str5 = OMU.LIZ(aweme);
        }
        c188727au.LJIIIZ("content_scope", str5);
        LIZ(c188727au, aweme);
        LIZIZ(c188727au, aweme);
        FeedSurvey LIZJ2 = OMU.LIZJ(aweme);
        if (LIZJ2 != null && (questions = LIZJ2.getQuestions()) != null && (question = questions[0]) != null && (options = question.getOptions()) != null && options.length != 0) {
            c188727au.LJI("adjust_fyp_options", ORY.LJJJJLL(options, null, null, null, C61771OMd.LJLIL, 31));
        }
        FMX.LJIIL("survey_notify", c188727au.LIZ);
    }

    public static void LIZLLL(C61769OMb c61769OMb, Aweme aweme, OML surveyType, String str, String str2, String str3, String str4, int i, Option[] optionArr, int i2) {
        String str5;
        String str6;
        String str7;
        String str8 = str4;
        Option[] optionArr2 = optionArr;
        if ((i2 & 32) != 0) {
            c61769OMb.getClass();
            Locale locale = Locale.ENGLISH;
            str8 = C141415gn.LIZIZ(locale, "ENGLISH", "SINGLE_CHOICE", locale, "this as java.lang.String).toLowerCase(locale)");
        }
        if ((i2 & 64) != 0) {
            i = -1;
        }
        String str9 = null;
        if ((i2 & 128) != 0) {
            optionArr2 = null;
        }
        c61769OMb.getClass();
        o.LJIIIZ(surveyType, "surveyType");
        C188727au c188727au = new C188727au();
        if (aweme != null) {
            str5 = aweme.getAid();
        } else {
            str5 = null;
        }
        c188727au.LJIIIZ("group_id", LIZJ(aweme, str5));
        c188727au.LJIIIZ("survey_id", str2);
        if (aweme != null) {
            str6 = aweme.getAuthorUid();
        } else {
            str6 = null;
        }
        c188727au.LJIIIZ("author_id", str6);
        c188727au.LJIIIZ("type", str8);
        c188727au.LJ(System.currentTimeMillis() - LIZJ, "stay_time");
        c188727au.LJIIIZ("exit_method", str);
        Locale ENGLISH = Locale.ENGLISH;
        o.LJIIIIZZ(ENGLISH, "ENGLISH");
        String lowerCase = "SUBMIT".toLowerCase(ENGLISH);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if (!o.LJ(str, lowerCase)) {
            str3 = "";
        }
        c188727au.LJIIIZ("result", str3);
        c188727au.LIZLLL(1, "is_fixed_survey");
        c188727au.LIZLLL(surveyType.getType(), "survey_biz_type");
        if (aweme != null) {
            str7 = aweme.getRequestId();
        } else {
            str7 = null;
        }
        c188727au.LJIIIZ("request_id", str7);
        if (aweme != null) {
            str9 = OMU.LIZ(aweme);
        }
        c188727au.LJIIIZ("content_scope", str9);
        LIZ(c188727au, aweme);
        LIZIZ(c188727au, aweme);
        o.LJIIIIZZ(ENGLISH, "ENGLISH");
        String lowerCase2 = "SUBMIT".toLowerCase(ENGLISH);
        o.LJIIIIZZ(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
        if (o.LJ(str, lowerCase2) && i >= 0) {
            c188727au.LJI("result", String.valueOf(i));
        }
        if (optionArr2 != null && optionArr2.length != 0) {
            c188727au.LJI("adjust_fyp_result", ORY.LJJJJLL(optionArr2, null, null, null, C61770OMc.LJLIL, 31));
        }
        FMX.LJIIL("exit_survey", c188727au.LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
    
        if (r7 != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012c, code lost:
    
        if (r4 != null) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(com.ss.android.ugc.aweme.feed.model.Aweme r18, java.lang.String r19, java.lang.Integer r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, X.OML r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61769OMb.LJ(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.OML, java.lang.String):void");
    }
}

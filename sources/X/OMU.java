package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurveyConfig;
import com.ss.android.ugc.aweme.feed.model.survey.SurveyInfo;
import com.ss.android.ugc.aweme.service.ISurveyDebuggerService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OMU {
    public static final ConcurrentHashMap<String, OMW> LIZ = new ConcurrentHashMap<>();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(OMZ.LJLIL);
    public static final ONJ LIZJ = new ONJ("frequency");

    public static String LIZ(Aweme aweme) {
        FeedSurveyConfig feedSurveyConfig;
        if (aweme == null) {
            return null;
        }
        ConcurrentHashMap<String, OMW> concurrentHashMap = LIZ;
        String mainSurveyKey = aweme.getMainSurveyKey();
        if (mainSurveyKey == null) {
            mainSurveyKey = "";
        }
        OMW omw = concurrentHashMap.get(mainSurveyKey);
        if (omw == null || (feedSurveyConfig = omw.LJII) == null) {
            return null;
        }
        return feedSurveyConfig.getContentScope();
    }

    public static final int LIZIZ(Aweme aweme) {
        OMW LIZLLL = LIZLLL(aweme);
        if (LIZLLL != null) {
            return LIZLLL.LIZLLL;
        }
        return 0;
    }

    public static FeedSurvey LIZJ(Aweme aweme) {
        String str;
        Iterator it = ((ArrayList) OBO.LIZ()).iterator();
        while (true) {
            String str2 = null;
            if (!it.hasNext()) {
                break;
            }
            OMV omv = (OMV) it.next();
            ONJ onj = OBO.LIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("[TurnGroupInfo], video count:");
            LIZ2.append(OBO.LIZJ);
            LIZ2.append(", target count:");
            LIZ2.append(omv.LIZJ);
            onj.LJIIIIZZ(X1D.LIZIZ(LIZ2));
            FeedSurveyConfig feedSurveyConfig = omv.LIZLLL;
            if (feedSurveyConfig != null) {
                str = feedSurveyConfig.getContentScope();
            } else {
                str = null;
            }
            if (!o.LJ(str, "prompt") && OBO.LIZJ == omv.LIZJ) {
                FeedSurveyConfig feedSurveyConfig2 = omv.LIZLLL;
                if (feedSurveyConfig2 != null && C79081V1x.LJIILLIIL(aweme).getType() == feedSurveyConfig2.getMultiSurveyType()) {
                    if (aweme != null) {
                        FeedSurvey fixedSurvey = feedSurveyConfig2.getFixedSurvey();
                        if (fixedSurvey != null) {
                            str2 = fixedSurvey.getSurveyKey();
                        }
                        aweme.setSurveyInfo(new SurveyInfo(str2, null, null, null, 14, null));
                    }
                    return feedSurveyConfig2.getFixedSurvey();
                }
            }
        }
        if (aweme != null && aweme.isWithSurvey()) {
            OMW LIZLLL = LIZLLL(aweme);
            if (LIZLLL == null) {
                return null;
            }
            return LIZLLL.LIZJ;
        }
        ((ISurveyDebuggerService) LIZIZ.getValue()).isOpen();
        return null;
    }

    public static OMW LIZLLL(Aweme aweme) {
        boolean z;
        SurveyInfo surveyInfo = null;
        if (aweme == null) {
            return null;
        }
        ((ISurveyDebuggerService) LIZIZ.getValue()).isOpen();
        List<SurveyInfo> surveyInfos = aweme.getSurveyInfos();
        if (surveyInfos == null || surveyInfos.isEmpty()) {
            return null;
        }
        List<SurveyInfo> surveyInfos2 = aweme.getSurveyInfos();
        String str = "";
        if (surveyInfos2 != null) {
            Iterator<SurveyInfo> it = surveyInfos2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                SurveyInfo next = it.next();
                String surveyKey = next.getSurveyKey();
                if (surveyKey == null) {
                    surveyKey = "";
                }
                ((ISurveyDebuggerService) OMS.LIZLLL.getValue()).isOpen();
                if (OMS.LIZ(surveyKey) > System.currentTimeMillis()) {
                    z = true;
                } else {
                    z = false;
                }
                ONJ onj = OMS.LJ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("[inFrequencyControl]: ");
                LIZ2.append(z);
                LIZ2.append(", long:");
                LIZ2.append(z);
                onj.LJIIIIZZ(X1D.LIZIZ(LIZ2));
                if (!z) {
                    surveyInfo = next;
                    break;
                }
            }
            surveyInfo = surveyInfo;
        }
        aweme.setSurveyInfo(surveyInfo);
        ConcurrentHashMap<String, OMW> concurrentHashMap = LIZ;
        String mainSurveyKey = aweme.getMainSurveyKey();
        if (mainSurveyKey != null) {
            str = mainSurveyKey;
        }
        return concurrentHashMap.get(str);
    }
}

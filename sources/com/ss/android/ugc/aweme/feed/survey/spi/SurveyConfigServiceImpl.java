package com.ss.android.ugc.aweme.feed.survey.spi;

import X.C52373Kgz;
import X.OBO;
import X.OMU;
import X.OMV;
import X.OMW;
import X.ONJ;
import X.X1D;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.s;
import com.ss.android.ugc.aweme.feed.ISurveyConfigService;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurveyConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class SurveyConfigServiceImpl implements ISurveyConfigService {
    @Override // com.ss.android.ugc.aweme.feed.ISurveyConfigService
    public final void LIZ() {
        int i;
        LinkedHashMap linkedHashMap;
        FeedSurveyConfig[] feedSurveyConfigArr = C52373Kgz.LIZ;
        if (feedSurveyConfigArr == null) {
            return;
        }
        for (FeedSurveyConfig feedSurveyConfig : feedSurveyConfigArr) {
            o.LJIIIZ(feedSurveyConfig, "<this>");
            FeedSurvey fixedSurvey = feedSurveyConfig.getFixedSurvey();
            if (fixedSurvey != null && OMU.LIZ.get(fixedSurvey.getSurveyKey()) == null) {
                String surveyKey = fixedSurvey.getSurveyKey();
                int multiSurveyType = feedSurveyConfig.getMultiSurveyType();
                FeedSurvey fixedSurvey2 = feedSurveyConfig.getFixedSurvey();
                int feedSurveyStyle = feedSurveyConfig.getFeedSurveyStyle();
                int bgdVideo = feedSurveyConfig.getBgdVideo();
                long showIntervalTime = feedSurveyConfig.getShowIntervalTime();
                String relationsKey = fixedSurvey.getRelationsKey();
                if (relationsKey != null) {
                    try {
                        new com.google.gson.o();
                        m LJIIZILJ = com.google.gson.o.LIZ(relationsKey).LJIIZILJ();
                        linkedHashMap = new LinkedHashMap();
                        for (Map.Entry<String, j> entry : LJIIZILJ.entrySet()) {
                            o.LJIIIIZZ(entry, "jsonObject.entrySet()");
                            String key = entry.getKey();
                            j value = entry.getValue();
                            o.LJIIIIZZ(key, "key");
                            linkedHashMap.put(key, Long.valueOf(value.LJIJJLI()));
                        }
                        OMU.LIZJ.LJIIJ(new AqS151S0100000_1(linkedHashMap, (Map<String, Object>) 989));
                    } catch (s e) {
                        OMU.LIZJ.LJI(new AqS151S0100000_1(e, 990));
                    } catch (Exception e2) {
                        OMU.LIZJ.LJI(new AqS151S0100000_1(e2, 991));
                    }
                    OMW omw = new OMW(surveyKey, multiSurveyType, fixedSurvey2, feedSurveyStyle, bgdVideo, showIntervalTime, linkedHashMap, feedSurveyConfig);
                    OMU.LIZ.put(omw.LIZ, omw);
                    ONJ onj = OMU.LIZJ;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("[InitSurvey] type=");
                    LIZ.append(omw.LIZIZ);
                    LIZ.append(", style=");
                    LIZ.append(omw.LIZLLL);
                    LIZ.append(", bgd=");
                    LIZ.append(omw.LJ);
                    LIZ.append(", key=");
                    LIZ.append(omw.LIZ);
                    onj.LJIIIIZZ(X1D.LIZIZ(LIZ));
                }
                linkedHashMap = null;
                OMW omw2 = new OMW(surveyKey, multiSurveyType, fixedSurvey2, feedSurveyStyle, bgdVideo, showIntervalTime, linkedHashMap, feedSurveyConfig);
                OMU.LIZ.put(omw2.LIZ, omw2);
                ONJ onj2 = OMU.LIZJ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("[InitSurvey] type=");
                LIZ2.append(omw2.LIZIZ);
                LIZ2.append(", style=");
                LIZ2.append(omw2.LIZLLL);
                LIZ2.append(", bgd=");
                LIZ2.append(omw2.LJ);
                LIZ2.append(", key=");
                LIZ2.append(omw2.LIZ);
                onj2.LJIIIIZZ(X1D.LIZIZ(LIZ2));
            }
            int surveyAppearStart = feedSurveyConfig.getSurveyAppearStart();
            int surveyAppearEnd = feedSurveyConfig.getSurveyAppearEnd();
            if (surveyAppearEnd > surveyAppearStart) {
                i = new Random().nextInt(surveyAppearEnd - surveyAppearStart) + surveyAppearStart;
            } else {
                i = -1;
            }
            ONJ onj3 = OBO.LIZ;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("[TurnGroupInfo], start:");
            LIZ3.append(feedSurveyConfig.getSurveyAppearStart());
            LIZ3.append(", end:");
            LIZ3.append(feedSurveyConfig.getSurveyAppearEnd());
            LIZ3.append(", position:");
            LIZ3.append(i);
            onj3.LJIIIIZZ(X1D.LIZIZ(LIZ3));
            OBO.LJ.add(new OMV(feedSurveyConfig.getTurnsGroupId(), feedSurveyConfig.getTurnsGroupCount(), i, feedSurveyConfig, feedSurveyConfig.getSurveyAppearStart(), feedSurveyConfig.getSurveyAppearEnd()));
        }
    }
}

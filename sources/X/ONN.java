package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.SurveyInfo;
import com.ss.android.ugc.aweme.feed.model.survey.TriggerData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ONN {
    public static final ONJ LIZ = new ONJ("need_show");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    public static String LIZ(Aweme aweme) {
        ?? r3;
        Object next;
        Integer num;
        Integer num2;
        TriggerData triggerData;
        TriggerData triggerData2;
        C86919Y9j LIZ2;
        long j;
        FeedSurvey feedSurvey;
        if (aweme == null) {
            return null;
        }
        if (OMS.LJFF.contains(aweme.getAid())) {
            SurveyInfo surveyInfo = aweme.getSurveyInfo();
            if (surveyInfo == null) {
                return null;
            }
            return surveyInfo.getSurveyKey();
        }
        List<SurveyInfo> surveyInfos = aweme.getSurveyInfos();
        if (surveyInfos != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<SurveyInfo> it = surveyInfos.iterator();
            while (it.hasNext()) {
                String surveyKey = it.next().getSurveyKey();
                if (surveyKey != null) {
                    arrayList.add(surveyKey);
                }
            }
            r3 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object key = it2.next();
                o.LJIIIZ(key, "key");
                OMW omw = OMU.LIZ.get(key);
                if (omw != null && (feedSurvey = omw.LIZJ) != null) {
                    r3.add(feedSurvey);
                }
            }
        } else {
            r3 = C61878OQg.INSTANCE;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : r3) {
            List<TriggerData> triggerActions = ((FeedSurvey) obj).getTriggerActions();
            if (triggerActions != null) {
                ArrayList arrayList3 = new ArrayList(C32I.LJJL(triggerActions, 10));
                Iterator<TriggerData> it3 = triggerActions.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(Integer.valueOf(it3.next().action));
                }
                if (!arrayList3.isEmpty()) {
                    C9XQ c9xq = C9XP.LIZ;
                    String aid = aweme.getAid();
                    c9xq.getClass();
                    if (aid != null) {
                        C245599kR c245599kR = C86918Y9i.LIZJ;
                        String curUserId = C86918Y9i.LJ;
                        o.LJIIIIZZ(curUserId, "curUserId");
                        C9XS LIZIZ = c245599kR.LIZIZ(curUserId, "homepage_hot");
                        if (LIZIZ == null || (LIZ2 = LIZIZ.LIZIZ.LIZ(aid)) == null) {
                            LIZ2 = new C86919Y9j(aid);
                            ((ArrayList) LIZ2.LLIIIILZ).add(ONP.SKIP);
                        } else {
                            long currentTimeMillis = System.currentTimeMillis();
                            Long l = LIZ2.LLI;
                            if (l != null) {
                                j = l.longValue();
                            } else {
                                j = 0;
                            }
                            if (currentTimeMillis - j < 3000) {
                                List<ONP> list = LIZ2.LLIIIILZ;
                                ONP onp = ONP.SKIP;
                                if (!((ArrayList) list).contains(onp)) {
                                    ((ArrayList) LIZ2.LLIIIILZ).add(onp);
                                }
                            }
                        }
                        List<ONP> list2 = LIZ2.LLIIIILZ;
                        if (list2 != null) {
                            ArrayList arrayList4 = new ArrayList(C32I.LJJL(list2, 10));
                            Iterator<ONP> it4 = list2.iterator();
                            while (it4.hasNext()) {
                                arrayList4.add(Integer.valueOf(it4.next().getTYPE()));
                            }
                            LIZ.LJIIJ(new AqS151S0100000_1(arrayList4, (List<String>) 978));
                            if (!arrayList3.isEmpty()) {
                                Iterator it5 = arrayList3.iterator();
                                while (it5.hasNext()) {
                                    if (arrayList4.contains(Integer.valueOf(((Number) it5.next()).intValue()))) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
            arrayList2.add(obj);
        }
        Iterator it6 = arrayList2.iterator();
        if (!it6.hasNext()) {
            next = null;
        } else {
            next = it6.next();
            if (it6.hasNext()) {
                List<TriggerData> triggerActions2 = ((FeedSurvey) next).getTriggerActions();
                if (triggerActions2 != null && (triggerData2 = (TriggerData) ListProtector.get(triggerActions2, 0)) != null) {
                    num = Integer.valueOf(triggerData2.action);
                } else {
                    num = null;
                }
                int LIZIZ2 = LIZIZ(num);
                do {
                    Object next2 = it6.next();
                    List<TriggerData> triggerActions3 = ((FeedSurvey) next2).getTriggerActions();
                    if (triggerActions3 != null && (triggerData = (TriggerData) ListProtector.get(triggerActions3, 0)) != null) {
                        num2 = Integer.valueOf(triggerData.action);
                    } else {
                        num2 = null;
                    }
                    int LIZIZ3 = LIZIZ(num2);
                    if (LIZIZ2 > LIZIZ3) {
                        next = next2;
                        LIZIZ2 = LIZIZ3;
                    }
                } while (it6.hasNext());
            }
        }
        FeedSurvey feedSurvey2 = (FeedSurvey) next;
        if (feedSurvey2 == null) {
            return null;
        }
        return feedSurvey2.getSurveyKey();
    }

    public static int LIZIZ(Integer num) {
        int intValue;
        if (num == null || (intValue = num.intValue()) == ONO.DEFAULT.getId()) {
            return 0;
        }
        if (intValue == ONO.SKIP.getId()) {
            return 1;
        }
        return 2;
    }
}

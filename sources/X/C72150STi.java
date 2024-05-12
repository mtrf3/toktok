package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.aigc.AIGCApi;
import com.ss.android.ugc.aweme.aigc.AIGCTaskStatus;
import com.ss.android.ugc.aweme.aigc.ResponseAIGCTaskStatus;
import com.ss.android.ugc.aweme.aigc.ResponseGetAvatars;
import com.ss.android.ugc.aweme.aigc.ResponseQuickGenerate;
import com.ss.android.ugc.aweme.aigc.ResponseSlowGenerate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;

/* renamed from: X.STi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72150STi {
    public static String LIZLLL;
    public static final java.util.Map<EnumC244439iZ, List<STO>> LIZ = new LinkedHashMap();
    public static final java.util.Map<EnumC244439iZ, String> LIZIZ = new LinkedHashMap();
    public static final java.util.Map<String, C72151STj> LIZJ = new LinkedHashMap();
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(C72162STu.LJLIL);

    public static boolean LIZ() {
        if (!C44172HVg.LJIJ.isLogin() || C44172HVg.LJIJ.getCurrentUserID().length() == 0) {
            return false;
        }
        String str = LIZLLL;
        if (str == null || !o.LJ(str, C44172HVg.LJIJ.getCurrentUserID())) {
            ((LinkedHashMap) LIZ).clear();
            ((LinkedHashMap) LIZIZ).clear();
            ((LinkedHashMap) LIZJ).clear();
            LIZLLL = C44172HVg.LJIJ.getCurrentUserID();
        }
        return true;
    }

    public static AIGCApi LIZJ() {
        return (AIGCApi) LJ.getValue();
    }

    public static ST8 LJ(ResponseAIGCTaskStatus responseAIGCTaskStatus, ResponseGetAvatars responseGetAvatars) {
        Integer num;
        String str;
        String str2;
        AIGCTaskStatus aIGCTaskStatus;
        AIGCTaskStatus aIGCTaskStatus2;
        AIGCTaskStatus aIGCTaskStatus3;
        String str3;
        Integer num2;
        AIGCTaskStatus aIGCTaskStatus4;
        AIGCTaskStatus aIGCTaskStatus5;
        Float f;
        AIGCTaskStatus aIGCTaskStatus6;
        String str4;
        List<String> list;
        AIGCTaskStatus aIGCTaskStatus7;
        AIGCTaskStatus aIGCTaskStatus8;
        String str5;
        String str6;
        AIGCTaskStatus aIGCTaskStatus9;
        AIGCTaskStatus aIGCTaskStatus10;
        AIGCTaskStatus aIGCTaskStatus11;
        int i;
        String str7;
        String str8;
        AIGCTaskStatus aIGCTaskStatus12;
        AIGCTaskStatus aIGCTaskStatus13;
        AIGCTaskStatus aIGCTaskStatus14;
        List<AIGCTaskStatus> list2;
        AIGCTaskStatus aIGCTaskStatus15;
        Integer num3 = null;
        r10 = null;
        String str9 = null;
        r10 = null;
        String str10 = null;
        r10 = null;
        String str11 = null;
        r10 = null;
        String str12 = null;
        num3 = null;
        if (responseAIGCTaskStatus != null && (list2 = responseAIGCTaskStatus.tasks) != null && (aIGCTaskStatus15 = (AIGCTaskStatus) ORZ.LJLLLL(list2)) != null) {
            num = aIGCTaskStatus15.status;
        } else {
            num = null;
        }
        int status = EnumC72155STn.SUBMIT.getStatus();
        if (num == null || num.intValue() != status) {
            int status2 = EnumC72155STn.PROCESS.getStatus();
            if (num == null || num.intValue() != status2) {
                int status3 = EnumC72155STn.SUCCESS.getStatus();
                if (num == null || num.intValue() != status3) {
                    int status4 = EnumC72155STn.FAILED.getStatus();
                    if (num == null || num.intValue() != status4) {
                        if (responseAIGCTaskStatus != null && Integer.valueOf(responseAIGCTaskStatus.status_code) != null && (i = responseAIGCTaskStatus.status_code) != 0) {
                            String str13 = responseAIGCTaskStatus.status_msg;
                            List<AIGCTaskStatus> list3 = responseAIGCTaskStatus.tasks;
                            if (list3 != null && (aIGCTaskStatus14 = (AIGCTaskStatus) ORZ.LJLLLL(list3)) != null) {
                                str7 = aIGCTaskStatus14.taskId;
                            } else {
                                str7 = null;
                            }
                            STF stf = STF.FAIL;
                            List<AIGCTaskStatus> list4 = responseAIGCTaskStatus.tasks;
                            if (list4 != null && (aIGCTaskStatus13 = (AIGCTaskStatus) ORZ.LJLLLL(list4)) != null) {
                                str8 = aIGCTaskStatus13.statusMessage;
                            } else {
                                str8 = null;
                            }
                            List<AIGCTaskStatus> list5 = responseAIGCTaskStatus.tasks;
                            if (list5 != null && (aIGCTaskStatus12 = (AIGCTaskStatus) ORZ.LJLLLL(list5)) != null) {
                                str9 = aIGCTaskStatus12.jobType;
                            }
                            return new ST8(stf, i, str13, str7, str8, null, null, str9, null, 352);
                        }
                        return new ST8(STF.NONE, -1, null, null, null, null, null, null, null, 508);
                    }
                    int i2 = responseAIGCTaskStatus.status_code;
                    String str14 = responseAIGCTaskStatus.status_msg;
                    List<AIGCTaskStatus> list6 = responseAIGCTaskStatus.tasks;
                    if (list6 != null && (aIGCTaskStatus11 = (AIGCTaskStatus) ORZ.LJLLLL(list6)) != null) {
                        str5 = aIGCTaskStatus11.taskId;
                    } else {
                        str5 = null;
                    }
                    STF stf2 = STF.FAIL;
                    List<AIGCTaskStatus> list7 = responseAIGCTaskStatus.tasks;
                    if (list7 != null && (aIGCTaskStatus10 = (AIGCTaskStatus) ORZ.LJLLLL(list7)) != null) {
                        str6 = aIGCTaskStatus10.statusMessage;
                    } else {
                        str6 = null;
                    }
                    List<AIGCTaskStatus> list8 = responseAIGCTaskStatus.tasks;
                    if (list8 != null && (aIGCTaskStatus9 = (AIGCTaskStatus) ORZ.LJLLLL(list8)) != null) {
                        str10 = aIGCTaskStatus9.jobType;
                    }
                    return new ST8(stf2, i2, str14, str5, str6, null, null, str10, null, 352);
                }
                int i3 = responseAIGCTaskStatus.status_code;
                String str15 = responseAIGCTaskStatus.status_msg;
                List<AIGCTaskStatus> list9 = responseAIGCTaskStatus.tasks;
                if (list9 != null && (aIGCTaskStatus8 = (AIGCTaskStatus) ORZ.LJLLLL(list9)) != null) {
                    str4 = aIGCTaskStatus8.taskId;
                } else {
                    str4 = null;
                }
                STF stf3 = STF.SUCCESS;
                if (responseGetAvatars != null) {
                    list = responseGetAvatars.avatarUrls;
                } else {
                    list = null;
                }
                ST6 st6 = new ST6(null, list, null);
                List<AIGCTaskStatus> list10 = responseAIGCTaskStatus.tasks;
                if (list10 != null && (aIGCTaskStatus7 = (AIGCTaskStatus) ORZ.LJLLLL(list10)) != null) {
                    str11 = aIGCTaskStatus7.jobType;
                }
                return new ST8(stf3, i3, str15, str4, null, null, st6, str11, null, 304);
            }
            int i4 = responseAIGCTaskStatus.status_code;
            String str16 = responseAIGCTaskStatus.status_msg;
            List<AIGCTaskStatus> list11 = responseAIGCTaskStatus.tasks;
            if (list11 != null && (aIGCTaskStatus6 = (AIGCTaskStatus) ORZ.LJLLLL(list11)) != null) {
                str3 = aIGCTaskStatus6.taskId;
            } else {
                str3 = null;
            }
            STF stf4 = STF.IN_PROGRESS;
            List<AIGCTaskStatus> list12 = responseAIGCTaskStatus.tasks;
            if (list12 != null && (aIGCTaskStatus5 = (AIGCTaskStatus) ORZ.LJLLLL(list12)) != null && (f = aIGCTaskStatus5.percentage) != null) {
                num2 = Integer.valueOf((int) (f.floatValue() * 100));
            } else {
                num2 = null;
            }
            List<AIGCTaskStatus> list13 = responseAIGCTaskStatus.tasks;
            if (list13 != null && (aIGCTaskStatus4 = (AIGCTaskStatus) ORZ.LJLLLL(list13)) != null) {
                str12 = aIGCTaskStatus4.jobType;
            }
            return new ST8(stf4, i4, str16, str3, null, num2, null, str12, null, 336);
        }
        int i5 = responseAIGCTaskStatus.status_code;
        String str17 = responseAIGCTaskStatus.status_msg;
        List<AIGCTaskStatus> list14 = responseAIGCTaskStatus.tasks;
        if (list14 != null && (aIGCTaskStatus3 = (AIGCTaskStatus) ORZ.LJLLLL(list14)) != null) {
            str = aIGCTaskStatus3.taskId;
        } else {
            str = null;
        }
        STF stf5 = STF.WAITING;
        List<AIGCTaskStatus> list15 = responseAIGCTaskStatus.tasks;
        if (list15 != null && (aIGCTaskStatus2 = (AIGCTaskStatus) ORZ.LJLLLL(list15)) != null) {
            str2 = aIGCTaskStatus2.jobType;
        } else {
            str2 = null;
        }
        List<AIGCTaskStatus> list16 = responseAIGCTaskStatus.tasks;
        if (list16 != null && (aIGCTaskStatus = (AIGCTaskStatus) ORZ.LJLLLL(list16)) != null) {
            num3 = aIGCTaskStatus.waitingTime;
        }
        return new ST8(stf5, i5, str17, str, null, null, null, str2, num3, 112);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C72151STj LIZLLL(EnumC244439iZ business, String str, STG stg) {
        String str2;
        o.LJIIIZ(business, "business");
        if (!LIZ()) {
            return null;
        }
        EnumC72154STm enumC72154STm = EnumC72154STm.AIGC_NET_GEN_MORE;
        ResponseAIGCTaskStatus responseAIGCTaskStatus = null;
        Object[] objArr = 0;
        C72164STw.LIZ(enumC72154STm, EnumC72156STo.START, null, null, null, null, 60);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        LIZJ().getClass();
        ResponseQuickGenerate responseQuickGenerate = (ResponseQuickGenerate) C72160STs.LIZ().generateMore(str).LJJL(T16.LIZ()).LIZLLL();
        if (responseQuickGenerate.status_code != 0 || (str2 = responseQuickGenerate.taskId) == null || str2.length() == 0) {
            C72164STw.LIZ(enumC72154STm, EnumC72156STo.FAIL, Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime), null, String.valueOf(Integer.valueOf(responseQuickGenerate.status_code)), responseQuickGenerate.status_msg, 8);
            return null;
        }
        C72164STw.LIZ(enumC72154STm, EnumC72156STo.SUCCESS, Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime), null, null, null, 56);
        String str3 = responseQuickGenerate.taskId;
        if (str3 != null) {
            if (stg != null) {
                java.util.Map<EnumC244439iZ, List<STO>> map = LIZ;
                LinkedHashMap linkedHashMap = (LinkedHashMap) map;
                if (linkedHashMap.get(business) == null) {
                    map.put(business, new ArrayList());
                }
                List list = (List) linkedHashMap.get(business);
                if (list != null) {
                    list.add(stg);
                }
            }
            LIZIZ.put(business, str3);
            C72151STj c72151STj = new C72151STj(str3, LIZJ(), responseAIGCTaskStatus, 4, objArr == true ? 1 : 0);
            LIZJ.put(str3, c72151STj);
            List list2 = (List) ((LinkedHashMap) LIZ).get(business);
            if (list2 != null) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    c72151STj.registerListener((STO) it.next());
                }
            }
            c72151STj.start();
            return c72151STj;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C72151STj LIZIZ(EnumC244439iZ business, JSONArray jSONArray, JSONArray jSONArray2, STG stg) {
        String str;
        o.LJIIIZ(business, "business");
        if (!LIZ()) {
            return null;
        }
        EnumC72154STm enumC72154STm = EnumC72154STm.AIGC_NET_SLOW_GEN;
        ResponseAIGCTaskStatus responseAIGCTaskStatus = null;
        Object[] objArr = 0;
        C72164STw.LIZ(enumC72154STm, EnumC72156STo.START, null, null, null, null, 60);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        LIZJ().getClass();
        ResponseSlowGenerate responseSlowGenerate = C72160STs.LIZ().slowGenerate(jSONArray, jSONArray2).execute().LIZIZ;
        o.LJIIIIZZ(responseSlowGenerate, "agent.slowGenerate(param…cStyles).execute().body()");
        ResponseSlowGenerate responseSlowGenerate2 = responseSlowGenerate;
        if (responseSlowGenerate2.status_code != 0 || (str = responseSlowGenerate2.taskId) == null || str.length() == 0) {
            C72164STw.LIZ(enumC72154STm, EnumC72156STo.FAIL, Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime), null, String.valueOf(responseSlowGenerate2.status_code), responseSlowGenerate2.status_msg, 8);
            return null;
        }
        C72164STw.LIZ(enumC72154STm, EnumC72156STo.SUCCESS, Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime), null, null, null, 56);
        String str2 = responseSlowGenerate2.taskId;
        if (str2 != null) {
            if (stg != null) {
                java.util.Map<EnumC244439iZ, List<STO>> map = LIZ;
                LinkedHashMap linkedHashMap = (LinkedHashMap) map;
                if (linkedHashMap.get(business) == null) {
                    map.put(business, new ArrayList());
                }
                List list = (List) linkedHashMap.get(business);
                if (list != null) {
                    list.add(stg);
                }
            }
            LIZIZ.put(business, str2);
            C72151STj c72151STj = new C72151STj(str2, LIZJ(), responseAIGCTaskStatus, 4, objArr == true ? 1 : 0);
            LIZJ.put(str2, c72151STj);
            List list2 = (List) ((LinkedHashMap) LIZ).get(business);
            if (list2 != null) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    c72151STj.registerListener((STO) it.next());
                }
            }
            c72151STj.start();
            return c72151STj;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}

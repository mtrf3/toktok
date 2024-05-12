package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.touchpoint.core.model.ActivityTask;
import com.bytedance.touchpoint.core.model.InAppPush;
import com.bytedance.touchpoint.core.task.TasksViewModel;
import com.bytedance.touchpoint.core.viewmodel.BaseTouchPointDataVM;
import com.google.gson.Gson;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.cointask.core.viewmodel.SearchCoinTaskManager;
import com.ss.android.ugc.aweme.search.utils.MapDeserializerDoubleAsIntFix;
import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;
import defpackage.i0;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Jve, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50734Jve extends AbstractC244999jT implements InterfaceC250059rd {
    public static final C5H3<C50734Jve> LJLLI = C221108m2.LIZ(EnumC221088m0.PUBLICATION, C50736Jvg.LJLIL);
    public SearchCoinTaskManager LJLJJL;
    public C50436Jqq LJLJJLL;
    public boolean LJLJL;
    public String LJLJLLL;
    public boolean LJLL;
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C50738Jvi.LJLIL);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C50739Jvj.LJLIL);
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(C50740Jvk.LJLIL);
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(C50737Jvh.LJLIL);
    public final java.util.Map<String, Long> LJLJLJ = new LinkedHashMap();

    @Override // X.InterfaceC250059rd
    public final void LIZ() {
    }

    @Override // X.InterfaceC250059rd
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC250059rd
    public final void LJFF() {
    }

    public final ActivityTask LJJIIZ() {
        List LIZIZ = C249919rP.LIZIZ(13, C2MW.LIZ().LJ(11));
        if (!((ArrayList) LIZIZ).isEmpty()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getSearchCoinTaskInitData, searchTask = ");
            LIZ.append(ListProtector.get(LIZIZ, 0));
            LJJIJLIJ(X1D.LIZIZ(LIZ));
            return (ActivityTask) ListProtector.get(LIZIZ, 0);
        }
        LJJIJLIJ("getSearchCoinTaskInitData = null");
        return null;
    }

    @Override // X.InterfaceC250059rd
    public final void LJIIZILJ() {
        LJJIJLIJ("onDateChange");
        String curUserId = LJJIFFI().getCurUserId();
        o.LJIIIIZZ(curUserId, "accountService.curUserId");
        LJJIJL(curUserId);
    }

    @Override // X.AbstractC244999jT
    public final BaseTouchPointDataVM LJJ() {
        C246049lA c246049lA = C246049lA.LJLILLLLZI;
        return (BaseTouchPointDataVM) new C214378bB(C65352Pkq.LIZ(TasksViewModel.class), null, C214528bQ.LJLIL, C78926UyI.LJJII(c246049lA, false), C184077Kh.LJLIL, C251999ul.INSTANCE, null, null).getValue();
    }

    public final IAccountUserService LJJIFFI() {
        return (IAccountUserService) this.LJLIL.getValue();
    }

    public final Keva LJJIIJ() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-keva>(...)");
        return (Keva) value;
    }

    public final InterfaceC32666Cru LJJIIZI() {
        return (InterfaceC32666Cru) this.LJLILLLLZI.getValue();
    }

    public final C50436Jqq LJJIJ() {
        if (this.LJLJJLL == null) {
            String curUserId = LJJIFFI().getCurUserId();
            o.LJIIIIZZ(curUserId, "accountService.curUserId");
            LJJJ(curUserId);
            String curUserId2 = LJJIFFI().getCurUserId();
            o.LJIIIIZZ(curUserId2, "accountService.curUserId");
            this.LJLJJLL = LJJIJIIJI(curUserId2);
        }
        C50436Jqq c50436Jqq = this.LJLJJLL;
        if (c50436Jqq != null) {
            return c50436Jqq;
        }
        o.LJIJI("coinTaskStatus");
        throw null;
    }

    public final boolean LJJI() {
        ActivityTask LJJIIZ = LJJIIZ();
        boolean z = false;
        if (LJJIIZ == null) {
            return false;
        }
        if (!LJJIIZ.isAuto) {
            InterfaceC32666Cru LJJIIZI = LJJIIZI();
            String curUserId = LJJIFFI().getCurUserId();
            o.LJIIIIZZ(curUserId, "accountService.curUserId");
            Boolean bool = (Boolean) LJJIIZI.LIZLLL(LJJIIJZLJL("has_entered_search_from_coin_", curUserId));
            if (bool != null) {
                z = bool.booleanValue();
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("canDoTask, cannot do task auto, hasEnteredSearch = ");
            LIZ.append(z);
            LJJIJLIJ(X1D.LIZIZ(LIZ));
            return z;
        }
        LJJIJLIJ("canDoTask, can do task auto");
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        if (r2.jumpLink != null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.touchpoint.core.model.InAppPush LJJII() {
        /*
            r5 = this;
            com.bytedance.touchpoint.core.model.ActivityTask r0 = r5.LJJIIZ()
            r3 = 0
            if (r0 == 0) goto Lb
            java.lang.String r4 = r0.taskKey
            if (r4 != 0) goto Lc
        Lb:
            return r3
        Lc:
            X.9O7 r1 = X.C2MW.LIZ()
            r0 = 6
            java.util.List r0 = r1.LJ(r0)
            if (r0 == 0) goto L73
            java.util.Iterator r1 = r0.iterator()
        L1c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L71
            java.lang.Object r2 = r1.next()
            r0 = r2
            com.bytedance.touchpoint.core.model.InAppPush r0 = (com.bytedance.touchpoint.core.model.InAppPush) r0
            com.bytedance.touchpoint.core.model.Control r0 = r0.control
            if (r0 == 0) goto L6f
            java.lang.String r0 = r0.taskName
        L2f:
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r4)
            if (r0 == 0) goto L1c
        L35:
            com.bytedance.touchpoint.core.model.InAppPush r2 = (com.bytedance.touchpoint.core.model.InAppPush) r2
            if (r2 == 0) goto L41
            java.lang.String r0 = r2.icon
            if (r0 == 0) goto L41
            java.lang.String r0 = r2.jumpLink
            if (r0 != 0) goto L6c
        L41:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "getCoinPushUIData, searchPush = "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", icon = "
            r1.append(r0)
            if (r2 == 0) goto L6d
            java.lang.String r0 = r2.icon
        L56:
            r1.append(r0)
            java.lang.String r0 = ", jumpLink = "
            r1.append(r0)
            if (r2 == 0) goto L62
            java.lang.String r3 = r2.jumpLink
        L62:
            r1.append(r3)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r5.LJJIJLIJ(r0)
        L6c:
            return r2
        L6d:
            r0 = r3
            goto L56
        L6f:
            r0 = r3
            goto L2f
        L71:
            r2 = r3
            goto L35
        L73:
            r2 = r3
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50734Jve.LJJII():com.bytedance.touchpoint.core.model.InAppPush");
    }

    public final boolean LJJIJIIJIL() {
        String str;
        boolean z = false;
        if (!LJJI()) {
            return false;
        }
        InAppPush LJJII = LJJII();
        if (LJJII != null) {
            str = LJJII.jumpLink;
            if (str != null && str.length() != 0) {
                InterfaceC32666Cru LJJIIZI = LJJIIZI();
                String curUserId = LJJIFFI().getCurUserId();
                o.LJIIIIZZ(curUserId, "accountService.curUserId");
                Boolean bool = (Boolean) LJJIIZI.LIZLLL(LJJIIJZLJL("search_task_is_claimed_", curUserId));
                if (bool != null) {
                    z = bool.booleanValue();
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("hasCoinTaskInBlankPage, hasCoinTaskInBlankPage = ");
                boolean z2 = !z;
                LIZ.append(z2);
                LJJIJLIJ(X1D.LIZIZ(LIZ));
                return z2;
            }
        } else {
            str = null;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("hasCoinTaskInBlankPage, coin banner's jump link is null or empty, jumpLink = ");
        LIZ2.append(str);
        LJJIJLIJ(X1D.LIZIZ(LIZ2));
        return false;
    }

    public static boolean LJJIJIL(String enterMethod) {
        o.LJIIIZ(enterMethod, "enterMethod");
        if (!o.LJ(enterMethod, "correct_word") && !o.LJ(enterMethod, "tab_search")) {
            return true;
        }
        return false;
    }

    public final java.util.Map<String, Long> LJJIII(String str) {
        Keva LJJIIJ = LJJIIJ();
        String LJJIIJZLJL = LJJIIJZLJL("search_task_complete_query_", str);
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-gson>(...)");
        String string = LJJIIJ.getString(LJJIIJZLJL, GsonProtectorUtils.toJson((Gson) value, new LinkedHashMap()));
        HashMap hashMap = (HashMap) GsonProtectorUtils.fromJson(MapDeserializerDoubleAsIntFix.LIZ, string, MapDeserializerDoubleAsIntFix.LIZIZ);
        o.LJII(hashMap, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Long>");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getCompletedQueriesFromStorage, get uid = ");
        LIZ.append(str);
        LIZ.append(", mapJsonStr = ");
        LIZ.append(string);
        LJJIJLIJ(X1D.LIZIZ(LIZ));
        return hashMap;
    }

    public final C50436Jqq LJJIJIIJI(String str) {
        int i;
        boolean z;
        long serverTimeMills;
        boolean z2;
        Integer num = (Integer) LJJIIZI().LIZLLL(LJJIIJZLJL("search_task_complete_count_", str));
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        Boolean bool = (Boolean) LJJIIZI().LIZLLL(LJJIIJZLJL("search_task_is_claimed_", str));
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        if (SpecActServiceImpl.LJJJIL().LJJJI()) {
            serverTimeMills = System.currentTimeMillis();
        } else {
            serverTimeMills = NetworkUtils.getServerTimeMills();
        }
        long j = LJJIIJ().getLong(LJJIIJZLJL("search_task_complete_time_", str), serverTimeMills);
        InterfaceC32666Cru LJJIIZI = LJJIIZI();
        String curUserId = LJJIFFI().getCurUserId();
        o.LJIIIIZZ(curUserId, "accountService.curUserId");
        Boolean bool2 = (Boolean) LJJIIZI.LIZLLL(LJJIIJZLJL("has_entered_search_from_coin_", curUserId));
        if (bool2 != null) {
            z2 = bool2.booleanValue();
        } else {
            z2 = false;
        }
        StringBuilder LJ = AnonymousClass028.LJ("getTaskStatusFromStorage, get uid = ", str, ", count = ", i, ", isClaimed = ");
        LJ.append(z);
        LJ.append(", lastCompleteTime = ");
        LJ.append(j);
        LJ.append(", hasEnteredSearch = ");
        LJ.append(z2);
        LJJIJLIJ(X1D.LIZIZ(LJ));
        return new C50436Jqq(i, z, j, z2);
    }

    public final void LJJIJL(String str) {
        this.LJLJJLL = new C50436Jqq();
        LJJJIL(this, str, LJJIJ());
        LJJIL(str, new LinkedHashMap());
    }

    public final void LJJIJLIJ(String logString) {
        o.LJIIIZ(logString, "logString");
        StringBuilder LIZ = X1D.LIZ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("[userId = ");
        LIZ2.append(LJJIFFI().getCurUserId());
        LIZ2.append(", timestamp = ");
        LIZ2.append(NetworkUtils.getServerTimeMills());
        LIZ2.append("]: ");
        LIZ.append(X1D.LIZIZ(LIZ2));
        LIZ.append(' ');
        LIZ.append(logString);
        C36922EeM.LIZLLL(4, "SearchCoinTaskALog", X1D.LIZIZ(LIZ));
    }

    public final void LJJJ(String str) {
        long serverTimeMills;
        if (SpecActServiceImpl.LJJJIL().LJJJI()) {
            serverTimeMills = System.currentTimeMillis();
        } else {
            serverTimeMills = NetworkUtils.getServerTimeMills();
        }
        long j = LJJIIJ().getLong(LJJIIJZLJL("search_task_complete_time_", str), serverTimeMills);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(j));
        boolean z = false;
        calendar.set(11, 0);
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.set(11, 23);
        calendar.set(13, 59);
        calendar.set(12, 59);
        calendar.set(14, 999);
        long timeInMillis2 = calendar.getTimeInMillis();
        StringBuilder LIZJ = V10.LIZJ("getStartAndEndTimestampOfOneDay, get time = ", j, ", That day's startTimestamp = ");
        LIZJ.append(timeInMillis);
        LIZJ.append(", endTimestamp = ");
        LIZJ.append(timeInMillis2);
        LJJIJLIJ(X1D.LIZIZ(LIZJ));
        C44435HcF c44435HcF = new C44435HcF(timeInMillis, timeInMillis2);
        if (serverTimeMills >= c44435HcF.LIZ && serverTimeMills <= c44435HcF.LIZIZ) {
            z = true;
        }
        if (!z) {
            StringBuilder LIZJ2 = C06490Nh.LIZJ("tryToClearCurrentTaskStatus, isSameDay = false, get uid = ", str, ", curTime = ", serverTimeMills);
            LIZJ2.append(", lastTime = ");
            LIZJ2.append(j);
            LJJIJLIJ(X1D.LIZIZ(LIZJ2));
            LJJIJL(str);
            return;
        }
        StringBuilder LIZJ3 = C06490Nh.LIZJ("tryToClearCurrentTaskStatus, isSameDay = true, get uid = ", str, ", curTime = ", serverTimeMills);
        LIZJ3.append(", lastTime = ");
        LIZJ3.append(j);
        LJJIJLIJ(X1D.LIZIZ(LIZJ3));
    }

    public final String LJJIIJZLJL(String str, String str2) {
        if (o.LJ(str2, CardStruct.IStatusCode.DEFAULT) || !LJJIFFI().isLogin()) {
            return str;
        }
        return i0.LJFF(str, str2);
    }

    public final void LJJIL(String str, java.util.Map queries) {
        o.LJIIIZ(queries, "queries");
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-gson>(...)");
        String json = GsonProtectorUtils.toJson((Gson) value, queries);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setCompletedQueriesToStorage, set uid = ");
        LIZ.append(str);
        LIZ.append(", mapJsonStr = ");
        LIZ.append(json);
        LJJIJLIJ(X1D.LIZIZ(LIZ));
        LJJIIJ().storeString(LJJIIJZLJL("search_task_complete_query_", str), json);
    }

    public final JSONObject LJJIZ(JSONObject jSONObject, boolean z) {
        boolean z2;
        String str;
        try {
            ActivityTask LJJIIZ = LJJIIZ();
            JSONObject jSONObject2 = new JSONObject();
            int i = LJJIJ().LJLIL;
            if (LJJIIZ != null) {
                if (i == LJJIIZ.count) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                jSONObject2.put("hasAchieved", z2);
                jSONObject2.put("taskCount", LJJIJ().LJLIL);
                jSONObject2.put("taskTotal", LJJIIZ.count);
                jSONObject2.put("bonusAmount", LJJIIZ.scoreAmount);
                jSONObject2.put("shouldUpdateEvent", z);
                InAppPush LJJII = LJJII();
                if (LJJII != null) {
                    str = LJJII.jumpLink;
                } else {
                    str = null;
                }
                jSONObject2.put("taskPageUrl", str);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("toAppendCoinTaskData, coinTask to FE = ");
                LIZ.append(jSONObject2);
                LJJIJLIJ(X1D.LIZIZ(LIZ));
                JSONObject put = jSONObject.put("coinTask", jSONObject2);
                o.LJIIIIZZ(put, "originData.put(\"coinTask\", task)");
                return put;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("toAppendCoinTaskData, exception info = ");
            LIZ2.append(C78963Uyt.LJIJJ(e));
            LJJIJLIJ(X1D.LIZIZ(LIZ2));
            return jSONObject;
        }
    }

    public static /* synthetic */ void LJJJIL(C50734Jve c50734Jve, String str, C50436Jqq c50436Jqq) {
        c50734Jve.LJJJI(str, c50436Jqq, "search_task_complete_count_", "search_task_is_claimed_", "search_task_complete_time_", "has_entered_search_from_coin_");
    }

    public final void LJJJI(String str, C50436Jqq c50436Jqq, String... strArr) {
        for (String str2 : strArr) {
            switch (str2.hashCode()) {
                case -1316902285:
                    if (str2.equals("search_task_complete_count_")) {
                        LJJIIZI().LJIIIIZZ(Integer.valueOf(c50436Jqq.LJLIL), LJJIIJZLJL(str2, str));
                        break;
                    } else {
                        break;
                    }
                case -407507114:
                    if (str2.equals("search_task_is_claimed_")) {
                        LJJIIZI().LJIIIIZZ(Boolean.valueOf(c50436Jqq.LJLILLLLZI), LJJIIJZLJL(str2, str));
                        break;
                    } else {
                        break;
                    }
                case -319298589:
                    if (str2.equals("has_entered_search_from_coin_")) {
                        LJJIIZI().LJIIIIZZ(Boolean.valueOf(c50436Jqq.LJLJJI), LJJIIJZLJL(str2, str));
                        break;
                    } else {
                        break;
                    }
                case 2051242383:
                    if (str2.equals("search_task_complete_time_")) {
                        LJJIIJ().storeLong(LJJIIJZLJL(str2, str), c50436Jqq.LJLJI);
                        break;
                    } else {
                        break;
                    }
            }
        }
        StringBuilder LIZIZ = C25620zW.LIZIZ("updateTaskStatusToStorage, set uid = ", str, ", updateKeys = ");
        LIZIZ.append(strArr);
        LIZIZ.append(", ");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("completedCount = ");
        LIZ.append(c50436Jqq.LJLIL);
        LIZ.append(", isClaimed = ");
        LIZ.append(c50436Jqq.LJLILLLLZI);
        LIZ.append(", lastTaskCompletedTime = ");
        LIZ.append(c50436Jqq.LJLJI);
        LIZ.append(", hasEnteredSearchFromCoin = ");
        LIZ.append(c50436Jqq.LJLJJI);
        LIZIZ.append(X1D.LIZIZ(LIZ));
        LJJIJLIJ(X1D.LIZIZ(LIZIZ));
    }
}

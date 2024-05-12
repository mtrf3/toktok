package com.ss.android.ugc.aweme.search.cointask.core.viewmodel;

import X.AKT;
import X.ActivityC45651qj;
import X.C113554cx;
import X.C12460eI;
import X.C17N;
import X.C18080nM;
import X.C18090nN;
import X.C188727au;
import X.C208158Ex;
import X.C221108m2;
import X.C251979uj;
import X.C252009um;
import X.C252019un;
import X.C31811Ce7;
import X.C32781Qk;
import X.C47261Igj;
import X.C50090JlG;
import X.C50322Jp0;
import X.C50436Jqq;
import X.C50605JtZ;
import X.C50734Jve;
import X.C50925Jyj;
import X.C50926Jyk;
import X.C50929Jyn;
import X.C50931Jyp;
import X.C50932Jyq;
import X.C50933Jyr;
import X.C51029K0z;
import X.C51764KTg;
import X.C5H3;
import X.C63144OqK;
import X.C73210SoI;
import X.C76800UCe;
import X.C79045V0n;
import X.C7MY;
import X.C86550Xxy;
import X.EnumC50927Jyl;
import X.FKM;
import X.FMX;
import X.InterfaceC224908sA;
import X.InterfaceC63764P0u;
import X.InterfaceC88472Yns;
import X.JC4;
import X.ORZ;
import X.OSZ;
import X.T5U;
import X.X1D;
import X.Z9N;
import Y.ACListenerS45S1100000_8;
import android.app.Activity;
import android.net.Uri;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.touchpoint.core.model.ActivityTask;
import com.bytedance.touchpoint.core.model.InAppPush;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushConfig;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.search.cointask.core.config.SearchCoinTaskConfigData;
import com.ss.android.ugc.aweme.search.ecommerce.middle.SearchStartViewModel;
import com.ss.android.ugc.aweme.util.CountDownTimer;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AqS155S0200000_8;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS31S1000000_8;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes9.dex */
public final class SearchCoinTaskManager {
    public static final int $stable = 8;
    public final C5H3 backgroundListener$delegate;
    public final C5H3 countdownListener$delegate;
    public boolean hasCoinTask;
    public final C5H3 headerBannerView$delegate;
    public final C5H3 innerPushHandler$delegate;
    public long lastStartTime;
    public int lastTimerDuration;
    public final C5H3 lifecycleCallback$delegate;
    public final C5H3 newCoinViewModel$delegate;
    public InterfaceC88472Yns<? super Boolean, C76800UCe> refreshResultPageFunc;
    public final C5H3 resultPageObserver$delegate;
    public C73210SoI searchHeaderWrapper;
    public final C5H3 searchStartViewModel$delegate;
    public final C5H3 statisticsManager$delegate;
    public final C5H3 timer$delegate;
    public final long timerInterval;

    private final void startTimer() {
        C50734Jve LIZ = C252019un.LIZ();
        SearchCoinTaskManager searchCoinTaskManager = LIZ.LJLJJL;
        if (searchCoinTaskManager != null) {
            searchCoinTaskManager.unregisterPushObserver();
        }
        LIZ.LJLJJL = this;
        if (getTimer().isRunning()) {
            getTimer().cancel();
        }
        getTimer().start();
        this.lastStartTime = SystemClock.elapsedRealtime();
    }

    private final InterfaceC63764P0u getBackgroundListener() {
        return (InterfaceC63764P0u) this.backgroundListener$delegate.getValue();
    }

    private final C252009um getInnerPushHandler() {
        return (C252009um) this.innerPushHandler$delegate.getValue();
    }

    private final C50932Jyq getLifecycleCallback() {
        return (C50932Jyq) this.lifecycleCallback$delegate.getValue();
    }

    private final Observer<Integer> getResultPageObserver() {
        return (Observer) this.resultPageObserver$delegate.getValue();
    }

    private final SearchStartViewModel getSearchStartViewModel() {
        return (SearchStartViewModel) this.searchStartViewModel$delegate.getValue();
    }

    private final CountDownTimer getTimer() {
        return (CountDownTimer) this.timer$delegate.getValue();
    }

    public final JC4 getCountdownListener() {
        return (JC4) this.countdownListener$delegate.getValue();
    }

    public final C50925Jyj getHeaderBannerView() {
        return (C50925Jyj) this.headerBannerView$delegate.getValue();
    }

    public final SearchCoinNewUIStyleViewModel getNewCoinViewModel() {
        return (SearchCoinNewUIStyleViewModel) this.newCoinViewModel$delegate.getValue();
    }

    public final C251979uj getStatisticsManager() {
        return (C251979uj) this.statisticsManager$delegate.getValue();
    }

    public final void unregisterPushObserver() {
        C86550Xxy.LIZIZ.LJII(getInnerPushHandler());
        getSearchStartViewModel().hv0().removeObserver(getResultPageObserver());
        ActivityStack.removeAppBackGroundListener(getBackgroundListener());
        FKM.LIZ().unregisterActivityLifecycleCallbacks(getLifecycleCallback());
    }

    private final boolean inResultPage() {
        Integer value = getSearchStartViewModel().hv0().getValue();
        if (value == null || value.intValue() != 0) {
            return false;
        }
        return true;
    }

    public final void hideResultPageCoinBanner() {
        if (C50929Jyn.LIZ()) {
            C73210SoI c73210SoI = this.searchHeaderWrapper;
            if (c73210SoI != null) {
                c73210SoI.LLFFF(getHeaderBannerView());
            }
            InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns = this.refreshResultPageFunc;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(Boolean.FALSE);
            } else {
                o.LJIJI("refreshResultPageFunc");
                throw null;
            }
        } else {
            ((LiveData) getNewCoinViewModel().LJLIL.getValue()).setValue(Boolean.FALSE);
        }
        this.hasCoinTask = false;
        unregisterPushObserver();
    }

    public final boolean hasCoinTaskInResultPage() {
        return this.hasCoinTask;
    }

    public SearchCoinTaskManager(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        this.headerBannerView$delegate = C221108m2.LIZIZ(new AqS158S0100000_8(activity, 136));
        this.newCoinViewModel$delegate = C221108m2.LIZIZ(new AqS158S0100000_8(activity, 139));
        this.lastStartTime = -1L;
        this.timerInterval = 1000L;
        this.timer$delegate = C221108m2.LIZIZ(new AqS158S0100000_8(this, 142));
        this.statisticsManager$delegate = C221108m2.LIZIZ(C50933Jyr.LJLIL);
        this.innerPushHandler$delegate = C221108m2.LIZIZ(new AqS158S0100000_8(this, 137));
        this.countdownListener$delegate = C221108m2.LIZIZ(new AqS155S0200000_8(this, activity, 6));
        this.searchStartViewModel$delegate = C221108m2.LIZIZ(new AqS158S0100000_8(activity, 141));
        this.resultPageObserver$delegate = C221108m2.LIZIZ(new AqS158S0100000_8(this, UserLevelGeckoUpdateSetting.DEFAULT));
        this.backgroundListener$delegate = C221108m2.LIZIZ(new AqS158S0100000_8(this, 135));
        this.lifecycleCallback$delegate = C221108m2.LIZIZ(new AqS158S0100000_8(this, 138));
    }

    private final void registerObservers(ActivityC45651qj activityC45651qj) {
        getSearchStartViewModel().hv0().observe(activityC45651qj, getResultPageObserver());
        ActivityStack.addAppBackGroundListener(getBackgroundListener());
        FKM.LIZ().registerActivityLifecycleCallbacks(getLifecycleCallback());
    }

    private final void showResultPageCoinBanner(ActivityC45651qj activityC45651qj) {
        C73210SoI c73210SoI;
        startTimer();
        if (C50929Jyn.LIZ()) {
            C73210SoI c73210SoI2 = this.searchHeaderWrapper;
            if (c73210SoI2 != null) {
                if (!((ArrayList) c73210SoI2.LJZI()).contains(getHeaderBannerView()) && (c73210SoI = this.searchHeaderWrapper) != null) {
                    c73210SoI.LJZ(getHeaderBannerView());
                }
            }
            getHeaderBannerView().LIZ(C50926Jyk.LIZ());
            InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns = this.refreshResultPageFunc;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(Boolean.TRUE);
            } else {
                o.LJIJI("refreshResultPageFunc");
                throw null;
            }
        } else {
            ((LiveData) getNewCoinViewModel().LJLIL.getValue()).setValue(Boolean.TRUE);
            ((LiveData) getNewCoinViewModel().LJLILLLLZI.getValue()).setValue(Integer.valueOf(C50926Jyk.LIZ()));
        }
        registerObservers(activityC45651qj);
    }

    private final void tryToShowToastForRepeatQuery(Fragment fragment) {
        if (C252019un.LIZ().LJLL) {
            C31811Ce7.LIZJ(fragment, R.string.qbs);
        }
    }

    public final void cancelTimer(EnumC50927Jyl stopReason) {
        o.LJIIIZ(stopReason, "stopReason");
        this.lastTimerDuration = (int) (SystemClock.elapsedRealtime() - this.lastStartTime);
        if (getTimer().isRunning()) {
            C50734Jve LIZ = C252019un.LIZ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("cancelTimer, stopReason = ");
            LIZ2.append(stopReason);
            LIZ.LJJIJLIJ(X1D.LIZIZ(LIZ2));
            getTimer().cancel();
            hideResultPageCoinBanner();
            C251979uj statisticsManager = getStatisticsManager();
            int i = this.lastTimerDuration;
            statisticsManager.getClass();
            C188727au c188727au = new C188727au();
            c188727au.LIZLLL(i, "duration");
            c188727au.LIZLLL(stopReason.getType(), "stop_reason");
            c188727au.LJIIIIZZ(statisticsManager.LIZ);
            FMX.LJIIL("search_result_show_gold_stop", c188727au.LIZ);
        }
        C50734Jve LIZ3 = C252019un.LIZ();
        SearchCoinTaskManager searchCoinTaskManager = LIZ3.LJLJJL;
        if (searchCoinTaskManager != null) {
            searchCoinTaskManager.unregisterPushObserver();
        }
        LIZ3.LJLJJL = null;
    }

    public final void onSearchRequestFinished(Fragment fragment) {
        String str;
        o.LJIIIZ(fragment, "fragment");
        if (!inResultPage()) {
            return;
        }
        if (this.hasCoinTask) {
            C251979uj statisticsManager = getStatisticsManager();
            statisticsManager.getClass();
            C50322Jp0 LIZJ = C17N.LJJJJJL(fragment).If().LIZJ();
            ((LinkedHashMap) statisticsManager.LIZ).clear();
            Map<String, String> map = statisticsManager.LIZ;
            if (LIZJ != null) {
                if (LIZJ.LJLIL == C50605JtZ.LJIIJJI()) {
                    str = "general_search";
                } else {
                    str = "search_result";
                }
            } else {
                str = "";
            }
            map.put("enter_from", str);
            statisticsManager.LIZ.put("source", LIZJ.LJZ);
            statisticsManager.LIZ.put("search_id", LIZJ.LJLJI);
            statisticsManager.LIZ.put("query", LIZJ.LJLJJI);
            C188727au c188727au = new C188727au();
            c188727au.LJIIIIZZ(statisticsManager.LIZ);
            FMX.LJIIL("search_result_show_gold_begin", c188727au.LIZ);
            return;
        }
        tryToShowToastForRepeatQuery(fragment);
    }

    public final void processCoinTimerWhenPageChange(Activity activity) {
        C32781Qk LJIILIIL;
        boolean z;
        List<String> list;
        SparkActivity sparkActivity;
        SparkContext sparkContext;
        String str;
        C18080nM c18080nM = C18080nM.LIZ;
        c18080nM.getClass();
        C18090nN c18090nN = C18080nM.LIZJ;
        String str2 = null;
        if (c18090nN == null || (LJIILIIL = C12460eI.LJIILIIL(c18090nN)) == null) {
            return;
        }
        String str3 = LJIILIIL.LIZIZ().LIZJ;
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        c18080nM.getClass();
        C18090nN c18090nN2 = C18080nM.LIZJ;
        if (c18090nN2 != null) {
            str2 = c18090nN2.LIZIZ();
        }
        Z9N z9n = Z9N.LIZIZ;
        boolean LLLJIL = z9n.LLLJIL(C51029K0z.LJIIL(str3));
        if ((activity instanceof SparkActivity) && (sparkActivity = (SparkActivity) activity) != null && (sparkContext = sparkActivity.LJLIL) != null && (str = sparkContext.url) != null) {
            str4 = str;
        }
        if (str4.length() > 0 && ujb.o.LJJJLIIL(str4, "aweme://webview", false)) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = activity instanceof InterfaceC224908sA;
        if (LLLJIL) {
            SearchCoinTaskConfigData LIZIZ = C50926Jyk.LIZIZ();
            if (LIZIZ == null || (list = LIZIZ.timerStopWhiteListOfBTM) == null) {
                list = C50926Jyk.LIZ;
            }
            if (ORZ.LJLJJI(str2, list) || z || z2) {
                return;
            }
        }
        if (z9n.LLLJIL(str2)) {
            cancelTimer(EnumC50927Jyl.SEND_NEW_SEARCH);
        } else {
            cancelTimer(EnumC50927Jyl.ENTER_OTHER_BUSINESS);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void showTopCoinTaskPush(ActivityC45651qj activityC45651qj) {
        InAppPush LJJII;
        String str;
        InAppPush LJJII2;
        String str2;
        boolean z;
        SpannableString spannableString;
        int i;
        int i2;
        Integer num;
        int i3 = 0;
        C86550Xxy.LIZIZ.LJIIIIZZ(getInnerPushHandler(), new int[]{1003});
        ActivityTask LJJIIZ = C252019un.LIZ().LJJIIZ();
        if (LJJIIZ == null || (LJJII = C252019un.LIZ().LJJII()) == null || (str = LJJII.icon) == null || (LJJII2 = C252019un.LIZ().LJJII()) == null || (str2 = LJJII2.jumpLink) == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("aweme://webview?url=");
        LIZ.append(Uri.encode(str2));
        String LIZIZ = X1D.LIZIZ(LIZ);
        C50436Jqq LJJIJ = C252019un.LIZ().LJJIJ();
        if (LJJIJ.LJLIL >= LJJIIZ.count) {
            z = true;
        } else {
            z = false;
        }
        Integer num2 = LJJIIZ.scoreAmount;
        if (num2 != null) {
            int intValue = num2.intValue();
            String str3 = null;
            if (z) {
                Locale locale = Locale.US;
                String string = activityC45651qj.getString(R.string.qbq);
                o.LJIIIIZZ(string, "context.getString(R.stri…searchResultsPage_toast2)");
                spannableString = new SpannableString(C63144OqK.LIZIZ(new Object[]{Integer.valueOf(intValue)}, 1, locale, string, "format(locale, format, *args)"));
                spannableString.setSpan(new T5U(42, false), 0, spannableString.length(), 33);
            } else {
                int i4 = LJJIIZ.count - LJJIJ.LJLIL;
                String quantityString = activityC45651qj.getResources().getQuantityString(R.plurals.sj, i4);
                o.LJIIIIZZ(quantityString, "context.resources.getQua…sPage_toast1, remainTask)");
                String LIZIZ2 = C63144OqK.LIZIZ(new Object[]{Integer.valueOf(i4), Integer.valueOf(intValue)}, 2, Locale.US, quantityString, "format(locale, format, *args)");
                Integer LJI = C79045V0n.LJI(R.attr.eb, activityC45651qj);
                if (LJI != null) {
                    spannableString = getColorSpanString(LIZIZ2, C47261Igj.LJJIJIIJI(String.valueOf(intValue), String.valueOf(i4)), LJI.intValue());
                    spannableString.setSpan(new T5U(42, false), 0, LIZIZ2.length(), 33);
                } else {
                    spannableString = null;
                }
            }
            long j = 0;
            SearchCoinTaskConfigData LIZIZ3 = C50926Jyk.LIZIZ();
            if (LIZIZ3 != null && (num = LIZIZ3.taskToastDurationTime) != null) {
                i = num.intValue();
            } else {
                i = 3;
            }
            InnerPushConfig innerPushConfig = new InnerPushConfig(j, null == true ? 1 : 0, i3, null == true ? 1 : 0, i, 15, null == true ? 1 : 0);
            List LJJIJ2 = C47261Igj.LJJIJ(str);
            if (z) {
                i2 = 3;
                str3 = activityC45651qj.getString(R.string.qbr);
            } else {
                i2 = 0;
            }
            new C51764KTg(1003, "click_push_search_coin_task", innerPushConfig, new InnerPushUITemplate(0, null, 0, 0, 0, 0, null, LJJIJ2, null, null, null, null, null, null, 32, 32, 0.0f, 0.0f, null, 0, 0, null, 0, null, 0, 0, null, null, null, spannableString, 0, null, i2, str3, null, 0, 0, 0, 0, null, null, 0.0f, 0, null, null, LIZIZ, 0, null, null, null, null, null, -541245569, 1040380, null), C113554cx.LJJLIIIIJ(new OSZ("business_tag", "search")), null, UserLevelGeckoUpdateSetting.DEFAULT).LIZ();
            C252019un.LIZ().LJJIJLIJ("showCoinTaskPush, completedCount = " + LJJIJ.LJLIL + ", hasCompletedAll = " + z);
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    private final SpannableString getColorSpanString(String str, List<String> list, int i) {
        SpannableString spannableString = new SpannableString(str);
        for (String str2 : list) {
            int LJJLIIIJL = s.LJJLIIIJL(str, str2, 0, false, 6);
            if (LJJLIIIJL > -1 && LJJLIIIJL < str.length()) {
                spannableString.setSpan(new ForegroundColorSpan(i), LJJLIIIJL, str2.length() + LJJLIIIJL, 33);
            }
        }
        return spannableString;
    }

    private final void showBottomCoinToast(CharSequence charSequence, String str, boolean z, String str2) {
        Integer num;
        Activity curActivity = ActivityStack.getTopActivity();
        o.LJIIIIZZ(curActivity, "curActivity");
        AKT akt = new AKT(curActivity);
        akt.LJI(charSequence);
        akt.LIZ.LJLILLLLZI = 4;
        AqS31S1000000_8 aqS31S1000000_8 = new AqS31S1000000_8(str, 1);
        C208158Ex c208158Ex = akt.LIZ;
        c208158Ex.LJLJI = aqS31S1000000_8;
        int i = 3;
        if (z) {
            c208158Ex.LJLJJI = 1;
            akt.LIZ.LJLJJLL = curActivity.getString(R.string.qbr);
        } else {
            c208158Ex.LJLJJI = 3;
            c208158Ex.LJLJJL = C50931Jyp.LJLIL;
        }
        akt.LIZ.LJLJL = C7MY.LIZIZ(20);
        SearchCoinTaskConfigData LIZIZ = C50926Jyk.LIZIZ();
        if (LIZIZ != null && (num = LIZIZ.taskToastDurationTime) != null) {
            i = num.intValue();
        }
        akt.LIZJ(i * 1000);
        akt.LIZ.LJLJLJ = new ACListenerS45S1100000_8(this, str2, 0);
        akt.LJII();
        getStatisticsManager().LIZIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setCoinViewsVisibility(X.C73210SoI r11, com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig r12, boolean r13, X.ActivityC45651qj r14, X.InterfaceC88472Yns<? super java.lang.Boolean, X.C76800UCe> r15) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.cointask.core.viewmodel.SearchCoinTaskManager.setCoinViewsVisibility(X.SoI, com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig, boolean, X.1qj, X.Yns):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setCoinViewsVisibility$default(SearchCoinTaskManager searchCoinTaskManager, C73210SoI c73210SoI, GlobalDoodleConfig globalDoodleConfig, boolean z, ActivityC45651qj activityC45651qj, InterfaceC88472Yns interfaceC88472Yns, int i, Object obj) {
        if ((i & 1) != 0) {
            c73210SoI = null;
        }
        if ((i & 16) != 0) {
            interfaceC88472Yns = C50090JlG.LJLIL;
        }
        searchCoinTaskManager.setCoinViewsVisibility(c73210SoI, globalDoodleConfig, z, activityC45651qj, interfaceC88472Yns);
    }
}

package com.bytedance.apm.agent.v2.instrumentation;

import X.C09970aH;
import X.C16880lQ;
import X.C2LC;
import X.C2OH;
import X.F9U;
import X.OIO;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.monitor.MonitorTool;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class FragmentTimeAgent {
    public static long sCheckVisibilityStartTime = 0;
    public static String sFragmentName = null;
    public static long sMaxWaitTime = 60000;
    public static HashSet<String> sMethodSet = new HashSet<>(32);
    public static long sOnActivityCreatedEnd;
    public static long sOnActivityCreatedStart;
    public static long sOnCreateEnd;
    public static long sOnCreateStart;
    public static ViewTreeObserver.OnGlobalLayoutListener sOnGlobalLayoutListener;
    public static long sOnResumeEnd;
    public static long sOnResumeStart;
    public static long sOnViewCreatedEnd;
    public static long sOnViewCreatedStart;
    public static boolean sReported;
    public static WeakReference<View> sRootViewRef;
    public static Runnable sWaitViewTimeoutRunnable;

    public static boolean isValid(String str) {
        if (!sReported && TextUtils.equals(str, sFragmentName)) {
            return true;
        }
        return false;
    }

    public static void onHiddenChanged(Fragment fragment, boolean z) {
        if (z) {
            return;
        }
        try {
            String LJLLILLLL = C16880lQ.LJLLILLLL(fragment.getClass());
            Integer LIZ = C2LC.LIZ(LJLLILLLL);
            if (LIZ != null && LIZ.intValue() > 0) {
                registerOnGlobalLayoutListener(LJLLILLLL, fragment.getView(), LIZ, System.currentTimeMillis(), "fragmentOnHiddenChangedToViewShow");
            }
        } catch (Exception unused) {
        }
    }

    public static void onResumeShow(Fragment fragment, String str) {
        if (!fragment.getUserVisibleHint() || fragment.isHidden()) {
            return;
        }
        try {
            Integer LIZ = C2LC.LIZ(str);
            if (LIZ != null && LIZ.intValue() > 0) {
                registerOnGlobalLayoutListener(str, fragment.getView(), LIZ, sOnCreateStart, "fragmentOnCreateToViewShow");
            }
        } catch (Exception unused) {
        }
    }

    public static void setUserVisibleHint(Fragment fragment, boolean z) {
        if (!z || !fragment.isResumed() || fragment.isHidden()) {
            return;
        }
        try {
            String LJLLILLLL = C16880lQ.LJLLILLLL(fragment.getClass());
            Integer LIZ = C2LC.LIZ(LJLLILLLL);
            if (LIZ != null && LIZ.intValue() > 0) {
                registerOnGlobalLayoutListener(LJLLILLLL, fragment.getView(), LIZ, System.currentTimeMillis(), "fragmentUserVisibleToViewShow");
            }
        } catch (Exception unused) {
        }
    }

    public static void onTrace(Fragment fragment, String str, String str2, boolean z) {
        if (TextUtils.equals("onCreate", str2)) {
            if (z) {
                sFragmentName = str;
                sOnCreateStart = System.currentTimeMillis();
                if (sMaxWaitTime == 0) {
                    sMaxWaitTime = OIO.LIZ.LIZIZ().LIZIZ;
                }
                sReported = false;
                return;
            }
            if (!isValid(str)) {
                return;
            }
            sOnCreateEnd = System.currentTimeMillis();
            return;
        }
        if (TextUtils.equals("onViewCreated", str2) && isValid(str)) {
            if (z) {
                if (sOnCreateStart <= 0) {
                    return;
                }
                sOnViewCreatedStart = System.currentTimeMillis();
                return;
            } else {
                if (sOnCreateStart <= 0) {
                    return;
                }
                sOnViewCreatedEnd = System.currentTimeMillis();
                return;
            }
        }
        if (TextUtils.equals("onActivityCreated", str2) && isValid(str)) {
            if (z) {
                if (sOnCreateStart <= 0) {
                    return;
                }
                sOnActivityCreatedStart = System.currentTimeMillis();
                return;
            } else {
                if (sOnCreateStart <= 0) {
                    return;
                }
                sOnActivityCreatedEnd = System.currentTimeMillis();
                return;
            }
        }
        if (!TextUtils.equals("onResume", str2) || !isValid(str)) {
            return;
        }
        if (z) {
            if (sOnCreateStart <= 0) {
                return;
            }
            sOnResumeStart = System.currentTimeMillis();
            onResumeShow(fragment, str);
            return;
        }
        if (sOnCreateStart <= 0) {
            return;
        }
        sOnResumeEnd = System.currentTimeMillis();
        try {
            Integer LIZ = C2LC.LIZ(str);
            if (LIZ == null || LIZ.intValue() <= 0) {
                F9U.LIZ.LIZJ(new Runnable() { // from class: com.bytedance.apm.agent.v2.instrumentation.FragmentTimeAgent.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com_bytedance_apm_agent_v2_instrumentation_FragmentTimeAgent$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_bytedance_apm_agent_v2_instrumentation_FragmentTimeAgent$1__run$___twin___() {
                        boolean contains = FragmentTimeAgent.sMethodSet.contains(FragmentTimeAgent.sFragmentName);
                        FragmentTimeAgent.sMethodSet.add(FragmentTimeAgent.sFragmentName);
                        FragmentTimeAgent.reportStats(contains, null, 0L, 0L);
                    }

                    public static void com_bytedance_apm_agent_v2_instrumentation_FragmentTimeAgent$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                        boolean LIZ2;
                        try {
                            anonymousClass1.com_bytedance_apm_agent_v2_instrumentation_FragmentTimeAgent$1__run$___twin___();
                        } finally {
                            if (LIZ2) {
                            }
                        }
                    }
                });
            }
        } catch (Exception unused) {
        }
        sReported = true;
        sFragmentName = null;
    }

    public static void reportStats(boolean z, String str, long j, long j2) {
        int i;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", "onCreate");
            jSONObject.put("start", sOnCreateStart);
            jSONObject.put("end", sOnCreateEnd);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("name", "onViewCreated");
            jSONObject2.put("start", sOnViewCreatedStart);
            jSONObject2.put("end", sOnViewCreatedEnd);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("name", "onActivityCreated");
            jSONObject3.put("start", sOnActivityCreatedStart);
            jSONObject3.put("end", sOnActivityCreatedEnd);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("name", "onResume");
            jSONObject4.put("start", sOnResumeStart);
            jSONObject4.put("end", sOnResumeEnd);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            jSONArray.put(jSONObject2);
            jSONArray.put(jSONObject3);
            jSONArray.put(jSONObject4);
            if (str != null) {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("name", str);
                jSONObject5.put("start", j);
                jSONObject5.put("end", j2);
                jSONArray.put(jSONObject5);
            }
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("name", "page_load_stats");
            jSONObject6.put("page_type", "fragment");
            jSONObject6.put("start", sOnCreateStart);
            jSONObject6.put("spans", jSONArray);
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            jSONObject6.put("launch_mode", i);
            jSONObject6.put("collect_from", 1);
            jSONObject6.put("page_name", sFragmentName);
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("trace", jSONObject6);
            MonitorTool.monitorPerformance("page_load_trace", null, null, jSONObject7);
        } catch (Exception e) {
            if (C09970aH.LJII()) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public static void reportTraceTime(String str, final String str2, final long j, final long j2) {
        F9U.LIZ.LIZJ(new Runnable() { // from class: com.bytedance.apm.agent.v2.instrumentation.FragmentTimeAgent.2
            @Override // java.lang.Runnable
            public void run() {
                com_bytedance_apm_agent_v2_instrumentation_FragmentTimeAgent$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_bytedance_apm_agent_v2_instrumentation_FragmentTimeAgent$2__run$___twin___() {
                boolean contains = FragmentTimeAgent.sMethodSet.contains(FragmentTimeAgent.sFragmentName);
                FragmentTimeAgent.sMethodSet.add(FragmentTimeAgent.sFragmentName);
                FragmentTimeAgent.reportStats(contains, str2, j, j2);
            }

            public static void com_bytedance_apm_agent_v2_instrumentation_FragmentTimeAgent$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                boolean LIZ;
                try {
                    anonymousClass2.com_bytedance_apm_agent_v2_instrumentation_FragmentTimeAgent$2__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public static void registerOnGlobalLayoutListener(String str, View view, final Integer num, final long j, final String str2) {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
        if (num == null || num.intValue() <= 0) {
            return;
        }
        sFragmentName = str;
        WeakReference<View> weakReference = sRootViewRef;
        if (weakReference != null && weakReference.get() != view) {
            ViewTreeObserver viewTreeObserver = sRootViewRef.get().getViewTreeObserver();
            if (viewTreeObserver.isAlive() && (onGlobalLayoutListener = sOnGlobalLayoutListener) != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            if (sWaitViewTimeoutRunnable != null) {
                C2OH.LIZ.removeCallbacks(sWaitViewTimeoutRunnable);
            }
        }
        sRootViewRef = new WeakReference<>(view);
        sCheckVisibilityStartTime = 0L;
        sOnGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.apm.agent.v2.instrumentation.FragmentTimeAgent.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                try {
                    WeakReference<View> weakReference2 = FragmentTimeAgent.sRootViewRef;
                    if (weakReference2 != null && weakReference2.get() != null) {
                        View findViewById = FragmentTimeAgent.sRootViewRef.get().findViewById(num.intValue());
                        if (FragmentTimeAgent.sCheckVisibilityStartTime == 0) {
                            FragmentTimeAgent.sCheckVisibilityStartTime = System.currentTimeMillis();
                        }
                        if (findViewById != null && findViewById.getVisibility() == 0 && findViewById.getWidth() > 0) {
                            long currentTimeMillis = System.currentTimeMillis();
                            if (FragmentTimeAgent.sRootViewRef.get().getViewTreeObserver().isAlive() && FragmentTimeAgent.sOnGlobalLayoutListener != null) {
                                FragmentTimeAgent.sRootViewRef.get().getViewTreeObserver().removeOnGlobalLayoutListener(FragmentTimeAgent.sOnGlobalLayoutListener);
                            }
                            FragmentTimeAgent.sOnGlobalLayoutListener = null;
                            FragmentTimeAgent.sRootViewRef = null;
                            if (FragmentTimeAgent.sWaitViewTimeoutRunnable != null) {
                                C2OH.LIZ.removeCallbacks(FragmentTimeAgent.sWaitViewTimeoutRunnable);
                            }
                            long j2 = j;
                            long j3 = currentTimeMillis - j2;
                            if (currentTimeMillis - FragmentTimeAgent.sCheckVisibilityStartTime > 1 && j3 < FragmentTimeAgent.sMaxWaitTime) {
                                FragmentTimeAgent.reportTraceTime(FragmentTimeAgent.sFragmentName, str2, j2, currentTimeMillis);
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            }
        };
        view.getViewTreeObserver().addOnGlobalLayoutListener(sOnGlobalLayoutListener);
        sWaitViewTimeoutRunnable = new Runnable() { // from class: com.bytedance.apm.agent.v2.instrumentation.FragmentTimeAgent.4
            @Override // java.lang.Runnable
            public void run() {
                com_bytedance_apm_agent_v2_instrumentation_FragmentTimeAgent$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_bytedance_apm_agent_v2_instrumentation_FragmentTimeAgent$4__run$___twin___() {
                WeakReference<View> weakReference2;
                try {
                    if (FragmentTimeAgent.sOnGlobalLayoutListener != null && (weakReference2 = FragmentTimeAgent.sRootViewRef) != null && weakReference2.get() != null) {
                        FragmentTimeAgent.sRootViewRef.get().getViewTreeObserver().removeOnGlobalLayoutListener(FragmentTimeAgent.sOnGlobalLayoutListener);
                    }
                } catch (Exception unused) {
                }
            }

            public static void com_bytedance_apm_agent_v2_instrumentation_FragmentTimeAgent$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass4 anonymousClass4) {
                boolean LIZ;
                try {
                    anonymousClass4.com_bytedance_apm_agent_v2_instrumentation_FragmentTimeAgent$4__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        };
        C2OH.LIZ.postDelayed(sWaitViewTimeoutRunnable, sMaxWaitTime);
    }
}

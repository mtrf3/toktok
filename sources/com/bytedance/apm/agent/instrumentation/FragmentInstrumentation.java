package com.bytedance.apm.agent.instrumentation;

import X.C16880lQ;
import X.C2LC;
import X.C2OH;
import X.OIO;
import X.WM7;
import X.X1D;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.helper.PageShowHelper;
import com.bytedance.apm.agent.monitor.MonitorTool;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class FragmentInstrumentation {
    public static long sCheckVisibilityStartTime;
    public static String sFragmentName;
    public static long sMaxWaitTime;
    public static HashSet<String> sMethodSet = new HashSet<>(32);
    public static long sOnActivityCreatedEnd;
    public static long sOnActivityCreatedStart;
    public static long sOnCreateEnd;
    public static String sOnCreateFragmentName;
    public static long sOnCreateStart;
    public static long sOnCreateTime;
    public static ViewTreeObserver.OnGlobalLayoutListener sOnGlobalLayoutListener;
    public static long sOnResumeEnd;
    public static long sOnResumeStart;
    public static long sOnViewCreatedEnd;
    public static long sOnViewCreatedStart;
    public static WeakReference<View> sRootViewRef;
    public static Runnable sWaitViewTimeoutRunnable;

    public static boolean isValid(String str) {
        if (!TextUtils.isEmpty(sFragmentName) && TextUtils.equals(str, sFragmentName)) {
            return true;
        }
        return false;
    }

    public static void onCreate(String str) {
        sOnCreateFragmentName = str;
        sOnCreateTime = System.currentTimeMillis();
        if (sMaxWaitTime == 0) {
            sMaxWaitTime = OIO.LIZ.LIZIZ().LIZIZ;
        }
    }

    public static void onPause(Fragment fragment) {
        if (fragment.getUserVisibleHint() && !fragment.isHidden()) {
            PageShowHelper.onPageShowHideAction(fragment, false);
        }
    }

    public static void onResume(Fragment fragment) {
        if (fragment.getUserVisibleHint() && !fragment.isHidden()) {
            String LJLLILLLL = C16880lQ.LJLLILLLL(fragment.getClass());
            try {
                PageShowHelper.onPageShowHideAction(fragment, true);
                if (!TextUtils.equals(LJLLILLLL, sOnCreateFragmentName)) {
                    return;
                }
                registerOnGlobalLayoutListener(LJLLILLLL, fragment.getView(), C2LC.LIZ(LJLLILLLL), sOnCreateTime, "fragmentOnCreateToViewShow");
            } catch (Exception unused) {
            }
        }
    }

    public static void onHiddenChanged(Fragment fragment, boolean z) {
        PageShowHelper.onPageShowHideAction(fragment, !z);
        if (!z) {
            try {
                String LJLLILLLL = C16880lQ.LJLLILLLL(fragment.getClass());
                registerOnGlobalLayoutListener(LJLLILLLL, fragment.getView(), C2LC.LIZ(LJLLILLLL), System.currentTimeMillis(), "fragmentOnHiddenChangedToViewShow");
            } catch (Exception unused) {
            }
        }
    }

    public static void setUserVisibleHint(Fragment fragment, boolean z) {
        if (fragment.isResumed() && !fragment.isHidden()) {
            PageShowHelper.onPageShowHideAction(fragment, z);
            if (z) {
                try {
                    String LJLLILLLL = C16880lQ.LJLLILLLL(fragment.getClass());
                    registerOnGlobalLayoutListener(LJLLILLLL, fragment.getView(), C2LC.LIZ(LJLLILLLL), System.currentTimeMillis(), "fragmentUserVisibleToViewShow");
                } catch (Exception unused) {
                }
            }
        }
    }

    public static void onTrace(Fragment fragment, String str, String str2, boolean z) {
        boolean z2;
        if (TextUtils.equals("onCreate", str2)) {
            if (z) {
                sFragmentName = str;
                sOnCreateStart = System.currentTimeMillis();
                return;
            } else {
                if (!isValid(str)) {
                    return;
                }
                sOnCreateEnd = System.currentTimeMillis();
                return;
            }
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
            return;
        }
        if (sOnCreateStart <= 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        sOnResumeEnd = currentTimeMillis;
        if (currentTimeMillis - sOnCreateStart < 5000) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("begin_time", sOnCreateStart);
                jSONObject.put("end_time", sOnResumeEnd);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("onCreate", sOnCreateEnd - sOnCreateStart);
                jSONObject2.put("onViewCreated", sOnViewCreatedEnd - sOnViewCreatedStart);
                jSONObject2.put("onActivityCreated", sOnActivityCreatedEnd - sOnActivityCreatedStart);
                jSONObject2.put("onResume", sOnResumeEnd - sOnResumeStart);
                jSONObject2.put("fragment_create_to_resume", sOnResumeEnd - sOnCreateStart);
                if (fragment != null && fragment.mo49getActivity() != null) {
                    jSONObject.put("attached_activity", fragment.mo49getActivity().getClass().getName());
                }
                jSONObject.put("page_type", "fragment");
                JSONObject jSONObject3 = new JSONObject();
                HashSet<String> hashSet = sMethodSet;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(sFragmentName);
                LIZ.append(str2);
                if (!hashSet.contains(X1D.LIZIZ(LIZ))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                jSONObject3.put("is_first", z2);
                jSONObject3.put(WM7.SCENE_SERVICE, str);
                HashSet<String> hashSet2 = sMethodSet;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(sFragmentName);
                LIZ2.append(str2);
                hashSet2.add(X1D.LIZIZ(LIZ2));
                MonitorTool.monitorPerformance("page_load", jSONObject2, jSONObject3, jSONObject);
            } catch (Exception unused) {
            }
        }
        sOnCreateStart = 0L;
        sFragmentName = null;
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
        sOnGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.apm.agent.instrumentation.FragmentInstrumentation.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                try {
                    WeakReference<View> weakReference2 = FragmentInstrumentation.sRootViewRef;
                    if (weakReference2 != null && weakReference2.get() != null) {
                        View findViewById = FragmentInstrumentation.sRootViewRef.get().findViewById(num.intValue());
                        if (FragmentInstrumentation.sCheckVisibilityStartTime == 0) {
                            FragmentInstrumentation.sCheckVisibilityStartTime = System.currentTimeMillis();
                        }
                        if (findViewById != null && findViewById.getVisibility() == 0 && findViewById.getWidth() > 0) {
                            long currentTimeMillis = System.currentTimeMillis();
                            if (FragmentInstrumentation.sRootViewRef.get().getViewTreeObserver().isAlive() && FragmentInstrumentation.sOnGlobalLayoutListener != null) {
                                FragmentInstrumentation.sRootViewRef.get().getViewTreeObserver().removeOnGlobalLayoutListener(FragmentInstrumentation.sOnGlobalLayoutListener);
                            }
                            FragmentInstrumentation.sOnGlobalLayoutListener = null;
                            FragmentInstrumentation.sRootViewRef = null;
                            if (FragmentInstrumentation.sWaitViewTimeoutRunnable != null) {
                                C2OH.LIZ.removeCallbacks(FragmentInstrumentation.sWaitViewTimeoutRunnable);
                            }
                            long j2 = currentTimeMillis - j;
                            if (currentTimeMillis - FragmentInstrumentation.sCheckVisibilityStartTime > 1 && j2 < FragmentInstrumentation.sMaxWaitTime) {
                                MonitorTool.reportTraceTime(FragmentInstrumentation.sFragmentName, str2, j2);
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            }
        };
        view.getViewTreeObserver().addOnGlobalLayoutListener(sOnGlobalLayoutListener);
        sWaitViewTimeoutRunnable = new Runnable() { // from class: com.bytedance.apm.agent.instrumentation.FragmentInstrumentation.2
            @Override // java.lang.Runnable
            public void run() {
                com_bytedance_apm_agent_instrumentation_FragmentInstrumentation$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_bytedance_apm_agent_instrumentation_FragmentInstrumentation$2__run$___twin___() {
                WeakReference<View> weakReference2;
                try {
                    if (FragmentInstrumentation.sOnGlobalLayoutListener != null && (weakReference2 = FragmentInstrumentation.sRootViewRef) != null && weakReference2.get() != null) {
                        FragmentInstrumentation.sRootViewRef.get().getViewTreeObserver().removeOnGlobalLayoutListener(FragmentInstrumentation.sOnGlobalLayoutListener);
                    }
                } catch (Exception unused) {
                }
            }

            public static void com_bytedance_apm_agent_instrumentation_FragmentInstrumentation$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                boolean LIZ;
                try {
                    anonymousClass2.com_bytedance_apm_agent_instrumentation_FragmentInstrumentation$2__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        };
        C2OH.LIZ.postDelayed(sWaitViewTimeoutRunnable, sMaxWaitTime);
    }
}

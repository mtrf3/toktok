package X;

import android.app.Activity;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.FoX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40101FoX {
    public static final java.util.Map<String, WeakReference<Activity>> LIZ = new LinkedHashMap();
    public static final java.util.Map<String, List<String>> LIZIZ = new LinkedHashMap();

    public static void LIZIZ(String sessionId) {
        Activity activity;
        o.LJIIIZ(sessionId, "sessionId");
        List<String> list = (List) ((LinkedHashMap) LIZIZ).get(sessionId);
        if (list != null) {
            for (String str : list) {
                LinkedHashMap linkedHashMap = (LinkedHashMap) LIZ;
                if (linkedHashMap.get(str) != null) {
                    Reference reference = (Reference) linkedHashMap.get(str);
                    if (reference != null && (activity = (Activity) reference.get()) != null) {
                        activity.finish();
                    }
                } else {
                    SparkContext.Companion.getClass();
                    InterfaceC40159FpT LIZ2 = C39359FcZ.LIZ(str);
                    if (LIZ2 instanceof SparkPopup) {
                        ((SparkPopup) LIZ2).Nl(false);
                    } else {
                        InterfaceC40159FpT LIZ3 = C39359FcZ.LIZ(str);
                        if (LIZ3 != null) {
                            LIZ3.close();
                        }
                    }
                }
            }
        }
    }

    public static String LIZLLL(String str) {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        Activity activity;
        CrossPlatformActivity crossPlatformActivity;
        LinkedHashMap linkedHashMap = (LinkedHashMap) LIZ;
        if (linkedHashMap.get(str) != null) {
            Reference reference = (Reference) linkedHashMap.get(str);
            if (reference != null) {
                activity = (Activity) reference.get();
            } else {
                activity = null;
            }
            if (!(activity instanceof CrossPlatformActivity) || (crossPlatformActivity = (CrossPlatformActivity) activity) == null) {
                return null;
            }
            return crossPlatformActivity.LLII();
        }
        SparkContext.Companion.getClass();
        InterfaceC40159FpT LIZ2 = C39359FcZ.LIZ(str);
        if (LIZ2 instanceof SparkPopup) {
            SparkContext sparkContext = ((SparkPopup) LIZ2).LJLLI;
            if (sparkContext == null) {
                return null;
            }
            return sparkContext.url;
        }
        if (LIZ2 instanceof SparkActivity) {
            SparkContext sparkContext2 = ((SparkActivity) LIZ2).LJLIL;
            if (sparkContext2 == null) {
                return null;
            }
            return sparkContext2.url;
        }
        if (!(LIZ2 instanceof SparkFragment) || (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = ((SparkFragment) LIZ2).LJLJI) == null) {
            return null;
        }
        return sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getUrl();
    }

    public static void LIZ(String sessionId, String containerId) {
        o.LJIIIZ(sessionId, "sessionId");
        o.LJIIIZ(containerId, "containerId");
        java.util.Map<String, List<String>> map = LIZIZ;
        if (!map.containsKey(sessionId)) {
            map.put(sessionId, C47261Igj.LJJIJIL(sessionId));
        }
        List list = (List) ((LinkedHashMap) map).get(sessionId);
        if (list != null) {
            list.add(containerId);
        }
    }

    public static void LIZJ(String sessionId, String containerId) {
        Activity activity;
        o.LJIIIZ(sessionId, "sessionId");
        o.LJIIIZ(containerId, "containerId");
        List<String> list = (List) ((LinkedHashMap) LIZIZ).get(sessionId);
        if (list != null) {
            for (String str : list) {
                if (!o.LJ(str, containerId)) {
                    LinkedHashMap linkedHashMap = (LinkedHashMap) LIZ;
                    if (linkedHashMap.get(str) != null) {
                        Reference reference = (Reference) linkedHashMap.get(str);
                        if (reference != null && (activity = (Activity) reference.get()) != null) {
                            activity.finish();
                        }
                    } else {
                        SparkContext.Companion.getClass();
                        InterfaceC40159FpT LIZ2 = C39359FcZ.LIZ(str);
                        if (LIZ2 instanceof SparkPopup) {
                            ((SparkPopup) LIZ2).Nl(false);
                        } else {
                            InterfaceC40159FpT LIZ3 = C39359FcZ.LIZ(str);
                            if (LIZ3 != null) {
                                LIZ3.close();
                            }
                        }
                    }
                }
            }
        }
    }
}

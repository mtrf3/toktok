package com.bytedance.lynx.hybrid.settings;

import X.C141335gf;
import X.C38262Ezy;
import X.C39836FkG;
import X.C39856Fka;
import X.C3C5;
import X.C40040FnY;
import X.C41768GaK;
import X.C78983UzD;
import X.C86858Y7a;
import X.InterfaceC86859Y7b;
import X.InterfaceC86860Y7c;
import X.OSZ;
import X.Y7O;
import X.Y7R;
import X.Y7U;
import X.Y7W;
import X.Y7X;
import android.app.Application;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public final class HybridSettings {
    public static final HybridSettings INSTANCE = new HybridSettings();
    public static final Y7W hybridSettings;
    public static final ConcurrentHashMap<String, C86858Y7a> settingsMap;

    static {
        Y7W y7w;
        ConcurrentHashMap<String, WeakReference<Y7W>> concurrentHashMap = Y7W.LJIILJJIL;
        WeakReference<Y7W> weakReference = concurrentHashMap.get("SparkContainerSpace");
        if (weakReference == null || (y7w = weakReference.get()) == null) {
            synchronized (concurrentHashMap) {
                WeakReference<Y7W> weakReference2 = concurrentHashMap.get("SparkContainerSpace");
                if (weakReference2 == null || (y7w = weakReference2.get()) == null) {
                    y7w = new Y7W();
                    concurrentHashMap.put("SparkContainerSpace", new WeakReference<>(y7w));
                }
            }
        }
        hybridSettings = y7w;
        settingsMap = new ConcurrentHashMap<>();
        y7w.LJFF.add(new Y7X());
    }

    public final void fetchOnce() {
        Y7W.LIZIZ(hybridSettings, false, 3);
    }

    public final void startFetch() {
        Y7W y7w = hybridSettings;
        if (y7w.LJI) {
            return;
        }
        y7w.LJI = true;
        y7w.LIZ(0L);
    }

    public final JSONObject get(String settingsKey) {
        o.LJIIJ(settingsKey, "settingsKey");
        try {
            return getConfig(settingsKey);
        } catch (C41768GaK unused) {
            return null;
        }
    }

    public final JSONObject getConfig(String settingsKey) {
        o.LJIIJ(settingsKey, "settingsKey");
        C86858Y7a c86858Y7a = settingsMap.get(settingsKey);
        JSONObject jSONObject = null;
        if (c86858Y7a != null) {
            synchronized (INSTANCE) {
                JSONObject jSONObject2 = c86858Y7a.LIZIZ;
                if (jSONObject2 != null) {
                    jSONObject = jSONObject2;
                } else {
                    JSONObject LIZJ = hybridSettings.LIZJ();
                    if (LIZJ != null) {
                        jSONObject = C78983UzD.LJJIIZ(settingsKey, LIZJ);
                    }
                }
                c86858Y7a.LIZIZ = jSONObject;
            }
            return jSONObject;
        }
        JSONObject LIZJ2 = hybridSettings.LIZJ();
        if (LIZJ2 == null) {
            return null;
        }
        return C78983UzD.LJJIIZ(settingsKey, LIZJ2);
    }

    public final OSZ<JSONObject, String> extractConfig(JSONObject jSONObject, String str) {
        Object LIZ;
        JSONObject LJJIIZ = C78983UzD.LJJIIZ(str, jSONObject);
        if (LJJIIZ == null) {
            LJJIIZ = new JSONObject();
            LIZ = "";
        } else {
            try {
                LIZ = JSONObjectProtectorUtils.getString(jSONObject, str);
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            if (C3C5.m12isFailureimpl(LIZ) || LIZ == null) {
                LIZ = LJJIIZ.toString();
                o.LJFF(LIZ, "result.toString()");
            }
        }
        return new OSZ<>(LJJIIZ, LIZ);
    }

    public final void registerSettings(String settingsKey, InterfaceC86859Y7b interfaceC86859Y7b) {
        o.LJIIJ(settingsKey, "settingsKey");
        settingsMap.putIfAbsent(settingsKey, new C86858Y7a(interfaceC86859Y7b));
    }

    public final void init(SettingsConfig settingsConfig, Y7R y7r, InterfaceC86860Y7c interfaceC86860Y7c) {
        Y7W y7w = hybridSettings;
        C39836FkG.LJII.getClass();
        Application context = C38262Ezy.LIZ().LIZIZ();
        y7w.getClass();
        o.LJIIJ(context, "context");
        if (!y7w.LJIIIIZZ) {
            y7w.LJIIIIZZ = true;
            if (settingsConfig == null) {
                settingsConfig = y7w.LIZJ;
            }
            y7w.LIZJ = settingsConfig;
            if (y7r == null) {
                String repoName = y7w.LJIIL;
                o.LJIIJ(repoName, "repoName");
                ConcurrentHashMap<String, WeakReference<Y7R>> concurrentHashMap = Y7R.LIZJ;
                WeakReference<Y7R> weakReference = concurrentHashMap.get(repoName);
                if (weakReference == null || (y7r = weakReference.get()) == null) {
                    synchronized (concurrentHashMap) {
                        WeakReference<Y7R> weakReference2 = concurrentHashMap.get(repoName);
                        if (weakReference2 == null || (y7r = weakReference2.get()) == null) {
                            y7r = new Y7O(repoName);
                            concurrentHashMap.put(repoName, new WeakReference<>(y7r));
                        }
                    }
                }
            }
            y7w.LIZ = y7r;
            Y7U listener = y7w.LJIIJJI;
            o.LJIIJ(listener, "listener");
            y7r.LIZ = listener;
            Y7R y7r2 = y7w.LIZ;
            if (y7r2 != null) {
                y7r2.LIZJ();
                if (interfaceC86860Y7c == null) {
                    interfaceC86860Y7c = C40040FnY.LIZIZ;
                }
                y7w.LIZIZ = interfaceC86860Y7c;
                interfaceC86860Y7c.init(context);
                y7w.LJIIIZ = true;
            } else {
                o.LJIJI("settingsData");
                throw null;
            }
        }
        registerSettings("templateResData_denyList", new C39856Fka());
    }

    public static /* synthetic */ void registerSettings$default(HybridSettings hybridSettings2, String str, InterfaceC86859Y7b interfaceC86859Y7b, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC86859Y7b = null;
        }
        hybridSettings2.registerSettings(str, interfaceC86859Y7b);
    }

    public static /* synthetic */ void init$default(HybridSettings hybridSettings2, SettingsConfig settingsConfig, Y7R y7r, InterfaceC86860Y7c interfaceC86860Y7c, int i, Object obj) {
        if ((i & 1) != 0) {
            settingsConfig = null;
        }
        if ((i & 2) != 0) {
            y7r = null;
        }
        if ((i & 4) != 0) {
            interfaceC86860Y7c = null;
        }
        hybridSettings2.init(settingsConfig, y7r, interfaceC86860Y7c);
    }
}

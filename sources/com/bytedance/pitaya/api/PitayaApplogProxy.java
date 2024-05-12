package com.bytedance.pitaya.api;

import X.C16880lQ;
import X.C38437F6r;
import X.C38439F6t;
import X.C38485F8n;
import X.PVC;
import android.content.Context;
import com.bytedance.pitaya.api.bean.PTYApplogEvent;
import com.bytedance.pitaya.api.bean.PTYApplogEventType;
import com.bytedance.pitaya.api.bean.PTYProxySetting;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes7.dex */
public final class PitayaApplogProxy implements ReflectionCall {
    public volatile C38437F6r<PTYApplogEvent> cache;
    public volatile boolean init;
    public volatile boolean stoped;
    public final String TAG = "PitayaApplogProxy";
    public final String APPLOG_CFGPATH = "/Pitaya/CFG/APPLOG_CACHE_KEY";
    public volatile Set<String> filterSet = new LinkedHashSet();

    public final int cacheSize() {
        int i;
        synchronized (this) {
            C38437F6r<PTYApplogEvent> c38437F6r = this.cache;
            if (c38437F6r != null) {
                i = c38437F6r.LIZ.size();
            } else {
                i = 0;
            }
        }
        return i;
    }

    public final String getAPPLOG_CFGPATH() {
        return this.APPLOG_CFGPATH;
    }

    public final boolean getInit() {
        return this.init;
    }

    public final String getTAG() {
        return this.TAG;
    }

    public final boolean init(PTYProxySetting setting) {
        String str;
        File LLIIJLIL;
        o.LJIIJ(setting, "setting");
        if (setting.getUseCustomApplogEvents()) {
            this.filterSet = stringToSet(setting.getCustomApplogEvents());
            if (this.filterSet.size() == 0) {
                return false;
            }
        } else {
            WeakReference<Context> weakReference = C38439F6t.LIZ;
            if (weakReference != null) {
                Context context = weakReference.get();
                if (context != null && (LLIIJLIL = C16880lQ.LLIIJLIL(context)) != null) {
                    str = LLIIJLIL.getAbsolutePath();
                } else {
                    str = null;
                }
                File file = new File(o.LJIILLIIL(this.APPLOG_CFGPATH, str));
                if (!file.exists()) {
                    this.init = true;
                    this.stoped = true;
                    return false;
                }
                try {
                    this.filterSet = stringToSet(C38485F8n.LLLFFI(file, PVC.LIZ));
                } catch (Exception unused) {
                    return false;
                }
            } else {
                throw new RuntimeException("ContextContainer null");
            }
        }
        this.cache = new C38437F6r<>(setting.getMaxApplogEventCacheNum());
        this.init = true;
        return true;
    }

    public final void setInit(boolean z) {
        this.init = z;
    }

    public final void storeCache(PTYApplogImplCallback callback) {
        o.LJIIJ(callback, "callback");
        synchronized (this) {
            this.stoped = true;
            if (cacheSize() == 0) {
                return;
            }
            C38437F6r<PTYApplogEvent> c38437F6r = this.cache;
            if (c38437F6r != null) {
                Iterator<PTYApplogEvent> it = c38437F6r.LIZ.iterator();
                o.LJFF(it, "queue.iterator()");
                while (it.hasNext()) {
                    callback.onEvent(it.next());
                }
                C38437F6r<PTYApplogEvent> c38437F6r2 = this.cache;
                if (c38437F6r2 != null) {
                    c38437F6r2.LIZ.clear();
                }
                return;
            }
            o.LJIIZILJ();
            throw null;
        }
    }

    public final Set<String> stringToSet(String str) {
        List list;
        if (str != null) {
            list = s.LJLJJL(str, new String[]{","}, 0, 6);
        } else {
            list = null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (list != null && (!list.isEmpty())) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(it.next());
            }
        }
        return linkedHashSet;
    }

    public final void onEvent(String eventName, JSONObject jSONObject) {
        String jSONObject2;
        o.LJIIJ(eventName, "eventName");
        if (this.init && this.filterSet.size() > 0 && this.filterSet.contains(eventName)) {
            synchronized (this) {
                if (this.stoped) {
                    return;
                }
                if (jSONObject != null) {
                    try {
                        jSONObject2 = jSONObject.toString();
                    } catch (Throwable unused) {
                        return;
                    }
                } else {
                    jSONObject2 = null;
                }
                C38437F6r<PTYApplogEvent> c38437F6r = this.cache;
                if (c38437F6r != null) {
                    PTYApplogEvent pTYApplogEvent = new PTYApplogEvent(eventName, jSONObject2, PTYApplogEventType.COLD_START);
                    if (c38437F6r.LIZ.size() >= c38437F6r.LIZIZ) {
                        c38437F6r.LIZ.removeFirst();
                    }
                    c38437F6r.LIZ.addLast(pTYApplogEvent);
                }
            }
        }
    }

    public final void onEvent(String eventName, String str) {
        o.LJIIJ(eventName, "eventName");
        if (this.init && this.filterSet.size() > 0 && this.filterSet.contains(eventName)) {
            synchronized (this) {
                if (this.stoped) {
                    return;
                }
                C38437F6r<PTYApplogEvent> c38437F6r = this.cache;
                if (c38437F6r != null) {
                    PTYApplogEvent pTYApplogEvent = new PTYApplogEvent(eventName, str, PTYApplogEventType.COLD_START);
                    if (c38437F6r.LIZ.size() >= c38437F6r.LIZIZ) {
                        c38437F6r.LIZ.removeFirst();
                    }
                    c38437F6r.LIZ.addLast(pTYApplogEvent);
                }
            }
        }
    }
}

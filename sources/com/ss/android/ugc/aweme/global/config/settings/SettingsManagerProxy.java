package com.ss.android.ugc.aweme.global.config.settings;

import X.C38818FLi;
import X.C38819FLj;
import X.C38820FLk;
import X.C38822FLm;
import X.DLQ;
import X.FFN;
import X.InterfaceC38821FLl;
import com.google.gson.Gson;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes7.dex */
public final class SettingsManagerProxy {
    public final C38818FLi settingManager;

    public Gson getGson() {
        return this.settingManager.LIZLLL;
    }

    public void notifySettingsChange() {
        this.settingManager.LIZ();
    }

    public SettingsManagerProxy() {
        this.settingManager = new C38818FLi();
    }

    public static SettingsManagerProxy inst() {
        return C38822FLm.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void removeSettingsWatcher(InterfaceC38821FLl interfaceC38821FLl) {
        Object remove;
        C38818FLi c38818FLi = this.settingManager;
        if (interfaceC38821FLl != null) {
            c38818FLi.getClass();
            if (((Boolean) DLQ.LIZJ.getValue()).booleanValue() && (remove = ((ConcurrentHashMap) FFN.LIZIZ).remove(interfaceC38821FLl)) != 0) {
                interfaceC38821FLl = remove;
            }
        }
        synchronized (c38818FLi.LIZ) {
            c38818FLi.LIZIZ.remove(interfaceC38821FLl);
        }
    }

    public void registerSettingsWatcher(InterfaceC38821FLl interfaceC38821FLl, boolean z) {
        C38818FLi c38818FLi = this.settingManager;
        if (interfaceC38821FLl != null) {
            c38818FLi.getClass();
            if (((Boolean) DLQ.LIZJ.getValue()).booleanValue()) {
                C38819FLj c38819FLj = new C38819FLj(interfaceC38821FLl);
                if (!z) {
                    ((ConcurrentHashMap) FFN.LIZIZ).put(interfaceC38821FLl, c38819FLj);
                }
                interfaceC38821FLl = c38819FLj;
            }
        }
        synchronized (c38818FLi.LIZ) {
            CopyOnWriteArrayList<InterfaceC38821FLl> copyOnWriteArrayList = c38818FLi.LIZIZ;
            if (z) {
                interfaceC38821FLl = new C38820FLk(interfaceC38821FLl);
            }
            copyOnWriteArrayList.add(interfaceC38821FLl);
        }
    }
}

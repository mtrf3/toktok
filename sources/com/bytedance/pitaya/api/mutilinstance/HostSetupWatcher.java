package com.bytedance.pitaya.api.mutilinstance;

import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class HostSetupWatcher implements ReflectionCall {
    public static final HostSetupWatcher INSTANCE = new HostSetupWatcher();
    public static final CopyOnWriteArrayList<HostSetupListener> listeners = new CopyOnWriteArrayList<>();
    public static final AtomicBoolean isHostSetup = new AtomicBoolean(false);

    private final void notifyAllListener() {
        CopyOnWriteArrayList<HostSetupListener> copyOnWriteArrayList = listeners;
        synchronized (copyOnWriteArrayList) {
            Iterator<HostSetupListener> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().onHostSetup(true);
            }
        }
    }

    public final boolean isHostSetup() {
        return isHostSetup.get();
    }

    public final void onHostSetup() {
        synchronized (listeners) {
            isHostSetup.set(true);
            INSTANCE.notifyAllListener();
        }
    }

    public final void registerHostSetupListener(HostSetupListener listener) {
        o.LJIIJ(listener, "listener");
        CopyOnWriteArrayList<HostSetupListener> copyOnWriteArrayList = listeners;
        synchronized (copyOnWriteArrayList) {
            if (isHostSetup.get()) {
                listener.onHostSetup(true);
            } else {
                copyOnWriteArrayList.add(listener);
            }
        }
    }

    public final void unregisterHostSetupListener(HostSetupListener listener) {
        o.LJIIJ(listener, "listener");
        CopyOnWriteArrayList<HostSetupListener> copyOnWriteArrayList = listeners;
        synchronized (copyOnWriteArrayList) {
            copyOnWriteArrayList.remove(listener);
        }
    }
}

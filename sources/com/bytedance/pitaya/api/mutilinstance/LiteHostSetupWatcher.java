package com.bytedance.pitaya.api.mutilinstance;

import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class LiteHostSetupWatcher implements ReflectionCall {
    public static final LiteHostSetupWatcher INSTANCE = new LiteHostSetupWatcher();
    public static final CopyOnWriteArrayList<LiteHostSetupListener> listeners = new CopyOnWriteArrayList<>();
    public static final AtomicBoolean isLiteHostSetup = new AtomicBoolean(false);

    private final void notifyAllListener() {
        CopyOnWriteArrayList<LiteHostSetupListener> copyOnWriteArrayList = listeners;
        synchronized (copyOnWriteArrayList) {
            Iterator<LiteHostSetupListener> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().onLiteHostSetup(true);
            }
        }
    }

    public final boolean isLiteHostSetup() {
        return isLiteHostSetup.get();
    }

    public final void onLiteHostSetup() {
        synchronized (listeners) {
            isLiteHostSetup.set(true);
            INSTANCE.notifyAllListener();
        }
    }

    public final void registerListener(LiteHostSetupListener listener) {
        o.LJIIJ(listener, "listener");
        CopyOnWriteArrayList<LiteHostSetupListener> copyOnWriteArrayList = listeners;
        synchronized (copyOnWriteArrayList) {
            if (isLiteHostSetup.get()) {
                listener.onLiteHostSetup(true);
            } else {
                copyOnWriteArrayList.add(listener);
            }
        }
    }

    public final void unregisterListener(LiteHostSetupListener listener) {
        o.LJIIJ(listener, "listener");
        CopyOnWriteArrayList<LiteHostSetupListener> copyOnWriteArrayList = listeners;
        synchronized (copyOnWriteArrayList) {
            copyOnWriteArrayList.remove(listener);
        }
    }
}

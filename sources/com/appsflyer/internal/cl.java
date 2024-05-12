package com.appsflyer.internal;

import X.V0N;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

/* loaded from: classes.dex */
public abstract class cl extends Observable {
    public long AFInAppEventParameterName;
    public final String AFInAppEventType;
    public final Runnable AFKeystoreWrapper;
    public final Map<String, Object> values = new HashMap();
    public a valueOf = a.NOT_STARTED;

    public abstract void AFKeystoreWrapper(Context context);

    public final void AFKeystoreWrapper() {
        this.values.put("source", this.AFInAppEventType);
        this.values.putAll(new ci());
        this.values.put("latency", Long.valueOf(System.currentTimeMillis() - this.AFInAppEventParameterName));
        this.valueOf = a.FINISHED;
        setChanged();
        notifyObservers();
    }

    public final void AFInAppEventType() {
        this.AFInAppEventParameterName = System.currentTimeMillis();
        this.valueOf = a.STARTED;
        addObserver(new Observer() { // from class: com.appsflyer.internal.cl.2
            @Override // java.util.Observer
            public final void update(Observable observable, Object obj) {
                cl.this.AFKeystoreWrapper.run();
            }
        });
    }

    /* loaded from: classes.dex */
    public enum a {
        NOT_STARTED,
        STARTED,
        FINISHED;

        public static a valueOf(String str) {
            return (a) V0N.LJJJ(a.class, str);
        }
    }

    public cl(String str, Runnable runnable) {
        this.AFKeystoreWrapper = runnable;
        this.AFInAppEventType = str;
    }
}

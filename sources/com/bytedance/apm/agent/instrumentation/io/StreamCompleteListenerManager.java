package com.bytedance.apm.agent.instrumentation.io;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class StreamCompleteListenerManager {
    public boolean streamComplete;
    public ArrayList<StreamCompleteListener> streamCompleteListeners = new ArrayList<>();

    private boolean checkComplete() {
        boolean isComplete;
        synchronized (this) {
            isComplete = isComplete();
            if (!isComplete) {
                this.streamComplete = true;
            }
        }
        return isComplete;
    }

    public boolean isComplete() {
        boolean z;
        synchronized (this) {
            z = this.streamComplete;
        }
        return z;
    }

    private List<StreamCompleteListener> getStreamCompleteListeners() {
        ArrayList arrayList;
        synchronized (this.streamCompleteListeners) {
            arrayList = new ArrayList(this.streamCompleteListeners);
            this.streamCompleteListeners.clear();
        }
        return arrayList;
    }

    public void addStreamCompleteListener(StreamCompleteListener streamCompleteListener) {
        synchronized (this.streamCompleteListeners) {
            this.streamCompleteListeners.add(streamCompleteListener);
        }
    }

    public void notifyStreamComplete(StreamCompleteEvent streamCompleteEvent) {
        if (!checkComplete()) {
            Iterator<StreamCompleteListener> it = getStreamCompleteListeners().iterator();
            while (it.hasNext()) {
                it.next().streamComplete(streamCompleteEvent);
            }
        }
    }

    public void notifyStreamError(StreamCompleteEvent streamCompleteEvent) {
        if (!checkComplete()) {
            Iterator<StreamCompleteListener> it = getStreamCompleteListeners().iterator();
            while (it.hasNext()) {
                it.next().streamError(streamCompleteEvent);
            }
        }
    }

    public void removeStreamCompleteListener(StreamCompleteListener streamCompleteListener) {
        synchronized (this.streamCompleteListeners) {
            this.streamCompleteListeners.remove(streamCompleteListener);
        }
    }
}

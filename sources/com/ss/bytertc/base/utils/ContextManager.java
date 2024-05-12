package com.ss.bytertc.base.utils;

import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes33.dex */
public class ContextManager {
    public WeakReference<Context> mContextWeakReference;

    /* loaded from: classes33.dex */
    public static class SingletonHelper {
        public static final ContextManager INSTANCE = new ContextManager();
    }

    public Context getContext() {
        WeakReference<Context> weakReference = this.mContextWeakReference;
        if (weakReference != null && weakReference.get() != null) {
            return this.mContextWeakReference.get();
        }
        return null;
    }

    public static ContextManager instance() {
        return SingletonHelper.INSTANCE;
    }

    public void setContext(Context context) {
        if (this.mContextWeakReference != null) {
            this.mContextWeakReference = null;
        }
        this.mContextWeakReference = new WeakReference<>(context);
    }
}

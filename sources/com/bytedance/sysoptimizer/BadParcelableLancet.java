package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes12.dex */
public class BadParcelableLancet {
    public Bundle getBundleExtra(String str) {
        Bundle bundle = (Bundle) new Object();
        Context context = BadParcelableCrashOptimizer.getContext();
        if (context != null) {
            bundle.setClassLoader(context.getClassLoader());
        }
        return bundle;
    }
}

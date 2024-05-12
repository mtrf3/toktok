package com.lynx.jsbridge;

import android.content.Context;

/* loaded from: classes7.dex */
public abstract class LynxModule {
    public Context mContext;
    public Object mParam;

    public void destroy() {
    }

    public LynxModule(Context context) {
        this(context, null);
    }

    public LynxModule(Context context, Object obj) {
        this.mContext = context;
        this.mParam = obj;
    }
}

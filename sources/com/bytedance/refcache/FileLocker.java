package com.bytedance.refcache;

import X.C16880lQ;

/* loaded from: classes12.dex */
public class FileLocker {
    public static native int getStatus(String str);

    static {
        C16880lQ.LLJJJIL("flock-lib");
    }
}

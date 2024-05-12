package com.ss.android.ugc.aweme.services;

import defpackage.e1;

/* loaded from: classes8.dex */
public final class NewPublishServiceLock {
    public static final NewPublishServiceLock INSTANCE = new NewPublishServiceLock();
    public static final boolean DEFAULT = true;

    public final boolean isEnable() {
        return e1.LIZ(31744, "replace_get_publish_service_instance_lock", true, true);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}

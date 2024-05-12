package com.ss.android.ugc.effectmanager.common.utils;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes16.dex */
public final class TaskUtil {
    public static final TaskUtil INSTANCE = new TaskUtil();
    public static final AtomicLong id = new AtomicLong(0);

    public final String generateTaskId() {
        return String.valueOf(id.incrementAndGet());
    }
}

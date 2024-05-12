package com.ss.android.ugc.aweme.services;

import com.ss.android.ugc.aweme.feedback.runtime.behavior.RuntimeBehaviorServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class RuntimeBehaviorServiceDiff {
    public static final RuntimeBehaviorServiceDiff INSTANCE = new RuntimeBehaviorServiceDiff();

    public final void event(String type) {
        o.LJIIIZ(type, "type");
        RuntimeBehaviorServiceImpl.LJ().LIZ(type);
    }

    public final void event(String type, String msg) {
        o.LJIIIZ(type, "type");
        o.LJIIIZ(msg, "msg");
        RuntimeBehaviorServiceImpl.LJ().event(type, msg);
    }
}

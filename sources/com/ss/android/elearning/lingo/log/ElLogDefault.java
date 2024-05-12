package com.ss.android.elearning.lingo.log;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ElLogDefault implements ElLogService {
    @Override // com.ss.android.elearning.lingo.log.ElLogService
    public final void LIZ(LogLevel level, String str, String msg) {
        o.LJIIIZ(level, "level");
        o.LJIIIZ(msg, "msg");
    }
}

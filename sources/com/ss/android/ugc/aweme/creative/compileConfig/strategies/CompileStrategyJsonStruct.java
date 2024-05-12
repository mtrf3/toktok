package com.ss.android.ugc.aweme.creative.compileConfig.strategies;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class CompileStrategyJsonStruct {

    @InterfaceC65349Pkn("key")
    public final String key;

    @InterfaceC65349Pkn("priority")
    public final int priority;

    /* JADX WARN: Multi-variable type inference failed */
    public CompileStrategyJsonStruct() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public CompileStrategyJsonStruct(String key, int i) {
        o.LJIIIZ(key, "key");
        this.key = key;
        this.priority = i;
    }

    public /* synthetic */ CompileStrategyJsonStruct(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "default" : str, (i2 & 2) != 0 ? LiveLayoutPreloadThreadPriority.DEFAULT : i);
    }
}

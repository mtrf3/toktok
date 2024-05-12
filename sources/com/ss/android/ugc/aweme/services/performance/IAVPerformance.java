package com.ss.android.ugc.aweme.services.performance;

import X.InterfaceC65784Pro;
import android.content.Context;
import com.ss.android.ugc.aweme.performance.PerformanceMonitor;
import java.util.Map;

/* loaded from: classes16.dex */
public interface IAVPerformance {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes16.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
    }

    void end(PerformanceMonitor performanceMonitor, String str);

    void end(PerformanceMonitor performanceMonitor, String str, long j);

    void end(String str, String str2);

    void end(String str, String str2, long j);

    void enter(Context context, String str);

    void leave(Context context, String str);

    void pause(Context context, String str, String str2, String str3);

    void pause(Context context, String str, String str2, String str3, String str4, Map<String, String> map);

    void recordPerformanceLog(String str, InterfaceC65784Pro<? extends Map<String, String>> interfaceC65784Pro);

    void start(PerformanceMonitor performanceMonitor, String str);

    void start(String str, String str2);

    void startPerformanceMonitor(String str, int i, long j);

    void step(PerformanceMonitor performanceMonitor, String str);

    void step(String str, String str2);

    void stopPerformanceMonitor(String str);

    /* loaded from: classes16.dex */
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void pause$default(IAVPerformance iAVPerformance, Context context, String str, String str2, String str3, String str4, Map map, int i, Object obj) {
            if (obj == null) {
                if ((i & 32) != 0) {
                    map = null;
                }
                iAVPerformance.pause(context, str, str2, str3, str4, map);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pause");
        }
    }
}

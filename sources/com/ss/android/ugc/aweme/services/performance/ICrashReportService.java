package com.ss.android.ugc.aweme.services.performance;

/* loaded from: classes7.dex */
public interface ICrashReportService {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes7.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
    }

    void addCrashCustomTagListener(ICrashCustomTagListener iCrashCustomTagListener);

    void report(int i);

    void setCustomTag(String str, String str2);
}

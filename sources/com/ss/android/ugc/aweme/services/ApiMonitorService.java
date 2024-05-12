package com.ss.android.ugc.aweme.services;

import X.C221108m2;
import X.C5H3;
import X.EnumC221088m0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class ApiMonitorService extends AbsApiMonitorService {
    public static final Companion Companion = new Companion();
    public static final C5H3<ApiMonitorService> instance$delegate = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, ApiMonitorService$Companion$instance$2.INSTANCE);

    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ApiMonitorService getInstance() {
            return ApiMonitorService.instance$delegate.getValue();
        }

        public Companion() {
        }
    }

    public /* synthetic */ ApiMonitorService(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public ApiMonitorService() {
    }
}

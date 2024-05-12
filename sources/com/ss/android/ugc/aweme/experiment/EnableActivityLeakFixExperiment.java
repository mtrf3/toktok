package com.ss.android.ugc.aweme.experiment;

import X.InterfaceC65349Pkn;
import defpackage.i0;

/* loaded from: classes10.dex */
public final class EnableActivityLeakFixExperiment {
    public static final ActivityLeakFixParam LIZ = (ActivityLeakFixParam) i0.LJ(true, "activity_leak_fix_v3", 31744, ActivityLeakFixParam.class, null);

    /* loaded from: classes12.dex */
    public static class ActivityLeakFixParam {

        @InterfaceC65349Pkn("clear_leak_object_field")
        public boolean clearLeakObjectField;

        @InterfaceC65349Pkn("clear_non_primitive_data_types_of_leak_object")
        public boolean clearNonPrimitiveDataTypesOfLeakObject;

        @InterfaceC65349Pkn("clear_webview")
        public boolean clearWebview;

        @InterfaceC65349Pkn("enable")
        public boolean enable;

        @InterfaceC65349Pkn("repair_leak_fragment")
        public boolean repairLeakFragment;

        @InterfaceC65349Pkn("repair_sub_fragment_of_leak_activity")
        public boolean repairSubFragmentOfLeakActivity;

        @InterfaceC65349Pkn("set_view_to_null")
        public boolean setViewToNull;

        @InterfaceC65349Pkn("min_check_interval")
        public long minCheckInterval = 60000;

        @InterfaceC65349Pkn("max_held_time")
        public long maxHeldTime = 30000;
    }
}

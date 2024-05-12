package com.ss.android.ugc.aweme.ecommerce.showcase.ab;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class StoreLivePlayAB {
    public static final /* synthetic */ int LIZ = 0;

    /* loaded from: classes10.dex */
    public static final class StoreLivePlayConfig {

        @InterfaceC65349Pkn("block_sources")
        public final String[] blockSources;

        @InterfaceC65349Pkn("close_minutes")
        public final int closeMinutes;

        /* JADX WARN: Multi-variable type inference failed */
        public StoreLivePlayConfig() {
            this(0, null, 3, 0 == true ? 1 : 0);
        }

        public StoreLivePlayConfig(int i, String[] blockSources) {
            o.LJIIIZ(blockSources, "blockSources");
            this.closeMinutes = i;
            this.blockSources = blockSources;
        }

        public /* synthetic */ StoreLivePlayConfig(int i, String[] strArr, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? new String[0] : strArr);
        }
    }
}

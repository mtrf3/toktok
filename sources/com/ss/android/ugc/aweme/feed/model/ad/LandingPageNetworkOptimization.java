package com.ss.android.ugc.aweme.feed.model.ad;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class LandingPageNetworkOptimization implements Serializable {
    public static final Companion Companion = new Companion();

    @InterfaceC65349Pkn("network_optimization_type")
    public final int networkOptimization;

    public LandingPageNetworkOptimization() {
        this(0, 1, null);
    }

    /* loaded from: classes11.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public final int getNetworkOptimization() {
        return this.networkOptimization;
    }

    public LandingPageNetworkOptimization(int i) {
        this.networkOptimization = i;
    }

    public /* synthetic */ LandingPageNetworkOptimization(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}

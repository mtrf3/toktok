package com.ss.android.ugc.aweme.im.sdk.chatlist.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class DMAvatarLoadConfig extends F9E {

    @InterfaceC65349Pkn("event_sample_rate")
    public final int eventSampleRate;

    @InterfaceC65349Pkn("log_sample_rate")
    public final int logSampleRate;

    @InterfaceC65349Pkn("use_empty_placeholder")
    public final boolean useEmptyPlaceholder;

    @InterfaceC65349Pkn("use_strict_uri")
    public final boolean useStrictUri;

    /* JADX WARN: Multi-variable type inference failed */
    public DMAvatarLoadConfig() {
        this(0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.eventSampleRate), Integer.valueOf(this.logSampleRate), Boolean.valueOf(this.useStrictUri), Boolean.valueOf(this.useEmptyPlaceholder)};
    }

    public DMAvatarLoadConfig(int i, int i2, boolean z, boolean z2) {
        this.eventSampleRate = i;
        this.logSampleRate = i2;
        this.useStrictUri = z;
        this.useEmptyPlaceholder = z2;
    }

    public /* synthetic */ DMAvatarLoadConfig(int i, int i2, boolean z, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 5 : i, (i3 & 2) != 0 ? 5 : i2, (i3 & 4) != 0 ? false : z, (i3 & 8) != 0 ? false : z2);
    }
}

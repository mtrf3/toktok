package com.ss.android.ugc.gamora.editor.lightening.canvas.forward.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.google.android.gms.common.ConnectionResult;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class ForwardStreamEditSettingConfig extends F9E {

    @InterfaceC65349Pkn("default_buffer_capacity")
    public final int defaultBufferCapacity;

    @InterfaceC65349Pkn("enable_reuse_player_partial_cache")
    public final boolean enableReusePlayerPartialCache;

    @InterfaceC65349Pkn("enable_stream_edit")
    public final boolean enableStreamEdit;

    @InterfaceC65349Pkn("max_buffer_capacity")
    public final int maxBufferCapacity;

    /* JADX WARN: Multi-variable type inference failed */
    public ForwardStreamEditSettingConfig() {
        this(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enableStreamEdit), Boolean.valueOf(this.enableReusePlayerPartialCache), Integer.valueOf(this.defaultBufferCapacity), Integer.valueOf(this.maxBufferCapacity)};
    }

    public ForwardStreamEditSettingConfig(boolean z, boolean z2, int i, int i2) {
        this.enableStreamEdit = z;
        this.enableReusePlayerPartialCache = z2;
        this.defaultBufferCapacity = i;
        this.maxBufferCapacity = i2;
    }

    public /* synthetic */ ForwardStreamEditSettingConfig(boolean z, boolean z2, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? false : z2, (i3 & 4) != 0 ? ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED : i, (i3 & 8) != 0 ? 7000 : i2);
    }
}

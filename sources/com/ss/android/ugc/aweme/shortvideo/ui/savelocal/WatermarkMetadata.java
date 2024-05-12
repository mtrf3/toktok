package com.ss.android.ugc.aweme.shortvideo.ui.savelocal;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class WatermarkMetadata extends F9E {

    @InterfaceC65349Pkn("creation_id")
    public final String creationId;

    @InterfaceC65349Pkn("is_image_mode")
    public final boolean isImageMode;

    /* JADX WARN: Multi-variable type inference failed */
    public WatermarkMetadata() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.isImageMode), this.creationId};
    }

    public WatermarkMetadata(boolean z, String creationId) {
        o.LJIIIZ(creationId, "creationId");
        this.isImageMode = z;
        this.creationId = creationId;
    }

    public /* synthetic */ WatermarkMetadata(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str);
    }
}

package com.ss.android.ugc.aweme;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class TryMode extends F9E {

    @InterfaceC65349Pkn("enable_live_video")
    public boolean enableLiveVideo;

    @InterfaceC65349Pkn("has_created_room")
    public int hasCreatedRoom;

    @InterfaceC65349Pkn("live_video_group")
    public int newAnchorMode;

    /* JADX WARN: Multi-variable type inference failed */
    public TryMode() {
        this(0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.hasCreatedRoom), Boolean.valueOf(this.enableLiveVideo), Integer.valueOf(this.newAnchorMode)};
    }

    public TryMode(int i, boolean z, int i2) {
        this.hasCreatedRoom = i;
        this.enableLiveVideo = z;
        this.newAnchorMode = i2;
    }

    public /* synthetic */ TryMode(int i, boolean z, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 1 : i, (i3 & 2) != 0 ? true : z, (i3 & 4) != 0 ? 1 : i2);
    }
}

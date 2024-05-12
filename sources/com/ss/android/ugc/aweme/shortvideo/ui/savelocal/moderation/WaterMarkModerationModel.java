package com.ss.android.ugc.aweme.shortvideo.ui.savelocal.moderation;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class WaterMarkModerationModel extends F9E {

    @InterfaceC65349Pkn("vframe_uri")
    public final String vFrameUri;

    /* JADX WARN: Multi-variable type inference failed */
    public WaterMarkModerationModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ WaterMarkModerationModel copy$default(WaterMarkModerationModel waterMarkModerationModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = waterMarkModerationModel.vFrameUri;
        }
        return waterMarkModerationModel.copy(str);
    }

    public final WaterMarkModerationModel copy(String vFrameUri) {
        o.LJIIIZ(vFrameUri, "vFrameUri");
        return new WaterMarkModerationModel(vFrameUri);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.vFrameUri};
    }

    public final String getVFrameUri() {
        return this.vFrameUri;
    }

    public WaterMarkModerationModel(String vFrameUri) {
        o.LJIIIZ(vFrameUri, "vFrameUri");
        this.vFrameUri = vFrameUri;
    }

    public /* synthetic */ WaterMarkModerationModel(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}

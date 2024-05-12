package com.bytedance.android.live.publicscreen.impl.api.model;

import X.C16880lQ;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import com.bytedance.android.livesdk.chatroom.model.MGetTranslationRequest;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class AutoTranslateParams {

    @InterfaceC65349Pkn("anchor_id")
    public final long anchorId;

    @InterfaceC65349Pkn("room_id")
    public final long roomId;

    @InterfaceC65349Pkn("sec_anchor_id")
    public final String secAnchorId;

    @InterfaceC65349Pkn("texts")
    public final MGetTranslationRequest.Text[] texts;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoTranslateParams)) {
            return false;
        }
        AutoTranslateParams autoTranslateParams = (AutoTranslateParams) obj;
        return this.roomId == autoTranslateParams.roomId && this.anchorId == autoTranslateParams.anchorId && o.LJ(this.secAnchorId, autoTranslateParams.secAnchorId) && o.LJ(this.texts, autoTranslateParams.texts);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AutoTranslateParams(roomId=");
        LIZ.append(this.roomId);
        LIZ.append(", anchorId=");
        LIZ.append(this.anchorId);
        LIZ.append(", secAnchorId=");
        LIZ.append(this.secAnchorId);
        LIZ.append(", texts=");
        LIZ.append(Arrays.toString(this.texts));
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.texts) + C79062V1e.LJ(this.secAnchorId, JBR.LIZJ(this.anchorId, C16880lQ.LLJIJIL(this.roomId) * 31, 31), 31);
    }

    public AutoTranslateParams(long j, long j2, String secAnchorId, MGetTranslationRequest.Text[] texts) {
        o.LJIIIZ(secAnchorId, "secAnchorId");
        o.LJIIIZ(texts, "texts");
        this.roomId = j;
        this.anchorId = j2;
        this.secAnchorId = secAnchorId;
        this.texts = texts;
    }
}

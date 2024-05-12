package com.ss.android.ugc.aweme.story.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import defpackage.s0;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SwitchToStoryResponse extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("aweme")
    public Aweme aweme;

    @InterfaceC65349Pkn("visibility_action")
    public Integer visibilityAction;

    /* JADX WARN: Multi-variable type inference failed */
    public SwitchToStoryResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SwitchToStoryResponse copy$default(SwitchToStoryResponse switchToStoryResponse, Aweme aweme, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            aweme = switchToStoryResponse.aweme;
        }
        if ((i & 2) != 0) {
            num = switchToStoryResponse.visibilityAction;
        }
        return switchToStoryResponse.copy(aweme, num);
    }

    public final SwitchToStoryResponse copy(Aweme aweme, Integer num) {
        return new SwitchToStoryResponse(aweme, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SwitchToStoryResponse)) {
            return false;
        }
        SwitchToStoryResponse switchToStoryResponse = (SwitchToStoryResponse) obj;
        return o.LJ(this.aweme, switchToStoryResponse.aweme) && o.LJ(this.visibilityAction, switchToStoryResponse.visibilityAction);
    }

    public int hashCode() {
        Aweme aweme = this.aweme;
        int hashCode = (aweme == null ? 0 : aweme.hashCode()) * 31;
        Integer num = this.visibilityAction;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SwitchToStoryResponse(aweme=");
        LIZ.append(this.aweme);
        LIZ.append(", visibilityAction=");
        return s0.LIZJ(LIZ, this.visibilityAction, ')', LIZ);
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final Integer getVisibilityAction() {
        return this.visibilityAction;
    }

    public final void setAweme(Aweme aweme) {
        this.aweme = aweme;
    }

    public final void setVisibilityAction(Integer num) {
        this.visibilityAction = num;
    }

    public SwitchToStoryResponse(Aweme aweme, Integer num) {
        this.aweme = aweme;
        this.visibilityAction = num;
    }

    public /* synthetic */ SwitchToStoryResponse(Aweme aweme, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : aweme, (i & 2) != 0 ? null : num);
    }
}

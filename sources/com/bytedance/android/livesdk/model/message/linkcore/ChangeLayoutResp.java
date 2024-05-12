package com.bytedance.android.livesdk.model.message.linkcore;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class ChangeLayoutResp extends LinkMicUplinkBaseResp {

    @InterfaceC65349Pkn("user_pos")
    public List<UserPosition> userPosition;

    /* JADX WARN: Multi-variable type inference failed */
    public ChangeLayoutResp() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final int hashCode() {
        return Objects.hash(this.userPosition);
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("ChangeLayoutResp:%s", this.userPosition);
    }

    public ChangeLayoutResp(List<UserPosition> list) {
        super(null, 1, null);
        this.userPosition = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeLayoutResp)) {
            return false;
        }
        return C78966Uyw.LJIIIZ(new Object[]{((ChangeLayoutResp) obj).userPosition}, new Object[]{this.userPosition});
    }

    public /* synthetic */ ChangeLayoutResp(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}

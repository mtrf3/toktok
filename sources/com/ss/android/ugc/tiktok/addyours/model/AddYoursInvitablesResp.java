package com.ss.android.ugc.tiktok.addyours.model;

import X.C61878OQg;
import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class AddYoursInvitablesResp extends BaseResponse {

    @InterfaceC65349Pkn("cursor")
    public final long cursor;

    @InterfaceC65349Pkn("has_more")
    public final boolean hasMore;

    @InterfaceC65349Pkn("invitables")
    public final List<User> invitables;

    public AddYoursInvitablesResp() {
        this(0L, false, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AddYoursInvitablesResp) {
            return C78966Uyw.LJIIIZ(((AddYoursInvitablesResp) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.cursor), Boolean.valueOf(this.hasMore), this.invitables};
    }

    public final int hashCode() {
        return Objects.hash(getObjects());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return C78966Uyw.LJJJLL("AddYoursInvitablesResp:%s,%s,%s", getObjects());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AddYoursInvitablesResp(long j, boolean z, List<? extends User> invitables) {
        o.LJIIIZ(invitables, "invitables");
        this.cursor = j;
        this.hasMore = z;
        this.invitables = invitables;
    }

    public AddYoursInvitablesResp(long j, boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? false : z, (i & 4) != 0 ? C61878OQg.INSTANCE : list);
    }
}

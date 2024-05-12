package com.ss.android.ugc.aweme.aigc;

import X.AbstractC36908Ee8;
import X.AnonymousClass391;
import X.InterfaceC195777mH;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ResponseGetAvatars extends AbstractC36908Ee8 {

    @InterfaceC65349Pkn("avatar_urls")
    public final List<String> avatarUrls;

    @InterfaceC195777mH
    @InterfaceC65349Pkn("status_code")
    public final int status_code;

    @InterfaceC65349Pkn("status_msg")
    public final String status_msg;

    @InterfaceC65349Pkn("next_index")
    public final Long taskId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponseGetAvatars)) {
            return false;
        }
        ResponseGetAvatars responseGetAvatars = (ResponseGetAvatars) obj;
        return this.status_code == responseGetAvatars.status_code && o.LJ(this.status_msg, responseGetAvatars.status_msg) && o.LJ(this.avatarUrls, responseGetAvatars.avatarUrls) && o.LJ(this.taskId, responseGetAvatars.taskId);
    }

    public final int hashCode() {
        int hashCode;
        int i = this.status_code * 31;
        String str = this.status_msg;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int LIZIZ = AnonymousClass391.LIZIZ(this.avatarUrls, (i + hashCode) * 31, 31);
        Long l = this.taskId;
        if (l != null) {
            i2 = l.hashCode();
        }
        return LIZIZ + i2;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ResponseGetAvatars(status_code=");
        LIZ.append(this.status_code);
        LIZ.append(", status_msg=");
        LIZ.append(this.status_msg);
        LIZ.append(", avatarUrls=");
        LIZ.append(this.avatarUrls);
        LIZ.append(", taskId=");
        return JBR.LJ(LIZ, this.taskId, ')', LIZ);
    }

    public ResponseGetAvatars(int i, String str, List<String> avatarUrls, Long l) {
        o.LJIIIZ(avatarUrls, "avatarUrls");
        this.status_code = i;
        this.status_msg = str;
        this.avatarUrls = avatarUrls;
        this.taskId = l;
    }

    public /* synthetic */ ResponseGetAvatars(int i, String str, List list, Long l, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str, list, l);
    }
}

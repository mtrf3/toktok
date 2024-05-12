package com.ss.android.ugc.aweme.panel.model;

import X.C31461Li;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class UserForPanel {

    @InterfaceC65349Pkn("avatar_thumb")
    public final UrlModel avatarThumb;

    @InterfaceC65349Pkn("uid")
    public final String commentUserId;

    @InterfaceC65349Pkn("unique_id")
    public final String userName;

    /* JADX WARN: Multi-variable type inference failed */
    public UserForPanel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserForPanel)) {
            return false;
        }
        UserForPanel userForPanel = (UserForPanel) obj;
        return o.LJ(this.commentUserId, userForPanel.commentUserId) && o.LJ(this.userName, userForPanel.userName) && o.LJ(this.avatarThumb, userForPanel.avatarThumb);
    }

    public final int hashCode() {
        String str = this.commentUserId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.userName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        UrlModel urlModel = this.avatarThumb;
        return hashCode2 + (urlModel != null ? urlModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserForPanel(commentUserId=");
        LIZ.append(this.commentUserId);
        LIZ.append(", userName=");
        LIZ.append(this.userName);
        LIZ.append(", avatarThumb=");
        return C31461Li.LIZLLL(LIZ, this.avatarThumb, ')', LIZ);
    }

    public UserForPanel(String str, String str2, UrlModel urlModel) {
        this.commentUserId = str;
        this.userName = str2;
        this.avatarThumb = urlModel;
    }

    public /* synthetic */ UserForPanel(String str, String str2, UrlModel urlModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : urlModel);
    }
}

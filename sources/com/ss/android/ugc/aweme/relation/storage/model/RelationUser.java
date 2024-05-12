package com.ss.android.ugc.aweme.relation.storage.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;

/* loaded from: classes2.dex */
public final class RelationUser extends User {

    @InterfaceC65349Pkn("avatar_168x168")
    public UrlModel avatar168;

    @InterfaceC65349Pkn("avatar_300x300")
    public UrlModel avatar300;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RelationUser(uid: ");
        LIZ.append(getUid());
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final UrlModel getAvatar168() {
        return this.avatar168;
    }

    public final UrlModel getAvatar300() {
        return this.avatar300;
    }

    public final void setAvatar168(UrlModel urlModel) {
        this.avatar168 = urlModel;
    }

    public final void setAvatar300(UrlModel urlModel) {
        this.avatar300 = urlModel;
    }
}

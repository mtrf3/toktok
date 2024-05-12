package com.ss.android.ugc.aweme.relation.model;

import X.AbstractC57378MfW;
import X.C16880lQ;
import X.C57377MfV;
import X.InterfaceC57927MoN;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class RecUser extends User implements InterfaceC57927MoN {
    public int LJLIL;
    public AbstractC57378MfW LJLILLLLZI;
    public boolean LJLJI;

    @InterfaceC65349Pkn("avatar_168x168")
    public UrlModel avatar168;

    @InterfaceC65349Pkn("avatar_300x300")
    public UrlModel avatar300;

    public RecUser() {
        this(0, 1, null);
    }

    public final boolean isRelatedRec() {
        return this.LJLILLLLZI instanceof C57377MfV;
    }

    @Override // X.InterfaceC57927MoN
    public String getElementId() {
        String uid = getUid();
        if (uid == null) {
            return "";
        }
        return uid;
    }

    @Override // com.ss.android.ugc.aweme.profile.model.User
    public int hashCode() {
        return C16880lQ.LLJILJIL(isRemoved()) + getUid().hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[RecUser(");
        LIZ.append(getNickname());
        LIZ.append(", uid: ");
        LIZ.append(getUid());
        LIZ.append(")]");
        return X1D.LIZIZ(LIZ);
    }

    public final UrlModel getAvatar168() {
        return this.avatar168;
    }

    public final UrlModel getAvatar300() {
        return this.avatar300;
    }

    public final AbstractC57378MfW getFrom() {
        return this.LJLILLLLZI;
    }

    public final int getImprOrder() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC57927MoN
    public boolean isRemoved() {
        return this.LJLJI;
    }

    public RecUser(int i) {
        this.LJLIL = i;
    }

    @Override // com.ss.android.ugc.aweme.profile.model.User
    public boolean equals(Object obj) {
        if (!(obj instanceof RecUser)) {
            return false;
        }
        RecUser recUser = (RecUser) obj;
        if (!o.LJ(recUser.getUid(), getUid()) || recUser.isRemoved() != isRemoved()) {
            return false;
        }
        return true;
    }

    public final void setAvatar168(UrlModel urlModel) {
        this.avatar168 = urlModel;
    }

    public final void setAvatar300(UrlModel urlModel) {
        this.avatar300 = urlModel;
    }

    public final void setFrom(AbstractC57378MfW abstractC57378MfW) {
        this.LJLILLLLZI = abstractC57378MfW;
    }

    public final void setImprOrder(int i) {
        this.LJLIL = i;
    }

    @Override // X.InterfaceC57927MoN
    public void setRemoved(boolean z) {
        this.LJLJI = z;
    }

    public /* synthetic */ RecUser(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i);
    }
}

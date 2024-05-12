package com.ss.android.ugc.aweme.contact.model;

import X.C31461Li;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class Avatars {

    @InterfaceC65349Pkn("avatar_medium")
    public final UrlModel avatarMedium;

    @InterfaceC65349Pkn("avatar_small")
    public final UrlModel avatarThumb;

    /* JADX WARN: Multi-variable type inference failed */
    public Avatars() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Avatars)) {
            return false;
        }
        Avatars avatars = (Avatars) obj;
        return o.LJ(this.avatarThumb, avatars.avatarThumb) && o.LJ(this.avatarMedium, avatars.avatarMedium);
    }

    public final int hashCode() {
        UrlModel urlModel = this.avatarThumb;
        int hashCode = (urlModel == null ? 0 : urlModel.hashCode()) * 31;
        UrlModel urlModel2 = this.avatarMedium;
        return hashCode + (urlModel2 != null ? urlModel2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Avatars(avatarThumb=");
        LIZ.append(this.avatarThumb);
        LIZ.append(", avatarMedium=");
        return C31461Li.LIZLLL(LIZ, this.avatarMedium, ')', LIZ);
    }

    public Avatars(UrlModel urlModel, UrlModel urlModel2) {
        this.avatarThumb = urlModel;
        this.avatarMedium = urlModel2;
    }

    public /* synthetic */ Avatars(UrlModel urlModel, UrlModel urlModel2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : urlModel, (i & 2) != 0 ? null : urlModel2);
    }
}

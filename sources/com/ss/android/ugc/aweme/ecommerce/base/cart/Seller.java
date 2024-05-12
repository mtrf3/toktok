package com.ss.android.ugc.aweme.ecommerce.base.cart;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class Seller {

    @InterfaceC65349Pkn("avatar")
    public final Image avatar;

    public static /* synthetic */ Seller copy$default(Seller seller, Image image, int i, Object obj) {
        if ((i & 1) != 0) {
            image = seller.avatar;
        }
        return seller.copy(image);
    }

    public final Seller copy(Image image) {
        return new Seller(image);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Seller) && o.LJ(this.avatar, ((Seller) obj).avatar);
    }

    public int hashCode() {
        Image image = this.avatar;
        if (image == null) {
            return 0;
        }
        return image.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Seller(avatar=");
        LIZ.append(this.avatar);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final Image getAvatar() {
        return this.avatar;
    }

    public Seller(Image image) {
        this.avatar = image;
    }
}

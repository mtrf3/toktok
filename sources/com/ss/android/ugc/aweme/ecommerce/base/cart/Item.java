package com.ss.android.ugc.aweme.ecommerce.base.cart;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class Item {

    @InterfaceC65349Pkn("image")
    public final Image image;

    public static /* synthetic */ Item copy$default(Item item, Image image, int i, Object obj) {
        if ((i & 1) != 0) {
            image = item.image;
        }
        return item.copy(image);
    }

    public final Item copy(Image image) {
        return new Item(image);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Item) && o.LJ(this.image, ((Item) obj).image);
    }

    public int hashCode() {
        Image image = this.image;
        if (image == null) {
            return 0;
        }
        return image.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Item(image=");
        LIZ.append(this.image);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final Image getImage() {
        return this.image;
    }

    public Item(Image image) {
        this.image = image;
    }
}

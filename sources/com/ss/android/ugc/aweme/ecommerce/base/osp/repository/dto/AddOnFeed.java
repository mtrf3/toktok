package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class AddOnFeed implements Serializable {

    @InterfaceC65349Pkn("id")
    public final String id;

    @InterfaceC65349Pkn("type")
    public final int type;

    public static /* synthetic */ AddOnFeed copy$default(AddOnFeed addOnFeed, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = addOnFeed.id;
        }
        if ((i2 & 2) != 0) {
            i = addOnFeed.type;
        }
        return addOnFeed.copy(str, i);
    }

    public final AddOnFeed copy(String str, int i) {
        return new AddOnFeed(str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddOnFeed)) {
            return false;
        }
        AddOnFeed addOnFeed = (AddOnFeed) obj;
        return o.LJ(this.id, addOnFeed.id) && this.type == addOnFeed.type;
    }

    public int hashCode() {
        String str = this.id;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.type;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddOnFeed(id=");
        LIZ.append(this.id);
        LIZ.append(", type=");
        return b0.LIZJ(LIZ, this.type, ')', LIZ);
    }

    public final String getId() {
        return this.id;
    }

    public final int getType() {
        return this.type;
    }

    public AddOnFeed(String str, int i) {
        this.id = str;
        this.type = i;
    }
}

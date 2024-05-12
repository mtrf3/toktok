package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class Photos {

    @InterfaceC65349Pkn("dark_photos")
    public final List<String> darkPhotos;

    @InterfaceC65349Pkn("photos")
    public final List<String> lightPhotos;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Photos)) {
            return false;
        }
        Photos photos = (Photos) obj;
        return o.LJ(this.lightPhotos, photos.lightPhotos) && o.LJ(this.darkPhotos, photos.darkPhotos);
    }

    public final int hashCode() {
        List<String> list = this.lightPhotos;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.darkPhotos;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Photos(lightPhotos=");
        LIZ.append(this.lightPhotos);
        LIZ.append(", darkPhotos=");
        return C1NE.LIZIZ(LIZ, this.darkPhotos, ')', LIZ);
    }

    public Photos(List<String> list, List<String> list2) {
        this.lightPhotos = list;
        this.darkPhotos = list2;
    }
}

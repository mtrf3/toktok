package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C1NE;
import X.C27620Asi;
import X.C279017q;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class DescDetailV2 implements Parcelable {
    public static final Parcelable.Creator<DescDetailV2> CREATOR = new C27620Asi();

    @InterfaceC65349Pkn("rich_blocks")
    public final List<RichBlock> richBlocks;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DescDetailV2) && o.LJ(this.richBlocks, ((DescDetailV2) obj).richBlocks);
    }

    public final int hashCode() {
        List<RichBlock> list = this.richBlocks;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DescDetailV2(richBlocks=");
        return C1NE.LIZIZ(LIZ, this.richBlocks, ')', LIZ);
    }

    public DescDetailV2(List<RichBlock> list) {
        this.richBlocks = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        List<RichBlock> list = this.richBlocks;
        if (list == null) {
            out.writeInt(0);
            return;
        }
        Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
        while (LIZIZ.hasNext()) {
            ((RichBlock) LIZIZ.next()).writeToParcel(out, i);
        }
    }
}

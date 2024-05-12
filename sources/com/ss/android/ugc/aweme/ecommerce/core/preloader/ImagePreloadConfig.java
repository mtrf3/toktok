package com.ss.android.ugc.aweme.ecommerce.core.preloader;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import X.MUF;
import X.UC7;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ImagePreloadConfig extends F9E implements Parcelable {
    public static final Parcelable.Creator<ImagePreloadConfig> CREATOR = new MUF();

    @InterfaceC65349Pkn("option")
    public final int option;

    @InterfaceC65349Pkn("priority")
    public final List<Integer> priority;

    public ImagePreloadConfig() {
        this(null, 0, 3, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.priority, Integer.valueOf(this.option)};
    }

    public ImagePreloadConfig(List<Integer> priority, int i) {
        o.LJIIIZ(priority, "priority");
        this.priority = priority;
        this.option = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Iterator LIZJ = UC7.LIZJ(this.priority, out);
        while (LIZJ.hasNext()) {
            out.writeInt(((Number) LIZJ.next()).intValue());
        }
        out.writeInt(this.option);
    }

    public ImagePreloadConfig(List list, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C61878OQg.INSTANCE : list, (i2 & 2) != 0 ? 0 : i);
    }
}

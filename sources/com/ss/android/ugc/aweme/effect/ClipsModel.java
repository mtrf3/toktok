package com.ss.android.ugc.aweme.effect;

import X.C48258Iwo;
import X.F9E;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class ClipsModel extends F9E implements Serializable, Parcelable {
    public static final Parcelable.Creator<ClipsModel> CREATOR = new C48258Iwo();

    @InterfaceC65349Pkn("duration")
    public final float duration;

    @InterfaceC65349Pkn("i")
    public final double i;

    @InterfaceC65349Pkn("o")
    public final double o;

    @InterfaceC65349Pkn("xPoints")
    public final List<Float> xPoints;

    @InterfaceC65349Pkn("yPoints")
    public final List<Float> yPoints;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ClipsModel copy$default(ClipsModel clipsModel, double d, double d2, float f, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = clipsModel.i;
        }
        if ((i & 2) != 0) {
            d2 = clipsModel.o;
        }
        if ((i & 4) != 0) {
            f = clipsModel.duration;
        }
        if ((i & 8) != 0) {
            list = clipsModel.xPoints;
        }
        if ((i & 16) != 0) {
            list2 = clipsModel.yPoints;
        }
        return clipsModel.copy(d, d2, f, list, list2);
    }

    public final ClipsModel copy(double d, double d2, float f, List<Float> xPoints, List<Float> yPoints) {
        o.LJIIIZ(xPoints, "xPoints");
        o.LJIIIZ(yPoints, "yPoints");
        return new ClipsModel(d, d2, f, xPoints, yPoints);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Double.valueOf(this.i), Double.valueOf(this.o), Float.valueOf(this.duration), this.xPoints, this.yPoints};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeDouble(this.i);
        parcel.writeDouble(this.o);
        parcel.writeFloat(this.duration);
        List<Float> list = this.xPoints;
        parcel.writeInt(list.size());
        Iterator<Float> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeFloat(it.next().floatValue());
        }
        List<Float> list2 = this.yPoints;
        parcel.writeInt(list2.size());
        Iterator<Float> it2 = list2.iterator();
        while (it2.hasNext()) {
            parcel.writeFloat(it2.next().floatValue());
        }
    }

    public final float getDuration() {
        return this.duration;
    }

    public final double getI() {
        return this.i;
    }

    public final double getO() {
        return this.o;
    }

    public final List<Float> getXPoints() {
        return this.xPoints;
    }

    public final List<Float> getYPoints() {
        return this.yPoints;
    }

    public ClipsModel(double d, double d2, float f, List<Float> xPoints, List<Float> yPoints) {
        o.LJIIIZ(xPoints, "xPoints");
        o.LJIIIZ(yPoints, "yPoints");
        this.i = d;
        this.o = d2;
        this.duration = f;
        this.xPoints = xPoints;
        this.yPoints = yPoints;
    }
}

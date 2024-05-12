package com.bytedance.ies.powerlist.page.config;

import X.C49488JbY;
import X.F9E;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class OptimizeAbility extends F9E implements Parcelable {
    public static final Parcelable.Creator<OptimizeAbility> CREATOR = new C49488JbY();
    public final boolean enable;
    public final int preloadCount;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enable), Integer.valueOf(this.preloadCount)};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.enable ? 1 : 0);
        out.writeInt(this.preloadCount);
    }

    public OptimizeAbility() {
        this(false, 8);
    }

    public OptimizeAbility(boolean z, int i) {
        this.enable = z;
        this.preloadCount = i;
    }
}

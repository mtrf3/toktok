package com.ss.android.ugc.aweme.tools.mvtemplate.preview.prepare;

import X.C44623HfH;
import X.F9E;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class FeatureConfig extends F9E implements Parcelable {
    public static final C44623HfH CREATOR = new C44623HfH();

    @InterfaceC65349Pkn("import_fps")
    public final int importFps;

    @InterfaceC65349Pkn("import_resolution_threshold")
    public final int importResolutionRatio;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FeatureConfig() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.mvtemplate.preview.prepare.FeatureConfig.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.importFps), Integer.valueOf(this.importResolutionRatio)};
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FeatureConfig(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt());
        o.LJIIIZ(parcel, "parcel");
    }

    public FeatureConfig(int i, int i2) {
        this.importFps = i;
        this.importResolutionRatio = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        o.LJIIIZ(dest, "dest");
        dest.writeInt(this.importFps);
        dest.writeInt(this.importResolutionRatio);
    }

    public /* synthetic */ FeatureConfig(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 40 : i, (i3 & 2) != 0 ? 3686400 : i2);
    }
}

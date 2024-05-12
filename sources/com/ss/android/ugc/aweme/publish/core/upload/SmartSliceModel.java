package com.ss.android.ugc.aweme.publish.core.upload;

import X.C43406H1u;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.WM7;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class SmartSliceModel {
    public static final C43406H1u Companion = new C43406H1u();

    @InterfaceC65349Pkn("base_number")
    public final int baseNumber;

    @InterfaceC65349Pkn("max_slice_size")
    public final int maxSliceSize;

    @InterfaceC65349Pkn("min_slice_size")
    public final int minSliceSize;

    @InterfaceC65349Pkn("nearest_upper")
    public final boolean nearestUpper;

    @InterfaceC65349Pkn("package_url")
    public final String packageUrl;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public final String scene;

    @InterfaceC65349Pkn("type")
    public final int type;

    public static /* synthetic */ SmartSliceModel copy$default(SmartSliceModel smartSliceModel, String str, int i, String str2, boolean z, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = smartSliceModel.scene;
        }
        if ((i5 & 2) != 0) {
            i = smartSliceModel.type;
        }
        if ((i5 & 4) != 0) {
            str2 = smartSliceModel.packageUrl;
        }
        if ((i5 & 8) != 0) {
            z = smartSliceModel.nearestUpper;
        }
        if ((i5 & 16) != 0) {
            i2 = smartSliceModel.minSliceSize;
        }
        if ((i5 & 32) != 0) {
            i3 = smartSliceModel.maxSliceSize;
        }
        if ((i5 & 64) != 0) {
            i4 = smartSliceModel.baseNumber;
        }
        return smartSliceModel.copy(str, i, str2, z, i2, i3, i4);
    }

    public final SmartSliceModel copy(String str, int i, String packageUrl, boolean z, int i2, int i3, int i4) {
        o.LJIIIZ(packageUrl, "packageUrl");
        return new SmartSliceModel(str, i, packageUrl, z, i2, i3, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmartSliceModel)) {
            return false;
        }
        SmartSliceModel smartSliceModel = (SmartSliceModel) obj;
        return o.LJ(this.scene, smartSliceModel.scene) && this.type == smartSliceModel.type && o.LJ(this.packageUrl, smartSliceModel.packageUrl) && this.nearestUpper == smartSliceModel.nearestUpper && this.minSliceSize == smartSliceModel.minSliceSize && this.maxSliceSize == smartSliceModel.maxSliceSize && this.baseNumber == smartSliceModel.baseNumber;
    }

    public final int getValidMaxSliceSize() {
        int i = this.maxSliceSize;
        if (i <= 0) {
            return 4096;
        }
        return i;
    }

    public final int getValidMinSliceSize() {
        int i = this.minSliceSize;
        if (i <= 0) {
            return 256;
        }
        return i;
    }

    public final int getValidTimesBaseNumber() {
        int i = this.baseNumber;
        if (i <= 0) {
            return 16;
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        String str = this.scene;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int LJ = C79062V1e.LJ(this.packageUrl, ((hashCode * 31) + this.type) * 31, 31);
        boolean z = this.nearestUpper;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((((LJ + i) * 31) + this.minSliceSize) * 31) + this.maxSliceSize) * 31) + this.baseNumber;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SmartSliceModel(scene=");
        LIZ.append(this.scene);
        LIZ.append(", type=");
        LIZ.append(this.type);
        LIZ.append(", packageUrl=");
        LIZ.append(this.packageUrl);
        LIZ.append(", nearestUpper=");
        LIZ.append(this.nearestUpper);
        LIZ.append(", minSliceSize=");
        LIZ.append(this.minSliceSize);
        LIZ.append(", maxSliceSize=");
        LIZ.append(this.maxSliceSize);
        LIZ.append(", baseNumber=");
        return b0.LIZJ(LIZ, this.baseNumber, ')', LIZ);
    }

    public final int getBaseNumber() {
        return this.baseNumber;
    }

    public final int getMaxSliceSize() {
        return this.maxSliceSize;
    }

    public final int getMinSliceSize() {
        return this.minSliceSize;
    }

    public final boolean getNearestUpper() {
        return this.nearestUpper;
    }

    public final String getPackageUrl() {
        return this.packageUrl;
    }

    public final String getScene() {
        return this.scene;
    }

    public final int getType() {
        return this.type;
    }

    public SmartSliceModel(String str, int i, String packageUrl, boolean z, int i2, int i3, int i4) {
        o.LJIIIZ(packageUrl, "packageUrl");
        this.scene = str;
        this.type = i;
        this.packageUrl = packageUrl;
        this.nearestUpper = z;
        this.minSliceSize = i2;
        this.maxSliceSize = i3;
        this.baseNumber = i4;
    }
}

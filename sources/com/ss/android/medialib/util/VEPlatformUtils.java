package com.ss.android.medialib.util;

import X.V0N;
import Y.IDCreatorS54S0000000_11;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes12.dex */
public final class VEPlatformUtils {
    public static VEPlatform LIZ() {
        VEPlatform vEPlatform = VEPlatform.PLATFORM_UNKNOWN;
        String str = Build.HARDWARE;
        if (str.matches("qcom")) {
            return VEPlatform.PLATFORM_QCOM;
        }
        if (str.matches("mt[0-9]*")) {
            return VEPlatform.PLATFORM_MTK;
        }
        if (!str.matches("kirin[0-9]*")) {
            return vEPlatform;
        }
        return VEPlatform.PLATFORM_HISI;
    }

    /* loaded from: classes12.dex */
    public enum VEPlatform implements Parcelable {
        PLATFORM_UNKNOWN,
        PLATFORM_QCOM,
        PLATFORM_MTK,
        PLATFORM_HISI,
        PLATFORM_EXYNOS;

        public static final Parcelable.Creator<VEPlatform> CREATOR = new IDCreatorS54S0000000_11(54);

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public static VEPlatform valueOf(String str) {
            return (VEPlatform) V0N.LJJJ(VEPlatform.class, str);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }
}

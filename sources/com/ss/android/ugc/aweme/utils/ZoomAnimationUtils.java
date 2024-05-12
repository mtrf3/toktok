package com.ss.android.ugc.aweme.utils;

import X.C26003AIl;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes5.dex */
public final class ZoomAnimationUtils {

    /* loaded from: classes5.dex */
    public static class ZoomInfo implements Parcelable {
        public static final Parcelable.Creator<ZoomInfo> CREATOR = new C26003AIl();
        public int height;
        public int screenX;
        public int screenY;
        public int width;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public ZoomInfo(Parcel parcel) {
            this.screenX = parcel.readInt();
            this.screenY = parcel.readInt();
            this.width = parcel.readInt();
            this.height = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.screenX);
            parcel.writeInt(this.screenY);
            parcel.writeInt(this.width);
            parcel.writeInt(this.height);
        }

        public ZoomInfo(int i, int i2, int i3, int i4) {
            this.screenX = i;
            this.screenY = i2;
            this.width = i3;
            this.height = i4;
        }
    }

    public static ZoomInfo LIZ(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new ZoomInfo(iArr[0], iArr[1], view.getWidth(), view.getHeight());
    }
}

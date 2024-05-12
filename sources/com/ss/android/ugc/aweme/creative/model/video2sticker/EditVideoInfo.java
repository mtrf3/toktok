package com.ss.android.ugc.aweme.creative.model.video2sticker;

import X.F9E;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.video2sticker.EditVideoInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class EditVideoInfo extends F9E implements Parcelable {
    public static final Parcelable.Creator<EditVideoInfo> CREATOR = new Parcelable.Creator<EditVideoInfo>() { // from class: X.5m7
        @Override // android.os.Parcelable.Creator
        public final EditVideoInfo createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new EditVideoInfo(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final EditVideoInfo[] newArray(int i) {
            return new EditVideoInfo[i];
        }
    };

    @InterfaceC65349Pkn("initializeScale")
    public float initializeScale;

    @InterfaceC65349Pkn("initializeTransY")
    public float initializeTransY;

    @InterfaceC65349Pkn("initializeVideoHeight")
    public float initializeVideoHeight;

    @InterfaceC65349Pkn("initializeVideoWidth")
    public float initializeVideoWidth;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EditVideoInfo() {
        /*
            r7 = this;
            r1 = 0
            r5 = 15
            r6 = 0
            r0 = r7
            r2 = r1
            r3 = r1
            r4 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.model.video2sticker.EditVideoInfo.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Float.valueOf(this.initializeScale), Float.valueOf(this.initializeTransY), Float.valueOf(this.initializeVideoWidth), Float.valueOf(this.initializeVideoHeight)};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeFloat(this.initializeScale);
        out.writeFloat(this.initializeTransY);
        out.writeFloat(this.initializeVideoWidth);
        out.writeFloat(this.initializeVideoHeight);
    }

    public EditVideoInfo(float f, float f2, float f3, float f4) {
        this.initializeScale = f;
        this.initializeTransY = f2;
        this.initializeVideoWidth = f3;
        this.initializeVideoHeight = f4;
    }

    public /* synthetic */ EditVideoInfo(float f, float f2, float f3, float f4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? 0.0f : f4);
    }
}

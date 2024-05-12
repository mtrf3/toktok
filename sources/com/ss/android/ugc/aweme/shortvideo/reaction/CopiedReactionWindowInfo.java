package com.ss.android.ugc.aweme.shortvideo.reaction;

import X.C41344GKm;
import X.F9E;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CopiedReactionWindowInfo extends F9E implements Parcelable, Serializable {
    public static final C41344GKm CREATOR = new C41344GKm();

    @InterfaceC65349Pkn("react_angle")
    public final float angle;

    @InterfaceC65349Pkn("react_height")
    public final int height;

    @InterfaceC65349Pkn("react_type")
    public final int type;

    @InterfaceC65349Pkn("react_width")
    public final int width;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CopiedReactionWindowInfo() {
        /*
            r7 = this;
            r1 = 0
            r3 = 0
            r5 = 15
            r6 = 0
            r0 = r7
            r2 = r1
            r4 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.reaction.CopiedReactionWindowInfo.<init>():void");
    }

    public static /* synthetic */ CopiedReactionWindowInfo copy$default(CopiedReactionWindowInfo copiedReactionWindowInfo, int i, int i2, float f, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = copiedReactionWindowInfo.width;
        }
        if ((i4 & 2) != 0) {
            i2 = copiedReactionWindowInfo.height;
        }
        if ((i4 & 4) != 0) {
            f = copiedReactionWindowInfo.angle;
        }
        if ((i4 & 8) != 0) {
            i3 = copiedReactionWindowInfo.type;
        }
        return copiedReactionWindowInfo.copy(i, i2, f, i3);
    }

    public final CopiedReactionWindowInfo copy(int i, int i2, float f, int i3) {
        return new CopiedReactionWindowInfo(i, i2, f, i3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.width), Integer.valueOf(this.height), Float.valueOf(this.angle), Integer.valueOf(this.type)};
    }

    public final float getAngle() {
        return this.angle;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getType() {
        return this.type;
    }

    public final int getWidth() {
        return this.width;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CopiedReactionWindowInfo(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readFloat(), parcel.readInt());
        o.LJIIIZ(parcel, "parcel");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeFloat(this.angle);
        parcel.writeInt(this.type);
    }

    public CopiedReactionWindowInfo(int i, int i2, float f, int i3) {
        this.width = i;
        this.height = i2;
        this.angle = f;
        this.type = i3;
    }

    public /* synthetic */ CopiedReactionWindowInfo(int i, int i2, float f, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : f, (i4 & 8) != 0 ? 0 : i3);
    }
}

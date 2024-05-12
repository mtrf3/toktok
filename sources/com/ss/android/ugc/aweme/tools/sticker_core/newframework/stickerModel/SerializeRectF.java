package com.ss.android.ugc.aweme.tools.sticker_core.newframework.stickerModel;

import X.InterfaceC65349Pkn;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.tools.sticker_core.newframework.stickerModel.SerializeRectF;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class SerializeRectF implements Parcelable {
    public static final Parcelable.Creator<SerializeRectF> CREATOR = new Parcelable.Creator<SerializeRectF>() { // from class: X.64T
        @Override // android.os.Parcelable.Creator
        public final SerializeRectF createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new SerializeRectF(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final SerializeRectF[] newArray(int i) {
            return new SerializeRectF[i];
        }
    };

    @InterfaceC65349Pkn("bottom")
    public float bottom;

    @InterfaceC65349Pkn("left")
    public float left;

    @InterfaceC65349Pkn("right")
    public float right;

    @InterfaceC65349Pkn("top")
    public float top;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SerializeRectF() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.sticker_core.newframework.stickerModel.SerializeRectF.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeFloat(this.left);
        out.writeFloat(this.top);
        out.writeFloat(this.right);
        out.writeFloat(this.bottom);
    }

    public final RectF LIZ() {
        return new RectF(this.left, this.top, this.right, this.bottom);
    }

    public SerializeRectF(float f, float f2, float f3, float f4) {
        this.left = f;
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
    }

    public /* synthetic */ SerializeRectF(float f, float f2, float f3, float f4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? 0.0f : f4);
    }
}

package com.ss.android.ugc.cut_ui;

import X.F9E;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.android.ugc.cut_ui.TextItem;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class TextItem extends F9E implements Parcelable {
    public static final Parcelable.Creator<TextItem> CREATOR = new Parcelable.Creator<TextItem>() { // from class: X.5Re
        @Override // android.os.Parcelable.Creator
        public final TextItem createFromParcel(Parcel parcel) {
            boolean z;
            o.LJIIIZ(parcel, "parcel");
            long readLong = parcel.readLong();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new TextItem(readLong, z, parcel.readString(), parcel.readDouble(), parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TextItem[] newArray(int i) {
            return new TextItem[i];
        }
    };
    public final long duration;
    public final String materialId;
    public final boolean mutable;
    public final double rotation;
    public final long targetStartTime;
    public final String text;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.duration), Boolean.valueOf(this.mutable), this.materialId, Double.valueOf(this.rotation), Long.valueOf(this.targetStartTime), this.text};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeLong(this.duration);
        out.writeInt(this.mutable ? 1 : 0);
        out.writeString(this.materialId);
        out.writeDouble(this.rotation);
        out.writeLong(this.targetStartTime);
        out.writeString(this.text);
    }

    public TextItem() {
        this(0L, false, "", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, 0L, "");
    }

    public TextItem(long j, boolean z, String materialId, double d, long j2, String text) {
        o.LJIIIZ(materialId, "materialId");
        o.LJIIIZ(text, "text");
        this.duration = j;
        this.mutable = z;
        this.materialId = materialId;
        this.rotation = d;
        this.targetStartTime = j2;
        this.text = text;
    }
}

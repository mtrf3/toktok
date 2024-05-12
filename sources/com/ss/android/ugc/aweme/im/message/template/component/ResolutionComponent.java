package com.ss.android.ugc.aweme.im.message.template.component;

import X.F9E;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.ResolutionComponent;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ResolutionComponent extends F9E implements BaseComponent {
    public static final Parcelable.Creator<ResolutionComponent> CREATOR = new Parcelable.Creator<ResolutionComponent>() { // from class: X.4XD
        @Override // android.os.Parcelable.Creator
        public final ResolutionComponent createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new ResolutionComponent(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ResolutionComponent[] newArray(int i) {
            return new ResolutionComponent[i];
        }
    };
    public final int height;
    public final int width;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.width), Integer.valueOf(this.height)};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.width);
        out.writeInt(this.height);
    }

    public ResolutionComponent(int i, int i2) {
        this.width = i;
        this.height = i2;
    }
}

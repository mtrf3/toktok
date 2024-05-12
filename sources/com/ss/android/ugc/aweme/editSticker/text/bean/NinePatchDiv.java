package com.ss.android.ugc.aweme.editSticker.text.bean;

import X.C80139Vcl;
import X.F9E;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class NinePatchDiv extends F9E implements Serializable, Parcelable {
    public static final Parcelable.Creator<NinePatchDiv> CREATOR = new C80139Vcl();
    public final int end;
    public final int start;

    public static /* synthetic */ NinePatchDiv copy$default(NinePatchDiv ninePatchDiv, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = ninePatchDiv.start;
        }
        if ((i3 & 2) != 0) {
            i2 = ninePatchDiv.end;
        }
        return ninePatchDiv.copy(i, i2);
    }

    public final NinePatchDiv copy(int i, int i2) {
        return new NinePatchDiv(i, i2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.start), Integer.valueOf(this.end)};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.start);
        out.writeInt(this.end);
    }

    public final int getEnd() {
        return this.end;
    }

    public final int getStart() {
        return this.start;
    }

    public NinePatchDiv(int i, int i2) {
        this.start = i;
        this.end = i2;
    }
}

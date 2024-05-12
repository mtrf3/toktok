package com.ss.android.ugc.aweme.tools.sticker.core.text.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class CaptionModel extends F9E implements Parcelable {
    public static final Parcelable.Creator<CaptionModel> CREATOR = new Parcelable.Creator<CaptionModel>() { // from class: X.5Zt
        @Override // android.os.Parcelable.Creator
        public final CaptionModel createFromParcel(Parcel parcel) {
            boolean z;
            o.LJIIIZ(parcel, "parcel");
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new CaptionModel(z);
        }

        @Override // android.os.Parcelable.Creator
        public final CaptionModel[] newArray(int i) {
            return new CaptionModel[i];
        }
    };

    @InterfaceC65349Pkn("is_editorpro_caption")
    public boolean isEditorProCaption;

    public CaptionModel() {
        this(false, 1, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.isEditorProCaption)};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.isEditorProCaption ? 1 : 0);
    }

    public CaptionModel(boolean z) {
        this.isEditorProCaption = z;
    }

    public /* synthetic */ CaptionModel(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}

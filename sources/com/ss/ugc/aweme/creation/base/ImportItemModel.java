package com.ss.ugc.aweme.creation.base;

import X.EnumC62122cC;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.ImportItemModel;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class ImportItemModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<ImportItemModel> CREATOR = new Parcelable.Creator<ImportItemModel>() { // from class: X.4e8
        @Override // android.os.Parcelable.Creator
        public final ImportItemModel createFromParcel(Parcel in) {
            o.LJIIIZ(in, "in");
            return new ImportItemModel(in.readString(), (EnumC62122cC) V0N.LJJJ(EnumC62122cC.class, in.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final ImportItemModel[] newArray(int i) {
            return new ImportItemModel[i];
        }
    };

    @InterfaceC65349Pkn("path")
    public String path;

    @InterfaceC65349Pkn("type")
    public EnumC62122cC type;

    /* JADX WARN: Multi-variable type inference failed */
    public ImportItemModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeString(this.path);
        parcel.writeString(this.type.name());
    }

    public final String getPath() {
        return this.path;
    }

    public final EnumC62122cC getType() {
        return this.type;
    }

    public final void setPath(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.path = str;
    }

    public final void setType(EnumC62122cC enumC62122cC) {
        o.LJIIIZ(enumC62122cC, "<set-?>");
        this.type = enumC62122cC;
    }

    public ImportItemModel(String path, EnumC62122cC type) {
        o.LJIIIZ(path, "path");
        o.LJIIIZ(type, "type");
        this.path = path;
        this.type = type;
    }

    public /* synthetic */ ImportItemModel(String str, EnumC62122cC enumC62122cC, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? EnumC62122cC.ImportItemType_UNDEFINED : enumC62122cC);
    }
}

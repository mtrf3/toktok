package com.ss.android.ugc.aweme.edit;

import X.F9E;
import X.G9O;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class TTStoryUploadModel extends F9E implements Parcelable, Serializable {
    public static final Parcelable.Creator<TTStoryUploadModel> CREATOR = new G9O();

    @InterfaceC65349Pkn(alternate = {"c"}, value = "contentType")
    public final int contentType;

    @InterfaceC65349Pkn(alternate = {"a"}, value = "index")
    public final int index;

    @InterfaceC65349Pkn(alternate = {"b"}, value = "totalCount")
    public final int totalCount;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TTStoryUploadModel() {
        /*
            r6 = this;
            r1 = 0
            r4 = 7
            r5 = 0
            r0 = r6
            r2 = r1
            r3 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.edit.TTStoryUploadModel.<init>():void");
    }

    public static /* synthetic */ TTStoryUploadModel copy$default(TTStoryUploadModel tTStoryUploadModel, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = tTStoryUploadModel.index;
        }
        if ((i4 & 2) != 0) {
            i2 = tTStoryUploadModel.totalCount;
        }
        if ((i4 & 4) != 0) {
            i3 = tTStoryUploadModel.contentType;
        }
        return tTStoryUploadModel.copy(i, i2, i3);
    }

    public final TTStoryUploadModel copy(int i, int i2, int i3) {
        return new TTStoryUploadModel(i, i2, i3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.index), Integer.valueOf(this.totalCount), Integer.valueOf(this.contentType)};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.index);
        out.writeInt(this.totalCount);
        out.writeInt(this.contentType);
    }

    public final int getContentType() {
        return this.contentType;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public TTStoryUploadModel(int i, int i2, int i3) {
        this.index = i;
        this.totalCount = i2;
        this.contentType = i3;
    }

    public /* synthetic */ TTStoryUploadModel(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }
}

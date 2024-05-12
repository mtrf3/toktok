package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C1NE;
import X.C27472AqK;
import X.C279017q;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class EntranceButtonInfo implements Parcelable {
    public static final Parcelable.Creator<EntranceButtonInfo> CREATOR = new C27472AqK();

    @InterfaceC65349Pkn("img")
    public final List<Image> buttonImgList;

    @InterfaceC65349Pkn("title")
    public final String buttonTitle;

    /* JADX WARN: Multi-variable type inference failed */
    public EntranceButtonInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EntranceButtonInfo)) {
            return false;
        }
        EntranceButtonInfo entranceButtonInfo = (EntranceButtonInfo) obj;
        return o.LJ(this.buttonTitle, entranceButtonInfo.buttonTitle) && o.LJ(this.buttonImgList, entranceButtonInfo.buttonImgList);
    }

    public final int hashCode() {
        String str = this.buttonTitle;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<Image> list = this.buttonImgList;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EntranceButtonInfo(buttonTitle=");
        LIZ.append(this.buttonTitle);
        LIZ.append(", buttonImgList=");
        return C1NE.LIZIZ(LIZ, this.buttonImgList, ')', LIZ);
    }

    public EntranceButtonInfo(String str, List<Image> list) {
        this.buttonTitle = str;
        this.buttonImgList = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.buttonTitle);
        List<Image> list = this.buttonImgList;
        if (list == null) {
            out.writeInt(0);
            return;
        }
        Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
        while (LIZIZ.hasNext()) {
            out.writeParcelable((Parcelable) LIZIZ.next(), i);
        }
    }

    public /* synthetic */ EntranceButtonInfo(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }
}

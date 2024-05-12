package com.ss.android.ugc.aweme.shortvideo.model;

import X.C279017q;
import X.C279117r;
import X.C48339Iy7;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DuetAndStitchRouterConfig implements Parcelable {
    public static final Parcelable.Creator<DuetAndStitchRouterConfig> CREATOR = new Creator();

    @InterfaceC65349Pkn("anchors")
    public final List<TransAnchorData> anchors;

    @InterfaceC65349Pkn("aweme_id")
    public final String awemeId;

    @InterfaceC65349Pkn("enter_from")
    public final String enterFrom;

    @InterfaceC65349Pkn("enter_method")
    public final String enterMethod;

    @InterfaceC65349Pkn("is_ecommerce")
    public final boolean isEcommerce;

    @InterfaceC65349Pkn("type")
    public final String type;

    /* JADX WARN: Multi-variable type inference failed */
    public DuetAndStitchRouterConfig() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 63, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DuetAndStitchRouterConfig copy$default(DuetAndStitchRouterConfig duetAndStitchRouterConfig, String str, String str2, List list, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = duetAndStitchRouterConfig.type;
        }
        if ((i & 2) != 0) {
            str2 = duetAndStitchRouterConfig.awemeId;
        }
        if ((i & 4) != 0) {
            list = duetAndStitchRouterConfig.anchors;
        }
        if ((i & 8) != 0) {
            str3 = duetAndStitchRouterConfig.enterFrom;
        }
        if ((i & 16) != 0) {
            str4 = duetAndStitchRouterConfig.enterMethod;
        }
        if ((i & 32) != 0) {
            z = duetAndStitchRouterConfig.isEcommerce;
        }
        return duetAndStitchRouterConfig.copy(str, str2, list, str3, str4, z);
    }

    public final DuetAndStitchRouterConfig copy(String str, String str2, List<TransAnchorData> list, String str3, String str4, boolean z) {
        return new DuetAndStitchRouterConfig(str, str2, list, str3, str4, z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DuetAndStitchRouterConfig)) {
            return false;
        }
        DuetAndStitchRouterConfig duetAndStitchRouterConfig = (DuetAndStitchRouterConfig) obj;
        return o.LJ(this.type, duetAndStitchRouterConfig.type) && o.LJ(this.awemeId, duetAndStitchRouterConfig.awemeId) && o.LJ(this.anchors, duetAndStitchRouterConfig.anchors) && o.LJ(this.enterFrom, duetAndStitchRouterConfig.enterFrom) && o.LJ(this.enterMethod, duetAndStitchRouterConfig.enterMethod) && this.isEcommerce == duetAndStitchRouterConfig.isEcommerce;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.type;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.awemeId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<TransAnchorData> list = this.anchors;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.enterFrom;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.enterMethod;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z = this.isEcommerce;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode5 + i;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DuetAndStitchRouterConfig(type=");
        LIZ.append(this.type);
        LIZ.append(", awemeId=");
        LIZ.append(this.awemeId);
        LIZ.append(", anchors=");
        LIZ.append(this.anchors);
        LIZ.append(", enterFrom=");
        LIZ.append(this.enterFrom);
        LIZ.append(", enterMethod=");
        LIZ.append(this.enterMethod);
        LIZ.append(", isEcommerce=");
        return C48339Iy7.LIZJ(LIZ, this.isEcommerce, ')', LIZ);
    }

    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<DuetAndStitchRouterConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DuetAndStitchRouterConfig[] newArray(int i) {
            return new DuetAndStitchRouterConfig[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DuetAndStitchRouterConfig createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            boolean z;
            o.LJIIIZ(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = C279117r.LIZIZ(TransAnchorData.CREATOR, parcel, arrayList, i, 1);
                }
            }
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new DuetAndStitchRouterConfig(readString, readString2, arrayList, readString3, readString4, z);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.type);
        out.writeString(this.awemeId);
        List<TransAnchorData> list = this.anchors;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((TransAnchorData) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        out.writeString(this.enterFrom);
        out.writeString(this.enterMethod);
        out.writeInt(this.isEcommerce ? 1 : 0);
    }

    public DuetAndStitchRouterConfig(String str, String str2, List<TransAnchorData> list, String str3, String str4, boolean z) {
        this.type = str;
        this.awemeId = str2;
        this.anchors = list;
        this.enterFrom = str3;
        this.enterMethod = str4;
        this.isEcommerce = z;
    }

    public /* synthetic */ DuetAndStitchRouterConfig(String str, String str2, List list, String str3, String str4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? "" : str3, (i & 16) == 0 ? str4 : "", (i & 32) != 0 ? false : z);
    }
}

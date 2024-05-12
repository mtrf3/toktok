package com.bytedance.ies.ugc.aweme.commercialize.compliance.model;

import X.C279017q;
import X.C61878OQg;
import X.GIB;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AdFreeTrialPageInfo implements Serializable, Parcelable {
    public static final Parcelable.Creator<AdFreeTrialPageInfo> CREATOR = new GIB();

    @InterfaceC65349Pkn("button_text")
    public final String buttonText;

    @InterfaceC65349Pkn("descriptions")
    public final List<Description> description;

    @InterfaceC65349Pkn("subtitle")
    public final String subtitle;

    @InterfaceC65349Pkn("title")
    public final String title;

    public AdFreeTrialPageInfo() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdFreeTrialPageInfo copy$default(AdFreeTrialPageInfo adFreeTrialPageInfo, String str, String str2, List list, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = adFreeTrialPageInfo.title;
        }
        if ((i & 2) != 0) {
            str2 = adFreeTrialPageInfo.subtitle;
        }
        if ((i & 4) != 0) {
            list = adFreeTrialPageInfo.description;
        }
        if ((i & 8) != 0) {
            str3 = adFreeTrialPageInfo.buttonText;
        }
        return adFreeTrialPageInfo.copy(str, str2, list, str3);
    }

    public final AdFreeTrialPageInfo copy(String str, String str2, List<Description> list, String str3) {
        return new AdFreeTrialPageInfo(str, str2, list, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdFreeTrialPageInfo)) {
            return false;
        }
        AdFreeTrialPageInfo adFreeTrialPageInfo = (AdFreeTrialPageInfo) obj;
        return o.LJ(this.title, adFreeTrialPageInfo.title) && o.LJ(this.subtitle, adFreeTrialPageInfo.subtitle) && o.LJ(this.description, adFreeTrialPageInfo.description) && o.LJ(this.buttonText, adFreeTrialPageInfo.buttonText);
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Description> list = this.description;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.buttonText;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AdFreeTrialPageInfo(title=");
        LIZ.append(this.title);
        LIZ.append(", subtitle=");
        LIZ.append(this.subtitle);
        LIZ.append(", description=");
        LIZ.append(this.description);
        LIZ.append(", buttonText=");
        return q.LIZIZ(LIZ, this.buttonText, ')', LIZ);
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final List<Description> getDescription() {
        return this.description;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.title);
        out.writeString(this.subtitle);
        List<Description> list = this.description;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                out.writeSerializable((Serializable) LIZIZ.next());
            }
        }
        out.writeString(this.buttonText);
    }

    public AdFreeTrialPageInfo(String str, String str2, List<Description> list, String str3) {
        this.title = str;
        this.subtitle = str2;
        this.description = list;
        this.buttonText = str3;
    }

    public AdFreeTrialPageInfo(String str, String str2, List list, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? C61878OQg.INSTANCE : list, (i & 8) != 0 ? "" : str3);
    }
}

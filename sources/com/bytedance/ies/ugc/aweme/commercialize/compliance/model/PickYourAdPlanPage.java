package com.bytedance.ies.ugc.aweme.commercialize.compliance.model;

import X.C1NE;
import X.C279017q;
import X.C61878OQg;
import X.GIC;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class PickYourAdPlanPage implements Serializable, Parcelable {
    public static final Parcelable.Creator<PickYourAdPlanPage> CREATOR = new GIC();

    @InterfaceC65349Pkn("button_desc")
    public final String buttonDesc;

    @InterfaceC65349Pkn("button_text")
    public final String buttonText;

    @InterfaceC65349Pkn("descriptions")
    public final List<Description> description;

    @InterfaceC65349Pkn("offer_infos")
    public final List<OfferInfo> offerInfo;

    @InterfaceC65349Pkn("policy_title")
    public final String policyTitle;

    @InterfaceC65349Pkn("subtitle")
    public final String subtitle;

    @InterfaceC65349Pkn("title")
    public final String title;

    public PickYourAdPlanPage() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PickYourAdPlanPage copy$default(PickYourAdPlanPage pickYourAdPlanPage, String str, String str2, List list, String str3, String str4, String str5, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pickYourAdPlanPage.title;
        }
        if ((i & 2) != 0) {
            str2 = pickYourAdPlanPage.subtitle;
        }
        if ((i & 4) != 0) {
            list = pickYourAdPlanPage.offerInfo;
        }
        if ((i & 8) != 0) {
            str3 = pickYourAdPlanPage.buttonText;
        }
        if ((i & 16) != 0) {
            str4 = pickYourAdPlanPage.buttonDesc;
        }
        if ((i & 32) != 0) {
            str5 = pickYourAdPlanPage.policyTitle;
        }
        if ((i & 64) != 0) {
            list2 = pickYourAdPlanPage.description;
        }
        return pickYourAdPlanPage.copy(str, str2, list, str3, str4, str5, list2);
    }

    public final PickYourAdPlanPage copy(String str, String str2, List<OfferInfo> list, String str3, String str4, String str5, List<Description> list2) {
        return new PickYourAdPlanPage(str, str2, list, str3, str4, str5, list2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PickYourAdPlanPage)) {
            return false;
        }
        PickYourAdPlanPage pickYourAdPlanPage = (PickYourAdPlanPage) obj;
        return o.LJ(this.title, pickYourAdPlanPage.title) && o.LJ(this.subtitle, pickYourAdPlanPage.subtitle) && o.LJ(this.offerInfo, pickYourAdPlanPage.offerInfo) && o.LJ(this.buttonText, pickYourAdPlanPage.buttonText) && o.LJ(this.buttonDesc, pickYourAdPlanPage.buttonDesc) && o.LJ(this.policyTitle, pickYourAdPlanPage.policyTitle) && o.LJ(this.description, pickYourAdPlanPage.description);
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<OfferInfo> list = this.offerInfo;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.buttonText;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.buttonDesc;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.policyTitle;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<Description> list2 = this.description;
        return hashCode6 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PickYourAdPlanPage(title=");
        LIZ.append(this.title);
        LIZ.append(", subtitle=");
        LIZ.append(this.subtitle);
        LIZ.append(", offerInfo=");
        LIZ.append(this.offerInfo);
        LIZ.append(", buttonText=");
        LIZ.append(this.buttonText);
        LIZ.append(", buttonDesc=");
        LIZ.append(this.buttonDesc);
        LIZ.append(", policyTitle=");
        LIZ.append(this.policyTitle);
        LIZ.append(", description=");
        return C1NE.LIZIZ(LIZ, this.description, ')', LIZ);
    }

    public final String getButtonDesc() {
        return this.buttonDesc;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final List<Description> getDescription() {
        return this.description;
    }

    public final List<OfferInfo> getOfferInfo() {
        return this.offerInfo;
    }

    public final String getPolicyTitle() {
        return this.policyTitle;
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
        List<OfferInfo> list = this.offerInfo;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                out.writeSerializable((Serializable) LIZIZ.next());
            }
        }
        out.writeString(this.buttonText);
        out.writeString(this.buttonDesc);
        out.writeString(this.policyTitle);
        List<Description> list2 = this.description;
        if (list2 == null) {
            out.writeInt(0);
            return;
        }
        Iterator LIZIZ2 = C279017q.LIZIZ(out, 1, list2);
        while (LIZIZ2.hasNext()) {
            out.writeSerializable((Serializable) LIZIZ2.next());
        }
    }

    public PickYourAdPlanPage(String str, String str2, List<OfferInfo> list, String str3, String str4, String str5, List<Description> list2) {
        this.title = str;
        this.subtitle = str2;
        this.offerInfo = list;
        this.buttonText = str3;
        this.buttonDesc = str4;
        this.policyTitle = str5;
        this.description = list2;
    }

    public PickYourAdPlanPage(String str, String str2, List list, String str3, String str4, String str5, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? C61878OQg.INSTANCE : list, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) == 0 ? str5 : "", (i & 64) != 0 ? C61878OQg.INSTANCE : list2);
    }
}

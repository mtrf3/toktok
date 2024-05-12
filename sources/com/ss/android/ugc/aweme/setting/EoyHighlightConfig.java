package com.ss.android.ugc.aweme.setting;

import X.C61878OQg;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.setting.EoyHighlightConfig;
import defpackage.q;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class EoyHighlightConfig implements Serializable, Parcelable {
    public static final Parcelable.Creator<EoyHighlightConfig> CREATOR = new Parcelable.Creator<EoyHighlightConfig>() { // from class: X.5Yd
        @Override // android.os.Parcelable.Creator
        public final EoyHighlightConfig createFromParcel(Parcel parcel) {
            boolean z;
            o.LJIIIZ(parcel, "parcel");
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new EoyHighlightConfig(createStringArrayList, readString, z, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EoyHighlightConfig[] newArray(int i) {
            return new EoyHighlightConfig[i];
        }
    };

    @InterfaceC65349Pkn("color")
    public final String color;

    @InterfaceC65349Pkn("effect_id")
    public final String effectId;

    @InterfaceC65349Pkn("url")
    public final String hubUrl;

    @InterfaceC65349Pkn("is_eoy_campaign")
    public final boolean isEoyCampaign;

    @InterfaceC65349Pkn("text")
    public final List<String> text;

    public EoyHighlightConfig() {
        this(null, null, false, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EoyHighlightConfig copy$default(EoyHighlightConfig eoyHighlightConfig, List list, String str, boolean z, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = eoyHighlightConfig.text;
        }
        if ((i & 2) != 0) {
            str = eoyHighlightConfig.color;
        }
        if ((i & 4) != 0) {
            z = eoyHighlightConfig.isEoyCampaign;
        }
        if ((i & 8) != 0) {
            str2 = eoyHighlightConfig.effectId;
        }
        if ((i & 16) != 0) {
            str3 = eoyHighlightConfig.hubUrl;
        }
        return eoyHighlightConfig.copy(list, str, z, str2, str3);
    }

    public final EoyHighlightConfig copy(List<String> text, String color, boolean z, String str, String str2) {
        o.LJIIIZ(text, "text");
        o.LJIIIZ(color, "color");
        return new EoyHighlightConfig(text, color, z, str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EoyHighlightConfig)) {
            return false;
        }
        EoyHighlightConfig eoyHighlightConfig = (EoyHighlightConfig) obj;
        return o.LJ(this.text, eoyHighlightConfig.text) && o.LJ(this.color, eoyHighlightConfig.color) && this.isEoyCampaign == eoyHighlightConfig.isEoyCampaign && o.LJ(this.effectId, eoyHighlightConfig.effectId) && o.LJ(this.hubUrl, eoyHighlightConfig.hubUrl);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeStringList(this.text);
        out.writeString(this.color);
        out.writeInt(this.isEoyCampaign ? 1 : 0);
        out.writeString(this.effectId);
        out.writeString(this.hubUrl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.color, this.text.hashCode() * 31, 31);
        boolean z = this.isEoyCampaign;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (LJ + i) * 31;
        String str = this.effectId;
        int i3 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i4 = (i2 + hashCode) * 31;
        String str2 = this.hubUrl;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return i4 + i3;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EoyHighlightConfig(text=");
        LIZ.append(this.text);
        LIZ.append(", color=");
        LIZ.append(this.color);
        LIZ.append(", isEoyCampaign=");
        LIZ.append(this.isEoyCampaign);
        LIZ.append(", effectId=");
        LIZ.append(this.effectId);
        LIZ.append(", hubUrl=");
        return q.LIZIZ(LIZ, this.hubUrl, ')', LIZ);
    }

    public final String getColor() {
        return this.color;
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final String getHubUrl() {
        return this.hubUrl;
    }

    public final List<String> getText() {
        return this.text;
    }

    public final boolean isEoyCampaign() {
        return this.isEoyCampaign;
    }

    public EoyHighlightConfig(List<String> text, String color, boolean z, String str, String str2) {
        o.LJIIIZ(text, "text");
        o.LJIIIZ(color, "color");
        this.text = text;
        this.color = color;
        this.isEoyCampaign = z;
        this.effectId = str;
        this.hubUrl = str2;
    }

    public EoyHighlightConfig(List list, String str, boolean z, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C61878OQg.INSTANCE : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str2, (i & 16) == 0 ? str3 : null);
    }
}

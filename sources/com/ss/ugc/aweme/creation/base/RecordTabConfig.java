package com.ss.ugc.aweme.creation.base;

import X.C64489PSr;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class RecordTabConfig implements Parcelable, Serializable {
    public static final Parcelable.Creator<RecordTabConfig> CREATOR = new C64489PSr();

    @InterfaceC65349Pkn("is_initial")
    public Boolean isInitial;

    @InterfaceC65349Pkn("tab_id")
    public int tabId;

    @InterfaceC65349Pkn("tab_title_key")
    public String tabTitleKey;

    /* JADX WARN: Multi-variable type inference failed */
    public RecordTabConfig() {
        this(0, null, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        o.LJIIIZ(parcel, "parcel");
        parcel.writeInt(this.tabId);
        parcel.writeString(this.tabTitleKey);
        Boolean bool = this.isInitial;
        if (bool != null) {
            parcel.writeInt(1);
            i2 = bool.booleanValue();
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
    }

    public final int getTabId() {
        return this.tabId;
    }

    public final String getTabTitleKey() {
        return this.tabTitleKey;
    }

    public final Boolean isInitial() {
        return this.isInitial;
    }

    public final void setInitial(Boolean bool) {
        this.isInitial = bool;
    }

    public final void setTabId(int i) {
        this.tabId = i;
    }

    public final void setTabTitleKey(String str) {
        this.tabTitleKey = str;
    }

    public RecordTabConfig(int i, String str, Boolean bool) {
        this.tabId = i;
        this.tabTitleKey = str;
        this.isInitial = bool;
    }

    public /* synthetic */ RecordTabConfig(int i, String str, Boolean bool, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : bool);
    }
}

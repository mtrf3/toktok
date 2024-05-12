package com.ss.android.ugc.aweme.creative.model;

import X.C42146GgQ;
import X.GPV;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class SearchCreateModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<SearchCreateModel> CREATOR = new C42146GgQ();

    @InterfaceC65349Pkn("hashtags")
    public ArrayList<String> hashTags;

    @GPV
    public boolean isFromSearch;

    @InterfaceC65349Pkn("mob_map")
    public HashMap<String, String> mobMap;

    /* JADX WARN: Multi-variable type inference failed */
    public SearchCreateModel() {
        this(false, null, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.isFromSearch ? 1 : 0);
        out.writeStringList(this.hashTags);
        HashMap<String, String> hashMap = this.mobMap;
        out.writeInt(hashMap.size());
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            out.writeString(entry.getKey());
            out.writeString(entry.getValue());
        }
    }

    public final ArrayList<String> getHashTags() {
        return this.hashTags;
    }

    public final HashMap<String, String> getMobMap() {
        return this.mobMap;
    }

    public final boolean isFromSearch() {
        return this.isFromSearch;
    }

    public final void setFromSearch(boolean z) {
        this.isFromSearch = z;
    }

    public final void setHashTags(ArrayList<String> arrayList) {
        o.LJIIIZ(arrayList, "<set-?>");
        this.hashTags = arrayList;
    }

    public final void setMobMap(HashMap<String, String> hashMap) {
        o.LJIIIZ(hashMap, "<set-?>");
        this.mobMap = hashMap;
    }

    public SearchCreateModel(boolean z, ArrayList<String> hashTags, HashMap<String, String> mobMap) {
        o.LJIIIZ(hashTags, "hashTags");
        o.LJIIIZ(mobMap, "mobMap");
        this.isFromSearch = z;
        this.hashTags = hashTags;
        this.mobMap = mobMap;
    }

    public /* synthetic */ SearchCreateModel(boolean z, ArrayList arrayList, HashMap hashMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? new ArrayList() : arrayList, (i & 4) != 0 ? new HashMap() : hashMap);
    }
}

package com.ss.android.ugc.aweme.shortvideo.model;

import X.F9E;
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
public final class SearchCreationExtraData extends F9E implements Parcelable, Serializable {
    public static final Parcelable.Creator<SearchCreationExtraData> CREATOR = new Creator();

    @InterfaceC65349Pkn("search_hashtags")
    public final ArrayList<String> hashtags;

    @InterfaceC65349Pkn("mob_map")
    public final HashMap<String, String> mobMap;

    @InterfaceC65349Pkn("search_direct_shoot")
    public final boolean searchDirectShoot;

    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<SearchCreationExtraData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SearchCreationExtraData createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            boolean z = parcel.readInt() != 0;
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            int readInt = parcel.readInt();
            HashMap hashMap = new HashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                hashMap.put(parcel.readString(), parcel.readString());
            }
            return new SearchCreationExtraData(z, createStringArrayList, hashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SearchCreationExtraData[] newArray(int i) {
            return new SearchCreationExtraData[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchCreationExtraData() {
        this(false, null, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchCreationExtraData copy$default(SearchCreationExtraData searchCreationExtraData, boolean z, ArrayList arrayList, HashMap hashMap, int i, Object obj) {
        if ((i & 1) != 0) {
            z = searchCreationExtraData.searchDirectShoot;
        }
        if ((i & 2) != 0) {
            arrayList = searchCreationExtraData.hashtags;
        }
        if ((i & 4) != 0) {
            hashMap = searchCreationExtraData.mobMap;
        }
        return searchCreationExtraData.copy(z, arrayList, hashMap);
    }

    public final SearchCreationExtraData copy(boolean z, ArrayList<String> hashtags, HashMap<String, String> mobMap) {
        o.LJIIIZ(hashtags, "hashtags");
        o.LJIIIZ(mobMap, "mobMap");
        return new SearchCreationExtraData(z, hashtags, mobMap);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.searchDirectShoot), this.hashtags, this.mobMap};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.searchDirectShoot ? 1 : 0);
        out.writeStringList(this.hashtags);
        HashMap<String, String> hashMap = this.mobMap;
        out.writeInt(hashMap.size());
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            out.writeString(entry.getKey());
            out.writeString(entry.getValue());
        }
    }

    public final ArrayList<String> getHashtags() {
        return this.hashtags;
    }

    public final HashMap<String, String> getMobMap() {
        return this.mobMap;
    }

    public final boolean getSearchDirectShoot() {
        return this.searchDirectShoot;
    }

    public SearchCreationExtraData(boolean z, ArrayList<String> hashtags, HashMap<String, String> mobMap) {
        o.LJIIIZ(hashtags, "hashtags");
        o.LJIIIZ(mobMap, "mobMap");
        this.searchDirectShoot = z;
        this.hashtags = hashtags;
        this.mobMap = mobMap;
    }

    public /* synthetic */ SearchCreationExtraData(boolean z, ArrayList arrayList, HashMap hashMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? new ArrayList() : arrayList, (i & 4) != 0 ? new HashMap() : hashMap);
    }
}

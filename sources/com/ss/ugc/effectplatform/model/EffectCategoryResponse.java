package com.ss.ugc.effectplatform.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.EffectCategoryResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class EffectCategoryResponse implements AndroidParcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.5jU
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel in) {
            o.LJIIJ(in, "in");
            String readString = in.readString();
            String readString2 = in.readString();
            String readString3 = in.readString();
            String readString4 = in.readString();
            String readString5 = in.readString();
            Effect effect = (Effect) in.readParcelable(EffectCategoryResponse.class.getClassLoader());
            Effect effect2 = (Effect) in.readParcelable(EffectCategoryResponse.class.getClassLoader());
            int readInt = in.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add(in.readParcelable(EffectCategoryResponse.class.getClassLoader()));
                readInt--;
            }
            ArrayList<String> createStringArrayList = in.createStringArrayList();
            String readString6 = in.readString();
            int readInt2 = in.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (readInt2 != 0) {
                arrayList2.add(in.readParcelable(EffectCategoryResponse.class.getClassLoader()));
                readInt2--;
            }
            return new EffectCategoryResponse(readString, readString2, readString3, readString4, readString5, effect, effect2, arrayList, createStringArrayList, readString6, arrayList2, in.readInt() != 0, in.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EffectCategoryResponse[i];
        }
    };
    public List<? extends Effect> collection_effect;
    public String extra;
    public Effect front_effect;
    public String icon_normal_url;
    public String icon_selected_url;
    public String id;
    public boolean is_default;
    public String key;
    public String name;
    public Effect rear_effect;
    public List<String> tags;
    public String tags_update_time;
    public List<? extends Effect> total_effects;

    /* JADX WARN: Multi-variable type inference failed */
    public EffectCategoryResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 8191, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIJ(parcel, "parcel");
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.key);
        parcel.writeString(this.icon_normal_url);
        parcel.writeString(this.icon_selected_url);
        parcel.writeParcelable(this.front_effect, i);
        parcel.writeParcelable(this.rear_effect, i);
        List<? extends Effect> list = this.total_effects;
        parcel.writeInt(list.size());
        Iterator<? extends Effect> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
        parcel.writeStringList(this.tags);
        parcel.writeString(this.tags_update_time);
        List<? extends Effect> list2 = this.collection_effect;
        parcel.writeInt(list2.size());
        Iterator<? extends Effect> it2 = list2.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable(it2.next(), i);
        }
        parcel.writeInt(this.is_default ? 1 : 0);
        parcel.writeString(this.extra);
    }

    public List<Effect> getCollection_effect() {
        return this.collection_effect;
    }

    public String getExtra() {
        return this.extra;
    }

    public Effect getFront_effect() {
        return this.front_effect;
    }

    public String getIcon_normal_url() {
        return this.icon_normal_url;
    }

    public String getIcon_selected_url() {
        return this.icon_selected_url;
    }

    public String getId() {
        return this.id;
    }

    public String getKey() {
        return this.key;
    }

    public String getName() {
        return this.name;
    }

    public Effect getRear_effect() {
        return this.rear_effect;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public String getTags_update_time() {
        return this.tags_update_time;
    }

    public List<Effect> getTotal_effects() {
        return this.total_effects;
    }

    public boolean is_default() {
        return this.is_default;
    }

    public void setCollection_effect(List<? extends Effect> list) {
        o.LJIIJ(list, "<set-?>");
        this.collection_effect = list;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setFront_effect(Effect effect) {
        this.front_effect = effect;
    }

    public void setIcon_normal_url(String str) {
        this.icon_normal_url = str;
    }

    public void setIcon_selected_url(String str) {
        this.icon_selected_url = str;
    }

    public void setId(String str) {
        o.LJIIJ(str, "<set-?>");
        this.id = str;
    }

    public void setKey(String str) {
        o.LJIIJ(str, "<set-?>");
        this.key = str;
    }

    public void setName(String str) {
        o.LJIIJ(str, "<set-?>");
        this.name = str;
    }

    public void setRear_effect(Effect effect) {
        this.rear_effect = effect;
    }

    public void setTags(List<String> list) {
        o.LJIIJ(list, "<set-?>");
        this.tags = list;
    }

    public void setTags_update_time(String str) {
        this.tags_update_time = str;
    }

    public void setTotal_effects(List<? extends Effect> list) {
        o.LJIIJ(list, "<set-?>");
        this.total_effects = list;
    }

    public void set_default(boolean z) {
        this.is_default = z;
    }

    public EffectCategoryResponse(String id, String name, String key, String str, String str2, Effect effect, Effect effect2, List<? extends Effect> total_effects, List<String> tags, String str3, List<? extends Effect> collection_effect, boolean z, String str4) {
        o.LJIIJ(id, "id");
        o.LJIIJ(name, "name");
        o.LJIIJ(key, "key");
        o.LJIIJ(total_effects, "total_effects");
        o.LJIIJ(tags, "tags");
        o.LJIIJ(collection_effect, "collection_effect");
        this.id = id;
        this.name = name;
        this.key = key;
        this.icon_normal_url = str;
        this.icon_selected_url = str2;
        this.front_effect = effect;
        this.rear_effect = effect2;
        this.total_effects = total_effects;
        this.tags = tags;
        this.tags_update_time = str3;
        this.collection_effect = collection_effect;
        this.is_default = z;
        this.extra = str4;
    }

    public /* synthetic */ EffectCategoryResponse(String str, String str2, String str3, String str4, String str5, Effect effect, Effect effect2, List list, List list2, String str6, List list3, boolean z, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) == 0 ? str3 : "", (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : effect, (i & 64) != 0 ? null : effect2, (i & 128) != 0 ? new ArrayList() : list, (i & 256) != 0 ? new ArrayList() : list2, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? new ArrayList() : list3, (i & 2048) != 0 ? false : z, (i & 4096) == 0 ? str7 : null);
    }
}

package com.ss.android.ugc.aweme.im.message.template.component;

import X.C113554cx;
import X.F9E;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.QueryDataComponent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class QueryDataComponent extends F9E implements BaseComponent {
    public static final Parcelable.Creator<QueryDataComponent> CREATOR = new Parcelable.Creator<QueryDataComponent>() { // from class: X.4XE
        @Override // android.os.Parcelable.Creator
        public final QueryDataComponent createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new QueryDataComponent(readString, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final QueryDataComponent[] newArray(int i) {
            return new QueryDataComponent[i];
        }
    };
    public final Map<String, String> extras;
    public final String resourceID;

    /* JADX WARN: Multi-variable type inference failed */
    public QueryDataComponent() {
        this(null, 0 == true ? 1 : 0, 3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.resourceID, this.extras};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.resourceID);
        Map<String, String> map = this.extras;
        out.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            out.writeString(entry.getKey());
            out.writeString(entry.getValue());
        }
    }

    public QueryDataComponent(String resourceID, Map<String, String> extras) {
        o.LJIIIZ(resourceID, "resourceID");
        o.LJIIIZ(extras, "extras");
        this.resourceID = resourceID;
        this.extras = extras;
    }

    public /* synthetic */ QueryDataComponent(String str, Map map, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C113554cx.LJJJLIIL() : map);
    }
}

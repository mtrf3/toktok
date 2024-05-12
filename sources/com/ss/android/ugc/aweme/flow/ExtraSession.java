package com.ss.android.ugc.aweme.flow;

import X.C36449ESf;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ExtraSession implements Parcelable {
    public static final Parcelable.Creator<ExtraSession> CREATOR = new C36449ESf();
    public final Map<String, Parcelable> map;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Map<String, Parcelable> map = this.map;
        out.writeInt(map.size());
        for (Map.Entry<String, Parcelable> entry : map.entrySet()) {
            out.writeString(entry.getKey());
            out.writeParcelable(entry.getValue(), i);
        }
    }

    public ExtraSession() {
        this(new HashMap());
    }

    public ExtraSession(Map<String, Parcelable> map) {
        o.LJIIIZ(map, "map");
        this.map = map;
    }
}

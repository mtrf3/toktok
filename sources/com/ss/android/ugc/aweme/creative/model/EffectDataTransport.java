package com.ss.android.ugc.aweme.creative.model;

import X.C279017q;
import X.H8K;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class EffectDataTransport implements Parcelable {
    public static final Parcelable.Creator<EffectDataTransport> CREATOR = new H8K();

    @InterfaceC65349Pkn("effect_publish_time")
    public List<Long> effectPublishTimes;

    @InterfaceC65349Pkn("resource_id")
    public String resourceIds;

    /* JADX WARN: Multi-variable type inference failed */
    public EffectDataTransport() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public EffectDataTransport(String str, List<Long> list) {
        this.resourceIds = str;
        this.effectPublishTimes = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.resourceIds);
        List<Long> list = this.effectPublishTimes;
        if (list == null) {
            out.writeInt(0);
            return;
        }
        Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
        while (LIZIZ.hasNext()) {
            out.writeLong(((Number) LIZIZ.next()).longValue());
        }
    }

    public /* synthetic */ EffectDataTransport(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }
}

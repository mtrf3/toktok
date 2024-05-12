package com.twitter.sdk.android.core.internal.scribe;

import X.InterfaceC65349Pkn;
import X.X1D;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;

/* loaded from: classes12.dex */
public class ScribeEvent {

    @InterfaceC65349Pkn("_category_")
    public final String category;

    @InterfaceC65349Pkn("event_namespace")
    public final EventNamespace eventNamespace;

    @InterfaceC65349Pkn("format_version")
    public final String formatVersion;

    @InterfaceC65349Pkn("items")
    public final List<Object> items;

    @InterfaceC65349Pkn("ts")
    public final String timestamp;

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        EventNamespace eventNamespace = this.eventNamespace;
        int i5 = 0;
        if (eventNamespace != null) {
            i = eventNamespace.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 31;
        String str = this.timestamp;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        String str2 = this.formatVersion;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        String str3 = this.category;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        List<Object> list = this.items;
        if (list != null) {
            i5 = list.hashCode();
        }
        return i9 + i5;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("event_namespace=");
        LIZ.append(this.eventNamespace);
        LIZ.append(", ts=");
        LIZ.append(this.timestamp);
        LIZ.append(", format_version=");
        LIZ.append(this.formatVersion);
        LIZ.append(", _category_=");
        LIZ.append(this.category);
        LIZ.append(", items=");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("[");
        LIZ2.append(TextUtils.join(", ", this.items));
        LIZ2.append("]");
        LIZ.append(X1D.LIZIZ(LIZ2));
        return X1D.LIZIZ(LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScribeEvent scribeEvent = (ScribeEvent) obj;
        String str = this.category;
        if (str == null ? scribeEvent.category != null : !str.equals(scribeEvent.category)) {
            return false;
        }
        EventNamespace eventNamespace = this.eventNamespace;
        if (eventNamespace == null ? scribeEvent.eventNamespace != null : !eventNamespace.equals(scribeEvent.eventNamespace)) {
            return false;
        }
        String str2 = this.formatVersion;
        if (str2 == null ? scribeEvent.formatVersion != null : !str2.equals(scribeEvent.formatVersion)) {
            return false;
        }
        String str3 = this.timestamp;
        if (str3 == null ? scribeEvent.timestamp != null : !str3.equals(scribeEvent.timestamp)) {
            return false;
        }
        List<Object> list = this.items;
        List<Object> list2 = scribeEvent.items;
        if (list == null ? list2 == null : list.equals(list2)) {
            return true;
        }
        return false;
    }

    public ScribeEvent(String str, EventNamespace eventNamespace, long j) {
        this(str, eventNamespace, j, Collections.emptyList());
    }

    public ScribeEvent(String str, EventNamespace eventNamespace, long j, List<Object> list) {
        this.category = str;
        this.eventNamespace = eventNamespace;
        this.timestamp = String.valueOf(j);
        this.formatVersion = "2";
        this.items = Collections.unmodifiableList(list);
    }
}

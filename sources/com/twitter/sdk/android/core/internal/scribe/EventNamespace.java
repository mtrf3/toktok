package com.twitter.sdk.android.core.internal.scribe;

import X.InterfaceC65349Pkn;
import X.X1D;

/* loaded from: classes12.dex */
public class EventNamespace {

    @InterfaceC65349Pkn("action")
    public final String action;

    @InterfaceC65349Pkn("client")
    public final String client;

    @InterfaceC65349Pkn("component")
    public final String component;

    @InterfaceC65349Pkn("element")
    public final String element;

    @InterfaceC65349Pkn("page")
    public final String page;

    @InterfaceC65349Pkn("section")
    public final String section;

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str = this.client;
        int i6 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i7 = i * 31;
        String str2 = this.page;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 31;
        String str3 = this.section;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 31;
        String str4 = this.component;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 31;
        String str5 = this.element;
        if (str5 != null) {
            i5 = str5.hashCode();
        } else {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 31;
        String str6 = this.action;
        if (str6 != null) {
            i6 = str6.hashCode();
        }
        return i11 + i6;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("client=");
        LIZ.append(this.client);
        LIZ.append(", page=");
        LIZ.append(this.page);
        LIZ.append(", section=");
        LIZ.append(this.section);
        LIZ.append(", component=");
        LIZ.append(this.component);
        LIZ.append(", element=");
        LIZ.append(this.element);
        LIZ.append(", action=");
        LIZ.append(this.action);
        return X1D.LIZIZ(LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventNamespace eventNamespace = (EventNamespace) obj;
        String str = this.action;
        if (str == null ? eventNamespace.action != null : !str.equals(eventNamespace.action)) {
            return false;
        }
        String str2 = this.client;
        if (str2 == null ? eventNamespace.client != null : !str2.equals(eventNamespace.client)) {
            return false;
        }
        String str3 = this.component;
        if (str3 == null ? eventNamespace.component != null : !str3.equals(eventNamespace.component)) {
            return false;
        }
        String str4 = this.element;
        if (str4 == null ? eventNamespace.element != null : !str4.equals(eventNamespace.element)) {
            return false;
        }
        String str5 = this.page;
        if (str5 == null ? eventNamespace.page != null : !str5.equals(eventNamespace.page)) {
            return false;
        }
        String str6 = this.section;
        String str7 = eventNamespace.section;
        if (str6 == null ? str7 == null : str6.equals(str7)) {
            return true;
        }
        return false;
    }

    public EventNamespace(String str, String str2, String str3, String str4, String str5, String str6) {
        this.client = str;
        this.page = str2;
        this.section = str3;
        this.component = str4;
        this.element = str5;
        this.action = str6;
    }
}

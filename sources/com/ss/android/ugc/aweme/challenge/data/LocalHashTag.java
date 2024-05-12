package com.ss.android.ugc.aweme.challenge.data;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class LocalHashTag {

    @InterfaceC65349Pkn("is_private")
    public Boolean isPrivate;

    @InterfaceC65349Pkn("name")
    public final String name;

    public final int hashCode() {
        int i;
        String str = this.name;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return (o.LJ(this.isPrivate, Boolean.TRUE) ? 1 : 0) + (i * 31);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!o.LJ(LocalHashTag.class, cls)) {
            return false;
        }
        o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.challenge.data.LocalHashTag");
        LocalHashTag localHashTag = (LocalHashTag) obj;
        if (o.LJ(this.name, localHashTag.name) && o.LJ(this.isPrivate, localHashTag.isPrivate)) {
            return true;
        }
        return false;
    }

    public LocalHashTag(String name, Boolean bool) {
        o.LJIIIZ(name, "name");
        this.name = name;
        this.isPrivate = bool;
    }

    public /* synthetic */ LocalHashTag(String str, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? Boolean.TRUE : bool);
    }
}

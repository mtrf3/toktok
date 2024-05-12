package com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class DisplayNameLang {

    @InterfaceC65349Pkn("en")
    public final String en;

    @InterfaceC65349Pkn("local")
    public final String local;

    /* JADX WARN: Multi-variable type inference failed */
    public DisplayNameLang() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DisplayNameLang copy$default(DisplayNameLang displayNameLang, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = displayNameLang.en;
        }
        if ((i & 2) != 0) {
            str2 = displayNameLang.local;
        }
        return displayNameLang.copy(str, str2);
    }

    public final DisplayNameLang copy(String str, String str2) {
        return new DisplayNameLang(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DisplayNameLang)) {
            return false;
        }
        DisplayNameLang displayNameLang = (DisplayNameLang) obj;
        return o.LJ(this.en, displayNameLang.en) && o.LJ(this.local, displayNameLang.local);
    }

    public int hashCode() {
        String str = this.en;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.local;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DisplayNameLang(en=");
        LIZ.append(this.en);
        LIZ.append(", local=");
        return q.LIZIZ(LIZ, this.local, ')', LIZ);
    }

    public final String getEn() {
        return this.en;
    }

    public final String getLocal() {
        return this.local;
    }

    public DisplayNameLang(String str, String str2) {
        this.en = str;
        this.local = str2;
    }

    public /* synthetic */ DisplayNameLang(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}

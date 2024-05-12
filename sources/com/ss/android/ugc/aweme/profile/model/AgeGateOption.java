package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class AgeGateOption {

    @InterfaceC65349Pkn("content")
    public final String content;

    @InterfaceC65349Pkn("type")
    public final String type;

    @InterfaceC65349Pkn("url")
    public final String url;

    /* JADX WARN: Multi-variable type inference failed */
    public AgeGateOption() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AgeGateOption copy$default(AgeGateOption ageGateOption, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ageGateOption.content;
        }
        if ((i & 2) != 0) {
            str2 = ageGateOption.url;
        }
        if ((i & 4) != 0) {
            str3 = ageGateOption.type;
        }
        return ageGateOption.copy(str, str2, str3);
    }

    public final AgeGateOption copy(String content, String str, String str2) {
        o.LJIIIZ(content, "content");
        return new AgeGateOption(content, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AgeGateOption)) {
            return false;
        }
        AgeGateOption ageGateOption = (AgeGateOption) obj;
        return o.LJ(this.content, ageGateOption.content) && o.LJ(this.url, ageGateOption.url) && o.LJ(this.type, ageGateOption.type);
    }

    public int hashCode() {
        int hashCode = this.content.hashCode() * 31;
        String str = this.url;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.type;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AgeGateOption(content=");
        LIZ.append(this.content);
        LIZ.append(", url=");
        LIZ.append(this.url);
        LIZ.append(", type=");
        return q.LIZIZ(LIZ, this.type, ')', LIZ);
    }

    public AgeGateOption(String content, String str, String str2) {
        o.LJIIIZ(content, "content");
        this.content = content;
        this.url = str;
        this.type = str2;
    }

    public /* synthetic */ AgeGateOption(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "" : str3);
    }
}

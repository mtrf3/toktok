package com.ss.android.ugc.aweme.creatortools.videogift;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class Requirement {

    @InterfaceC65349Pkn("description")
    public final String description;

    @InterfaceC65349Pkn("key")
    public final String key;

    @InterfaceC65349Pkn("status")
    public final Integer status;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Requirement)) {
            return false;
        }
        Requirement requirement = (Requirement) obj;
        return o.LJ(this.description, requirement.description) && o.LJ(this.key, requirement.key) && o.LJ(this.status, requirement.status);
    }

    public final int hashCode() {
        String str = this.description;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.key;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.status;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Requirement(description=");
        LIZ.append(this.description);
        LIZ.append(", key=");
        LIZ.append(this.key);
        LIZ.append(", status=");
        return s0.LIZJ(LIZ, this.status, ')', LIZ);
    }

    public Requirement(String str, String str2, Integer num) {
        this.description = str;
        this.key = str2;
        this.status = num;
    }
}

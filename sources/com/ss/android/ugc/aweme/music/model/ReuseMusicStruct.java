package com.ss.android.ugc.aweme.music.model;

import X.C78920UyC;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ReuseMusicStruct implements Serializable {
    public final String authorName;
    public final String id;
    public final Boolean isPgc;
    public final String musicName;

    /* JADX WARN: Multi-variable type inference failed */
    public ReuseMusicStruct() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ReuseMusicStruct copy$default(ReuseMusicStruct reuseMusicStruct, String str, String str2, String str3, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reuseMusicStruct.id;
        }
        if ((i & 2) != 0) {
            str2 = reuseMusicStruct.musicName;
        }
        if ((i & 4) != 0) {
            str3 = reuseMusicStruct.authorName;
        }
        if ((i & 8) != 0) {
            bool = reuseMusicStruct.isPgc;
        }
        return reuseMusicStruct.copy(str, str2, str3, bool);
    }

    public final ReuseMusicStruct copy(String str, String str2, String str3, Boolean bool) {
        return new ReuseMusicStruct(str, str2, str3, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReuseMusicStruct)) {
            return false;
        }
        ReuseMusicStruct reuseMusicStruct = (ReuseMusicStruct) obj;
        return o.LJ(this.id, reuseMusicStruct.id) && o.LJ(this.musicName, reuseMusicStruct.musicName) && o.LJ(this.authorName, reuseMusicStruct.authorName) && o.LJ(this.isPgc, reuseMusicStruct.isPgc);
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.musicName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.authorName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isPgc;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String getId() {
        String str = this.id;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String getTitle() {
        boolean z;
        String str;
        String str2;
        String str3 = this.musicName;
        boolean z2 = false;
        if (str3 == null || str3.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = !z;
        String str4 = this.authorName;
        if (str4 == null || str4.length() == 0) {
            z2 = true;
        }
        boolean z4 = !z2;
        if (z3 && z4 && isPgc()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.musicName);
            LIZ.append(" - ");
            LIZ.append(this.authorName);
            return X1D.LIZIZ(LIZ);
        }
        if (z3) {
            if ((!z4 || !isPgc()) && (str2 = this.musicName) != null) {
                return str2;
            }
        } else if (z4 && (str = this.authorName) != null) {
            return str;
        }
        return "";
    }

    public final boolean isPgc() {
        return o.LJ(this.isPgc, Boolean.TRUE);
    }

    public final boolean isValid() {
        if (getId().length() > 0 && getTitle().length() > 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReuseMusicStruct(id=");
        LIZ.append(this.id);
        LIZ.append(", musicName=");
        LIZ.append(this.musicName);
        LIZ.append(", authorName=");
        LIZ.append(this.authorName);
        LIZ.append(", isPgc=");
        return C78920UyC.LIZIZ(LIZ, this.isPgc, ')', LIZ);
    }

    public ReuseMusicStruct(String str, String str2, String str3, Boolean bool) {
        this.id = str;
        this.musicName = str2;
        this.authorName = str3;
        this.isPgc = bool;
    }

    public /* synthetic */ ReuseMusicStruct(String str, String str2, String str3, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : bool);
    }
}

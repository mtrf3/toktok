package com.kakao.sdk.user.model;

import X.C1FL;
import X.C78920UyC;
import X.C79062V1e;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class Scope implements Parcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new Creator();
    public final boolean agreed;
    public final Boolean delegated;
    public final String displayName;
    public final String id;
    public final Boolean revocable;
    public final ScopeType type;
    public final boolean using;

    /* loaded from: classes12.dex */
    public static final class Creator implements Parcelable.Creator<Scope> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Scope createFromParcel(Parcel parcel) {
            Boolean valueOf;
            o.LJIIIZ(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            ScopeType valueOf2 = ScopeType.valueOf(parcel.readString());
            boolean z = parcel.readInt() != 0;
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new Scope(readString, readString2, valueOf2, z, valueOf, z2, bool);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Scope[] newArray(int i) {
            return new Scope[i];
        }
    }

    public static /* synthetic */ Scope copy$default(Scope scope, String str, String str2, ScopeType scopeType, boolean z, Boolean bool, boolean z2, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = scope.id;
        }
        if ((i & 2) != 0) {
            str2 = scope.displayName;
        }
        if ((i & 4) != 0) {
            scopeType = scope.type;
        }
        if ((i & 8) != 0) {
            z = scope.using;
        }
        if ((i & 16) != 0) {
            bool = scope.delegated;
        }
        if ((i & 32) != 0) {
            z2 = scope.agreed;
        }
        if ((i & 64) != 0) {
            bool2 = scope.revocable;
        }
        return scope.copy(str, str2, scopeType, z, bool, z2, bool2);
    }

    public final Scope copy(String id, String displayName, ScopeType type, boolean z, Boolean bool, boolean z2, Boolean bool2) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(displayName, "displayName");
        o.LJIIIZ(type, "type");
        return new Scope(id, displayName, type, z, bool, z2, bool2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        Scope scope = (Scope) obj;
        return o.LJ(this.id, scope.id) && o.LJ(this.displayName, scope.displayName) && this.type == scope.type && this.using == scope.using && o.LJ(this.delegated, scope.delegated) && this.agreed == scope.agreed && o.LJ(this.revocable, scope.revocable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.type.hashCode() + C79062V1e.LJ(this.displayName, this.id.hashCode() * 31, 31)) * 31;
        boolean z = this.using;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (hashCode2 + i2) * 31;
        Boolean bool = this.delegated;
        int i4 = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i5 = (i3 + hashCode) * 31;
        if (!this.agreed) {
            i = 0;
        }
        int i6 = (i5 + i) * 31;
        Boolean bool2 = this.revocable;
        if (bool2 != null) {
            i4 = bool2.hashCode();
        }
        return i6 + i4;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Scope(id=");
        LIZ.append(this.id);
        LIZ.append(", displayName=");
        LIZ.append(this.displayName);
        LIZ.append(", type=");
        LIZ.append(this.type);
        LIZ.append(", using=");
        LIZ.append(this.using);
        LIZ.append(", delegated=");
        LIZ.append(this.delegated);
        LIZ.append(", agreed=");
        LIZ.append(this.agreed);
        LIZ.append(", revocable=");
        return C78920UyC.LIZIZ(LIZ, this.revocable, ')', LIZ);
    }

    public final boolean getAgreed() {
        return this.agreed;
    }

    public final Boolean getDelegated() {
        return this.delegated;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getId() {
        return this.id;
    }

    public final Boolean getRevocable() {
        return this.revocable;
    }

    public final ScopeType getType() {
        return this.type;
    }

    public final boolean getUsing() {
        return this.using;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.id);
        out.writeString(this.displayName);
        out.writeString(this.type.name());
        out.writeInt(this.using ? 1 : 0);
        Boolean bool = this.delegated;
        if (bool == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool);
        }
        out.writeInt(this.agreed ? 1 : 0);
        Boolean bool2 = this.revocable;
        if (bool2 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool2);
        }
    }

    public Scope(String id, String displayName, ScopeType type, boolean z, Boolean bool, boolean z2, Boolean bool2) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(displayName, "displayName");
        o.LJIIIZ(type, "type");
        this.id = id;
        this.displayName = displayName;
        this.type = type;
        this.using = z;
        this.delegated = bool;
        this.agreed = z2;
        this.revocable = bool2;
    }
}

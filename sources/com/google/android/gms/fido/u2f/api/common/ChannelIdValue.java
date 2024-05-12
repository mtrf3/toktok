package com.google.android.gms.fido.u2f.api.common;

import X.C67615QgF;
import X.C67616QgG;
import X.C67617QgH;
import X.C79057V0z;
import X.V0N;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public class ChannelIdValue extends AbstractSafeParcelable {
    public final ChannelIdValueType zza;
    public final String zzb;
    public final String zzc;
    public static final Parcelable.Creator<ChannelIdValue> CREATOR = new C67615QgF();
    public static final ChannelIdValue ABSENT = new ChannelIdValue();
    public static final ChannelIdValue UNAVAILABLE = new ChannelIdValue("unavailable");
    public static final ChannelIdValue UNUSED = new ChannelIdValue("unused");

    public final int hashCode() {
        int i;
        int hashCode;
        int hashCode2 = this.zza.hashCode() + 31;
        int ordinal = this.zza.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                return hashCode2;
            }
            i = hashCode2 * 31;
            hashCode = this.zzc.hashCode();
        } else {
            i = hashCode2 * 31;
            hashCode = this.zzb.hashCode();
        }
        return hashCode + i;
    }

    public ChannelIdValue() {
        this.zza = ChannelIdValueType.ABSENT;
    }

    /* loaded from: classes12.dex */
    public enum ChannelIdValueType implements Parcelable {
        ABSENT(0),
        STRING(1),
        OBJECT(2);

        public static final Parcelable.Creator<ChannelIdValueType> CREATOR = new C67616QgG();
        public final int zzb;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public static ChannelIdValueType valueOf(String str) {
            return (ChannelIdValueType) V0N.LJJJ(ChannelIdValueType.class, str);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.zzb);
        }

        ChannelIdValueType(int i) {
            this.zzb = i;
        }
    }

    public ChannelIdValue(String str) {
        this.zzb = str;
        this.zza = ChannelIdValueType.STRING;
        this.zzc = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelIdValue)) {
            return false;
        }
        ChannelIdValue channelIdValue = (ChannelIdValue) obj;
        if (!this.zza.equals(channelIdValue.zza)) {
            return false;
        }
        int ordinal = this.zza.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                return false;
            }
            return this.zzc.equals(channelIdValue.zzc);
        }
        return this.zzb.equals(channelIdValue.zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 2, this.zza.zzb);
        C79057V0z.LJJZZIII(parcel, 3, this.zzb, false);
        C79057V0z.LJJZZIII(parcel, 4, this.zzc, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public ChannelIdValue(int i, String str, String str2) {
        try {
            for (ChannelIdValueType channelIdValueType : ChannelIdValueType.values()) {
                if (i == channelIdValueType.zzb) {
                    this.zza = channelIdValueType;
                    this.zzb = str;
                    this.zzc = str2;
                    return;
                }
            }
            throw new C67617QgH(i);
        } catch (C67617QgH e) {
            throw new IllegalArgumentException(e);
        }
    }
}

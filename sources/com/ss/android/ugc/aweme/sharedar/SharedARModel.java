package com.ss.android.ugc.aweme.sharedar;

import X.HXD;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class SharedARModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<SharedARModel> CREATOR = new HXD();

    @InterfaceC65349Pkn("is_current_user_host")
    public boolean isCurrentUserHost;

    @InterfaceC65349Pkn("shared_ar_multi_player_user_id")
    public String sharedARMultiPlayerUserId;

    @InterfaceC65349Pkn("shared_ar_multi_player_user_name")
    public String sharedARMultiPlayerUserName;

    @InterfaceC65349Pkn("shared_ar_session_id")
    public String sharedARSessionId;

    @InterfaceC65349Pkn("shared_ar_telco")
    public String sharedARTelco;

    /* JADX WARN: Multi-variable type inference failed */
    public SharedARModel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SharedARModel copy$default(SharedARModel sharedARModel, String str, String str2, String str3, boolean z, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sharedARModel.sharedARMultiPlayerUserId;
        }
        if ((i & 2) != 0) {
            str2 = sharedARModel.sharedARMultiPlayerUserName;
        }
        if ((i & 4) != 0) {
            str3 = sharedARModel.sharedARSessionId;
        }
        if ((i & 8) != 0) {
            z = sharedARModel.isCurrentUserHost;
        }
        if ((i & 16) != 0) {
            str4 = sharedARModel.sharedARTelco;
        }
        return sharedARModel.copy(str, str2, str3, z, str4);
    }

    public final SharedARModel copy(String str, String str2, String str3, boolean z, String str4) {
        return new SharedARModel(str, str2, str3, z, str4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharedARModel)) {
            return false;
        }
        SharedARModel sharedARModel = (SharedARModel) obj;
        return o.LJ(this.sharedARMultiPlayerUserId, sharedARModel.sharedARMultiPlayerUserId) && o.LJ(this.sharedARMultiPlayerUserName, sharedARModel.sharedARMultiPlayerUserName) && o.LJ(this.sharedARSessionId, sharedARModel.sharedARSessionId) && this.isCurrentUserHost == sharedARModel.isCurrentUserHost && o.LJ(this.sharedARTelco, sharedARModel.sharedARTelco);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.sharedARMultiPlayerUserId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sharedARMultiPlayerUserName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sharedARSessionId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z = this.isCurrentUserHost;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode3 + i) * 31;
        String str4 = this.sharedARTelco;
        return i2 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.sharedARMultiPlayerUserId);
        out.writeString(this.sharedARMultiPlayerUserName);
        out.writeString(this.sharedARSessionId);
        out.writeInt(this.isCurrentUserHost ? 1 : 0);
        out.writeString(this.sharedARTelco);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SharedARModel(sharedARMultiPlayerUserId=");
        LIZ.append(this.sharedARMultiPlayerUserId);
        LIZ.append(", sharedARMultiPlayerUserName=");
        LIZ.append(this.sharedARMultiPlayerUserName);
        LIZ.append(", sharedARSessionId=");
        LIZ.append(this.sharedARSessionId);
        LIZ.append(", isCurrentUserHost=");
        LIZ.append(this.isCurrentUserHost);
        LIZ.append(", sharedARTelco=");
        return q.LIZIZ(LIZ, this.sharedARTelco, ')', LIZ);
    }

    public final String getSharedARMultiPlayerUserId() {
        return this.sharedARMultiPlayerUserId;
    }

    public final String getSharedARMultiPlayerUserName() {
        return this.sharedARMultiPlayerUserName;
    }

    public final String getSharedARSessionId() {
        return this.sharedARSessionId;
    }

    public final String getSharedARTelco() {
        return this.sharedARTelco;
    }

    public final boolean isCurrentUserHost() {
        return this.isCurrentUserHost;
    }

    public final void setCurrentUserHost(boolean z) {
        this.isCurrentUserHost = z;
    }

    public final void setSharedARMultiPlayerUserId(String str) {
        this.sharedARMultiPlayerUserId = str;
    }

    public final void setSharedARMultiPlayerUserName(String str) {
        this.sharedARMultiPlayerUserName = str;
    }

    public final void setSharedARSessionId(String str) {
        this.sharedARSessionId = str;
    }

    public final void setSharedARTelco(String str) {
        this.sharedARTelco = str;
    }

    public SharedARModel(String str, String str2, String str3, boolean z, String str4) {
        this.sharedARMultiPlayerUserId = str;
        this.sharedARMultiPlayerUserName = str2;
        this.sharedARSessionId = str3;
        this.isCurrentUserHost = z;
        this.sharedARTelco = str4;
    }

    public /* synthetic */ SharedARModel(String str, String str2, String str3, boolean z, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? false : z, (i & 16) == 0 ? str4 : null);
    }
}

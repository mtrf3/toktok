package com.google.android.gms.common;

import X.C64362PNu;
import X.C64363PNv;
import X.C67343Qbr;
import X.C79057V0z;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes12.dex */
public final class ConnectionResult extends AbstractSafeParcelable {
    public static final int DRIVE_EXTERNAL_STORAGE_REQUIRED = 1500;
    public final int LJLIL;
    public final int zzb;
    public final PendingIntent zzc;
    public final String zzd;
    public static final ConnectionResult RESULT_SUCCESS = new ConnectionResult(0);
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new C67343Qbr();

    public ConnectionResult() {
        throw null;
    }

    public ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str) {
        this.LJLIL = i;
        this.zzb = i2;
        this.zzc = pendingIntent;
        this.zzd = str;
    }

    public final boolean LJJJJL() {
        return (this.zzb == 0 || this.zzc == null) ? false : true;
    }

    public final boolean LJJJJZ() {
        return this.zzb == 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzb), this.zzc, this.zzd});
    }

    public final String toString() {
        C64362PNu c64362PNu = new C64362PNu(this);
        c64362PNu.LIZ(LJJJJZI(this.zzb), "statusCode");
        c64362PNu.LIZ(this.zzc, "resolution");
        c64362PNu.LIZ(this.zzd, "message");
        return c64362PNu.toString();
    }

    public ConnectionResult(int i) {
        this(1, i, null, null);
    }

    public static String LJJJJZI(int i) {
        if (i != 99) {
            if (i != 1500) {
                switch (i) {
                    case -1:
                        return "UNKNOWN";
                    case 0:
                        return "SUCCESS";
                    case 1:
                        return "SERVICE_MISSING";
                    case 2:
                        return "SERVICE_VERSION_UPDATE_REQUIRED";
                    case 3:
                        return "SERVICE_DISABLED";
                    case 4:
                        return "SIGN_IN_REQUIRED";
                    case 5:
                        return "INVALID_ACCOUNT";
                    case 6:
                        return "RESOLUTION_REQUIRED";
                    case 7:
                        return "NETWORK_ERROR";
                    case 8:
                        return "INTERNAL_ERROR";
                    case 9:
                        return "SERVICE_INVALID";
                    case 10:
                        return "DEVELOPER_ERROR";
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        return "LICENSE_CHECK_FAILED";
                    default:
                        switch (i) {
                            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                                return "CANCELED";
                            case 14:
                                return "TIMEOUT";
                            case 15:
                                return "INTERRUPTED";
                            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                                return "API_UNAVAILABLE";
                            case 17:
                                return "SIGN_IN_FAILED";
                            case 18:
                                return "SERVICE_UPDATING";
                            case 19:
                                return "SERVICE_MISSING_PERMISSION";
                            case 20:
                                return "RESTRICTED_PROFILE";
                            case 21:
                                return "API_VERSION_UPDATE_REQUIRED";
                            case 22:
                                return "RESOLUTION_ACTIVITY_NOT_FOUND";
                            case 23:
                                return "API_DISABLED";
                            case 24:
                                return "API_DISABLED_FOR_CONNECTION";
                            default:
                                StringBuilder sb = new StringBuilder(31);
                                sb.append("UNKNOWN_ERROR_CODE(");
                                sb.append(i);
                                sb.append(")");
                                return sb.toString();
                        }
                }
            }
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        return "UNFINISHED";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        if (this.zzb == connectionResult.zzb && C64363PNv.LIZ(this.zzc, connectionResult.zzc) && C64363PNv.LIZ(this.zzd, connectionResult.zzd)) {
            return true;
        }
        return false;
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(1, i, pendingIntent, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1, this.LJLIL);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 2, this.zzb);
        C79057V0z.LJJZZI(parcel, 3, this.zzc, i, false);
        C79057V0z.LJJZZIII(parcel, 4, this.zzd, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}

package com.google.android.gms.cast;

import X.C16880lQ;
import X.C79057V0z;
import X.C90058ZWc;
import X.C90468Zey;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes29.dex */
public class LaunchOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LaunchOptions> CREATOR = new C90058ZWc();
    public boolean zza;
    public String zzb;
    public boolean zzc;
    public CredentialsData zzd;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.zza), this.zzb, Boolean.valueOf(this.zzc), this.zzd});
    }

    public final String toString() {
        return C16880lQ.LLLZ("LaunchOptions(relaunchIfRunning=%b, language=%s, androidReceiverCompatible: %b)", new Object[]{Boolean.valueOf(this.zza), this.zzb, Boolean.valueOf(this.zzc)});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LaunchOptions() {
        /*
            r5 = this;
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r0 = 20
            r3.<init>(r0)
            java.lang.String r0 = r4.getLanguage()
            r3.append(r0)
            java.lang.String r1 = r4.getCountry()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            r2 = 45
            if (r0 != 0) goto L25
            r3.append(r2)
            r3.append(r1)
        L25:
            java.lang.String r1 = r4.getVariant()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L35
            r3.append(r2)
            r3.append(r1)
        L35:
            java.lang.String r2 = r3.toString()
            r1 = 0
            r0 = 0
            r5.<init>(r0, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.LaunchOptions.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LaunchOptions)) {
            return false;
        }
        LaunchOptions launchOptions = (LaunchOptions) obj;
        if (this.zza == launchOptions.zza && C90468Zey.LJFF(this.zzb, launchOptions.zzb) && this.zzc == launchOptions.zzc && C90468Zey.LJFF(this.zzd, launchOptions.zzd)) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJJZ(parcel, 2, this.zza);
        C79057V0z.LJJZZIII(parcel, 3, this.zzb, false);
        C79057V0z.LJJJZ(parcel, 4, this.zzc);
        C79057V0z.LJJZZI(parcel, 5, this.zzd, i, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public LaunchOptions(boolean z, String str, boolean z2, CredentialsData credentialsData) {
        this.zza = z;
        this.zzb = str;
        this.zzc = z2;
        this.zzd = credentialsData;
    }
}

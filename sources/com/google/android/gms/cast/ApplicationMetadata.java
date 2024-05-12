package com.google.android.gms.cast;

import X.C79057V0z;
import X.C90078ZWw;
import X.C90468Zey;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes29.dex */
public class ApplicationMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ApplicationMetadata> CREATOR = new C90078ZWw();
    public final List<String> LJLIL;
    public final Uri LJLILLLLZI;
    public final String LJLJI;
    public String zza;
    public String zzb;
    public String zzd;
    public String zzg;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.LJLIL, this.zzd, this.LJLILLLLZI, this.LJLJI});
    }

    public final String toString() {
        int size;
        String str = this.zza;
        String str2 = this.zzb;
        List<String> list = this.LJLIL;
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        String str3 = this.zzd;
        String valueOf = String.valueOf(this.LJLILLLLZI);
        String str4 = this.LJLJI;
        String str5 = this.zzg;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        int length4 = valueOf.length();
        int length5 = String.valueOf(str4).length();
        StringBuilder sb = new StringBuilder(length + 118 + length2 + length3 + length4 + length5 + String.valueOf(str5).length());
        sb.append("applicationId: ");
        sb.append(str);
        sb.append(", name: ");
        sb.append(str2);
        sb.append(", namespaces.count: ");
        sb.append(size);
        sb.append(", senderAppIdentifier: ");
        sb.append(str3);
        sb.append(", senderAppLaunchUrl: ");
        sb.append(valueOf);
        sb.append(", iconUrl: ");
        sb.append(str4);
        sb.append(", type: ");
        sb.append(str5);
        return sb.toString();
    }

    public ApplicationMetadata() {
        this.LJLIL = new ArrayList();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ApplicationMetadata)) {
            return false;
        }
        ApplicationMetadata applicationMetadata = (ApplicationMetadata) obj;
        if (C90468Zey.LJFF(this.zza, applicationMetadata.zza) && C90468Zey.LJFF(this.zzb, applicationMetadata.zzb) && C90468Zey.LJFF(this.LJLIL, applicationMetadata.LJLIL) && C90468Zey.LJFF(this.zzd, applicationMetadata.zzd) && C90468Zey.LJFF(this.LJLILLLLZI, applicationMetadata.LJLILLLLZI) && C90468Zey.LJFF(this.LJLJI, applicationMetadata.LJLJI) && C90468Zey.LJFF(this.zzg, applicationMetadata.zzg)) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZIII(parcel, 2, this.zza, false);
        C79057V0z.LJJZZIII(parcel, 3, this.zzb, false);
        C79057V0z.LJLIIL(parcel, 4, null, false);
        C79057V0z.LJLI(parcel, 5, Collections.unmodifiableList(this.LJLIL));
        C79057V0z.LJJZZIII(parcel, 6, this.zzd, false);
        C79057V0z.LJJZZI(parcel, 7, this.LJLILLLLZI, i, false);
        C79057V0z.LJJZZIII(parcel, 8, this.LJLJI, false);
        C79057V0z.LJJZZIII(parcel, 9, this.zzg, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public ApplicationMetadata(String str, String str2, List list, String str3, Uri uri, String str4, String str5) {
        this.zza = str;
        this.zzb = str2;
        this.LJLIL = list;
        this.zzd = str3;
        this.LJLILLLLZI = uri;
        this.LJLJI = str4;
        this.zzg = str5;
    }
}

package com.google.android.gms.internal.ads;

import X.C1FL;
import X.C79057V0z;
import X.C87155YIl;
import X.C87195YJz;
import X.YJO;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.IOException;

/* loaded from: classes16.dex */
public final class zzbqq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbqq> CREATOR = new C87195YJz();
    public final int versionCode;
    public YJO zzfgt;
    public byte[] zzfgu;

    public zzbqq(int i, byte[] bArr) {
        this.versionCode = i;
        this.zzfgu = bArr;
        if (this.zzfgt == null) {
            if (bArr != null) {
            } else {
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        } else if (bArr == null) {
        } else {
            throw new IllegalStateException("Invalid internal representation - full");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1, this.versionCode);
        byte[] bArr = this.zzfgu;
        if (bArr == null) {
            YJO yjo = this.zzfgt;
            yjo.getClass();
            try {
                int LIZLLL = yjo.LIZLLL();
                bArr = new byte[LIZLLL];
                C87155YIl c87155YIl = new C87155YIl(bArr, LIZLLL);
                yjo.LIZ(c87155YIl);
                if (c87155YIl.LJII() != 0) {
                    throw new IllegalStateException("Did not write as much data as expected.");
                }
            } catch (IOException e) {
                String name = YJO.class.getName();
                StringBuilder sb = new StringBuilder(C1FL.LIZ(name, 62, 10));
                sb.append("Serializing ");
                sb.append(name);
                sb.append(" to a byte array threw an IOException (should never happen).");
                throw new RuntimeException(sb.toString(), e);
            }
        }
        C79057V0z.LJJLIIIJ(parcel, 2, bArr, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}

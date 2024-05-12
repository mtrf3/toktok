package com.google.android.gms.common.internal;

import X.C67258QaU;
import X.C67865QkH;
import X.C67883QkZ;
import X.InterfaceC67936QlQ;
import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new C67865QkH();
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public String LJLJJI;
    public IBinder LJLJJL;
    public Scope[] LJLJJLL;
    public Account LJLJL;
    public Feature[] LJLJLJ;
    public Feature[] LJLJLLL;
    public final boolean LJLL;
    public final int LJLLI;
    public boolean LJLLILLLL;
    public Bundle zzg;
    public String zzn;

    public GetServiceRequest(int i, String str) {
        this.LJLIL = 6;
        this.LJLJI = C67258QaU.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        this.LJLILLLLZI = i;
        this.LJLL = true;
        this.zzn = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C67865QkH.LIZ(this, parcel, i);
    }

    public GetServiceRequest(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z, int i4, boolean z2, String str2) {
        InterfaceC67936QlQ c67883QkZ;
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = i3;
        if ("com.google.android.gms".equals(str)) {
            this.LJLJJI = "com.google.android.gms";
        } else {
            this.LJLJJI = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface instanceof InterfaceC67936QlQ) {
                    c67883QkZ = (InterfaceC67936QlQ) queryLocalInterface;
                } else {
                    c67883QkZ = new C67883QkZ(iBinder);
                }
                if (c67883QkZ != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        account2 = c67883QkZ.LIZ();
                    } catch (RemoteException unused) {
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        throw th;
                    }
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
            this.LJLJL = account2;
        } else {
            this.LJLJJL = iBinder;
            this.LJLJL = account;
        }
        this.LJLJJLL = scopeArr;
        this.zzg = bundle;
        this.LJLJLJ = featureArr;
        this.LJLJLLL = featureArr2;
        this.LJLL = z;
        this.LJLLI = i4;
        this.LJLLILLLL = z2;
        this.zzn = str2;
    }
}

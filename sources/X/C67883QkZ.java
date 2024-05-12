package X;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: X.QkZ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67883QkZ extends C67884Qka implements InterfaceC67936QlQ {
    @Override // X.InterfaceC67936QlQ
    public final Account LIZ() {
        Parcel LJLJI = LJLJI(LLJI(), 2);
        Account account = (Account) C67609Qg9.LIZ(LJLJI, Account.CREATOR);
        LJLJI.recycle();
        return account;
    }

    public C67883QkZ(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }
}

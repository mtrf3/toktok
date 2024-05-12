package X;

import android.accounts.Account;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: X.Qhc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67700Qhc {
    public final java.util.Set<Scope> LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public String LJ;
    public final Account LJFF;
    public final String LJI;
    public final java.util.Map<Integer, GoogleSignInOptionsExtensionParcelable> LJII;
    public String LJIIIIZZ;

    public final GoogleSignInOptions LIZ() {
        if (((HashSet) this.LIZ).contains(GoogleSignInOptions.zae)) {
            java.util.Set<Scope> set = this.LIZ;
            Scope scope = GoogleSignInOptions.zad;
            if (((HashSet) set).contains(scope)) {
                ((HashSet) this.LIZ).remove(scope);
            }
        }
        if (this.LIZLLL && (this.LJFF == null || !((HashSet) this.LIZ).isEmpty())) {
            ((HashSet) this.LIZ).add(GoogleSignInOptions.zac);
        }
        return new GoogleSignInOptions(3, new ArrayList(this.LIZ), this.LJFF, this.LIZLLL, this.LIZIZ, this.LIZJ, this.LJ, this.LJI, this.LJII, this.LJIIIIZZ);
    }

    public C67700Qhc() {
        this.LIZ = new HashSet();
        this.LJII = new HashMap();
    }

    public C67700Qhc(GoogleSignInOptions googleSignInOptions) {
        ArrayList arrayList;
        String str;
        this.LIZ = new HashSet();
        this.LJII = new HashMap();
        QH7.LJIIIIZZ(googleSignInOptions);
        arrayList = googleSignInOptions.zah;
        this.LIZ = new HashSet(arrayList);
        this.LIZIZ = googleSignInOptions.zak;
        this.LIZJ = googleSignInOptions.zal;
        this.LIZLLL = googleSignInOptions.zaj;
        this.LJ = googleSignInOptions.zam;
        this.LJFF = googleSignInOptions.zai;
        str = googleSignInOptions.zan;
        this.LJI = str;
        this.LJII = GoogleSignInOptions.LJJLIIIIJ(googleSignInOptions.zao);
        this.LJIIIIZZ = googleSignInOptions.zap;
    }
}

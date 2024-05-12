package X;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;

/* renamed from: X.QhV, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractBinderC67693QhV extends BinderC67696QhY {
    public AbstractBinderC67693QhV() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // X.BinderC67696QhY
    public final boolean LJLJI(int i, Parcel parcel, Parcel parcel2) {
        BasePendingResult basePendingResult;
        boolean z = false;
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            BinderC67267Qad binderC67267Qad = (BinderC67267Qad) this;
            binderC67267Qad.LLJI();
            C67691QhT.LIZ(binderC67267Qad.LJLIL).LIZIZ();
        } else {
            BinderC67267Qad binderC67267Qad2 = (BinderC67267Qad) this;
            binderC67267Qad2.LLJI();
            C67690QhS LIZ = C67690QhS.LIZ(binderC67267Qad2.LJLIL);
            GoogleSignInAccount LIZIZ = LIZ.LIZIZ();
            GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.DEFAULT_SIGN_IN;
            if (LIZIZ != null) {
                googleSignInOptions = LIZ.LIZJ();
            }
            Context context = binderC67267Qad2.LJLIL;
            QH7.LJIIIIZZ(googleSignInOptions);
            GoogleSignInClient googleSignInClient = new GoogleSignInClient(context, googleSignInOptions);
            if (LIZIZ != null) {
                C67727Qi3 c67727Qi3 = googleSignInClient.LJII;
                Context context2 = googleSignInClient.LIZ;
                if (googleSignInClient.LJ() == 3) {
                    z = true;
                }
                C67692QhU.LIZ.getClass();
                String LJ = C67690QhS.LIZ(context2).LJ("refreshToken");
                C67692QhU.LIZJ(context2);
                if (z) {
                    if (LJ == null) {
                        Status status = new Status(4, null, null);
                        QH7.LIZ("Status code must not be SUCCESS", !status.LJJJJL());
                        BasePendingResult c67741QiH = new C67741QiH(status);
                        c67741QiH.LIZ(status);
                        basePendingResult = c67741QiH;
                    } else {
                        P9N p9n = new P9N(LJ);
                        new PthreadThread(p9n, "/internal/zbb").start();
                        basePendingResult = p9n.LJLILLLLZI;
                    }
                } else {
                    C67985QmD c67985QmD = new C67985QmD(c67727Qi3);
                    c67727Qi3.LJLJI.LIZJ(1, c67985QmD);
                    basePendingResult = c67985QmD;
                }
                basePendingResult.LIZJ(new C67746QiM(basePendingResult, new C67649Qgn(), new C67697QhZ()));
            } else {
                C67727Qi3 c67727Qi32 = googleSignInClient.LJII;
                Context context3 = googleSignInClient.LIZ;
                if (googleSignInClient.LJ() == 3) {
                    z = true;
                }
                BasePendingResult LIZIZ2 = C67692QhU.LIZIZ(c67727Qi32, context3, z);
                LIZIZ2.LIZJ(new C67746QiM(LIZIZ2, new C67649Qgn(), new C67697QhZ()));
            }
        }
        return true;
    }
}

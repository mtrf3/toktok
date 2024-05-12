package X;

import aj2.c;
import android.app.Application;
import android.text.TextUtils;
import com.bytedance.bpea.basics.Cert;
import org.json.JSONArray;
import rj2.a$a;

/* renamed from: X.16m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C276016m {
    public final Application LIZ;
    public String LIZIZ;
    public JSONArray LIZJ;
    public JSONArray LIZLLL;
    public JSONArray LJ;
    public String LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public InterfaceC06380Mw LJIIIZ;
    public String LJIIJ;
    public AbstractC66805QJt LJIIJJI;
    public String LJIIL;
    public String LJIILIIL;
    public C0RF LJIILJJIL;
    public String LJIILL;
    public Cert LJIILLIIL;
    public Cert LJIIZILJ;
    public final Cert LJIJ;
    public String LJIJI;
    public InterfaceC269413y LJIJJ;
    public c LJIJJLI;
    public a$a LJIL;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("{mContext=");
        LIZ.append(this.LIZ);
        LIZ.append(", mHost='");
        Q89.LIZIZ(LIZ, this.LIZIZ, '\'', ", mBankCardRules=");
        LIZ.append(this.LIZJ);
        LIZ.append(", mMethods=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", mStoredMethods=");
        LIZ.append(this.LJ);
        LIZ.append(", mOrgId='");
        Q89.LIZIZ(LIZ, this.LJFF, '\'', ", mMerchantId='");
        Q89.LIZIZ(LIZ, this.LJI, '\'', ", mSessionId='");
        Q89.LIZIZ(LIZ, this.LJII, '\'', ", mRsaPublicKey='");
        return C77800Ug8.LIZJ(LIZ, this.LJIIIIZZ, '\'', '}', LIZ);
    }

    public C276016m(C275916l c275916l) {
        this.LIZ = c275916l.LIZ;
        String str = c275916l.LIZIZ;
        this.LIZIZ = str;
        this.LIZJ = c275916l.LIZLLL;
        this.LIZLLL = c275916l.LJ;
        this.LJ = c275916l.LJFF;
        this.LJFF = c275916l.LJI;
        this.LJI = c275916l.LJII;
        this.LJII = c275916l.LJIIIIZZ;
        this.LJIIIIZZ = c275916l.LJIIIZ;
        this.LJIIIZ = c275916l.LJIIJ;
        this.LJIIJ = c275916l.LJIIJJI;
        this.LJIIJJI = c275916l.LJIIL;
        this.LJIIL = null;
        this.LJIILIIL = null;
        this.LJIILJJIL = c275916l.LJIILIIL;
        this.LJIILL = c275916l.LJIILJJIL;
        this.LJIILLIIL = c275916l.LJIILL;
        this.LJIJ = c275916l.LJIIZILJ;
        this.LJIJI = c275916l.LJIJ;
        this.LJIJJ = c275916l.LJIJI;
        this.LJIJJLI = c275916l.LJIJJ;
        this.LJIL = c275916l.LJIJJLI;
        if (!TextUtils.isEmpty(str)) {
            C48559J3z.LJIIIIZZ = this.LIZIZ;
        }
    }
}

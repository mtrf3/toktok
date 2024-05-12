package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.1Hd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30371Hd extends AbstractC004800e<C1NT> {
    public final C06360Mu LIZ;
    public C1NT LIZIZ;
    public C1OZ LIZJ;
    public C0R7 LIZLLL;

    @Override // X.AbstractC004800e
    public final void LIZ() {
    }

    @Override // X.AbstractC004800e
    public final void LIZIZ() {
        LJII(false);
    }

    @Override // X.AbstractC004800e
    public final void LIZJ() {
        LJII(true);
    }

    @Override // X.AbstractC004800e
    public final void LJ() {
    }

    @Override // X.AbstractC004800e
    public final void LIZLLL() {
        C08650Vp c08650Vp = new C08650Vp();
        C06360Mu c06360Mu = this.LIZ;
        c08650Vp.LIZ = c06360Mu.LIZ;
        c08650Vp.LIZIZ = c06360Mu.LIZIZ;
        this.LIZIZ = new C1NT(c08650Vp);
        this.LIZLLL = new C0R7(this, this.LIZ.LIZJ);
        this.LIZJ = new C1OZ(this);
    }

    public final void LJI() {
        C0Y3 LIZ;
        C39281gS c39281gS = C35191Zr.LIZIZ().LIZJ;
        List<C38531fF> list = null;
        if (c39281gS == null || TextUtils.isEmpty("c2s")) {
            return;
        }
        if (c39281gS.LIZLLL == null) {
            c39281gS.LIZLLL = new HashMap();
        }
        JSONObject jSONObject = (JSONObject) ((HashMap) c39281gS.LIZLLL).get("c2s");
        if (jSONObject == null) {
            return;
        }
        this.LIZIZ.LIZIZ(jSONObject);
        C1OZ c1oz = this.LIZJ;
        int i = this.LIZIZ.LIZJ;
        if ((i == c1oz.LJLIL && c1oz.LJLILLLLZI != null) || (LIZ = C1OZ.LIZ(i)) == null) {
            return;
        }
        C0Y3 c0y3 = c1oz.LJLILLLLZI;
        if (c0y3 != null) {
            list = c0y3.LJFF();
            c0y3.LJIIIZ();
            c0y3.release();
        }
        c1oz.LJLILLLLZI = LIZ;
        if (list == null) {
            return;
        }
        LIZ.LJIIJ(list);
    }

    public C30371Hd(C06360Mu c06360Mu) {
        this.LIZ = c06360Mu;
    }

    public final void LJII(boolean z) {
        List<C38531fF> LIZJ;
        if (!this.LIZIZ.LIZ || (LIZJ = this.LIZJ.LIZJ()) == null || LIZJ.isEmpty()) {
            return;
        }
        C41201jY.LJJJI().getClass();
        C0E2.LIZLLL.LIZ();
        AbstractC38911fr.LJIJI();
        boolean z2 = false;
        for (C38531fF c38531fF : LIZJ) {
            if (!z || c38531fF.LJIIL) {
                if (!z2 && C0E2.LIZLLL.LIZIZ()) {
                    LJFF(c38531fF, true);
                } else {
                    c38531fF.LJIIIZ++;
                    this.LIZJ.LJIIIIZZ(c38531fF);
                    z2 = true;
                }
            }
        }
    }

    public final void LJFF(C38531fF c38531fF, boolean z) {
        c38531fF.toString();
        List<String> list = c38531fF.LJFF;
        if (z || (c38531fF.LJIILIIL > 0 && (System.currentTimeMillis() - c38531fF.LJIIIIZZ) / 1000 > c38531fF.LJIILIIL)) {
            this.LIZJ.LJII(c38531fF);
        }
        if (c38531fF.LJIILIIL > 0 && (System.currentTimeMillis() - c38531fF.LJIIIIZZ) / 1000 > c38531fF.LJIILIIL) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("event expired:");
            LIZ.append(c38531fF.toString());
            X1D.LIZIZ(LIZ);
            C04070Dz.onEventExpired(c38531fF);
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            String str = (String) ListProtector.get(list, i);
            long uptimeMillis = SystemClock.uptimeMillis();
            C0R7 c0r7 = this.LIZLLL;
            c0r7.getClass();
            C0R8 c0r8 = new C0R8();
            c0r8.LIZ = str;
            c0r8.LIZIZ = "GET";
            c0r8.LIZLLL = c38531fF;
            C0RA LIZIZ = c0r7.LIZIZ.LIZIZ(new C0R9(c0r8));
            long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
            int i2 = this.LIZIZ.LJII;
            if (LIZIZ != null && i2 > 0) {
                StringBuilder LIZJ = V10.LIZJ("cost:", uptimeMillis2, " code:");
                LIZJ.append(LIZIZ.LIZ);
                LIZJ.append(" msg:");
                LIZJ.append(LIZIZ.LIZIZ);
                X1D.LIZIZ(LIZJ);
            }
        }
    }
}

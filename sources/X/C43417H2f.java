package X;

import Y.ACallableS110S0100000_7;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import defpackage.e1;
import defpackage.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.H2f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43417H2f implements InterfaceC133905Ni {
    public final /* synthetic */ C43421H2j LJLIL;
    public final /* synthetic */ SynthetiseResult LJLILLLLZI;

    public C43417H2f(C43421H2j c43421H2j, SynthetiseResult synthetiseResult) {
        this.LJLIL = c43421H2j;
        this.LJLILLLLZI = synthetiseResult;
    }

    @Override // X.InterfaceC133905Ni
    public final void LIZ(int i, int i2, float f, String str) {
        boolean z;
        int i3;
        if (i2 == -214) {
            C44739Hh9.LIZ = true;
        }
        H2N h2n = this.LJLIL.LJIILJJIL;
        if (h2n == null) {
            z = false;
        } else {
            int LJJIIZ = O6R.LJJIIZ(f);
            FFL.LJIIIZ().getClass();
            String LJIILJJIL = FFL.LJIILJJIL(31744, "studio_hw_encode_fallback_target", "", true);
            o.LJIIIIZZ(LJIILJJIL, "getInstance().getStringV…llbackTarget::class.java)");
            List LJLJJL = s.LJLJJL(LJIILJJIL, new String[]{","}, 0, 6);
            ArrayList arrayList = new ArrayList(C32I.LJJL(LJLJJL, 10));
            Iterator it = LJLJJL.iterator();
            while (it.hasNext()) {
                Integer LJJIL = C38350F3i.LJJIL((String) it.next());
                if (LJJIL != null) {
                    i3 = LJJIL.intValue();
                } else {
                    i3 = -1;
                }
                arrayList.add(Integer.valueOf(i3));
            }
            if (!e1.LIZ(31744, "studio_hw_encode_auto_fallback", true, false) || !arrayList.contains(Integer.valueOf(LJJIIZ)) || h2n.LIZ >= C00F.LIZ(31744, 0, "studio_publish_failure_auto_retry_count", true)) {
                z = false;
            } else {
                z = true;
                h2n.LIZ++;
            }
        }
        if (z) {
            C44739Hh9.LIZ = true;
            C43421H2j c43421H2j = this.LJLIL;
            C43403H1r c43403H1r = c43421H2j.LJIIJ;
            if (c43403H1r != null) {
                c43403H1r.LIZ.creativeModel.transientPostPageModel.LIZJ = true;
                H2P h2p = c43421H2j.LJIILIIL;
                if (h2p != null) {
                    h2p.LIZ();
                }
                C43421H2j c43421H2j2 = this.LJLIL;
                c43421H2j2.getClass();
                C10K.LIZJ(new ACallableS110S0100000_7(c43421H2j2, 45));
                C67996QmO c67996QmO = this.LJLIL.LJIILLIIL;
                if (c67996QmO != null) {
                    c67996QmO.LIZIZ(new H2O(), EnumC43531H6p.OUTER);
                    return;
                } else {
                    o.LJIJI("nodeCallback");
                    throw null;
                }
            }
            o.LJIJI("editModelContainer");
            throw null;
        }
        C43403H1r c43403H1r2 = this.LJLIL.LJIIJ;
        if (c43403H1r2 != null) {
            c43403H1r2.LIZ.creativeModel.transientPostPageModel.LIZJ = false;
            SynthetiseResult m157clone = this.LJLILLLLZI.m157clone();
            o.LJIIIIZZ(m157clone, "compileResult.clone()");
            m157clone.ret = O6R.LJJIIZ(f);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(i);
            LIZ.append('#');
            LIZ.append(i2);
            LIZ.append('#');
            LIZ.append(f);
            m157clone.setVESDKErrorCode(X1D.LIZIZ(LIZ));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("VE compile failed with message(type=");
            LIZ2.append(i);
            LIZ2.append(", ext=");
            LIZ2.append(i2);
            LIZ2.append(", float=");
            LIZ2.append(f);
            LIZ2.append(", msg=");
            String LIZIZ = q.LIZIZ(LIZ2, str, ')', LIZ2);
            C43342Gzi c43342Gzi = new C43342Gzi();
            c43342Gzi.LIZ = m157clone;
            if (LIZIZ != null) {
                c43342Gzi.LIZJ = LIZIZ;
            }
            this.LJLIL.LJIILIIL(c43342Gzi.LIZ());
            C43421H2j c43421H2j3 = this.LJLIL;
            c43421H2j3.getClass();
            C10K.LIZJ(new ACallableS110S0100000_7(c43421H2j3, 45));
            return;
        }
        o.LJIJI("editModelContainer");
        throw null;
    }
}

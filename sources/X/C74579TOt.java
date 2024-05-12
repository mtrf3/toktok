package X;

import Y.IDhS71S0200000_12;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;
import kotlin.jvm.internal.o;

/* renamed from: X.TOt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C74579TOt extends AbstractC74512TMe<ProviderEffect, TPG, ProviderEffectModel> {
    public final InterfaceC65784Pro<InterfaceC84498XEg> LJ;
    public final String LJFF;
    public final String LJI;
    public String LJII;
    public final java.util.Map<String, String> LJIIIIZZ;

    @Override // X.R30
    public final AbstractC73672Svk LJII(Object obj) {
        AbstractC73638SvC LJIIJ;
        OSZ req = (OSZ) obj;
        o.LJIIIZ(req, "req");
        int intValue = ((Number) req.getFirst()).intValue();
        TPG tpg = (TPG) req.getSecond();
        C74500TLs.LIZ.getClass();
        if (C74500TLs.LIZ().cacheRequests) {
            String requestKeyword = this.LJI;
            int i = tpg.LJLILLLLZI + tpg.LJLJI;
            o.LJIIIZ(requestKeyword, "requestKeyword");
            long currentTimeMillis = System.currentTimeMillis();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(requestKeyword);
            LIZ.append(i);
            LIZ.append(intValue);
            String LIZIZ = X1D.LIZIZ(LIZ);
            C62822Ol8 c62822Ol8 = C74503TLv.LIZJ;
            E8P e8p = (E8P) ((C35979EAd) c62822Ol8.getValue()).LIZIZ(LIZIZ);
            if (e8p == null || currentTimeMillis - e8p.LIZ > C74503TLv.LIZIZ || e8p.LJ == null) {
                LJIIJ = LJIIJ(intValue, tpg);
                String requestKeyword2 = this.LJI;
                int i2 = tpg.LJLJI + tpg.LJLILLLLZI;
                o.LJIIIZ(requestKeyword2, "requestKeyword");
                long currentTimeMillis2 = System.currentTimeMillis();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(requestKeyword2);
                LIZ2.append(i2);
                LIZ2.append(intValue);
                ((C35979EAd) c62822Ol8.getValue()).LIZLLL(X1D.LIZIZ(LIZ2), new E8P(currentTimeMillis2, requestKeyword2, i2, intValue, LJIIJ));
            } else {
                LJIIJ = e8p.LJ;
            }
        } else {
            LJIIJ = LJIIJ(intValue, tpg);
        }
        AbstractC73672Svk<R> LJJIIJZLJL = LJIIJ.LJIJI(new IDhS71S0200000_12(tpg, this, 8)).LJJIIJZLJL();
        o.LJIIIIZZ(LJJIIJZLJL, "override fun requestActu…   }.toObservable()\n    }");
        return LJJIIJZLJL;
    }

    @Override // X.AbstractC74512TMe
    public final boolean LJIIIIZZ(TPG tpg, TPG tpg2) {
        TPG a = tpg;
        TPG b = tpg2;
        o.LJIIIZ(a, "a");
        o.LJIIIZ(b, "b");
        if (a.LJLIL == b.LJLIL) {
            return true;
        }
        return false;
    }

    public C73579SuF LJIIJ(int i, TPG cursorData) {
        o.LJIIIZ(cursorData, "cursorData");
        return AbstractC73638SvC.LJI(new C74583TOx(this, cursorData, i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C74579TOt(InterfaceC65784Pro<? extends InterfaceC84498XEg> effectPlatform, C74577TOr c74577TOr, String providerName, String providerSource, String query, TPG tpg) {
        super(tpg);
        String str;
        Integer num;
        String str2;
        String LIZ;
        o.LJIIIZ(effectPlatform, "effectPlatform");
        o.LJIIIZ(providerName, "providerName");
        o.LJIIIZ(providerSource, "providerSource");
        o.LJIIIZ(query, "query");
        this.LJ = effectPlatform;
        this.LJFF = providerName;
        this.LJI = query;
        String str3 = "";
        this.LJII = "";
        OSZ[] oszArr = new OSZ[5];
        if (c74577TOr == null) {
            str = "";
        } else {
            str = c74577TOr.LJIIZILJ();
        }
        oszArr[0] = new OSZ("creation_id", str);
        oszArr[1] = new OSZ("session_id", (c74577TOr == null || (LIZ = c74577TOr.LIZ()) == null) ? "" : LIZ);
        if (c74577TOr != null && (str2 = c74577TOr.LJ) != null) {
            str3 = str2;
        }
        oszArr[2] = new OSZ("search_session_id", str3);
        if (c74577TOr != null) {
            num = Integer.valueOf(c74577TOr.LJFF);
        } else {
            num = null;
        }
        oszArr[3] = new OSZ("search_keyword_session_id", String.valueOf(num));
        oszArr[4] = new OSZ("device_platform", "android");
        this.LJIIIIZZ = C113554cx.LJJL(oszArr);
    }
}

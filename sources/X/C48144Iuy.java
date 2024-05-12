package X;

import com.bytedance.ies.ugc.aweme.commercialize.search.setting.CommerceSearchAdConfigSetting;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.Iuy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48144Iuy implements NIP {
    public static final C5H3<C48144Iuy> LJIIJJI = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C48146Iv0.LJLIL);
    public final java.util.Map<String, Integer> LIZ = Collections.synchronizedMap(new HashMap());
    public final java.util.Map<String, Integer> LIZIZ = Collections.synchronizedMap(new HashMap());
    public final java.util.Map<String, java.util.Set<String>> LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public int LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;

    @Override // X.NIP
    public final void LJIJJLI() {
        this.LJFF = true;
    }

    public C48144Iuy() {
        java.util.Map<String, java.util.Set<String>> synchronizedMap = Collections.synchronizedMap(new HashMap());
        o.LJIIIIZZ(synchronizedMap, "synchronizedMap(HashMap())");
        this.LIZJ = synchronizedMap;
        this.LJII = true;
        this.LJIIIIZZ = true;
    }

    @Override // X.NIP
    public final boolean LIZ() {
        return this.LIZLLL;
    }

    @Override // X.NIP
    public final boolean LIZIZ() {
        return this.LJII;
    }

    @Override // X.NIP
    public final boolean LJFF() {
        return this.LJIIIIZZ;
    }

    @Override // X.NIP
    public final boolean LJIILL() {
        return this.LJIIIZ;
    }

    @Override // X.NIP
    public final boolean LJIILLIIL() {
        return this.LJIIJ;
    }

    @Override // X.NIP
    public final int LJIL() {
        return this.LJI;
    }

    @Override // X.NIP
    public final java.util.Set<String> LIZJ(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null) {
            return null;
        }
        return this.LIZJ.get(LJJI(aweme.getAwemeRawAd()));
    }

    @Override // X.NIP
    public final void LIZLLL(Aweme aweme) {
        java.util.Set<String> LIZJ = LIZJ(aweme);
        if (LIZJ == null) {
            return;
        }
        LIZJ.clear();
    }

    @Override // X.NIP
    public final void LJ(int i) {
        this.LJI = i;
    }

    @Override // X.NIP
    public final void LJI(boolean z) {
        this.LJII = z;
    }

    @Override // X.NIP
    public final void LJII(boolean z) {
        this.LIZLLL = z;
    }

    @Override // X.NIP
    public final void LJIIIIZZ(boolean z) {
        this.LJ = z;
    }

    @Override // X.NIP
    public final void LJIIIZ(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null) {
            return;
        }
        this.LIZ.remove(LJJI(aweme.getAwemeRawAd()));
    }

    @Override // X.NIP
    public final void LJIIJ(boolean z) {
        this.LJIIIIZZ = z;
    }

    @Override // X.NIP
    public final int LJIIJJI(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null) {
            return 0;
        }
        Integer num = this.LIZ.get(LJJI(aweme.getAwemeRawAd()));
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // X.NIP
    public final void LJIIL(boolean z) {
        this.LJIIIZ = z;
    }

    @Override // X.NIP
    public final void LJIIZILJ(boolean z) {
        this.LJIIJ = z;
    }

    @Override // X.NIP
    public final int LJIJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        java.util.Map<String, String> searchAdExtraParams;
        String str;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (searchAdExtraParams = awemeRawAd.getSearchAdExtraParams()) != null && (str = searchAdExtraParams.get("inner_ad_position")) != null) {
            return CastIntegerProtector.parseInt(str);
        }
        return 0;
    }

    @Override // X.NIP
    public final boolean LJIJJ(Aweme aweme) {
        if (IIV.LIZ) {
            return CommerceSearchAdConfigSetting.LIZ().enableDedupShowAndOmsdk;
        }
        if (aweme != null && C63081OpJ.LJIL(aweme)) {
            return true;
        }
        return false;
    }

    public final String LJJI(AwemeRawAd awemeRawAd) {
        if (awemeRawAd == null || awemeRawAd.getCreativeId() == null) {
            return "default_key";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(awemeRawAd.getCreativeId().longValue());
        LIZ.append(this.LIZLLL);
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.NIP
    public final void LJIILIIL(int i, Aweme aweme) {
        if (aweme == null) {
            return;
        }
        LJIILJJIL(i, aweme.getAwemeRawAd());
    }

    @Override // X.NIP
    public final void LJIILJJIL(int i, AwemeRawAd awemeRawAd) {
        if (awemeRawAd == null || !O5Y.LJJJJ(awemeRawAd)) {
            return;
        }
        String LJJI = LJJI(awemeRawAd);
        java.util.Map<String, Integer> ctaShowStatusMap = this.LIZ;
        o.LJIIIIZZ(ctaShowStatusMap, "ctaShowStatusMap");
        ctaShowStatusMap.put(LJJI, Integer.valueOf(i));
    }

    @Override // X.NIP
    public final void LJIJI(Aweme aweme, String str) {
        if (aweme == null) {
            return;
        }
        LJJ(aweme.getAwemeRawAd(), str);
    }

    public final void LJJ(AwemeRawAd awemeRawAd, String str) {
        if (awemeRawAd == null) {
            return;
        }
        String LJJI = LJJI(awemeRawAd);
        if (this.LIZJ.get(LJJI) == null) {
            this.LIZJ.put(LJJI, new HashSet());
        }
        java.util.Set<String> set = this.LIZJ.get(LJJI);
        if (set != null) {
            set.add(str);
        }
    }
}

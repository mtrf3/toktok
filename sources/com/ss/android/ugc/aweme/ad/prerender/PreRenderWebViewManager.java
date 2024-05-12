package com.ss.android.ugc.aweme.ad.prerender;

import X.C221108m2;
import X.C38352F3k;
import X.C58096Mr6;
import X.C58307MuV;
import X.C58685N1l;
import X.C58692N1s;
import X.C62822Ol8;
import X.C84763XOl;
import X.EnumC58696N1w;
import X.InterfaceC58691N1r;
import X.N1Z;
import X.NPE;
import X.X1D;
import android.app.Activity;
import com.ss.android.ugc.aweme.cct.AdACTEventLoger;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.log.IAdWebEventLogger;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS63S1100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class PreRenderWebViewManager implements IPreRenderLandPageModule {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C58307MuV.LJLIL);

    public static IPreRenderLandPageModule LIZ() {
        Object LIZ = C58096Mr6.LIZ(IPreRenderLandPageModule.class, false);
        if (LIZ != null) {
            return (IPreRenderLandPageModule) LIZ;
        }
        if (C58096Mr6.LLFF == null) {
            synchronized (IPreRenderLandPageModule.class) {
                if (C58096Mr6.LLFF == null) {
                    C58096Mr6.LLFF = new PreRenderWebViewManager();
                }
            }
        }
        return C58096Mr6.LLFF;
    }

    public static String LIZJ(String str) {
        int i;
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ != null) {
            i = LJIIIIZZ.hashCode();
        } else {
            i = 0;
        }
        String valueOf = String.valueOf(i);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(valueOf);
        LIZ.append('-');
        LIZ.append(str);
        String LIZJ = C38352F3k.LIZJ(X1D.LIZIZ(LIZ));
        o.LJIIIIZZ(LIZJ, "md5Hex(\"$hashCode-$webUrl\")");
        return LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.ad.prerender.IPreRenderLandPageModule
    public final void LLLJL(Aweme aweme) {
        String awemeRawAdIdStr = aweme.getAwemeRawAdIdStr();
        if (awemeRawAdIdStr == null || awemeRawAdIdStr.length() == 0) {
            return;
        }
        Map map = (Map) ((Map) this.LIZ.getValue()).get(awemeRawAdIdStr);
        if (map != null) {
            for (C58692N1s c58692N1s : map.values()) {
                InterfaceC58691N1r interfaceC58691N1r = c58692N1s.LIZ;
                if (interfaceC58691N1r != null) {
                    interfaceC58691N1r.release();
                }
                c58692N1s.LIZ = null;
                c58692N1s.LJI = null;
            }
        }
        ((Map) this.LIZ.getValue()).remove(awemeRawAdIdStr);
    }

    public final C58692N1s LIZIZ(AwemeRawAd awemeRawAd, String str) {
        String creativeIdStr = awemeRawAd.getCreativeIdStr();
        if (creativeIdStr == null) {
            creativeIdStr = "";
        }
        Map map = (Map) this.LIZ.getValue();
        Object obj = map.get(creativeIdStr);
        if (obj == null) {
            obj = new LinkedHashMap();
            map.put(creativeIdStr, obj);
        }
        Map map2 = (Map) obj;
        String LIZJ = LIZJ(str);
        Object obj2 = map2.get(LIZJ);
        Object obj3 = obj2;
        if (obj2 == null) {
            C58692N1s c58692N1s = new C58692N1s();
            c58692N1s.LJI = awemeRawAd;
            map2.put(LIZJ, c58692N1s);
            obj3 = c58692N1s;
        }
        return (C58692N1s) obj3;
    }

    public final C58692N1s LIZLLL(String str, String str2) {
        String LIZJ = LIZJ(str2);
        Map map = (Map) ((Map) this.LIZ.getValue()).get(str);
        if (map != null) {
            return (C58692N1s) map.get(LIZJ);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ad.prerender.IPreRenderLandPageModule
    public final void LLLLIIIILLL(String cid, String str) {
        String str2;
        o.LJIIIZ(cid, "cid");
        C58692N1s LIZLLL = LIZLLL(cid, str);
        if (LIZLLL == null) {
            return;
        }
        LIZLLL.LJFF = true;
        AwemeRawAd awemeRawAd = LIZLLL.LJI;
        if (awemeRawAd != null) {
            str2 = awemeRawAd.getLogExtra();
        } else {
            str2 = null;
        }
        IAdWebEventLogger LJJIJ = AdACTEventLoger.LJJIJ();
        C58685N1l.LIZ.getClass();
        LJJIJ.LIZJ(C58685N1l.LJJIIZI, cid, str2, null, new AqS63S1100000_10(LIZLLL, str, 2));
        if (LIZLLL.LJIIIIZZ) {
            LJ(LIZLLL.LIZJ.ordinal(), LIZLLL.LIZLLL, cid, str, str2, LIZLLL.LJ, LIZLLL.LJII, 0L);
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.prerender.IPreRenderLandPageModule
    public final boolean LLLLIIL(String cid, String str) {
        o.LJIIIZ(cid, "cid");
        if (LIZLLL(cid, str) != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ad.prerender.IPreRenderLandPageModule
    public final void LLLLIILLL(AwemeRawAd awemeRawAd, String str) {
        Long creativeId;
        if (awemeRawAd == null || (creativeId = awemeRawAd.getCreativeId()) == null) {
            return;
        }
        C58692N1s LIZLLL = LIZLLL(String.valueOf(creativeId.longValue()), str);
        if (LIZLLL == null) {
            LIZLLL = LIZIZ(awemeRawAd, str);
        }
        LIZLLL.LIZIZ = System.currentTimeMillis();
        EnumC58696N1w enumC58696N1w = EnumC58696N1w.RENDERING;
        o.LJIIIZ(enumC58696N1w, "<set-?>");
        LIZLLL.LIZJ = enumC58696N1w;
    }

    @Override // com.ss.android.ugc.aweme.ad.prerender.IPreRenderLandPageModule
    public final void LLLL(AwemeRawAd awemeRawAd, String str, NPE npe) {
        String creativeIdStr;
        if (awemeRawAd == null || (creativeIdStr = awemeRawAd.getCreativeIdStr()) == null) {
            return;
        }
        C58692N1s LIZLLL = LIZLLL(creativeIdStr, str);
        if (LIZLLL == null) {
            LIZLLL = LIZIZ(awemeRawAd, str);
        }
        if (LIZLLL.LIZ != null) {
            return;
        }
        LIZLLL.LIZ = npe;
        npe.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.ad.prerender.IPreRenderLandPageModule
    public final boolean LLLLIILL(int i, String cid, String str) {
        InterfaceC58691N1r interfaceC58691N1r;
        o.LJIIIZ(cid, "cid");
        C58692N1s LIZLLL = LIZLLL(cid, str);
        if (LIZLLL == null || i != 1 || (interfaceC58691N1r = LIZLLL.LIZ) == null) {
            return false;
        }
        interfaceC58691N1r.show();
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ad.prerender.IPreRenderLandPageModule
    public final void LLLLII(int i, String cid, String str, String failReason, String sessionId, boolean z) {
        String str2;
        EnumC58696N1w enumC58696N1w;
        o.LJIIIZ(cid, "cid");
        o.LJIIIZ(failReason, "failReason");
        o.LJIIIZ(sessionId, "sessionId");
        C58692N1s LIZLLL = LIZLLL(cid, str);
        if (LIZLLL == null || LIZLLL.LJIIIIZZ) {
            return;
        }
        if (!LIZLLL.LJFF) {
            if (z) {
                enumC58696N1w = EnumC58696N1w.RENDER_SUCCESS;
            } else {
                enumC58696N1w = EnumC58696N1w.FAIL;
            }
            o.LJIIIZ(enumC58696N1w, "<set-?>");
            LIZLLL.LIZJ = enumC58696N1w;
        }
        LIZLLL.LJIIIIZZ = true;
        LIZLLL.LIZLLL = i;
        LIZLLL.LJ = failReason;
        LIZLLL.LJII = sessionId;
        if (LIZLLL.LJFF) {
            long currentTimeMillis = System.currentTimeMillis() - LIZLLL.LIZIZ;
            AwemeRawAd awemeRawAd = LIZLLL.LJI;
            if (awemeRawAd == null || (str2 = awemeRawAd.getLogExtra()) == null) {
                str2 = "";
            }
            LJ(LIZLLL.LIZJ.ordinal(), i, cid, str, str2, failReason, sessionId, currentTimeMillis);
        }
    }

    public static void LJ(int i, int i2, String str, String str2, String str3, String str4, String str5, long j) {
        IAdWebEventLogger LJJIJ = AdACTEventLoger.LJJIJ();
        C58685N1l.LIZ.getClass();
        LJJIJ.LIZJ(C58685N1l.LJJIJ, str, str3, null, new N1Z(i, str2, str4, j, str5, i2));
    }
}

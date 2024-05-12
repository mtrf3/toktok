package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.jvm.internal.IDqS428S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7u0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C200567u0 {
    public final String LIZ = "homepage_explore";
    public final WeakReference<Context> LIZIZ;
    public final InterfaceC88473Ynt<String, C200647u8, Boolean, C76800UCe> LIZJ;
    public long LIZLLL;
    public boolean LJ;
    public volatile boolean LJFF;
    public long LJI;
    public int LJII;
    public Aweme LJIIIIZZ;
    public final C200727uG LJIIIZ;

    /* JADX WARN: Removed duplicated region for block: B:45:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme r8) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C200567u0.LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    public final void LJ(Aweme aweme) {
        boolean z;
        long j;
        AwemeStatistics statistics;
        this.LJIIIIZZ = aweme;
        int i = 0;
        if (aweme != null) {
            z = aweme.isLike();
        } else {
            z = false;
        }
        this.LJ = z;
        this.LJFF = false;
        if (aweme != null && (statistics = aweme.getStatistics()) != null) {
            j = statistics.getDiggCount();
        } else {
            j = 0;
        }
        this.LIZLLL = j;
        if (aweme != null) {
            i = aweme.getUserDigg();
        }
        this.LJII = i;
        this.LJI = this.LIZLLL;
    }

    public C200567u0(WeakReference weakReference, IDqS428S0100000_3 iDqS428S0100000_3) {
        this.LIZIZ = weakReference;
        this.LIZJ = iDqS428S0100000_3;
        C200727uG c200727uG = new C200727uG();
        this.LJIIIZ = c200727uG;
        c200727uG.LJJ(new C178476zT());
        c200727uG.LJLILLLLZI = new InterfaceC200717uF() { // from class: X.7u1
            @Override // X.InterfaceC200717uF
            public final void onItemDiggFailed(Exception exc) {
                boolean z;
                String str;
                C200567u0 c200567u0 = C200567u0.this;
                Aweme aweme = c200567u0.LJIIIIZZ;
                if (aweme == null) {
                    return;
                }
                if (!c200567u0.LJ) {
                    c200567u0.LIZLLL++;
                    z = true;
                } else {
                    c200567u0.LIZLLL--;
                    z = false;
                }
                long LJFF = c200567u0.LJFF(aweme, z);
                C200567u0 c200567u02 = C200567u0.this;
                InterfaceC88473Ynt<String, C200647u8, Boolean, C76800UCe> interfaceC88473Ynt = c200567u02.LIZJ;
                Aweme aweme2 = c200567u02.LJIIIIZZ;
                if (aweme2 == null || (str = aweme2.getAid()) == null) {
                    str = "";
                }
                interfaceC88473Ynt.invoke(str, C200567u0.LIZJ(LJFF, C200567u0.this.LJIIIIZZ, z), Boolean.FALSE);
                C200567u0.this.LJFF = false;
            }

            @Override // X.InterfaceC200717uF
            public final void onItemDiggSuccess(C15070iV<String, Integer> c15070iV) {
                String str;
                Integer num;
                String str2;
                Aweme aweme;
                String str3 = null;
                if (c15070iV != null) {
                    str = c15070iV.LIZ;
                } else {
                    str = null;
                }
                C50420Jqa c50420Jqa = new C50420Jqa(13, str);
                Bundle bundle = new Bundle();
                if (c15070iV == null || (num = c15070iV.LIZIZ) == null) {
                    num = -1;
                }
                Aweme aweme2 = C200567u0.this.LJIIIIZZ;
                if (aweme2 != null) {
                    str2 = aweme2.getAid();
                } else {
                    str2 = null;
                }
                if (c15070iV != null) {
                    str3 = c15070iV.LIZ;
                }
                if (o.LJ(str2, str3) && (aweme = C200567u0.this.LJIIIIZZ) != null) {
                    aweme.setUserDigg(num.intValue());
                }
                bundle.putInt("user_digged", num.intValue());
                c50420Jqa.LJLJI = bundle;
                C2U8.LIZ(c50420Jqa);
                C2U8.LIZ(new C1810878u(num.intValue()));
                C200567u0.this.LJFF = false;
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fc, code lost:
    
        if (r5 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ea, code lost:
    
        if (r5 != null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.aweme.feed.model.Aweme r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C200567u0.LIZ(com.ss.android.ugc.aweme.feed.model.Aweme, boolean):void");
    }

    public final void LIZLLL(int i, Aweme aweme) {
        if (aweme == null) {
            return;
        }
        String aid = aweme.getAid();
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            if (i != 0) {
                if (i != 1) {
                    return;
                }
                C2043180d.LJ(C2043180d.LIZ() + 1);
                aweme.setUserDigg(1);
                AwemeStatistics statistics = aweme.getStatistics();
                if (statistics != null) {
                    statistics.setDiggCount(this.LIZLLL);
                }
                C2U8.LIZ(new C50420Jqa(13, aid));
                return;
            }
            int LIZ = C2043180d.LIZ() - 1;
            if (LIZ < 0) {
                LIZ = 0;
            }
            C2043180d.LJ(LIZ);
            aweme.setUserDigg(0);
            AwemeStatistics statistics2 = aweme.getStatistics();
            if (statistics2 != null) {
                statistics2.setDiggCount(this.LIZLLL);
            }
            C2U8.LIZ(new C50420Jqa(13, aid));
            return;
        }
        HashMap hashMap = new HashMap();
        o.LJIIIIZZ(aid, "aid");
        hashMap.put("aweme_id", aid);
        hashMap.put("type", String.valueOf(i));
        hashMap.put("channel_id", String.valueOf(C55688LtM.LIZ("eventType")));
        C59955Nfz.LIZIZ("eventType", null, hashMap);
        this.LJFF = true;
        this.LJIIIZ.LJIILL(hashMap);
    }

    public final long LJFF(Aweme aweme, boolean z) {
        if (aweme != null) {
            this.LJ = z;
            if (z) {
                if (this.LJII == 1) {
                    if (this.LJI < 1 && !aweme.isDelete()) {
                        this.LJI = 1L;
                    }
                    return this.LJI;
                }
                return this.LJI + 1;
            }
            if (this.LJII == 1 && !aweme.isDelete()) {
                return this.LJI - 1;
            }
            return this.LJI;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateDiggView when aweme is null:");
        LIZ.append(android.util.Log.getStackTraceString(new Throwable()));
        C36922EeM.LIZLLL(6, "Explore", X1D.LIZIZ(LIZ));
        return 0L;
    }

    public static C200647u8 LIZJ(long j, Aweme aweme, boolean z) {
        String LJJIIJ;
        AwemeCommerceStruct commerceVideoAuthInfo;
        if (j < 0) {
            j = 0;
        }
        boolean z2 = false;
        if (aweme != null && ((commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) == null || commerceVideoAuthInfo.getDiggShowScene() != 1)) {
            z2 = true;
        }
        if (C63081OpJ.LJLJLLL(aweme) || j <= 0) {
            LJJIIJ = CardStruct.IStatusCode.DEFAULT;
        } else {
            LJJIIJ = C77123UOp.LJJIIJ(j);
        }
        return new C200647u8(LJJIIJ, z, z2);
    }
}

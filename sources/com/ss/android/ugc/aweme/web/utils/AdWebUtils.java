package com.ss.android.ugc.aweme.web.utils;

import X.AbstractC59064NGa;
import X.C58096Mr6;
import X.C59055NFr;
import X.C59066NGc;
import X.C59222NMc;
import X.C59421NTt;
import X.C59452NUy;
import X.EnumC59053NFp;
import X.EnumC59241NMv;
import X.NGY;
import X.NMV;
import X.NMZ;
import X.NPF;
import Y.ARunnableS46S0100000_10;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridContainerManager;
import com.ss.android.ugc.aweme.commercialize.hybrid.impl.AdHybridContainerManager;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.web.service.IAdWebUtils;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AdWebUtils implements IAdWebUtils {
    public static final /* synthetic */ int LIZ = 0;

    public static IAdWebUtils LIZJ() {
        Object LIZ2 = C58096Mr6.LIZ(IAdWebUtils.class, false);
        if (LIZ2 != null) {
            return (IAdWebUtils) LIZ2;
        }
        if (C58096Mr6.l8 == null) {
            synchronized (IAdWebUtils.class) {
                if (C58096Mr6.l8 == null) {
                    C58096Mr6.l8 = new AdWebUtils();
                }
            }
        }
        return C58096Mr6.l8;
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUtils
    public final NPF LIZIZ(Context context) {
        o.LJIIIZ(context, "context");
        return new NPF(context);
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUtils
    public final Fragment LIZ(Context context, C59222NMc c59222NMc, String url, ARunnableS46S0100000_10 aRunnableS46S0100000_10) {
        AwemeRawAd awemeRawAd;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z;
        int i;
        String str7;
        String str8;
        int i2;
        boolean z2;
        String str9;
        String str10;
        int i3;
        int i4;
        String str11;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        String str12;
        String str13;
        String str14;
        Integer num;
        Long groupId;
        String str15;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(url, "url");
        C59222NMc c59222NMc2 = new C59222NMc(0);
        Integer num2 = null;
        if (c59222NMc != null) {
            awemeRawAd = c59222NMc.LIZ;
        } else {
            awemeRawAd = null;
        }
        c59222NMc2.LIZ = awemeRawAd;
        if (c59222NMc != null) {
            str = c59222NMc.LIZIZ;
        } else {
            str = null;
        }
        c59222NMc2.LIZIZ = str;
        if (c59222NMc != null) {
            str2 = c59222NMc.LIZJ;
        } else {
            str2 = null;
        }
        c59222NMc2.LIZJ = str2;
        if (c59222NMc != null) {
            str3 = c59222NMc.LIZLLL;
        } else {
            str3 = null;
        }
        c59222NMc2.LIZLLL = str3;
        if (c59222NMc != null) {
            str4 = c59222NMc.LJ;
        } else {
            str4 = null;
        }
        c59222NMc2.LJ = str4;
        if (c59222NMc != null) {
            str5 = c59222NMc.LJFF;
        } else {
            str5 = null;
        }
        c59222NMc2.LJFF = str5;
        if (c59222NMc != null) {
            str6 = c59222NMc.LJI;
        } else {
            str6 = null;
        }
        c59222NMc2.LJI = str6;
        if (c59222NMc != null) {
            z = c59222NMc.LJII;
        } else {
            z = false;
        }
        c59222NMc2.LJII = z;
        if (c59222NMc != null) {
            i = c59222NMc.LJIIIIZZ;
        } else {
            i = 0;
        }
        c59222NMc2.LJIIIIZZ = i;
        if (c59222NMc != null) {
            str7 = c59222NMc.LJIIIZ;
        } else {
            str7 = null;
        }
        c59222NMc2.LJIIIZ = str7;
        if (c59222NMc == null || (str8 = c59222NMc.LJIIJ) == null) {
            str8 = CardStruct.IStatusCode.DEFAULT;
        }
        c59222NMc2.LJIIJ = str8;
        if (c59222NMc != null) {
            i2 = c59222NMc.LJIIJJI;
        } else {
            i2 = 0;
        }
        c59222NMc2.LJIIJJI = i2;
        if (c59222NMc != null) {
            z2 = c59222NMc.LJIIL;
        } else {
            z2 = false;
        }
        c59222NMc2.LJIIL = z2;
        c59222NMc2.LJIILIIL = System.currentTimeMillis();
        String str16 = "";
        if (c59222NMc == null || (str9 = c59222NMc.LJIILJJIL) == null) {
            str9 = "";
        }
        c59222NMc2.LJIILJJIL = str9;
        if (c59222NMc != null) {
            str10 = c59222NMc.LJIILL;
        } else {
            str10 = null;
        }
        c59222NMc2.LJIILL = str10;
        boolean z7 = true;
        if (c59222NMc != null) {
            i3 = c59222NMc.LJIILLIIL;
        } else {
            i3 = 1;
        }
        c59222NMc2.LJIILLIIL = i3;
        if (c59222NMc != null) {
            i4 = c59222NMc.LJIIZILJ;
        } else {
            i4 = -1;
        }
        c59222NMc2.LJIIZILJ = i4;
        if (c59222NMc == null || (str11 = c59222NMc.LJIJ) == null) {
            str11 = "";
        }
        c59222NMc2.LJIJ = str11;
        if (c59222NMc != null && (str15 = c59222NMc.LJIJI) != null) {
            str16 = str15;
        }
        c59222NMc2.LJIJI = str16;
        if (c59222NMc != null) {
            z7 = c59222NMc.LJIJJ;
        }
        c59222NMc2.LJIJJ = z7;
        if (c59222NMc != null) {
            z3 = c59222NMc.LJIJJLI;
        } else {
            z3 = false;
        }
        c59222NMc2.LJIJJLI = z3;
        if (c59222NMc != null) {
            z4 = c59222NMc.LJIL;
        } else {
            z4 = false;
        }
        c59222NMc2.LJIL = z4;
        if (c59222NMc != null) {
            z5 = c59222NMc.LJJ;
        } else {
            z5 = false;
        }
        c59222NMc2.LJJ = z5;
        if (c59222NMc != null) {
            z6 = c59222NMc.LJJI;
        } else {
            z6 = false;
        }
        c59222NMc2.LJJI = z6;
        NPF LIZIZ = LIZJ().LIZIZ(context);
        NMV nmv = LIZIZ.LJLIL;
        if (nmv != null) {
            nmv.LIZIZ = aRunnableS46S0100000_10;
        }
        C59421NTt c59421NTt = new C59421NTt(EnumC59053NFp.ONLY_RENDER, "", 0, false, null, new C59452NUy(url, new Bundle(), c59222NMc2, C59055NFr.LIZ("landing_page_3p"), new NMZ()), false, 188);
        IAdHybridContainerManager LIZLLL = AdHybridContainerManager.LIZLLL();
        EnumC59241NMv enumC59241NMv = EnumC59241NMv.WEB;
        AwemeRawAd awemeRawAd2 = c59222NMc2.LIZ;
        if (awemeRawAd2 != null) {
            str12 = awemeRawAd2.getCreativeIdStr();
        } else {
            str12 = null;
        }
        AwemeRawAd awemeRawAd3 = c59222NMc2.LIZ;
        if (awemeRawAd3 != null) {
            str13 = awemeRawAd3.getLogExtra();
        } else {
            str13 = null;
        }
        AwemeRawAd awemeRawAd4 = c59222NMc2.LIZ;
        if (awemeRawAd4 != null && (groupId = awemeRawAd4.getGroupId()) != null) {
            str14 = String.valueOf(groupId);
        } else {
            str14 = null;
        }
        AwemeRawAd awemeRawAd5 = c59222NMc2.LIZ;
        if (awemeRawAd5 != null) {
            num = Integer.valueOf(awemeRawAd5.getChargeType());
        } else {
            num = null;
        }
        AwemeRawAd awemeRawAd6 = c59222NMc2.LIZ;
        if (awemeRawAd6 != null) {
            num2 = Integer.valueOf(awemeRawAd6.getSystemOrigin());
        }
        AbstractC59064NGa LIZJ = LIZLLL.LIZJ(new C59066NGc("landing_page_1p", enumC59241NMv, context, new NGY(str12, str13, str14, num, num2, 32)), c59421NTt);
        LIZJ.LJIILLIIL(LIZIZ);
        LIZJ.LJIILIIL(LIZIZ);
        Object LJI = LIZJ.LJI(c59421NTt, false);
        o.LJII(LJI, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        return (Fragment) LJI;
    }
}

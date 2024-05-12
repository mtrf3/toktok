package com.ss.android.ugc.aweme.brdatagift.api;

import X.C61606OFu;
import X.E8L;
import X.InterfaceC195737mD;
import X.InterfaceC195747mE;
import X.InterfaceC36348EOi;
import X.InterfaceC37276Ek4;

/* loaded from: classes11.dex */
public interface ICarrierRequestApi {
    public static final C61606OFu LIZ = C61606OFu.LIZ;

    @E8L
    InterfaceC37276Ek4<Void> chargeBemobiDataGift(@InterfaceC195747mE String str, @InterfaceC36348EOi("X-Referer") String str2, @InterfaceC36348EOi("User-Agent") String str3);

    @E8L
    InterfaceC37276Ek4<BaseBemobiResponse> checkBemobiConnection(@InterfaceC195747mE String str, @InterfaceC36348EOi("X-Referer") String str2, @InterfaceC195737mD Object obj, @InterfaceC36348EOi("User-Agent") String str3, @InterfaceC36348EOi("x-metasec-bypass-ttnet-features") String str4, @InterfaceC36348EOi("X-requested-with") String str5);

    @E8L("/ies/speed/")
    InterfaceC37276Ek4<String> checkTiktokConnection(@InterfaceC36348EOi("X-Referer") String str, @InterfaceC195737mD Object obj, @InterfaceC36348EOi("User-Agent") String str2);

    @E8L("/eligibility")
    InterfaceC37276Ek4<BaseBemobiResponse> getBemobiDataGift(@InterfaceC36348EOi("X-Referer") String str, @InterfaceC195737mD Object obj, @InterfaceC36348EOi("User-Agent") String str2);
}

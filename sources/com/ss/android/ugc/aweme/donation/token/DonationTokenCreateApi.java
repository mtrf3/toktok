package com.ss.android.ugc.aweme.donation.token;

import X.AbstractC73672Svk;
import X.C3AQ;
import X.E8M;
import X.InterfaceC195727mC;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;

/* loaded from: classes2.dex */
public interface DonationTokenCreateApi {
    public static final C3AQ LIZ = C3AQ.LIZ;

    @E8M("/tiktok/v1/donation/session/create")
    AbstractC73672Svk<DonationSessionResponse> createSession(@InterfaceC195727mC SessionCreationReq sessionCreationReq);

    @E8M("webcast/room/token_create/")
    @InterfaceC195757mF
    AbstractC73672Svk<DonationTokenResponse> tokenCreate(@InterfaceC64985Pev("item_type") int i, @InterfaceC64985Pev("item_id") Long l, @InterfaceC64985Pev("sec_uid") String str, @InterfaceC64985Pev("extra") String str2);
}

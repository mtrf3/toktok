package com.ss.android.ugc.aweme.donation;

import X.C76L;
import X.E4Q;
import X.InterfaceC64989Pez;

/* loaded from: classes11.dex */
public interface DonateApi {
    @E4Q("/aweme/v1/donate/item/")
    C76L<DonateResponse> getDonateDetail(@InterfaceC64989Pez("aweme_id") String str, @InterfaceC64989Pez("cursor") Integer num, @InterfaceC64989Pez("ngo_id") Integer num2, @InterfaceC64989Pez("sec_uid") String str2, @InterfaceC64989Pez("item_id") Long l, @InterfaceC64989Pez("item_type") Integer num3, @InterfaceC64989Pez("extra") String str3, @InterfaceC64989Pez("should_fetch_top_donor") boolean z);

    @E4Q("/tiktok/v1/donation/panel/get/")
    C76L<DonateResponse> getDonateDetailPercent(@InterfaceC64989Pez("aweme_id") String str, @InterfaceC64989Pez("cursor") Integer num, @InterfaceC64989Pez("organization_id") String str2, @InterfaceC64989Pez("sec_uid") String str3, @InterfaceC64989Pez("item_id") Long l, @InterfaceC64989Pez("item_type") Integer num2, @InterfaceC64989Pez("extra") String str4, @InterfaceC64989Pez("should_fetch_top_donor") boolean z);
}

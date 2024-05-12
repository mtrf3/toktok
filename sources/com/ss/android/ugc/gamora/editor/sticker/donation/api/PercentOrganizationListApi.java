package com.ss.android.ugc.gamora.editor.sticker.donation.api;

import X.AbstractC73672Svk;
import X.C42871Gs7;
import X.E8L;
import X.InterfaceC64986Pew;
import com.ss.android.ugc.gamora.editor.sticker.donation.model.OrganizationResponse;

/* loaded from: classes8.dex */
public interface PercentOrganizationListApi {
    public static final C42871Gs7 LIZ = C42871Gs7.LIZ;

    @E8L("/tiktok/v1/donation/ngo/list/")
    AbstractC73672Svk<OrganizationResponse> getOrganizationList(@InterfaceC64986Pew("cursor") int i, @InterfaceC64986Pew("count") int i2, @InterfaceC64986Pew("organization_type") String str);
}

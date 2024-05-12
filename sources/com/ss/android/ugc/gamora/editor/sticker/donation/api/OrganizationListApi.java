package com.ss.android.ugc.gamora.editor.sticker.donation.api;

import X.AbstractC73672Svk;
import X.E8L;
import X.InterfaceC64986Pew;
import com.ss.android.ugc.gamora.editor.sticker.donation.model.OrganizationResponse;

/* loaded from: classes2.dex */
public interface OrganizationListApi {
    @E8L("/aweme/v1/donation/orgs/")
    AbstractC73672Svk<OrganizationResponse> getOrganizationList(@InterfaceC64986Pew("cursor") int i, @InterfaceC64986Pew("count") int i2);
}

package com.ss.android.ugc.aweme.profile.widgets.api;

import X.AbstractC73672Svk;
import X.E8L;

/* loaded from: classes5.dex */
public interface LeadsGenAgeApi {
    @E8L("/tiktok/v1/edibility/birthdate/")
    AbstractC73672Svk<Object> getDoBStatus();

    @E8L("/aweme/v1/ad/ba/leadsgen/check/age/")
    AbstractC73672Svk<Object> getLeadsGenAgeMessage();
}

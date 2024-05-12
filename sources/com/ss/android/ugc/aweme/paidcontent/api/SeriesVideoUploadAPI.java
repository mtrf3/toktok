package com.ss.android.ugc.aweme.paidcontent.api;

import X.AbstractC73672Svk;
import X.E8L;
import X.InterfaceC64986Pew;

/* loaded from: classes5.dex */
public final class SeriesVideoUploadAPI {
    public static SeriesListingAPI LIZ;

    /* loaded from: classes5.dex */
    public interface SeriesListingAPI {
        @E8L("/tiktok/v1/paid_content/creator/collections")
        AbstractC73672Svk<SeriesListingResponse> getSeriesList(@InterfaceC64986Pew("source") int i);
    }
}

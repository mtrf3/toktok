package com.twitter.sdk.android.core.services;

import X.E4T;
import X.InterfaceC51460KHo;
import X.InterfaceC64978Peo;
import X.InterfaceC65079PgR;
import X.PVP;

/* loaded from: classes12.dex */
public interface MediaService {
    @InterfaceC51460KHo
    @E4T("https://upload.twitter.com/1.1/media/upload.json")
    InterfaceC65079PgR<Object> upload(@InterfaceC64978Peo("media") PVP pvp, @InterfaceC64978Peo("media_data") PVP pvp2, @InterfaceC64978Peo("additional_owners") PVP pvp3);
}

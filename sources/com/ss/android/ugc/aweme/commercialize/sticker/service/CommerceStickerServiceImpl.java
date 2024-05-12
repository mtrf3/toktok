package com.ss.android.ugc.aweme.commercialize.sticker.service;

import X.C59854NeM;
import X.OH4;
import X.T51;
import Y.AObjectS47S0101000_2;
import android.view.ViewStub;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class CommerceStickerServiceImpl implements ICommerceStickerService {
    @Override // com.ss.android.ugc.aweme.commercialize.sticker.service.ICommerceStickerService
    public final void LIZIZ(OH4 oh4) {
        C59854NeM.LIZ.LIZIZ(oh4);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.sticker.service.ICommerceStickerService
    public final T51 LIZ(ViewStub adTagVs, ViewStub authorVs, ViewStub descVs, ViewStub disclaimerVs, ViewStub linkVs, ViewStub missionVs, AObjectS47S0101000_2 aObjectS47S0101000_2) {
        o.LJIIIZ(adTagVs, "adTagVs");
        o.LJIIIZ(authorVs, "authorVs");
        o.LJIIIZ(descVs, "descVs");
        o.LJIIIZ(disclaimerVs, "disclaimerVs");
        o.LJIIIZ(linkVs, "linkVs");
        o.LJIIIZ(missionVs, "missionVs");
        return new T51(adTagVs, authorVs, descVs, disclaimerVs, linkVs, missionVs, aObjectS47S0101000_2);
    }
}

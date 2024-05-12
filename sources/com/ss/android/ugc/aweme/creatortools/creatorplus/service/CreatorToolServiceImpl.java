package com.ss.android.ugc.aweme.creatortools.creatorplus.service;

import X.AbstractC36908Ee8;
import X.AbstractC73672Svk;
import X.C73536StY;
import com.ss.android.ugc.aweme.creatortools.creatorplus.CreatorPlusApi;
import com.ss.android.ugc.aweme.creatortools.creatorplus.CreatorPlusFeaturesResponse;
import com.ss.android.ugc.aweme.setting.services.ICreatorToolService;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class CreatorToolServiceImpl implements ICreatorToolService {
    @Override // com.ss.android.ugc.aweme.setting.services.ICreatorToolService
    public final AbstractC73672Svk<CreatorPlusFeaturesResponse> getCreatorPlusFeatures() {
        try {
            return CreatorPlusApi.LIZ.getValue().getCreatorPlusFeatures();
        } catch (ExecutionException e) {
            AbstractC36908Ee8.getCompatibleException(e);
            C73536StY c73536StY = C73536StY.LJLIL;
            o.LJIIIIZZ(c73536StY, "empty()");
            return c73536StY;
        }
    }
}

package com.ss.android.ugc.gamora.editor.audioservice.service.debugtool;

import X.C60903NvH;
import X.EF7;
import com.ss.android.ugc.aweme.services.audio.ISamiDebugToolService;

/* loaded from: classes7.dex */
public final class SamiDebugToolServiceImpl implements ISamiDebugToolService {
    @Override // com.ss.android.ugc.aweme.services.audio.ISamiDebugToolService
    public final String getAppId() {
        C60903NvH.LJIIJJI().getApplicationService().getClass();
        return String.valueOf(EF7.LJIIIZ);
    }

    @Override // com.ss.android.ugc.aweme.services.audio.ISamiDebugToolService
    public final String getCreativeToolRoot() {
        return C60903NvH.LJIIJJI().LJJIJL().getPathService().getRoot();
    }
}

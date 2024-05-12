package com.ss.android.ugc.aweme.service;

import X.C221108m2;
import X.C62822Ol8;
import X.LHI;
import X.LHK;
import com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService;
import com.ss.android.ugc.aweme.friendstab.service.ISocial2TabRedDotService;
import com.ss.android.ugc.aweme.friendstab.service.ISocial2TabService;

/* loaded from: classes10.dex */
public final class Social2TabServiceImpl implements ISocial2TabService {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(LHI.LJLIL);
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(LHK.LJLIL);

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabService
    public final ISocial2TabDelegateService LIZ() {
        return (ISocial2TabDelegateService) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabService
    public final ISocial2TabRedDotService LIZIZ() {
        return (ISocial2TabRedDotService) this.LIZIZ.getValue();
    }
}

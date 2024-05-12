package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;

/* loaded from: classes4.dex */
public class VisionSearchStruct {

    @InterfaceC65349Pkn("privacy")
    public VisionSearchPrivacy privacy;

    public VisionSearchPrivacy getPrivacy() {
        VisionSearchPrivacy visionSearchPrivacy = this.privacy;
        if (visionSearchPrivacy != null) {
            return visionSearchPrivacy;
        }
        throw new C158056If();
    }
}

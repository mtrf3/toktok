package com.bytedance.android.live.liveinteract.platform.common.utils;

import X.C76800UCe;
import X.EnumC38440F6u;
import X.InterfaceC65784Pro;
import X.InterfaceC75560Tl6;
import X.TVX;
import X.TX2;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;

@InterfaceC75560Tl6(name = "LINK_MIC_APP_BUNDLE_UTIL")
/* loaded from: classes14.dex */
public final class LinkMicAppBundleUtil implements TX2 {
    public static final /* synthetic */ int LIZLLL = 0;
    public final boolean LIZ;
    public int LIZIZ = Integer.MAX_VALUE;
    public int LIZJ;

    @Override // X.TX2
    public final boolean LIZ() {
        if (this.LIZIZ == -14) {
            return false;
        }
        this.LIZJ = 1;
        return true;
    }

    @Override // X.TX2
    public final int LIZLLL() {
        return this.LIZJ;
    }

    public LinkMicAppBundleUtil(boolean z) {
        this.LIZ = z;
    }

    @Override // X.TX2
    public final void LIZJ(int i) {
        this.LIZIZ = i;
    }

    @Override // X.TX2
    public final void LIZIZ(String str, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        EnumC38440F6u enumC38440F6u = EnumC38440F6u.LINK_MIC;
        if (LiveAppBundleUtils.isPluginAvailable(enumC38440F6u)) {
            interfaceC65784Pro.invoke();
        } else {
            this.LIZIZ = Integer.MAX_VALUE;
            LiveAppBundleUtils.ensurePluginAvailable(enumC38440F6u, new TVX(this, System.currentTimeMillis(), str, interfaceC65784Pro), false);
        }
    }
}

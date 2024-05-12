package com.ss.android.ugc.aweme.music.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class RessoCollectInfo extends F9E implements Serializable {

    @InterfaceC65349Pkn("added_on_resso")
    public final boolean addedOnResso;

    @InterfaceC65349Pkn("deep_link")
    public final String deepLink;

    public static /* synthetic */ RessoCollectInfo copy$default(RessoCollectInfo ressoCollectInfo, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = ressoCollectInfo.addedOnResso;
        }
        if ((i & 2) != 0) {
            str = ressoCollectInfo.deepLink;
        }
        return ressoCollectInfo.copy(z, str);
    }

    public final RessoCollectInfo copy(boolean z, String deepLink) {
        o.LJIIIZ(deepLink, "deepLink");
        return new RessoCollectInfo(z, deepLink);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.addedOnResso), this.deepLink};
    }

    public final boolean getAddedOnResso() {
        return this.addedOnResso;
    }

    public final String getDeepLink() {
        return this.deepLink;
    }

    public RessoCollectInfo(boolean z, String deepLink) {
        o.LJIIIZ(deepLink, "deepLink");
        this.addedOnResso = z;
        this.deepLink = deepLink;
    }
}

package com.ss.android.ugc.aweme.discover.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class CommerceChallengeBanner extends F9E implements Serializable {

    @InterfaceC65349Pkn("icon")
    public final UrlModel icon;

    @InterfaceC65349Pkn("open_url")
    public final String openUrl;

    @InterfaceC65349Pkn("web_url")
    public final String webUrl;

    public static /* synthetic */ CommerceChallengeBanner copy$default(CommerceChallengeBanner commerceChallengeBanner, UrlModel urlModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            urlModel = commerceChallengeBanner.icon;
        }
        if ((i & 2) != 0) {
            str = commerceChallengeBanner.webUrl;
        }
        if ((i & 4) != 0) {
            str2 = commerceChallengeBanner.openUrl;
        }
        return commerceChallengeBanner.copy(urlModel, str, str2);
    }

    public final CommerceChallengeBanner copy(UrlModel icon, String webUrl, String openUrl) {
        o.LJIIIZ(icon, "icon");
        o.LJIIIZ(webUrl, "webUrl");
        o.LJIIIZ(openUrl, "openUrl");
        return new CommerceChallengeBanner(icon, webUrl, openUrl);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.icon, this.webUrl, this.openUrl};
    }

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final String getOpenUrl() {
        return this.openUrl;
    }

    public final String getWebUrl() {
        return this.webUrl;
    }

    public CommerceChallengeBanner(UrlModel icon, String webUrl, String openUrl) {
        o.LJIIIZ(icon, "icon");
        o.LJIIIZ(webUrl, "webUrl");
        o.LJIIIZ(openUrl, "openUrl");
        this.icon = icon;
        this.webUrl = webUrl;
        this.openUrl = openUrl;
    }
}

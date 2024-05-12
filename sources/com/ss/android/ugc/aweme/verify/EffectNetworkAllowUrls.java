package com.ss.android.ugc.aweme.verify;

import X.C47261Igj;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class EffectNetworkAllowUrls extends F9E {

    @InterfaceC65349Pkn("urls")
    public final List<String> urls;

    /* JADX WARN: Multi-variable type inference failed */
    public EffectNetworkAllowUrls() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.urls};
    }

    public EffectNetworkAllowUrls(List<String> urls) {
        o.LJIIIZ(urls, "urls");
        this.urls = urls;
    }

    public /* synthetic */ EffectNetworkAllowUrls(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C47261Igj.LJJIJIIJI("^https://api.tiktokv.com/media/api/pic/afr$", "^https://api2.musical.ly/media/api/pic/afr$", "^https://api16-normal-c-alisg.tiktokv.com/media/api/pic/afr$", "^https://api16-normal-useast5.us.tiktokv.com/media/api/pic/afr$", "^https://api22-normal-c-useast2a.tiktokv.com/media/api/pic/afr$", "^https://api.tiktokv.com/tiktok/user/relation/mutual_friends/list/v1.*", "^https?://ar(-va|-sg|-i18n|-us|-ttp)?.byteintlapi.com/api/contents/ar-keys/.*", "^https?://ar(-va|-sg|-i18n|-us|-ttp)?.byteintlapi.com/near-points-v3.*", "^https?://ar(-va|-sg|-i18n|-us|-ttp)?.isnssdk.com/near-points-v3.*", "^https?://ar(-va|-sg|-i18n|-us|-ttp)?.byteintlapi.com/v1/ttpoi/api/.*", "^https://api.tiktokv.com//media/api/text/speech/invoke/.*", "^https://sami(-va|-sg|-i18n|-us)?.tiktokv.com/.*", "^https://p[0-9]{1,2}[a-z0-9-]*(va|sg|i18n|us).tiktokcdn.com/.*") : list);
    }
}

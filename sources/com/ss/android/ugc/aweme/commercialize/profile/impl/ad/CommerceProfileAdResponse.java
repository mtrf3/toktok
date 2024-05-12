package com.ss.android.ugc.aweme.commercialize.profile.impl.ad;

import X.InterfaceC58699N1z;
import X.InterfaceC65349Pkn;
import X.V0N;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* loaded from: classes11.dex */
public final class CommerceProfileAdResponse extends BaseResponse {

    @InterfaceC65349Pkn("aweme_list")
    public final List<Aweme> awemeList;

    @InterfaceC65349Pkn("no_ad_reason")
    public final NoAdReason noAdReason;

    /* loaded from: classes11.dex */
    public enum NoAdReason implements InterfaceC58699N1z<String> {
        POLITICAL_ACCOUNT("political_account"),
        STATE_CONTROLLED_MEDIA("state_controlled_media"),
        SHOP_ACCOUNT("shop_account");

        public final String LJLIL;

        public static NoAdReason valueOf(String str) {
            return (NoAdReason) V0N.LJJJ(NoAdReason.class, str);
        }

        @Override // X.InterfaceC58699N1z
        public String getParamValue() {
            return this.LJLIL;
        }

        NoAdReason(String str) {
            this.LJLIL = str;
        }
    }
}

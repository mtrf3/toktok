package com.bytedance.android.livesdk.guide.model;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes14.dex */
public final class GuideKeywordsResponse {

    @InterfaceC65349Pkn("data")
    public Data data;

    /* loaded from: classes14.dex */
    public static final class Data {

        @InterfaceC65349Pkn("keywords_library")
        public List<KeywordsLibrary> keywordsLibrary = new ArrayList();

        @InterfaceC65349Pkn("user_info")
        public UserInfo userInfo;

        @InterfaceC65349Pkn("version")
        public long version;
    }

    /* loaded from: classes14.dex */
    public static final class UserInfo {

        @InterfaceC65349Pkn("coin_exchange_prompt")
        public String coinExchangePrompt = "";

        @InterfaceC65349Pkn("has_ever_recharged")
        public boolean hasEverRecharged;

        @InterfaceC65349Pkn("is_in_eea")
        public boolean isInEea;

        @InterfaceC65349Pkn("suggested_max_coins")
        public long suggestedMaxCoins;

        @InterfaceC65349Pkn("suggested_min_coins")
        public long suggestedMinCoins;
    }
}

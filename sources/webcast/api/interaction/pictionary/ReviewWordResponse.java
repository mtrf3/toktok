package webcast.api.interaction.pictionary;

import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public final class ReviewWordResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    @InterfaceC65349Pkn("extra")
    public ReviewWordExtra extra;

    /* loaded from: classes6.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("word")
        public String word = "";
    }

    /* loaded from: classes6.dex */
    public static final class ReviewWordExtra {

        @InterfaceC65349Pkn("now")
        public long now;
    }
}

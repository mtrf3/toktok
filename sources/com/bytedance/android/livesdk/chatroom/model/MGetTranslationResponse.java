package com.bytedance.android.livesdk.chatroom.model;

import X.C113554cx;
import X.InterfaceC65349Pkn;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class MGetTranslationResponse {

    @InterfaceC65349Pkn("data")
    public Data data;

    /* loaded from: classes6.dex */
    public static final class Data {

        @InterfaceC65349Pkn("translations")
        public Map<String, Translation> translations = C113554cx.LJJJLIIL();

        /* loaded from: classes6.dex */
        public static final class Translation {

            @InterfaceC65349Pkn("translated")
            public boolean translated;

            @InterfaceC65349Pkn("translation")
            public String translation = "";

            @InterfaceC65349Pkn("emotes_index_map")
            public Map<Long, Long> emotesIndexMap = new LinkedHashMap();
        }
    }
}

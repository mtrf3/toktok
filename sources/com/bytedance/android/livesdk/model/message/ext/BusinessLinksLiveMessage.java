package com.bytedance.android.livesdk.model.message.ext;

import X.CR6;
import X.InterfaceC65349Pkn;

/* loaded from: classes11.dex */
public class BusinessLinksLiveMessage extends CR6 {

    @InterfaceC65349Pkn("card_type")
    public int cardType;

    @InterfaceC65349Pkn("game_url")
    public String gameUrl;

    @InterfaceC65349Pkn("id")
    public long id;

    @InterfaceC65349Pkn("op")
    public int op;

    @InterfaceC65349Pkn("op_time")
    public long opTime;

    @InterfaceC65349Pkn("pic")
    public String pic;

    @InterfaceC65349Pkn("subtitle")
    public String subtitle;

    @InterfaceC65349Pkn("title")
    public String title;

    @InterfaceC65349Pkn("url")
    public String url;

    @Override // X.CR6, com.ss.ugc.live.sdk.message.data.IMessage
    public final int getIntType() {
        return 20000;
    }
}

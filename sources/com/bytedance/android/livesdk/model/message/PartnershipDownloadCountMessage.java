package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public final class PartnershipDownloadCountMessage extends CR6 {

    @InterfaceC65349Pkn("downloaded_count")
    public long downloadedCount;

    @InterfaceC65349Pkn("game_id")
    public String gameId;

    public PartnershipDownloadCountMessage() {
        this.type = EnumC31509CYf.PARTNERSHIP_DOWNLOAD_COUNT_MESSAGE;
        this.gameId = "";
    }
}

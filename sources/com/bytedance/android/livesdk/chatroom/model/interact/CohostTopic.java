package com.bytedance.android.livesdk.chatroom.model.interact;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes14.dex */
public final class CohostTopic {

    @InterfaceC65349Pkn("id")
    public long id;

    @InterfaceC65349Pkn("liked")
    public boolean liked;

    @InterfaceC65349Pkn("total_heat")
    public long totalHeat;

    @InterfaceC65349Pkn("total_rivals")
    public long totalRivals;

    @InterfaceC65349Pkn("title_key")
    public String titleKey = "";

    @InterfaceC65349Pkn("title_text")
    public String titleText = "";

    @InterfaceC65349Pkn("rivals_avatar")
    public List<ImageModel> rivalsAvatar = new ArrayList();
}

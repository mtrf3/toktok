package com.bytedance.android.livesdk.chatroom.api;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;

/* loaded from: classes14.dex */
public final class SubPinCard {

    @InterfaceC65349Pkn("desc")
    public Text desc;

    @InterfaceC65349Pkn("goal_pin_card")
    public SubGoalPinCard goalPinCard;

    @InterfaceC65349Pkn("id")
    public long id;

    @InterfaceC65349Pkn("image")
    public ImageModel image;

    @InterfaceC65349Pkn("template_id")
    public long templateId;

    @InterfaceC65349Pkn("time_to_live")
    public long timeToLive;

    @InterfaceC65349Pkn("title")
    public Text title;

    @InterfaceC65349Pkn("type")
    public int type;

    /* loaded from: classes14.dex */
    public static final class Text {

        @InterfaceC65349Pkn("Content")
        public String content = "";

        @InterfaceC65349Pkn("type")
        public int type;
    }
}

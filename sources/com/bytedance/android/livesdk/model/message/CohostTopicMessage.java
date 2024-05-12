package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostTopic;
import com.bytedance.android.livesdk.chatroom.model.interact.TopicSessionStatus;

/* loaded from: classes14.dex */
public final class CohostTopicMessage extends CR6 {

    @InterfaceC65349Pkn("action")
    public int action;

    @InterfaceC65349Pkn("heat_update_content")
    public HeatUpdateContent heatUpdateContent;

    @InterfaceC65349Pkn("session_status")
    public TopicSessionStatus sessionStatus;

    @InterfaceC65349Pkn("topic")
    public CohostTopic topic;

    @InterfaceC65349Pkn("topic_set_content")
    public TopicSetContent topicSetContent;

    public CohostTopicMessage() {
        this.type = EnumC31509CYf.COHOST_TOPIC_MESSAGE;
    }
}

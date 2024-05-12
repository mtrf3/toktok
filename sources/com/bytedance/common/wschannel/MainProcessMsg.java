package com.bytedance.common.wschannel;

import X.QOR;
import com.bytedance.common.wschannel.model.WsChannelMsg;

/* loaded from: classes12.dex */
public final class MainProcessMsg extends WsChannelMsg {
    public final QOR mListener;
    public final WsChannelMsg origin;

    public MainProcessMsg(WsChannelMsg wsChannelMsg, QOR qor) {
        super(wsChannelMsg);
        this.origin = wsChannelMsg;
        this.mListener = qor;
    }
}

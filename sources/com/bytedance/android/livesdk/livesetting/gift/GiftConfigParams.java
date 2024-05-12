package com.bytedance.android.livesdk.livesetting.gift;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes14.dex */
public final class GiftConfigParams {

    @InterfaceC65349Pkn("anchor_side")
    public GiftConfig _anchorSide;

    @InterfaceC65349Pkn("enable_config")
    public boolean _enableConfig;

    @InterfaceC65349Pkn("other_queue_size_stairs")
    public List<MsgStair> _otherQueueStairs;

    @InterfaceC65349Pkn("other_side")
    public GiftConfig _otherSide;

    @InterfaceC65349Pkn("self_queue_size_stairs")
    public List<MsgStair> _selfQueueStairs;

    @InterfaceC65349Pkn("self_side")
    public GiftConfig _selfSide;

    public GiftConfigParams() {
        GiftConfig giftConfig = GiftConfig.LIZ;
        this._selfSide = giftConfig;
        this._anchorSide = giftConfig;
        this._otherSide = giftConfig;
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        this._selfQueueStairs = c61878OQg;
        this._otherQueueStairs = c61878OQg;
    }
}

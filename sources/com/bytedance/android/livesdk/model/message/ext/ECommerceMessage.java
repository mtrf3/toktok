package com.bytedance.android.livesdk.model.message.ext;

import X.CR6;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.message.AtmosphereTagInfo;
import com.bytedance.android.livesdk.model.message.LivePermissionInfo;
import com.bytedance.android.livesdk.model.message.ProductSnapShot;
import java.util.List;

/* loaded from: classes13.dex */
public class ECommerceMessage extends CR6 {

    @InterfaceC65349Pkn("action_type")
    public int actionType;

    @InterfaceC65349Pkn("atmosphere_tag_info")
    public AtmosphereTagInfo atmosphereTagInfo;

    @InterfaceC65349Pkn("hot_tags")
    public List<HotTag> hotTags;

    @InterfaceC65349Pkn("live_permission_info")
    public LivePermissionInfo livePermissionInfo;

    @InterfaceC65349Pkn("live_product_number")
    public int liveProductNumber;

    @InterfaceC65349Pkn("pin_card_delay_time")
    public long pinCardDelayTime;

    @InterfaceC65349Pkn("pop_product")
    public PopProduct popProduct;

    @InterfaceC65349Pkn("product_snap_shot")
    public ProductSnapShot productSnapShot;

    @InterfaceC65349Pkn("trace_info")
    public TraceInfo traceInfo;

    @Override // X.CR6, com.ss.ugc.live.sdk.message.data.IMessage
    public final int getIntType() {
        return 10000;
    }
}

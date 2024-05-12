package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class EffectPreloadingMessage extends CR6 {

    @InterfaceC65349Pkn("effect_id")
    public List<Long> effectId;

    @InterfaceC65349Pkn("gift_id")
    public List<Long> giftId;

    @InterfaceC65349Pkn("log_id")
    public String logId;

    @InterfaceC65349Pkn("priority")
    public GiftIMPriority priority;

    public EffectPreloadingMessage() {
        this.type = EnumC31509CYf.EFFECT_PRELOADING_MESSAGE;
        this.giftId = new ArrayList();
        this.effectId = new ArrayList();
        this.logId = "";
    }
}

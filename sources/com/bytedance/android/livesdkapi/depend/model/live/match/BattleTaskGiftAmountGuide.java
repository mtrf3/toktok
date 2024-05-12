package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;

/* loaded from: classes14.dex */
public final class BattleTaskGiftAmountGuide {

    @InterfaceC65349Pkn("disappear_duration")
    public int disappearDuration = 5;

    @InterfaceC65349Pkn("gift_image")
    public ImageModel giftImage;

    @InterfaceC65349Pkn("guide_content")
    public Text guideContent;

    @InterfaceC65349Pkn("guide_prompt")
    public BattlePrompt guidePrompt;

    @InterfaceC65349Pkn("icon_image")
    public ImageModel iconImage;

    @InterfaceC65349Pkn("prompt_type")
    public int promptType;

    @InterfaceC65349Pkn("recommend_gift_count")
    public int recommendGiftCount;

    @InterfaceC65349Pkn("recommend_gift_id")
    public long recommendGiftId;
}

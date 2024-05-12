package com.bytedance.android.livesdk.chatroom.model.interact.audience;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;

/* loaded from: classes16.dex */
public final class LinkmicAudienceEmoji extends F9E {

    @InterfaceC65349Pkn("animation_duration_ms")
    public Long animationDurationMs;

    @InterfaceC65349Pkn("emoji_dynamic_image")
    public ImageModel emojiDynamicImage;

    @InterfaceC65349Pkn("emoji_id")
    public Long emojiId;

    @InterfaceC65349Pkn("emoji_image")
    public ImageModel emojiImage;

    @InterfaceC65349Pkn("emoji_name")
    public String emojiName;

    @InterfaceC65349Pkn("emoji_result_duration_ms")
    public Long emojiResultDurationMs;

    @InterfaceC65349Pkn("is_random")
    public Boolean isRandom;

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.emojiId;
        Boolean bool = this.isRandom;
        ImageModel imageModel = this.emojiImage;
        ImageModel imageModel2 = this.emojiDynamicImage;
        String str = this.emojiName;
        Long l2 = this.animationDurationMs;
        Long l3 = this.emojiResultDurationMs;
        return new Object[]{l, l, bool, bool, imageModel, imageModel, imageModel2, imageModel2, str, str, l2, l2, l3, l3};
    }
}

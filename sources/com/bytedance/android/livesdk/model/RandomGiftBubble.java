package com.bytedance.android.livesdk.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class RandomGiftBubble extends F9E {

    @InterfaceC65349Pkn("display_text")
    public String bubbleDisplayText;

    @InterfaceC65349Pkn("icon_dynamic_effect")
    public ImageModel image;

    /* JADX WARN: Multi-variable type inference failed */
    public RandomGiftBubble() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.bubbleDisplayText, this.image};
    }

    public RandomGiftBubble(String str, ImageModel imageModel) {
        this.bubbleDisplayText = str;
        this.image = imageModel;
    }

    public /* synthetic */ RandomGiftBubble(String str, ImageModel imageModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : imageModel);
    }
}

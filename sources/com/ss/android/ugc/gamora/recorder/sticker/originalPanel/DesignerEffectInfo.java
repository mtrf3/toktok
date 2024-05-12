package com.ss.android.ugc.gamora.recorder.sticker.originalPanel;

import X.AbstractC73672Svk;
import X.E4Q;
import X.InterfaceC64989Pez;

/* loaded from: classes7.dex */
public interface DesignerEffectInfo {
    @E4Q("/aweme/v1/original/effect/list/")
    AbstractC73672Svk<StickerItemList> fetch(@InterfaceC64989Pez("user_id") String str, @InterfaceC64989Pez("cursor") int i, @InterfaceC64989Pez("count") int i2);
}

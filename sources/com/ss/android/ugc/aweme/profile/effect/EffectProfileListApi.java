package com.ss.android.ugc.aweme.profile.effect;

import X.AbstractC73672Svk;
import X.C73175Snj;
import X.E4Q;
import X.InterfaceC64989Pez;

/* loaded from: classes13.dex */
public interface EffectProfileListApi {
    public static final C73175Snj LIZ = C73175Snj.LIZ;

    @E4Q("/aweme/v1/original/effect/list/")
    AbstractC73672Svk<StickerItemList> fetch(@InterfaceC64989Pez("user_id") String str, @InterfaceC64989Pez("cursor") long j, @InterfaceC64989Pez("count") int i);
}

package com.ss.android.ugc.aweme.commercialize.tcm.api;

import X.AbstractC73672Svk;
import X.E8M;
import X.InterfaceC64986Pew;
import com.ss.android.ugc.aweme.feed.model.BABCRemoveMe;

/* loaded from: classes2.dex */
public interface BABCRemoveMeApi {
    @E8M("/aweme/v1/ad/ba/branded/content/remove/me/")
    AbstractC73672Svk<BABCRemoveMe> getBABCRemoveMe(@InterfaceC64986Pew("item_id") String str);
}

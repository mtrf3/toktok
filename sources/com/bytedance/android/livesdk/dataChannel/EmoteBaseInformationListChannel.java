package com.bytedance.android.livesdk.dataChannel;

import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.ies.sdk.datachannel.GlobalChannel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class EmoteBaseInformationListChannel extends GlobalChannel<List<? extends EmoteModel>> {
    public EmoteBaseInformationListChannel() {
        super(new ArrayList(), false, 2, null);
    }
}

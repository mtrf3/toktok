package com.ss.android.ugc.gamora.ugctemplate.bizmodel;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class TTSModel {

    @InterfaceC65349Pkn("slot_uuid")
    public final String slotUuid;

    @InterfaceC65349Pkn("voice_res_id")
    public final String voiceResId;

    public TTSModel(String slotUuid, String voiceResId) {
        o.LJIIIZ(slotUuid, "slotUuid");
        o.LJIIIZ(voiceResId, "voiceResId");
        this.slotUuid = slotUuid;
        this.voiceResId = voiceResId;
    }
}

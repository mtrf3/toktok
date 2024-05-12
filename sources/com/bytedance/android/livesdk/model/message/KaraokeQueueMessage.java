package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.KaraokeSong;

/* loaded from: classes6.dex */
public final class KaraokeQueueMessage extends CR6 {

    @InterfaceC65349Pkn("song")
    public KaraokeSong song;

    @InterfaceC65349Pkn("type")
    public int type;

    public KaraokeQueueMessage() {
        super.type = EnumC31509CYf.KARAOKE_QUEUE_MESSAGE;
    }
}

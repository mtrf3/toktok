package com.bytedance.android.live.publicscreen.impl.api;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import com.bytedance.android.live.publicscreen.impl.api.model.CommentTranslationResult;
import com.bytedance.android.livesdk.chatroom.model.WaveResponse;

/* loaded from: classes6.dex */
public interface PublicScreenApi {
    @E8M("/webcast/room/comment_translate/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<CommentTranslationResult>> translateComment(@InterfaceC64985Pev("comment_content") String str, @InterfaceC64985Pev("anchor_id") long j, @InterfaceC64985Pev("room_id") long j2, @InterfaceC64985Pev("msg_id") long j3, @InterfaceC64985Pev("room_message_heat_level") long j4, @InterfaceC64985Pev("at_username") String str2, @InterfaceC64985Pev("at_nickname") String str3, @InterfaceC64985Pev("emotes_index") String str4);

    @E8M("/webcast/room/wave/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<WaveResponse>> wave(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("enter_uid") long j2);
}

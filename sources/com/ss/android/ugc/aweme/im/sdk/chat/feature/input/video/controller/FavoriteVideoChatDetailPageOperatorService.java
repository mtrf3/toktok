package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.controller;

import X.C55458Lpe;
import X.InterfaceC50422Jqc;
import com.ss.android.ugc.aweme.IDetailPageOperatorService;
import java.util.HashMap;

/* loaded from: classes10.dex */
public final class FavoriteVideoChatDetailPageOperatorService implements IDetailPageOperatorService {
    @Override // com.ss.android.ugc.aweme.IDetailPageOperatorService
    public final HashMap<String, InterfaceC50422Jqc> LIZ() {
        HashMap<String, InterfaceC50422Jqc> hashMap = new HashMap<>();
        hashMap.put("from_chat_favorite_video_panel", new C55458Lpe());
        return hashMap;
    }
}

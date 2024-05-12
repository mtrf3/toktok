package com.ss.android.ugc.aweme.detail.operators;

import X.C51038K1i;
import X.C51039K1j;
import X.C51040K1k;
import X.C51041K1l;
import X.C51042K1m;
import X.C51043K1n;
import X.C51044K1o;
import X.C51046K1q;
import X.InterfaceC50422Jqc;
import X.KQG;
import X.KQH;
import X.KQI;
import com.ss.android.ugc.aweme.IDetailPageOperatorService;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final class DetailPageOperatorServiceImpl implements IDetailPageOperatorService {
    @Override // com.ss.android.ugc.aweme.IDetailPageOperatorService
    public final HashMap<String, InterfaceC50422Jqc> LIZ() {
        HashMap<String, InterfaceC50422Jqc> hashMap = new HashMap<>();
        hashMap.put("from_time_line", new C51046K1q());
        hashMap.put("from_music_children_mode", new C51041K1l());
        hashMap.put("from_challenge_children_mode", new C51042K1m());
        hashMap.put("from_window_following", new C51038K1i());
        hashMap.put("from_chat", new KQH());
        hashMap.put("from_auto_message", new KQI());
        hashMap.put("from_chat_inner_cell", new KQG());
        hashMap.put("from_no_request", new C51039K1j());
        hashMap.put("from_commerce_banner", new C51040K1k());
        hashMap.put("from_notification_page_repost_entrance", new C51043K1n());
        hashMap.put("from_publishing_video", new C51044K1o());
        return hashMap;
    }
}

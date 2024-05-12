package com.ss.android.ugc.aweme.ttsvoice.repo;

import X.C60054Nha;
import X.InterfaceC50422Jqc;
import com.ss.android.ugc.aweme.IDetailPageOperatorService;
import java.util.HashMap;

/* loaded from: classes11.dex */
public final class TTSVoiceDetailPageOperatorServiceImpl implements IDetailPageOperatorService {
    @Override // com.ss.android.ugc.aweme.IDetailPageOperatorService
    public final HashMap<String, InterfaceC50422Jqc> LIZ() {
        HashMap<String, InterfaceC50422Jqc> hashMap = new HashMap<>();
        hashMap.put("from_tts_page", new C60054Nha());
        return hashMap;
    }
}

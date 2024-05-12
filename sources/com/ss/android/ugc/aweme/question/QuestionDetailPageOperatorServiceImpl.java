package com.ss.android.ugc.aweme.question;

import X.InterfaceC50422Jqc;
import X.MIH;
import X.MII;
import com.ss.android.ugc.aweme.IDetailPageOperatorService;
import java.util.HashMap;

/* loaded from: classes10.dex */
public final class QuestionDetailPageOperatorServiceImpl implements IDetailPageOperatorService {
    @Override // com.ss.android.ugc.aweme.IDetailPageOperatorService
    public final HashMap<String, InterfaceC50422Jqc> LIZ() {
        HashMap<String, InterfaceC50422Jqc> hashMap = new HashMap<>();
        hashMap.put("from_question", new MII());
        hashMap.put("qa_detail", new MIH());
        return hashMap;
    }
}

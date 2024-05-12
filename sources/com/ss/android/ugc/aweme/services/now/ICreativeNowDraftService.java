package com.ss.android.ugc.aweme.services.now;

import X.C76800UCe;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.services.now.model.CreativeNowDraft;
import java.util.List;

/* loaded from: classes8.dex */
public interface ICreativeNowDraftService {
    void deleteDraft(CreativeNowDraft creativeNowDraft);

    List<CreativeNowDraft> getNowDraftList();

    void getNowDraftListAsync(InterfaceC88472Yns<? super List<CreativeNowDraft>, C76800UCe> interfaceC88472Yns);
}

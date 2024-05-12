package com.ss.ugc.android.editor.components.base.api;

import X.ActivityC45651qj;
import X.AnonymousClass508;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import android.content.Intent;
import com.bytedance.news.common.service.manager.IService;
import com.ss.ugc.android.editor.core.api.params.EditMedia;
import java.util.List;

/* loaded from: classes3.dex */
public interface IAlbumService extends IService {
    int getResultCode();

    List<EditMedia> parseIntentData(ActivityC45651qj activityC45651qj, Intent intent, Integer num);

    void startSelectMedia(ActivityC45651qj activityC45651qj, int i, AnonymousClass508 anonymousClass508, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro);
}

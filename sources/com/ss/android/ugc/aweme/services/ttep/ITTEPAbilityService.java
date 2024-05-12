package com.ss.android.ugc.aweme.services.ttep;

import X.ActivityC45651qj;
import X.C10K;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* loaded from: classes5.dex */
public interface ITTEPAbilityService {
    void downloadEffectAndJumpShootPage(ActivityC45651qj activityC45651qj, InterfaceC65784Pro<Boolean> interfaceC65784Pro, String str, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns2);

    void downloadPreviewEffectAndResource(String str, String str2, IDownloadCallback iDownloadCallback);

    void downloadPreviewEffectAndResourceWithoutLogin(String str, String str2, IDownloadCallback iDownloadCallback);

    C10K<Effect> downloadPreviewEffectAndResourceWithoutLoginTask(String str, String str2);

    void fetchTTEPMaterials(String str, InterfaceC88471Ynr<Object, ? super Exception, C76800UCe> interfaceC88471Ynr);
}

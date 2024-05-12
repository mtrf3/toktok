package com.ss.android.ugc.aweme.ttep.effectapply;

import X.C10K;
import X.E8L;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import com.ss.android.ugc.aweme.modeo.ttep.moderation.PreviewMaterials;

/* loaded from: classes16.dex */
public interface EffectFetchApi {
    @E8L("/api/internal/preview_materials")
    C10K<PreviewMaterials> fetchTTEPMaterials();

    @E8M("/api/app/effect_meta")
    @InterfaceC195757mF
    C10K<EffectFetchApiResBean> getEffectMeta(@InterfaceC64985Pev("effect_id") String str, @InterfaceC64985Pev("sdk_version") String str2, @InterfaceC64985Pev("device_platform") String str3);

    @E8M("/api/internal/effect_meta")
    @InterfaceC195757mF
    C10K<EffectFetchApiResBean> getEffectMetaWithoutLogin(@InterfaceC64985Pev("effect_id") String str, @InterfaceC64985Pev("sdk_version") String str2, @InterfaceC64985Pev("device_platform") String str3);
}

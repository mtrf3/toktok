package com.ss.android.ugc.aweme.services.audio;

import X.C76800UCe;
import X.InterfaceC67352kd;
import X.InterfaceC88472Yns;
import java.util.List;

/* loaded from: classes3.dex */
public interface IAudioWatermarkService extends IAudioService {
    boolean enbaleAudioWatermarkTTSVC();

    void fetchAudioWatermarkInfo(List<String> list, List<String> list2, InterfaceC88472Yns<? super AudioWatermarkInfo, C76800UCe> interfaceC88472Yns);

    Object fetchTtsCreatorInfoByIdList(List<String> list, InterfaceC67352kd<? super TtsCreatorInfo> interfaceC67352kd);

    Object fetchVcCreatorInfoByIdList(List<String> list, InterfaceC67352kd<? super VcCreatorInfo> interfaceC67352kd);
}

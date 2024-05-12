package com.ss.android.ugc.aweme.music.ui.reuseaudio;

import X.E8L;
import X.EFJ;
import X.InterfaceC37276Ek4;
import X.InterfaceC64986Pew;
import com.ss.android.ugc.aweme.detail.model.BatchDetailList;
import com.ss.android.ugc.aweme.services.RetrofitService;

/* loaded from: classes10.dex */
public final class ReuseAudioApi {
    public static final IReuseAudioApi LIZ = (IReuseAudioApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(EFJ.LIZJ).create(IReuseAudioApi.class);

    /* loaded from: classes10.dex */
    public interface IReuseAudioApi {
        @E8L("/aweme/v1/multi/aweme/detail/")
        InterfaceC37276Ek4<BatchDetailList> queryBatchAweme(@InterfaceC64986Pew("aweme_ids") String str, @InterfaceC64986Pew("request_source") int i);
    }
}

package com.ss.android.ugc.gamora.editorpro.soundeffect.data;

import X.E4Q;
import X.InterfaceC195737mD;
import X.InterfaceC37276Ek4;
import X.InterfaceC64986Pew;
import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;

/* loaded from: classes3.dex */
public final class SoundEffectCollectionApi {
    public static final /* synthetic */ int LIZ = 0;

    /* loaded from: classes3.dex */
    public interface Api {
        @E4Q("/tiktok/v1/sound/collect/")
        InterfaceC37276Ek4<BaseNetResponse> get(@InterfaceC64986Pew("sound_id") String str, @InterfaceC64986Pew("type") String str2, @InterfaceC195737mD Object obj);
    }
}

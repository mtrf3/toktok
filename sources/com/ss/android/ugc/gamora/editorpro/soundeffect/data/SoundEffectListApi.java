package com.ss.android.ugc.gamora.editorpro.soundeffect.data;

import X.E4Q;
import X.InterfaceC195737mD;
import X.InterfaceC37276Ek4;
import X.InterfaceC64986Pew;

/* loaded from: classes3.dex */
public final class SoundEffectListApi {
    public static final /* synthetic */ int LIZ = 0;

    /* loaded from: classes3.dex */
    public interface ApiCollectList {
        @E4Q("/tiktok/v1/user/sound/collect/")
        InterfaceC37276Ek4<SoundEffectListApiResponse> get(@InterfaceC64986Pew("scene") int i, @InterfaceC64986Pew("cursor") String str, @InterfaceC64986Pew("count") String str2, @InterfaceC195737mD Object obj);
    }

    /* loaded from: classes3.dex */
    public interface ApiSoundList {
        @E4Q("/tiktok/v1/sound/list/")
        InterfaceC37276Ek4<SoundEffectListApiResponse> get(@InterfaceC64986Pew("sc_id") String str, @InterfaceC64986Pew("cursor") String str2, @InterfaceC64986Pew("count") String str3, @InterfaceC195737mD Object obj);
    }
}

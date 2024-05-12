package com.ss.android.ugc.gamora.editorpro.soundeffect.data;

import X.E4Q;
import X.InterfaceC195737mD;
import X.InterfaceC37276Ek4;
import X.InterfaceC64986Pew;

/* loaded from: classes3.dex */
public final class SoundEffectTabApi {
    public static final /* synthetic */ int LIZ = 0;

    /* loaded from: classes3.dex */
    public interface Api {
        @E4Q("/tiktok/v1/sound/collection/")
        InterfaceC37276Ek4<SoundEffectTabApiResponse> get(@InterfaceC64986Pew("scene") int i, @InterfaceC195737mD Object obj);
    }
}

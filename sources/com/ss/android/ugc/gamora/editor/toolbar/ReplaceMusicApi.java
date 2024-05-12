package com.ss.android.ugc.gamora.editor.toolbar;

import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC37276Ek4;
import X.InterfaceC64987Pex;
import com.ss.android.ugc.aweme.music.model.MusicEditResponse;

/* loaded from: classes8.dex */
public final class ReplaceMusicApi {
    public static final /* synthetic */ int LIZ = 0;

    /* loaded from: classes8.dex */
    public interface Api {
        @InterfaceC195787mI
        @E4T("tiktok/video/music/edit/v1/")
        InterfaceC37276Ek4<MusicEditResponse> get(@InterfaceC64987Pex("item_id") String str, @InterfaceC64987Pex("original_vid") String str2, @InterfaceC64987Pex("new_music_info") String str3, @InterfaceC64987Pex("original_audio_track") String str4);
    }
}

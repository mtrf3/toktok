package com.ss.android.ugc.gamora.editor.recommendeffect.net;

import X.AbstractC73672Svk;
import X.C221108m2;
import X.C62822Ol8;
import X.C6MM;
import X.E8L;
import X.InterfaceC64986Pew;
import java.util.List;

/* loaded from: classes3.dex */
public final class RecommendEffectRequestApi {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C6MM.LJLIL);

    /* loaded from: classes3.dex */
    public interface Api {
        @E8L("/aweme/v1/sticker/recommendation/")
        AbstractC73672Svk<RecommendEffectResponse> getRecommendEffects(@InterfaceC64986Pew("count") int i, @InterfaceC64986Pew("tos_url") String str, @InterfaceC64986Pew("algorithm_key") String str2, @InterfaceC64986Pew("original_resolution_list") List<String> list, @InterfaceC64986Pew("video_length_list") List<Float> list2, @InterfaceC64986Pew("shoot_way") String str3, @InterfaceC64986Pew("content_source") String str4, @InterfaceC64986Pew("material_type") String str5, @InterfaceC64986Pew("is_multi_content") String str6, @InterfaceC64986Pew("mix_type") String str7, @InterfaceC64986Pew("music_id") String str8, @InterfaceC64986Pew("sticker_id_list") String str9, @InterfaceC64986Pew("effect_id_list") String str10, @InterfaceC64986Pew("prop_id_list") String str11, @InterfaceC64986Pew("text_list") String str12, @InterfaceC64986Pew("sdk_version") String str13, @InterfaceC64986Pew("app_version") String str14);
    }
}

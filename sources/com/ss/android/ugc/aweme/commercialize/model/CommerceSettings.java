package com.ss.android.ugc.aweme.commercialize.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes7.dex */
public class CommerceSettings extends BaseResponse {

    @InterfaceC65349Pkn("avatar_decoration_enabled")
    public boolean avatarDecorationEnable;

    @InterfaceC65349Pkn("avatar_decoration_url")
    public String avatarDecorationUrl;

    @InterfaceC65349Pkn("aweme_post_ad")
    public NonstandardAdStruct awemePostAd;

    @InterfaceC65349Pkn("douplus_native_scene_period")
    public int douplusNativeScenePeriod;

    @InterfaceC65349Pkn("douplus_native_scene_switch")
    public boolean douplusNativeSceneSwitch;

    @InterfaceC65349Pkn("douplus_toast")
    public DouplusToastStruct douplusToast;

    @InterfaceC65349Pkn("music_list_ads")
    public MusicListAdStruct[] musicListAd;
}

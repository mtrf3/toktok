package com.ss.android.ugc.aweme.music.presenter;

import X.AbstractC73672Svk;
import X.C73969T1h;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC25988AHw;
import X.InterfaceC64985Pev;
import X.InterfaceC65349Pkn;
import X.T16;
import Y.IDxS305S0100000_4;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.services.RetrofitService;

/* loaded from: classes5.dex */
public final class EditOriginMusicTitlePresenter {
    public final InterfaceC25988AHw LIZ;

    /* loaded from: classes5.dex */
    public static final class AlterMusicTitleModel {

        @InterfaceC65349Pkn("status_msg")
        public String statusMsg;

        @InterfaceC65349Pkn("status_code")
        public int status_code;
    }

    /* loaded from: classes5.dex */
    public interface MusicTitleApi {
        @E8M("/aweme/v1/music/update/")
        @InterfaceC195757mF
        AbstractC73672Svk<AlterMusicTitleModel> alterMusicTitle(@InterfaceC64985Pev("music_id") String str, @InterfaceC64985Pev("title") String str2);
    }

    public EditOriginMusicTitlePresenter(InterfaceC25988AHw interfaceC25988AHw) {
        this.LIZ = interfaceC25988AHw;
    }

    public final void LIZ(String str, String str2) {
        ((MusicTitleApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.LIZ).create(MusicTitleApi.class)).alterMusicTitle(str, str2).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new IDxS305S0100000_4(this, 5));
    }
}

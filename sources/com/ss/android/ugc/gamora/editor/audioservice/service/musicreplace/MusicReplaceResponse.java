package com.ss.android.ugc.gamora.editor.audioservice.service.musicreplace;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.music.model.SeparateStatus;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;

/* loaded from: classes3.dex */
public final class MusicReplaceResponse extends BaseResponse {

    @InterfaceC65349Pkn("separate_status")
    public final SeparateStatus separateStatus = SeparateStatus.UNKNOWN;

    @InterfaceC65349Pkn("separated_music")
    public final UrlModel separatedMusic;
}

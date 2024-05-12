package com.ss.android.ugc.aweme.translation.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* loaded from: classes2.dex */
public class StickerTranslationResult extends BaseResponse {

    @InterfaceC65349Pkn("log_pb")
    public LogPbBean logPb;

    @InterfaceC65349Pkn("translated_stickers")
    public List<TranslatedSticker> translatedStickers;
}

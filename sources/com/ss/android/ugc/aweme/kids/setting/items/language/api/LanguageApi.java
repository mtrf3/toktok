package com.ss.android.ugc.aweme.kids.setting.items.language.api;

import X.AbstractC73672Svk;
import X.C39402FdG;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import com.ss.android.ugc.aweme.kids.setting.items.language.langitem.LanguageResponse;

/* loaded from: classes7.dex */
public interface LanguageApi {
    public static final C39402FdG LIZ = C39402FdG.LIZ;

    @E8M("/tiktok/v1/kids/edit/user/")
    @InterfaceC195757mF
    AbstractC73672Svk<LanguageResponse> editLanguageConfig(@InterfaceC64985Pev("language_change") String str);
}

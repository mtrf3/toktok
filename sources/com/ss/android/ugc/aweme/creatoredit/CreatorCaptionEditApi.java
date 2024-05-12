package com.ss.android.ugc.aweme.creatoredit;

import X.AbstractC73672Svk;
import X.C85509XhB;
import X.E8L;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC36229EJt;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.LinkedHashMap;

/* loaded from: classes16.dex */
public final class CreatorCaptionEditApi {
    public static final C85509XhB LIZ = new C85509XhB();
    public static ICreatorCaptionEditApi LIZIZ;

    /* loaded from: classes13.dex */
    public interface ICreatorCaptionEditApi {
        @E8L("/tiktok/cla/creator_edited_caption/get/v1/")
        AbstractC73672Svk<CreatorCaptionEditModel> queryAwemeAndCaption(@InterfaceC64986Pew("subtitle_id") Long l, @InterfaceC64986Pew("item_id") String str);

        @E8M("/tiktok/v1/caption/cla/")
        @InterfaceC195757mF
        AbstractC73672Svk<BaseResponse> toggleAutoCaptionSetting(@InterfaceC64985Pev("aweme_id") String str, @InterfaceC64985Pev("enable_auto_caption") boolean z);

        @E8M("/tiktok/cla/creator_edited_caption/create/v1/")
        @InterfaceC195757mF
        AbstractC73672Svk<BaseResponse> updateTranslation(@InterfaceC36229EJt LinkedHashMap<String, String> linkedHashMap);
    }
}

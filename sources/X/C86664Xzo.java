package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.service.ICLACaptionService;

/* renamed from: X.Xzo, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86664Xzo {
    public static /* synthetic */ void LIZ(ICLACaptionService iCLACaptionService, Context context, String str, EnumC86777Y3x enumC86777Y3x, Aweme aweme) {
        Long l;
        CaptionItemModel LJIIIIZZ;
        if (aweme != null && (LJIIIIZZ = C86670Xzu.LJIIIIZZ(aweme)) != null) {
            l = Long.valueOf(LJIIIIZZ.getClaSubtitleId());
        } else {
            l = null;
        }
        iCLACaptionService.LJII(context, str, enumC86777Y3x, aweme, false, l);
    }
}

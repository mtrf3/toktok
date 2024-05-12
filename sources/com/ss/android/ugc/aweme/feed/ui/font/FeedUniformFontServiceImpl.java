package com.ss.android.ugc.aweme.feed.ui.font;

import X.C2055284u;
import X.C58096Mr6;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.ui.IFeedUniformFontService;

/* loaded from: classes11.dex */
public final class FeedUniformFontServiceImpl implements IFeedUniformFontService {
    public static IFeedUniformFontService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IFeedUniformFontService.class, false);
        if (LIZ != null) {
            return (IFeedUniformFontService) LIZ;
        }
        if (C58096Mr6.O0 == null) {
            synchronized (IFeedUniformFontService.class) {
                if (C58096Mr6.O0 == null) {
                    C58096Mr6.O0 = new FeedUniformFontServiceImpl();
                }
            }
        }
        return C58096Mr6.O0;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.IFeedUniformFontService
    public final void LIZ(TuxTextView tuxTextView, Integer num) {
        C2055284u.LIZJ(tuxTextView, num);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.IFeedUniformFontService
    public final void LIZIZ(TuxTextView tuxTextView, Integer num) {
        C2055284u.LJI(tuxTextView, num, false, 4);
    }
}

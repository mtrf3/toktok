package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;

/* renamed from: X.48z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1046948z {
    public static /* synthetic */ void LIZJ(IMixFeedService iMixFeedService, String str, String str2) {
        iMixFeedService.LJIILLIIL(str, str2, null, null, "click_chat_card", null, null);
    }

    public static /* synthetic */ void LIZIZ(IMixFeedService iMixFeedService, String str, String str2, String str3, String str4, float f, String str5, Integer num, int i) {
        String str6 = str5;
        float f2 = f;
        if ((i & 16) != 0) {
            f2 = 0.0f;
        }
        Integer num2 = null;
        if ((i & 32) != 0) {
            str6 = null;
        }
        if ((i & 128) == 0) {
            num2 = num;
        }
        iMixFeedService.LJIL(str, str2, str3, str4, f2, str6, null, num2);
    }

    public static /* synthetic */ void LIZ(IMixFeedService iMixFeedService, Context context, String str, Aweme aweme, String str2, String str3, String str4, String str5, String str6, boolean z, C229238z9 c229238z9, String str7, int i) {
        if ((i & 512) != 0) {
            c229238z9 = null;
        }
        iMixFeedService.LJIILIIL(context, str, aweme, str2, str3, str4, str5, str6, z, c229238z9, str7, null);
    }
}

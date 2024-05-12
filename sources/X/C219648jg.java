package X;

import android.content.Context;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* renamed from: X.8jg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219648jg {
    public static /* synthetic */ void LIZ(C220488l2 c220488l2, Context context, AddYoursTopic addYoursTopic, Aweme aweme, Integer num, List list, boolean z, String str, String str2, int i, String str3, int i2) {
        Integer num2 = num;
        Aweme aweme2 = aweme;
        List list2 = list;
        boolean z2 = z;
        String str4 = str2;
        String str5 = null;
        if ((i2 & 4) != 0) {
            aweme2 = null;
        }
        if ((i2 & 8) != 0) {
            num2 = null;
        }
        if ((i2 & 16) != 0) {
            list2 = null;
        }
        if ((i2 & 32) != 0) {
            z2 = false;
        }
        if ((i2 & 128) != 0) {
            str4 = null;
        }
        if ((i2 & 512) == 0) {
            str5 = str3;
        }
        c220488l2.LJIILLIIL(context, addYoursTopic, aweme2, num2, list2, z2, str, str4, i, str5);
    }
}

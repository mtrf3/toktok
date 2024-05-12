package X;

import com.ss.android.ugc.aweme.plugin.not_interested.NotInterestedTutorialData;
import kotlin.jvm.internal.o;

/* renamed from: X.2Ij, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C56172Ij {
    public static EnumC61822bi LIZ(NotInterestedTutorialData data) {
        o.LJIIIZ(data, "data");
        int i = data.style;
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return EnumC61822bi.BOTTOM_SHEET;
        }
        return EnumC61822bi.OVERLAY;
    }
}

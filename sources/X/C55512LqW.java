package X;

import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import kotlin.jvm.internal.o;

/* renamed from: X.LqW, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55512LqW implements InterfaceC55513LqX {
    @Override // X.InterfaceC55513LqX
    public final void LIZ(CommonAdData commonAdData, C58655N0h c58655N0h) {
        o.LJIIIZ(commonAdData, "commonAdData");
        if (TextUtils.equals(c58655N0h.LIZIZ, "othershow_fail") && TextUtils.equals(c58655N0h.LIZ, "draw_ad")) {
            c58655N0h.LIZIZ(-1, "failed_reason_status");
        }
    }
}

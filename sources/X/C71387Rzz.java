package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.Rzz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71387Rzz implements S1I {
    @Override // X.S1I
    public final void LIZJ(Context context) {
        o.LJIIIZ(context, "context");
    }

    @Override // X.S1I
    public final C8IM LIZIZ(Context context) {
        o.LJIIIZ(context, "context");
        return new S03(context);
    }

    @Override // X.S1I
    public final boolean LIZ(Aweme aweme, AnchorCommonStruct anchorCommonStruct, boolean z, int i) {
        o.LJIIIZ(aweme, "aweme");
        if (anchorCommonStruct.getType() != 35 || z) {
            return false;
        }
        C71361RzZ.LIZ.getClass();
        if (!C71361RzZ.LJJJIL(aweme)) {
            return false;
        }
        if (aweme.isAd()) {
            if (!C19N.LJ("ec_use_custom_anchor_ads", false)) {
                return false;
            }
        } else if (!C19N.LJ("ec_use_custom_anchor", false)) {
            return false;
        }
        return true;
    }
}

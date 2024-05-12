package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.Nb1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59647Nb1 implements S1I {
    @Override // X.S1I
    public final C8IM LIZIZ(Context context) {
        o.LJIIIZ(context, "context");
        return new NND(context);
    }

    @Override // X.S1I
    public final void LIZJ(Context context) {
        o.LJIIIZ(context, "context");
    }

    @Override // X.S1I
    public final boolean LIZ(Aweme aweme, AnchorCommonStruct anchorCommonStruct, boolean z, int i) {
        o.LJIIIZ(aweme, "aweme");
        if (anchorCommonStruct.getType() == EnumC42934Gt8.AD_PHOTO_CAROUSEL_ANCHOR.getTYPE()) {
            return true;
        }
        return false;
    }
}

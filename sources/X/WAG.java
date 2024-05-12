package X;

import android.graphics.Rect;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;

/* loaded from: classes15.dex */
public final class WAG implements InterfaceC81846WAg {
    public final /* synthetic */ AnimatedFactoryV2Impl LIZ;

    public WAG(AnimatedFactoryV2Impl animatedFactoryV2Impl) {
        this.LIZ = animatedFactoryV2Impl;
    }

    @Override // X.InterfaceC81846WAg
    public final WA1 LIZ(C81836W9w c81836W9w, Rect rect) {
        return new WA1(this.LIZ.getAnimatedDrawableUtil(), c81836W9w, rect);
    }
}

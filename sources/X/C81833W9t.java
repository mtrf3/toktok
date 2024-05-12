package X;

import android.graphics.Bitmap;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;

/* renamed from: X.W9t, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81833W9t implements InterfaceC81842WAc {
    public final /* synthetic */ AnimatedFactoryV2Impl LIZ;

    public C81833W9t(AnimatedFactoryV2Impl animatedFactoryV2Impl, Bitmap.Config config) {
        this.LIZ = animatedFactoryV2Impl;
    }

    @Override // X.InterfaceC81842WAc
    public final W5A decode(W8X w8x, int i, InterfaceC45733HxB interfaceC45733HxB, C81810W8w c81810W8w) {
        WA7 decode;
        C81832W9s c81832W9s = (C81832W9s) this.LIZ.getAnimatedImageFactory();
        c81832W9s.getClass();
        InterfaceC81845WAf interfaceC81845WAf = C81832W9s.LIZLLL;
        if (interfaceC81845WAf != null) {
            C81392Vwy<InterfaceC81378Vwk> LIZLLL = w8x.LIZLLL();
            LIZLLL.getClass();
            try {
                InterfaceC81378Vwk LJI = LIZLLL.LJI();
                if (LJI.getByteBuffer() != null) {
                    decode = interfaceC81845WAf.decode(LJI.getByteBuffer());
                } else {
                    decode = interfaceC81845WAf.decode(LJI.getNativePtr(), LJI.size());
                }
                if (decode instanceof AbstractC81863WAx) {
                    ((AbstractC81863WAx) decode).mDecodeStatus = w8x.LJLLILLLL;
                }
                w8x.LJIILIIL();
                return c81832W9s.LJ(c81810W8w, decode, w8x.LJLJI);
            } finally {
                C81392Vwy.LJ(LIZLLL);
            }
        }
        throw new UnsupportedOperationException("To encode animated webp please add the dependency to the animated-webp module");
    }
}

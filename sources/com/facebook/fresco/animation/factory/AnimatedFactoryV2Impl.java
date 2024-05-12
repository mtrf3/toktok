package com.facebook.fresco.animation.factory;

import X.AbstractC78853Ux7;
import X.C81829W9p;
import X.C81832W9s;
import X.C81833W9t;
import X.C81834W9u;
import X.C81835W9v;
import X.ExecutorServiceC79572VKu;
import X.FT1;
import X.InterfaceC81842WAc;
import X.InterfaceC81846WAg;
import X.W4N;
import X.W5A;
import X.W6U;
import X.W6X;
import X.W86;
import X.W87;
import X.WAD;
import X.WAG;
import X.WAH;
import X.WAM;
import X.WBF;
import X.WBI;
import android.content.Context;
import android.graphics.Bitmap;
import com.facebook.common.time.RealtimeSinceBootClock;

/* loaded from: classes15.dex */
public class AnimatedFactoryV2Impl implements W86 {
    public static int sAnimationCachingStrategy = 1;
    public InterfaceC81846WAg mAnimatedDrawableBackendProvider;
    public W4N mAnimatedDrawableFactory;
    public WBF mAnimatedDrawableUtil;
    public WBI mAnimatedImageFactory;
    public final W6X<W6U, W5A> mBackingCache;
    public final W87 mExecutorSupplier;
    public final AbstractC78853Ux7 mPlatformBitmapFactory;

    private WBI buildAnimatedImageFactory() {
        return new C81832W9s(new WAD(this), this.mPlatformBitmapFactory);
    }

    private C81829W9p createDrawableFactory() {
        WAH wah = new WAH();
        return new C81829W9p(getAnimatedDrawableBackendProvider(), FT1.LIZ(), new ExecutorServiceC79572VKu(this.mExecutorSupplier.LJ()), RealtimeSinceBootClock.get(), this.mPlatformBitmapFactory, this.mBackingCache, wah, new WAM());
    }

    private InterfaceC81846WAg getAnimatedDrawableBackendProvider() {
        if (this.mAnimatedDrawableBackendProvider == null) {
            this.mAnimatedDrawableBackendProvider = new WAG(this);
        }
        return this.mAnimatedDrawableBackendProvider;
    }

    public WBF getAnimatedDrawableUtil() {
        if (this.mAnimatedDrawableUtil == null) {
            this.mAnimatedDrawableUtil = new WBF();
        }
        return this.mAnimatedDrawableUtil;
    }

    public WBI getAnimatedImageFactory() {
        if (this.mAnimatedImageFactory == null) {
            this.mAnimatedImageFactory = buildAnimatedImageFactory();
        }
        return this.mAnimatedImageFactory;
    }

    public AbstractC78853Ux7 getPlatformBitmapFactory() {
        return this.mPlatformBitmapFactory;
    }

    public static void setAnimationCachingStrategy(int i) {
        sAnimationCachingStrategy = i;
    }

    @Override // X.W86
    public W4N getAnimatedDrawableFactory(Context context) {
        if (this.mAnimatedDrawableFactory == null) {
            this.mAnimatedDrawableFactory = createDrawableFactory();
        }
        return this.mAnimatedDrawableFactory;
    }

    @Override // X.W86
    public InterfaceC81842WAc getGifDecoder(Bitmap.Config config) {
        return new C81835W9v(this, config);
    }

    @Override // X.W86
    public InterfaceC81842WAc getHeifDecoder(Bitmap.Config config) {
        return new C81834W9u(this, config);
    }

    @Override // X.W86
    public InterfaceC81842WAc getWebPDecoder(Bitmap.Config config) {
        return new C81833W9t(this, config);
    }

    public AnimatedFactoryV2Impl(AbstractC78853Ux7 abstractC78853Ux7, W87 w87, W6X<W6U, W5A> w6x) {
        this.mPlatformBitmapFactory = abstractC78853Ux7;
        this.mExecutorSupplier = w87;
        this.mBackingCache = w6x;
    }
}

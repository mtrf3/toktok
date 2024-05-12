package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.util.concurrent.Executor;

/* loaded from: classes15.dex */
public final class W5E {
    public final android.net.Uri LIZ;
    public final String LIZIZ;
    public final Context LIZJ;
    public final boolean LIZLLL;
    public final int LJ;
    public final boolean LJI;
    public final int LJII;
    public final boolean LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;
    public final int LJIIL;
    public final int LJIILIIL;
    public final int LJIILJJIL;
    public final int LJIILL;
    public final Drawable LJIILLIIL;
    public final EnumC72807Shn LJIIZILJ;
    public final int LJIJ;
    public final Drawable LJIJI;
    public final Drawable LJIJJ;
    public final Bitmap.Config LJIJJLI;
    public final EnumC72807Shn LJIL;
    public final S3L LJJ;
    public final MHO LJJI;
    public final QM9 LJJIFFI;
    public final KL0 LJJII;
    public final String LJJIII;
    public final Executor LJJIIJ;
    public final EnumC62195Ob1 LJJIIJZLJL;
    public final String LJJIIZ;
    public final InterfaceC85013Vh LJJIIZI;
    public final ImageView LJJIJ;
    public InterfaceC70769Rq1 LJJIJIIJI;
    public final InterfaceC31104CIq LJJIJIIJIL;
    public final InterfaceC78660Uu0 LJJIJIL;
    public final boolean LJJIJL;
    public final boolean LJJIJLIJ;
    public final boolean LJJIL;
    public final Drawable LJJIZ;
    public final C62562cu LJJJ;
    public final W66 LJJJI;
    public final SIR LJJJIL;
    public final boolean LJJJJ;
    public final boolean LJFF = true;
    public final int LJIIJJI = -1;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LightenImageRequest{mUri=");
        LIZ.append(this.LIZ);
        LIZ.append(", mContext=");
        LIZ.append(this.LIZJ);
        LIZ.append(", mAutoPlayAnimations=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", mAnimationFrameScheduler=");
        LIZ.append(this.LJ);
        LIZ.append(", mAutoRotate=");
        LIZ.append(this.LJFF);
        LIZ.append(", mDecodeAllFrames=");
        LIZ.append(this.LJI);
        LIZ.append(", mPreDecodeFrameCount=");
        LIZ.append(this.LJII);
        LIZ.append(", mProgressiveRendering=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", mWidth=");
        LIZ.append(this.LJIIIZ);
        LIZ.append(", mHeight=");
        LIZ.append(this.LJIIJ);
        LIZ.append(", mRequestWidth=");
        LIZ.append(this.LJIIL);
        LIZ.append(", mRequestHeight=");
        LIZ.append(this.LJIILIIL);
        LIZ.append(", mFadeDuration=");
        LIZ.append(this.LJIILJJIL);
        LIZ.append(", mPlaceholder=");
        LIZ.append(this.LJIILL);
        LIZ.append(", mPlaceholderDrawable=");
        LIZ.append(this.LJIILLIIL);
        LIZ.append(", mPlaceholderScaleType=");
        LIZ.append(this.LJIIZILJ);
        LIZ.append(", mFailureImage=");
        LIZ.append(this.LJIJ);
        LIZ.append(", mFailureImageDrawable=");
        LIZ.append(this.LJIJI);
        LIZ.append(", mFailureImageScaleType=");
        LIZ.append((Object) null);
        LIZ.append(", mBackgroundImageDrawable=");
        LIZ.append(this.LJIJJ);
        LIZ.append(", mBitmapConfig=");
        LIZ.append(this.LJIJJLI);
        LIZ.append(", mActualImageScaleType=");
        LIZ.append(this.LJIL);
        LIZ.append(", mCircleOptions=");
        LIZ.append(this.LJJ);
        LIZ.append(", mBlurOptions=");
        LIZ.append(this.LJJI);
        LIZ.append(", mCropOptions=");
        LIZ.append((Object) null);
        LIZ.append(", mTransformOptions=");
        LIZ.append(this.LJJIFFI);
        LIZ.append(", mPriority=");
        LIZ.append(this.LJJII);
        LIZ.append(", mCallerId='");
        Q89.LIZIZ(LIZ, this.LJJIII, '\'', ", mCallbackExecutor=");
        LIZ.append(this.LJJIIJ);
        LIZ.append(", mCacheChoice=");
        LIZ.append(this.LJJIIJZLJL);
        LIZ.append(", mView=");
        LIZ.append(this.LJJIIZI);
        LIZ.append(", mBareImageView=");
        LIZ.append(this.LJJIJ);
        LIZ.append(", mImageDisplayListener=");
        LIZ.append(this.LJJIJIIJI);
        LIZ.append(", mImageDownloadListener=");
        LIZ.append(this.LJJIJIIJIL);
        LIZ.append(", mImageLoadListener=");
        LIZ.append(this.LJJIJIL);
        LIZ.append(", mEnableAnimPreviewCache=");
        LIZ.append(this.LJJIJL);
        LIZ.append(", mEnableCircleAnim=");
        LIZ.append(this.LJJIJLIJ);
        LIZ.append(", mEnableResizedImageDiskCache=");
        C1FL.LJFF(LIZ, this.LJJIL, ", mRetryImage=", 0, ", mRetryImageScaleType=");
        LIZ.append((Object) null);
        LIZ.append(", mUrlModel=");
        LIZ.append(this.LJJJ);
        LIZ.append(", mFrameSchedulerListener=");
        LIZ.append(this.LJJJI);
        LIZ.append(", mCustomCacheName='");
        Q89.LIZIZ(LIZ, this.LJJIIZ, '\'', ", cancellable= ");
        LIZ.append(this.LJJJJ);
        LIZ.append('\'');
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public W5E(W5F w5f) {
        this.LIZ = w5f.LIZ;
        this.LIZJ = w5f.LIZJ;
        this.LIZLLL = w5f.LIZLLL;
        this.LJI = w5f.LJ;
        this.LJII = w5f.LJFF;
        this.LJIIIIZZ = w5f.LJI;
        this.LJIIIZ = w5f.LJII;
        this.LJIIJ = w5f.LJIIIIZZ;
        this.LJIILJJIL = w5f.LJIIL;
        this.LJIILL = w5f.LJIIJJI;
        this.LJIILLIIL = w5f.LJIILIIL;
        this.LJIIZILJ = w5f.LJIILJJIL;
        this.LJIJ = w5f.LJIILL;
        this.LJIJI = w5f.LJIILLIIL;
        this.LJIJJ = w5f.LJIIZILJ;
        this.LJIJJLI = w5f.LJIJI;
        this.LJIL = w5f.LJIJJ;
        this.LJJ = w5f.LJIJJLI;
        this.LJJI = w5f.LJIL;
        this.LJJIFFI = w5f.LJJ;
        this.LJJII = w5f.LJJI;
        this.LJJIII = w5f.LJJIFFI;
        this.LJJIIJ = w5f.LJJII;
        this.LJJIIJZLJL = w5f.LJJIII;
        this.LJJIIZ = w5f.LJJJ;
        this.LJJIIZI = w5f.LJJIIJ;
        this.LJJIJ = w5f.LJJIIJZLJL;
        this.LJJIJIIJI = w5f.LJJIIZ;
        this.LJJIJIIJIL = w5f.LJJIIZI;
        this.LJJIJIL = w5f.LJJIJ;
        this.LJJIJL = w5f.LJJIJIIJI;
        this.LJJIJLIJ = w5f.LJJIJIIJIL;
        this.LJJIL = w5f.LJJIJIL;
        this.LJJIZ = w5f.LJIJ;
        this.LJIIL = w5f.LJIIIZ;
        this.LJIILIIL = w5f.LJIIJ;
        this.LJJJ = w5f.LJJIJL;
        this.LJ = w5f.LJJIJLIJ;
        this.LJJJI = w5f.LJJIL;
        this.LJJJIL = w5f.LJJIZ;
        this.LJJJJ = w5f.LJJJI;
        this.LIZIZ = w5f.LJJJIL;
    }
}
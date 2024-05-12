package X;

import Y.ACallableS105S0100000_2;
import Y.ACallableS80S0200000_2;
import Y.AgS107S0200000_2;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.image.model.ImageAlbumData;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5wi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C151285wi {
    public final ImageView LIZ;
    public final SingleImageData LIZIZ;
    public final ImageAlbumData LIZJ;
    public final int LIZLLL;
    public final CreativeInfo LJ;
    public Bitmap LJFF;
    public boolean LJI;
    public C10H LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;

    public final boolean LIZJ() {
        if (this.LJFF != null) {
            return this.LJI;
        }
        return this.LIZIZ.getEditImageInfo().isLocalImageWithEnhance();
    }

    public final void LJ() {
        if (!this.LJIIJ) {
            this.LIZ.setVisibility(0);
            return;
        }
        Bitmap bitmap = this.LJFF;
        if (bitmap != null) {
            LIZLLL(bitmap);
            return;
        }
        if (this.LIZIZ.getEditImageInfo().getTempSynthesisPath() != null) {
            C10H c10h = this.LJII;
            if (c10h != null) {
                c10h.LIZ();
            }
            this.LJII = null;
            if (this.LIZJ.getAutoEnhanceOn() != this.LIZIZ.getEditImageInfo().isLocalImageWithEnhance()) {
                LIZ(Boolean.valueOf(this.LIZJ.getAutoEnhanceOn()));
                return;
            }
            if (this.LIZIZ.getFilterInfo().getNeedRender()) {
                LIZ(null);
                return;
            }
            String tempSynthesisPath = this.LIZIZ.getEditImageInfo().getTempSynthesisPath();
            if (tempSynthesisPath == null) {
                return;
            }
            this.LJII = C151525x6.LJ(tempSynthesisPath, this.LIZIZ.getEditImageInfo().getBitmapWidth(), this.LIZIZ.getEditImageInfo().getBitmapHeight(), new AqS168S0100000_2(this, 73), 8);
            return;
        }
        C10H c10h2 = this.LJII;
        if (c10h2 != null) {
            c10h2.LIZ();
        }
        this.LJII = null;
        if (this.LIZJ.getAutoEnhanceOn()) {
            LIZ(Boolean.valueOf(this.LIZJ.getAutoEnhanceOn()));
        } else if (this.LIZIZ.getFilterInfo().getNeedRender()) {
            LIZ(null);
        } else {
            this.LJII = C151525x6.LJ(this.LIZIZ.getSrcImageInfo().getPath(), 0, 0, new AqS168S0100000_2(this, 74), 14);
        }
    }

    public final void LIZ(Boolean bool) {
        if (this.LIZJ.getSurfaceData().getSurfaceViewHeight() <= 0) {
            C151525x6.LJI(this.LIZJ.getSurfaceData());
        }
        C10K.LIZJ(new ACallableS80S0200000_2(this, bool, 3)).LJ(new AgS107S0200000_2(this, bool, 2), C10K.LJIIIIZZ, null);
    }

    public final void LIZIZ(boolean z) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable;
        C10H c10h = this.LJII;
        if (c10h != null) {
            c10h.LIZ();
        }
        this.LJII = null;
        if (this.LJIIIZ && this.LJFF == null) {
            C151535x7 c151535x7 = C151535x7.LIZ;
            ImageView imageView = this.LIZ;
            c151535x7.getClass();
            o.LJIIIZ(imageView, "imageView");
            Drawable drawable = imageView.getDrawable();
            if ((drawable instanceof BitmapDrawable) && (bitmapDrawable = (BitmapDrawable) drawable) != null) {
                bitmap = bitmapDrawable.getBitmap();
            } else {
                bitmap = null;
            }
            imageView.setImageURI(null);
            if (bitmap != null) {
                bitmap.recycle();
            }
            imageView.setVisibility(8);
        }
        Bitmap bitmap2 = this.LJFF;
        if (bitmap2 != null) {
            this.LIZ.setImageURI(null);
            if (!z) {
                bitmap2.recycle();
                this.LJFF = null;
            } else {
                C10K.LIZJ(new ACallableS105S0100000_2(this, 10));
            }
        }
        this.LJIIIIZZ = true;
    }

    public final void LIZLLL(Bitmap bitmap) {
        o.LJIIIZ(bitmap, "bitmap");
        if (this.LJIIIIZZ || bitmap.isRecycled()) {
            return;
        }
        C6QQ.LIZ(new AqS149S0200000_2(this, bitmap, 13));
    }

    public C151285wi(ImageView imageView, SingleImageData imageData, ImageAlbumData imageAlbumData, int i, CreativeInfo creativeInfo) {
        o.LJIIIZ(imageData, "imageData");
        o.LJIIIZ(imageAlbumData, "imageAlbumData");
        o.LJIIIZ(creativeInfo, "creativeInfo");
        this.LIZ = imageView;
        this.LIZIZ = imageData;
        this.LIZJ = imageAlbumData;
        this.LIZLLL = i;
        this.LJ = creativeInfo;
        this.LJIIJ = true;
    }
}

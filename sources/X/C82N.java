package X;

import Y.ARunnableS39S0100000_3;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.82N, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C82N extends C82K {
    public final View LIZLLL;
    public final C82Y LJ;
    public final C82S LJFF;
    public final ViewGroup LJI;
    public final C81I LJII;
    public final InterfaceC201357vH LJIIIIZZ;
    public final Context LJIIIZ;
    public final C62822Ol8 LJIIJ;
    public C82I LJIIJJI;
    public boolean LJIIL;
    public Bitmap LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public ARunnableS39S0100000_3 LJIILLIIL;

    public abstract C82P LJ();

    public abstract void LJFF(Bitmap bitmap);

    public void LJI() {
    }

    public Drawable LJIIIIZZ() {
        return null;
    }

    public final Aweme LIZIZ() {
        VideoItemParams videoItemParams;
        C82I c82i = this.LJIIJJI;
        if (c82i != null && (videoItemParams = c82i.LIZJ) != null) {
            return videoItemParams.getAweme();
        }
        return null;
    }

    public Bitmap LIZJ() {
        Bitmap bitmap = this.LJIILIIL;
        if (bitmap != null) {
            return bitmap.copy(bitmap.getConfig(), false);
        }
        return null;
    }

    public final Bitmap LIZLLL() {
        Bitmap bitmap = this.LJIILIIL;
        if (bitmap != null && (!bitmap.isRecycled())) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PhotosViewHolderV3 ");
            LIZ.append(hashCode());
            LIZ.append(" getCurrentShownBitmap reuse: ");
            LIZ.append(bitmap.hashCode());
            C201467vS.LJIIJ(X1D.LIZIZ(LIZ));
            return bitmap;
        }
        Bitmap LIZJ = LIZJ();
        if (LIZJ == null) {
            return null;
        }
        this.LJIILIIL = LIZJ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("PhotosViewHolderV3 ");
        LIZ2.append(hashCode());
        LIZ2.append(" getCurrentShownBitmap: ");
        LIZ2.append(LIZJ.hashCode());
        C201467vS.LJIIJ(X1D.LIZIZ(LIZ2));
        return LIZJ;
    }

    public void LJIIIZ() {
        C82P LJ;
        if (this.LJIILJJIL == -1 && this.LJIIJJI != null && (LJ = LJ()) != null) {
            LJ.LJI();
        }
    }

    public void LJIIJ() {
        C82P LJ = LJ();
        if (LJ != null) {
            LJ.LJFF();
        }
        this.LJIIJJI = null;
        this.LJIIL = false;
        LJII(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0062, code lost:
    
        if (r0 != null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C82I r10) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82N.LIZ(X.82I):void");
    }

    public final void LJII(Bitmap bitmap) {
        boolean z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PhotoMode Bitmap is set position: ");
        LIZ.append(this.LIZJ);
        LIZ.append(" isSet: ");
        if (bitmap != null) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        LIZ.append(" isFullpage: ");
        LIZ.append(this.LJFF.Vf());
        LIZ.append(' ');
        X1D.LIZIZ(LIZ);
        if (bitmap != null) {
            this.LJIILIIL = bitmap;
            this.LJIILJJIL = bitmap.getWidth();
            this.LJIILL = bitmap.getHeight();
            LJFF(bitmap);
            return;
        }
        this.LJIILIIL = null;
        this.LJIILJJIL = -1;
        this.LJIILL = -1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82N(View view, C82Y multiFingerCallBack, C6U6 stickerClickListener, C82S feedPhotoParams, ViewGroup viewGroup, C81I c81i, InterfaceC201357vH interfaceC201357vH) {
        super(view);
        o.LJIIIZ(multiFingerCallBack, "multiFingerCallBack");
        o.LJIIIZ(stickerClickListener, "stickerClickListener");
        o.LJIIIZ(feedPhotoParams, "feedPhotoParams");
        this.LIZLLL = view;
        this.LJ = multiFingerCallBack;
        this.LJFF = feedPhotoParams;
        this.LJI = viewGroup;
        this.LJII = c81i;
        this.LJIIIIZZ = interfaceC201357vH;
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        this.LJIIIZ = context;
        this.LJIIJ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1723));
        this.LJIILJJIL = -1;
        this.LJIILL = -1;
    }
}

package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.framework.media.ImageHints;
import com.google.android.gms.common.images.WebImage;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* renamed from: X.ZjC, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90730ZjC extends AbstractC90446Zec {
    public final ImageView LIZIZ;
    public final ImageHints LIZJ;
    public final Bitmap LIZLLL;
    public final View LJ = null;
    public final C90117ZYj LJFF;
    public final C90423ZeF LJI;

    @Override // X.AbstractC90446Zec
    public final void LJ() {
        C90423ZeF c90423ZeF = this.LJI;
        c90423ZeF.LIZIZ();
        c90423ZeF.LJ = null;
        LJFF();
        this.LIZ = null;
    }

    public final void LJFF() {
        View view = this.LJ;
        if (view != null) {
            view.setVisibility(0);
            this.LIZIZ.setVisibility(4);
        }
        Bitmap bitmap = this.LIZLLL;
        if (bitmap != null) {
            this.LIZIZ.setImageBitmap(bitmap);
        }
    }

    public final void LJI() {
        MediaMetadata mediaMetadata;
        List<WebImage> list;
        android.net.Uri uri;
        WebImage LIZ;
        C90639Zhj c90639Zhj = this.LIZ;
        if (c90639Zhj == null || !c90639Zhj.LJIIIZ()) {
            LJFF();
            return;
        }
        MediaInfo LJ = c90639Zhj.LJ();
        if (LJ == null || ((this.LJFF == null || (LIZ = C90117ZYj.LIZ(LJ.zzf)) == null || (uri = LIZ.zab) == null) && ((mediaMetadata = LJ.zzf) == null || (list = mediaMetadata.zzd) == null || list.size() <= 0 || (uri = ((WebImage) ListProtector.get(mediaMetadata.zzd, 0)).zab) == null))) {
            LJFF();
        } else {
            this.LJI.LIZ(uri);
        }
    }

    @Override // X.AbstractC90446Zec
    public final void LIZIZ() {
        LJI();
    }

    @Override // X.AbstractC90446Zec
    public final void LIZLLL(C90613ZhJ c90613ZhJ) {
        super.LIZLLL(c90613ZhJ);
        this.LJI.LJ = new C90725Zj7(this);
        LJFF();
        LJI();
    }

    public C90730ZjC(ImageView imageView, Context context, ImageHints imageHints) {
        ZYJ LIZIZ;
        this.LIZIZ = imageView;
        this.LIZJ = imageHints;
        this.LIZLLL = BitmapFactory.decodeResource(context.getResources(), R.drawable.e);
        QH7.LJ("Must be called from the main thread.");
        try {
            LIZIZ = ZYJ.LIZIZ(context);
        } catch (RuntimeException unused) {
            ZYJ.LJII.getClass();
        }
        if (LIZIZ != null) {
            QH7.LJ("Must be called from the main thread.");
            CastMediaOptions castMediaOptions = LIZIZ.LJ.zzf;
            this.LJFF = castMediaOptions != null ? castMediaOptions.LJJJJL() : null;
            this.LJI = new C90423ZeF(C16880lQ.LLLLL(context));
        }
        this.LJFF = null;
        this.LJI = new C90423ZeF(C16880lQ.LLLLL(context));
    }
}

package X;

import Y.ARunnableS44S0100000_8;
import Y.IDhS105S0100000_12;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BigThumb;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.SwD, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73701SwD extends AbstractC56472MEi {
    public String LIZLLL;
    public final String LJ;
    public final BitmapFactory.Options LJFF;
    public InterfaceC73704SwG<Integer> LJI;
    public int LJII;
    public BitmapRegionDecoder LJIIIIZZ;
    public C73800Sxo LJIIIZ;
    public InterfaceC73651SvP LJIIJ;

    public final void LIZIZ() {
        if (this.LJIIIZ != null && this.LJI != null) {
            return;
        }
        C73703SwF c73703SwF = new C73703SwF(this);
        EnumC73681Svt enumC73681Svt = EnumC73681Svt.LATEST;
        C73320Sq4.LIZ(enumC73681Svt, "mode is null");
        C73724Swa c73724Swa = new C73724Swa(c73703SwF, enumC73681Svt);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        AbstractC73946T0k abstractC73946T0k = T16.LIZIZ;
        C73320Sq4.LIZ(timeUnit, "unit is null");
        C73320Sq4.LIZ(abstractC73946T0k, "scheduler is null");
        C73800Sxo LJII = new C73777SxR(c73724Swa, timeUnit, abstractC73946T0k).LJII(abstractC73946T0k).LJI(new IDhS105S0100000_12(this, 20)).LJI(new IDhS105S0100000_12(this, 21)).LJIIIIZZ(3L, C73674Svm.LJI).LJII(C73969T1h.LIZIZ());
        this.LJIIIZ = LJII;
        LJII.subscribe(new C73702SwE(this));
    }

    public final Bitmap.CompressFormat LIZJ() {
        if (TextUtils.equals(this.LIZLLL, "webp")) {
            return Bitmap.CompressFormat.WEBP;
        }
        if (TextUtils.equals(this.LIZLLL, "png")) {
            return Bitmap.CompressFormat.PNG;
        }
        if (TextUtils.equals(this.LIZLLL, "jpg") || TextUtils.equals(this.LIZLLL, "jpeg")) {
            return Bitmap.CompressFormat.JPEG;
        }
        return null;
    }

    public final void LIZLLL(int i, ImageView imageView) {
        Video video;
        List<BigThumb> bigThumbs;
        o.LJIIIZ(imageView, "imageView");
        if (!LIZ()) {
            return;
        }
        if (this.LJIIIZ == null || this.LJI == null) {
            LIZIZ();
        }
        Aweme aweme = this.LIZ;
        if (aweme != null && (video = aweme.getVideo()) != null && (bigThumbs = video.getBigThumbs()) != null && (!bigThumbs.isEmpty())) {
            int duration = (int) (((BigThumb) ListProtector.get(bigThumbs, 0)).getDuration() * (i / 10000.0f));
            if (this.LJII != duration) {
                this.LJII = duration;
                InterfaceC73704SwG<Integer> interfaceC73704SwG = this.LJI;
                if (interfaceC73704SwG != null) {
                    interfaceC73704SwG.onNext(Integer.valueOf(duration));
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C73701SwD(Context context, Aweme aweme, ImageView imageView) {
        super(context, aweme, imageView);
        o.LJIIIZ(imageView, "imageView");
        this.LIZLLL = "jpg";
        File LLIIIL = C16880lQ.LLIIIL(context);
        this.LJ = (LLIIIL == null ? C39579Fg7.LJII(context) : LLIIIL).getAbsolutePath();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        this.LJFF = options;
        this.LIZIZ.setImageBitmap(null);
        this.LJII = 0;
        C38816FLg.LJ(new ARunnableS44S0100000_8(this, 119));
        if (LIZ()) {
            LIZIZ();
        }
    }
}

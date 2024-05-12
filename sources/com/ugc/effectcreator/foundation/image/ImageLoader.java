package com.ugc.effectcreator.foundation.image;

import X.C16880lQ;
import X.C76800UCe;
import X.C78555UsJ;
import X.C81814W9a;
import X.C81816W9c;
import X.C84654XKg;
import X.C93611aTf;
import X.C93965aZN;
import X.C94018aaE;
import X.C94020aaG;
import X.C94023aaJ;
import X.C94034aaU;
import X.C94153acP;
import X.C94154acQ;
import X.C94155acR;
import X.C94156acS;
import X.C94157acT;
import X.C94442ah4;
import X.C94443ah5;
import X.C94444ah6;
import X.EnumC72807Shn;
import X.InterfaceC67352kd;
import X.InterfaceC88472Yns;
import X.S3I;
import X.S3L;
import X.W5F;
import X.W5U;
import X.X1D;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.Locale;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes34.dex */
public final class ImageLoader implements IImageLoader {
    public static final C93611aTf Companion = new C93611aTf();
    public boolean isInited;
    public Context mContext;

    @Override // com.ugc.effectcreator.foundation.image.IImageLoader
    public Bitmap resizeBitmapSync(Context context, Bitmap bitmap, int i, int i2) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(bitmap, "bitmap");
        return bitmap;
    }

    private final long calculateMaxSize(Context context) {
        Resources resources = context.getResources();
        o.LJIIIIZZ(resources, "context.resources");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
    }

    private final EnumC72807Shn convert(ImageView.ScaleType scaleType) {
        switch (C94018aaE.LIZ[scaleType.ordinal()]) {
            case 1:
                return EnumC72807Shn.FIT_XY;
            case 2:
                return EnumC72807Shn.FIT_CENTER;
            case 3:
                return EnumC72807Shn.CENTER_CROP;
            case 4:
                return EnumC72807Shn.CENTER_INSIDE;
            case 5:
                return EnumC72807Shn.CENTER;
            case 6:
                return EnumC72807Shn.FIT_END;
            case 7:
                return EnumC72807Shn.FIT_START;
            default:
                return EnumC72807Shn.FOCUS_CROP;
        }
    }

    @Override // com.ugc.effectcreator.foundation.image.IImageLoader
    public void init(Context context) {
        o.LJIIIZ(context, "context");
        if (this.isInited) {
            return;
        }
        this.mContext = C16880lQ.LLLLL(context);
        C81816W9c c81816W9c = new C81816W9c(context);
        c81816W9c.LJII = Bitmap.Config.ARGB_8888;
        File LLIIIL = C16880lQ.LLIIIL(context);
        o.LJIIIIZZ(LLIIIL, "context.cacheDir");
        c81816W9c.LIZJ = new File(LLIIIL.getAbsolutePath(), "image");
        c81816W9c.LJ = calculateMaxSize(context);
        c81816W9c.LJIIIIZZ = 1;
        c81816W9c.LJIILJJIL = true;
        c81816W9c.LJIILIIL = new C94153acP();
        c81816W9c.LJIILLIIL = true;
        c81816W9c.LJIILL = true;
        c81816W9c.LJIIZILJ = new String[0];
        c81816W9c.LJIIIZ = false;
        c81816W9c.LJIIJ = false;
        C81814W9a c81814W9a = new C81814W9a(c81816W9c);
        if (!W5U.LIZLLL) {
            W5U.LIZIZ = c81814W9a;
            W5U.LJ = c81814W9a.LJI().getPackageName();
            W5U.LIZ.init(c81814W9a);
            W5U.LIZLLL = true;
        }
        this.isInited = true;
    }

    @Override // com.ugc.effectcreator.foundation.image.IImageLoader
    public void loadBitmap(String path, C94020aaG option, InterfaceC88472Yns<? super Bitmap, C76800UCe> callback) {
        o.LJIIIZ(path, "path");
        o.LJIIIZ(option, "option");
        o.LJIIIZ(callback, "callback");
        W5U.LJI(new File(path)).LJIIIZ(new C94157acT(callback));
    }

    @Override // com.ugc.effectcreator.foundation.image.IImageLoader
    public void downloadImage(Context context, String url, C94020aaG option, InterfaceC88472Yns<? super Bitmap, C76800UCe> callback) {
        o.LJIIIZ(url, "url");
        o.LJIIIZ(option, "option");
        o.LJIIIZ(callback, "callback");
        W5F LJIIIIZZ = W5U.LJIIIIZZ(url);
        LJIIIIZZ.LJIJI = Bitmap.Config.ARGB_8888;
        LJIIIIZZ.LJIIIZ(new C94155acR(callback));
    }

    @Override // com.ugc.effectcreator.foundation.image.IImageLoader
    public void downloadImageFile(Context context, String url, C94020aaG option, InterfaceC88472Yns<? super String, C76800UCe> callback) {
        o.LJIIIZ(url, "url");
        o.LJIIIZ(option, "option");
        o.LJIIIZ(callback, "callback");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("start download url: ");
        LIZ.append(url);
        C94034aaU.LIZ("ImageLoader", X1D.LIZIZ(LIZ));
        W5F LJIIIIZZ = W5U.LJIIIIZZ(url);
        LJIIIIZZ.LIZIZ("EffectCreator");
        Bitmap.Config config = option.LIZJ;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        LJIIIIZZ.LJIJI = config;
        LJIIIIZZ.LJII(new C94442ah4(callback));
    }

    @Override // com.ugc.effectcreator.foundation.image.IImageLoader
    public void loadBitmap(Context context, String path, ImageView imageView, C94020aaG option) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(imageView, "imageView");
        o.LJIIIZ(option, "option");
        W5F LJIIIIZZ = W5U.LJIIIIZZ(path);
        LJIIIIZZ.LJJIIJZLJL = imageView;
        LJIIIIZZ.LIZLLL = option.LJI;
        Integer num = option.LIZLLL;
        if (num != null) {
            LJIIIIZZ.LJIIJJI = num.intValue();
        }
        float f = option.LJFF;
        S3I s3i = new S3I();
        s3i.LIZLLL = f;
        LJIIIIZZ.LJIJJLI = s3i.LIZ();
        ImageView.ScaleType scaleType = option.LJ;
        if (scaleType != null) {
            LJIIIIZZ.LJIJJ = convert(scaleType);
        }
        C16880lQ.LLJJJ(LJIIIIZZ);
    }

    @Override // com.ugc.effectcreator.foundation.image.IImageLoader
    public Object loadBitmapSync(Context context, String str, C94020aaG c94020aaG, InterfaceC67352kd<? super Bitmap> interfaceC67352kd) {
        int i;
        EnumC72807Shn enumC72807Shn;
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        Uri uri = UriProtector.parse(str);
        o.LJIIIIZZ(uri, "uri");
        if (!o.LJ(uri.getScheme(), "content")) {
            uri = Uri.fromFile(new File(str));
        }
        if (context == null) {
            context = this.mContext;
            o.LJI(context);
        }
        W5F LJFF = W5U.LJFF(uri);
        Integer num = c94020aaG.LIZ;
        int i2 = -1;
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        Integer num2 = c94020aaG.LIZIZ;
        if (num2 != null) {
            i2 = num2.intValue();
        }
        LJFF.LJII = i;
        LJFF.LJIIIIZZ = i2;
        ImageView.ScaleType scaleType = c94020aaG.LJ;
        if (scaleType == null || (enumC72807Shn = convert(scaleType)) == null) {
            enumC72807Shn = EnumC72807Shn.CENTER_CROP;
        }
        LJFF.LJIJJ = enumC72807Shn;
        Bitmap.Config config = c94020aaG.LIZJ;
        if (config == null) {
            config = Bitmap.Config.RGB_565;
        }
        LJFF.LJIJI = config;
        LJFF.LIZJ = context;
        LJFF.LJIIIZ(new C94443ah5(c84654XKg));
        return c84654XKg.LIZ();
    }

    @Override // com.ugc.effectcreator.foundation.image.IImageLoader
    public void loadFile(Context context, File file, ImageView imageView, C94020aaG option) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(file, "file");
        o.LJIIIZ(imageView, "imageView");
        o.LJIIIZ(option, "option");
        Object tag = imageView.getTag(R.id.nme);
        if (!(tag instanceof String)) {
            tag = null;
        }
        if (o.LJ(tag, file.getPath())) {
            return;
        }
        W5F LJI = W5U.LJI(file);
        LJI.LJJIIJZLJL = imageView;
        Integer num = option.LIZLLL;
        if (num != null) {
            LJI.LJIIJJI = num.intValue();
        }
        LJI.LJIIL = option.LJII;
        float f = option.LJFF;
        S3I s3i = new S3I();
        s3i.LIZLLL = f;
        LJI.LJIJJLI = s3i.LIZ();
        ImageView.ScaleType scaleType = option.LJ;
        if (scaleType != null) {
            LJI.LJIJJ = convert(scaleType);
        }
        LJI.LIZLLL(new C94444ah6(imageView, file));
    }

    @Override // com.ugc.effectcreator.foundation.image.IImageLoader
    public void loadGif(Context context, String path, ImageView imageView, C94020aaG option) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(imageView, "imageView");
        o.LJIIIZ(option, "option");
        W5F LJIIIIZZ = W5U.LJIIIIZZ(path);
        LJIIIIZZ.LIZLLL = true;
        Integer num = option.LIZLLL;
        if (num != null) {
            LJIIIIZZ.LJIIJJI = num.intValue();
        }
        ImageView.ScaleType scaleType = option.LJ;
        if (scaleType != null) {
            LJIIIIZZ.LJIJJ = convert(scaleType);
        }
        LJIIIIZZ.LJIJI = Bitmap.Config.ARGB_8888;
        LJIIIIZZ.LJJIIJZLJL = imageView;
        C16880lQ.LLJJJ(LJIIIIZZ);
    }

    @Override // com.ugc.effectcreator.foundation.image.IImageLoader
    public void loadImageBitmap(Context context, Bitmap bitmap, ImageView imageView, C94020aaG option) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(bitmap, "bitmap");
        o.LJIIIZ(imageView, "imageView");
        o.LJIIIZ(option, "option");
        imageView.setImageBitmap(bitmap);
    }

    @Override // com.ugc.effectcreator.foundation.image.IImageLoader
    public void compatLoadBitmap(Context context, String path, ImageView imageView, C94020aaG option, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        Uri parse;
        int i;
        int i2;
        int i3;
        String str;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(imageView, "imageView");
        o.LJIIIZ(option, "option");
        Object tag = imageView.getTag(R.id.nme);
        if (!(tag instanceof String)) {
            tag = null;
        }
        if (o.LJ(tag, path)) {
            return;
        }
        if (!s.LJJJLZIJ(path, "://", false)) {
            Locale locale = Locale.US;
            o.LJIIIIZZ(locale, "Locale.US");
            String lowerCase = path.toLowerCase(locale);
            o.LJIIIIZZ(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            if (ujb.o.LJJJJ(lowerCase, ".gif", false) && !option.LJI) {
                String LJLLJ = s.LJLLJ(path, "/");
                String str2 = C93965aZN.LIZ;
                if (str2 != null) {
                    str = C94023aaJ.LIZ(path, C93965aZN.LIZIZ(str2, LJLLJ), 0.0f, 0, 12);
                } else {
                    o.LJIJI("IMAGE_CACHE_PATH");
                    throw null;
                }
            } else {
                str = path;
            }
            parse = Uri.fromFile(new File(str));
            o.LJIIIIZZ(parse, "Uri.fromFile(File(newPath))");
        } else {
            parse = UriProtector.parse(path);
            o.LJIIIIZZ(parse, "Uri.parse(path)");
        }
        W5F LJFF = W5U.LJFF(parse);
        LJFF.LJJIIJZLJL = imageView;
        LJFF.LIZLLL = option.LJI;
        Integer num = option.LIZ;
        int i4 = -1;
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        Integer num2 = option.LIZIZ;
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = -1;
        }
        LJFF.LJIIIZ = i;
        LJFF.LJIIJ = i2;
        Integer num3 = option.LIZ;
        if (num3 != null) {
            i3 = num3.intValue();
        } else {
            i3 = -1;
        }
        Integer num4 = option.LIZIZ;
        if (num4 != null) {
            i4 = num4.intValue();
        }
        LJFF.LJII = i3;
        LJFF.LJIIIIZZ = i4;
        LJFF.LIZJ = context;
        Integer num5 = option.LIZLLL;
        if (num5 != null) {
            LJFF.LJIIJJI = num5.intValue();
        }
        LJFF.LJIIL = option.LJII;
        float f = option.LJFF;
        S3I s3i = new S3I();
        s3i.LIZLLL = f;
        LJFF.LJIJJLI = new S3L(s3i);
        ImageView.ScaleType scaleType = option.LJ;
        if (scaleType != null) {
            LJFF.LJIJJ = convert(scaleType);
        }
        LJFF.LIZLLL(new C94154acQ(imageView, path, interfaceC88472Yns));
    }

    @Override // com.ugc.effectcreator.foundation.image.IImageLoader
    public void loadBitmap(Context context, String path, ImageView imageView, C94020aaG option, InterfaceC88472Yns<? super Boolean, C76800UCe> resultListener) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(imageView, "imageView");
        o.LJIIIZ(option, "option");
        o.LJIIIZ(resultListener, "resultListener");
        Object tag = imageView.getTag(R.id.nme);
        if (!(tag instanceof String)) {
            tag = null;
        }
        if (o.LJ(tag, path)) {
            return;
        }
        W5F LJIIIIZZ = W5U.LJIIIIZZ(path);
        LJIIIIZZ.LJJIIJZLJL = imageView;
        Integer num = option.LIZLLL;
        if (num != null) {
            LJIIIIZZ.LJIIJJI = num.intValue();
        }
        float f = option.LJFF;
        S3I s3i = new S3I();
        s3i.LIZLLL = f;
        LJIIIIZZ.LJIJJLI = s3i.LIZ();
        ImageView.ScaleType scaleType = option.LJ;
        if (scaleType != null) {
            LJIIIIZZ.LJIJJ = convert(scaleType);
        }
        LJIIIIZZ.LIZLLL(new C94156acS(imageView, path, resultListener));
    }
}

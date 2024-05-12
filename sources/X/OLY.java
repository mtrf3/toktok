package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes11.dex */
public final class OLY implements InterfaceC61744OLc<Object, C62562cu> {
    public static final OLY LJ = new OLY();
    public Pattern LIZ;
    public String LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL = true;

    /* JADX WARN: Removed duplicated region for block: B:27:0x0046 A[Catch: all -> 0x0063, TryCatch #0 {all -> 0x0063, blocks: (B:7:0x0006, B:9:0x001a, B:12:0x0021, B:15:0x002a, B:16:0x002c, B:19:0x0033, B:22:0x003a, B:27:0x0046, B:29:0x004a, B:35:0x0057, B:40:0x0060), top: B:6:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0057 A[Catch: all -> 0x0063, TryCatch #0 {all -> 0x0063, blocks: (B:7:0x0006, B:9:0x001a, B:12:0x0021, B:15:0x002a, B:16:0x002c, B:19:0x0033, B:22:0x003a, B:27:0x0046, B:29:0x004a, B:35:0x0057, B:40:0x0060), top: B:6:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.regex.Pattern LIZJ() {
        /*
            r6 = this;
            java.util.regex.Pattern r0 = r6.LIZ
            if (r0 == 0) goto L5
            return r0
        L5:
            r5 = 0
            X.FFL r2 = X.FFL.LJIIIZ()     // Catch: java.lang.Throwable -> L63
            java.lang.String r1 = "image_crop_config_v3"
            java.lang.Class<com.ss.android.ugc.aweme.image.experiment.ImageCropConfig> r0 = com.ss.android.ugc.aweme.image.experiment.ImageCropConfig.class
            r2.getClass()     // Catch: java.lang.Throwable -> L63
            r4 = 1
            java.lang.Object r0 = X.FFL.LJIILLIIL(r0, r1, r4)     // Catch: java.lang.Throwable -> L63
            com.ss.android.ugc.aweme.image.experiment.ImageCropConfig r0 = (com.ss.android.ugc.aweme.image.experiment.ImageCropConfig) r0     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L1d
            int r3 = r0.tosImageShrinkType     // Catch: java.lang.Throwable -> L63
            goto L1e
        L1d:
            r3 = 0
        L1e:
            r2 = 0
            if (r0 == 0) goto L24
            java.lang.String r1 = r0.imageTosRegx     // Catch: java.lang.Throwable -> L63
            goto L25
        L24:
            r1 = r2
        L25:
            if (r0 == 0) goto L28
            goto L2a
        L28:
            r0 = r2
            goto L2c
        L2a:
            java.lang.String r0 = r0.tosImageFmt     // Catch: java.lang.Throwable -> L63
        L2c:
            r6.LIZIZ = r0     // Catch: java.lang.Throwable -> L63
            if (r3 == 0) goto L32
            r0 = 1
            goto L33
        L32:
            r0 = 0
        L33:
            r6.LIZLLL = r0     // Catch: java.lang.Throwable -> L63
            r0 = 2
            if (r3 != r0) goto L60
            if (r1 == 0) goto L43
            int r0 = r1.length()     // Catch: java.lang.Throwable -> L63
            if (r0 != 0) goto L41
            goto L43
        L41:
            r0 = 0
            goto L44
        L43:
            r0 = 1
        L44:
            if (r0 != 0) goto L60
            java.lang.String r0 = r6.LIZIZ     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L53
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L63
            if (r0 != 0) goto L51
            goto L53
        L51:
            r0 = 0
            goto L54
        L53:
            r0 = 1
        L54:
            if (r0 == 0) goto L57
            goto L60
        L57:
            r6.LIZJ = r4     // Catch: java.lang.Throwable -> L63
            java.util.regex.Pattern r0 = com.bytedance.mt.protector.impl.PatternProtector.compile(r1)     // Catch: java.lang.Throwable -> L63
            r6.LIZ = r0     // Catch: java.lang.Throwable -> L63
            goto L65
        L60:
            r6.LIZJ = r5     // Catch: java.lang.Throwable -> L63
            return r2
        L63:
            r6.LIZLLL = r5
        L65:
            java.util.regex.Pattern r0 = r6.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OLY.LIZJ():java.util.regex.Pattern");
    }

    public OLY() {
        LIZJ();
    }

    @Override // X.InterfaceC61744OLc
    public final C62562cu LIZ(Object obj, W5F builder) {
        Matcher matcher;
        String LIZIZ;
        o.LJIIIZ(builder, "builder");
        if (!(obj instanceof ImageUrlModel)) {
            return null;
        }
        int i = builder.LJIIIZ;
        int i2 = builder.LJIIJ;
        ImageUrlModel imageUrlModel = (ImageUrlModel) obj;
        o.LJIIIZ(imageUrlModel, "imageUrlModel");
        if (!this.LIZLLL) {
            return new C62562cu(imageUrlModel.mUrls);
        }
        if (i <= 0 || i2 <= 0) {
            return new C62562cu(imageUrlModel.mUrls);
        }
        if (!this.LIZJ) {
            LIZIZ(imageUrlModel, false, false);
            return new C62562cu(imageUrlModel.mUrls);
        }
        String imageUriKey = imageUrlModel.mUri;
        if (imageUriKey == null || imageUriKey.length() == 0) {
            return new C62562cu(imageUrlModel.mUrls);
        }
        o.LJIIIIZZ(imageUriKey, "imageUriKey");
        if (ujb.o.LJJJLIIL(imageUriKey, "large/", false)) {
            imageUriKey = ujb.o.LJJJJZI(imageUriKey, "large/", "", false);
        }
        List<String> imageUrls = imageUrlModel.mUrls;
        if (imageUrls == null || imageUrls.isEmpty()) {
            return new C62562cu(imageUrlModel.mUrls);
        }
        Pattern LIZJ = LIZJ();
        if (LIZJ == null || (matcher = LIZJ.matcher(imageUriKey)) == null || !matcher.matches()) {
            LIZIZ(imageUrlModel, true, true);
            return new C62562cu(imageUrlModel.mUrls);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        o.LJIIIIZZ(imageUrls, "imageUrls");
        Iterator<String> it = imageUrls.iterator();
        while (it.hasNext()) {
            try {
                android.net.Uri parse = UriProtector.parse(it.next());
                Locale locale = Locale.US;
                String str = this.LIZIZ;
                o.LJI(str);
                String LLLZI = C16880lQ.LLLZI(locale, str, Arrays.copyOf(new Object[]{parse.getScheme(), parse.getHost(), imageUriKey, Integer.valueOf(i), Integer.valueOf(i2)}, 5));
                o.LJIIIIZZ(LLLZI, "format(locale, format, *args)");
                if (s.LJJJLZIJ(LLLZI, "?", false)) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(LLLZI);
                    LIZ.append("&ilog=shrink");
                    LIZIZ = X1D.LIZIZ(LIZ);
                } else {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(LLLZI);
                    LIZ2.append("?ilog=shrink");
                    LIZIZ = X1D.LIZIZ(LIZ2);
                }
                if (LIZIZ != null) {
                    linkedHashSet.add(LIZIZ);
                }
            } catch (Exception unused) {
            }
        }
        if (!linkedHashSet.isEmpty()) {
            imageUrls.addAll(0, linkedHashSet);
        }
        return new C62562cu(imageUrlModel.mUrls);
    }

    public static void LIZIZ(ImageUrlModel imageUrlModel, boolean z, boolean z2) {
        String str;
        ArrayList arrayList;
        String LIZIZ;
        o.LJIIIZ(imageUrlModel, "imageUrlModel");
        if (z && z2) {
            str = "ilog=not_shrink_test";
        } else {
            str = "ilog=not_shrink";
        }
        List<String> list = imageUrlModel.mUrls;
        if (list != null) {
            arrayList = new ArrayList(C32I.LJJL(list, 10));
            for (String imageUrl : list) {
                o.LJIIIIZZ(imageUrl, "imageUrl");
                if (s.LJJJLZIJ(imageUrl, "?", false)) {
                    LIZIZ = C00F.LIZIZ(imageUrl, '&', str);
                } else {
                    LIZIZ = C00F.LIZIZ(imageUrl, '?', str);
                }
                arrayList.add(LIZIZ);
            }
        } else {
            arrayList = null;
        }
        imageUrlModel.mUrls = arrayList;
    }
}

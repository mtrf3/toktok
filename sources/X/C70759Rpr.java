package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Rpr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70759Rpr {
    public static final boolean LIZ = C52186Kdy.LIZ;
    public static final S3L LIZIZ;
    public static final S3L LIZJ;
    public static final S3L LIZLLL;
    public static final S3L LJ;

    static {
        Integer num;
        S3I s3i = new S3I();
        s3i.LIZIZ = KL2.LIZJ(FKM.LIZ(), 0.5f);
        s3i.LIZLLL = KL2.LIZJ(FKM.LIZ(), 2.0f);
        AwemeHostApplication LIZ2 = FKM.LIZ();
        Integer num2 = null;
        if (LIZ2 != null) {
            num = Integer.valueOf(AnonymousClass636.LJIIIIZZ(R.attr.dz, LIZ2));
        } else {
            num = null;
        }
        o.LJI(num);
        s3i.LIZJ = num.intValue();
        LIZIZ = new S3L(s3i);
        S3I s3i2 = new S3I();
        s3i2.LIZLLL = C45804HyK.LJJ(4);
        LIZJ = new S3L(s3i2);
        S3I s3i3 = new S3I();
        s3i3.LIZLLL = C45804HyK.LJJ(8);
        LIZLLL = new S3L(s3i3);
        S3I s3i4 = new S3I();
        s3i4.LIZIZ = KL2.LIZJ(FKM.LIZ(), 0.5f);
        float f = 36;
        s3i4.LIZLLL = C45804HyK.LJJ(f);
        AwemeHostApplication LIZ3 = FKM.LIZ();
        if (LIZ3 != null) {
            num2 = Integer.valueOf(AnonymousClass636.LJIIIIZZ(R.attr.dz, LIZ3));
        }
        o.LJI(num2);
        s3i4.LIZJ = num2.intValue();
        s3i4.LIZ();
        S3I s3i5 = new S3I();
        s3i5.LIZLLL = C45804HyK.LJJ(f);
        s3i5.LIZ();
        S3I s3i6 = new S3I();
        s3i6.LIZIZ = C45804HyK.LJJ(1);
        s3i6.LIZLLL = C45804HyK.LJJ(6);
        s3i6.LIZJ = AnonymousClass636.LJIIIIZZ(R.attr.dz, FKM.LIZ());
        LJ = new S3L(s3i6);
    }

    public static String LIZ(String str) {
        File LIZLLL2;
        String absolutePath;
        if (LIZ) {
            if (str != null) {
                str = N3O.LIZ.LIZ(str);
            } else {
                str = null;
            }
        }
        C72440Sbs.LIZ("getImageFilePath may cause ANR, use getImageFilePathAsync or call it in Non-UI Thread");
        if (TextUtils.isEmpty(str) || (LIZLLL2 = W5U.LIZJ().LIZLLL(UriProtector.parse(str))) == null) {
            absolutePath = "";
        } else {
            absolutePath = LIZLLL2.getAbsolutePath();
        }
        o.LJIIIIZZ(absolutePath, "getImageFilePath(\n      …    } else url,\n        )");
        return absolutePath;
    }

    public static boolean LIZIZ(android.net.Uri uri) {
        InterfaceC70869Rrd LIZJ2 = W5U.LIZJ();
        if (LIZJ2 != null) {
            if (LIZ) {
                uri = N3O.LIZ.LIZIZ(uri);
            }
            return LIZJ2.LIZ(uri);
        }
        return false;
    }

    public static boolean LIZJ(String str) {
        if (LIZ) {
            if (str != null) {
                str = N3O.LIZ.LIZ(str);
            } else {
                str = null;
            }
        }
        return C72440Sbs.LIZIZ(str);
    }

    public static W5F LIZLLL(Object obj) {
        android.net.Uri uri;
        String str;
        ArrayList arrayList;
        if (obj == null) {
            W5F LJIIIIZZ = W5U.LJIIIIZZ(" ");
            o.LJIIIIZZ(LJIIIIZZ, "load(FAKE_IMAGE_URL)");
            return LJIIIIZZ;
        }
        if (obj instanceof Image) {
            if (LIZ) {
                Image image = (Image) obj;
                List<String> urls = image.getUrls();
                if (urls != null) {
                    arrayList = new ArrayList(C32I.LJJL(urls, 10));
                    Iterator<String> it = urls.iterator();
                    while (it.hasNext()) {
                        arrayList.add(N3O.LIZ.LIZ(it.next()));
                    }
                } else {
                    arrayList = null;
                }
                image.setUrls(arrayList);
            }
            return W5U.LJIIIZ(((Image) obj).toImageUrlModel());
        }
        if (obj instanceof File) {
            W5F LJI = W5U.LJI((File) obj);
            o.LJIIIIZZ(LJI, "load(image)");
            return LJI;
        }
        if (obj instanceof String) {
            if (LIZ) {
                str = N3O.LIZ.LIZ((String) obj);
            } else {
                str = (String) obj;
            }
            W5F LJIIIIZZ2 = W5U.LJIIIIZZ(str);
            o.LJIIIIZZ(LJIIIIZZ2, "load(\n                if…else image,\n            )");
            return LJIIIIZZ2;
        }
        if (obj instanceof android.net.Uri) {
            if (LIZ) {
                uri = N3O.LIZ.LIZIZ((android.net.Uri) obj);
            } else {
                uri = (android.net.Uri) obj;
            }
            return W5U.LJFF(uri);
        }
        if (obj instanceof C62562cu) {
            if (LIZ) {
                C62562cu c62562cu = (C62562cu) obj;
                List<String> list = c62562cu.LIZ;
                ArrayList LIZIZ2 = s1.LIZIZ(list, "image.urls");
                Iterator it2 = ((ArrayList) list).iterator();
                while (it2.hasNext()) {
                    String it3 = (String) it2.next();
                    N3O n3o = N3O.LIZ;
                    o.LJIIIIZZ(it3, "it");
                    String LIZ2 = n3o.LIZ(it3);
                    if (LIZ2 != null) {
                        LIZIZ2.add(LIZ2);
                    }
                }
                c62562cu.LIZ = LIZIZ2;
            }
            return W5U.LJIIIZ((C62562cu) obj);
        }
        if (obj instanceof Integer) {
            return W5U.LJ(((Number) obj).intValue());
        }
        return W5U.LJII(obj);
    }

    public static W5F LJ(Image image) {
        List<String> thumbUrls;
        List<String> urls;
        if (image == null || (((thumbUrls = image.getThumbUrls()) == null || thumbUrls.isEmpty()) && ((urls = image.getUrls()) == null || urls.isEmpty()))) {
            return LIZLLL(" ");
        }
        return LIZLLL(image.toThumbFirstImageUrlModel());
    }
}

package X;

import android.util.Base64;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.BitRate;
import kotlin.jvm.internal.o;

/* renamed from: X.Iul, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48131Iul extends AbstractC65781Prl implements InterfaceC88472Yns<C48132Ium, BitRate> {
    public C48131Iul(double d) {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final BitRate invoke(C48132Ium c48132Ium) {
        String str;
        int i;
        String str2;
        int i2;
        int i3;
        C48132Ium c48132Ium2 = c48132Ium;
        if (c48132Ium2 == null || !o.LJ(c48132Ium2.type, "video/mp4") || c48132Ium2.width <= 0 || c48132Ium2.height <= 0 || (str = c48132Ium2.url) == null || str.length() == 0) {
            return null;
        }
        BitRate bitRate = new BitRate();
        bitRate.setBytevc1(0);
        int i4 = c48132Ium2.width;
        if (i4 >= 0) {
            if (i4 < 540) {
                bitRate.setGearName("noraml_480");
                bitRate.setQualityType(301);
                int i5 = c48132Ium2.bitRate;
                if (i5 > 0) {
                    i3 = i5 * 1024;
                } else {
                    i3 = 600000;
                }
                bitRate.setBitRate(i3);
                str2 = "480p";
            } else if (i4 < 720) {
                bitRate.setGearName("normal_540");
                bitRate.setQualityType(201);
                int i6 = c48132Ium2.bitRate;
                if (i6 > 0) {
                    i2 = i6 * 1024;
                } else {
                    i2 = 1350000;
                }
                bitRate.setBitRate(i2);
                str2 = "540p";
            }
            UrlModel urlModel = new UrlModel();
            urlModel.setWidth(c48132Ium2.width);
            urlModel.setHeight(c48132Ium2.height);
            String str3 = c48132Ium2.url;
            o.LJIIIIZZ(str3, "m.url");
            byte[] bytes = str3.getBytes(PVC.LIZ);
            o.LJIIIIZZ(bytes, "this as java.lang.String).getBytes(charset)");
            urlModel.setUri(Base64.encodeToString(bytes, 2));
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(urlModel.getUri());
            LIZ.append("_h264_");
            LIZ.append(str2);
            LIZ.append('_');
            LIZ.append(bitRate.getBitRate());
            urlModel.setUrlKey(X1D.LIZIZ(LIZ));
            urlModel.setUrlList(C47261Igj.LJJIJIL(c48132Ium2.url));
            bitRate.setPlayAddr(urlModel);
            return bitRate;
        }
        bitRate.setGearName("normal_720");
        bitRate.setQualityType(101);
        int i7 = c48132Ium2.bitRate;
        if (i7 > 0) {
            i = i7 * 1024;
        } else {
            i = 2000000;
        }
        bitRate.setBitRate(i);
        str2 = "720p";
        UrlModel urlModel2 = new UrlModel();
        urlModel2.setWidth(c48132Ium2.width);
        urlModel2.setHeight(c48132Ium2.height);
        String str32 = c48132Ium2.url;
        o.LJIIIIZZ(str32, "m.url");
        byte[] bytes2 = str32.getBytes(PVC.LIZ);
        o.LJIIIIZZ(bytes2, "this as java.lang.String).getBytes(charset)");
        urlModel2.setUri(Base64.encodeToString(bytes2, 2));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(urlModel2.getUri());
        LIZ2.append("_h264_");
        LIZ2.append(str2);
        LIZ2.append('_');
        LIZ2.append(bitRate.getBitRate());
        urlModel2.setUrlKey(X1D.LIZIZ(LIZ2));
        urlModel2.setUrlList(C47261Igj.LJJIJIL(c48132Ium2.url));
        bitRate.setPlayAddr(urlModel2);
        return bitRate;
    }
}

package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.qrcode.model.QRCodeInfo;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.Oap, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62183Oap implements InterfaceC62164OaW {
    public final /* synthetic */ C62180Oam LIZ;

    public C62183Oap(C62180Oam c62180Oam) {
        this.LIZ = c62180Oam;
    }

    @Override // X.InterfaceC62164OaW
    public final void LIZ(QRCodeInfo qRCodeInfo) {
        String str;
        List<String> urlList;
        if (qRCodeInfo != null) {
            C62180Oam c62180Oam = this.LIZ;
            c62180Oam.getClass();
            UrlModel urlModel = qRCodeInfo.qrcodeUrl;
            if (urlModel != null && (urlList = urlModel.getUrlList()) != null && (!urlList.isEmpty())) {
                Object obj = ListProtector.get(urlList, 0);
                o.LJIIIIZZ(obj, "it[0]");
                str = (String) obj;
            } else {
                str = "";
            }
            c62180Oam.LJLJI = str;
            if (L12.LIZIZ()) {
                long currentTimeMillis = System.currentTimeMillis();
                C62822Ol8 c62822Ol8 = C62184Oaq.LIZ;
                long j = ((Keva) c62822Ol8.getValue()).getLong("qrcode_cached_time", 0L);
                if (!((Keva) c62822Ol8.getValue()).contains("qrcode_cached_time") || j > currentTimeMillis || currentTimeMillis - j >= TimeUnit.DAYS.toMillis(30L)) {
                    C221018lt.LIZ("QRCodeSquareView", "Qr Code Cache is expired, evict lighten image cache");
                    W5U.LIZJ().LJI(UriProtector.parse(c62180Oam.LJLJI));
                    ((Keva) c62822Ol8.getValue()).storeLong("qrcode_cached_time", System.currentTimeMillis());
                }
                W5F LJFF = W5U.LJFF(UriProtector.parse(c62180Oam.LJLJI));
                LJFF.LIZJ = c62180Oam.getContext();
                LJFF.LJJIII = EnumC62195Ob1.CUSTOM;
                LJFF.LJJJ = "qrcode_cache_img";
                LJFF.LJIIIZ(new C62182Oao(c62180Oam, qRCodeInfo));
                return;
            }
            C78765Uvh.LJIILL(qRCodeInfo.qrcodeUrl, new C62181Oan(c62180Oam));
            return;
        }
        this.LIZ.getClass();
    }

    @Override // X.InterfaceC62164OaW
    public final void onFailure(Exception exc) {
        C1A7.LJIJJ(this.LIZ.getContext(), exc);
        this.LIZ.getClass();
    }
}

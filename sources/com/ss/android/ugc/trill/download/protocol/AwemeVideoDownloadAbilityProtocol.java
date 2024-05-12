package com.ss.android.ugc.trill.download.protocol;

import X.AbstractC44957Hkf;
import X.C41823GbD;
import X.C44956Hke;
import X.C78866UxK;
import X.C78983UzD;
import X.C78996UzQ;
import X.C79004UzY;
import X.InterfaceC87755YcJ;
import X.QZP;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.downloadv2.protocol.DefaultDownloadAbilityProtocol;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes8.dex */
public final class AwemeVideoDownloadAbilityProtocol extends DefaultDownloadAbilityProtocol {
    public final List<String> LJLJI;
    public final String LJLJJI;
    public final C78866UxK LJLJJL;

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadAbilityProtocol
    public final InterfaceC87755YcJ LIZLLL() {
        return this.LJLJJL;
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadAbilityProtocol
    public final String LJ() {
        return this.LJLJJI;
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadAbilityProtocol
    public final List<String> LJFF() {
        return this.LJLJI;
    }

    public AwemeVideoDownloadAbilityProtocol(AbstractC44957Hkf abstractC44957Hkf) {
        super(abstractC44957Hkf);
        Aweme aweme;
        String aid;
        String url;
        C44956Hke c44956Hke = (C44956Hke) abstractC44957Hkf;
        ArrayList arrayList = new ArrayList();
        UrlModel urlModel = c44956Hke.LJIILL.LIZ;
        if (urlModel != null && !C79004UzY.LJJIFFI(urlModel.getUrlList())) {
            int i = 0;
            do {
                Aweme aweme2 = c44956Hke.LJFF;
                if (aweme2 != null && aweme2.downloadWithoutWatermark && C78996UzQ.LJJIIZI(aweme2) && i == 0) {
                    String newUrl = (String) ListProtector.get(urlModel.getUrlList(), urlModel.getUrlList().size() - 1);
                    o.LJIIIIZZ(newUrl, "newUrl");
                    if (s.LJJJLZIJ(newUrl, "ratio", false)) {
                        url = QZP.LIZIZ("(ratio=[^&]*)", newUrl, "ratio=default");
                    } else {
                        Uri.Builder buildUpon = UriProtector.parse(newUrl).buildUpon();
                        buildUpon.appendQueryParameter("ratio", "default");
                        url = buildUpon.toString();
                    }
                } else {
                    url = (String) ListProtector.get(urlModel.getUrlList(), i % urlModel.getUrlList().size());
                }
                Aweme aweme3 = c44956Hke.LJFF;
                o.LJIIIIZZ(url, "url");
                String LJJ = C78983UzD.LJJ(url);
                o.LJIIIIZZ(LJJ, "genDownloadUrl(newUrl)");
                String LIZ = C41823GbD.LIZ(aweme3, LJJ);
                arrayList.add(LIZ != null ? LIZ : LJJ);
                i++;
            } while (i < 3);
        }
        this.LJLJI = arrayList;
        this.LJLJJI = (!(abstractC44957Hkf instanceof C44956Hke) || abstractC44957Hkf == null || (aweme = abstractC44957Hkf.LJFF) == null || (aid = aweme.getAid()) == null) ? "" : aid;
        this.LJLJJL = new C78866UxK();
    }
}

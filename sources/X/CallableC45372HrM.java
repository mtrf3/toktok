package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.share.ShareFlavorService;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.HrM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class CallableC45372HrM<V> implements Callable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ Long LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ Boolean LJLJJL;
    public final /* synthetic */ UrlModel LJLJJLL;
    public final /* synthetic */ boolean LJLJL;
    public final /* synthetic */ String LJLJLJ;
    public final /* synthetic */ Integer LJLJLLL;
    public final /* synthetic */ boolean LJLL;

    public CallableC45372HrM(long j, UrlModel urlModel, Boolean bool, Integer num, Long l, String str, String str2, String str3, boolean z, boolean z2) {
        this.LJLIL = str;
        this.LJLILLLLZI = l;
        this.LJLJI = j;
        this.LJLJJI = str2;
        this.LJLJJL = bool;
        this.LJLJJLL = urlModel;
        this.LJLJL = z;
        this.LJLJLJ = str3;
        this.LJLJLLL = num;
        this.LJLL = z2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Integer num;
        List<String> urlList;
        Integer num2;
        List<String> urlList2;
        String str = this.LJLIL;
        if (str != null) {
            C37247Ejb.LIZIZ.getClass();
            boolean equals = TextUtils.equals(C37246Eja.LJI(str), "20");
            C198517qh c198517qh = new C198517qh();
            Long l = this.LJLILLLLZI;
            long j = 0;
            if (l != null && l.longValue() != 0) {
                j = this.LJLJI / this.LJLILLLLZI.longValue();
            }
            c198517qh.LIZ.put("download_rate", Long.valueOf(j));
            c198517qh.LIZ.put("download_duration", this.LJLILLLLZI);
            c198517qh.LIZ.put("file_size", Long.valueOf(this.LJLJI));
            c198517qh.LIZ.put("errorDesc", "null");
            c198517qh.LIZ.put("errorCode", "null");
            c198517qh.LIZ.put("url", this.LJLJJI);
            Boolean bool = Boolean.FALSE;
            c198517qh.LIZ.put("needWaterMark", bool);
            c198517qh.LIZ.put("muteAudio", this.LJLJJL);
            c198517qh.LIZ.put("fileMagic", C37246Eja.LJI(this.LJLIL));
            c198517qh.LIZ.put("isMp4", Boolean.valueOf(equals));
            UrlModel urlModel = this.LJLJJLL;
            if (urlModel != null && (urlList2 = urlModel.getUrlList()) != null) {
                num2 = Integer.valueOf(urlList2.size());
            } else {
                num2 = null;
            }
            c198517qh.LIZ.put("urlNums", num2);
            c198517qh.LIZ.put("isPrivateAweme", Boolean.valueOf(this.LJLJL));
            if (!equals) {
                ShareFlavorService.LIZ.getClass();
                C2062987t.LIZ().LIZJ(this.LJLIL, this.LJLJI, c198517qh);
            }
            P8G LIZ = P8G.LIZ(EF7.LIZIZ());
            if (LIZ != null) {
                c198517qh.LIZ(Boolean.TRUE, "has_remove_sd");
                c198517qh.LIZ(Boolean.valueOf(LIZ.LIZJ()), "sd_state");
                c198517qh.LIZJ(Long.valueOf(LIZ.LIZIZ), "sd_available_size");
                c198517qh.LIZLLL("share_dir", C66580QBc.LJIILJJIL(EF7.LIZIZ()));
            } else {
                c198517qh.LIZ(bool, "has_remove_sd");
            }
            C09900aA.LJIIJJI("save_video_success_rate", 0, c198517qh.LJ());
            return null;
        }
        C198517qh c198517qh2 = new C198517qh();
        c198517qh2.LIZ.put("download_rate", 0);
        c198517qh2.LIZ.put("download_duration", this.LJLILLLLZI);
        c198517qh2.LIZ.put("file_size", -1);
        c198517qh2.LIZ.put("errorDesc", this.LJLJLJ);
        c198517qh2.LIZ.put("errorCode", this.LJLJLLL);
        c198517qh2.LIZ.put("url", this.LJLJJI);
        c198517qh2.LIZ.put("needWaterMark", Boolean.valueOf(this.LJLL));
        c198517qh2.LIZ.put("fileMagic", "download_error");
        c198517qh2.LIZ.put("muteAudio", this.LJLJJL);
        c198517qh2.LIZ.put("strategy_enabled", Boolean.valueOf(P8H.LJIIJJI()));
        c198517qh2.LIZ.put("isMp4", "notSure");
        UrlModel urlModel2 = this.LJLJJLL;
        if (urlModel2 != null && (urlList = urlModel2.getUrlList()) != null) {
            num = Integer.valueOf(urlList.size());
        } else {
            num = null;
        }
        c198517qh2.LIZ.put("urlNums", num);
        c198517qh2.LIZ.put("isPrivateAweme", Boolean.valueOf(this.LJLJL));
        P8G LIZ2 = P8G.LIZ(EF7.LIZIZ());
        if (LIZ2 != null) {
            c198517qh2.LIZ(Boolean.TRUE, "has_remove_sd");
            c198517qh2.LIZ(Boolean.valueOf(LIZ2.LIZJ()), "sd_state");
            c198517qh2.LIZJ(Long.valueOf(LIZ2.LIZIZ), "sd_available_size");
            c198517qh2.LIZLLL("share_dir", C66580QBc.LJIILJJIL(EF7.LIZIZ()));
        } else {
            c198517qh2.LIZ(Boolean.FALSE, "has_remove_sd");
        }
        C09900aA.LJIIJJI("save_video_success_rate", 1, c198517qh2.LJ());
        return null;
    }
}

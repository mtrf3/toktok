package X;

import android.text.TextUtils;
import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.share.downloadv2.event.newet.DownloadEndEvent;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: X.HrK, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class CallableC45370HrK<V> implements Callable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ C45356Hr6 LJLJJI;

    public CallableC45370HrK(String str, long j, long j2, C45356Hr6 c45356Hr6) {
        this.LJLIL = str;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
        this.LJLJJI = c45356Hr6;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        String str2 = this.LJLIL;
        if (str2 != null) {
            C37247Ejb.LIZIZ.getClass();
            str = C37246Eja.LJI(str2);
        } else {
            str = null;
        }
        long length = new File(this.LJLIL).length();
        V16.LJJLL(GScope.LJLIL, null, Long.valueOf(this.LJLILLLLZI), Long.valueOf(length), 1, 0, null, null, 97);
        V16.LJJLIIIIJ(DownloadEndEvent.class);
        boolean equals = TextUtils.equals(str, "20");
        C198517qh c198517qh = new C198517qh();
        long j = this.LJLJI;
        C45356Hr6 c45356Hr6 = this.LJLJJI;
        long j2 = 0;
        if (j != 0) {
            j2 = length / j;
        }
        c198517qh.LIZJ(Long.valueOf(j2), "Download_Rate");
        c198517qh.LIZJ(Long.valueOf(j), "Download_duration");
        c198517qh.LIZJ(Long.valueOf(length), "file_size");
        c198517qh.LIZLLL("errorDesc", "success");
        c198517qh.LIZIZ(-1, "errorCode");
        c198517qh.LIZLLL("url", c45356Hr6.LIZ);
        c198517qh.LIZ(Boolean.valueOf(equals), "isMp4");
        C09900aA.LJIIJJI("aweme_download_error_rate", 0, c198517qh.LJ());
        return null;
    }
}

package X;

import android.text.TextUtils;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: X.HrJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class CallableC45369HrJ<V> implements Callable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ C225308so LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ long LJLJJLL;

    public CallableC45369HrJ(String str, C225308so c225308so, long j, String str2, int i, long j2) {
        this.LJLIL = str;
        this.LJLILLLLZI = c225308so;
        this.LJLJI = j;
        this.LJLJJI = str2;
        this.LJLJJL = i;
        this.LJLJJLL = j2;
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
        this.LJLILLLLZI.LIZ(this.LJLJI, length, 0, "", false, this.LJLJJI, 1, this.LJLJJL);
        boolean equals = TextUtils.equals(str, "20");
        C198517qh c198517qh = new C198517qh();
        long j = this.LJLJJLL;
        long j2 = 0;
        if (j != 0) {
            j2 = length / j;
        }
        c198517qh.LIZ.put("Download_Rate", Long.valueOf(j2));
        c198517qh.LIZ.put("Download_duration", Long.valueOf(this.LJLJJLL));
        c198517qh.LIZ.put("file_size", Long.valueOf(length));
        c198517qh.LIZ.put("errorDesc", "success");
        c198517qh.LIZ.put("errorCode", -1);
        c198517qh.LIZ.put("url", this.LJLILLLLZI.LIZ);
        c198517qh.LIZ.put("isMp4", Boolean.valueOf(equals));
        C09900aA.LJIIJJI("aweme_download_error_rate", 0, c198517qh.LJ());
        return null;
    }
}

package X;

import android.text.TextUtils;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: X.HrL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class CallableC45371HrL<V> implements Callable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ Long LJLILLLLZI;
    public final /* synthetic */ Integer LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ boolean LJLJJL;

    public CallableC45371HrL(Integer num, Long l, String str, String str2, boolean z) {
        this.LJLIL = str;
        this.LJLILLLLZI = l;
        this.LJLJI = num;
        this.LJLJJI = str2;
        this.LJLJJL = z;
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
        boolean equals = TextUtils.equals(str, "20");
        C198517qh c198517qh = new C198517qh();
        Long l = this.LJLILLLLZI;
        long j = 0;
        if (l != null && l.longValue() != 0) {
            j = length / this.LJLILLLLZI.longValue();
        }
        c198517qh.LIZ.put("download_rate", Long.valueOf(j));
        c198517qh.LIZ.put("download_duration", this.LJLILLLLZI);
        c198517qh.LIZ.put("file_size", Long.valueOf(length));
        c198517qh.LIZ.put("errorDesc", "null");
        c198517qh.LIZ.put("errorCode", this.LJLJI);
        c198517qh.LIZ.put("url", this.LJLJJI);
        Boolean bool = Boolean.TRUE;
        c198517qh.LIZ.put("muteAudio", bool);
        c198517qh.LIZ.put("needWaterMark", Boolean.valueOf(this.LJLJJL));
        c198517qh.LIZ.put("fileMagic", str);
        c198517qh.LIZ.put("isMp4", Boolean.valueOf(equals));
        P8G LIZ = P8G.LIZ(EF7.LIZIZ());
        if (LIZ != null) {
            c198517qh.LIZ(bool, "has_remove_sd");
            c198517qh.LIZ(Boolean.valueOf(LIZ.LIZJ()), "sd_state");
            c198517qh.LIZJ(Long.valueOf(LIZ.LIZIZ), "sd_available_size");
            c198517qh.LIZLLL("share_dir", C66580QBc.LJIILJJIL(EF7.LIZIZ()));
        } else {
            c198517qh.LIZ(Boolean.FALSE, "has_remove_sd");
        }
        C09900aA.LJIIJJI("save_video_success_rate", 3, c198517qh.LJ());
        return null;
    }
}

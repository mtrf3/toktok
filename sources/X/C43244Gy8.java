package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.Gy8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43244Gy8 implements InterfaceC45358Hr8 {
    public final Aweme LIZ;
    public final String LIZIZ;
    public final Bundle LIZJ;
    public long LIZLLL;
    public final String LJ;
    public String LJFF;
    public final int LJI;
    public int LJII;

    @Override // X.InterfaceC45358Hr8
    public final void LIZIZ() {
        this.LIZLLL = System.currentTimeMillis();
        C188727au c188727au = new C188727au();
        c188727au.LJ(this.LIZLLL, "start_watermark");
        c188727au.LJIIIZ("watermark_id", this.LJ);
        c188727au.LIZLLL(this.LJII, "watermark_sdk");
        c188727au.LJIIIZ("watermark_type", this.LJFF);
        c188727au.LJIIIZ("group_id", this.LIZ.getAid());
        c188727au.LIZLLL(this.LIZ.getAwemeType(), "aweme_type");
        c188727au.LJIIIZ("download_method", this.LIZIZ);
        c188727au.LIZLLL(this.LJI, "is_self_video");
        c188727au.LJIIIZ("download_id", this.LIZJ.getString("download_id"));
        FMX.LJIIL("client_watermark_start", c188727au.LIZ);
    }

    @Override // X.InterfaceC45358Hr8
    public final void LIZ(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("download_method", this.LIZIZ);
        c188727au.LJ(currentTimeMillis, "end_watermark");
        c188727au.LJIIIZ("watermark_id", this.LJ);
        c188727au.LJ(currentTimeMillis - this.LIZLLL, "duration");
        c188727au.LIZLLL(this.LJII, "watermark_sdk");
        c188727au.LJIIIZ("watermark_type", this.LJFF);
        c188727au.LIZLLL(this.LJI, "is_self_video");
        c188727au.LIZLLL(i, "succeed");
        c188727au.LJIIIZ("group_id", this.LIZ.getAid());
        c188727au.LIZLLL(this.LIZ.getAwemeType(), "aweme_type");
        c188727au.LJIIIZ("download_id", this.LIZJ.getString("download_id"));
        FMX.LJIIL("client_watermark_end", c188727au.LIZ);
    }

    public C43244Gy8(Aweme aweme, String downloadMethod, Bundle downloadBundle, String str) {
        String LIZ;
        o.LJIIIZ(downloadMethod, "downloadMethod");
        o.LJIIIZ(downloadBundle, "downloadBundle");
        this.LIZ = aweme;
        this.LIZIZ = downloadMethod;
        this.LIZJ = downloadBundle;
        this.LJI = C62814Ol0.LJIL(aweme) ? 1 : 0;
        this.LJ = (str == null || (LIZ = C45348Hqy.LIZ(str)) == null) ? "" : LIZ;
    }
}

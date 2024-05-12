package X;

import java.util.HashMap;

/* renamed from: X.Oip, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62679Oip extends FRX {
    public final String[] LIZIZ = {"extra", "play_count", "share_count", "comment_count", "digg_count", "download_count", "photosensitiveMaskInfo", "reportMaskInfo", "generalMaskInfo", "createTime", "user_count", "view_count"};

    @Override // X.FRX, X.FGQ
    public final String[] LIZIZ() {
        return this.LIZIZ;
    }

    @Override // X.FRX, X.FGQ
    public final void LIZ(long j, String str) {
        HashMap LIZ = C1R5.LIZ(str, "key");
        C43881HKb.LIZJ(j, LIZ, str, WM7.SCENE_SERVICE, str);
        LIZ.put("duration", String.valueOf(j));
        FMX.LJIIL("metrics_watcher", LIZ);
    }
}

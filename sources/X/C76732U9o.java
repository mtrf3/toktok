package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;

/* renamed from: X.U9o, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76732U9o {
    public long LIZ;
    public long LIZIZ;
    public String LIZJ;
    public boolean LIZLLL;
    public long LJ = -1;

    public final RtcUserInfo LIZ() {
        long j = this.LIZ;
        long j2 = this.LIZIZ;
        String str = this.LIZJ;
        if (str == null) {
            str = "";
        }
        return new RtcUserInfo(j, j2, str, this.LIZLLL, this.LJ);
    }
}

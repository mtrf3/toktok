package X;

import Y.ARunnableS13S1200000_14;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;

/* renamed from: X.VAe, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79296VAe implements R2F {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ VAH LIZJ;

    public C79296VAe(VAH vah, String str, String str2) {
        this.LIZJ = vah;
        this.LIZ = str;
        this.LIZIZ = str2;
    }

    @Override // X.R2F
    public final void LIZ(String str, String str2, C48315Ixj c48315Ixj, boolean z) {
        String str3 = this.LIZ;
        if (str3 == null || str == null || !str3.equals(str)) {
            return;
        }
        VAH vah = this.LIZJ;
        VAD vad = vah.LJLJJLL;
        vad.z4 = vah.LJLLI;
        vad.LJJJ(!z, false);
        if (!z) {
            String LIZ = this.LIZJ.LIZ(str2, false);
            if (TextUtils.isEmpty(LIZ) || LIZ.equals(str2)) {
                LIZ = str2;
            }
            String str4 = this.LIZIZ;
            if (str2 == null || str2.length() == 0) {
                LIZ = LiveGiftNewGifterBadgeSetting.DEFAULT;
            } else {
                str4 = R2G.LIZLLL(this.LIZIZ, LIZ);
            }
            this.LIZJ.LJLJJLL.LJIJJ();
            VAH vah2 = this.LIZJ;
            VAD vad2 = vah2.LJLJJLL;
            vad2.LJLLL = LIZ;
            vad2.LJLLLL = false;
            vah2.LJLZ = LIZ;
            vah2.LIZJ(str4, this.LIZIZ, LIZ, this.LIZ);
            return;
        }
        this.LIZJ.LL.postAtFrontOfQueue(new ARunnableS13S1200000_14(this, c48315Ixj, str2, 1));
    }
}

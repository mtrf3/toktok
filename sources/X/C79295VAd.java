package X;

import Y.ARunnableS13S1200000_14;
import android.text.TextUtils;
import ccb.t;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;

/* renamed from: X.VAd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79295VAd implements R2F {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ t LIZJ;

    public C79295VAd(t tVar, String str, String str2) {
        this.LIZJ = tVar;
        this.LIZ = str;
        this.LIZIZ = str2;
    }

    @Override // X.R2F
    public final void LIZ(String str, String str2, C48315Ixj c48315Ixj, boolean z) {
        String str3 = this.LIZ;
        if (str3 == null || str == null || !str3.equals(str)) {
            return;
        }
        t tVar = this.LIZJ;
        VAD vad = tVar.LJLJJI;
        vad.z4 = tVar.y1;
        vad.LJJJ(!z, false);
        if (!z) {
            String p = this.LIZJ.p(this.LIZ, str2, false);
            if (TextUtils.isEmpty(p) || p.equals(str2)) {
                p = str2;
            }
            String str4 = this.LIZIZ;
            if (str2 == null || str2.length() == 0) {
                p = LiveGiftNewGifterBadgeSetting.DEFAULT;
            } else {
                str4 = R2G.LIZLLL(this.LIZIZ, p);
            }
            this.LIZJ.LJLJJI.LJIJJ();
            t tVar2 = this.LIZJ;
            VAD vad2 = tVar2.LJLJJI;
            vad2.LJLLL = p;
            vad2.LJLLLL = false;
            tVar2.LLLFF = p;
            tVar2.d1(str4, this.LIZIZ, p, this.LIZ);
            return;
        }
        this.LIZJ.LJLJI.postAtFrontOfQueue(new ARunnableS13S1200000_14(this, c48315Ixj, str2, 0));
    }
}

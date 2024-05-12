package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;

/* renamed from: X.VCt, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79363VCt {
    public String LIZ = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String LIZIZ = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String LIZJ = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public int LIZLLL = 300000;
    public String LJ = "";

    public final String LIZ() {
        String str = this.LIZJ;
        if (str != null && !TextUtils.isEmpty(str) && !this.LIZJ.equals(LiveGiftNewGifterBadgeSetting.DEFAULT)) {
            String[] split = this.LIZJ.split(",");
            if (split.length > 0) {
                return split[0];
            }
            return null;
        }
        return null;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("domain: ");
        LIZ.append(this.LIZ);
        LIZ.append(",network:");
        LIZ.append(this.LIZIZ);
        LIZ.append(",ips:");
        LIZ.append(this.LIZJ);
        LIZ.append(",ttl:");
        LIZ.append(this.LIZLLL);
        LIZ.append(",update_time:");
        LIZ.append(this.LJ);
        return X1D.LIZIZ(LIZ);
    }
}

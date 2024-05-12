package Y;

import X.C78983UzD;
import X.V3N;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.commerce.InteractiveBrandedEffectInfo;
import com.ss.android.ugc.aweme.commerce.tools.sticker.IBEContext;
import com.ss.android.ugc.aweme.commerce.tools.sticker.IBEStickerHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class ARunnableS2S1101000_7 implements Runnable {
    public final int $t;
    public int i2;
    public Object l1;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        String str;
        String str2;
        if (this.i2 == 41) {
            IBEStickerHandler iBEStickerHandler = (IBEStickerHandler) this.l1;
            String str3 = this.s0;
            iBEStickerHandler.getClass();
            if (str3 == null || str3.length() == 0) {
                return;
            }
            Effect effect = iBEStickerHandler.LJLJJI;
            InteractiveBrandedEffectInfo interactiveBrandedEffectInfo = null;
            if (effect != null) {
                str = effect.getExtra();
            } else {
                str = null;
            }
            String LJII = V3N.LJII(str, "ibe_info");
            if (LJII == null || LJII.length() == 0) {
                ShortVideoContext shortVideoContext = iBEStickerHandler.LJLILLLLZI;
                if (shortVideoContext == null) {
                    return;
                }
                shortVideoContext.creativeModel.commerceModel.getIbeContext().setMetadata(null);
                return;
            }
            InteractiveBrandedEffectInfo interactiveBrandedEffectInfo2 = (InteractiveBrandedEffectInfo) GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), LJII, InteractiveBrandedEffectInfo.class);
            ShortVideoContext shortVideoContext2 = iBEStickerHandler.LJLILLLLZI;
            if (shortVideoContext2 == null) {
                return;
            }
            IBEContext ibeContext = shortVideoContext2.creativeModel.commerceModel.getIbeContext();
            if (interactiveBrandedEffectInfo2 != null) {
                Effect effect2 = iBEStickerHandler.LJLJJI;
                if (effect2 != null) {
                    str2 = effect2.getEffectId();
                } else {
                    str2 = null;
                }
                interactiveBrandedEffectInfo2.setStickerId(str2);
                interactiveBrandedEffectInfo2.setPropData(new JSONObject(str3).optString("data", null));
                interactiveBrandedEffectInfo2.setBrandExtra(LJII);
                interactiveBrandedEffectInfo = interactiveBrandedEffectInfo2;
            } else {
                C78983UzD.LJIILJJIL();
            }
            ibeContext.setMetadata(interactiveBrandedEffectInfo);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$1() {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS2S1101000_7.LIZ$1():void");
    }

    public static final void run$0(ARunnableS2S1101000_7 aRunnableS2S1101000_7) {
        boolean LIZ;
        try {
            aRunnableS2S1101000_7.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS2S1101000_7 aRunnableS2S1101000_7) {
        boolean LIZ;
        try {
            aRunnableS2S1101000_7.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS2S1101000_7(int i, Object obj, String str, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l1 = obj;
        this.s0 = str;
    }
}

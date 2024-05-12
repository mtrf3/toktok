package Y;

import X.C26335AVf;
import X.EF7;
import X.J7H;
import X.J8U;
import X.MIP;
import X.X1D;
import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2;
import com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerAssem;
import com.ss.android.ugc.aweme.prop.model.StickerPropAwemeList;
import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public class ACallableS0S1101100_9 implements Callable {
    public final int $t;
    public int i2;
    public long j3;
    public Object l1;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS0S1101100_9 aCallableS0S1101100_9) {
        return I18nAbsProfileFragmentV2.Rl((I18nAbsProfileFragmentV2) aCallableS0S1101100_9.l1, aCallableS0S1101100_9.s0, aCallableS0S1101100_9.j3, aCallableS0S1101100_9.i2);
    }

    public static final Object call$1(ACallableS0S1101100_9 aCallableS0S1101100_9) {
        J8U j8u = new J8U();
        j8u.LIZLLL = aCallableS0S1101100_9.s0;
        j8u.LJJL = String.valueOf(aCallableS0S1101100_9.j3);
        j8u.LJIILL = ((AwemePagerAssem) aCallableS0S1101100_9.l1).p4(aCallableS0S1101100_9.i2);
        j8u.LJIILIIL();
        Context context = ((AwemePagerAssem) aCallableS0S1101100_9.l1).getContext();
        String p4 = ((AwemePagerAssem) aCallableS0S1101100_9.l1).p4(aCallableS0S1101100_9.i2);
        if (p4 == null) {
            p4 = "";
        }
        C26335AVf.LJJII(aCallableS0S1101100_9.i2, aCallableS0S1101100_9.j3, context, p4);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object call$2(ACallableS0S1101100_9 aCallableS0S1101100_9) {
        int i;
        String str;
        String str2;
        T t;
        MIP mip = (MIP) aCallableS0S1101100_9.l1;
        long j = aCallableS0S1101100_9.j3;
        String str3 = aCallableS0S1101100_9.s0;
        int i2 = aCallableS0S1101100_9.i2;
        if (j == 0) {
            mip.LJLJL = true;
        } else {
            mip.getClass();
        }
        if (EF7.LIZIZ().getResources().getDisplayMetrics().density > 320.0f) {
            i = 201;
        } else {
            i = 200;
        }
        int[] LIZ = J7H.LIZ(i);
        if (LIZ != null && LIZ.length >= 2) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LIZ[0]);
            LIZ2.append("_");
            LIZ2.append(LIZ[1]);
            str = X1D.LIZIZ(LIZ2);
        } else {
            str = null;
        }
        if (TextUtils.equals(mip.LJLILLLLZI, "from_sticker_master_profile")) {
            return mip.LJLJI.queryStickerAwemeList(str3, j, i2, 1, MIP.LJLJLJ, str).get();
        }
        int i3 = mip.LJLIL;
        if (i3 == 37) {
            return mip.LJLJI.queryInboxStickerAwemeList(str3, j, i2).get();
        }
        if (i3 == 41) {
            return mip.LJLJI.queryFeatureVideoAwemeList(str3).get();
        }
        if (i3 == 35 || i3 == 36) {
            if (j != 0 && (t = mip.mData) != 0 && !TextUtils.isEmpty(((StickerPropAwemeList) t).feedSessionId)) {
                str2 = ((StickerPropAwemeList) mip.mData).feedSessionId;
            } else {
                str2 = "";
            }
            if (mip.LJLIL == 35) {
                return mip.LJLJI.queryEffectDiscoverAwemeList(str3, j, i2, str2, MIP.LJLJLJ).get();
            }
            return mip.LJLJI.queryEffectDiscoverAwemeList("", j, i2, str2, MIP.LJLJLJ).get();
        }
        AVExternalServiceImpl.LIZ().provideAVPerformance().step("tool_performance_effect_shoot_same", "Grid Videos API Trigger");
        return mip.LJLJI.queryStickerAwemeList(str3, j, i2, MIP.LJLJLJ, str).get();
    }

    public ACallableS0S1101100_9(Object obj, String str, long j, int i, int i2) {
        this.$t = i2;
        this.l1 = obj;
        this.s0 = str;
        this.j3 = j;
        this.i2 = i;
    }
}

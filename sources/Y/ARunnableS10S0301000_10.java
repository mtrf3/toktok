package Y;

import X.C59316NPs;
import X.C61276O3c;
import X.C61548ODo;
import X.C61555ODv;
import X.O76;
import X.O7D;
import X.O8Z;
import X.OC6;
import X.ODN;
import X.ORZ;
import X.X1D;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import defpackage.b0;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS192S0100000_10;

/* loaded from: classes11.dex */
public class ARunnableS10S0301000_10 implements Runnable {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$1() {
        try {
            C61276O3c c61276O3c = ((C61555ODv) this.l2).LIZ;
            Map map = (Map) this.l0;
            OptionCheckUpdateParams optionCheckUpdateParams = (OptionCheckUpdateParams) this.l1;
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            ODN.LIZIZ(optionCheckUpdateParams, concurrentHashMap, map);
            C61548ODo LJIIJJI = ODN.LJIIJJI(c61276O3c, concurrentHashMap, optionCheckUpdateParams, null);
            LJIIJJI.LIZLLL(4, "req_type");
            LJIIJJI.LIZLLL(Integer.valueOf(this.i3), "sync_task_id");
        } catch (Exception e) {
            OC6.LIZ("gecko-debug-tag", "sync gecko checkUpdate exception", e);
        }
    }

    public final void LIZ$0() {
        List list;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cpv_");
        String LIZJ = b0.LIZJ(LIZ, this.i3, 's', LIZ);
        List list2 = (List) this.l0;
        if (list2 != null) {
            list = ORZ.LLJI(ORZ.LJLL(list2));
        } else {
            list = null;
        }
        Long creativeId = ((AwemeRawAd) this.l1).getCreativeId();
        String logExtra = ((AwemeRawAd) this.l1).getLogExtra();
        new AqS192S0100000_10((C59316NPs) this.l2, 26);
        O8Z.LIZIZ(LIZJ, list, creativeId, logExtra, null);
    }

    public static final void run$0(ARunnableS10S0301000_10 aRunnableS10S0301000_10) {
        boolean LIZ;
        try {
            aRunnableS10S0301000_10.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS10S0301000_10 aRunnableS10S0301000_10) {
        O7D o7d = (O7D) aRunnableS10S0301000_10.l0;
        long[] jArr = (long[]) aRunnableS10S0301000_10.l1;
        long[][] jArr2 = (long[][]) aRunnableS10S0301000_10.l2;
        int i = aRunnableS10S0301000_10.i3;
        o7d.getClass();
        try {
            O7D.LIZJ(O76.LJI().LJIIIIZZ(), jArr, jArr2, false, i);
            O7D.LIZJ(O76.LJI().LIZJ.LIZLLL("splash_ad_first_show_data"), jArr, jArr2, true, i);
        } catch (Throwable unused) {
        }
    }

    public static final void run$2(ARunnableS10S0301000_10 aRunnableS10S0301000_10) {
        boolean LIZ;
        try {
            aRunnableS10S0301000_10.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS10S0301000_10(O7D o7d, long[] jArr, long[][] jArr2, int i) {
        this.$t = i;
        this.l0 = o7d;
        this.l1 = jArr;
        this.l2 = jArr2;
        this.i3 = 10016;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS10S0301000_10(int i, int i2, List<String> list, AwemeRawAd awemeRawAd, C59316NPs c59316NPs) {
        this.$t = c59316NPs;
        this.i3 = i;
        this.l0 = i2;
        this.l1 = list;
        this.l2 = awemeRawAd;
    }
}
